package com.hsf.multitest.disallow_touch

import android.content.Context
import android.os.Handler
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

/**
 * 模仿RecyclerView有一种item可以实现长按发生拖拽
 *
 * 这这里，按下后，如果在500ms内没有发生大幅度移动，视为发生长按，将会不需要父View拦截事件，因此LongPressView可以获得接下来的触摸事件
 * 在ACTION_UP或ACTION_CANCEL之后，记得恢复状态
 */
class LongPressView(context: Context, attributeSet: AttributeSet) : Button(context, attributeSet) {
    private val LONG_PRESS_TIMEOUT = 500L

    private val handler = Handler()
    private var startX = 0f
    private var startY = 0f
    private var isLongPress = false

    val longPressRunnable = Runnable {
        isLongPress = true
        // 长按触发时调用
        performLongClick()
        parent.requestDisallowInterceptTouchEvent(true)
        Log.d("Daisy", "不允许父View拦截事件")
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        Log.d("Daisy", "打印事件: $event")

        when(event.action) {
            MotionEvent.ACTION_DOWN -> {
                startX = event.x
                startY = event.y
                isLongPress = false
                handler.postDelayed(longPressRunnable, LONG_PRESS_TIMEOUT)
                return true
            }

            MotionEvent.ACTION_MOVE -> {
                // 如果移动过大，取消长按判断
                if(Math.abs(event.x - startX) > 20 || Math.abs(event.y - startY) > 20) {
                    handler.removeCallbacks(longPressRunnable)
                }
                return true
            }

            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                handler.removeCallbacks(longPressRunnable)
                if (isLongPress) {
                    parent.requestDisallowInterceptTouchEvent(false)
                    isLongPress = false
                }
                return true
            }
        }
        return super.onTouchEvent(event)
    }
}