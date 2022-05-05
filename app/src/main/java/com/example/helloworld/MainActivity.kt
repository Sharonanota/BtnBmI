 package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    lateinit var btnBmI:Button
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmI = findViewById(R.id.btnBmI)
        btnBmI.setOnClickListener {
            val intent = Intent(this, BmICalculateActivity::class.java)
            startActivity(intent)
        }

//        lateinit var btnBmI:Button
//        setContentView(R.layout.activity_main)
//        tvBmI = findViewById(R.id.tvBmI)
//        tvBmI.setOnClickListener {
//            val intent = Intent(
//                this, BmICalculateActivity::class.java
//            )
//            startActivity(intent)
//        }
    }
}