package com.fuadhev.myweatherappjetpack.model.dailyModel


import com.google.gson.annotations.SerializedName

data class DailyForecastResponse(
    @SerializedName("DailyForecasts")
    val dailyForecasts: List<DailyForecast>,
    @SerializedName("Headline")
    val headline: Headline
)