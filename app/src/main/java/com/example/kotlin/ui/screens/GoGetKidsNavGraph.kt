package com.example.kotlin.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun GoGetKidsNavGraph(){
    val navController = rememberNavController()

    NavHost(navController=navController, startDestination = Routes.USER_INPUT_SCREEN){
        composable(Routes.USER_INPUT_SCREEN){
            UserInputScreen(navController)
        }
        composable(Routes.HOME_SCREEN){
            HomeScreen()
        }
    }
}