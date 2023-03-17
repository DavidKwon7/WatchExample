package com.example.watchexample.presentation.example

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.*

/**
 * 좀 더 자세한 정보는 하단의 링크를 참조해주세요!
 * https://developer.android.com/training/wearables/compose/buttons
 */

@Composable
fun CardExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    AppCard(
        modifier = modifier,
        appImage = {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "triggers open message action",
                modifier = iconModifier
            )
        },
        appName = { Text("Messages") },
        time = { Text("12m") },
        title = { Text("Kim Green") },
        onClick = {  }
    ) {
        Text("On my way!")
    }
}

@Composable
fun ChipExample(
    modifier: Modifier =Modifier,
    iconModifier: Modifier = Modifier
) {
    Chip(
        modifier = modifier,
        onClick = {  },
        label = {
            Text(
                text = "5 minute Meditation",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        icon = {
            Icon(
                imageVector = Icons.Rounded.SelfImprovement,
                contentDescription = "triggers meditation action",
                modifier = iconModifier
            )
        }
    )
}

@Composable
fun ToggleChipExample(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }
    ToggleChip(
        modifier = modifier,
        checked = checked,
        toggleControl = {
            Switch(
                checked = checked,
                modifier = Modifier.semantics {
                    this.contentDescription = if (checked) "On" else "Off"
                }
            )
        },
        onCheckedChange = {
            checked = it
        },
        label = {
            Text(
                text = "Sound",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    )
}

@Composable
fun ButtonExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        Alignment.CenterVertically
    ) {
        Button(onClick = {  }) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "phone btn",
                modifier = iconModifier
            )
        }
        Button(onClick = {  }) {
            Text(text = "취소")
        }
    }
}

@Composable
fun ScalingLazyColumnExample() {
    val listState = rememberScalingLazyListState()
    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize(),
        autoCentering = AutoCenteringParams(itemIndex = 0),
        state = listState
    ) {
        item { ButtonExample() }
        item { ButtonExample() }
        item { ToggleChipExample() }

    }
}

@Composable
fun ScaffoldExample() {
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

            item { ButtonExample() }
            item { CardExample() }
            item { ChipExample() }
            item { ToggleChipExample() }
        }
    }
}