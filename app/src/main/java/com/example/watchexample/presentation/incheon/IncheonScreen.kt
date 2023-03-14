package com.example.watchexample.presentation

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.example.watchexample.R

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
                backgroundImagePainter = painterResource(id = com.google.android.gms.base.R.drawable.common_full_open_on_phone)
            ),
            onClick = { navigateToBack() }
        ) {
            Column {
                Text(text = "온도 : 17")
                Text(text = "습도 : 23%")
            }
        }
    }
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun SeoulPreview() {
    IncheonScreen(
        navigateToBack = {}
    )
}