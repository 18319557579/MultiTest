package com.hsf.multitest.scroll_touch

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hsf.multitest.R

/**
 * 这个是正常的Button在ScrollView中
 * 那么Button可以发生点击；ScrollView可以发生滑动；并且Button可以发生长按，长按后移动还是可以使得ScrollView滑动
 */
class ScrollTouchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_touch)
    }
}