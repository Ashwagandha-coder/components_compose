package com.sandbox_compose.animation

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat


class AnimationContent : ComponentActivity() {

    private lateinit var tv: TextView


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

            Image(
                painter = painterResource(
                    id = com.sandbox_compose.R.drawable.cat
                ),
                contentDescription = "",
                modifier = Modifier
                    .background(Color.Yellow)
                    .animateContentSize(tween(1500))
            )

            Button(onClick = { onClickButton(expandable = expandable) }) {
                Text(text = "Action")
            }

        }


    }

    // for test


    @Composable
    fun AnimatedContentSize() {
        Column {
            var expanded by remember {
                mutableStateOf(false)
            }

//            Image(
//                painter = painterResource(
//                    id = if (expanded)
//                        R.drawable.img
//                    else
//                        R.drawable.ic_launcher_background
//                ),
//                contentDescription = "",
//                modifier = Modifier
//                    .background(Color.Yellow)
//                    .animateContentSize(tween(1500))
//            )

            Button(onClick = { expanded = !expanded }) {
                Text(if (expanded) "Hide" else "Show")
            }
        }
    }













    private fun chooseResources(flag_1: Boolean) {

        var other_flag = flag_1

        other_flag = !other_flag

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