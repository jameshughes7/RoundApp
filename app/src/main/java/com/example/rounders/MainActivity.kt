package com.example.rounders

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.text = "Rounders App started!"
        button.setOnClickListener { toast("Message: ${input.text}") }
        Log.d(TAG, "onCreate Ends")
    }

    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }
}
