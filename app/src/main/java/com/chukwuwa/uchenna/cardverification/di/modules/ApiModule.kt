package com.chukwuwa.uchenna.cardverification.di.modules

import com.chukwuwa.uchenna.cardverification.app.retrofit.CardServicesClient
import com.chukwuwa.uchenna.cardverification.app.retrofit.RetrofitService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
open class ApiModule {

    @Singleton
    @Provides
    open fun provideCardClient():CardServicesClient {
        return RetrofitService.invoke()
    }
}