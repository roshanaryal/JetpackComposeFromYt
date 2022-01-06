package com.aarappstudios.jetpackcomposefromyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aarappstudios.jetpackcomposefromyt.ui.theme.JetpackComposeFromYtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainDemo()
        }
    }
}

@Composable
fun MainDemo() {
    ModiFierDemo()
}

@Composable
fun ModiFierDemo() {

    Column(modifier = Modifier
        .background(Color.Green)
        .fillMaxWidth()
        .fillMaxHeight(0.5f)
        .border(1.dp,Color.Magenta)
        .padding(50.dp)
        .border(1.dp,Color.Magenta)
//        .requiredWidth()
    ) {
        Text(text = "Hello",modifier = Modifier
//            .offset(40.dp,30.dp)

        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(text = "World")

    }
}


























@Composable
fun RowDemo() {
    Row(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxWidth()
            .height(100.dp)
            .padding(8.dp)
            .clickable {
//                Toast.makeText(MainActivity@,"Clicked",Toast.LENGTH_SHORT).show()
            },
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Greeting(name = "Hello")
        Greeting(name = "World")
        Greeting(name = "Nepal")

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeFromYtTheme {
        MainDemo()
    }
}