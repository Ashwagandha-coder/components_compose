package com.sandbox_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sandbox_compose.ui.theme.Sandbox_ComposeTheme

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
private fun PreviewVisibility() {

    animVisib()

}


private fun doSome() {
}



//@Preview(showBackground = true)
@Composable
fun animVisib() {


    var visible = remember {
        mutableStateOf(true)
    }
    
    
    Box(modifier = Modifier.height(20.dp)) {

        // Чтобы сделать visibility - INVISIBLE нужно обернуть все в Box {}
    

    Column(modifier = Modifier.size(100.dp), verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        AnimatedVisibility(
            visible = visible.value,
            enter = fadeIn(animationSpec = tween(700)) + expandVertically(
                tween(
                    700,
                    easing = LinearEasing
                )
            ),
            exit = fadeOut(animationSpec = tween(700)) + shrinkVertically(
                tween(
                    700,
                    easing = FastOutSlowInEasing
                )
            )
        ) {
            Text(text = "Hello World!", color = Color.Black)

            // при нажатиии сначала срабатывает exit потом enter

            // TODO: word: Shrink, Expand, Easing, fade, fadeIn, fadeOut, state in compose k

        }


        Button(onClick = { onClickMe(visible) }, modifier = Modifier.padding(top = 12.dp)) {
            Text(text = "Click Me")
        }

    }
    }

}

private fun onClickMe(visible: MutableState<Boolean>) { visible.value = !visible.value }

@Preview(showBackground = true)
@Composable
fun textForTest() {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello Comp!", color = Color.Black)

    }
}