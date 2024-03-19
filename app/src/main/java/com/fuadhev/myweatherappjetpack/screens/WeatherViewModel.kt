package com.fuadhev.myweatherappjetpack.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fuadhev.myweatherappjetpack.model.BaseModel
import com.fuadhev.myweatherappjetpack.model.dailyModel.DailyForecastResponse
import com.fuadhev.myweatherappjetpack.model.hourlyForecast.HourlyForecastResponse
import com.fuadhev.myweatherappjetpack.repository.WeatherRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WeatherViewModel : ViewModel(), KoinComponent {
    private val repo: WeatherRepo by inject()

    private val _hourlyForecast: MutableStateFlow<BaseModel<HourlyForecastResponse>?> =
        MutableStateFlow(null)
    val hourlyForecast = _hourlyForecast.asStateFlow()

    private val _dailyForecast: MutableStateFlow<BaseModel<DailyForecastResponse>?> =
        MutableStateFlow(null)
    val dailyForecast = _dailyForecast.asStateFlow()

    fun getHourlyForecast(locationKey: String) {
        viewModelScope.launch {
            repo.getHourlyForecasts(locationKey).also { data ->
                _hourlyForecast.update { data }
                Log.e("TAG", " fuad remote ${data.toString()}", )
            }
        }
    }
    fun getDailyForecast(locationKey: String) {
        viewModelScope.launch {
            repo.getDailyForecasts(locationKey).also { data ->
                _dailyForecast.update { data }
            }
        }
    }

}