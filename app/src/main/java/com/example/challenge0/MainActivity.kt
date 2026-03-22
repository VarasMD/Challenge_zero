package com.example.challenge0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.example.challenge0.ui.screen.LoginScreen
import com.example.challenge0.ui.screen.RegisterScreen
import com.example.challenge0.ui.screen.WelcomeScreen
import com.example.challenge0.ui.theme.Challenge0Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Challenge0Theme {
                var currentScreen by remember { mutableStateOf("welcome") }

                when (currentScreen) {
                    "welcome" -> WelcomeScreen(
                        onLoginClick = { currentScreen = "login" },
                        onRegisterClick = { currentScreen = "register" }
                    )

                    "login" -> LoginScreen(
                        onCreateAccountClick = { currentScreen = "register" }
                    )

                    "register" -> RegisterScreen(
                        onAlreadyHaveAccountClick = { currentScreen = "login" }
                    )
                }
            }
        }
    }
}