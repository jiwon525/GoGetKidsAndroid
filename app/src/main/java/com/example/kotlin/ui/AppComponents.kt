package com.example.kotlin.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.kotlin.R

@Composable
fun LoginTopBar(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(255, 232, 138))){
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Welcome to\nGoGetKids",
                color = Color.Black,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                modifier = Modifier.size(150.dp),
                painter = painterResource(id = R.drawable.children),
                contentDescription = "App icon"
                //https://www.flaticon.com/free-icon/children_3884934?term=kids&page=1&position=2&origin=tag&related_id=3884934
            )
        }

    }

}
@Preview(showBackground = true)
@Composable
fun LoginTopBarPreview(){
    LoginTopBar()
}
@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}

@Composable
fun TopBar(value:String = "Welcome"){
    Row(modifier = Modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = value,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(10.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.size(80.dp),
            painter = painterResource(id = R.drawable.children),
            contentDescription = "App icon"
            //https://www.flaticon.com/free-icon/children_3884934?term=kids&page=1&position=2&origin=tag&related_id=3884934
        )
    }
}

@Composable
fun TextComponent(textValue: String,
                  textSize: TextUnit){
    Text(
        text = textValue,
        fontSize = textSize,
        fontWeight = FontWeight.Light
    )
}

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    TextComponent(textValue = "defaulttest", textSize = 24.sp)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent(){
    var currentValue by remember{
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = currentValue,
        onValueChange = {},
        placeholder = {
            Text(text = "Enter your username", fontSize = 18.sp)
        })
}
@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview(){
    TextFieldComponent()
}