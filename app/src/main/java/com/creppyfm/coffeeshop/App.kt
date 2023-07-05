package com.creppyfm.coffeeshop

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.creppyfm.coffeeshop.pages.InfoPage
import com.creppyfm.coffeeshop.pages.MenuPage
import com.creppyfm.coffeeshop.pages.OffersPage
import com.creppyfm.coffeeshop.pages.OrderPage
import com.creppyfm.coffeeshop.ui.theme.Alternative2

/*@Preview
@Composable
fun App_Preview() {
    CoffeeShopTheme {
        App()
    }
}*/


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(dataManager: DataManager) {
    val selectedRoute = remember {
        mutableStateOf("menu")
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { AppTitle() },
                navigationIcon = {},
                actions = {}
            )
        },
        content = {
            when(selectedRoute.value) {
                Routes.MenuPage.route -> MenuPage(dataManager)
                Routes.OffersPage.route -> OffersPage()
                Routes.OrderPage.route -> OrderPage(dataManager)
                Routes.InfoPage.route -> InfoPage()
            }
        },
        bottomBar = {
            NavBar(
                selectedRoute = selectedRoute.value,
                onChange = {newRoute ->
                    selectedRoute.value = newRoute
                })
        }
    )
}

@Composable
fun AppTitle() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Alternative2)
            //.padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Coffee Masters Logo",
            modifier = Modifier.padding(12.dp)
        )
    }
}