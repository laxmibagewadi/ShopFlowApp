package com.example.activityandfragmentifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    var TAG:String="LIFECYCLE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(TAG,"MainActivity2:onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"MainActivity2:onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"MainActivity2:onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"MainActivity2:onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"MainActivity2:onStop()")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG,"MainActivity2:onSaveInstanceState()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"MainActivity2:onDestroy()")

    }
}