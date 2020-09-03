package cn.xdf.myapplication

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    protected val FLAG_DISALLOW_INTERCEPT = 0x80000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {

        Log.e("ypyp","Activity:dispatchTouchEvent---" + "MotionEvent:" + convertMotionEvent(ev!!.action)
        )
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        Log.e(
            "ypyp", "Activity:onTouchEvent---" + "MotionEvent:" + convertMotionEvent(event!!.action)
        )
        return super.onTouchEvent(event)
    }

    private fun convertMotionEvent(a: Int): String? {
        var b = ""
        when (a) {
            MotionEvent.ACTION_DOWN -> b = "ACTION_DOWN"
            MotionEvent.ACTION_MOVE -> b = "ACTION_MOVE"
            MotionEvent.ACTION_UP -> b = "ACTION_UP"
        }
        return b
    }

}
