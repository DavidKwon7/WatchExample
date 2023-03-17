package com.example.watchexample.presentation

import androidx.compose.runtime.Composable

@Composable
fun MainRoute(
    navigateToIncheon: () -> Unit,
    navigateToSeoul: () -> Unit,
    navigateToJeju: () -> Unit,
) {
    MainScreen(
        navigateToIncheon = navigateToIncheon,
        navigateToSeoul = navigateToSeoul,
        navigateToJeju = navigateToJeju
    )
}