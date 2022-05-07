package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityCalculate: AppCompatActivity() {
    lateinit var btnsend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnsend=findViewById(R.id.btnsend)
//        com.example.helloworld.ActivitySendMoney2 = findViewById(R.id.btnBmI)
        btnsend.setOnClickListener {
            val intent = Intent(this,ActivitySendMoney2::class.java)
            startActivity(intent)
        }


    }
}