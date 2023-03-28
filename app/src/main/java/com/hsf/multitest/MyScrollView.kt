package com.hsf.multitest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.ScrollView

class MyScrollView : ScrollView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("Daisy", "ScrollView想拦截:" + ev.toString())
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("Daisy", "ScrollView获得了：$event")
        return super.onTouchEvent(event)
    }
}