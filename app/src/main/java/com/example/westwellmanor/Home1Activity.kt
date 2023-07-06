package com.example.westwellmanor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Home1Activity : AppCompatActivity() {

    lateinit var arnters: CardView
    lateinit var lemers: CardView
    lateinit var rainport: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1_activivy)

        arnters = findViewById(R.id.cardArnters)
        lemers = findViewById(R.id.cardLemers)
        rainport = findViewById(R.id.cardRainport)

        arnters.setOnClickListener {
            var arn = Intent(this,ArntersActivity::class.java)
            startActivity(arn)
        }

        lemers.setOnClickListener {
            var lem = Intent(this,LemersActivity::class.java)
            startActivity(lem)
        }
        rainport.setOnClickListener {
            var rain = Intent(this,RainportActivity::class.java)
            startActivity(rain)
        }
    }
}