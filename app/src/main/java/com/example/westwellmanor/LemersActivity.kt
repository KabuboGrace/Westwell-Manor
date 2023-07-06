package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class LemersActivity : AppCompatActivity() {


    lateinit var security: CardView
    lateinit var reminder: CardView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lemers)


        security = findViewById(R.id.cardSecureLM)
        reminder = findViewById(R.id.cardRemindLM)

        security.setOnClickListener {
            var arn = Intent(this, LMsecure::class.java)
            startActivity(arn)
        }


        reminder.setOnClickListener {
            var arn = Intent(this, LMreminders::class.java)
            startActivity(arn)
        }

    }
}



