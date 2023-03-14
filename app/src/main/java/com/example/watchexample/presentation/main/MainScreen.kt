package com.example.watchexample.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.*
import com.google.android.gms.base.R

@Composable
fun MainScreen(
    navigateToIncheon: () -> Unit
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
            item { ChipExample(titleText = "spring party", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "summer party", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "autumn party", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "winter party", navigateToIncheon = navigateToIncheon) }
            item { ChipExample(titleText = "party party", navigateToIncheon = navigateToIncheon) }
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
            backgroundImagePainter = painterResource(id = R.drawable.googleg_disabled_color_18)
        )
    )
}