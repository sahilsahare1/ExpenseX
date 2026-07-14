package com.sahil.expensex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.sahil.expensex.presentation.auth.LoginScreen
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
           SplashScreen()
       }

       composable(AppDestinations.HOME){
           HomeScreen()
       }

       composable(AppDestinations.LOGIN){
           LoginScreen()
       }

   }
}



