package com.example.shoeappjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shoeappjc.Screens.ProductDetailScreen
import com.example.shoeappjc.Screens.ProductScreen
import com.example.shoeappjc.navigation.AppNavHost
import com.example.shoeappjc.ui.theme.ShoeAppJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoeAppJCTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    AppNavHost(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShoeAppJCTheme {
        Greeting("Android")
    }
}