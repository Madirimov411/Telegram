package com.uzb7.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val back=findViewById<Button>(R.id.b_main_back)
        back.setOnClickListener {
            val i= Intent(this,TelegramActivity::class.java)
            startActivity(i)
        }
    }
}