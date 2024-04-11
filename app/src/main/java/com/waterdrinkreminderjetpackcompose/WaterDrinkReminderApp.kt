package com.waterdrinkreminderjetpackcompose

import android.app.Application
import com.waterdrinkreminderjetpackcompose.di.AppComponent
import com.waterdrinkreminderjetpackcompose.di.AppModule
import com.waterdrinkreminderjetpackcompose.di.DaggerAppComponent

class WaterDrinkReminderApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
        appComponent.inject(this)
    }
}