                                                                                                                          package com.example.mid_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

                                                                                                                          class MainActivity : AppCompatActivity() {
    lateinit var texttologin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texttologin=findViewById(R.id.gotologin)
        texttologin.setOnClickListener {
            val intent=Intent(this,Loginactivity::class.java)
            startActivity(intent)
        }
    }
}