package com.hsf.multitest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

class MyButton : androidx.appcompat.widget.AppCompatButton {
    private val myClickListener = OnClickListener {
        Log.d("Daisy", "点击了")
    }
    private val myLongClickListener = OnLongClickListener {
        Log.d("Daisy", "长按了")
        false
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setOnClickListener(myClickListener)
        setOnLongClickListener(myLongClickListener)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        Log.d("Daisy", "我的父view是：" + parent.javaClass.name)

        /*if (event?.y!! < 1500) {
            Log.d("Daisy", "父View不用拦截了")
            parent.requestDisallowInterceptTouchEvent(true)
        } else {
            Log.d("Daisy", "父View可以重新拦截了")
            parent.requestDisallowInterceptTouchEvent(false)
        }*/


        Log.d("Daisy", "触摸了" + event.toString())
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        return super.dispatchTouchEvent(event)
    }

}