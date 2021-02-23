  package com.chukwuwa.uchenna.cardverification.core.data.repository

import com.chukwuwa.uchenna.cardverification.app.retrofit.CardServicesClient
import com.chukwuwa.uchenna.cardverification.app.retrofit.ResponseHelper
import com.chukwuwa.uchenna.cardverification.app.retrofit.safeApiCall
import com.chukwuwa.uchenna.cardverification.core.data.datasource.CardDataSource
import com.chukwuwa.uchenna.cardverification.core.domain.carddomain.CardDataRespone
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CardRepository @Inject constructor(private val client: CardServicesClient) : CardDataSource {
    override suspend fun getCardInfo(number: String): ResponseHelper<CardDataRespone> {
        return safeApiCall(Dispatchers.IO) {
            client.getCardData(number)
        }
    }
}