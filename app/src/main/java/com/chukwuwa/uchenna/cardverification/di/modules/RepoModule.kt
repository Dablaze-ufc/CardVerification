package com.chukwuwa.uchenna.cardverification.di.modules

import com.chukwuwa.uchenna.cardverification.app.Repo
import com.chukwuwa.uchenna.cardverification.core.data.interactor.CardInteractor
import com.chukwuwa.uchenna.cardverification.core.data.repository.CardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@InstallIn(ViewModelComponent::class)
@Module
object RepoModule {

    @ViewModelScoped
    @Provides
    fun providesRepo(cardInteractor: CardInteractor): Repo{
        return Repo(cardInteractor)
    }


}