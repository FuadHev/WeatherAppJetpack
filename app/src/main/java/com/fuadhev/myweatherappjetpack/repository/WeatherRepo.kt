package com.fuadhev.myweatherappjetpack.repository

import com.fuadhev.myweatherappjetpack.model.BaseModel
import com.fuadhev.myweatherappjetpack.model.dailyModel.DailyForecastResponse
import com.fuadhev.myweatherappjetpack.model.hourlyForecast.HourlyForecastResponse
import com.fuadhev.myweatherappjetpack.model.locationModel.LocationResponse

interface WeatherRepo {
    suspend fun searchLocation(query: String):BaseModel<LocationResponse>
    suspend fun getDailyForecasts(locationKey:String):BaseModel<DailyForecastResponse>
    suspend fun getHourlyForecasts(locationKey:String):BaseModel<HourlyForecastResponse>
}