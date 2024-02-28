package com.fuadhev.myweatherappjetpack.repository

import com.fuadhev.myweatherappjetpack.model.BaseModel
import com.fuadhev.myweatherappjetpack.model.dailyModel.DailyForecastResponse
import com.fuadhev.myweatherappjetpack.model.hourlyForecast.HourlyForecastResponse
import com.fuadhev.myweatherappjetpack.model.locationModel.LocationResponse
import com.fuadhev.myweatherappjetpack.network.Api
import retrofit2.Response

class WeatherRepoImpl (private val api:Api):WeatherRepo {
    override suspend fun searchLocation(query: String): BaseModel<LocationResponse> {
        return request {
            api.searchLoaction(query=query)
        }
    }

    override suspend fun getDailyForecasts(locationKey: String): BaseModel<DailyForecastResponse> {
        return request {
            api.getDailyForecast(locationKey=locationKey)
        }
    }

    override suspend fun getHourlyForecasts(locationKey: String): BaseModel<HourlyForecastResponse> {
        return request {
            api.getHourlyForecast(locationKey=locationKey)
        }
    }
}
suspend fun <T> request(request:suspend()-> Response<T>):BaseModel<T>{
    try {
        request().also {
            return if (it.isSuccessful){
                BaseModel.Success(it.body()!!)
            }else{
                BaseModel.Error(it.errorBody()?.string().toString())
            }
        }
    }catch (e:Exception){
        return BaseModel.Error(e.message.toString())
    }
}