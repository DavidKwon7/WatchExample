package com.example.watchexample.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.example.watchexample.presentation.incheon.incheonRoute
import com.example.watchexample.presentation.incheon.incheonScreen
import com.example.watchexample.presentation.jeju.jejuRoute
import com.example.watchexample.presentation.jeju.jejuScreen
import com.example.watchexample.presentation.main.mainRoute
import com.example.watchexample.presentation.main.mainScreen
import com.example.watchexample.presentation.seoul.seoulRoute
import com.example.watchexample.presentation.seoul.seoulScreen

@Composable
fun WeatherNavGraph(modifier: Modifier = Modifier) {
    val navController = rememberSwipeDismissableNavController()
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = mainRoute   // start screen 입력
    ) {
        mainScreen (
            navigateToIncheon = {
                navController.navigate(incheonRoute)
            },
            navigateToSeoul = {
                navController.navigate(seoulRoute)
            },
            navigateToJeju = {
                navController.navigate(jejuRoute)
            }
                )

        incheonScreen (
            { navController.navigate(mainRoute) }
        )

        seoulScreen (
            { navController.navigate(mainRoute) }
        )

        jejuScreen (
            { navController.navigate(mainRoute) }
        )
    }
}