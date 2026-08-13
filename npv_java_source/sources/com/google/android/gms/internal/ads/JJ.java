package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JJ implements android.view.GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZI f28665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BJ f28666b;

    JJ(com.google.android.gms.internal.ads.ZI zi, com.google.android.gms.internal.ads.BJ bj) {
        this.f28665a = zi;
        this.f28666b = bj;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f6, float f10) {
        int y6;
        try {
            if (this.f28665a != null) {
                int i6 = -1;
                if (java.lang.Math.abs(f6) > java.lang.Math.abs(f10)) {
                    if (f6 > 0.0f) {
                        y6 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f6) * 1000.0f);
                        i6 = 1;
                    } else if (f6 < 0.0f) {
                        y6 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f6) * 1000.0f);
                        i6 = 2;
                    } else {
                        y6 = 0;
                    }
                } else if (f10 > 0.0f) {
                    y6 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f10) * 1000.0f);
                    i6 = 8;
                } else if (f10 < 0.0f) {
                    y6 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f10) * 1000.0f);
                    i6 = 4;
                } else {
                    y6 = 0;
                }
                if (i6 == this.f28665a.J()) {
                    this.f28665a.m(this.f28666b.p6(), y6);
                    return false;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f6, float f10) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return false;
    }
}
