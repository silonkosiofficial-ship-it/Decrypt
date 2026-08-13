package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends com.google.android.material.timepicker.e implements com.google.android.material.timepicker.ClockHandView.b {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final com.google.android.material.timepicker.ClockHandView f43849f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final android.graphics.Rect f43850g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final android.graphics.RectF f43851h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final android.graphics.Rect f43852i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final android.util.SparseArray f43853j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final androidx.core.view.C1990a f43854k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final int[] f43855l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final float[] f43856m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final int f43857n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final int f43858o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f43859p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final int f43860q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private java.lang.String[] f43861r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f43862s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final android.content.res.ColorStateList f43863t0;

    class a implements android.view.ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!com.google.android.material.timepicker.ClockFaceView.this.isShown()) {
                return true;
            }
            com.google.android.material.timepicker.ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            com.google.android.material.timepicker.ClockFaceView.this.x(((com.google.android.material.timepicker.ClockFaceView.this.getHeight() / 2) - com.google.android.material.timepicker.ClockFaceView.this.f43849f0.i()) - com.google.android.material.timepicker.ClockFaceView.this.f43857n0);
            return true;
        }
    }

    class b extends androidx.core.view.C1990a {
        b() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            int iIntValue = ((java.lang.Integer) view.getTag(p125m4.e.f50640p)).intValue();
            if (iIntValue > 0) {
                b6.U0((android.view.View) com.google.android.material.timepicker.ClockFaceView.this.f43853j0.get(iIntValue - 1));
            }
            b6.p0(C1.B.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            b6.n0(true);
            b6.b(C1.B.a.f1243i);
        }

        @Override // androidx.core.view.C1990a
        public boolean j(android.view.View view, int i6, android.os.Bundle bundle) {
            if (i6 != 16) {
                return super.j(view, i6, bundle);
            }
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            view.getHitRect(com.google.android.material.timepicker.ClockFaceView.this.f43850g0);
            float fCenterX = com.google.android.material.timepicker.ClockFaceView.this.f43850g0.centerX();
            float fCenterY = com.google.android.material.timepicker.ClockFaceView.this.f43850g0.centerY();
            com.google.android.material.timepicker.ClockFaceView.this.f43849f0.onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            com.google.android.material.timepicker.ClockFaceView.this.f43849f0.onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50531y);
    }

    public ClockFaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43850g0 = new android.graphics.Rect();
        this.f43851h0 = new android.graphics.RectF();
        this.f43852i0 = new android.graphics.Rect();
        this.f43853j0 = new android.util.SparseArray();
        this.f43856m0 = new float[]{0.0f, 0.9f, 1.0f};
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f51049q1, i6, p125m4.i.f50712s);
        android.content.res.Resources resources = getResources();
        android.content.res.ColorStateList colorStateListA = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f51065s1);
        this.f43863t0 = colorStateListA;
        android.view.LayoutInflater.from(context).inflate(p125m4.g.f50657e, (android.view.ViewGroup) this, true);
        com.google.android.material.timepicker.ClockHandView clockHandView = (com.google.android.material.timepicker.ClockHandView) findViewById(p125m4.e.f50634j);
        this.f43849f0 = clockHandView;
        this.f43857n0 = resources.getDimensionPixelSize(p125m4.c.f50589r);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f43855l0 = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = p100k.a.a(context, p125m4.b.f50534b).getDefaultColor();
        android.content.res.ColorStateList colorStateListA2 = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f51057r1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new com.google.android.material.timepicker.ClockFaceView.a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f43854k0 = new com.google.android.material.timepicker.ClockFaceView.b();
        java.lang.String[] strArr = new java.lang.String[12];
        java.util.Arrays.fill(strArr, "");
        J(strArr, 0);
        this.f43858o0 = resources.getDimensionPixelSize(p125m4.c.f50543E);
        this.f43859p0 = resources.getDimensionPixelSize(p125m4.c.f50544F);
        this.f43860q0 = resources.getDimensionPixelSize(p125m4.c.f50591t);
    }

    private void F() {
        android.graphics.RectF rectFE = this.f43849f0.e();
        android.widget.TextView textViewH = H(rectFE);
        for (int i6 = 0; i6 < this.f43853j0.size(); i6++) {
            android.widget.TextView textView = (android.widget.TextView) this.f43853j0.get(i6);
            if (textView != null) {
                textView.setSelected(textView == textViewH);
                textView.getPaint().setShader(G(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private android.graphics.RadialGradient G(android.graphics.RectF rectF, android.widget.TextView textView) {
        textView.getHitRect(this.f43850g0);
        this.f43851h0.set(this.f43850g0);
        textView.getLineBounds(0, this.f43852i0);
        android.graphics.RectF rectF2 = this.f43851h0;
        android.graphics.Rect rect = this.f43852i0;
        rectF2.inset(rect.left, rect.top);
        if (android.graphics.RectF.intersects(rectF, this.f43851h0)) {
            return new android.graphics.RadialGradient(rectF.centerX() - this.f43851h0.left, rectF.centerY() - this.f43851h0.top, rectF.width() * 0.5f, this.f43855l0, this.f43856m0, android.graphics.Shader.TileMode.CLAMP);
        }
        return null;
    }

    private android.widget.TextView H(android.graphics.RectF rectF) {
        float f6 = Float.MAX_VALUE;
        android.widget.TextView textView = null;
        for (int i6 = 0; i6 < this.f43853j0.size(); i6++) {
            android.widget.TextView textView2 = (android.widget.TextView) this.f43853j0.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(this.f43850g0);
                this.f43851h0.set(this.f43850g0);
                this.f43851h0.union(rectF);
                float fWidth = this.f43851h0.width() * this.f43851h0.height();
                if (fWidth < f6) {
                    textView = textView2;
                    f6 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float I(float f6, float f10, float f11) {
        return java.lang.Math.max(java.lang.Math.max(f6, f10), f11);
    }

    private void K(int i6) {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        int size = this.f43853j0.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < java.lang.Math.max(this.f43861r0.length, size); i10++) {
            android.widget.TextView textView = (android.widget.TextView) this.f43853j0.get(i10);
            if (i10 >= this.f43861r0.length) {
                removeView(textView);
                this.f43853j0.remove(i10);
            } else {
                if (textView == null) {
                    textView = (android.widget.TextView) layoutInflaterFrom.inflate(p125m4.g.f50656d, (android.view.ViewGroup) this, false);
                    this.f43853j0.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f43861r0[i10]);
                textView.setTag(p125m4.e.f50640p, java.lang.Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(p125m4.e.f50635k, java.lang.Integer.valueOf(i11));
                if (i11 > 1) {
                    z6 = true;
                }
                androidx.core.view.X.n0(textView, this.f43854k0);
                textView.setTextColor(this.f43863t0);
                if (i6 != 0) {
                    textView.setContentDescription(getResources().getString(i6, this.f43861r0[i10]));
                }
            }
        }
        this.f43849f0.q(z6);
    }

    public void J(java.lang.String[] strArr, int i6) {
        this.f43861r0 = strArr;
        K(i6);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f6, boolean z6) {
        if (java.lang.Math.abs(this.f43862s0 - f6) > 0.001f) {
            this.f43862s0 = f6;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1.B.b1(accessibilityNodeInfo).o0(C1.B.e.a(1, this.f43861r0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I10 = (int) (this.f43860q0 / I(this.f43858o0 / displayMetrics.heightPixels, this.f43859p0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(I10, 1073741824);
        setMeasuredDimension(I10, I10);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.e
    public void x(int i6) {
        if (i6 != w()) {
            super.x(i6);
            this.f43849f0.m(w());
        }
    }

    @Override // com.google.android.material.timepicker.e
    protected void z() {
        super.z();
        for (int i6 = 0; i6 < this.f43853j0.size(); i6++) {
            ((android.widget.TextView) this.f43853j0.get(i6)).setVisibility(0);
        }
    }
}
