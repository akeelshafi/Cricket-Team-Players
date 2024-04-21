package com.twoplus.secondbasictestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("i am onCreate method")
    }

    override fun onStart() {
        super.onStart()
        println("i am onStart method")
    }

    override fun onResume() {
        super.onResume()
        println("i am on pause method")
    }

    override fun onPause() {
        super.onPause()
        println("i am onPause method")
    }

    override fun onStop() {
        super.onStop()
        println("i am onStop method")
    }

    override fun onRestart() {
        super.onRestart()
        println("i am onRestart method")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("i am onDestroy method")
    }
}