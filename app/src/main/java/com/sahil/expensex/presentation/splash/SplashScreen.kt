package com.sahil.expensex.presentation.splash

import android.window.SplashScreen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay

private const val SPLASH_DELAY=2000L

@Composable
fun SplashScreen(onNavigateToLogin:()-> Unit){
    LaunchedEffect(Unit) {
        delay(SPLASH_DELAY)
        onNavigateToLogin()

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
            ) {
        Text(
            text="ExpenseX",
            style = MaterialTheme.typography.headlineLarge

        )
    }
}