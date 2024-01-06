package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
//import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = stringResource(R.string.Happy_Birthday_Text), from = stringResource(R.string.signature_text))
                    //GreetingText(message = "Happy Birthday Samrth" , from = "Shraddha")
                   // Greeting("Android")

                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Happy Birthday $name!",
//        modifier = modifier
//    )
//}


@Composable
fun GreetingText(message: String,from : String , modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxHeight()//IMP
            .padding(8.dp)
    )
    {
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = from,
                fontSize = 20.sp,
                lineHeight = 116.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)

                //textAlign = TextAlign.Center
            )
        }

}

@Composable
fun GreetingImage(message: String , from: String , modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = "Happy Birthday samrth!!",
            from ="Shraddha",
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                //.align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true ,name = "Shraddha")
@Composable
fun HappyBirthdayPreview() {
    HappyBirthdayTheme {
        GreetingImage(message = stringResource(R.string.Happy_Birthday_Text), from = stringResource(R.string.signature_text) )
        //GreetingImage("Happy Birthday samrth ","Shraddha")
        //GreetingText("Happy Birthday Samrth !" ,"From your Sister Shraddha")
        //Greeting("Samrth Arvind gunjal")

    }
}