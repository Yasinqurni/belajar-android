package com.lala.belajarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lala.belajarandroid.ui.theme.BelajarAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BelajarAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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
    BelajarAndroidTheme {
        Greeting("Android")
    }
}


@Composable
fun UserChat(name: String, msg: String, modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.padding(4.dp).height(80.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_cat_cute),
            contentDescription = null,
            modifier = modifier
                .padding(4.dp)
                .size(70.dp)
                .border(2.dp, Color.Blue, CircleShape)
                .clip(CircleShape)
            )
        Spacer(modifier = modifier.width(4.dp))
        Column (modifier = modifier.padding(4.dp).fillMaxSize()) {
            Text(name, fontWeight = FontWeight.Bold)
            Text(msg)
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                tint = Color.Blue,
                modifier = modifier.align(Alignment.End),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserCHatPreview() {
    BelajarAndroidTheme {
        UserChat(name = "Lala", msg = "Anak cantik ku")
    }
}