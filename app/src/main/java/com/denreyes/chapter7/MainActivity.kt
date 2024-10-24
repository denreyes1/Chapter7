package com.denreyes.chapter7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.denreyes.chapter7.navigation.AppNavigation
import com.denreyes.chapter7.ui.theme.Chapter7Theme
import com.denreyes.chapter7.views.PetList

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Chapter7Theme {
                AppNavigation()
            }
        }
    }

}

@Composable
fun ListPets(pad: PaddingValues) {
    PetList(
        modifier = Modifier
            .fillMaxSize()
            .padding(pad)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Chapter7Theme {
        AppNavigation()
    }
}