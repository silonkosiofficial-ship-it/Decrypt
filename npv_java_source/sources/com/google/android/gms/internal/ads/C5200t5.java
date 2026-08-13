package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5200t5 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f38870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f38871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38872f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38875i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5310u5 f38867a = new com.google.android.gms.internal.ads.C5310u5(true, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38868b = new com.google.android.gms.internal.ads.C5128sR(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38873g = -1;

    public C5200t5(int i6) {
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(10);
        this.f38869c = c5128sR;
        byte[] bArrN = c5128sR.n();
        this.f38870d = new com.google.android.gms.internal.ads.RQ(bArrN, bArrN.length);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f38874h = false;
        this.f38867a.d();
        this.f38872f = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        com.google.android.gms.internal.ads.LC.b(this.f38871e);
        int iH = interfaceC5300u0.H(this.f38868b.n(), 0, 2048);
        if (!this.f38875i) {
            this.f38871e.R(new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L));
            this.f38875i = true;
        }
        if (iH == -1) {
            return -1;
        }
        this.f38868b.l(0);
        this.f38868b.k(iH);
        if (!this.f38874h) {
            this.f38867a.e(this.f38872f, 4);
            this.f38874h = true;
        }
        this.f38867a.b(this.f38868b);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
            c3983i0.L(this.f38869c.n(), 0, 10, false);
            this.f38869c.l(0);
            if (this.f38869c.E() != 4801587) {
                break;
            }
            this.f38869c.m(3);
            int iB = this.f38869c.B();
            i6 += iB + 10;
            c3983i0.g(iB, false);
        }
        interfaceC5300u0.j();
        com.google.android.gms.internal.ads.C3983i0 c3983i1 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i1.g(i6, false);
        if (this.f38873g == -1) {
            this.f38873g = i6;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i6;
        do {
            c3983i1.L(this.f38869c.n(), 0, 2, false);
            this.f38869c.l(0);
            if (com.google.android.gms.internal.ads.C5310u5.f(this.f38869c.G())) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                c3983i1.L(this.f38869c.n(), 0, 4, false);
                this.f38870d.l(14);
                int iD = this.f38870d.d(13);
                if (iD <= 6) {
                    i12++;
                    interfaceC5300u0.j();
                    c3983i1.g(i12, false);
                    i10 = 0;
                    i11 = 0;
                } else {
                    c3983i1.g(iD - 6, false);
                    i11 += iD;
                }
            } else {
                i12++;
                interfaceC5300u0.j();
                c3983i1.g(i12, false);
                i10 = 0;
                i11 = 0;
            }
        } while (i12 - i6 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f38871e = interfaceC5520w0;
        this.f38867a.c(interfaceC5520w0, new com.google.android.gms.internal.ads.C4543n6(Integer.MIN_VALUE, 0, 1));
        interfaceC5520w0.Q();
    }
}
