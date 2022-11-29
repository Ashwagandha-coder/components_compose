package com.sandbox_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
private fun PreviewVisib() {

    animVisib()

}



//@Preview(showBackground = true)
@Composable
fun animVisib() {


    var visible = remember {
        mutableStateOf(true)
    }

    Column(modifier = Modifier.size(100.dp), verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        AnimatedVisibility(visible = visible.value) {
            Text(text = "Hello World!", color = Color.Black)

            Button(onClick = { visible.value = false }, modifier = Modifier.padding(1.dp)) {
                Text(text = "Click Me")
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun textForTest() {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello Comp!", color = Color.Black)

    }
}