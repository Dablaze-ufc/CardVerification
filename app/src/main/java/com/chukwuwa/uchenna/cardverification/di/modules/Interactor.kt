package com.chukwuwa.uchenna.cardverification.di.modules

import com.chukwuwa.uchenna.cardverification.core.data.interactor.CardInteractor
import com.chukwuwa.uchenna.cardverification.core.data.repository.CardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class Interactor {

    @Provides
    @Singleton
    fun providesInteractor(source: CardRepository): CardInteractor{
        return CardInteractor(source)
    }
}