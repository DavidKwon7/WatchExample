package com.example.watchexample.presentation.incheon

import androidx.navigation.NavGraphBuilder
import androidx.wear.compose.navigation.composable

const val incheonRoute = "incheon_route"

fun NavGraphBuilder.incheonScreen(
    navigateToBack: () -> Unit
) {
    composable(route = incheonRoute) {
        IncheonRoute(navigateToBack)
    }
}