package com.example.composable.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.login.ui.theme.LoginTheme

@Composable
fun ComposableTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    LoginTheme(darkTheme = darkTheme, content = content)
}
