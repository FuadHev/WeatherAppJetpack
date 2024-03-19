package com.fuadhev.myweatherappjetpack.model.hourlyForecast


import com.google.gson.annotations.SerializedName

data class HourlyForecastResponseItem(
    @SerializedName("DateTime")
    val dateTime: String,
    @SerializedName("EpochDateTime")
    val epochDateTime: Long,
    @SerializedName("HasPrecipitation")
    val hasPrecipitation: Boolean,
    @SerializedName("IconPhrase")
    val iconPhrase: String,
    @SerializedName("IsDaylight")
    val isDaylight: Boolean,
    @SerializedName("Link")
    val link: String,
    @SerializedName("MobileLink")
    val mobileLink: String,
    @SerializedName("PrecipitationProbability")
    val precipitationProbability: Int,
    @SerializedName("Temperature")
    val temperature: Temperature,
    @SerializedName("WeatherIcon")
    val weatherIcon: Int
)