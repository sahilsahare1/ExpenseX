package com.sahil.expensex.presentation.auth.login


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


import androidx.compose.ui.unit.dp

import com.google.firebase.auth.FirebaseAuth
import com.sahil.expensex.R
import com.sahil.expensex.data.repository.FirebaseAuthRepository
import com.sahil.expensex.navigation.AppDestinations

import com.sahil.expensex.presentation.auth.components.BottomSignUp
import com.sahil.expensex.presentation.auth.components.textfields.ForgetPasswordText
import com.sahil.expensex.presentation.auth.components.LoginHeader
import com.sahil.expensex.presentation.auth.components.buttons.ExpenseXButton
import com.sahil.expensex.presentation.auth.components.buttons.SocialLoginButton
import com.sahil.expensex.presentation.auth.components.textfields.EmailTextField

import com.sahil.expensex.presentation.auth.components.textfields.PasswordTextField
import com.sahil.expensex.presentation.auth.viewmodel.LoginViewModel
import com.sahil.expensex.presentation.components.common.DividerWithText
import com.sahil.expensex.presentation.components.common.ExpenseXLogo

@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    onSignUpClick: () -> Unit
) {

    val repository = remember { FirebaseAuthRepository(FirebaseAuth.getInstance()) }
    val viewmodel = remember { LoginViewModel(repository) }

    val uiState by viewmodel.uiState.collectAsState()

//    var email by remember() { mutableStateOf("") }
//    var password by remember() {mutableStateOf("")}

    LaunchedEffect(uiState.isLoggedIn) {
        if (uiState.isLoggedIn) {
            onLoginSuccess()
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp)

    ) {


        ExpenseXLogo()

        Spacer(modifier = Modifier.height(24.dp))

        LoginHeader("Welcome Back","Login to continue tracking to your expenses")

        Spacer(modifier = Modifier.height(32.dp))

        EmailTextField(uiState.email,viewmodel::onEmailChange,"Email Address")
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(uiState.password, onValueChange = viewmodel::onPasswordChange,"Password")
        Spacer(modifier = Modifier.height(12.dp))
        ForgetPasswordText()

        Spacer(modifier = Modifier.height(24.dp))

        ExpenseXButton("Log In", onClick = {viewmodel.login()})

        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if(uiState.isLoading){
                CircularProgressIndicator()
            }

            uiState.error?.let { message ->
                Text(
                    text=message,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        DividerWithText()

        Spacer(modifier = Modifier.height(24.dp))

        SocialLoginButton("Google",R.drawable.google, onClick ={} )
        Spacer(modifier = Modifier.height(16.dp))
        SocialLoginButton("Apple",R.drawable.apple, onClick ={} )

        Spacer(modifier = Modifier.height(10.dp))

        BottomSignUp("Don't have an account? ","Sign Up", onSignUpClick)

    }

}