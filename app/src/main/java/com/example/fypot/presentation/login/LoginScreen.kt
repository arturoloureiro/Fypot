package com.example.fypot.presentation.login

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.fypot.R
import com.example.fypot.ui.theme.Black

@Composable
fun LoginScreen(){
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Black)
    ){
        Icon(painter = painterResource(id = R.drawable.back),
            contentDescription = "",
        )
        Text("Email", color = White, fontWeight = FontWeight.Bold, fontSize = 40.sp)
        TextField(value = email, onValueChange = { email =  it })

        Text("Password", color = White, fontWeight = FontWeight.Bold, fontSize = 40.sp)
        TextField(value = password, onValueChange = { password =  it })
    }

}

@Preview
@Composable
fun LoginPreview(){
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Black)
    ){
        Icon(painter = painterResource(id = R.drawable.back),
            contentDescription = "",
        )
        Text("Email", color = White, fontWeight = FontWeight.Bold, fontSize = 40.sp)
        TextField(value = email, onValueChange = { email =  it })

        Text("Password", color = White, fontWeight = FontWeight.Bold, fontSize = 40.sp)
        TextField(value = password, onValueChange = { password =  it })
    }
}
