package com.sahil.expensex.presentation.auth.components



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BottomSignUp(
    onSignUpClick: () -> Unit
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text="Don't have an account? ")

        TextButton(
            onClick = onSignUpClick
        ) {
            Text(text="Sign Up")
        }

    }

}