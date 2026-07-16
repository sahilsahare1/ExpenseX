package com.sahil.expensex.presentation.auth.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun LoginHeader(){

    Column() {
        Text(
            text="Welcome Back ",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            style= MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(top=72.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Login to tracking your expenses",
            fontSize = 16.sp,
            color = Color.Gray,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}