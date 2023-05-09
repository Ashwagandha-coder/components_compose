package com.sandbox_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import com.sandbox_compose.func.PreviewMessageCard_3
import com.sandbox_compose.ui.theme.Sandbox_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Sandbox_ComposeTheme() {
                androidx.compose.material.Surface(modifier = Modifier.fillMaxSize()) {
                    PreviewMessageCard_3()
                }
            }
        }
    }
}


