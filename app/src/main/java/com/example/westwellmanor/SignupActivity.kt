package com.example.westwellmanor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.w3c.dom.Text

class SignupActivity : AppCompatActivity() {
    lateinit var mylogin: TextView
    lateinit var myemail: EditText
    lateinit var mypassword:EditText
    lateinit var myconfpassword:EditText
    lateinit var signup:Button
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        myemail = findViewById(R.id.email)
        mypassword = findViewById(R.id.pass)
        myconfpassword = findViewById(R.id.confpass)
        signup = findViewById(R.id.button)
        mylogin = findViewById(R.id.loginpage)
        auth = Firebase.auth

        mylogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        signup.setOnClickListener {
            SignUpUser()
        }
    }

    private fun SignUpUser(){
        val email=myemail.text.toString()
        val pass= mypassword.text.toString()
        val confirmpass= myconfpassword.text.toString()

        if (email.isBlank()|| pass.isBlank() ||confirmpass.isBlank()){
            Toast.makeText(this,"Email and password cant be blank",Toast.LENGTH_SHORT).show()
            return

        } else if (pass != confirmpass){
            Toast.makeText(this, "Password does not match",Toast.LENGTH_SHORT).show()
            return
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                  Toast.makeText(this,"Signed up successful",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()

            }else{
                Toast.makeText(this,"Failed to create",Toast.LENGTH_SHORT).show()
            }
        }
    }

}

