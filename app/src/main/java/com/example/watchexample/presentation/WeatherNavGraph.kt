package com.example.watchexample.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.example.watchexample.presentation.incheon.incheonRoute
import com.example.watchexample.presentation.incheon.incheonScreen
import com.example.watchexample.presentation.main.mainRoute
import com.example.watchexample.presentation.main.mainScreen

@Composable
fun WeatherNavGraph(modifier: Modifier = Modifier) {
    val navController = rememberSwipeDismissableNavController()
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = mainRoute   // start screen 입력
    ) {
        mainScreen {
            navController.navigate(incheonRoute)
        }

        incheonScreen {
            navController.navigate(mainRoute)
        }
    }
}