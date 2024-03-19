package com.fuadhev.myweatherappjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuadhev.myweatherappjetpack.ui.theme.MyWeatherAppJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyWeatherAppJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    MaterialTheme.colorScheme.primary,
                                    MaterialTheme.colorScheme.primary,
                                    MaterialTheme.colorScheme.secondary
                                )
                            )
                        ),
                    color = Color.Transparent
                ) {
                    Navigation()
                }
            }
        }
    }
}


@Composable
fun test(){



    Column (modifier = Modifier.fillMaxSize()){
        Text(modifier = Modifier.padding(10.dp),text = "Test1",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif)

        Text(modifier = Modifier.padding(10.dp),text = "Test2",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif)

        Text(modifier = Modifier.padding(10.dp),text = "Test3",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif)

        Text(modifier = Modifier.padding(10.dp),text = "Test4",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif)
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyWeatherAppJetpackTheme {
        test()
    }
}