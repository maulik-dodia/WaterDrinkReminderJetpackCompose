package com.waterdrinkreminderjetpackcompose.screen.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.waterdrinkreminderjetpackcompose.R

@Composable
fun SignInScreen(
    signInViewModel: SignInViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth(),
            text = stringResource(id = R.string.str_login_account),
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start
        )

        // Email field
        val emailValidation by signInViewModel.msfEmail.collectAsStateWithLifecycle()
        var emailState by remember {
            mutableStateOf("")
        }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.label_email)
                )
            },
            isError = !emailValidation,
            supportingText = {
                if (!emailValidation) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(id = R.string.str_email_validate_error)
                    )
                }
            },
            trailingIcon = {
                if (!emailValidation) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = stringResource(id = R.string.str_email_error),
                        tint = MaterialTheme.colorScheme.error
                    )
                }
            },
            value = emailState,
            onValueChange = {
                emailState = it
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(
                onNext = {

                }
            )
        )

        // Password field
        val passwordValidation by signInViewModel.msfPassword.collectAsStateWithLifecycle()
        var passwordState by remember {
            mutableStateOf("")
        }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.label_password)
                )
            },
            isError = !passwordValidation,
            supportingText = {
                if (!passwordValidation) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(id = R.string.str_password_validate_error)
                    )
                }
            },
            trailingIcon = {
                if (!passwordValidation) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = stringResource(id = R.string.str_email_error),
                        tint = MaterialTheme.colorScheme.error
                    )
                }
            },
            value = passwordState,
            onValueChange = {
                passwordState = it
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next, keyboardType = KeyboardType.Password),
            keyboardActions = KeyboardActions(
                onNext = {

                }
            )
        )

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                signInViewModel.isValidateSuccessful(emailState, passwordState)
            }) {
            Text(
                text = stringResource(id = R.string.label_sign_in)
            )
        }
    }
}