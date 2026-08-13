package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5310u5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f39087w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f39089b = new com.google.android.gms.internal.ads.RQ(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f39090c = new com.google.android.gms.internal.ads.C5128sR(java.util.Arrays.copyOf(f39087w, 10));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f39091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f39093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f39094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f39095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f39105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f39106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f39107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f39108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f39109v;

    public C5310u5(boolean z6, java.lang.String str, int i6) {
        h();
        this.f39101n = -1;
        this.f39102o = -1;
        this.f39105r = -9223372036854775807L;
        this.f39107t = -9223372036854775807L;
        this.f39088a = z6;
        this.f39091d = str;
        this.f39092e = i6;
    }

    public static boolean f(int i6) {
        return (i6 & 65526) == 65520;
    }

    private final void g() {
        this.f39100m = false;
        h();
    }

    private final void h() {
        this.f39096i = 0;
        this.f39097j = 0;
        this.f39098k = 256;
    }

    private final void i() {
        this.f39096i = 3;
        this.f39097j = 0;
    }

    private final void j(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, long j6, int i6, int i10) {
        this.f39096i = 4;
        this.f39097j = i6;
        this.f39108u = interfaceC3107a1;
        this.f39109v = j6;
        this.f39106s = i10;
    }

    private final boolean k(com.google.android.gms.internal.ads.C5128sR c5128sR, byte[] bArr, int i6) {
        int iMin = java.lang.Math.min(c5128sR.r(), i6 - this.f39097j);
        c5128sR.h(bArr, this.f39097j, iMin);
        int i10 = this.f39097j + iMin;
        this.f39097j = i10;
        return i10 == i6;
    }

    private static final boolean l(byte b6, byte b10) {
        return f((b10 & 255) | 65280);
    }

    private static final boolean m(com.google.android.gms.internal.ads.C5128sR c5128sR, byte[] bArr, int i6) {
        if (c5128sR.r() < i6) {
            return false;
        }
        c5128sR.h(bArr, 0, i6);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0292  */
    /* JADX WARN: Code duplicated, block: B:114:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x029a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0219  */
    /* JADX WARN: Code duplicated, block: B:78:0x0229  */
    /* JADX WARN: Code duplicated, block: B:80:0x0234  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238  */
    /* JADX WARN: Code duplicated, block: B:84:0x023b  */
    /* JADX WARN: Code duplicated, block: B:89:0x024a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iB;
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1;
        long j6;
        int i6;
        int i10;
        int i11;
        int i12;
        char c6;
        int i13;
        int i14;
        int iD;
        byte[] bArrN;
        int iU;
        int i15;
        byte b6;
        int i16;
        int i17;
        int i18;
        byte b10;
        int i19 = 0;
        int i20 = 2;
        this.f39094g.getClass();
        int i21 = com.google.android.gms.internal.ads.EW.f27061a;
        while (c5128sR.r() > 0) {
            int i22 = this.f39096i;
            int i23 = 13;
            char c10 = 7;
            if (i22 == 0) {
                byte[] bArrN2 = c5128sR.n();
                int iT = c5128sR.t();
                int iU2 = c5128sR.u();
                while (true) {
                    if (iT < iU2) {
                        int i24 = iT + 1;
                        byte b11 = bArrN2[iT];
                        int i25 = b11 & 255;
                        if (this.f39098k == 512 && l((byte) -1, (byte) i25)) {
                            if (!this.f39100m) {
                                int i26 = iT - 1;
                                c5128sR.l(iT);
                                if (m(c5128sR, this.f39089b.f31264a, 1)) {
                                    this.f39089b.l(4);
                                    int iD2 = this.f39089b.d(1);
                                    int i27 = this.f39101n;
                                    if (i27 != -1 && iD2 != i27) {
                                        c10 = 7;
                                    } else if (this.f39102o == -1) {
                                        if (m(c5128sR, this.f39089b.f31264a, 4)) {
                                            this.f39089b.l(14);
                                            iD = this.f39089b.d(i23);
                                            c10 = 7;
                                            if (iD >= 7) {
                                                bArrN = c5128sR.n();
                                                iU = c5128sR.u();
                                                i15 = i26 + iD;
                                                if (i15 >= iU) {
                                                    b6 = bArrN[i15];
                                                    if (b6 == -1) {
                                                        i18 = i15 + 1;
                                                        if (i18 != iU) {
                                                            b10 = bArrN[i18];
                                                            if (l((byte) -1, b10) || ((b10 & 8) >> 3) != iD2) {
                                                            }
                                                        }
                                                    } else if (b6 == 73 || ((i16 = i15 + 1) != iU && (bArrN[i16] != 68 || ((i17 = i15 + 2) != iU && bArrN[i17] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (m(c5128sR, this.f39089b.f31264a, 1)) {
                                        this.f39089b.l(i20);
                                        if (this.f39089b.d(4) == this.f39102o) {
                                            c5128sR.l(iT + 1);
                                            if (m(c5128sR, this.f39089b.f31264a, 4)) {
                                                this.f39089b.l(14);
                                                iD = this.f39089b.d(i23);
                                                c10 = 7;
                                                if (iD >= 7) {
                                                    bArrN = c5128sR.n();
                                                    iU = c5128sR.u();
                                                    i15 = i26 + iD;
                                                    if (i15 >= iU) {
                                                        b6 = bArrN[i15];
                                                        if (b6 == -1) {
                                                            i18 = i15 + 1;
                                                            if (i18 != iU) {
                                                                b10 = bArrN[i18];
                                                                if (l((byte) -1, b10)) {
                                                                }
                                                            }
                                                        } else if (b6 == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c10 = 7;
                                        }
                                    }
                                } else {
                                    c10 = c10;
                                }
                                i10 = this.f39098k;
                                i11 = i10 | i25;
                                if (i11 != 329) {
                                    i12 = 2;
                                    c6 = 3;
                                    i13 = 0;
                                    i14 = 768;
                                } else if (i11 != 511) {
                                    i12 = 2;
                                    c6 = 3;
                                    i13 = 0;
                                    i14 = 512;
                                } else if (i11 != 836) {
                                    i12 = 2;
                                    c6 = 3;
                                    i13 = 0;
                                    i14 = 1024;
                                } else if (i11 != 1075) {
                                    this.f39096i = 2;
                                    this.f39097j = 3;
                                    this.f39106s = 0;
                                    this.f39090c.l(0);
                                    c5128sR.l(i24);
                                    i20 = 2;
                                    i19 = 0;
                                } else if (i10 != 256) {
                                    this.f39098k = 256;
                                    i23 = 13;
                                    i19 = 0;
                                    i20 = 2;
                                } else {
                                    i12 = 2;
                                    c6 = 3;
                                    i13 = 0;
                                    i19 = i13;
                                    iT = i24;
                                    i20 = i12;
                                    i23 = 13;
                                }
                                this.f39098k = i14;
                                i19 = i13;
                                iT = i24;
                                i20 = i12;
                                i23 = 13;
                            }
                            this.f39103p = (b11 & 8) >> 3;
                            this.f39099l = 1 == ((b11 & 1) ^ 1);
                            if (this.f39100m) {
                                i();
                            } else {
                                this.f39096i = 1;
                                this.f39097j = 0;
                            }
                            c5128sR.l(i24);
                            i19 = 0;
                            i20 = 2;
                        } else {
                            c10 = c10;
                            i10 = this.f39098k;
                            i11 = i10 | i25;
                            if (i11 != 329) {
                                i12 = 2;
                                c6 = 3;
                                i13 = 0;
                                i14 = 768;
                            } else if (i11 != 511) {
                                i12 = 2;
                                c6 = 3;
                                i13 = 0;
                                i14 = 512;
                            } else if (i11 != 836) {
                                i12 = 2;
                                c6 = 3;
                                i13 = 0;
                                i14 = 1024;
                            } else if (i11 != 1075) {
                                this.f39096i = 2;
                                this.f39097j = 3;
                                this.f39106s = 0;
                                this.f39090c.l(0);
                                c5128sR.l(i24);
                                i20 = 2;
                                i19 = 0;
                            } else if (i10 != 256) {
                                this.f39098k = 256;
                                i23 = 13;
                                i19 = 0;
                                i20 = 2;
                            } else {
                                i12 = 2;
                                c6 = 3;
                                i13 = 0;
                                i19 = i13;
                                iT = i24;
                                i20 = i12;
                                i23 = 13;
                            }
                            this.f39098k = i14;
                            i19 = i13;
                            iT = i24;
                            i20 = i12;
                            i23 = 13;
                        }
                    } else {
                        c5128sR.l(iT);
                    }
                }
            } else if (i22 != 1) {
                if (i22 != i20) {
                    if (i22 != 3) {
                        int iMin = java.lang.Math.min(c5128sR.r(), this.f39106s - this.f39097j);
                        this.f39108u.a(c5128sR, iMin);
                        int i28 = this.f39097j + iMin;
                        this.f39097j = i28;
                        if (i28 == this.f39106s) {
                            com.google.android.gms.internal.ads.LC.f(this.f39107t != -9223372036854775807L ? 1 : i19);
                            this.f39108u.b(this.f39107t, 1, this.f39106s, 0, null);
                            this.f39107t += this.f39109v;
                            h();
                        }
                    } else {
                        if (k(c5128sR, this.f39089b.f31264a, true != this.f39099l ? 5 : 7)) {
                            this.f39089b.l(i19);
                            if (this.f39104q) {
                                this.f39089b.n(10);
                            } else {
                                int iD3 = this.f39089b.d(i20) + 1;
                                if (iD3 != i20) {
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("AdtsReader", "Detected audio object type: " + iD3 + ", but assuming AAC LC.");
                                }
                                this.f39089b.n(5);
                                int iD4 = this.f39089b.d(3);
                                int i29 = this.f39102o;
                                byte[] bArr = new byte[i20];
                                bArr[i19] = (byte) (((i29 >> 1) & 7) | 16);
                                bArr[1] = (byte) (((iD4 << 3) & 120) | ((i29 << 7) & 128));
                                com.google.android.gms.internal.ads.M mA = com.google.android.gms.internal.ads.O.a(bArr);
                                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                                c4682oK0.m(this.f39093f);
                                c4682oK0.B("audio/mp4a-latm");
                                c4682oK0.a(mA.f29623c);
                                c4682oK0.r0(mA.f29622b);
                                c4682oK0.C(mA.f29621a);
                                c4682oK0.n(java.util.Collections.singletonList(bArr));
                                c4682oK0.q(this.f39091d);
                                c4682oK0.y(this.f39092e);
                                com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                                this.f39105r = 1024000000 / ((long) dH.f26552E);
                                this.f39094g.c(dH);
                                this.f39104q = true;
                            }
                            this.f39089b.n(4);
                            int iD5 = this.f39089b.d(13);
                            iB = this.f39099l ? iD5 - 9 : iD5 - 7;
                            interfaceC3107a1 = this.f39094g;
                            j6 = this.f39105r;
                            i6 = 0;
                            j(interfaceC3107a1, j6, i6, iB);
                        }
                    }
                } else if (k(c5128sR, this.f39090c.n(), 10)) {
                    this.f39095h.a(this.f39090c, 10);
                    this.f39090c.l(6);
                    interfaceC3107a1 = this.f39095h;
                    i6 = 10;
                    iB = this.f39090c.B() + 10;
                    j6 = 0;
                    j(interfaceC3107a1, j6, i6, iB);
                }
            } else if (c5128sR.r() != 0) {
                com.google.android.gms.internal.ads.RQ rq = this.f39089b;
                rq.f31264a[i19] = c5128sR.n()[c5128sR.t()];
                rq.l(i20);
                int iD6 = this.f39089b.d(4);
                int i30 = this.f39102o;
                if (i30 == -1 || iD6 == i30) {
                    if (!this.f39100m) {
                        this.f39100m = true;
                        this.f39101n = this.f39103p;
                        this.f39102o = iD6;
                    }
                    i();
                } else {
                    g();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f39093f = c4543n6.b();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 1);
        this.f39094g = interfaceC3107a1S;
        this.f39108u = interfaceC3107a1S;
        if (!this.f39088a) {
            this.f39095h = new com.google.android.gms.internal.ads.C4641o0();
            return;
        }
        c4543n6.c();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S2 = interfaceC5520w0.S(c4543n6.a(), 5);
        this.f39095h = interfaceC3107a1S2;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.m(c4543n6.b());
        c4682oK0.B("application/id3");
        interfaceC3107a1S2.c(c4682oK0.H());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f39107t = -9223372036854775807L;
        g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f39107t = j6;
    }
}
