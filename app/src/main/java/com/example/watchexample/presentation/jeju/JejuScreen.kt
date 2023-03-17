package com.example.watchexample.presentation.jeju

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.wear.compose.material.CardDefaults
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TitleCard
import com.example.watchexample.R

@Composable
fun JejuScreen(
    modifier: Modifier = Modifier,
    navigateToBack: () -> Unit
) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        TitleCard(
            modifier = modifier,
            time = { },
            title = { Text(text = "Jeju Weather") },
            backgroundPainter = CardDefaults.imageWithScrimBackgroundPainter(
                backgroundImagePainter = painterResource(id = R.drawable.baseline_thunderstorm_24)
            ),
            onClick = { navigateToBack() }
        ) {
            Column {
                Text(text = "온도 : 11°C")
                Text(text = "습도 : 58%")
                Text(text = "풍속 : 4m/s")
            }
        }
    }
}