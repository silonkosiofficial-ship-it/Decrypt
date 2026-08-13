package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class CH0 implements com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.IH0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f26183C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f26184D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.NH0 f26185E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.JH0 f26186F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.IH0 f26187G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f26188H = -9223372036854775807L;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YJ0 f26189I;

    public CH0(com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.YJ0 yj0, long j6) {
        this.f26183C = lh0;
        this.f26189I = yj0;
        this.f26184D = j6;
    }

    private final long v(long j6) {
        long j10 = this.f26188H;
        return j10 != -9223372036854775807L ? j10 : j6;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final void a(long j6) {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        jh0.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long b() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.b();
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long c() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.c();
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean d(com.google.android.gms.internal.ads.ZA0 za0) {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        return jh0 != null && jh0.d(za0);
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.HI0 hi0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f26187G;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        ih0.e(this);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long f() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.f();
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final com.google.android.gms.internal.ads.PI0 g() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.g();
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long h(long j6) {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.h(j6);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long i(long j6, com.google.android.gms.internal.ads.GB0 gb0) {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.i(j6, gb0);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void j(long j6, boolean z6) {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        jh0.j(j6, false);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void k() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        if (jh0 != null) {
            jh0.k();
            return;
        }
        com.google.android.gms.internal.ads.NH0 nh0 = this.f26185E;
        if (nh0 != null) {
            nh0.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.IH0
    public final void l(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f26187G;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        ih0.l(this);
    }

    public final long m() {
        return this.f26188H;
    }

    public final long n() {
        return this.f26184D;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long o(com.google.android.gms.internal.ads.IJ0[] ij0Arr, boolean[] zArr, com.google.android.gms.internal.ads.EI0[] ei0Arr, boolean[] zArr2, long j6) {
        long j10 = this.f26188H;
        long j11 = (j10 == -9223372036854775807L || j6 != this.f26184D) ? j6 : j10;
        this.f26188H = -9223372036854775807L;
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return jh0.o(ij0Arr, zArr, ei0Arr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void p(com.google.android.gms.internal.ads.IH0 ih0, long j6) {
        this.f26187G = ih0;
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        if (jh0 != null) {
            jh0.p(this, v(this.f26184D));
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean q() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        return jh0 != null && jh0.q();
    }

    public final void r(com.google.android.gms.internal.ads.LH0 lh0) {
        long jV = v(this.f26184D);
        com.google.android.gms.internal.ads.NH0 nh0 = this.f26185E;
        nh0.getClass();
        com.google.android.gms.internal.ads.JH0 jh0E = nh0.e(lh0, this.f26189I, jV);
        this.f26186F = jh0E;
        if (this.f26187G != null) {
            jh0E.p(this, jV);
        }
    }

    public final void s(long j6) {
        this.f26188H = j6;
    }

    public final void t() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f26186F;
        if (jh0 != null) {
            com.google.android.gms.internal.ads.NH0 nh0 = this.f26185E;
            nh0.getClass();
            nh0.b(jh0);
        }
    }

    public final void u(com.google.android.gms.internal.ads.NH0 nh0) {
        com.google.android.gms.internal.ads.LC.f(this.f26185E == null);
        this.f26185E = nh0;
    }
}
