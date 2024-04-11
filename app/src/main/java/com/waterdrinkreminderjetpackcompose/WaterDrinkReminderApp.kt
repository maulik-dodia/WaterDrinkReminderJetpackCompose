package com.waterdrinkreminderjetpackcompose

import android.app.Application
import com.waterdrinkreminderjetpackcompose.di.AppComponent

class WaterDrinkReminderApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        //appComponent = Dagg
    }
}