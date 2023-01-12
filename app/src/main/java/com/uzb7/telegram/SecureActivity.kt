package com.uzb7.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secure)
        initViews()
    }

    private fun initViews() {
        val back=findViewById<Button>(R.id.b_secure_back)
        val next=findViewById<Button>(R.id.b_secure)
        next.setOnClickListener {
            val i= Intent(this,CloudBasedActivity::class.java)
            startActivity(i)
        }
        back.setOnClickListener {
            val i= Intent(this,TelegramActivity::class.java)
            startActivity(i)
        }
    }
}