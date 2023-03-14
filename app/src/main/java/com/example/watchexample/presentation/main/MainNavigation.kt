package com.example.watchexample.presentation.main

import androidx.navigation.NavGraphBuilder
import androidx.wear.compose.navigation.composable
import com.example.watchexample.presentation.MainRoute

const val mainRoute = "main_route"

fun NavGraphBuilder.mainScreen(
    navigateToIncheon: () -> Unit
) {
    composable(route = mainRoute) {
        MainRoute (navigateToIncheon)
    }
}