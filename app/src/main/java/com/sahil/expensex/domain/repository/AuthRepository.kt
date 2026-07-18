package com.sahil.expensex.domain.repository

interface AuthRepository {
    suspend fun login(email: String,password: String): Result<Unit>

    suspend fun signUp(email: String,password: String): Result<Unit>

    suspend fun resetPassword(email: String): Result<Unit>

    fun logout()
}