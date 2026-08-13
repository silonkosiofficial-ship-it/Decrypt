package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class F4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27282a = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f27283b = new int[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27290i;

    static /* bridge */ /* synthetic */ void b(com.google.android.gms.internal.ads.F4 f6, com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        int iE;
        if (i6 < 4) {
            return;
        }
        c5128sR.m(3);
        int i10 = i6 - 4;
        if ((c5128sR.C() & 128) != 0) {
            if (i10 < 7 || (iE = c5128sR.E()) < 4) {
                return;
            }
            f6.f27289h = c5128sR.G();
            f6.f27290i = c5128sR.G();
            f6.f27282a.i(iE - 4);
            i10 = i6 - 11;
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR2 = f6.f27282a;
        int iT = c5128sR2.t();
        int iU = c5128sR2.u();
        if (iT >= iU || i10 <= 0) {
            return;
        }
        int iMin = java.lang.Math.min(i10, iU - iT);
        c5128sR.h(c5128sR2.n(), iT, iMin);
        f6.f27282a.l(iT + iMin);
    }

    static /* bridge */ /* synthetic */ void c(com.google.android.gms.internal.ads.F4 f6, com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        if (i6 < 19) {
            return;
        }
        f6.f27285d = c5128sR.G();
        f6.f27286e = c5128sR.G();
        c5128sR.m(11);
        f6.f27287f = c5128sR.G();
        f6.f27288g = c5128sR.G();
    }

    static /* bridge */ /* synthetic */ void d(com.google.android.gms.internal.ads.F4 f6, com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        if (i6 % 5 != 2) {
            return;
        }
        c5128sR.m(2);
        int i10 = 0;
        java.util.Arrays.fill(f6.f27283b, 0);
        int i11 = i6 / 5;
        int i12 = 0;
        while (i12 < i11) {
            int iC = c5128sR.C();
            int iC2 = c5128sR.C();
            int iC3 = c5128sR.C();
            int iC4 = c5128sR.C();
            int iC5 = c5128sR.C();
            double d6 = iC2;
            int[] iArr = f6.f27283b;
            double d10 = iC3 - 128;
            int iMax = java.lang.Math.max(i10, java.lang.Math.min((int) ((1.402d * d10) + d6), 255)) << 16;
            double d11 = iC4 - 128;
            iArr[iC] = java.lang.Math.max(0, java.lang.Math.min((int) (d6 + (d11 * 1.772d)), 255)) | (iC5 << 24) | iMax | (java.lang.Math.max(0, java.lang.Math.min((int) ((d6 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)) << 8);
            i12++;
            i10 = 0;
        }
        f6.f27284c = true;
    }

    public final com.google.android.gms.internal.ads.C2297Dy a() {
        int i6;
        if (this.f27285d == 0 || this.f27286e == 0 || this.f27289h == 0 || this.f27290i == 0) {
            return null;
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f27282a;
        if (c5128sR.u() == 0 || c5128sR.t() != c5128sR.u() || !this.f27284c) {
            return null;
        }
        c5128sR.l(0);
        int i10 = this.f27289h * this.f27290i;
        int[] iArr = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            int iC = this.f27282a.C();
            if (iC != 0) {
                i6 = i11 + 1;
                iArr[i11] = this.f27283b[iC];
            } else {
                int iC2 = this.f27282a.C();
                if (iC2 != 0) {
                    int iC3 = iC2 & 63;
                    if ((iC2 & 64) != 0) {
                        iC3 = (iC3 << 8) | this.f27282a.C();
                    }
                    i6 = iC3 + i11;
                    java.util.Arrays.fill(iArr, i11, i6, (iC2 & 128) == 0 ? this.f27283b[0] : this.f27283b[this.f27282a.C()]);
                }
            }
            i11 = i6;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr, this.f27289h, this.f27290i, android.graphics.Bitmap.Config.ARGB_8888);
        com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
        c2185Ax.c(bitmapCreateBitmap);
        c2185Ax.h(this.f27287f / this.f27285d);
        c2185Ax.i(0);
        c2185Ax.e(this.f27288g / this.f27286e, 0);
        c2185Ax.f(0);
        c2185Ax.k(this.f27289h / this.f27285d);
        c2185Ax.d(this.f27290i / this.f27286e);
        return c2185Ax.p();
    }

    public final void e() {
        this.f27285d = 0;
        this.f27286e = 0;
        this.f27287f = 0;
        this.f27288g = 0;
        this.f27289h = 0;
        this.f27290i = 0;
        this.f27282a.i(0);
        this.f27284c = false;
    }
}
