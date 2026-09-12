package com.example.androidlifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            applicationContext,
            "onCreate()",
            Toast.LENGTH_SHORT
        ).show()

        setContent {
            MaterialTheme {
                StudentScreen()
            }
        }
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(
            applicationContext,
            "onStart()",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(
            applicationContext,
            "onResume()",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(
            applicationContext,
            "onPause()",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(
            applicationContext,
            "onStop()",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(
            applicationContext,
            "onDestroy()",
            Toast.LENGTH_SHORT
        ).show()
    }
}

@Composable
fun StudentScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.my_photo
            ),
            contentDescription = "Student Photo",
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Android Lifecycle",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Text(
            text = "นายนปพล เอี้ยงลักขช 68102106110"
        )
    }
}