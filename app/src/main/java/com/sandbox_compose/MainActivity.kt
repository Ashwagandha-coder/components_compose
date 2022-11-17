package com.sandbox_compose

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

            PreviewMessageCard()
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

    Row(modifier = Modifier.padding(8.dp)) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Profile people",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = message.author, color = Color.Black)
            Text(text = message.body, color = Color.Black)
        }
    }
}


@Preview
@Composable
fun PreviewMessageCard() {
    
    MessageCard(message = MessageCompose("Dan","doSome - 2"))
    
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

