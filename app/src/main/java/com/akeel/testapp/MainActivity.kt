package com.akeel.testapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
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
        val textView = findViewById<TextView>(R.id.textView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        textView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("key", "Akeel shafi kana")
            startActivity(intent)

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "onStart called")
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