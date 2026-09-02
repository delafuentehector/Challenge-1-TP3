package com.example.prueba.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Azul,
    onPrimary = Blanco,
    background = Blanco,
    onBackground = Oscuro,
    surface = Blanco,
    onSurface = Oscuro,
    onSurfaceVariant = Gris,
)

@Composable
fun PruebaTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content,
    )
}