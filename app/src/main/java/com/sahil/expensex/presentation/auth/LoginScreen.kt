package com.sahil.expensex.presentation.auth


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahil.expensex.R
import com.sahil.expensex.presentation.auth.components.BottomSignUp
import com.sahil.expensex.presentation.auth.components.ForgetPasswordText
import com.sahil.expensex.presentation.auth.components.LoginHeader
import com.sahil.expensex.presentation.auth.components.buttons.ExpenseXButton
import com.sahil.expensex.presentation.auth.components.buttons.SocialLoginButton
import com.sahil.expensex.presentation.auth.components.textfields.ExpenseXTextField
import com.sahil.expensex.presentation.auth.components.textfields.PasswordTextField
import com.sahil.expensex.presentation.components.common.DividerWithText
import com.sahil.expensex.presentation.components.common.ExpenseXLogo
@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {

    var email by remember() { mutableStateOf("") }
    var password by remember() {mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp)

    ) {


        ExpenseXLogo()

        Spacer(modifier = Modifier.height(24.dp))

        LoginHeader()

        Spacer(modifier = Modifier.height(32.dp))

        ExpenseXTextField(email,{email=it},"Email Address")
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(password, onValueChange = {password=it},"Password")
        Spacer(modifier = Modifier.height(12.dp))
        ForgetPasswordText()

        Spacer(modifier = Modifier.height(24.dp))

        ExpenseXButton("Log In", onClick = {})

        Spacer(modifier = Modifier.height(32.dp))

        DividerWithText()

        Spacer(modifier = Modifier.height(24.dp))

        SocialLoginButton("Google",R.drawable.google, onClick ={} )
        Spacer(modifier = Modifier.height(16.dp))
        SocialLoginButton("Apple",R.drawable.apple, onClick ={} )

        Spacer(modifier = Modifier.height(32.dp))

        BottomSignUp({})

    }

}