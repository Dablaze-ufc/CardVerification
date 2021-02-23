package com.chukwuwa.uchenna.cardverification.core.data.datasource

import com.chukwuwa.uchenna.cardverification.app.retrofit.ResponseHelper
import com.chukwuwa.uchenna.cardverification.core.domain.carddomain.CardDataRespone
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CardDataSource {
    suspend fun getCardInfo(number: String): ResponseHelper<CardDataRespone>
}