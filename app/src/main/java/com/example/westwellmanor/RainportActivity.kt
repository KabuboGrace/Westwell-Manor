package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class RainportActivity : AppCompatActivity() {


    lateinit var security: CardView
    lateinit var reminder: CardView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rainport)


        security = findViewById(R.id.cardSecureRP)
        reminder = findViewById(R.id.cardRemindRP)

        security.setOnClickListener {
            var arn = Intent(this,RPsecure::class.java)
            startActivity(arn)
        }

        reminder.setOnClickListener {
            var arn = Intent(this,RPreminders::class.java)
            startActivity(arn)
        }
    }
}