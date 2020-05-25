package net.azarquiel.forecastapp.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebAccess {

    val weatherService: WeatherService by lazy {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl("http://api.weatherstack.com/current?access_key=74f8f978686adb47b6f2767b91a8de54&query=New%20York")
            .build()

        return@lazy retrofit.create(WeatherService::class.java)
    }
}