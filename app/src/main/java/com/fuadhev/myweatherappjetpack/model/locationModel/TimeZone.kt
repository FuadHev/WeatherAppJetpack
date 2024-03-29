package com.fuadhev.myweatherappjetpack.model.locationModel


import com.google.gson.annotations.SerializedName

data class TimeZone(
    @SerializedName("Code")
    val code: String,
    @SerializedName("GmtOffset")
    val gmtOffset: Double,
    @SerializedName("IsDaylightSaving")
    val isDaylightSaving: Boolean,
    @SerializedName("Name")
    val name: String,
    @SerializedName("NextOffsetChange")
    val nextOffsetChange: Any
)