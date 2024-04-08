package com.waterdrinkreminderjetpackcompose.screen.signup

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class SignUpViewModel : ViewModel() {

    private val _msfName = MutableStateFlow(true)
    val msfName = _msfName

    private val _msfEmail = MutableStateFlow(true)
    val msfEmail = _msfEmail

    private val _msfPassword = MutableStateFlow(true)
    val msfPassword = _msfPassword

    fun isValidateSuccessful(name: String, email: String, password: String) {
        if (name.isEmpty()) {
            _msfName.value = false
        } else if (email.isEmpty()) {
            _msfName.value = true
            _msfEmail.value = false
        } else if (password.isEmpty()) {
            _msfName.value = true
            _msfEmail.value = true
            _msfPassword.value = false
        } else {
            _msfName.value = true
            _msfEmail.value = true
            _msfPassword.value = true
        }
    }
}