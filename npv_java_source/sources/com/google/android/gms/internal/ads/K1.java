package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class K1 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f28798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28801e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.F2 f28803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5300u0 f28804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.N1 f28805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.G3 f28806j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f28797a = new com.google.android.gms.internal.ads.C5128sR(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28802f = -1;

    private final int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        this.f28797a.i(2);
        ((com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0).L(this.f28797a.n(), 0, 2, false);
        return this.f28797a.G();
    }

    private final void b() {
        com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0 = this.f28798b;
        interfaceC5520w0.getClass();
        interfaceC5520w0.Q();
        this.f28798b.R(new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L));
        this.f28799c = 6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        if (j6 == 0) {
            this.f28799c = 0;
            this.f28806j = null;
        } else if (this.f28799c == 5) {
            com.google.android.gms.internal.ads.G3 g6 = this.f28806j;
            g6.getClass();
            g6.e(j6, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        java.lang.String strO;
        com.google.android.gms.internal.ads.M1 m1A;
        com.google.android.gms.internal.ads.F2 f6;
        long j6;
        int i10 = this.f28799c;
        long j10 = -1;
        if (i10 == 0) {
            this.f28797a.i(2);
            interfaceC5300u0.M(this.f28797a.n(), 0, 2);
            int iG = this.f28797a.G();
            this.f28800d = iG;
            if (iG == 65498) {
                if (this.f28802f != -1) {
                    this.f28799c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((iG >= 65488 && iG <= 65497) || iG == 65281) {
                return 0;
            }
            this.f28799c = 1;
            return 0;
        }
        if (i10 == 1) {
            this.f28797a.i(2);
            interfaceC5300u0.M(this.f28797a.n(), 0, 2);
            this.f28801e = this.f28797a.G() - 2;
            this.f28799c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new java.lang.IllegalStateException();
                }
                if (this.f28805i == null || interfaceC5300u0 != this.f28804h) {
                    this.f28804h = interfaceC5300u0;
                    this.f28805i = new com.google.android.gms.internal.ads.N1(interfaceC5300u0, this.f28802f);
                }
                com.google.android.gms.internal.ads.G3 g6 = this.f28806j;
                g6.getClass();
                int i11 = g6.i(this.f28805i, q6);
                if (i11 == 1) {
                    q6.f30855a += this.f28802f;
                }
                return i11;
            }
            long jE = interfaceC5300u0.e();
            long j11 = this.f28802f;
            if (jE != j11) {
                q6.f30855a = j11;
                return 1;
            }
            if (interfaceC5300u0.L(this.f28797a.n(), 0, 1, true)) {
                interfaceC5300u0.j();
                if (this.f28806j == null) {
                    this.f28806j = new com.google.android.gms.internal.ads.G3(com.google.android.gms.internal.ads.InterfaceC4869q4.f38162a, 8);
                }
                com.google.android.gms.internal.ads.N1 n6 = new com.google.android.gms.internal.ads.N1(interfaceC5300u0, this.f28802f);
                this.f28805i = n6;
                if (this.f28806j.j(n6)) {
                    com.google.android.gms.internal.ads.G3 g10 = this.f28806j;
                    long j12 = this.f28802f;
                    com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0 = this.f28798b;
                    interfaceC5520w0.getClass();
                    g10.k(new com.google.android.gms.internal.ads.P1(j12, interfaceC5520w0));
                    com.google.android.gms.internal.ads.F2 f10 = this.f28803g;
                    f10.getClass();
                    com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w1 = this.f28798b;
                    interfaceC5520w1.getClass();
                    com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w1.S(1024, 4);
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                    c4682oK0.c("image/jpeg");
                    c4682oK0.t(new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, f10));
                    interfaceC3107a1S.c(c4682oK0.H());
                    this.f28799c = 5;
                } else {
                    b();
                }
            } else {
                b();
            }
            return 0;
        }
        if (this.f28800d == 65505) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(this.f28801e);
            interfaceC5300u0.M(c5128sR.n(), 0, this.f28801e);
            if (this.f28803g == null && "http://ns.adobe.com/xap/1.0/".equals(c5128sR.O((char) 0)) && (strO = c5128sR.O((char) 0)) != null) {
                long jF = interfaceC5300u0.f();
                if (jF == -1 || (m1A = com.google.android.gms.internal.ads.Q1.a(strO)) == null || m1A.f29636b.size() < 2) {
                    f6 = null;
                } else {
                    int size = m1A.f29636b.size() - 1;
                    boolean z6 = false;
                    long j13 = -1;
                    long j14 = -1;
                    long j15 = -1;
                    long j16 = -1;
                    while (size >= 0) {
                        com.google.android.gms.internal.ads.L1 l6 = (com.google.android.gms.internal.ads.L1) m1A.f29636b.get(size);
                        boolean zEquals = "video/mp4".equals(l6.f29183a) | z6;
                        if (size == 0) {
                            jF -= l6.f29185c;
                            j6 = 0;
                        } else {
                            j6 = jF - l6.f29184b;
                        }
                        long j17 = jF;
                        jF = j6;
                        if (!zEquals || jF == j17) {
                            z6 = zEquals;
                        } else {
                            j16 = j17 - jF;
                            j15 = jF;
                            z6 = false;
                        }
                        if (size == 0) {
                            j14 = j17;
                        }
                        if (size == 0) {
                            j13 = jF;
                        }
                        size--;
                        j10 = -1;
                    }
                    long j18 = j10;
                    if (j15 == j18 || j16 == j18 || j13 == j18 || j14 == j18) {
                        f6 = null;
                    } else {
                        f6 = new com.google.android.gms.internal.ads.F2(j13, j14, m1A.f29635a, j15, j16);
                    }
                }
                this.f28803g = f6;
                if (f6 != null) {
                    this.f28802f = f6.f27273F;
                }
            } else {
                i6 = 0;
            }
            this.f28799c = i6;
            return i6;
        }
        interfaceC5300u0.I(this.f28801e);
        i6 = 0;
        this.f28799c = i6;
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        if (a(interfaceC5300u0) != 65496) {
            return false;
        }
        int iA = a(interfaceC5300u0);
        this.f28800d = iA;
        if (iA == 65504) {
            this.f28797a.i(2);
            com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
            c3983i0.L(this.f28797a.n(), 0, 2, false);
            c3983i0.g(this.f28797a.G() - 2, false);
            iA = a(interfaceC5300u0);
            this.f28800d = iA;
        }
        if (iA == 65505) {
            com.google.android.gms.internal.ads.C3983i0 c3983i1 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
            c3983i1.g(2, false);
            this.f28797a.i(6);
            c3983i1.L(this.f28797a.n(), 0, 6, false);
            if (this.f28797a.K() == 1165519206 && this.f28797a.G() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f28798b = interfaceC5520w0;
    }
}
