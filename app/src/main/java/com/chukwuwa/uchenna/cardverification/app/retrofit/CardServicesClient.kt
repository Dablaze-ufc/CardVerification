package com.chukwuwa.uchenna.cardverification.app.retrofit

import com.chukwuwa.uchenna.cardverification.core.domain.carddomain.CardDataRespone
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CardServicesClient {
    @GET("/{number}")
    suspend fun getCardData(@Path("number") number: String): Response<CardDataRespone>

}