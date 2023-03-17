package com.example.watchexample.presentation.jeju

import androidx.compose.runtime.Composable
import com.example.watchexample.presentation.IncheonScreen

@Composable
fun JejuRoute(navigateToBack: () -> Unit) {
    JejuScreen(
        navigateToBack = navigateToBack
    )
}