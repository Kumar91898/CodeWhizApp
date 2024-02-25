package com.example.codewhizapp.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.codewhizapp.navigation.CodeWhizAppRouter
import com.example.codewhizapp.navigation.Screen
import com.example.codewhizapp.screens.LoginScreen
import com.example.codewhizapp.screens.SignUpScreen
import com.example.codewhizapp.screens.TermsAndConditionsScreen

@Composable
fun CodeWhizApp(){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = CodeWhizAppRouter.currentScreen) { currentState ->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen ->{
                    TermsAndConditionsScreen()
                }
                is Screen.LoginScreen ->{
                    LoginScreen()
                }
            }
            
        }
    }
}