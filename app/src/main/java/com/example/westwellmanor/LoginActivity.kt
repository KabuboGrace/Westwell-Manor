package com.example.westwellmanor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var login: Button
    private lateinit var signup: TextView
    private lateinit var myemail: EditText
    private lateinit var mypassword: EditText
    private lateinit var auth: FirebaseAuth


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        myemail = findViewById(R.id.email12)
        mypassword = findViewById(R.id.pass2)
        login = findViewById(R.id.button2)
        signup = findViewById(R.id.signuppage)

        auth = FirebaseAuth.getInstance()

        login.setOnClickListener {
            login()
        }

        signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun login(){
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this,"Successfully logged in",Toast.LENGTH_LONG).show()
                val intent=Intent(this, Home1Activity::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this,"Log in failed",Toast.LENGTH_LONG).show()
        }

    }
}
