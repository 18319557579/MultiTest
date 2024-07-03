package com.hsf.multitest.touch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class TouchView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {
    /**
     * 可以看到，继承View，在onTouchEvent()默认只会收到ACTION_DOWN的事件
     *
     * 但是，当设置clickable="true"，就可以收到ACTION_DOWN、ACTION_MOVE、ACTION_UP事件
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("Daisy", "TouchView 触摸事件: $event")
        return super.onTouchEvent(event)


    }


}