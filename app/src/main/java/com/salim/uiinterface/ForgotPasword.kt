package com.salim.uiinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ForgotPasword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pasword)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}