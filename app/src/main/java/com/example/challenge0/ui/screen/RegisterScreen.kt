package com.example.challenge0.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge0.ui.components.AuthTextField
import com.example.challenge0.ui.components.PrimaryActionButton
import com.example.challenge0.ui.components.SocialLoginRow
import com.example.challenge0.ui.theme.PrimaryBlue

@Composable
fun RegisterScreen(modifier: Modifier = Modifier,
                   onAlreadyHaveAccountClick: () -> Unit = {}) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF8F8F8))
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(220.dp)
                .clip(CircleShape)
                .background(Color(0xFFF3F4F8))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 28.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "Create Account",
                color = PrimaryBlue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Create an account so you can explore all the\nexisting jobs",
                color = Color.Black,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(34.dp))

            AuthTextField(
                value = "",
                onValueChange = {},
                placeholder = "Email",
                focused = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            AuthTextField(
                value = "",
                onValueChange = {},
                placeholder = "Password",
                isPassword = true,
                focused = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            AuthTextField(
                value = "",
                onValueChange = {},
                placeholder = "Confirm Password",
                isPassword = true,
                focused = true
            )

            Spacer(modifier = Modifier.height(28.dp))

            PrimaryActionButton(
                text = "Sign up",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            )

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "Already have an account",
                color = Color.Black,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onAlreadyHaveAccountClick() }
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "Or continue with",
                color = PrimaryBlue,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            SocialLoginRow()
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 760)
@Composable
fun RegisterScreenPreview() {
    MaterialTheme {
        Surface {
            RegisterScreen()
        }
    }
}