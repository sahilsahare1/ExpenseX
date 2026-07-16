package com.sahil.expensex.presentation.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sahil.expensex.presentation.auth.components.LoginHeader
import com.sahil.expensex.presentation.auth.components.buttons.ExpenseXButton
import com.sahil.expensex.presentation.auth.components.textfields.ExpenseXTextField
import com.sahil.expensex.presentation.auth.components.textfields.PasswordTextField

@Composable
fun LoginScreen() {

    var email by remember() { mutableStateOf("") }
    var password by remember() {mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp)

    ) {

        LoginHeader()

        Spacer(modifier = Modifier.height(32.dp))

        ExpenseXTextField(email,{email=it},"Email Address")
        PasswordTextField(password, onValueChange = {password=it},"Password")

        Spacer(modifier = Modifier.height(16.dp))

        ExpenseXButton("Log in", onClick = {})



    }

}