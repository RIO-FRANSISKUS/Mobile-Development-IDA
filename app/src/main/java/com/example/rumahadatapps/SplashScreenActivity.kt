package com.example.rumahadatapps

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val moveToMainActivity = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(moveToMainActivity)
            finish()
        }, 3000)
    }
}