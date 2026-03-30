package com.example.challenge0.ui.screen

import androidx.compose.foundation.background
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
import com.example.challenge0.ui.components.PrimaryActionButton
import com.example.challenge0.ui.components.TopIllustrationImage
import com.example.challenge0.ui.theme.PrimaryBlue

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier,
                  onLoginClick: () -> Unit = {},
                  onRegisterClick: () -> Unit = {}) {
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

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .size(180.dp)
                .clip(CircleShape)
                .background(Color(0xFFF6F7FB))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 28.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopIllustrationImage()

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "Discover Your\nDream Job here",
                color = PrimaryBlue,
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 38.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Explore all the existing job roles based on your\ninterest and study major",
                color = Color.Black,
                fontSize = 13.sp,
                lineHeight = 18.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                PrimaryActionButton(
                    text = "Login",
                    modifier = Modifier
                        .weight(1f)
                        .height(54.dp),
                    onClick = onLoginClick
                )

                Spacer(modifier = Modifier.width(16.dp))

                PrimaryActionButton(
                    text = "Register",
                    modifier = Modifier
                        .weight(1f)
                        .height(54.dp),
                    isPrimary = false,
                    onClick = onRegisterClick
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 760)
@Composable
fun WelcomeScreenPreview() {
    MaterialTheme {
        Surface {
            WelcomeScreen()
        }
    }
}
