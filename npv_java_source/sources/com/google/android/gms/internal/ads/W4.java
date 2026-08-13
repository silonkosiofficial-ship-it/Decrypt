package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f32661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32665e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f32671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.lang.String f32672l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private android.text.Layout.Alignment f32675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private android.text.Layout.Alignment f32676p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.gms.internal.ads.P4 f32678r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32666f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32667g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32668h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32669i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32670j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32673m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32674n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32677q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f32679s = Float.MAX_VALUE;

    public final com.google.android.gms.internal.ads.W4 A(float f6) {
        this.f32671k = f6;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 B(int i6) {
        this.f32670j = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 C(java.lang.String str) {
        this.f32672l = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 D(boolean z6) {
        this.f32669i = z6 ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 E(boolean z6) {
        this.f32666f = z6 ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 F(android.text.Layout.Alignment alignment) {
        this.f32676p = alignment;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 G(int i6) {
        this.f32674n = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 H(int i6) {
        this.f32673m = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 I(float f6) {
        this.f32679s = f6;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 J(android.text.Layout.Alignment alignment) {
        this.f32675o = alignment;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 a(boolean z6) {
        this.f32677q = z6 ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 b(com.google.android.gms.internal.ads.P4 p6) {
        this.f32678r = p6;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 c(boolean z6) {
        this.f32667g = z6 ? 1 : 0;
        return this;
    }

    public final java.lang.String d() {
        return this.f32661a;
    }

    public final java.lang.String e() {
        return this.f32672l;
    }

    public final boolean f() {
        return this.f32677q == 1;
    }

    public final boolean g() {
        return this.f32665e;
    }

    public final boolean h() {
        return this.f32663c;
    }

    public final boolean i() {
        return this.f32666f == 1;
    }

    public final boolean j() {
        return this.f32667g == 1;
    }

    public final float k() {
        return this.f32671k;
    }

    public final float l() {
        return this.f32679s;
    }

    public final int m() {
        if (this.f32665e) {
            return this.f32664d;
        }
        throw new java.lang.IllegalStateException("Background color has not been defined.");
    }

    public final int n() {
        if (this.f32663c) {
            return this.f32662b;
        }
        throw new java.lang.IllegalStateException("Font color has not been defined.");
    }

    public final int o() {
        return this.f32670j;
    }

    public final int p() {
        return this.f32674n;
    }

    public final int q() {
        return this.f32673m;
    }

    public final int r() {
        int i6 = this.f32668h;
        if (i6 == -1 && this.f32669i == -1) {
            return -1;
        }
        return (i6 == 1 ? 1 : 0) | (this.f32669i == 1 ? 2 : 0);
    }

    public final android.text.Layout.Alignment s() {
        return this.f32676p;
    }

    public final android.text.Layout.Alignment t() {
        return this.f32675o;
    }

    public final com.google.android.gms.internal.ads.P4 u() {
        return this.f32678r;
    }

    public final com.google.android.gms.internal.ads.W4 v(com.google.android.gms.internal.ads.W4 w6) {
        int i6;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        java.lang.String str;
        if (w6 != null) {
            if (!this.f32663c && w6.f32663c) {
                y(w6.f32662b);
            }
            if (this.f32668h == -1) {
                this.f32668h = w6.f32668h;
            }
            if (this.f32669i == -1) {
                this.f32669i = w6.f32669i;
            }
            if (this.f32661a == null && (str = w6.f32661a) != null) {
                this.f32661a = str;
            }
            if (this.f32666f == -1) {
                this.f32666f = w6.f32666f;
            }
            if (this.f32667g == -1) {
                this.f32667g = w6.f32667g;
            }
            if (this.f32674n == -1) {
                this.f32674n = w6.f32674n;
            }
            if (this.f32675o == null && (alignment2 = w6.f32675o) != null) {
                this.f32675o = alignment2;
            }
            if (this.f32676p == null && (alignment = w6.f32676p) != null) {
                this.f32676p = alignment;
            }
            if (this.f32677q == -1) {
                this.f32677q = w6.f32677q;
            }
            if (this.f32670j == -1) {
                this.f32670j = w6.f32670j;
                this.f32671k = w6.f32671k;
            }
            if (this.f32678r == null) {
                this.f32678r = w6.f32678r;
            }
            if (this.f32679s == Float.MAX_VALUE) {
                this.f32679s = w6.f32679s;
            }
            if (!this.f32665e && w6.f32665e) {
                w(w6.f32664d);
            }
            if (this.f32673m == -1 && (i6 = w6.f32673m) != -1) {
                this.f32673m = i6;
            }
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 w(int i6) {
        this.f32664d = i6;
        this.f32665e = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 x(boolean z6) {
        this.f32668h = z6 ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 y(int i6) {
        this.f32662b = i6;
        this.f32663c = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.W4 z(java.lang.String str) {
        this.f32661a = str;
        return this;
    }
}
