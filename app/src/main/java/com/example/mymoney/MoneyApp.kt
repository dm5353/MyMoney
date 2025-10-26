package com.example.mymoney

import android.app.Application
import com.example.mymoney.data.MoneyRepository

class MoneyАрр: Application() {
    override fun onCreate() {
        super.onCreate()
        MoneyRepository.initialize(this)
    }
}