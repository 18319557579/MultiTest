package com.hsf.multitest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.LinearLayout

class MyLinearLayout : LinearLayout {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {

    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        val interceptResult = super.onInterceptTouchEvent(ev)
        Log.d("Daisy", "$interceptResult LinearLayout想拦截:" + ev.toString())
//        Log.d("Daisy", "输出Y：" + ev?.y)

        /*if (ev?.y!! > 1000) {
            Log.d("Daisy", "拦截成功")
            return true
        }*/

        return interceptResult
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val ttt = super.onTouchEvent(event)
        Log.d("Daisy", "$ttt LinearLayout回调onTouchEvent：$event")
        return ttt
    }
}