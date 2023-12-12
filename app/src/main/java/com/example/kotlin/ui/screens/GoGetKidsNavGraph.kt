package com.example.kotlin.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlin.ui.UserInputViewModel

@Composable
fun GoGetKidsNavGraph(userInputViewModel: UserInputViewModel=viewModel()){
    val navController = rememberNavController()

    NavHost(navController=navController, startDestination = Routes.USER_INPUT_SCREEN){
        composable(Routes.USER_INPUT_SCREEN){
            UserInputScreen(userInputViewModel)
        }
        composable(Routes.HOME_SCREEN){
            HomeScreen()
        }
    }
}