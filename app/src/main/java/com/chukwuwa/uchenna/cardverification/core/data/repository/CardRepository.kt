package com.chukwuwa.uchenna.cardverification.core.data.repository

import com.chukwuwa.uchenna.cardverification.app.retrofit.CardServicesClient
import com.chukwuwa.uchenna.cardverification.core.data.datasource.CardDataSource
import javax.inject.Inject

class CardRepository @Inject constructor(val client: CardServicesClient): CardDataSource {
}