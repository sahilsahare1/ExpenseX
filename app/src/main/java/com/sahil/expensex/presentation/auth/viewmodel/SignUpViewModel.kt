package com.sahil.expensex.presentation.auth.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sahil.expensex.domain.repository.AuthRepository
import com.sahil.expensex.presentation.auth.signup.SignUpUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SignUpViewModel(
    private val repository: AuthRepository
): ViewModel(){

    private val _uistate = MutableStateFlow(SignUpUiState())
    val uistate: StateFlow<SignUpUiState> = _uistate

    fun onNameChange(fullname: String){
        _uistate.value=_uistate.value.copy(fullName = fullname )
    }
    fun onEmailChange(email: String){
        _uistate.value =_uistate.value.copy(email=email)
    }

    fun onPasswordChange(password: String){
        _uistate.value =_uistate.value.copy(password=password)
    }

    fun onConfirmPasswordChange(confirmpassword: String){
        _uistate.value = _uistate.value.copy(confirmPassword=confirmpassword)
    }



    fun signup(){
        Log.d("BUTTON", "Button Clicked")

        _uistate.value = _uistate.value.copy(error = null)

        if(_uistate.value.password!=_uistate.value.confirmPassword){
            _uistate.value=_uistate.value.copy(error = "Password is not matching")
            return
        }

        if(_uistate.value.password.length<5){
            _uistate.value=_uistate.value.copy(error = "Password must contain more than 5 characters")
            return
        }

        if(_uistate.value.fullName.isBlank()){
            _uistate.value=_uistate.value.copy(error = "Please Enter Full Name")
            return
        }


        viewModelScope.launch {
            _uistate.value = _uistate.value.copy(isLoading = true, error = null)

            val result = repository.signUp(_uistate.value.fullName,_uistate.value.email,_uistate.value.password)

            if(result.isSuccess){
                Log.d("SIGNUP", "Signup Success")
                _uistate.value=_uistate.value.copy(isSignUp = true, isLoading = false)
            }
            else{
                Log.e("SIGNUP", result.exceptionOrNull()?.message ?: "Unknown Error")

                _uistate.value=_uistate.value.copy(isLoading = false,error = result.exceptionOrNull()?.message )
            }
        }

    }

}