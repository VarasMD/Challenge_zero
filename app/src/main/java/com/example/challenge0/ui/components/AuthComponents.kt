package com.example.challenge0.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import com.example.challenge0.ui.theme.BorderBlue
import com.example.challenge0.ui.theme.TextDark
import com.example.challenge0.ui.theme.TextGray
import com.example.challenge0.ui.theme.White
import com.example.challenge0.R

@Composable
fun AuthTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isPassword: Boolean = false,
    focused: Boolean = false
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = {
            Text(
                text = placeholder,
                color = TextGray,
                fontSize = 14.sp
            )
        },
        visualTransformation = if (isPassword) {
            PasswordVisualTransformation()
        } else {
            androidx.compose.ui.text.input.VisualTransformation.None
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp),
        shape = RoundedCornerShape(12.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = White,
            unfocusedContainerColor = Color(0xFFF1F3F8),
            focusedBorderColor = if (focused) BorderBlue else Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            focusedTextColor = TextDark,
            unfocusedTextColor = TextDark,
            cursorColor = BorderBlue
        )
    )
}

@Composable
fun TopIllustrationImage() {
    Image(
        painter = painterResource(id = R.drawable.welcome_image),
        contentDescription = "Welcome illustration",
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp),
        contentScale = ContentScale.Fit
    )
}