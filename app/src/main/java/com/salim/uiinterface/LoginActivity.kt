package com.salim.uiinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val btn_forgot = findViewById<Button>(R.id.btn_forgot_password)
        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_forgot.setOnClickListener {
            startActivity<ChangePassword>()
        }
        btn_login.setOnClickListener {
            startActivity<ForgotPasword>()
        }
    }
}