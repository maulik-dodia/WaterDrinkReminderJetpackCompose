package com.waterdrinkreminderjetpackcompose.di

import android.content.Context
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.waterdrinkreminderjetpackcompose.common.ViewModelProviderFactory
import com.waterdrinkreminderjetpackcompose.screen.signup.SignUpViewModel
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    fun provideFirestore() = Firebase.firestore

    @Provides
    fun provideSignUpViewModel(
        activityContext: Context,
        firestore: FirebaseFirestore
    ): SignUpViewModel {
        val viewModel =
            ViewModelProvider(activityContext as ComponentActivity, ViewModelProviderFactory(SignUpViewModel::class) {
                SignUpViewModel(firestore)
            })[SignUpViewModel::class.java]
        return viewModel
    }
}