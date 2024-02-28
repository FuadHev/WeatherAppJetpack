package com.fuadhev.myweatherappjetpack.model.locationModel


import com.google.gson.annotations.SerializedName

data class Elevation(
    @SerializedName("Imperial")
    val imperial: Imperial,
    @SerializedName("Metric")
    val metric: Metric
)