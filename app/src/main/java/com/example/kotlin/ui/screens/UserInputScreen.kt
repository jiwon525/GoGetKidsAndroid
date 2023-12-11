package com.example.kotlin.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserInputScreen(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .height(88.dp),
            text = Routes.USER_INPUT_SCREEN
        )
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen()
}