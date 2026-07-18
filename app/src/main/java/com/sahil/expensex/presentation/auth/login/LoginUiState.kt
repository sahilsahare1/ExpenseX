package com.sahil.expensex.presentation.auth.login

data class LoginUiState(
    val email: String ="",
    val password: String="",
    val isLoggedIn: Boolean=false,
    val error: String?=null,
    val isLoading: Boolean=false
)