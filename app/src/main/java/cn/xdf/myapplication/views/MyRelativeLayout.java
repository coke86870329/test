package cn.xdf.myapplication.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

class MyRelativeLayout extends RelativeLayout {
    int i = 0 ;
    public MyRelativeLayout(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {


        Log.e("ypyp","MyRelativeLayout---dispatchTouchEvent:"+"MotionEvent:"  + convertMotionEvent(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    public MyRelativeLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelativeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        Log.e("ypyp","MyRelativeLayout---onInterceptTouchEvent:"+"MotionEvent:"  + convertMotionEvent(ev.getAction()));


        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("ypyp","MyRelativeLayout---onTouchEvent:"+"MotionEvent:" +  convertMotionEvent(event.getAction()));
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
