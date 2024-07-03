package com.hsf.multitest.scroll_touch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

class STouchButton(context: Context, attributeSet: AttributeSet) : Button(context, attributeSet) {

    /**
     * 当STouchButton被包括在可以滑动的ViewGroup中，如果发生饿了滑动，是会发送ACTION_CANCEL事件的
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("Daisy", "STouchButton 触摸事件: $event")
        return super.onTouchEvent(event)
    }
}