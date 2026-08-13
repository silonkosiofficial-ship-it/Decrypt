package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class FB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AB0 f27318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27320c = false;

    public FB0(com.google.android.gms.internal.ads.AB0 ab0, int i6) {
        this.f27318a = ab0;
        this.f27319b = i6;
    }

    private static boolean A(com.google.android.gms.internal.ads.AB0 ab0) {
        return ab0.f() != 0;
    }

    private static final void a(com.google.android.gms.internal.ads.AB0 ab0) {
        if (ab0.f() == 2) {
            ab0.d0();
        }
    }

    public final int b() {
        return A(this.f27318a) ? 1 : 0;
    }

    public final int c() {
        return this.f27318a.b();
    }

    public final long d(com.google.android.gms.internal.ads.C3238bB0 c3238bB0) {
        com.google.android.gms.internal.ads.LC.f(z(c3238bB0));
        return this.f27318a.v();
    }

    public final void e(com.google.android.gms.internal.ads.Pz0 pz0) {
        com.google.android.gms.internal.ads.AB0 ab0 = this.f27318a;
        if (A(ab0)) {
            pz0.d(ab0);
            a(ab0);
            ab0.t();
        }
    }

    public final void f(com.google.android.gms.internal.ads.EB0 eb0, com.google.android.gms.internal.ads.D[] dArr, com.google.android.gms.internal.ads.EI0 ei0, long j6, boolean z6, boolean z10, long j10, long j11, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.Pz0 pz0) throws com.google.android.gms.internal.ads.Qz0 {
        this.f27320c = true;
        this.f27318a.i(eb0, dArr, ei0, j6, z6, z10, j10, j11, lh0);
        pz0.e(this.f27318a);
    }

    public final void g() {
        if (A(this.f27318a)) {
            this.f27318a.w();
        }
    }

    public final void h(int i6, java.lang.Object obj) {
        this.f27318a.x(11, obj);
    }

    public final void i() {
        this.f27318a.z();
    }

    public final void j() {
        this.f27318a.i0();
        this.f27320c = false;
    }

    public final void k(long j6, long j10) {
        if (A(this.f27318a)) {
            this.f27318a.k(j6, j10);
        }
    }

    public final void l(com.google.android.gms.internal.ads.D[] dArr, com.google.android.gms.internal.ads.EI0 ei0, long j6, long j10, com.google.android.gms.internal.ads.LH0 lh0) {
        this.f27318a.p(dArr, ei0, j6, j10, lh0);
    }

    public final void m() {
        if (this.f27320c) {
            this.f27318a.H();
            this.f27320c = false;
        }
    }

    public final void n(long j6) {
        if (A(this.f27318a)) {
            this.f27318a.n(j6);
        }
    }

    public final void o(long j6) {
        this.f27318a.b0();
    }

    public final void p(float f6, float f10) {
        this.f27318a.u(f6, f10);
    }

    public final void q(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        this.f27318a.e(abstractC4942qm);
    }

    public final void r(java.lang.Object obj) {
        if (this.f27318a.b() == 2) {
            this.f27318a.x(1, obj);
        }
    }

    public final void s() {
        if (this.f27318a.f() == 1) {
            this.f27318a.I();
        }
    }

    public final void t() {
        if (A(this.f27318a)) {
            a(this.f27318a);
        }
    }

    public final boolean u(com.google.android.gms.internal.ads.C3238bB0 c3238bB0) {
        com.google.android.gms.internal.ads.EI0 ei0 = c3238bB0.f34239c[this.f27319b];
        com.google.android.gms.internal.ads.AB0 ab0 = this.f27318a;
        boolean z6 = ei0 != ab0.q();
        return z6 || (!z6 && ab0.g0()) || ab0.X() || ab0.g();
    }

    public final boolean v(com.google.android.gms.internal.ads.C3238bB0 c3238bB0) {
        com.google.android.gms.internal.ads.EI0 ei0 = c3238bB0.f34239c[this.f27319b];
        if (this.f27318a.q() != ei0) {
            return false;
        }
        if (ei0 == null || this.f27318a.g0()) {
            return true;
        }
        c3238bB0.g();
        boolean z6 = c3238bB0.f34243g.f34467f;
        return false;
    }

    public final boolean w() {
        return this.f27318a.g0();
    }

    public final boolean x() {
        return this.f27318a.h0();
    }

    public final boolean y() {
        return this.f27318a.g();
    }

    public final boolean z(com.google.android.gms.internal.ads.C3238bB0 c3238bB0) {
        com.google.android.gms.internal.ads.AB0 ab0 = null;
        if (c3238bB0 != null) {
            int i6 = this.f27319b;
            com.google.android.gms.internal.ads.EI0[] ei0Arr = c3238bB0.f34239c;
            if (ei0Arr[i6] != null && this.f27318a.q() == ei0Arr[i6]) {
                ab0 = this.f27318a;
            }
        }
        return ab0 != null;
    }
}
