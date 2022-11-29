package com.sandbox_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandbox_compose.ui.theme.Sandbox_ComposeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

class ActivityForAnimation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sandbox_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Sandbox_ComposeTheme {
        Greeting2("Android")
    }
}

@Preview(showBackground = true)
@Composable
private fun animCompose() {

    AnimatedVisibility(visible = true) {

        DefaultPreview2()


    }

}

@Preview(showBackground = true)
@Composable
fun AnimateVisibility() {
    var visible by Remember {
        mutableStateOf (true)
    }
    Column (modifier = Modifier.fillMaxSize ( )),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        if (visible)  {
            Text (text = "Hello, мир!")
        }
        Button (onClick = { visible = !visible } ) {
            Text ("Click Me")
        }
    }
}