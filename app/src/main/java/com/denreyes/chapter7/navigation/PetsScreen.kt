package com.denreyes.chapter7.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.denreyes.chapter7.data.Cat
import com.denreyes.chapter7.views.PetList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PetsScreen(onPetClicked: (Cat) -> Unit) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Pets")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                ))
        },
        content = { paddingValues ->
            PetList(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
//                onPetClicked = onPetClicked
            )
        }
    )
}