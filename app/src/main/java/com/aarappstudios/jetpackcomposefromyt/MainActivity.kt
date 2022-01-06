package com.aarappstudios.jetpackcomposefromyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
//    ModiFierDemo()
    val painter= painterResource(id = R.drawable.demo)
    val modifier=Modifier.offset(10.dp,10.dp)

    Row() {
        Box(modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(10.dp))
        {
            ImageCard(painter = painter,"Demo Text","Demo image",modifier)

        }

        Box(modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(10.dp))
        {
            ImageCard(painter = painter,"Demo Text","Demo image",modifier)

        }
    }

}


@Composable
fun ModiFierDemo() {

    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .border(1.dp, Color.Magenta)
            .padding(50.dp)
            .border(1.dp, Color.Magenta)
//        .requiredWidth()
    ) {
        Text(
            text = "Hello", modifier = Modifier
//            .offset(40.dp,30.dp)

        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(text = "World")

    }
}


@Composable
fun ImageCard(
    painter: Painter,
    title: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(15.dp), elevation = 5.dp

    ) {
//        modifier.border(1.dp, Color.Red)
        Box(modifier = Modifier.height(200.dp)) {

            Image(painter = painter, contentDescription =contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxHeight()
                )

            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black), 300f
                    )
                )
            ) {


            }
            
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
            ,contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title
                ,style = TextStyle(color = Color.White,fontSize = 16.sp)
                )
            }
        }
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