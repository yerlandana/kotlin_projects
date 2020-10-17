package com.dana.kotlin_lesson_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "HelloActivity"

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        val bButton: Button = findViewById(R.id.button_hello)
        bButton.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() is activated")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() is activated")
    }

    override fun onPause() {
        Log.d(TAG, "onPause() is activated")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop() is activated")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy() is activated")
        super.onDestroy()
    }
}
