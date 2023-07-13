package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView


class ArntersActivity : AppCompatActivity() {


    lateinit var security: CardView
    lateinit var reminder: CardView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arnters)


        security = findViewById(R.id.cardSecureAN)

        reminder = findViewById(R.id.cardRemindAN)



        security.setOnClickListener {
            var arn = Intent(this,ARNsecure::class.java)
            startActivity(arn)
        }



        reminder.setOnClickListener {
            var arn = Intent(this,ARNreminders::class.java)
            startActivity(arn)
        }

    }
}