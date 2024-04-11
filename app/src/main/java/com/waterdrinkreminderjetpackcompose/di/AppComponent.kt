package com.waterdrinkreminderjetpackcompose.di

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun getFirestore()
}