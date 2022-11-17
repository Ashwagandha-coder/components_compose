package com.sandbox_compose

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sandbox_compose.ui.theme.Sandbox_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Sandbox_ComposeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("World on Compose")
//                }
//            }
            MessageCard(message = com.sandbox_compose.MessageCompose("Dan","doSome"))
            
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Sandbox_ComposeTheme {
        Greeting("Android")
    }
}

data class MessageCompose(
    val author: String,
    val body: String
)


@Composable
fun MessageCard(message: MessageCompose) {

    Text(text = message.author)
    Text(text = message.body)

    
}







// lesson 1

@Preview
@Composable
fun MyFirstPreviewMessage() {
    
    Text(text = "Other World")
    
}

@Preview
@Composable
fun testOtherPreview() {
    
    Greeting(name = "Dot")
    
}

@Preview
@Composable
fun doSomeCheckBoxCompose() {

    Checkbox(checked = true, onCheckedChange = {} )

}

