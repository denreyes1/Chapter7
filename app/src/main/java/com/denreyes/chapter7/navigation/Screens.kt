package com.denreyes.chapter7.navigation

sealed class Screens(val route: String) {
    object PetsScreen : Screens("Pets")
    object PetDetailsScreen : Screens("petDetails")
}