package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Lrob : AppCompatActivity() {
    private lateinit var call: Button
    private lateinit var sms: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lrob)

        call = findViewById(R.id.btncallL)
        sms = findViewById(R.id.btnsmsL)

        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0721235999")
            startActivity(dialIntent)
        }
        //sms
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0721235999")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hello,I am a resident of Westwell Manor.")
            startActivity(intent)
        }
    }
}