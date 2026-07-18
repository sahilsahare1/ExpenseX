package com.sahil.expensex.presentation.auth.signup

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

import androidx.compose.runtime.remember

import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import com.google.firebase.auth.FirebaseAuth
import com.sahil.expensex.data.repository.FirebaseAuthRepository

import com.sahil.expensex.presentation.auth.components.BottomSignUp
import com.sahil.expensex.presentation.auth.components.LoginHeader
import com.sahil.expensex.presentation.auth.components.buttons.ExpenseXButton
import com.sahil.expensex.presentation.auth.components.textfields.EmailTextField

import com.sahil.expensex.presentation.auth.components.textfields.FullNameTextField
import com.sahil.expensex.presentation.auth.components.textfields.PasswordTextField
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

import com.sahil.expensex.presentation.auth.viewmodel.SignUpViewModel



@Composable
fun SignUpScreen(
    onSignUpSuccess:() -> Unit,
    onLoginClick: () -> Unit
){

    val repository = remember { FirebaseAuthRepository(FirebaseAuth.getInstance()) }
    val viewmodel = remember { SignUpViewModel(repository) }

    val uiState by viewmodel.uistate.collectAsState()

    LaunchedEffect(uiState.isSignUp) {
        if(uiState.isSignUp){
            onSignUpSuccess()
        }
    }

//    var fullname by remember() { mutableStateOf("") }
//    var email by remember() { mutableStateOf("") }
//    var password by remember() { mutableStateOf("") }
//    var confpassword by remember() { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp)
    ) {

        Spacer(modifier = Modifier.height(24.dp))
        LoginHeader("Create Account", "Lets get started with ExpenseX")
        Spacer(modifier = Modifier.height(24.dp))

        FullNameTextField(value = uiState.fullName , onValueChange = viewmodel::onNameChange , label = "Full Name")
        EmailTextField(value = uiState.email, onValueChange =viewmodel::onEmailChange, label = "Email")
        PasswordTextField(value = uiState.password, onValueChange = viewmodel::onPasswordChange, label = "Password")
        PasswordTextField(value = uiState.confirmPassword, onValueChange = viewmodel::onConfirmPasswordChange, label = "Confirm Password")

        Spacer(modifier = Modifier.height(16.dp))

        if (uiState.error != null) {
            Text(
                text = uiState.error ?: "",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            ExpenseXButton(
                text = if (uiState.isLoading) "" else "Sign Up",
                onClick = {
                    Log.d("BUTTON", "Button Clicked")
                    viewmodel.signup()
                    Log.d("BUTTON", "signup() function called")
                }
            )

            if (uiState.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(24.dp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }

        BottomSignUp("Already have an Account?","Log In", onLoginClick)

    }



}