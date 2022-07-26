package com.example.anestudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlin.math.sqrt
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            // Toast 메세지 -> 앱의 밑에 뜨는 것
            Toast.makeText(this,
            "Clicked!",
            Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.anr).setOnClickListener {
            Thread(Runnable {
//                MAX_VALUE -> 21억
                for(i in 1.. Int.MAX_VALUE) {
                    Log.d("mytag", sqrt(Random.nextDouble()).toString())
                }
            }).start()
        }
    }
}