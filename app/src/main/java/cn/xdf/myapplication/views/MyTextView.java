package cn.xdf.myapplication.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.Nullable;

class MyTextView extends androidx.appcompat.widget.AppCompatTextView {
    int i = 0;
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("ypyp","textView---onTouchEvent:" +"MotionEvent:" + convertMotionEvent(event.getAction()));
       /* if(event.getAction() == MotionEvent.ACTION_DOWN) {
            return true;
        } else {

            return false;
        }*/
       return super.onTouchEvent(event);
    }
    private String convertMotionEvent ( int a ) {
        String b = "";
        switch (a) {
            case MotionEvent.ACTION_DOWN:
                b = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                b = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                b = "ACTION_UP";
                break;
        }
        return b;
    }
}
