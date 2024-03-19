package com.fuadhev.myweatherappjetpack

sealed class Screen (val route:String) {
    object HomeScreen : Screen("home")
    object WeatherScreen : Screen("weather")
}