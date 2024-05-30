package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController

@Composable
fun Bai2 (navController: NavController){
    LightSwitch()
}
@Composable
fun LightSwitch(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var isChecked by remember{ mutableStateOf(false) }
        if (isChecked){
            Image(
                painter = painterResource(id = R.drawable.bulb_on2),
                contentDescription = "on",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth)
        }else{
            Image(
                painter = painterResource(id = R.drawable.bulb_off2),
                contentDescription = "off",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Switch(
            checked = isChecked,
            onCheckedChange = {isChecked = it},
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green,
                uncheckedThumbColor = Color.Gray,
                checkedTrackColor = Color.Green.copy(0.5f),
                uncheckedTrackColor = Color.Gray.copy(0.5f),
                checkedBorderColor = Color.Green.copy(0.75f)
            ))
    }
}

