package com.sahil.expensex.presentation.auth.signup

data class SignUpUiState (

    val fullName:String="",
    val email: String="",
    val password: String="",
    val confirmPassword: String="",
    val isLoading: Boolean=false,
    val error: String?=null,
    val isSignUp: Boolean=false


)