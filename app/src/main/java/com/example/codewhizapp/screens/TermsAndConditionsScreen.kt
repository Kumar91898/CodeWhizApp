package com.example.codewhizapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codewhizapp.R
import com.example.codewhizapp.components.HeadingTextComponent
import com.example.codewhizapp.navigation.CodeWhizAppRouter
import com.example.codewhizapp.navigation.Screen
import com.example.codewhizapp.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen(){
    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(16.dp)
    ){
        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_Header))
    }

    SystemBackButtonHandler {
        CodeWhizAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview(showSystemUi = true)
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}