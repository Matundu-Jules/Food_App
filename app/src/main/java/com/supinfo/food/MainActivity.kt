package com.supinfo.food

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Affichage du SplashScreen avant de charger l'application
        installSplashScreen()

        super.onCreate(savedInstanceState)

        // Simule un delai pour le chargement des données
        runBlocking {
            delay(2000)
        }

        setContent {
            FoodApp() // Affiche l'écran principal
        }

    }
}