package net.azarquiel.forecastapp.api

import net.azarquiel.forecastapp.api.WebAccess
import net.azarquiel.forecastapp.model.Current

class MainRepository() {

    val service = WebAccess.weatherService

    suspend fun getData(): List<Current> {
        val webResponse = service.getData().await()
        if (webResponse.isSuccessful) {
            return webResponse.body()!!.results
        }
        return emptyList()
    }
}