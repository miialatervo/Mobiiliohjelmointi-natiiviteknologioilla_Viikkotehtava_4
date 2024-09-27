package com.example.theming.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily

val CustomTypography = Typography(
    headlineLarge = TextStyle( // Käytetään Material3:n headlineLarge
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        letterSpacing = 1.5.sp, // Korjattu: letterSpacing käyttää .sp
        fontFamily = FontFamily.SansSerif
    )
)