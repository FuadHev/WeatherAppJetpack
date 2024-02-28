package com.fuadhev.myweatherappjetpack.network

import com.fuadhev.myweatherappjetpack.model.dailyModel.DailyForecastResponse
import com.fuadhev.myweatherappjetpack.model.hourlyForecast.HourlyForecastResponse
import com.fuadhev.myweatherappjetpack.model.locationModel.LocationResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val APIKEY = "EhaWPY37Nsid9uiXpV8WkBNI47Jp5znp"

interface Api {

    @GET("locations/v1/cities/search")
    suspend fun searchLoaction(
        @Query("apiKey") apiKey: String = APIKEY,
        @Query("q") query: String
    ): Response<LocationResponse>


    @GET("forecasts/v1/daily/5day/{location_key}")
    suspend fun getDailyForecast(
        @Path("location_key") locationKey: String,
        @Query("apiKey") apiKey: String = APIKEY,
        @Query("metric") metric: Boolean = true
    ): Response<DailyForecastResponse>


    @GET("forecasts/v1/hourly/12hour/{location-key}")
    suspend fun getHourlyForecast(
        @Path("location_key") locationKey: String,
        @Query("apiKey") apiKey: String = APIKEY,
        @Query("metric") metric: Boolean = true
    ):Response<HourlyForecastResponse>

}