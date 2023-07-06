package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RPsecure : AppCompatActivity() {

    lateinit var fire: Button
    lateinit var rob: Button
    lateinit var animal: Button
    lateinit var medical: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rpsecure)

        fire = findViewById(R.id.btnfire)
        rob = findViewById(R.id.btnRobbery)
        animal = findViewById(R.id.btnanimal)
        medical = findViewById(R.id.btnMedical)

        fire.setOnClickListener {
            var arn = Intent(this,Lfire::class.java)
            startActivity(arn)
        }

        rob.setOnClickListener {
            var arn = Intent(this,Lrob::class.java)
            startActivity(arn)
        }

        animal.setOnClickListener {
            var arn = Intent(this,Linvade::class.java)
            startActivity(arn)
        }

        medical.setOnClickListener {
            var arn = Intent(this,Lmedical::class.java)
            startActivity(arn)
        }
    }
}