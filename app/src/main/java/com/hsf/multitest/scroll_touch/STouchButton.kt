package com.hsf.multitest.scroll_touch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

class STouchButton(context: Context, attributeSet: AttributeSet) : Button(context, attributeSet) {

    init {
        /**
         * 如果长按按钮，而没有发生大幅度的移动，是会回调OnLongClickListener的
         * 不过在此之后如果发生了移动，事件就被ScrollView拦截了，还是会导致得到事件ACTION_CANCEL的，因此它并没有达到RecyclerView中有一种item可以长按拖拽的效果
         */
        setOnLongClickListener {
            Log.d("Daisy", "还是可以相应长按的")
            true
        }
    }

    /**
     * 当STouchButton被包括在可以滑动的ViewGroup中，如果发生饿了滑动，是会发送ACTION_CANCEL事件的
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("Daisy", "STouchButton 触摸事件: $event")
        return super.onTouchEvent(event)
    }
}