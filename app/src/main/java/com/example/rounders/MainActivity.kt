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
        val getRawData = GetRawData()
        getRawData.execute("https://api-sandbox.starlingbank.com/api/v1/transactions -H \"Accept:application/json\" -H \"Authorization: Bearer p1rX8FK2xqVvouYMAGh6qGd8K4W4utW4WDqV6njd5e8xNJKaTVzbL6wwk64MfVlV\"")
        Log.d(TAG, "onCreate Ends")
    }

    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }
}
