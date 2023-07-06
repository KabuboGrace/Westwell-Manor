package com.example.westwellmanor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LMreminders : AppCompatActivity() {

    lateinit var stk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lmreminders)

        stk = findViewById(R.id.BtnStk)

        stk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }

}
