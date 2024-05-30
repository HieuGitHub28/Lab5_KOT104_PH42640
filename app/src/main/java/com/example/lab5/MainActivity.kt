package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavApp()
        }
    }
}

@Composable
fun MainScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(RouteScreen.Bai1.route)
        }) {
            Text(text = "Bài 1")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(RouteScreen.Bai2.route)
        }) {
            Text(text = "Bài 2")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(RouteScreen.Bai3.route)
        }) {
            Text(text = "Bài 3")
        }
    }
}


@Composable
fun NavApp(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = RouteScreen.Main.route) {
        composable(RouteScreen.Main.route){ MainScreen(navController)}
        composable(RouteScreen.Bai1.route){Bai1(navController)}
        composable(RouteScreen.Bai2.route){Bai2(navController)}
        composable(RouteScreen.Bai3.route){Bai3(navController)}

    }
}