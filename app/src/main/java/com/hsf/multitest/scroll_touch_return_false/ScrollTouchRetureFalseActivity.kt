package com.hsf.multitest.scroll_touch_return_false

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hsf.multitest.R

/**
 * 使用的是MyScrollView，由于onInterceptTouchEvent恒定返回false，因此它什么事件也收不到了，所以就无法发生滑动了
 */
class ScrollTouchRetureFalseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_touch_reture_false)
    }
}