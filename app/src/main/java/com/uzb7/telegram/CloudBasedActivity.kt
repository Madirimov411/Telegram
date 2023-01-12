package com.uzb7.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CloudBasedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cloud_based)
        initViews()
    }

    private fun initViews() {
        val back=findViewById<Button>(R.id.b_cloud_back)
        val next=findViewById<Button>(R.id.b_cloud)
        next.setOnClickListener {
            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        back.setOnClickListener {
            val i= Intent(this,TelegramActivity::class.java)
            startActivity(i)
        }
    }
}