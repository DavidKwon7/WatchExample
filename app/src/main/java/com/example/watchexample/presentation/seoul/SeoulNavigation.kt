package com.example.watchexample.presentation.seoul

import androidx.navigation.NavGraphBuilder
import androidx.wear.compose.navigation.composable
import com.example.watchexample.presentation.incheon.IncheonRoute

const val seoulRoute = "seoul_route"

fun NavGraphBuilder.seoulScreen(
    navigateToBack: () -> Unit
) {
    composable(route = seoulRoute) {
        SeoulRoute(navigateToBack)
    }
}