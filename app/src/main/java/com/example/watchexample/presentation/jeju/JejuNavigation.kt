package com.example.watchexample.presentation.jeju

import androidx.navigation.NavGraphBuilder
import androidx.wear.compose.navigation.composable

const val jejuRoute = "jeju_route"

fun NavGraphBuilder.jejuScreen(
    navigateToBack: () -> Unit
) {
    composable(route = jejuRoute) {
        JejuRoute(navigateToBack)
    }
}