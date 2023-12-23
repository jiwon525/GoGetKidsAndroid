package com.example.kotlin.ui

import android.widget.Toast
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.kotlin.R
import com.example.kotlin.ui.screens.Routes

@Composable
fun LoginTopBar(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(255, 232, 138))){
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Welcome to",
                color = Color.Black,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp, end = 0.dp, top = 10.dp, bottom = 0.dp)
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "GoGetKids",
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
fun TextFieldComponent(content:String){
    var currentVal by remember{ mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.width(1000.dp),
        value = currentVal,
        onValueChange = {},
        placeholder = {
            Text(text = content, fontSize = 18.sp)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview(){
    TextFieldComponent("Hello")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponentVM(content:String,
                       onTextChanged : (name:String, pw:String, roleValue:String, button: Boolean)->Unit){
    var nameValue by remember{ mutableStateOf("") }
    var pwValue by remember{ mutableStateOf("") }
    var roleValue by remember{ mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.width(1000.dp),
        value = nameValue,
        onValueChange = {
            nameValue = it
            pwValue = it
            roleValue = it
            onTextChanged(nameValue, pwValue, roleValue, false)
        },
        placeholder = {
            Text(text = content, fontSize = 18.sp)
        })
}


@Composable
fun RoleCard(content: String){
    Card( //dnt hv onclick yet
        modifier = Modifier
            .padding(24.dp)
            .height(80.dp)
            .width(130.dp),//add .clickable here
        elevation = CardDefaults.cardElevation(4.dp)
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = content,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(15.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}
@Preview
@Composable
fun CardPreview(){
    RoleCard("testing")
}

@Composable
fun RoleCard2(){
    Card(
        modifier = Modifier
            .padding(24.dp)
            .height(40.dp)
            .width(100.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ){
        Image(
            modifier = Modifier
                .padding(16.dp)
                .wrapContentHeight()
                .wrapContentWidth(),
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null
        )
    }
}
@Preview
@Composable
fun CardPreview2(){
    RoleCard2()
}

@Composable
fun buttonExample(navController: NavHostController, textValue: String) {

    Button(onClick = { navController.navigate(Routes.HOME_SCREEN) }) {
        Text(textValue)
    }

}
@Preview
@Composable
fun buttonpreview(){
    buttonExample(rememberNavController(), "Testing")
}

@Composable
fun button2(textValue: String) {

    Button(onClick={}) {
        Text(textValue)
    }

}
@Preview
@Composable
fun buttonpreview2(){
    button2("Testing")
}