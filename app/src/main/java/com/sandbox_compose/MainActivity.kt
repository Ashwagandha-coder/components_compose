package com.sandbox_compose

import android.content.res.Configuration
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
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
            
            Sandbox_ComposeTheme() {
                androidx.compose.material.Surface(modifier = Modifier.fillMaxSize()) {
                    PreviewMessageCard_3()
                }
            }
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

// lesson 3


@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode")
@Composable
fun PreviewMessageCard_3() {

    Sandbox_ComposeTheme {
        androidx.compose.material.Surface {

            MessageCard(message = MessageCompose("Dan", "Hello!, How do you do"))
        }
    }

}



// lesson 2

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
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {

            Text(text = message.author, color = MaterialTheme.colors.secondaryVariant, style = MaterialTheme.typography.subtitle2)
            Spacer(modifier = Modifier.height(4.dp))

            androidx.compose.material.Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {

                Text(
                    text = message.body,
                    modifier = Modifier.padding(4.dp),
                    style = MaterialTheme.typography.body2
                )

            }
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

