package net.azarquiel.forecastapp.model

import java.io.Serializable

data class Location(
    var name: String,
    var country: String
) : Serializable

data class Current(
    var city_name: String,
    var temperature: Double,
    var description: String,
    var weather_icons: String,
    var precip: Double
) : Serializable

data class Respuesta(
    val current: Current,
    val location: Location
)