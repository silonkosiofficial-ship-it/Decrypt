package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z5 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.W5 f33497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f33498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33499k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3267bV f33489a = new com.google.android.gms.internal.ads.C3267bV(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33491c = new com.google.android.gms.internal.ads.C5128sR(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.util.SparseArray f33490b = new android.util.SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.X5 f33492d = new com.google.android.gms.internal.ads.X5();

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        com.google.android.gms.internal.ads.C3267bV c3267bV = this.f33489a;
        if (c3267bV.f() != -9223372036854775807L) {
            long jD = c3267bV.d();
            if (jD != -9223372036854775807L && jD != 0 && jD != j10) {
                c3267bV.i(j10);
            }
        } else {
            c3267bV.i(j10);
        }
        com.google.android.gms.internal.ads.W5 w6 = this.f33497i;
        if (w6 != null) {
            w6.d(j10);
        }
        for (int i6 = 0; i6 < this.f33490b.size(); i6++) {
            ((com.google.android.gms.internal.ads.Y5) this.f33490b.valueAt(i6)).b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        boolean z6;
        com.google.android.gms.internal.ads.InterfaceC5750y5 a6;
        int iG;
        com.google.android.gms.internal.ads.LC.b(this.f33498j);
        long jF = interfaceC5300u0.f();
        if (jF != -1) {
            com.google.android.gms.internal.ads.X5 x6 = this.f33492d;
            if (!x6.e()) {
                return x6.a(interfaceC5300u0, q6);
            }
        }
        if (!this.f33499k) {
            this.f33499k = true;
            com.google.android.gms.internal.ads.X5 x10 = this.f33492d;
            if (x10.b() != -9223372036854775807L) {
                com.google.android.gms.internal.ads.W5 w6 = new com.google.android.gms.internal.ads.W5(x10.d(), x10.b(), jF);
                this.f33497i = w6;
                this.f33498j.R(w6.b());
            } else {
                this.f33498j.R(new com.google.android.gms.internal.ads.S0(x10.b(), 0L));
            }
        }
        com.google.android.gms.internal.ads.W5 w10 = this.f33497i;
        if (w10 != null && w10.e()) {
            return w10.a(interfaceC5300u0, q6);
        }
        interfaceC5300u0.j();
        long jD = jF != -1 ? jF - interfaceC5300u0.d() : -1L;
        if ((jD != -1 && jD < 4) || !interfaceC5300u0.L(this.f33491c.n(), 0, 4, true)) {
            return -1;
        }
        this.f33491c.l(0);
        int iW = this.f33491c.w();
        if (iW == 441) {
            return -1;
        }
        if (iW == 442) {
            interfaceC5300u0.N(this.f33491c.n(), 0, 10);
            this.f33491c.l(9);
            iG = (this.f33491c.C() & 7) + 14;
        } else {
            if (iW != 443) {
                if ((iW >> 8) != 1) {
                    interfaceC5300u0.I(1);
                    return 0;
                }
                int i6 = iW & 255;
                com.google.android.gms.internal.ads.Y5 y6 = (com.google.android.gms.internal.ads.Y5) this.f33490b.get(i6);
                if (!this.f33493e) {
                    if (y6 == null) {
                        com.google.android.gms.internal.ads.InterfaceC5750y5 interfaceC5750y5 = null;
                        if (i6 == 189) {
                            a6 = new com.google.android.gms.internal.ads.C4871q5(null, 0);
                            z6 = true;
                        } else {
                            z6 = true;
                            if ((iW & 224) == 192) {
                                a6 = new com.google.android.gms.internal.ads.K5(null, 0);
                            } else if ((iW & 240) == 224) {
                                a6 = new com.google.android.gms.internal.ads.A5(null);
                                this.f33495g = true;
                                this.f33496h = interfaceC5300u0.e();
                                interfaceC5750y5 = a6;
                            }
                            if (interfaceC5750y5 != null) {
                                interfaceC5750y5.c(this.f33498j, new com.google.android.gms.internal.ads.C4543n6(Integer.MIN_VALUE, i6, 256));
                                y6 = new com.google.android.gms.internal.ads.Y5(interfaceC5750y5, this.f33489a);
                                this.f33490b.put(i6, y6);
                            }
                        }
                        this.f33494f = z6;
                        this.f33496h = interfaceC5300u0.e();
                        interfaceC5750y5 = a6;
                        if (interfaceC5750y5 != null) {
                            interfaceC5750y5.c(this.f33498j, new com.google.android.gms.internal.ads.C4543n6(Integer.MIN_VALUE, i6, 256));
                            y6 = new com.google.android.gms.internal.ads.Y5(interfaceC5750y5, this.f33489a);
                            this.f33490b.put(i6, y6);
                        }
                    }
                    long j6 = 1048576;
                    if (this.f33494f && this.f33495g) {
                        j6 = 8192 + this.f33496h;
                    }
                    if (interfaceC5300u0.e() > j6) {
                        this.f33493e = true;
                        this.f33498j.Q();
                    }
                }
                interfaceC5300u0.N(this.f33491c.n(), 0, 2);
                this.f33491c.l(0);
                int iG2 = this.f33491c.G() + 6;
                if (y6 == null) {
                    interfaceC5300u0.I(iG2);
                } else {
                    this.f33491c.i(iG2);
                    interfaceC5300u0.M(this.f33491c.n(), 0, iG2);
                    this.f33491c.l(6);
                    y6.a(this.f33491c);
                    com.google.android.gms.internal.ads.C5128sR c5128sR = this.f33491c;
                    c5128sR.k(c5128sR.s());
                }
                return 0;
            }
            interfaceC5300u0.N(this.f33491c.n(), 0, 2);
            this.f33491c.l(0);
            iG = this.f33491c.G() + 6;
        }
        interfaceC5300u0.I(iG);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        byte[] bArr = new byte[14];
        com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i0.L(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c3983i0.g(bArr[13] & 7, false);
        c3983i0.L(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f33498j = interfaceC5520w0;
    }
}
