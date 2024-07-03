package com.hsf.multitest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hsf.multitest.touch.TouchActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }

    fun goHomeActivity(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
    fun goTouchActivity(view: View) {
        startActivity(Intent(this, TouchActivity::class.java))
    }
}