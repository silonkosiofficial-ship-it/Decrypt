package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3238bB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.JH0 f34237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f34238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.EI0[] f34239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C3347cB0 f34243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f34245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.DB0[] f34246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PJ0 f34247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4993rB0 f34248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3238bB0 f34249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.PI0 f34250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.QJ0 f34251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f34252p;

    public C3238bB0(com.google.android.gms.internal.ads.DB0[] db0Arr, long j6, com.google.android.gms.internal.ads.PJ0 pj0, com.google.android.gms.internal.ads.YJ0 yj0, com.google.android.gms.internal.ads.C4993rB0 c4993rB0, com.google.android.gms.internal.ads.C3347cB0 c3347cB0, com.google.android.gms.internal.ads.QJ0 qj0, long j10) {
        this.f34246j = db0Arr;
        this.f34252p = j6;
        this.f34247k = pj0;
        this.f34248l = c4993rB0;
        com.google.android.gms.internal.ads.LH0 lh0 = c3347cB0.f34462a;
        this.f34238b = lh0.f29454a;
        this.f34243g = c3347cB0;
        this.f34250n = com.google.android.gms.internal.ads.PI0.f30685d;
        this.f34251o = qj0;
        this.f34239c = new com.google.android.gms.internal.ads.EI0[2];
        this.f34245i = new boolean[2];
        long j11 = c3347cB0.f34463b;
        long j12 = c3347cB0.f34465d;
        com.google.android.gms.internal.ads.JH0 jh0O = c4993rB0.o(lh0, yj0, j11);
        this.f34237a = j12 != -9223372036854775807L ? new com.google.android.gms.internal.ads.C4676oH0(jh0O, true, 0L, j12) : jh0O;
    }

    private final void u() {
        if (!w()) {
            return;
        }
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.QJ0 qj0 = this.f34251o;
            if (i6 >= qj0.f30963a) {
                return;
            }
            qj0.b(i6);
            com.google.android.gms.internal.ads.IJ0 ij0 = this.f34251o.f30965c[i6];
            i6++;
        }
    }

    private final void v() {
        if (!w()) {
            return;
        }
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.QJ0 qj0 = this.f34251o;
            if (i6 >= qj0.f30963a) {
                return;
            }
            qj0.b(i6);
            com.google.android.gms.internal.ads.IJ0 ij0 = this.f34251o.f30965c[i6];
            i6++;
        }
    }

    private final boolean w() {
        return this.f34249m == null;
    }

    public final long a(com.google.android.gms.internal.ads.QJ0 qj0, long j6, boolean z6) {
        return b(qj0, j6, false, new boolean[2]);
    }

    public final long b(com.google.android.gms.internal.ads.QJ0 qj0, long j6, boolean z6, boolean[] zArr) {
        int i6 = 0;
        while (true) {
            boolean z10 = true;
            if (i6 >= qj0.f30963a) {
                break;
            }
            boolean[] zArr2 = this.f34245i;
            if (z6 || !qj0.a(this.f34251o, i6)) {
                z10 = false;
            }
            zArr2[i6] = z10;
            i6++;
        }
        int i10 = 0;
        while (true) {
            com.google.android.gms.internal.ads.DB0[] db0Arr = this.f34246j;
            if (i10 >= 2) {
                break;
            }
            db0Arr[i10].b();
            i10++;
        }
        u();
        this.f34251o = qj0;
        v();
        long jO = this.f34237a.o(qj0.f30965c, this.f34245i, this.f34239c, zArr, j6);
        int i11 = 0;
        while (true) {
            com.google.android.gms.internal.ads.DB0[] db0Arr2 = this.f34246j;
            if (i11 >= 2) {
                break;
            }
            db0Arr2[i11].b();
            i11++;
        }
        this.f34242f = false;
        int i12 = 0;
        while (true) {
            com.google.android.gms.internal.ads.EI0[] ei0Arr = this.f34239c;
            if (i12 >= 2) {
                return jO;
            }
            if (ei0Arr[i12] != null) {
                com.google.android.gms.internal.ads.LC.f(qj0.b(i12));
                this.f34246j[i12].b();
                this.f34242f = true;
            } else {
                com.google.android.gms.internal.ads.LC.f(qj0.f30965c[i12] == null);
            }
            i12++;
        }
    }

    public final long c() {
        if (!this.f34241e) {
            return this.f34243g.f34463b;
        }
        long jB = this.f34242f ? this.f34237a.b() : Long.MIN_VALUE;
        return jB == Long.MIN_VALUE ? this.f34243g.f34466e : jB;
    }

    public final long d() {
        if (this.f34241e) {
            return this.f34237a.c();
        }
        return 0L;
    }

    public final long e() {
        return this.f34252p;
    }

    public final long f() {
        return this.f34243g.f34463b + this.f34252p;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 g() {
        return this.f34249m;
    }

    public final com.google.android.gms.internal.ads.PI0 h() {
        return this.f34250n;
    }

    public final com.google.android.gms.internal.ads.QJ0 i() {
        return this.f34251o;
    }

    public final com.google.android.gms.internal.ads.QJ0 j(float f6, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, boolean z6) {
        com.google.android.gms.internal.ads.QJ0 qj0F = this.f34247k.f(this.f34246j, this.f34250n, this.f34243g.f34462a, abstractC4942qm);
        for (int i6 = 0; i6 < qj0F.f30963a; i6++) {
            boolean z10 = true;
            if (qj0F.b(i6)) {
                if (qj0F.f30965c[i6] == null) {
                    this.f34246j[i6].b();
                    z10 = false;
                }
            } else if (qj0F.f30965c[i6] != null) {
                z10 = false;
            }
            com.google.android.gms.internal.ads.LC.f(z10);
        }
        for (com.google.android.gms.internal.ads.IJ0 ij0 : qj0F.f30965c) {
        }
        return qj0F;
    }

    public final void k(com.google.android.gms.internal.ads.ZA0 za0) {
        com.google.android.gms.internal.ads.LC.f(w());
        this.f34237a.d(za0);
    }

    public final void l(float f6, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, boolean z6) {
        this.f34241e = true;
        this.f34250n = this.f34237a.g();
        com.google.android.gms.internal.ads.QJ0 qj0J = j(f6, abstractC4942qm, z6);
        com.google.android.gms.internal.ads.C3347cB0 c3347cB0 = this.f34243g;
        long jMax = c3347cB0.f34463b;
        long j6 = c3347cB0.f34466e;
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = java.lang.Math.max(0L, j6 - 1);
        }
        long jA = a(qj0J, jMax, false);
        long j10 = this.f34252p;
        com.google.android.gms.internal.ads.C3347cB0 c3347cB1 = this.f34243g;
        this.f34252p = j10 + (c3347cB1.f34463b - jA);
        this.f34243g = c3347cB1.b(jA);
    }

    public final void m(com.google.android.gms.internal.ads.IH0 ih0, long j6) {
        this.f34240d = true;
        this.f34237a.p(ih0, j6);
    }

    public final void n(long j6) {
        com.google.android.gms.internal.ads.LC.f(w());
        if (this.f34241e) {
            this.f34237a.a(j6 - this.f34252p);
        }
    }

    public final void o() {
        u();
        com.google.android.gms.internal.ads.JH0 jh0 = this.f34237a;
        try {
            boolean z6 = jh0 instanceof com.google.android.gms.internal.ads.C4676oH0;
            com.google.android.gms.internal.ads.C4993rB0 c4993rB0 = this.f34248l;
            if (z6) {
                c4993rB0.i(((com.google.android.gms.internal.ads.C4676oH0) jh0).f37757C);
            } else {
                c4993rB0.i(jh0);
            }
        } catch (java.lang.RuntimeException e6) {
            com.google.android.gms.internal.ads.AbstractC3586eM.d("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    public final void p(com.google.android.gms.internal.ads.C3238bB0 c3238bB0) {
        if (c3238bB0 == this.f34249m) {
            return;
        }
        u();
        this.f34249m = c3238bB0;
        v();
    }

    public final void q(long j6) {
        this.f34252p = j6;
    }

    public final void r() {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f34237a;
        if (jh0 instanceof com.google.android.gms.internal.ads.C4676oH0) {
            long j6 = this.f34243g.f34465d;
            if (j6 == -9223372036854775807L) {
                j6 = Long.MIN_VALUE;
            }
            ((com.google.android.gms.internal.ads.C4676oH0) jh0).m(0L, j6);
        }
    }

    public final boolean s() {
        if (this.f34241e) {
            return !this.f34242f || this.f34237a.b() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean t() {
        if (this.f34241e) {
            return s() || c() - this.f34243g.f34463b >= -9223372036854775807L;
        }
        return false;
    }
}
