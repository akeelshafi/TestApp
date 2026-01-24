package com.akeel.testapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.FrameLayout
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
        val btn = findViewById<Button>(R.id.button)



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
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:0123456789")
            startActivity(intent)
        }

      supportFragmentManager.beginTransaction()
          .replace(R.id.frameLayout, BlankFragment())
          .commit()

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