package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CGPA()
                }
            }
        }
    }
}

@Composable

fun CGPA(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "CGPA Calculator\n Calculate your CGPA")
//        Text(text = "CGPA Calculator\n Calculate your CGPA", modifier = Modifier.fillMaxWidth(),
//        style = TextStyle(fontSize = 20.sp, textAlign = TextAlign.Center,
//            color = Color(0xFF0000000)
//        ))
    }
}

@Preview(showBackground = true)
@Composable
fun CGPAPreview() {
    JetpackComposeTheme {
        CGPA()
    }
}
