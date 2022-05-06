package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivitySendMoney2 : AppCompatActivity() {
    lateinit var SendMoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SendMoney=findViewById(R.id.button)
//        com.example.helloworld.ActivitySendMoney2 = findViewById(R.id.btnBmI)
        SendMoney.setOnClickListener {
            val intent = Intent(this, com.example.helloworld.SendMoney::class.java)
            startActivity(intent)
        }


    }
}