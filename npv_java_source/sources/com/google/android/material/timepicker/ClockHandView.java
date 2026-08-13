package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends android.view.View {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f43866C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43867D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.animation.ValueAnimator f43868E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f43869F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f43870G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f43871H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f43872I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f43873J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f43874K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.List f43875L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f43876M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final float f43877N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final android.graphics.Paint f43878O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.graphics.RectF f43879P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f43880Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f43881R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f43882S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private double f43883T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f43884U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f43885V;

    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f6, boolean z6);
    }

    public ClockHandView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50531y);
    }

    public ClockHandView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43868E = new android.animation.ValueAnimator();
        this.f43875L = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f43878O = paint;
        this.f43879P = new android.graphics.RectF();
        this.f43885V = 1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f51073t1, i6, p125m4.i.f50712s);
        this.f43866C = p245y4.d.f(context, p125m4.a.f50483A, 200);
        this.f43867D = p245y4.d.g(context, p125m4.a.f50490H, p135n4.a.f51491b);
        this.f43884U = typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f51089v1, 0);
        this.f43876M = typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f51097w1, 0);
        android.content.res.Resources resources = getResources();
        this.f43880Q = resources.getDimensionPixelSize(p125m4.c.f50590s);
        this.f43877N = resources.getDimensionPixelSize(p125m4.c.f50588q);
        int color = typedArrayObtainStyledAttributes.getColor(p125m4.j.f51081u1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f43873J = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        androidx.core.view.X.w0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(float f6, float f10) {
        this.f43885V = p235x4.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f6, f10) > ((float) h(2)) + com.google.android.material.internal.n.c(getContext(), 12) ? 1 : 2;
    }

    private void d(android.graphics.Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f43885V);
        float f6 = width;
        float f10 = iH;
        float fCos = (((float) java.lang.Math.cos(this.f43883T)) * f10) + f6;
        float f11 = height;
        float fSin = (f10 * ((float) java.lang.Math.sin(this.f43883T))) + f11;
        this.f43878O.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f43876M, this.f43878O);
        double dSin = java.lang.Math.sin(this.f43883T);
        double dCos = java.lang.Math.cos(this.f43883T);
        double d6 = iH - this.f43876M;
        this.f43878O.setStrokeWidth(this.f43880Q);
        canvas.drawLine(f6, f11, width + ((int) (dCos * d6)), height + ((int) (d6 * dSin)), this.f43878O);
        canvas.drawCircle(f6, f11, this.f43877N, this.f43878O);
    }

    private int f(float f6, float f10) {
        int degrees = (int) java.lang.Math.toDegrees(java.lang.Math.atan2(f10 - (getHeight() / 2), f6 - (getWidth() / 2)));
        int i6 = degrees + 90;
        return i6 < 0 ? degrees + 450 : i6;
    }

    private int h(int i6) {
        return i6 == 2 ? java.lang.Math.round(this.f43884U * 0.66f) : this.f43884U;
    }

    private android.util.Pair j(float f6) {
        float fG = g();
        if (java.lang.Math.abs(fG - f6) > 180.0f) {
            if (fG > 180.0f && f6 < 180.0f) {
                f6 += 360.0f;
            }
            if (fG < 180.0f && f6 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new android.util.Pair(java.lang.Float.valueOf(fG), java.lang.Float.valueOf(f6));
    }

    private boolean k(float f6, float f10, boolean z6, boolean z10, boolean z11) {
        float f11 = f(f6, f10);
        boolean z12 = false;
        boolean z13 = g() != f11;
        if (z10 && z13) {
            return true;
        }
        if (!z13 && !z6) {
            return false;
        }
        if (z11 && this.f43869F) {
            z12 = true;
        }
        o(f11, z12);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(android.animation.ValueAnimator valueAnimator) {
        p(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f6, boolean z6) {
        float f10 = f6 % 360.0f;
        this.f43881R = f10;
        this.f43883T = java.lang.Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f43885V);
        float fCos = width + (((float) java.lang.Math.cos(this.f43883T)) * fH);
        float fSin = height + (fH * ((float) java.lang.Math.sin(this.f43883T)));
        android.graphics.RectF rectF = this.f43879P;
        int i6 = this.f43876M;
        rectF.set(fCos - i6, fSin - i6, fCos + i6, fSin + i6);
        java.util.Iterator it = this.f43875L.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.timepicker.ClockHandView.b) it.next()).a(f10, z6);
        }
        invalidate();
    }

    public void b(com.google.android.material.timepicker.ClockHandView.b bVar) {
        this.f43875L.add(bVar);
    }

    public android.graphics.RectF e() {
        return this.f43879P;
    }

    public float g() {
        return this.f43881R;
    }

    public int i() {
        return this.f43876M;
    }

    public void m(int i6) {
        this.f43884U = i6;
        invalidate();
    }

    public void n(float f6) {
        o(f6, false);
    }

    public void o(float f6, boolean z6) {
        android.animation.ValueAnimator valueAnimator = this.f43868E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z6) {
            p(f6, false);
            return;
        }
        android.util.Pair pairJ = j(f6);
        this.f43868E.setFloatValues(((java.lang.Float) pairJ.first).floatValue(), ((java.lang.Float) pairJ.second).floatValue());
        this.f43868E.setDuration(this.f43866C);
        this.f43868E.setInterpolator(this.f43867D);
        this.f43868E.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                this.f43897a.l(valueAnimator2);
            }
        });
        this.f43868E.addListener(new com.google.android.material.timepicker.ClockHandView.a());
        this.f43868E.start();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        if (this.f43868E.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z6;
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f43870G = x6;
            this.f43871H = y6;
            this.f43872I = true;
            this.f43882S = false;
            z6 = true;
            z10 = false;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i6 = (int) (x6 - this.f43870G);
            int i10 = (int) (y6 - this.f43871H);
            this.f43872I = (i6 * i6) + (i10 * i10) > this.f43873J;
            z10 = this.f43882S;
            boolean z12 = actionMasked == 1;
            if (this.f43874K) {
                c(x6, y6);
            }
            z11 = z12;
            z6 = false;
        } else {
            z10 = false;
            z6 = false;
            z11 = false;
        }
        this.f43882S |= k(x6, y6, z10, z6, z11);
        return true;
    }

    void q(boolean z6) {
        if (this.f43874K && !z6) {
            this.f43885V = 1;
        }
        this.f43874K = z6;
        invalidate();
    }
}
