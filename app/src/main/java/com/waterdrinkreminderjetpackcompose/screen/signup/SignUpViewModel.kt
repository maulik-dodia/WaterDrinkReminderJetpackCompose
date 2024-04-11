package com.waterdrinkreminderjetpackcompose.screen.signup

import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class SignUpViewModel @Inject constructor(private val firestore: FirebaseFirestore) : ViewModel() {

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

    fun createData() {

        val user = hashMapOf(
            "first" to "Ada",
            "last" to "Lovelace",
            "born" to 1815
        )

        firestore.collection("Maulik")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("mk", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("mk", "Error adding document", e)
            }
    }
}