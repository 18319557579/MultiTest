package com.hsf.multitest.scroll_touch_return_false

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.ScrollView

class MyScrollView(context: Context, attributeSet: AttributeSet) : ScrollView(context, attributeSet) {
    /**
     * 这里始终返回false，导致它无法拦截事件流，所以所有事件都由最上面的View来接收，也无法进行滑动了
     */
    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
}