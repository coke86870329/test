package cn.xdf.myapplication.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

class MyLinearLayout extends LinearLayout {
    int i = 0 ;
    public MyLinearLayout(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("ypyp","LinearLayout---dispatchTouchEvent:"+"MotionEvent:"  + convertMotionEvent(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    int lastX;
    int lastY;
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("ypyp","LinearLayout---onInterceptTouchEvent:"+"MotionEvent:"  + convertMotionEvent(ev.getAction()));
        int x = (int)ev.getX();
        int y = (int)ev.getY();
        boolean intercept = false;

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:

                intercept =true;

                break;
            case MotionEvent.ACTION_MOVE:
                if(y-lastY<0) { // 上滑
                    intercept = true;
                    Log.e("ypyp","LinearLayout上滑了~~");
                }else {
                    intercept = false;
                    Log.e("ypyp","LinearLayout下滑了~~");
                }

                break;
            case MotionEvent.ACTION_UP:
                intercept = false;
                break;
        }
        lastY = y;
        lastX = x;
        return intercept;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

//        Log.e("ypyp","LinearLayout---onTouchEvent:"+"MotionEvent:" +  convertMotionEvent(event.getAction()));

        return true;
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
