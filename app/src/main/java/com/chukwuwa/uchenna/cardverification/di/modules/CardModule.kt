package com.chukwuwa.uchenna.cardverification.di.modules

import com.chukwuwa.uchenna.cardverification.app.retrofit.CardServicesClient
import com.chukwuwa.uchenna.cardverification.core.data.datasource.CardDataSource
import com.chukwuwa.uchenna.cardverification.core.data.repository.CardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class CardModule {
    @Singleton
    @Provides
    fun providesCardDataSource(client: CardServicesClient): CardDataSource{
        return CardRepository(client)


        
    }
}