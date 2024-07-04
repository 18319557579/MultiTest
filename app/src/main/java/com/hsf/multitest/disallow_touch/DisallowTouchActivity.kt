package com.hsf.multitest.disallow_touch

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hsf.multitest.R

/**
 * 与ScrollTouchActivity不同的是，长按item后再发生move，ScrollView也不会滑动了，因为我们进行了处理
 */
class DisallowTouchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disallow_touch)
    }
}