package com.example.classassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val Tag = "Cycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(Tag,"onCreate")

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val editTextTextPersonName = findViewById<TextView>(R.id.editTextTextPersonName)
            val textView2 = findViewById<TextView>(R.id.textView2)
            val inputText = editTextTextPersonName.text.toString()

            textView2.text = String.format(inputText)


            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(Tag,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(Tag,"OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(Tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag,"onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(Tag,"onRestart")
    }
}