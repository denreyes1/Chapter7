package com.denreyes.chapter7.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost // important
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.denreyes.chapter7.views.PetDetailsScreen
import com.denreyes.chapter7.views.PetsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.PetsScreen.route
    ) {
        composable(Screens.PetsScreen.route) {
            PetsScreen(onPetClicked = {
                navController.navigate(Screens.PetDetailsScreen.route)
            })
        }
        composable(Screens.PetDetailsScreen.route) {
            PetDetailsScreen(
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
    }
}