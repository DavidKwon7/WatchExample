package com.example.watchexample.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Thunderstorm
import androidx.compose.material.icons.rounded.WbSunny
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.*

@Composable
fun MainScreen(
    navigateToIncheon: () -> Unit,
    navigateToSeoul: () -> Unit,
    navigateToJeju: () -> Unit
) {
    val listState = rememberScalingLazyListState()
    Scaffold(
        timeText = { TimeText(modifier = Modifier.scrollAway(listState)) },
        vignette = { Vignette(vignettePosition = VignettePosition.TopAndBottom) },
        positionIndicator = { PositionIndicator(scalingLazyListState = listState) }
    ) {
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = listState
        ) {
            item {
                ChipExample(
                    titleText = "Seoul Weather",
                    subTitle = "Sunny",
                    icon = Icons.Rounded.WbSunny,
                    navigateToIncheon = navigateToSeoul
                )
            }
            item {
                ChipExample(
                    titleText = "Incheon Weather",
                    subTitle = "Sunny",
                    icon = Icons.Rounded.WbSunny,
                    navigateToIncheon = navigateToIncheon
                )
            }
            item {
                ChipExample(
                    titleText = "Jeonju Weather",
                    subTitle = "Sunny",
                    icon = Icons.Rounded.WbSunny,
                    navigateToIncheon = navigateToIncheon
                )
            }
            item {
                ChipExample(
                    titleText = "Busan Weather",
                    subTitle = "Sunny",
                    icon = Icons.Rounded.WbSunny,
                    navigateToIncheon = navigateToIncheon
                )
            }
            item {
                ChipExample(
                    titleText = "Jeju Weather",
                    subTitle = "Rainy",
                    icon = Icons.Rounded.Thunderstorm,
                    navigateToIncheon = navigateToJeju
                )
            }
        }
    }
}

@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    titleText: String,
    subTitle: String,
    icon: ImageVector,
    navigateToIncheon: () -> Unit
) {
    Chip(
        modifier = modifier,
        onClick = { navigateToIncheon() },
        label = {
            Text(
                text = titleText,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        secondaryLabel = {
            Text(
                text = subTitle,
                maxLines = 1,
            )
        },
        icon = {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = iconModifier
            )
        },
        colors = ChipDefaults.imageBackgroundChipColors(
            backgroundImagePainter = painterResource(id = com.example.watchexample.R.drawable.baseline_airplane_ticket_24)
        )
    )
}