package me.crossle.android.distribution.charting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class CustScrollView extends ScrollView {

	public CustScrollView(Context context) {
		super(context);
	}

	public CustScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		return super.onTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		final int action = ev.getAction();
		if ((action & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_MOVE) {
			return false;
		}
		return super.onInterceptTouchEvent(ev);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		return super.dispatchTouchEvent(ev);
	}

}
