package com.example.activityandfragmentifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


   private lateinit var text:TextView
   private lateinit var button: Button

    var TAG:String="LIFECYCLE"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.button1)

      StartButtonAction()

        Log.d(TAG,"MainActivity:onCreate()")

    }

    private fun StartButtonAction() {

        button.setOnClickListener {
            Log.e(TAG,"button is clicked")
            Toast.makeText(this, "Going to Activity 2", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this,MainActivity2::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"MainActivity:onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"MainActivity:onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"MainActivity: onPause() ")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"MainActivity:onStop()")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG,"MainActivity:onSaveInstanceState")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"MainActivity:onDestroy()")

    }
}