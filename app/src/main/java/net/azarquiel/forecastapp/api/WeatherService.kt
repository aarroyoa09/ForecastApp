package net.azarquiel.forecastapp.api

import kotlinx.coroutines.Deferred
import net.azarquiel.forecastapp.model.*
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    
    @GET("location/{name}")
    fun getData(@Path("name") name:String): Deferred<Response<Respuesta>>

//    @GET("day")
//    fun getDataDays(): Deferred<Response<Respuesta>>
}