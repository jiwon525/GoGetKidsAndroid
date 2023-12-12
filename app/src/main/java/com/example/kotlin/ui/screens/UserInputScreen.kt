package com.example.kotlin.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.kotlin.ui.LoginTopBar
import com.example.kotlin.ui.TopBar
import com.example.kotlin.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel){
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            LoginTopBar()
            Spacer(modifier = Modifier.size(60.dp))
        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen(userInputViewModel = UserInputViewModel())
}