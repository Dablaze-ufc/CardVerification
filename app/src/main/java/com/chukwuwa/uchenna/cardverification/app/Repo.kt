package com.chukwuwa.uchenna.cardverification.app

import com.chukwuwa.uchenna.cardverification.core.data.interactor.CardInteractor
import javax.inject.Inject

class Repo @Inject constructor(private val cardInteractor: CardInteractor) {
    suspend fun getCardDate(number: String) = cardInteractor.getCardData(number)
}