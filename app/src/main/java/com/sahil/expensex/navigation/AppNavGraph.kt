package com.sahil.expensex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.sahil.expensex.presentation.auth.login.LoginScreen
import com.sahil.expensex.presentation.auth.signup.SignUpScreen
import com.sahil.expensex.presentation.home.HomeScreen
import com.sahil.expensex.presentation.splash.SplashScreen



@Composable
fun AppNavGraph(){
    val navController = rememberNavController()

   NavHost(
       navController=navController,
       startDestination = AppDestinations.SPLASH
   ) {
       composable(AppDestinations.SPLASH){
           SplashScreen(
               onNavigateToLogin = {
                   navController.navigate(AppDestinations.SIGNUP) {
                       popUpTo(AppDestinations.SPLASH) {
                           inclusive = true
                       }
                   }

               }
           )
       }

       composable(AppDestinations.SIGNUP){
           SignUpScreen(
               onSignUpSuccess = {
                   navController.navigate(AppDestinations.HOME){
                       popUpTo(AppDestinations.SIGNUP){
                           inclusive=true
                       }
                   }
               },
               onLoginClick = {
                   navController.navigate(AppDestinations.LOGIN)
               }
           )
       }

       composable(AppDestinations.HOME){
           HomeScreen()
       }

       composable(AppDestinations.LOGIN){
           LoginScreen(
               onLoginSuccess = {
                   navController.navigate(AppDestinations.HOME){
                       popUpTo(AppDestinations.LOGIN){
                           inclusive=true
                       }
                   }
               },
               onSignUpClick = {
                   navController.navigate(AppDestinations.SIGNUP)
               }
           )
       }

   }
}





