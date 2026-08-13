package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class TouchObserverFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.view.View.OnTouchListener f43355C;

    public TouchObserverFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.f43355C;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f43355C = onTouchListener;
    }
}
