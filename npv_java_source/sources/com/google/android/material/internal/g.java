package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f43438n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.CharSequence f43439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.text.TextPaint f43440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43441c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43443e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f43450l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43442d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.text.Layout.Alignment f43444f = android.text.Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43445g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43446h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43447i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43448j = f43438n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f43449k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.text.TextUtils.TruncateAt f43451m = null;

    static class a extends java.lang.Exception {
    }

    private g(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i6) {
        this.f43439a = charSequence;
        this.f43440b = textPaint;
        this.f43441c = i6;
        this.f43443e = charSequence.length();
    }

    public static com.google.android.material.internal.g b(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i6) {
        return new com.google.android.material.internal.g(charSequence, textPaint, i6);
    }

    public android.text.StaticLayout a() {
        if (this.f43439a == null) {
            this.f43439a = "";
        }
        int iMax = java.lang.Math.max(0, this.f43441c);
        java.lang.CharSequence charSequenceEllipsize = this.f43439a;
        if (this.f43445g == 1) {
            charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceEllipsize, this.f43440b, iMax, this.f43451m);
        }
        int iMin = java.lang.Math.min(charSequenceEllipsize.length(), this.f43443e);
        this.f43443e = iMin;
        if (this.f43450l && this.f43445g == 1) {
            this.f43444f = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(charSequenceEllipsize, this.f43442d, iMin, this.f43440b, iMax);
        builderObtain.setAlignment(this.f43444f);
        builderObtain.setIncludePad(this.f43449k);
        builderObtain.setTextDirection(this.f43450l ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR);
        android.text.TextUtils.TruncateAt truncateAt = this.f43451m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f43445g);
        float f6 = this.f43446h;
        if (f6 != 0.0f || this.f43447i != 1.0f) {
            builderObtain.setLineSpacing(f6, this.f43447i);
        }
        if (this.f43445g > 1) {
            builderObtain.setHyphenationFrequency(this.f43448j);
        }
        return builderObtain.build();
    }

    public com.google.android.material.internal.g c(android.text.Layout.Alignment alignment) {
        this.f43444f = alignment;
        return this;
    }

    public com.google.android.material.internal.g d(android.text.TextUtils.TruncateAt truncateAt) {
        this.f43451m = truncateAt;
        return this;
    }

    public com.google.android.material.internal.g e(int i6) {
        this.f43448j = i6;
        return this;
    }

    public com.google.android.material.internal.g f(boolean z6) {
        this.f43449k = z6;
        return this;
    }

    public com.google.android.material.internal.g g(boolean z6) {
        this.f43450l = z6;
        return this;
    }

    public com.google.android.material.internal.g h(float f6, float f10) {
        this.f43446h = f6;
        this.f43447i = f10;
        return this;
    }

    public com.google.android.material.internal.g i(int i6) {
        this.f43445g = i6;
        return this;
    }

    public com.google.android.material.internal.g j(com.google.android.material.internal.h hVar) {
        return this;
    }
}
