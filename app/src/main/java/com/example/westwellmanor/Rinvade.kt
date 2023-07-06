package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rinvade : AppCompatActivity() {
    lateinit var call: Button
    lateinit var call2: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rinvade)
        call = findViewById(R.id.btncall)
        call2 = findViewById(R.id.btncall2)


        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0726610508")
            startActivity(dialIntent)
        }

        //call
        call2.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0800597000")
            startActivity(dialIntent)
        }
    }
}