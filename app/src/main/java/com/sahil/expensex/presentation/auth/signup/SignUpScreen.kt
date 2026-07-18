package com.sahil.expensex.presentation.auth.signup

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
import com.sahil.expensex.presentation.auth.components.BottomSignUp
import com.sahil.expensex.presentation.auth.components.LoginHeader
import com.sahil.expensex.presentation.auth.components.buttons.ExpenseXButton
import com.sahil.expensex.presentation.auth.components.textfields.EmailTextField

import com.sahil.expensex.presentation.auth.components.textfields.FullNameTextField
import com.sahil.expensex.presentation.auth.components.textfields.PasswordTextField
import com.sahil.expensex.presentation.components.common.ExpenseXLogo

@Preview(showSystemUi = true)
@Composable
fun SignUpScreen(){

    var fullname by remember() { mutableStateOf("") }
    var email by remember() { mutableStateOf("") }
    var password by remember() { mutableStateOf("") }
    var confpassword by remember() { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp)
    ) {

        Spacer(modifier = Modifier.height(24.dp))
        LoginHeader("Create Account", "Lets get started with ExpenseX")
        Spacer(modifier = Modifier.height(24.dp))

        FullNameTextField(value = fullname, onValueChange = { fullname = it }, label = "Full Name")
        EmailTextField(value = email, onValueChange = { email = it }, label = "Email")
        PasswordTextField(value = password, onValueChange = { password = it }, label = "Password")
        PasswordTextField(value = confpassword, onValueChange = { confpassword = it }, label = "Confirm Password")

        Spacer(modifier = Modifier.height(24.dp))

        ExpenseXButton("Sign Up", onClick = {})

        BottomSignUp("Already have an Account?","Log In",{})

    }



}