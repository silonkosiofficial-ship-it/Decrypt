package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class L5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f29205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f29206f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29209i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29212l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29215o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f29219s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f29221u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29204d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f29201a = new com.google.android.gms.internal.ads.C5128sR(new byte[15], 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f29202b = new com.google.android.gms.internal.ads.RQ();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f29203c = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.M5 f29216p = new com.google.android.gms.internal.ads.M5();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f29217q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f29218r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f29220t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29210j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29213m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f29207g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f29208h = -9.223372036854776E18d;

    private static final void f(com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.C5128sR c5128sR2, boolean z6) {
        int iT = c5128sR.t();
        int iMin = java.lang.Math.min(c5128sR.r(), c5128sR2.r());
        c5128sR.h(c5128sR2.n(), c5128sR2.t(), iMin);
        c5128sR2.m(iMin);
        if (z6) {
            c5128sR.l(iT);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        double d6;
        int iD;
        com.google.android.gms.internal.ads.LC.b(this.f29206f);
        while (c5128sR.r() > 0) {
            int i10 = this.f29204d;
            if (i10 == 0) {
                int i11 = this.f29211k;
                if ((i11 & 2) != 0) {
                    if ((i11 & 4) == 0) {
                        while (c5128sR.r() > 0) {
                            int i12 = this.f29212l << 8;
                            this.f29212l = i12;
                            int iC = i12 | c5128sR.C();
                            this.f29212l = iC;
                            if ((iC & 16777215) == 12583333) {
                                c5128sR.l(c5128sR.t() - 3);
                                this.f29212l = 0;
                            }
                        }
                    }
                    this.f29204d = 1;
                    break;
                    break;
                }
                c5128sR.l(c5128sR.u());
            } else if (i10 != 1) {
                int i13 = this.f29216p.f29651a;
                if (i13 == 1 || i13 == 17) {
                    f(c5128sR, this.f29203c, true);
                }
                int iMin = java.lang.Math.min(c5128sR.r(), this.f29216p.f29653c - this.f29214n);
                this.f29206f.a(c5128sR, iMin);
                int i14 = this.f29214n + iMin;
                this.f29214n = i14;
                com.google.android.gms.internal.ads.M5 m6 = this.f29216p;
                if (i14 == m6.f29653c) {
                    int i15 = m6.f29651a;
                    if (i15 == 1) {
                        byte[] bArrN = this.f29203c.n();
                        com.google.android.gms.internal.ads.N5 n5A = com.google.android.gms.internal.ads.Q5.a(new com.google.android.gms.internal.ads.RQ(bArrN, bArrN.length));
                        this.f29217q = n5A.f30173b;
                        this.f29218r = n5A.f30174c;
                        long j6 = this.f29220t;
                        long j10 = this.f29216p.f29652b;
                        if (j6 != j10) {
                            this.f29220t = j10;
                            int i16 = n5A.f30172a;
                            java.lang.String strConcat = i16 != -1 ? "mhm1".concat(java.lang.String.format(".%02X", java.lang.Integer.valueOf(i16))) : "mhm1";
                            byte[] bArr = n5A.f30175d;
                            com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0Q = null;
                            if (bArr != null && bArr.length > 0) {
                                abstractC3398ci0Q = com.google.android.gms.internal.ads.AbstractC3398ci0.Q(com.google.android.gms.internal.ads.EW.f27066f, bArr);
                            }
                            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                            c4682oK0.m(this.f29205e);
                            c4682oK0.B("audio/mhm1");
                            c4682oK0.C(this.f29217q);
                            c4682oK0.a(strConcat);
                            c4682oK0.n(abstractC3398ci0Q);
                            this.f29206f.c(c4682oK0.H());
                        }
                        this.f29221u = true;
                    } else if (i15 == 17) {
                        byte[] bArrN2 = this.f29203c.n();
                        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArrN2, bArrN2.length);
                        if (rq.p()) {
                            rq.n(2);
                            iD = rq.d(13);
                        } else {
                            iD = 0;
                        }
                        this.f29219s = iD;
                    } else if (i15 == 2) {
                        if (this.f29221u) {
                            this.f29210j = false;
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        int i17 = this.f29218r - this.f29219s;
                        double d10 = this.f29217q;
                        long jRound = java.lang.Math.round(this.f29207g);
                        if (this.f29209i) {
                            this.f29209i = false;
                            d6 = this.f29208h;
                        } else {
                            d6 = this.f29207g + ((((double) i17) * 1000000.0d) / d10);
                        }
                        this.f29207g = d6;
                        this.f29206f.b(jRound, i6, this.f29215o, 0, null);
                        this.f29221u = false;
                        this.f29219s = 0;
                        this.f29215o = 0;
                    }
                    this.f29204d = 1;
                    break;
                }
            } else {
                f(c5128sR, this.f29201a, false);
                com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f29201a;
                if (c5128sR2.r() == 0) {
                    com.google.android.gms.internal.ads.RQ rq2 = this.f29202b;
                    int iU = c5128sR2.u();
                    rq2.k(c5128sR2.n(), iU);
                    if (com.google.android.gms.internal.ads.Q5.b(this.f29202b, this.f29216p)) {
                        this.f29214n = 0;
                        this.f29215o += this.f29216p.f29653c + iU;
                        this.f29201a.l(0);
                        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = this.f29206f;
                        com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f29201a;
                        interfaceC3107a1.a(c5128sR3, c5128sR3.u());
                        this.f29201a.i(2);
                        this.f29203c.i(this.f29216p.f29653c);
                        this.f29213m = true;
                        this.f29204d = 2;
                    } else {
                        com.google.android.gms.internal.ads.C5128sR c5128sR4 = this.f29201a;
                        if (c5128sR4.u() < 15) {
                            c5128sR4.k(c5128sR4.u() + 1);
                        }
                    }
                }
                this.f29213m = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f29205e = c4543n6.b();
        this.f29206f = interfaceC5520w0.S(c4543n6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f29204d = 0;
        this.f29212l = 0;
        this.f29201a.i(2);
        this.f29214n = 0;
        this.f29215o = 0;
        this.f29217q = -2147483647;
        this.f29218r = -1;
        this.f29219s = 0;
        this.f29220t = -1L;
        this.f29221u = false;
        this.f29209i = false;
        this.f29213m = true;
        this.f29210j = true;
        this.f29207g = -9.223372036854776E18d;
        this.f29208h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f29211k = i6;
        if (!this.f29210j && (this.f29215o != 0 || !this.f29213m)) {
            this.f29209i = true;
        }
        if (j6 != -9223372036854775807L) {
            double d6 = j6;
            if (this.f29209i) {
                this.f29208h = d6;
            } else {
                this.f29207g = d6;
            }
        }
    }
}
