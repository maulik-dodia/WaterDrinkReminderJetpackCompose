package com.waterdrinkreminderjetpackcompose.di

import com.waterdrinkreminderjetpackcompose.WaterDrinkReminderApp
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(app: WaterDrinkReminderApp)
}