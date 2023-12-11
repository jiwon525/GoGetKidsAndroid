package com.example.kotlin

import android.content.Context
import android.content.res.Resources.Theme
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.kotlin.ui.screens.GoGetKidsNavGraph
import com.example.kotlin.ui.screens.HomeScreen
import com.example.kotlin.ui.screens.Routes
import com.example.kotlin.ui.screens.UserInputScreen
import com.example.kotlin.ui.theme.KotlinTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            KotlinTheme{
                GoGetKidsApp()
            }
        }
    }

    @Composable
    fun GoGetKidsApp() {
        GoGetKidsNavGraph()
    }
}





/*
fun AudioPlay(context: Context) {
    val mp: MediaPlayer = MediaPlayer.create(context, R.raw.sippingcoffee)
    Column(modifier = Modifier.fillMaxSize()) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.coffeeimage),
                contentDescription = "profilePic",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(100.dp)
                )
            IconButton(onClick = { mp.start() }) {
                Icon(Icons.Filled.PlayArrow, contentDescription = "play button", modifier = Modifier.size(150.dp))
            }
            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(1.dp)
                    .background(color = Color.Black)
            )
            IconButton(onClick = { mp.pause() }) {
                Icon(Icons.Filled.Star, contentDescription = "pause button", modifier = Modifier.size(150.dp))
            }
        }
        Text("This is the sound of sipping coffee.", fontSize = 15.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardColumn() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box {
            Image(painter = painterResource(id = R.drawable.profile),
                contentDescription = "profilePic")
            Icon(Icons.Filled.Check, contentDescription = "Check mark",
                modifier = Modifier.padding(start=22.dp, top=17.dp))
        }
        Column {
            Text("Alfred Sisley")
            Text("3 minutes ago")
        }
    }
}*/
