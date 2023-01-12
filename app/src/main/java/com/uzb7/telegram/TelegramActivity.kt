package com.uzb7.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelegramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telegram)
        initViews()
    }

    private fun initViews() {
        val next=findViewById<Button>(R.id.b_telegram_next)
        next.setOnClickListener {
            val i=Intent(this,FastActivity::class.java)
            startActivity(i)
        }
    }
}