package com.waterdrinkreminderjetpackcompose.screen.signin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class SignInViewModel : ViewModel() {

    private val _msfEmail = MutableStateFlow(true)
    val msfEmail = _msfEmail

    private val _msfPassword = MutableStateFlow(true)
    val msfPassword = _msfPassword

    fun isValidateSuccessful(email: String, password: String) {
        if (email.isEmpty()) {
            _msfEmail.value = false
        } else if (password.isEmpty()) {
            _msfEmail.value = true
            _msfPassword.value = false
        } else {
            _msfEmail.value = true
            _msfPassword.value = true
        }
    }
}