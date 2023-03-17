package com.example.watchexample.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    androidx.wear.compose.material.Scaffold(
        timeText = { TimeText(modifier = Modifier.scrollAway(listState)) },
        vignette = { Vignette(vignettePosition = VignettePosition.TopAndBottom) },
        positionIndicator = { PositionIndicator(scalingLazyListState = listState) }
    ) {
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = listState
        ) {
            item { ChipExample(titleText = "서울 날씨", navigateToIncheon = navigateToSeoul) }
            item { ChipExample(titleText = "인천 날씨", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "전주 날씨", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "부산 날씨", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "제주도 날씨", navigateToIncheon = navigateToJeju) }
        }
    }
}

@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    titleText: String,
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
        icon = {
            Icon(imageVector = Icons.Rounded.SelfImprovement,
                contentDescription = null,
                modifier = iconModifier
            )
        },
        // 백그라운드 이미지 넣기
        colors = ChipDefaults.imageBackgroundChipColors(
            backgroundImagePainter = painterResource(id = com.example.watchexample.R.drawable.baseline_airplane_ticket_24)
        )
    )
}