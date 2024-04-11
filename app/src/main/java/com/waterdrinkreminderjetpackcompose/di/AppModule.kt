package com.waterdrinkreminderjetpackcompose.di

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideFirestore() = Firebase.firestore
}