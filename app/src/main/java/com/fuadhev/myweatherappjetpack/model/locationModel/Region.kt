package com.fuadhev.myweatherappjetpack.model.locationModel


import com.google.gson.annotations.SerializedName

data class Region(
    @SerializedName("EnglishName")
    val englishName: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("LocalizedName")
    val localizedName: String
)