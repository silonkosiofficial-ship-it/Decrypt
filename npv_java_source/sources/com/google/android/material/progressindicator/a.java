package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends android.widget.ProgressBar {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    static final int f43472Q = p125m4.i.f50711r;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    com.google.android.material.progressindicator.b f43473C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f43474D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f43475E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f43476F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f43477G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f43478H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f43479I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    p255z4.a f43480J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f43481K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f43482L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final java.lang.Runnable f43483M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.lang.Runnable f43484N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f43485O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f43486P;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    class RunnableC0477a implements java.lang.Runnable {
        RunnableC0477a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.material.progressindicator.a.this.k();
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.material.progressindicator.a.this.j();
            com.google.android.material.progressindicator.a.this.f43479I = -1L;
        }
    }

    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(android.graphics.drawable.Drawable drawable) {
            com.google.android.material.progressindicator.a.this.setIndeterminate(false);
            com.google.android.material.progressindicator.a aVar = com.google.android.material.progressindicator.a.this;
            aVar.o(aVar.f43474D, com.google.android.material.progressindicator.a.this.f43475E);
        }
    }

    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(android.graphics.drawable.Drawable drawable) {
            super.b(drawable);
            if (com.google.android.material.progressindicator.a.this.f43481K) {
                return;
            }
            com.google.android.material.progressindicator.a aVar = com.google.android.material.progressindicator.a.this;
            aVar.setVisibility(aVar.f43482L);
        }
    }

    protected a(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        super(H4.a.c(context, attributeSet, i6, f43472Q), attributeSet, i6);
        this.f43479I = -1L;
        this.f43481K = false;
        this.f43482L = 4;
        this.f43483M = new com.google.android.material.progressindicator.a.RunnableC0477a();
        this.f43484N = new com.google.android.material.progressindicator.a.b();
        this.f43485O = new com.google.android.material.progressindicator.a.c();
        this.f43486P = new com.google.android.material.progressindicator.a.d();
        android.content.Context context2 = getContext();
        this.f43473C = i(context2, attributeSet);
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f50760G, i6, i10, new int[0]);
        this.f43477G = typedArrayI.getInt(p125m4.j.f50808M, -1);
        this.f43478H = java.lang.Math.min(typedArrayI.getInt(p125m4.j.f50792K, -1), 1000);
        typedArrayI.recycle();
        this.f43480J = new p255z4.a();
        this.f43476F = true;
    }

    private com.google.android.material.progressindicator.h getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((com.google.android.material.progressindicator.g) getCurrentDrawable()).q(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f43478H > 0) {
            this.f43479I = android.os.SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.f43485O);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m(this.f43486P);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m(this.f43486P);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().s(this.f43486P);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().s(this.f43486P);
        }
    }

    @Override // android.widget.ProgressBar
    public android.graphics.drawable.Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f43473C.f43496f;
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.j getIndeterminateDrawable() {
        return (com.google.android.material.progressindicator.j) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f43473C.f43493c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f43473C.f43497g;
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.f getProgressDrawable() {
        return (com.google.android.material.progressindicator.f) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f43473C.f43495e;
    }

    public int getTrackColor() {
        return this.f43473C.f43494d;
    }

    public int getTrackCornerRadius() {
        return this.f43473C.f43492b;
    }

    public int getTrackThickness() {
        return this.f43473C.f43491a;
    }

    protected void h(boolean z6) {
        if (this.f43476F) {
            ((com.google.android.material.progressindicator.g) getCurrentDrawable()).q(q(), false, z6);
        }
    }

    abstract com.google.android.material.progressindicator.b i(android.content.Context context, android.util.AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        android.view.View view = this;
        while (view.getVisibility() == 0) {
            java.lang.Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof android.view.View)) {
                return true;
            }
            view = (android.view.View) parent;
        }
        return false;
    }

    public void o(int i6, boolean z6) {
        if (!isIndeterminate()) {
            super.setProgress(i6);
            if (getProgressDrawable() == null || z6) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f43474D = i6;
            this.f43475E = z6;
            this.f43481K = true;
            if (!getIndeterminateDrawable().isVisible() || this.f43480J.a(getContext().getContentResolver()) == 0.0f) {
                this.f43485O.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().u().f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f43484N);
        removeCallbacks(this.f43483M);
        ((com.google.android.material.progressindicator.g) getCurrentDrawable()).i();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i6, int i10) {
        try {
            com.google.android.material.progressindicator.h currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? android.view.View.getDefaultSize(getSuggestedMinimumWidth(), i6) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? android.view.View.getDefaultSize(getSuggestedMinimumHeight(), i10) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i6) {
        super.onVisibilityChanged(view, i6);
        h(i6 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        h(false);
    }

    boolean q() {
        return androidx.core.view.X.Q(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(p255z4.a aVar) {
        this.f43480J = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f43530E = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f43530E = aVar;
        }
    }

    public void setHideAnimationBehavior(int i6) {
        this.f43473C.f43496f = i6;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z6) {
        try {
            if (z6 == isIndeterminate()) {
                return;
            }
            com.google.android.material.progressindicator.g gVar = (com.google.android.material.progressindicator.g) getCurrentDrawable();
            if (gVar != null) {
                gVar.i();
            }
            super.setIndeterminate(z6);
            com.google.android.material.progressindicator.g gVar2 = (com.google.android.material.progressindicator.g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.q(q(), false, false);
            }
            if ((gVar2 instanceof com.google.android.material.progressindicator.j) && q()) {
                ((com.google.android.material.progressindicator.j) gVar2).u().g();
            }
            this.f43481K = false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof com.google.android.material.progressindicator.j)) {
                throw new java.lang.IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((com.google.android.material.progressindicator.g) drawable).i();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{p195t4.a.b(getContext(), p125m4.a.f50518l, -1)};
        }
        if (java.util.Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f43473C.f43493c = iArr;
        getIndeterminateDrawable().u().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i6) {
        com.google.android.material.progressindicator.b bVar = this.f43473C;
        if (bVar.f43497g != i6) {
            bVar.f43497g = i6;
            bVar.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i6) {
        if (isIndeterminate()) {
            return;
        }
        o(i6, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof com.google.android.material.progressindicator.f)) {
                throw new java.lang.IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            com.google.android.material.progressindicator.f fVar = (com.google.android.material.progressindicator.f) drawable;
            fVar.i();
            super.setProgressDrawable(fVar);
            fVar.A(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i6) {
        this.f43473C.f43495e = i6;
        invalidate();
    }

    public void setTrackColor(int i6) {
        com.google.android.material.progressindicator.b bVar = this.f43473C;
        if (bVar.f43494d != i6) {
            bVar.f43494d = i6;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i6) {
        com.google.android.material.progressindicator.b bVar = this.f43473C;
        if (bVar.f43492b != i6) {
            bVar.f43492b = java.lang.Math.min(i6, bVar.f43491a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i6) {
        com.google.android.material.progressindicator.b bVar = this.f43473C;
        if (bVar.f43491a != i6) {
            bVar.f43491a = i6;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i6) {
        if (i6 != 0 && i6 != 4 && i6 != 8) {
            throw new java.lang.IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f43482L = i6;
    }
}
