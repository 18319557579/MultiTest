package com.hsf.multitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.databinding.DataBindingUtil
import com.hsf.multitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.llOuter.setOnClickListener {
            Log.d("Daisy", "外部的布局被点击了")
        }
        
        binding.btnNormal.setOnTouchListener { v, event ->
            Log.d("Daisy", "收到了时间：$event")
            false
        }

        binding.tvOnlyOnTouchListener.setOnTouchListener { v, event ->
            Log.d("Daisy", "仅监听OnTouchListener的收到了事件：$event")
            false
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return super.dispatchTouchEvent(ev)
    }

}