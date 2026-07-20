package com.sahil.expensex.presentation.home.model

data class Transaction(
    val title: String,
    val category: String,
    val amount: Float,
    val time: String,
    val icon: Int
)
