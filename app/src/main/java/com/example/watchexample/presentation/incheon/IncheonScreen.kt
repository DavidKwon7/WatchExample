package com.example.watchexample.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.CardDefaults
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TitleCard

@Composable
fun IncheonScreen(
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
            title = { Text(text = "Incheon Weather") },
            backgroundPainter = CardDefaults.imageWithScrimBackgroundPainter(
                backgroundImagePainter = painterResource(id = com.example.watchexample.R.drawable.baseline_airplane_ticket_24)
            ),
            onClick = { navigateToBack() }
        ) {
            Column {
                Text(text = "온도 : 9°C")
                Text(text = "습도 : 40%")
                Text(text = "풍속 : 5m/s")
            }
        }
    }
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun IncheonPreview() {
    IncheonScreen(
        navigateToBack = {}
    )
}