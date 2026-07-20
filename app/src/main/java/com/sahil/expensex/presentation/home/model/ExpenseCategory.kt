package com.sahil.expensex.presentation.home.model



import androidx.compose.ui.graphics.Color

data class ExpenseCategory(
    val name: String,
    val percentage: Float,
    val color: Color
)