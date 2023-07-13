package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HelpActivity : AppCompatActivity() {
    private lateinit var call: Button
    private lateinit var sms: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        call = findViewById(R.id.btncallH)
        sms = findViewById(R.id.btnsmsH)

        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0722670009")
            startActivity(dialIntent)
        }
        //sms
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0722670009")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hello,I am a resident of Westwell Manor.I need help with the app.Thank you.")
            startActivity(intent)
        }
    }
}