package com.example.kotlin.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.kotlin.ui.LoginTopBar
import com.example.kotlin.ui.RoleCard
import com.example.kotlin.ui.TextFieldComponent
import com.example.kotlin.ui.TopBar
import com.example.kotlin.ui.UserDataUiEvents
import com.example.kotlin.ui.UserInputViewModel
import com.example.kotlin.ui.buttonExample

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel, navController: NavHostController){
    Surface(
        modifier = Modifier
            .width(1080.dp)
            .height(1920.dp)
            .clickable {
                navController.navigate(Routes.HOME_SCREEN)
            }
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            LoginTopBar()
            Text(
                text="Login",
                fontSize = 15.sp,
                modifier = Modifier.padding(5.dp))
            Spacer(modifier = Modifier.size(10.dp))
            TextFieldComponent("Enter your username")
            Spacer(modifier = Modifier.size(10.dp))
            TextFieldComponent("Enter your password")
            Row {
                RoleCard("Teacher")
                RoleCard("Parent")
            }
            Row(horizontalArrangement = Arrangement.Center) {
                buttonExample(rememberNavController(), "Login")
            }
            /*TextFieldComponent("Enter your username", {name, pw, roleValue, button ->
                userInputViewModel.onEvent(
                    UserDataUiEvents.ButtonClicked(name, pw, roleValue, button=true)
                )
            })*/
        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen(userInputViewModel = UserInputViewModel(), rememberNavController())
}