package com.example.codewhizapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codewhizapp.R
import com.example.codewhizapp.components.ButtonComponent
import com.example.codewhizapp.components.ClickableLoginTextComponent
import com.example.codewhizapp.components.DividerTextComponent
import com.example.codewhizapp.components.HeadingTextComponent
import com.example.codewhizapp.components.MyTextField
import com.example.codewhizapp.components.NormalTextComponent
import com.example.codewhizapp.components.PasswordTextField
import com.example.codewhizapp.components.UnderlinedTextComponent
import com.example.codewhizapp.navigation.CodeWhizAppRouter
import com.example.codewhizapp.navigation.Screen
import com.example.codewhizapp.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen(){
    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(16.dp)
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
        ){
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))

            Spacer(modifier = Modifier.height(20.dp))
            
            MyTextField(
                labelValue = stringResource(id = R.string.email), 
                painterResource = painterResource(id = R.drawable.email)
            )
            PasswordTextField(
                labelValue = stringResource(id = R.string.password), 
                painterResource = painterResource(id = R.drawable.padlock)
            )

            Spacer(modifier = Modifier.height(20.dp))

            UnderlinedTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            Spacer(modifier = Modifier.height(20.dp))

            ClickableLoginTextComponent( tryingToLogin = false, onTextSelected = {
                    CodeWhizAppRouter.navigateTo(Screen.SignUpScreen)
                }
            )
        }
    }

    SystemBackButtonHandler {
        CodeWhizAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}