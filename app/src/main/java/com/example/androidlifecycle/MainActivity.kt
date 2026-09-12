package com.example.androidlifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            applicationContext,
            "onCreate()",
            Toast.LENGTH_SHORT
        ).show()

        setContent {
            Text("Android Lifecycle")
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
}