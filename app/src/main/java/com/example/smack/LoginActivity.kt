package com.example.smack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun onLoginCreaUserClicked(view: View) {
        println("crea user clicked")
        val creaUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(creaUserIntent)

    }
    fun onLoginClicked(view: View) {
        println("login clicked")

    }
}