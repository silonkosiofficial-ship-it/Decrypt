package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class J5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f28593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f28595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f28596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f28597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f28598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f28599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f28604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f28608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f28609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f28610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f28611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f28612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private java.lang.String f28614v;

    public J5(java.lang.String str, int i6) {
        this.f28593a = str;
        this.f28594b = i6;
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(1024);
        this.f28595c = c5128sR;
        byte[] bArrN = c5128sR.n();
        this.f28596d = new com.google.android.gms.internal.ads.RQ(bArrN, bArrN.length);
        this.f28604l = -9223372036854775807L;
    }

    private final int f(com.google.android.gms.internal.ads.RQ rq) throws com.google.android.gms.internal.ads.C4708of {
        int iA = rq.a();
        com.google.android.gms.internal.ads.M mB = com.google.android.gms.internal.ads.O.b(rq, true);
        this.f28614v = mB.f29623c;
        this.f28611s = mB.f29621a;
        this.f28613u = mB.f29622b;
        return iA - rq.a();
    }

    private static long g(com.google.android.gms.internal.ads.RQ rq) {
        return rq.d((rq.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        int i10;
        int iD;
        boolean zP;
        com.google.android.gms.internal.ads.LC.b(this.f28597e);
        while (c5128sR.r() > 0) {
            int i11 = this.f28600h;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iC = c5128sR.C();
                    if ((iC & 224) == 224) {
                        this.f28603k = iC;
                        this.f28600h = 2;
                    } else if (iC != 86) {
                        this.f28600h = 0;
                    }
                } else if (i11 != 2) {
                    int iMin = java.lang.Math.min(c5128sR.r(), this.f28602j - this.f28601i);
                    c5128sR.h(this.f28596d.f31264a, this.f28601i, iMin);
                    int i12 = this.f28601i + iMin;
                    this.f28601i = i12;
                    if (i12 == this.f28602j) {
                        this.f28596d.l(0);
                        com.google.android.gms.internal.ads.RQ rq = this.f28596d;
                        if (rq.p()) {
                            if (this.f28605m) {
                            }
                            this.f28600h = 0;
                        } else {
                            this.f28605m = true;
                            int iD2 = rq.d(1);
                            if (iD2 == 1) {
                                iD = rq.d(1);
                                i10 = 1;
                            } else {
                                i10 = iD2;
                                iD = 0;
                            }
                            this.f28606n = iD;
                            if (iD != 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                            }
                            if (i10 == 1) {
                                g(rq);
                                i10 = 1;
                            }
                            if (!rq.p()) {
                                throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                            }
                            this.f28607o = rq.d(6);
                            int iD3 = rq.d(4);
                            int iD4 = rq.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                            }
                            if (i10 == 0) {
                                int iC2 = rq.c();
                                int iF = f(rq);
                                rq.l(iC2);
                                byte[] bArr = new byte[(iF + 7) / 8];
                                rq.h(bArr, 0, iF);
                                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                                c4682oK0.m(this.f28598f);
                                c4682oK0.B("audio/mp4a-latm");
                                c4682oK0.a(this.f28614v);
                                c4682oK0.r0(this.f28613u);
                                c4682oK0.C(this.f28611s);
                                c4682oK0.n(java.util.Collections.singletonList(bArr));
                                c4682oK0.q(this.f28593a);
                                c4682oK0.y(this.f28594b);
                                com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                                if (!dH.equals(this.f28599g)) {
                                    this.f28599g = dH;
                                    this.f28612t = 1024000000 / ((long) dH.f26552E);
                                    this.f28597e.c(dH);
                                }
                            } else {
                                rq.n(((int) g(rq)) - f(rq));
                            }
                            int iD5 = rq.d(3);
                            this.f28608p = iD5;
                            if (iD5 == 0) {
                                rq.n(8);
                            } else if (iD5 == 1) {
                                rq.n(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                rq.n(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new java.lang.IllegalStateException();
                                }
                                rq.n(1);
                            }
                            boolean zP2 = rq.p();
                            this.f28609q = zP2;
                            this.f28610r = 0L;
                            if (zP2) {
                                if (i10 != 1) {
                                    do {
                                        zP = rq.p();
                                        this.f28610r = (this.f28610r << 8) + ((long) rq.d(8));
                                    } while (zP);
                                } else {
                                    this.f28610r = g(rq);
                                }
                            }
                            if (rq.p()) {
                                rq.n(8);
                            }
                        }
                        if (this.f28606n != 0) {
                            throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                        }
                        if (this.f28607o != 0) {
                            throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                        }
                        if (this.f28608p != 0) {
                            throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                        }
                        int i13 = 0;
                        while (true) {
                            int iD6 = rq.d(8);
                            i6 = i13 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i13 = i6;
                            }
                        }
                        int iC3 = rq.c();
                        if ((iC3 & 7) == 0) {
                            this.f28595c.l(iC3 >> 3);
                        } else {
                            rq.h(this.f28595c.n(), 0, i6 * 8);
                            this.f28595c.l(0);
                        }
                        this.f28597e.a(this.f28595c, i6);
                        com.google.android.gms.internal.ads.LC.f(this.f28604l != -9223372036854775807L);
                        this.f28597e.b(this.f28604l, 1, i6, 0, null);
                        this.f28604l += this.f28612t;
                        if (this.f28609q) {
                            rq.n((int) this.f28610r);
                        }
                        this.f28600h = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iC4 = ((this.f28603k & (-225)) << 8) | c5128sR.C();
                    this.f28602j = iC4;
                    com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f28595c;
                    if (iC4 > c5128sR2.n().length) {
                        c5128sR2.i(iC4);
                        com.google.android.gms.internal.ads.RQ rq2 = this.f28596d;
                        byte[] bArrN = this.f28595c.n();
                        rq2.k(bArrN, bArrN.length);
                    }
                    this.f28601i = 0;
                    this.f28600h = 3;
                }
            } else if (c5128sR.C() == 86) {
                this.f28600h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f28597e = interfaceC5520w0.S(c4543n6.a(), 1);
        this.f28598f = c4543n6.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f28600h = 0;
        this.f28604l = -9223372036854775807L;
        this.f28605m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f28604l = j6;
    }
}
