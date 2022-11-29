package com.sandbox_compose.animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


class AnimationContent : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }



    @Composable
    private fun AnimateContent() {

        var expandable  =  remember {
            mutableStateOf(true)
        }

        Column(modifier = Modifier.fillMaxSize()) {

            Text(text = "Hello from Animation Content", color = Color.Black)

            Button(onClick = { onClickButton(expandable = expandable) }) {
                Text(text = "Action")
            }

        }


    }


    private fun onClickButton(expandable: MutableState<Boolean>) {

        expandable.value = !expandable.value


    }



    @Preview(showBackground = true)
    @Composable
    private fun PreviewAnimateContent() {

        AnimateContent()

    }

}