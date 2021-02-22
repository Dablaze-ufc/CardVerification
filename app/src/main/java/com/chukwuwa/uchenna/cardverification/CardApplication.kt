package com.chukwuwa.uchenna.cardverification

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CardApplication : Application(){
    override fun onCreate() {
        super.onCreate()
    }
}