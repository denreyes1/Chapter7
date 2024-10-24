package com.denreyes.chapter7.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.PetsScreen.route
    ){
        composable(Screens.PetsScreen.route){
            PetsScreen(
                onPetClicked = {cat -> }
            )
        }
    }
}