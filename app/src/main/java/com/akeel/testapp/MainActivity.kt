package com.akeel.testapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LIFECYCLE","onCreate called")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "onPause called")

    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFECYCLE", "onRestart called")

    }
}