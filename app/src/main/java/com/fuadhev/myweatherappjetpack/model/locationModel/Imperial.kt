package com.fuadhev.myweatherappjetpack.model.locationModel


import com.google.gson.annotations.SerializedName

data class Imperial(
    @SerializedName("Unit")
    val unit: String,
    @SerializedName("UnitType")
    val unitType: Int,
    @SerializedName("Value")
    val value: Int
)