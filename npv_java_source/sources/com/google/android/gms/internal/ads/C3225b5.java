package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3225b5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34211f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34213h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f34219n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f34206a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f34207b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Set f34208c = java.util.Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f34209d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f34210e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34212g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34214i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34215j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34216k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34217l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34218m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34220o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34221p = false;

    private static int a(int i6, java.lang.String str, java.lang.String str2, int i10) {
        if (str.isEmpty() || i6 == -1) {
            return i6;
        }
        if (str.equals(str2)) {
            return i6 + i10;
        }
        return -1;
    }

    public final boolean A() {
        return this.f34215j == 1;
    }

    public final float b() {
        return this.f34219n;
    }

    public final int c() {
        if (this.f34214i) {
            return this.f34213h;
        }
        throw new java.lang.IllegalStateException("Background color not defined.");
    }

    public final int d() {
        if (this.f34212g) {
            return this.f34211f;
        }
        throw new java.lang.IllegalStateException("Font color not defined");
    }

    public final int e() {
        return this.f34218m;
    }

    public final int f() {
        return this.f34220o;
    }

    public final int g(java.lang.String str, java.lang.String str2, java.util.Set set, java.lang.String str3) {
        if (this.f34206a.isEmpty() && this.f34207b.isEmpty() && this.f34208c.isEmpty() && this.f34209d.isEmpty()) {
            return android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f34206a, str, 1073741824), this.f34207b, str2, 2), this.f34209d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f34208c)) {
            return 0;
        }
        return iA + (this.f34208c.size() * 4);
    }

    public final int h() {
        int i6 = this.f34216k;
        if (i6 == -1 && this.f34217l == -1) {
            return -1;
        }
        return (i6 == 1 ? 1 : 0) | (this.f34217l == 1 ? 2 : 0);
    }

    public final com.google.android.gms.internal.ads.C3225b5 i(int i6) {
        this.f34213h = i6;
        this.f34214i = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 j(boolean z6) {
        this.f34216k = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 k(boolean z6) {
        this.f34221p = z6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 l(int i6) {
        this.f34211f = i6;
        this.f34212g = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 m(java.lang.String str) {
        this.f34210e = com.google.android.gms.internal.ads.AbstractC3723fg0.a(str);
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 n(float f6) {
        this.f34219n = f6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 o(int i6) {
        this.f34218m = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 p(boolean z6) {
        this.f34217l = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 q(int i6) {
        this.f34220o = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3225b5 r(boolean z6) {
        this.f34215j = 1;
        return this;
    }

    public final java.lang.String s() {
        return this.f34210e;
    }

    public final void t(java.lang.String[] strArr) {
        this.f34208c = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public final void u(java.lang.String str) {
        this.f34206a = str;
    }

    public final void v(java.lang.String str) {
        this.f34207b = str;
    }

    public final void w(java.lang.String str) {
        this.f34209d = str;
    }

    public final boolean x() {
        return this.f34221p;
    }

    public final boolean y() {
        return this.f34214i;
    }

    public final boolean z() {
        return this.f34212g;
    }
}
