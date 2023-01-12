package com.uzb7.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_free)
        initViews()
    }

    private fun initViews() {
        val back=findViewById<Button>(R.id.b_free_back)
        val next=findViewById<Button>(R.id.b_free)
        next.setOnClickListener {
            val i= Intent(this,PowerfullActivity::class.java)
            startActivity(i)
        }
        back.setOnClickListener {
            val i= Intent(this,TelegramActivity::class.java)
            startActivity(i)
        }
    }
}