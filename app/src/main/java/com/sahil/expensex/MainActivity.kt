package com.sahil.expensex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.sahil.expensex.navigation.AppNavGraph

import com.sahil.expensex.ui.theme.ExpensexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpensexTheme {
                AppNavGraph()
            }
        }
    }
}

