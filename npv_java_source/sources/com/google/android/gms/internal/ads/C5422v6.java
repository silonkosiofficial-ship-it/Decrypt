package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5422v6 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f39325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f39326b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5202t6 f39329e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39327c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39328d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39330f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f39331g = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f39327c = j6 == 0 ? 0 : 4;
        com.google.android.gms.internal.ads.InterfaceC5202t6 interfaceC5202t6 = this.f39329e;
        if (interfaceC5202t6 != null) {
            interfaceC5202t6.a(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        com.google.android.gms.internal.ads.InterfaceC5202t6 c5312u6;
        com.google.android.gms.internal.ads.LC.b(this.f39326b);
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        int i11 = this.f39327c;
        int iF = 4;
        if (i11 == 0) {
            com.google.android.gms.internal.ads.LC.f(interfaceC5300u0.e() == 0);
            int i12 = this.f39330f;
            if (i12 != -1) {
                interfaceC5300u0.I(i12);
                this.f39327c = 4;
            } else {
                if (!com.google.android.gms.internal.ads.AbstractC5752y6.c(interfaceC5300u0)) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Unsupported or unrecognized wav file type.", null);
                }
                interfaceC5300u0.I((int) (interfaceC5300u0.d() - interfaceC5300u0.e()));
                this.f39327c = 1;
            }
            return 0;
        }
        long jH = -1;
        if (i11 == 1) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(8);
            com.google.android.gms.internal.ads.C5642x6 c5642x6A = com.google.android.gms.internal.ads.C5642x6.a(interfaceC5300u0, c5128sR);
            if (c5642x6A.f39787a != 1685272116) {
                interfaceC5300u0.j();
            } else {
                interfaceC5300u0.D(8);
                c5128sR.l(0);
                interfaceC5300u0.N(c5128sR.n(), 0, 8);
                jH = c5128sR.H();
                interfaceC5300u0.I(((int) c5642x6A.f39788b) + 8);
            }
            this.f39328d = jH;
            this.f39327c = 2;
            return 0;
        }
        if (i11 == 2) {
            com.google.android.gms.internal.ads.C5532w6 c5532w6B = com.google.android.gms.internal.ads.AbstractC5752y6.b(interfaceC5300u0);
            int i13 = c5532w6B.f39536a;
            if (i13 == 17) {
                c5312u6 = new com.google.android.gms.internal.ads.C5092s6(this.f39325a, this.f39326b, c5532w6B);
            } else if (i13 == 6) {
                c5312u6 = new com.google.android.gms.internal.ads.C5312u6(this.f39325a, this.f39326b, c5532w6B, "audio/g711-alaw", -1);
            } else if (i13 == 7) {
                c5312u6 = new com.google.android.gms.internal.ads.C5312u6(this.f39325a, this.f39326b, c5532w6B, "audio/g711-mlaw", -1);
            } else {
                int i14 = c5532w6B.f39540e;
                if (i13 == 1) {
                    iF = com.google.android.gms.internal.ads.EW.F(i14);
                    i6 = iF;
                } else {
                    if (i13 != 3) {
                        if (i13 == 65534) {
                            iF = com.google.android.gms.internal.ads.EW.F(i14);
                            i6 = iF;
                        }
                    } else if (i14 == 32) {
                        i6 = iF;
                    }
                    i6 = 0;
                }
                if (i6 == 0) {
                    throw com.google.android.gms.internal.ads.C4708of.c("Unsupported WAV format type: " + i13);
                }
                c5312u6 = new com.google.android.gms.internal.ads.C5312u6(this.f39325a, this.f39326b, c5532w6B, "audio/raw", i6);
            }
            this.f39329e = c5312u6;
            this.f39327c = 3;
            return 0;
        }
        if (i11 != 3) {
            com.google.android.gms.internal.ads.LC.f(this.f39331g != -1);
            long jE = this.f39331g - interfaceC5300u0.e();
            com.google.android.gms.internal.ads.InterfaceC5202t6 interfaceC5202t6 = this.f39329e;
            interfaceC5202t6.getClass();
            return interfaceC5202t6.f(interfaceC5300u0, jE) ? -1 : 0;
        }
        android.util.Pair pairA = com.google.android.gms.internal.ads.AbstractC5752y6.a(interfaceC5300u0);
        this.f39330f = ((java.lang.Long) pairA.first).intValue();
        long jLongValue = ((java.lang.Long) pairA.second).longValue();
        long j6 = this.f39328d;
        if (j6 != -1 && jLongValue == 4294967295L) {
            jLongValue = j6;
        }
        long j10 = ((long) this.f39330f) + jLongValue;
        this.f39331g = j10;
        long jF = interfaceC5300u0.f();
        if (jF != -1 && j10 > jF) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("WavExtractor", "Data exceeds input length: " + j10 + ", " + jF);
            this.f39331g = jF;
            j10 = jF;
        }
        com.google.android.gms.internal.ads.InterfaceC5202t6 interfaceC5202t7 = this.f39329e;
        interfaceC5202t7.getClass();
        interfaceC5202t7.e(this.f39330f, j10);
        this.f39327c = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        return com.google.android.gms.internal.ads.AbstractC5752y6.c(interfaceC5300u0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f39325a = interfaceC5520w0;
        this.f39326b = interfaceC5520w0.S(0, 1);
        interfaceC5520w0.Q();
    }
}
