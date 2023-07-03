package com.creppyfm.coffeeshop

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.creppyfm.coffeeshop.ui.theme.Alternative2
import com.creppyfm.coffeeshop.ui.theme.CoffeeShopTheme

@Preview
@Composable
fun App_Preview() {
    CoffeeShopTheme {
        App()
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var selectedRoute = remember {
        mutableStateOf(Routes.MenuPage.route)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { AppTitle() },
                navigationIcon = {},
                actions = {}
            )
        },
        bottomBar = {
            NavBar(
                selectedRoute = selectedRoute.value,
                onChange = {newRoute ->
                selectedRoute.value = newRoute
            })
        }
    ) {
        OffersPage()
    }
}
@Composable
fun AppTitle() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Alternative2)
            .padding(8.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Coffee Masters Logo")
    }
}