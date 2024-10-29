package com.denreyes.chapter7.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost // important
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.denreyes.chapter7.views.PetDetailsScreen
import com.denreyes.chapter7.views.PetsScreen
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.PetsScreen.route
    ) {
        composable(Screens.PetsScreen.route) {
            PetsScreen(onPetClicked = { cat ->
                navController.navigate("${Screens.PetDetailsScreen.route}/${Json.encodeToString(cat)}")
            })
        }
        composable(
            route = "${Screens.PetDetailsScreen.route}/{cat}",
            arguments = listOf(
                navArgument("cat") {
                    type = NavType.StringType
                }
            )
        ) {
            PetDetailsScreen(
                onBackPressed = {
                    navController.popBackStack()
                },
                cat = Json.decodeFromString(it.arguments?.getString("cat") ?: "")
            )
        }
    }
}