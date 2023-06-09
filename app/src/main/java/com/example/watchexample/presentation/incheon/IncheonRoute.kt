package com.example.watchexample.presentation.incheon

import androidx.compose.runtime.Composable
import com.example.watchexample.presentation.IncheonScreen

@Composable
fun IncheonRoute(navigateToBack: () -> Unit) {
    IncheonScreen(
        navigateToBack = navigateToBack
    )
}