package com.hsf.multitest.touch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

class TouchButton(context: Context, attributeSet: AttributeSet) : Button(context, attributeSet) {
    /**
     * 继承Button，在onTouchEvent()，中会收到ACTION_DOWN、ACTION_MOVE、ACTION_UP事件
     * ACTION_DOWN在按下的时候回调，ACTION_UP在抬起的时候回调，而ACTION_MOVE是按的过程中手指轻微的移动就会回调，可能没有
     *
     * 但是，当设置clickable="false"，就只能收到ACTION_DOWN了
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("Daisy", "TouchButton 触摸事件: $event")
        return super.onTouchEvent(event)
    }
}