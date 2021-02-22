package com.chukwuwa.uchenna.cardverification.app.ui.card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chukwuwa.uchenna.cardverification.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}