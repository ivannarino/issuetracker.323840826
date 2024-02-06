package com.example.issuetracker323840826

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.issuetracker323840826.ui.theme.Issuetracker323840826Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Issuetracker323840826Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        Greeting()
                    }
                }
            }
        }
    }
}

val myFontFamily = FontFamily(
    Font(R.font.myfont, weight = FontWeight.Normal),
)

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.hello),
        modifier = modifier,
        style = TextStyle(fontSize = 30.sp, fontFamily = myFontFamily)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Issuetracker323840826Theme {
        Greeting()
    }
}