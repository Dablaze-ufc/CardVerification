package com.chukwuwa.uchenna.cardverification.core.data.interactor

import com.chukwuwa.uchenna.cardverification.core.data.repository.CardRepository
import javax.inject.Inject

class CardInteractor @Inject constructor(private val source: CardRepository) {
    suspend fun getCardData(number:String) = source.getCardInfo(number)
}