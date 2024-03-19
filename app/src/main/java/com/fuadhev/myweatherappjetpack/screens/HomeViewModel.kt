package com.fuadhev.myweatherappjetpack.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fuadhev.myweatherappjetpack.model.BaseModel
import com.fuadhev.myweatherappjetpack.model.locationModel.LocationResponse
import com.fuadhev.myweatherappjetpack.repository.WeatherRepo
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeViewModel:ViewModel(),KoinComponent {
    val repo:WeatherRepo by inject()

    private val _locations:MutableStateFlow<BaseModel<LocationResponse>?> = MutableStateFlow(null)
    val locations = _locations.asStateFlow()

    fun searchLocation(query:String){
        viewModelScope.launch(IO) {
            _locations.update { BaseModel.Loading }
            repo.searchLocation(query).also { data->
                _locations.update { data }
                Log.e("data", "searchLocation: ${data}", )
            }

        }
    }
}