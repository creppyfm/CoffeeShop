package com.creppyfm.coffeeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.creppyfm.coffeeshop.ui.theme.CoffeeShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataManager = ViewModelProvider(this)[DataManager::class.java]
        setContent {
            CoffeeShopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App(dataManager)
                }
            }
        }
    }
}


/*
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ComposableExample() {
    val name = remember { mutableStateOf("") }

    Column() {
        Text("Hello, ${name.value}!",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Green)
                .padding(16.dp))

        Text("Enter name below:",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Green)
                .padding(4.dp))

        TextField(value = name.value, onValueChange = {
            name.value = it
        })
    }
}*/
