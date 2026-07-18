package com.sahil.expensex.presentation.auth.components



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier



@Composable
fun BottomSignUp(
    text: String,
    subtext: String,
    onSignUpClick: () -> Unit
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text=text)

        TextButton(
            onClick = onSignUpClick
        ) {
            Text(text=subtext)
        }

    }

}