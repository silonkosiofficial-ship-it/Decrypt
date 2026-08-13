package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class H5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3446d6 f27961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f27962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f27963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.G5 f27964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27965e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27972l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f27966f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27967g = new com.google.android.gms.internal.ads.R5(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27968h = new com.google.android.gms.internal.ads.R5(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27969i = new com.google.android.gms.internal.ads.R5(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27970j = new com.google.android.gms.internal.ads.R5(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27971k = new com.google.android.gms.internal.ads.R5(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f27973m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27974n = new com.google.android.gms.internal.ads.C5128sR();

    public H5(com.google.android.gms.internal.ads.C3446d6 c3446d6) {
        this.f27961a = c3446d6;
    }

    private final void f(byte[] bArr, int i6, int i10) {
        this.f27964d.c(bArr, i6, i10);
        if (!this.f27965e) {
            this.f27967g.a(bArr, i6, i10);
            this.f27968h.a(bArr, i6, i10);
            this.f27969i.a(bArr, i6, i10);
        }
        this.f27970j.a(bArr, i6, i10);
        this.f27971k.a(bArr, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
        com.google.android.gms.internal.ads.LC.b(this.f27963c);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (z6) {
            this.f27961a.c();
            this.f27964d.a(this.f27972l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0154  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.LC.b(this.f27963c);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        while (c5128sR.r() > 0) {
            int iT = c5128sR.t();
            int iU = c5128sR.u();
            byte[] bArrN = c5128sR.n();
            this.f27972l += (long) c5128sR.r();
            this.f27963c.a(c5128sR, c5128sR.r());
            while (iT < iU) {
                int iA = com.google.android.gms.internal.ads.AbstractC4371lb0.a(bArrN, iT, iU, this.f27966f);
                if (iA == iU) {
                    f(bArrN, iT, iU);
                    return;
                }
                int i10 = iA + 3;
                int i11 = bArrN[i10] & 126;
                int i12 = iA - iT;
                if (i12 > 0) {
                    f(bArrN, iT, iA);
                }
                int i13 = iU - iA;
                long j6 = this.f27972l - ((long) i13);
                int i14 = i12 < 0 ? -i12 : 0;
                long j10 = this.f27973m;
                this.f27964d.b(j6, i13, this.f27965e);
                if (!this.f27965e) {
                    this.f27967g.d(i14);
                    this.f27968h.d(i14);
                    this.f27969i.d(i14);
                    com.google.android.gms.internal.ads.R5 r6 = this.f27967g;
                    if (r6.e()) {
                        com.google.android.gms.internal.ads.R5 r10 = this.f27968h;
                        if (r10.e()) {
                            com.google.android.gms.internal.ads.R5 r11 = this.f27969i;
                            if (r11.e()) {
                                java.lang.String str = this.f27962b;
                                int i15 = r6.f31122e;
                                byte[] bArr = new byte[r10.f31122e + i15 + r11.f31122e];
                                java.lang.System.arraycopy(r6.f31121d, 0, bArr, 0, i15);
                                java.lang.System.arraycopy(r10.f31121d, 0, bArr, r6.f31122e, r10.f31122e);
                                java.lang.System.arraycopy(r11.f31121d, 0, bArr, r6.f31122e + r10.f31122e, r11.f31122e);
                                java.lang.String strD = null;
                                com.google.android.gms.internal.ads.C3670f80 c3670f80C = com.google.android.gms.internal.ads.AbstractC4371lb0.c(r10.f31121d, 3, r10.f31122e, null);
                                com.google.android.gms.internal.ads.C5861z50 c5861z50 = c3670f80C.f35280a;
                                if (c5861z50 != null) {
                                    int i16 = c5861z50.f40215f;
                                    int[] iArr = c5861z50.f40214e;
                                    strD = com.google.android.gms.internal.ads.ND.d(c5861z50.f40210a, c5861z50.f40211b, c5861z50.f40212c, c5861z50.f40213d, iArr, i16);
                                }
                                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                                c4682oK0.m(str);
                                c4682oK0.B("video/hevc");
                                c4682oK0.a(strD);
                                c4682oK0.G(c3670f80C.f35283d);
                                c4682oK0.k(c3670f80C.f35284e);
                                com.google.android.gms.internal.ads.Oz0 oz0 = new com.google.android.gms.internal.ads.Oz0();
                                oz0.c(c3670f80C.f35287h);
                                oz0.b(c3670f80C.f35288i);
                                oz0.d(c3670f80C.f35289j);
                                oz0.f(c3670f80C.f35281b + 8);
                                oz0.a(c3670f80C.f35282c + 8);
                                c4682oK0.b(oz0.g());
                                c4682oK0.w(c3670f80C.f35285f);
                                c4682oK0.s(c3670f80C.f35286g);
                                c4682oK0.n(java.util.Collections.singletonList(bArr));
                                com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                                this.f27963c.c(dH);
                                com.google.android.gms.internal.ads.AbstractC2164Ag0.l(dH.f26576q != -1);
                                this.f27961a.e(dH.f26576q);
                                this.f27965e = true;
                            }
                        }
                    }
                }
                if (this.f27970j.d(i14)) {
                    com.google.android.gms.internal.ads.R5 r12 = this.f27970j;
                    this.f27974n.j(this.f27970j.f31121d, com.google.android.gms.internal.ads.AbstractC4371lb0.b(r12.f31121d, r12.f31122e));
                    this.f27974n.m(5);
                    this.f27961a.a(j10, this.f27974n);
                }
                if (this.f27971k.d(i14)) {
                    com.google.android.gms.internal.ads.R5 r13 = this.f27971k;
                    this.f27974n.j(this.f27971k.f31121d, com.google.android.gms.internal.ads.AbstractC4371lb0.b(r13.f31121d, r13.f31122e));
                    this.f27974n.m(5);
                    this.f27961a.a(j10, this.f27974n);
                }
                int i17 = i11 >> 1;
                this.f27964d.e(j6, i13, i17, this.f27973m, this.f27965e);
                if (!this.f27965e) {
                    this.f27967g.c(i17);
                    this.f27968h.c(i17);
                    this.f27969i.c(i17);
                }
                this.f27970j.c(i17);
                this.f27971k.c(i17);
                iT = i10;
                iU = iU;
                bArrN = bArrN;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f27962b = c4543n6.b();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 2);
        this.f27963c = interfaceC3107a1S;
        this.f27964d = new com.google.android.gms.internal.ads.G5(interfaceC3107a1S);
        this.f27961a.b(interfaceC5520w0, c4543n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f27972l = 0L;
        this.f27973m = -9223372036854775807L;
        com.google.android.gms.internal.ads.AbstractC4371lb0.h(this.f27966f);
        this.f27967g.b();
        this.f27968h.b();
        this.f27969i.b();
        this.f27970j.b();
        this.f27971k.b();
        this.f27961a.c();
        com.google.android.gms.internal.ads.G5 g6 = this.f27964d;
        if (g6 != null) {
            g6.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f27973m = j6;
    }
}
