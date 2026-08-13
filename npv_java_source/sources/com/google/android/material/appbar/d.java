package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
abstract class d extends com.google.android.material.appbar.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Runnable f42818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    android.widget.OverScroller f42819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.view.VelocityTracker f42824j;

    private class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final androidx.coordinatorlayout.widget.CoordinatorLayout f42825C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final android.view.View f42826D;

        a(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            this.f42825C = coordinatorLayout;
            this.f42826D = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.widget.OverScroller overScroller;
            if (this.f42826D == null || (overScroller = com.google.android.material.appbar.d.this.f42819e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                com.google.android.material.appbar.d.this.N(this.f42825C, this.f42826D);
                return;
            }
            com.google.android.material.appbar.d dVar = com.google.android.material.appbar.d.this;
            dVar.P(this.f42825C, this.f42826D, dVar.f42819e.getCurrY());
            androidx.core.view.X.f0(this.f42826D, this);
        }
    }

    public d() {
        this.f42821g = -1;
        this.f42823i = -1;
    }

    public d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42821g = -1;
        this.f42823i = -1;
    }

    private void I() {
        if (this.f42824j == null) {
            this.f42824j = android.view.VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z6;
        android.view.VelocityTracker velocityTracker;
        android.view.VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            android.view.VelocityTracker velocityTracker3 = this.f42824j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f42824j.computeCurrentVelocity(1000);
                J(coordinatorLayout, view, -L(view), 0, this.f42824j.getYVelocity(this.f42821g));
                z6 = true;
            }
            this.f42820f = false;
            this.f42821g = -1;
            velocityTracker = this.f42824j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f42824j = null;
            }
            velocityTracker2 = this.f42824j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f42820f) {
                return true;
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f42821g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            int i6 = this.f42822h - y6;
            this.f42822h = y6;
            O(coordinatorLayout, view, i6, K(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f42821g = motionEvent.getPointerId(i10);
                this.f42822h = (int) (motionEvent.getY(i10) + 0.5f);
            }
        }
        z6 = false;
        velocityTracker2 = this.f42824j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f42820f || z6;
        z6 = false;
        this.f42820f = false;
        this.f42821g = -1;
        velocityTracker = this.f42824j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42824j = null;
        }
        velocityTracker2 = this.f42824j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f42820f) {
            return true;
        }
    }

    abstract boolean H(android.view.View view);

    final boolean J(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, float f6) {
        java.lang.Runnable runnable = this.f42818d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f42818d = null;
        }
        if (this.f42819e == null) {
            this.f42819e = new android.widget.OverScroller(view.getContext());
        }
        this.f42819e.fling(0, E(), 0, java.lang.Math.round(f6), 0, 0, i6, i10);
        if (!this.f42819e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        com.google.android.material.appbar.d.a aVar = new com.google.android.material.appbar.d.a(coordinatorLayout, view);
        this.f42818d = aVar;
        androidx.core.view.X.f0(view, aVar);
        return true;
    }

    abstract int K(android.view.View view);

    abstract int L(android.view.View view);

    abstract int M();

    abstract void N(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view);

    final int O(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11) {
        return Q(coordinatorLayout, view, M() - i6, i10, i11);
    }

    int P(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        return Q(coordinatorLayout, view, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f42823i < 0) {
            this.f42823i = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f42820f) {
            int i6 = this.f42821g;
            if (i6 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return false;
            }
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            if (java.lang.Math.abs(y6 - this.f42822h) > this.f42823i) {
                this.f42822h = y6;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f42821g = -1;
            int x6 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            boolean z6 = H(view) && coordinatorLayout.B(view, x6, y10);
            this.f42820f = z6;
            if (z6) {
                this.f42822h = y10;
                this.f42821g = motionEvent.getPointerId(0);
                I();
                android.widget.OverScroller overScroller = this.f42819e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f42819e.abortAnimation();
                    return true;
                }
            }
        }
        android.view.VelocityTracker velocityTracker = this.f42824j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
