package com.sahil.expensex.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(

    primary = PrimaryLight,
    onPrimary = Color.Black,

    background = Color(0xFF0F172A),
    onBackground = Color.White,

    surface = Color(0xFF1E293B),
    onSurface = Color.White,

    outline = Color(0xFF475569),

    error = Error
)

//private val DarkColorScheme = darkColorScheme(
//    primary = Primary,
//    secondary = Secondary,
//    background = Color(0xFF0F172A),
//    surface = Color(0xFF1E293B),
//    onPrimary = Color.White,
//    onBackground = Color.White,
//    onSurface = Color.White
//)

//private val LightColorScheme = lightColorScheme(
//    primary = Primary,
//    secondary = Secondary,
//    background = Background,
//    surface = Surface,
//    onPrimary = Color.White,
//    onBackground = TextPrimary,
//    onSurface = TextPrimary
//)

private val LightColorScheme = lightColorScheme(

    primary = Primary,
    onPrimary = Color.White,

    primaryContainer = PrimaryLight,
    onPrimaryContainer = Color.White,

    background = Background,
    onBackground = TextPrimary,

    surface = Surface,
    onSurface = TextPrimary,

    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,

    outline = Outline,

    error = Error
)

@Composable
fun ExpensexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme =
        if (darkTheme) DarkColorScheme
        else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}