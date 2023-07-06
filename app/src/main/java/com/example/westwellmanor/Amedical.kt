package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Amedical : AppCompatActivity() {

    private lateinit var call: Button
    private lateinit var call2: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amedical)

        call = findViewById(R.id.btncall)
        call2 = findViewById(R.id.btncall2)


        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0750537397")
            startActivity(dialIntent)
        }

        //call
        call2.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0113106210")
            startActivity(dialIntent)
        }

    }
}