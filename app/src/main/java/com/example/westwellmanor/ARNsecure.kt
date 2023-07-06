package com.example.westwellmanor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ARNsecure : AppCompatActivity() {
    lateinit var fire: Button
    lateinit var rob: Button
    lateinit var animal: Button
    lateinit var medical: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arnsecure)

        fire = findViewById(R.id.btnfire)
        rob = findViewById(R.id.btnRobbery)
        animal = findViewById(R.id.btnanimal)
        medical = findViewById(R.id.btnMedical)

        fire.setOnClickListener {
            var arn = Intent(this,Afire::class.java)
            startActivity(arn)
        }

        rob.setOnClickListener {
            var arn = Intent(this,Arobb::class.java)
            startActivity(arn)
        }

        animal.setOnClickListener {
            var arn = Intent(this,Ainvade::class.java)
            startActivity(arn)
        }

        medical.setOnClickListener {
            var arn = Intent(this,Amedical::class.java)
            startActivity(arn)
        }


    }
}