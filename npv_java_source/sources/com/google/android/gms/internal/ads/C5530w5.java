package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5530w5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f39519a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f39521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f39523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f39524f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f39528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f39529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39531m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39525g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f39534p = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f39520b = new java.util.concurrent.atomic.AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39532n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39533o = -1;

    public C5530w5(java.lang.String str, int i6, int i10) {
        this.f39519a = new com.google.android.gms.internal.ads.C5128sR(new byte[i10]);
        this.f39521c = str;
        this.f39522d = i6;
    }

    private final void f(com.google.android.gms.internal.ads.C4861q0 c4861q0) {
        int i6;
        int i10 = c4861q0.f38124b;
        if (i10 == -2147483647 || (i6 = c4861q0.f38125c) == -1) {
            return;
        }
        com.google.android.gms.internal.ads.D d6 = this.f39529k;
        if (d6 != null && i6 == d6.f26551D && i10 == d6.f26552E && j$.util.Objects.equals(c4861q0.f38123a, d6.f26574o)) {
            return;
        }
        com.google.android.gms.internal.ads.D d10 = this.f39529k;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = d10 == null ? new com.google.android.gms.internal.ads.C4682oK0() : d10.b();
        c4682oK0.m(this.f39523e);
        c4682oK0.B(c4861q0.f38123a);
        c4682oK0.r0(c4861q0.f38125c);
        c4682oK0.C(c4861q0.f38124b);
        c4682oK0.q(this.f39521c);
        c4682oK0.y(this.f39522d);
        com.google.android.gms.internal.ads.D dH = c4682oK0.H();
        this.f39529k = dH;
        this.f39524f.c(dH);
    }

    private final boolean g(com.google.android.gms.internal.ads.C5128sR c5128sR, byte[] bArr, int i6) {
        int iMin = java.lang.Math.min(c5128sR.r(), i6 - this.f39526h);
        c5128sR.h(bArr, this.f39526h, iMin);
        int i10 = this.f39526h + iMin;
        this.f39526h = i10;
        return i10 == i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1;
        com.google.android.gms.internal.ads.C5128sR c5128sR2;
        int i6;
        int i10;
        int i11;
        byte b6;
        boolean z6;
        int i12;
        int i13;
        byte b10;
        int i14;
        byte b11;
        int i15;
        int i16;
        byte b12;
        int i17;
        com.google.android.gms.internal.ads.LC.b(this.f39524f);
        while (c5128sR.r() > 0) {
            int i18 = this.f39525g;
            if (i18 == 0) {
                while (c5128sR.r() > 0) {
                    int i19 = this.f39527i << 8;
                    this.f39527i = i19;
                    int iC = i19 | c5128sR.C();
                    this.f39527i = iC;
                    int i20 = com.google.android.gms.internal.ads.AbstractC5080s0.f38609j;
                    if (iC == 2147385345 || iC == -25230976 || iC == 536864768 || iC == -14745368) {
                        i17 = 1;
                    } else if (iC == 1683496997 || iC == 622876772) {
                        i17 = 2;
                    } else if (iC == 1078008818 || iC == -233094848) {
                        i17 = 3;
                    } else {
                        i17 = (iC == 1908687592 || iC == -398277519) ? 4 : 0;
                    }
                    this.f39531m = i17;
                    if (i17 != 0) {
                        byte[] bArrN = this.f39519a.n();
                        int i21 = this.f39527i;
                        bArrN[0] = (byte) ((i21 >> 24) & 255);
                        bArrN[1] = (byte) ((i21 >> 16) & 255);
                        bArrN[2] = (byte) ((i21 >> 8) & 255);
                        bArrN[3] = (byte) (i21 & 255);
                        this.f39526h = 4;
                        this.f39527i = 0;
                        if (i17 != 3 && i17 != 4) {
                            if (i17 != 1) {
                                this.f39525g = 2;
                                break;
                            } else {
                                this.f39525g = 1;
                                break;
                            }
                        }
                        this.f39525g = 4;
                        break;
                    }
                }
            } else if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 != 4) {
                            if (i18 != 5) {
                                int iMin = java.lang.Math.min(c5128sR.r(), this.f39530l - this.f39526h);
                                this.f39524f.a(c5128sR, iMin);
                                int i22 = this.f39526h + iMin;
                                this.f39526h = i22;
                                if (i22 == this.f39530l) {
                                    com.google.android.gms.internal.ads.LC.f(this.f39534p != -9223372036854775807L);
                                    this.f39524f.b(this.f39534p, this.f39531m == 4 ? 0 : 1, this.f39530l, 0, null);
                                    this.f39534p += this.f39528j;
                                    this.f39525g = 0;
                                }
                            } else if (g(c5128sR, this.f39519a.n(), this.f39533o)) {
                                com.google.android.gms.internal.ads.C4861q0 c4861q0E = com.google.android.gms.internal.ads.AbstractC5080s0.e(this.f39519a.n(), this.f39520b);
                                if (this.f39531m == 3) {
                                    f(c4861q0E);
                                }
                                this.f39530l = c4861q0E.f38126d;
                                long j6 = c4861q0E.f38127e;
                                this.f39528j = j6 != -9223372036854775807L ? j6 : 0L;
                                this.f39519a.l(0);
                                interfaceC3107a1 = this.f39524f;
                                c5128sR2 = this.f39519a;
                                i6 = this.f39533o;
                                interfaceC3107a1.a(c5128sR2, i6);
                                this.f39525g = 6;
                            }
                        } else if (g(c5128sR, this.f39519a.n(), 6)) {
                            int iB = com.google.android.gms.internal.ads.AbstractC5080s0.b(this.f39519a.n());
                            this.f39533o = iB;
                            int i23 = this.f39526h;
                            if (i23 > iB) {
                                int i24 = i23 - iB;
                                this.f39526h = i23 - i24;
                                c5128sR.l(c5128sR.t() - i24);
                            }
                            this.f39525g = 5;
                        }
                    } else if (g(c5128sR, this.f39519a.n(), this.f39532n)) {
                        com.google.android.gms.internal.ads.C4861q0 c4861q0D = com.google.android.gms.internal.ads.AbstractC5080s0.d(this.f39519a.n());
                        f(c4861q0D);
                        this.f39530l = c4861q0D.f38126d;
                        long j10 = c4861q0D.f38127e;
                        this.f39528j = j10 != -9223372036854775807L ? j10 : 0L;
                        this.f39519a.l(0);
                        interfaceC3107a1 = this.f39524f;
                        c5128sR2 = this.f39519a;
                        i6 = this.f39532n;
                        interfaceC3107a1.a(c5128sR2, i6);
                        this.f39525g = 6;
                    }
                } else if (g(c5128sR, this.f39519a.n(), 7)) {
                    this.f39532n = com.google.android.gms.internal.ads.AbstractC5080s0.a(this.f39519a.n());
                    this.f39525g = 3;
                }
            } else if (g(c5128sR, this.f39519a.n(), 18)) {
                byte[] bArrN2 = this.f39519a.n();
                if (this.f39529k == null) {
                    com.google.android.gms.internal.ads.D dC = com.google.android.gms.internal.ads.AbstractC5080s0.c(bArrN2, this.f39523e, this.f39521c, this.f39522d, null);
                    this.f39529k = dC;
                    this.f39524f.c(dC);
                }
                int i25 = com.google.android.gms.internal.ads.AbstractC5080s0.f38609j;
                byte b13 = bArrN2[0];
                if (b13 != -2) {
                    if (b13 == -1) {
                        i15 = (3 & bArrN2[7]) << 12;
                        i16 = (bArrN2[6] & 255) << 4;
                        b12 = bArrN2[9];
                    } else if (b13 != 31) {
                        i10 = (bArrN2[5] & 3) << 12;
                        i11 = (bArrN2[6] & 255) << 4;
                        b6 = bArrN2[7];
                    } else {
                        i15 = (3 & bArrN2[6]) << 12;
                        i16 = (bArrN2[7] & 255) << 4;
                        b12 = bArrN2[8];
                    }
                    i12 = (i15 | i16 | ((b12 & 60) >> 2)) + 1;
                    z6 = true;
                    if (z6) {
                        i12 = (i12 * 16) / 14;
                    }
                    this.f39530l = i12;
                    if (b13 != -2) {
                        if (b13 != -1) {
                            i13 = (bArrN2[4] & 7) << 4;
                            b11 = bArrN2[7];
                        } else if (b13 != 31) {
                            i13 = (bArrN2[4] & 1) << 6;
                            b10 = bArrN2[5];
                        } else {
                            i13 = (bArrN2[5] & 7) << 4;
                            b11 = bArrN2[6];
                        }
                        i14 = b11 & 60;
                        this.f39528j = com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.EW.L((((i14 >> 2) | i13) + 1) * 32, this.f39529k.f26552E));
                        this.f39519a.l(0);
                        interfaceC3107a1 = this.f39524f;
                        c5128sR2 = this.f39519a;
                        i6 = 18;
                        interfaceC3107a1.a(c5128sR2, i6);
                        this.f39525g = 6;
                    } else {
                        i13 = (bArrN2[5] & 1) << 6;
                        b10 = bArrN2[4];
                    }
                    i14 = b10 & 252;
                    this.f39528j = com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.EW.L((((i14 >> 2) | i13) + 1) * 32, this.f39529k.f26552E));
                    this.f39519a.l(0);
                    interfaceC3107a1 = this.f39524f;
                    c5128sR2 = this.f39519a;
                    i6 = 18;
                    interfaceC3107a1.a(c5128sR2, i6);
                    this.f39525g = 6;
                } else {
                    i10 = (3 & bArrN2[4]) << 12;
                    i11 = (bArrN2[7] & 255) << 4;
                    b6 = bArrN2[6];
                }
                i12 = (i10 | i11 | ((b6 & 240) >> 4)) + 1;
                z6 = false;
                if (z6) {
                    i12 = (i12 * 16) / 14;
                }
                this.f39530l = i12;
                if (b13 != -2) {
                    if (b13 != -1) {
                        i13 = (bArrN2[4] & 7) << 4;
                        b11 = bArrN2[7];
                    } else if (b13 != 31) {
                        i13 = (bArrN2[4] & 1) << 6;
                        b10 = bArrN2[5];
                    } else {
                        i13 = (bArrN2[5] & 7) << 4;
                        b11 = bArrN2[6];
                    }
                    i14 = b11 & 60;
                    this.f39528j = com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.EW.L((((i14 >> 2) | i13) + 1) * 32, this.f39529k.f26552E));
                    this.f39519a.l(0);
                    interfaceC3107a1 = this.f39524f;
                    c5128sR2 = this.f39519a;
                    i6 = 18;
                    interfaceC3107a1.a(c5128sR2, i6);
                    this.f39525g = 6;
                } else {
                    i13 = (bArrN2[5] & 1) << 6;
                    b10 = bArrN2[4];
                }
                i14 = b10 & 252;
                this.f39528j = com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.EW.L((((i14 >> 2) | i13) + 1) * 32, this.f39529k.f26552E));
                this.f39519a.l(0);
                interfaceC3107a1 = this.f39524f;
                c5128sR2 = this.f39519a;
                i6 = 18;
                interfaceC3107a1.a(c5128sR2, i6);
                this.f39525g = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f39523e = c4543n6.b();
        this.f39524f = interfaceC5520w0.S(c4543n6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f39525g = 0;
        this.f39526h = 0;
        this.f39527i = 0;
        this.f39534p = -9223372036854775807L;
        this.f39520b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f39534p = j6;
    }
}
