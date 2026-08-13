package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class C1 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f26120f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f26127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f26128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.B1 f26129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.gms.internal.ads.G1 f26130p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f26115a = new com.google.android.gms.internal.ads.C5128sR(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f26116b = new com.google.android.gms.internal.ads.C5128sR(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f26117c = new com.google.android.gms.internal.ads.C5128sR(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f26118d = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D1 f26119e = new com.google.android.gms.internal.ads.D1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26121g = 1;

    private final com.google.android.gms.internal.ads.C5128sR a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        if (this.f26126l > this.f26118d.s()) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = this.f26118d;
            int iS = c5128sR.s();
            c5128sR.j(new byte[java.lang.Math.max(iS + iS, this.f26126l)], 0);
        } else {
            this.f26118d.l(0);
        }
        this.f26118d.k(this.f26126l);
        interfaceC5300u0.M(this.f26118d.n(), 0, this.f26126l);
        return this.f26118d;
    }

    private final void b() {
        if (this.f26128n) {
            return;
        }
        this.f26120f.R(new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L));
        this.f26128n = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        if (j6 == 0) {
            this.f26121g = 1;
            this.f26122h = false;
        } else {
            this.f26121g = 3;
        }
        this.f26124j = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        long j6;
        boolean zC;
        boolean z6;
        com.google.android.gms.internal.ads.F1 f6;
        long j10;
        com.google.android.gms.internal.ads.LC.b(this.f26120f);
        while (true) {
            int i6 = this.f26121g;
            int i10 = 8;
            if (i6 != 1) {
                if (i6 == 2) {
                    interfaceC5300u0.I(this.f26124j);
                    this.f26124j = 0;
                    this.f26121g = 3;
                } else if (i6 != 3) {
                    if (i6 != 4) {
                        throw new java.lang.IllegalStateException();
                    }
                    if (this.f26122h) {
                        j6 = this.f26123i + this.f26127m;
                    } else {
                        j6 = this.f26119e.d() == -9223372036854775807L ? 0L : this.f26127m;
                    }
                    int i11 = this.f26125k;
                    if (i11 == 8) {
                        if (this.f26129o != null) {
                            b();
                            f6 = this.f26129o;
                        }
                        zC = f6.c(a(interfaceC5300u0), j6);
                        z6 = true;
                        if (!this.f26122h && zC) {
                            this.f26122h = true;
                            if (this.f26119e.d() == -9223372036854775807L) {
                                j10 = -this.f26127m;
                            } else {
                                j10 = 0;
                            }
                            this.f26123i = j10;
                        }
                        this.f26124j = 4;
                        this.f26121g = 2;
                        if (z6) {
                            return 0;
                        }
                    } else {
                        i10 = i11;
                    }
                    if (i10 == 9) {
                        if (this.f26130p != null) {
                            b();
                            f6 = this.f26130p;
                            zC = f6.c(a(interfaceC5300u0), j6);
                            z6 = true;
                        }
                        if (!this.f26122h) {
                            this.f26122h = true;
                            if (this.f26119e.d() == -9223372036854775807L) {
                                j10 = -this.f26127m;
                            } else {
                                j10 = 0;
                            }
                            this.f26123i = j10;
                        }
                        this.f26124j = 4;
                        this.f26121g = 2;
                        if (z6) {
                            return 0;
                        }
                    } else {
                        if (i10 == 18 && !this.f26128n) {
                            zC = this.f26119e.c(a(interfaceC5300u0), j6);
                            com.google.android.gms.internal.ads.D1 d6 = this.f26119e;
                            long jD = d6.d();
                            if (jD != -9223372036854775807L) {
                                this.f26120f.R(new com.google.android.gms.internal.ads.L0(d6.e(), d6.f(), jD));
                                this.f26128n = true;
                            }
                            z6 = true;
                        }
                        if (!this.f26122h) {
                            this.f26122h = true;
                            if (this.f26119e.d() == -9223372036854775807L) {
                                j10 = -this.f26127m;
                            } else {
                                j10 = 0;
                            }
                            this.f26123i = j10;
                        }
                        this.f26124j = 4;
                        this.f26121g = 2;
                        if (z6) {
                            return 0;
                        }
                    }
                    interfaceC5300u0.I(this.f26126l);
                    zC = false;
                    z6 = false;
                    if (!this.f26122h) {
                        this.f26122h = true;
                        if (this.f26119e.d() == -9223372036854775807L) {
                            j10 = -this.f26127m;
                        } else {
                            j10 = 0;
                        }
                        this.f26123i = j10;
                    }
                    this.f26124j = 4;
                    this.f26121g = 2;
                    if (z6) {
                        return 0;
                    }
                } else {
                    if (!interfaceC5300u0.J(this.f26117c.n(), 0, 11, true)) {
                        return -1;
                    }
                    this.f26117c.l(0);
                    this.f26125k = this.f26117c.C();
                    this.f26126l = this.f26117c.E();
                    this.f26127m = this.f26117c.E();
                    this.f26127m = (((long) (this.f26117c.C() << 24)) | this.f26127m) * 1000;
                    this.f26117c.m(3);
                    this.f26121g = 4;
                }
            } else {
                if (!interfaceC5300u0.J(this.f26116b.n(), 0, 9, true)) {
                    return -1;
                }
                this.f26116b.l(0);
                this.f26116b.m(4);
                int iC = this.f26116b.C();
                int i12 = iC & 4;
                int i13 = iC & 1;
                if (i12 != 0 && this.f26129o == null) {
                    this.f26129o = new com.google.android.gms.internal.ads.B1(this.f26120f.S(8, 1));
                }
                if (i13 != 0 && this.f26130p == null) {
                    this.f26130p = new com.google.android.gms.internal.ads.G1(this.f26120f.S(9, 2));
                }
                this.f26120f.Q();
                this.f26124j = this.f26116b.w() - 5;
                this.f26121g = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i0.L(this.f26115a.n(), 0, 3, false);
        this.f26115a.l(0);
        if (this.f26115a.E() != 4607062) {
            return false;
        }
        c3983i0.L(this.f26115a.n(), 0, 2, false);
        this.f26115a.l(0);
        if ((this.f26115a.G() & 250) != 0) {
            return false;
        }
        c3983i0.L(this.f26115a.n(), 0, 4, false);
        this.f26115a.l(0);
        int iW = this.f26115a.w();
        interfaceC5300u0.j();
        com.google.android.gms.internal.ads.C3983i0 c3983i1 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i1.g(iW, false);
        c3983i1.L(this.f26115a.n(), 0, 4, false);
        this.f26115a.l(0);
        return this.f26115a.w() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f26120f = interfaceC5520w0;
    }
}
