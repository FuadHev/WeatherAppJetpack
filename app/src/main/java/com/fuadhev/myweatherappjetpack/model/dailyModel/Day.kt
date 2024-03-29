package com.fuadhev.myweatherappjetpack.model.dailyModel


import com.google.gson.annotations.SerializedName

data class Day(
    @SerializedName("HasPrecipitation")
    val hasPrecipitation: Boolean,
    @SerializedName("Icon")
    val icon: Int,
    @SerializedName("IconPhrase")
    val iconPhrase: String
)