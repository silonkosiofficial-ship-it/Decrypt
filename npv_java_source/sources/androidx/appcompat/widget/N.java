package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class N implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f18150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f18151D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f18152E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final android.view.View f18153F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.Runnable f18154G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.lang.Runnable f18155H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f18156I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f18157J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int[] f18158K = new int[2];

    private class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewParent parent = androidx.appcompat.widget.N.this.f18153F.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.N.this.f();
        }
    }

    public N(android.view.View view) {
        this.f18153F = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f18150C = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.f18151D = tapTimeout;
        this.f18152E = (tapTimeout + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        java.lang.Runnable runnable = this.f18155H;
        if (runnable != null) {
            this.f18153F.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f18154G;
        if (runnable2 != null) {
            this.f18153F.removeCallbacks(runnable2);
        }
    }

    private boolean i(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.L l6;
        android.view.View view = this.f18153F;
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.a() || (l6 = (androidx.appcompat.widget.L) pVarB.j()) == null || !l6.isShown()) {
            return false;
        }
        android.view.MotionEvent motionEventObtainNoHistory = android.view.MotionEvent.obtainNoHistory(motionEvent);
        s(view, motionEventObtainNoHistory);
        t(l6, motionEventObtainNoHistory);
        boolean zE = l6.e(motionEventObtainNoHistory, this.f18157J);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean o(android.view.MotionEvent motionEvent) {
        android.view.View view = this.f18153F;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f18157J = motionEvent.getPointerId(0);
            if (this.f18154G == null) {
                this.f18154G = new androidx.appcompat.widget.N.a();
            }
            view.postDelayed(this.f18154G, this.f18151D);
            if (this.f18155H == null) {
                this.f18155H = new androidx.appcompat.widget.N.b();
            }
            view.postDelayed(this.f18155H, this.f18152E);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f18157J);
            if (iFindPointerIndex >= 0 && !r(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f18150C)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean r(android.view.View view, float f6, float f10, float f11) {
        float f12 = -f11;
        return f6 >= f12 && f10 >= f12 && f6 < ((float) (view.getRight() - view.getLeft())) + f11 && f10 < ((float) (view.getBottom() - view.getTop())) + f11;
    }

    private boolean s(android.view.View view, android.view.MotionEvent motionEvent) {
        int[] iArr = this.f18158K;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean t(android.view.View view, android.view.MotionEvent motionEvent) {
        int[] iArr = this.f18158K;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.a()) {
            return true;
        }
        pVarB.dismiss();
        return true;
    }

    void f() {
        a();
        android.view.View view = this.f18153F;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f18156I = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z6;
        boolean z10 = this.f18156I;
        if (z10) {
            z6 = i(motionEvent) || !d();
        } else {
            z6 = o(motionEvent) && c();
            if (z6) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f18153F.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f18156I = z6;
        return z6 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f18156I = false;
        this.f18157J = -1;
        java.lang.Runnable runnable = this.f18154G;
        if (runnable != null) {
            this.f18153F.removeCallbacks(runnable);
        }
    }
}
