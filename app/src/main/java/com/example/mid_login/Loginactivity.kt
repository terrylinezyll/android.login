  package com.example.mid_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


  class Loginactivity : AppCompatActivity() {
    lateinit var texttosignup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
        texttosignup=findViewById(R.id.gotosignup)
        texttosignup.setOnClickListener {
            val intent= Intent(this,Loginactivity::class.java)
            startActivity(intent)
        }
    }
}