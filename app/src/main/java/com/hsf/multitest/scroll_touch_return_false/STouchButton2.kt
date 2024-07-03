package com.hsf.multitest.scroll_touch_return_false

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

class STouchButton2(context: Context, attributeSet: AttributeSet) : Button(context, attributeSet) {

    /**
     * 由于MyScrollView不拦截事件，因此所有事件都回调到这里了
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("Daisy", "STouchButton 触摸事件: $event")
        return super.onTouchEvent(event)
    }
}