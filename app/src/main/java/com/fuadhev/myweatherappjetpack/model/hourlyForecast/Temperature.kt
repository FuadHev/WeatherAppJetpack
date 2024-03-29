package com.fuadhev.myweatherappjetpack.model.hourlyForecast


import com.google.gson.annotations.SerializedName

data class Temperature(
    @SerializedName("Unit")
    val unit: String,
    @SerializedName("UnitType")
    val unitType: Int,
    @SerializedName("Value")
    val value: Double
)