package com.example.watchexample.presentation.seoul

import androidx.compose.runtime.Composable
import com.example.watchexample.presentation.IncheonScreen

@Composable
fun SeoulRoute(navigateToBack: () -> Unit) {
    SeoulScreen(
        navigateToBack = navigateToBack
    )
}