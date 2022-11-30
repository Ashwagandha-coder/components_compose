package com.sandbox_compose.animation.CrossFade

import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class CrossFade2 {


    @Preview(showBackground = true)
    @Composable
    private fun PreviewCrossFadeFunc() {

        CrossfadeDemo()

    }



    @Composable
    fun CrossfadeDemo() {
        var currentColor by remember { mutableStateOf(MyColors.Red) }
        Column {
            Row {
                MyColors.values().forEach { myColors ->
                    Button(
                        onClick = { currentColor = myColors },
                        Modifier
                            .weight(1f, true)
                            .height(48.dp)
                            .background(myColors.color),
                        colors = ButtonDefaults.buttonColors(backgroundColor = myColors.color)
                    ) {
                        Text(myColors.name)
                    }
                }
            }
            Crossfade(targetState = currentColor, animationSpec = tween(3000)) { selectedColor ->
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(selectedColor.color)
                    .animateContentSize())
            }
        }
    }


}