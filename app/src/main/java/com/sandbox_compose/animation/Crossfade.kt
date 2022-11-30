package com.sandbox_compose.animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sandbox_compose.R
import com.sandbox_compose.animation.ui.theme.Sandbox_ComposeTheme

class Crossfade : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }


    @Preview(showBackground = true)
    @Composable
    private fun PreviewCrossFade() {}




    @Composable
    fun mCrossFade() {


        var state by remember {
            mutableStateOf(true)
        }



        Crossfade(targetState = state) { screen ->

            when(screen) {



            }

        }

        Column(modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.drawable.monitor_pic ), contentDescription = "")


            Button(onClick = {}) {

            }

        }




    }



    @Composable
    private fun someImage() {

        Image(painter = painterResource(id = R.drawable.ic_launcher_svg_pic), contentDescription = "do Some" )


    }

    @Composable
    private fun someText() {

        Text(text = "Some text")


    }




















}

