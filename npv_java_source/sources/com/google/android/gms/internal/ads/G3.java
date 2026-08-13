package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G3 implements com.google.android.gms.internal.ads.InterfaceC5190t0, com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f27628A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private com.google.android.gms.internal.ads.F2 f27629B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f27630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayDeque f27636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K3 f27637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f27638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3398ci0 f27639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f27642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5128sR f27644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f27649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f27650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f27651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.google.android.gms.internal.ads.F3[] f27652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long[][] f27653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f27655z;

    public G3() {
        this(com.google.android.gms.internal.ads.InterfaceC4869q4.f38162a, 16);
    }

    public G3(com.google.android.gms.internal.ads.InterfaceC4869q4 interfaceC4869q4, int i6) {
        this.f27630a = interfaceC4869q4;
        this.f27631b = i6;
        this.f27639j = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f27640k = (i6 & 4) != 0 ? 3 : 0;
        this.f27637h = new com.google.android.gms.internal.ads.K3();
        this.f27638i = new java.util.ArrayList();
        this.f27635f = new com.google.android.gms.internal.ads.C5128sR(16);
        this.f27636g = new java.util.ArrayDeque();
        this.f27632c = new com.google.android.gms.internal.ads.C5128sR(com.google.android.gms.internal.ads.AbstractC4371lb0.f37187a);
        this.f27633d = new com.google.android.gms.internal.ads.C5128sR(5);
        this.f27634e = new com.google.android.gms.internal.ads.C5128sR();
        this.f27645p = -1;
        this.f27651v = com.google.android.gms.internal.ads.InterfaceC5520w0.f39494n;
        this.f27652w = new com.google.android.gms.internal.ads.F3[0];
        this.f27649t = true;
    }

    private static int d(int i6) {
        if (i6 != 1751476579) {
            return i6 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int l(com.google.android.gms.internal.ads.Q3 q6, long j6) {
        int iA = q6.a(j6);
        return iA == -1 ? q6.b(j6) : iA;
    }

    private static long m(com.google.android.gms.internal.ads.Q3 q6, long j6, long j10) {
        int iL = l(q6, j6);
        return iL == -1 ? j10 : java.lang.Math.min(q6.f30867c[iL], j10);
    }

    private final void n() {
        this.f27640k = 0;
        this.f27643n = 0;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void o(long j6) {
        com.google.android.gms.internal.ads.C2227Cb c2227Cb;
        long j10;
        com.google.android.gms.internal.ads.I0 i6;
        com.google.android.gms.internal.ads.C2227Cb c2227Cb2;
        int i10;
        java.util.ArrayList arrayList;
        int i11;
        int i12;
        com.google.android.gms.internal.ads.C2227Cb c2227CbC;
        int i13;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        while (!this.f27636g.isEmpty() && ((com.google.android.gms.internal.ads.C4257kZ) this.f27636g.peek()).f36978b == j6) {
            com.google.android.gms.internal.ads.C4257kZ c4257kZ = (com.google.android.gms.internal.ads.C4257kZ) this.f27636g.pop();
            if (c4257kZ.f30137a == 1836019574) {
                com.google.android.gms.internal.ads.C4257kZ c4257kZB = c4257kZ.b(1835365473);
                new java.util.ArrayList();
                com.google.android.gms.internal.ads.C2227Cb c2227CbB = c4257kZB != null ? com.google.android.gms.internal.ads.AbstractC5416v3.b(c4257kZB) : null;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z6 = this.f27628A == i16 ? i16 : i15;
                com.google.android.gms.internal.ads.I0 i17 = new com.google.android.gms.internal.ads.I0();
                com.google.android.gms.internal.ads.LZ lzC = c4257kZ.c(1969517665);
                if (lzC != null) {
                    com.google.android.gms.internal.ads.C2227Cb c2227CbC2 = com.google.android.gms.internal.ads.AbstractC5416v3.c(lzC);
                    i17.b(c2227CbC2);
                    c2227Cb = c2227CbC2;
                } else {
                    c2227Cb = null;
                }
                com.google.android.gms.internal.ads.LZ lzC2 = c4257kZ.c(1836476516);
                lzC2.getClass();
                com.google.android.gms.internal.ads.InterfaceC3274bb[] interfaceC3274bbArr = new com.google.android.gms.internal.ads.InterfaceC3274bb[i16];
                interfaceC3274bbArr[i15] = com.google.android.gms.internal.ads.AbstractC5416v3.d(lzC2.f29519b);
                com.google.android.gms.internal.ads.C2227Cb c2227Cb3 = new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, interfaceC3274bbArr);
                java.util.ArrayList arrayList3 = arrayList2;
                long j11 = -9223372036854775807L;
                com.google.android.gms.internal.ads.I0 i18 = i17;
                java.util.List listF = com.google.android.gms.internal.ads.AbstractC5416v3.f(c4257kZ, i17, -9223372036854775807L, null, i16 != (this.f27631b & i16) ? i15 : i16, z6, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.E3
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (com.google.android.gms.internal.ads.N3) obj;
                    }
                });
                int i19 = i15;
                int i20 = i19;
                long j12 = -9223372036854775807L;
                int size = -1;
                while (true) {
                    j10 = 0;
                    if (i19 >= listF.size()) {
                        break;
                    }
                    com.google.android.gms.internal.ads.Q3 q6 = (com.google.android.gms.internal.ads.Q3) listF.get(i19);
                    if (q6.f30866b == 0) {
                        i11 = i16;
                        i6 = i18;
                        arrayList = arrayList3;
                    } else {
                        com.google.android.gms.internal.ads.N3 n6 = q6.f30865a;
                        int i21 = i20 + 1;
                        com.google.android.gms.internal.ads.F3 f6 = new com.google.android.gms.internal.ads.F3(n6, q6, this.f27651v.S(i20, n6.f30148b));
                        long j13 = n6.f30151e;
                        if (j13 == j11) {
                            j13 = q6.f30872h;
                        }
                        f6.f27278c.d(j13);
                        long jMax = java.lang.Math.max(j12, j13);
                        int i22 = "audio/true-hd".equals(n6.f30153g.f26574o) ? q6.f30869e * 16 : q6.f30869e + 30;
                        com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = n6.f30153g.b();
                        c4682oK0B.r(i22);
                        if (n6.f30148b == i14) {
                            com.google.android.gms.internal.ads.D d6 = n6.f30153g;
                            int i23 = this.f27631b;
                            int i24 = d6.f26565f;
                            if ((i23 & 8) != 0) {
                                i24 |= size == -1 ? 1 : 2;
                            }
                            if (d6.f26583x == -1.0f && j13 > 0 && (i13 = q6.f30866b) > 0) {
                                c4682oK0B.i(i13 / (j13 / 1000000.0f));
                            }
                            c4682oK0B.y(i24);
                        }
                        if (n6.f30148b == 1 && i18.a()) {
                            i6 = i18;
                            c4682oK0B.g(i6.f28363a);
                            c4682oK0B.h(i6.f28364b);
                        } else {
                            i6 = i18;
                        }
                        int i25 = n6.f30148b;
                        if (this.f27638i.isEmpty()) {
                            i10 = 3;
                            c2227Cb2 = null;
                        } else {
                            c2227Cb2 = new com.google.android.gms.internal.ads.C2227Cb(this.f27638i);
                            i10 = 3;
                        }
                        com.google.android.gms.internal.ads.C2227Cb[] c2227CbArr = new com.google.android.gms.internal.ads.C2227Cb[i10];
                        c2227CbArr[0] = c2227Cb2;
                        c2227CbArr[1] = c2227Cb;
                        c2227CbArr[2] = c2227Cb3;
                        com.google.android.gms.internal.ads.C2227Cb c2227Cb4 = new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, new com.google.android.gms.internal.ads.InterfaceC3274bb[0]);
                        if (c2227CbB != null) {
                            int i26 = 0;
                            while (i26 < c2227CbB.a()) {
                                com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bbB = c2227CbB.b(i26);
                                if (interfaceC3274bbB instanceof com.google.android.gms.internal.ads.JY) {
                                    com.google.android.gms.internal.ads.JY jy = (com.google.android.gms.internal.ads.JY) interfaceC3274bbB;
                                    if (!jy.f28702C.equals("com.android.capture.fps")) {
                                        i12 = 1;
                                        c2227CbC = c2227Cb4.c(jy);
                                    } else if (i25 == 2) {
                                        i12 = 1;
                                        c2227CbC = c2227Cb4.c(jy);
                                    } else {
                                        i12 = 1;
                                    }
                                    c2227Cb4 = c2227CbC;
                                } else {
                                    i12 = 1;
                                }
                                i26 += i12;
                            }
                        }
                        for (int i27 = 0; i27 < 3; i27++) {
                            c2227Cb4 = c2227Cb4.d(c2227CbArr[i27]);
                        }
                        if (c2227Cb4.a() > 0) {
                            c4682oK0B.t(c2227Cb4);
                        }
                        f6.f27278c.c(c4682oK0B.H());
                        if (n6.f30148b == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(f6);
                        i20 = i21;
                        j12 = jMax;
                        i11 = 1;
                    }
                    i19 += i11;
                    i18 = i6;
                    arrayList3 = arrayList;
                    listF = listF;
                    i14 = 2;
                    j11 = -9223372036854775807L;
                    i16 = i11;
                }
                this.f27654y = size;
                this.f27655z = j12;
                com.google.android.gms.internal.ads.F3[] f3Arr = (com.google.android.gms.internal.ads.F3[]) arrayList3.toArray(new com.google.android.gms.internal.ads.F3[0]);
                this.f27652w = f3Arr;
                int length = f3Arr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i28 = 0; i28 < f3Arr.length; i28++) {
                    jArr[i28] = new long[f3Arr[i28].f27277b.f30866b];
                    jArr2[i28] = f3Arr[i28].f27277b.f30870f[0];
                }
                int i29 = 0;
                int i30 = 0;
                while (i30 < f3Arr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i31 = -1;
                    for (int i32 = i29; i32 < f3Arr.length; i32++) {
                        if (!zArr[i32]) {
                            long j15 = jArr2[i32];
                            if (j15 <= j14) {
                                i31 = i32;
                                j14 = j15;
                            }
                        }
                    }
                    int i33 = iArr[i31];
                    long[] jArr3 = jArr[i31];
                    jArr3[i33] = j10;
                    com.google.android.gms.internal.ads.Q3 q10 = f3Arr[i31].f27277b;
                    j10 += (long) q10.f30868d[i33];
                    int i34 = i33 + 1;
                    iArr[i31] = i34;
                    if (i34 < jArr3.length) {
                        jArr2[i31] = q10.f30870f[i34];
                    } else {
                        zArr[i31] = true;
                        i30++;
                    }
                    i29 = 0;
                }
                this.f27653x = jArr;
                this.f27651v.Q();
                this.f27651v.R(this);
                this.f27636g.clear();
                this.f27640k = 2;
                i14 = 2;
                i16 = 1;
            } else {
                int i35 = i16;
                if (!this.f27636g.isEmpty()) {
                    ((com.google.android.gms.internal.ads.C4257kZ) this.f27636g.peek()).d(c4257kZ);
                }
                i16 = i35;
                i14 = 2;
            }
            i15 = 0;
        }
        if (this.f27640k != 2) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f27655z;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        long j10;
        long j11;
        int iB;
        com.google.android.gms.internal.ads.F3[] f3Arr = this.f27652w;
        if (f3Arr.length == 0) {
            com.google.android.gms.internal.ads.U0 u6 = com.google.android.gms.internal.ads.U0.f32077c;
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        int i6 = this.f27654y;
        long jM = -1;
        if (i6 != -1) {
            com.google.android.gms.internal.ads.Q3 q6 = f3Arr[i6].f27277b;
            int iL = l(q6, j6);
            if (iL == -1) {
                com.google.android.gms.internal.ads.U0 u10 = com.google.android.gms.internal.ads.U0.f32077c;
                return new com.google.android.gms.internal.ads.R0(u10, u10);
            }
            long j12 = q6.f30870f[iL];
            j10 = q6.f30867c[iL];
            if (j12 >= j6 || iL >= q6.f30866b - 1 || (iB = q6.b(j6)) == -1 || iB == iL) {
                j11 = -9223372036854775807L;
            } else {
                j11 = q6.f30870f[iB];
                jM = q6.f30867c[iB];
            }
            j6 = j12;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i10 = 0;
        while (true) {
            com.google.android.gms.internal.ads.F3[] f3Arr2 = this.f27652w;
            if (i10 >= f3Arr2.length) {
                break;
            }
            if (i10 != this.f27654y) {
                com.google.android.gms.internal.ads.Q3 q10 = f3Arr2[i10].f27277b;
                long jM2 = m(q10, j6, j10);
                if (j11 != -9223372036854775807L) {
                    jM = m(q10, j11, jM);
                }
                j10 = jM2;
            }
            i10++;
        }
        com.google.android.gms.internal.ads.U0 u11 = new com.google.android.gms.internal.ads.U0(j6, j10);
        return j11 == -9223372036854775807L ? new com.google.android.gms.internal.ads.R0(u11, u11) : new com.google.android.gms.internal.ads.R0(u11, new com.google.android.gms.internal.ads.U0(j11, jM));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f27636g.clear();
        this.f27643n = 0;
        this.f27645p = -1;
        this.f27646q = 0;
        this.f27647r = 0;
        this.f27648s = 0;
        this.f27649t = true;
        if (j6 == 0) {
            if (this.f27640k != 3) {
                n();
                return;
            } else {
                this.f27637h.b();
                this.f27638i.clear();
                return;
            }
        }
        for (com.google.android.gms.internal.ads.F3 f6 : this.f27652w) {
            com.google.android.gms.internal.ads.Q3 q6 = f6.f27277b;
            int iA = q6.a(j10);
            if (iA == -1) {
                iA = q6.b(j10);
            }
            f6.f27280e = iA;
            com.google.android.gms.internal.ads.C3217b1 c3217b1 = f6.f27279d;
            if (c3217b1 != null) {
                c3217b1.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return this.f27639j;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x036d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0397  */
    /* JADX WARN: Code duplicated, block: B:238:0x045d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0482  */
    /* JADX WARN: Code duplicated, block: B:244:0x0499  */
    /* JADX WARN: Code duplicated, block: B:245:0x049d  */
    /* JADX WARN: Code duplicated, block: B:251:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        char c6;
        int i10;
        int i11;
        boolean z6;
        int i12;
        long jE;
        long j6;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        long j12;
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        while (true) {
            int i16 = -1;
            int i17 = 1;
            while (true) {
                i6 = this.f27640k;
                if (i6 != 0) {
                    break;
                }
                boolean z10 = i17;
                if (this.f27643n != 0) {
                    i12 = -1;
                } else {
                    if (!interfaceC5300u0.J(this.f27635f.n(), 0, 8, z10)) {
                        if (this.f27628A != 2 || (this.f27631b & 2) == 0) {
                            return -1;
                        }
                        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = this.f27651v.S(0, 4);
                        com.google.android.gms.internal.ads.F2 f6 = this.f27629B;
                        com.google.android.gms.internal.ads.C2227Cb c2227Cb = f6 == null ? null : new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, f6);
                        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                        c4682oK0.t(c2227Cb);
                        interfaceC3107a1S.c(c4682oK0.H());
                        this.f27651v.Q();
                        this.f27651v.R(new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L));
                        return -1;
                    }
                    i12 = -1;
                    this.f27643n = 8;
                    this.f27635f.l(0);
                    this.f27642m = this.f27635f.K();
                    this.f27641l = this.f27635f.w();
                }
                long j13 = this.f27642m;
                if (j13 == 1) {
                    interfaceC5300u0.M(this.f27635f.n(), 8, 8);
                    this.f27643n += 8;
                    jE = this.f27635f.M();
                } else {
                    if (j13 == 0) {
                        long jF = interfaceC5300u0.f();
                        if (jF == -1) {
                            com.google.android.gms.internal.ads.C4257kZ c4257kZ = (com.google.android.gms.internal.ads.C4257kZ) this.f27636g.peek();
                            jF = c4257kZ != null ? c4257kZ.f36978b : -1L;
                        }
                        if (jF != -1) {
                            jE = (jF - interfaceC5300u0.e()) + ((long) this.f27643n);
                        }
                    }
                    j6 = this.f27642m;
                    i13 = this.f27643n;
                    if (j6 >= i13) {
                        throw com.google.android.gms.internal.ads.C4708of.c("Atom size less than header length (unsupported).");
                    }
                    i14 = this.f27641l;
                    if (i14 != 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1701082724) {
                        i15 = 1;
                        long jE2 = interfaceC5300u0.e();
                        j10 = this.f27642m;
                        long j14 = jE2 + j10;
                        j11 = this.f27643n;
                        if (j10 == j11 && this.f27641l == 1835365473) {
                            this.f27634e.i(8);
                            interfaceC5300u0.N(this.f27634e.n(), 0, 8);
                            com.google.android.gms.internal.ads.AbstractC5416v3.g(this.f27634e);
                            interfaceC5300u0.I(this.f27634e.t());
                            interfaceC5300u0.j();
                        }
                        j12 = j14 - j11;
                        this.f27636g.push(new com.google.android.gms.internal.ads.C4257kZ(this.f27641l, j12));
                        if (this.f27642m == this.f27643n) {
                            o(j12);
                        } else {
                            n();
                        }
                    } else {
                        if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124) {
                            com.google.android.gms.internal.ads.LC.f(i13 == 8);
                            com.google.android.gms.internal.ads.LC.f(this.f27642m <= 2147483647L);
                            c5128sR = new com.google.android.gms.internal.ads.C5128sR((int) this.f27642m);
                            java.lang.System.arraycopy(this.f27635f.n(), 0, c5128sR.n(), 0, 8);
                        } else {
                            long jE3 = interfaceC5300u0.e();
                            long j15 = this.f27643n;
                            long j16 = jE3 - j15;
                            if (this.f27641l == 1836086884) {
                                this.f27629B = new com.google.android.gms.internal.ads.F2(0L, j16, -9223372036854775807L, j16 + j15, this.f27642m - j15);
                            }
                            c5128sR = null;
                        }
                        this.f27644o = c5128sR;
                        i15 = 1;
                        this.f27640k = 1;
                    }
                    i17 = i15;
                    i16 = i12;
                }
                this.f27642m = jE;
                j6 = this.f27642m;
                i13 = this.f27643n;
                if (j6 >= i13) {
                    throw com.google.android.gms.internal.ads.C4708of.c("Atom size less than header length (unsupported).");
                }
                i14 = this.f27641l;
                if (i14 != 1836019574) {
                    i15 = 1;
                    long jE4 = interfaceC5300u0.e();
                    j10 = this.f27642m;
                    long j17 = jE4 + j10;
                    j11 = this.f27643n;
                    if (j10 == j11) {
                    }
                    j12 = j17 - j11;
                    this.f27636g.push(new com.google.android.gms.internal.ads.C4257kZ(this.f27641l, j12));
                    if (this.f27642m == this.f27643n) {
                        o(j12);
                    } else {
                        n();
                    }
                } else {
                    i15 = 1;
                    long jE5 = interfaceC5300u0.e();
                    j10 = this.f27642m;
                    long j18 = jE5 + j10;
                    j11 = this.f27643n;
                    if (j10 == j11) {
                    }
                    j12 = j18 - j11;
                    this.f27636g.push(new com.google.android.gms.internal.ads.C4257kZ(this.f27641l, j12));
                    if (this.f27642m == this.f27643n) {
                        o(j12);
                    } else {
                        n();
                    }
                }
                i17 = i15;
                i16 = i12;
            }
            if (i6 != i17) {
                if (i6 != 2) {
                    this.f27637h.a(interfaceC5300u0, q6, this.f27638i);
                    if (q6.f30855a == 0) {
                        n();
                    }
                    return i17;
                }
                long jE6 = interfaceC5300u0.e();
                int i18 = this.f27645p;
                if (i18 == i16) {
                    int i19 = i16;
                    int i20 = i19;
                    int i21 = i17;
                    int i22 = i21;
                    long j19 = Long.MAX_VALUE;
                    long j20 = Long.MAX_VALUE;
                    long j21 = Long.MAX_VALUE;
                    int i23 = 0;
                    while (true) {
                        com.google.android.gms.internal.ads.F3[] f3Arr = this.f27652w;
                        if (i23 >= f3Arr.length) {
                            break;
                        }
                        com.google.android.gms.internal.ads.F3 f10 = f3Arr[i23];
                        int i24 = f10.f27280e;
                        com.google.android.gms.internal.ads.Q3 q10 = f10.f27277b;
                        if (i24 != q10.f30866b) {
                            long j22 = q10.f30867c[i24];
                            long[][] jArr = this.f27653x;
                            int i25 = com.google.android.gms.internal.ads.EW.f27061a;
                            long j23 = jArr[i23][i24];
                            long j24 = j22 - jE6;
                            int i26 = (j24 < 0 || j24 >= 262144) ? i17 : 0;
                            if (i26 == 0) {
                                if (i22 == 0) {
                                    i11 = 0;
                                } else {
                                    i22 = i26;
                                    j20 = j23;
                                    i20 = i23;
                                    j21 = j24;
                                }
                                if (j23 < j19) {
                                    i21 = i26;
                                    j19 = j23;
                                    i19 = i23;
                                }
                            } else {
                                i11 = i22;
                            }
                            if (i26 != i11 || j24 >= j21) {
                                i22 = i11;
                            } else {
                                i22 = i26;
                                j20 = j23;
                                i20 = i23;
                                j21 = j24;
                            }
                            if (j23 < j19) {
                                i21 = i26;
                                j19 = j23;
                                i19 = i23;
                            }
                        }
                        i23 += i17;
                    }
                    i18 = (j19 == Long.MAX_VALUE || i21 == 0 || j20 < j19 + 10485760) ? i20 : i19;
                    this.f27645p = i18;
                    if (i18 == i16) {
                        return i16;
                    }
                }
                com.google.android.gms.internal.ads.F3 f11 = this.f27652w[i18];
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = f11.f27278c;
                int i27 = f11.f27280e;
                com.google.android.gms.internal.ads.Q3 q11 = f11.f27277b;
                long j25 = q11.f30867c[i27];
                int i28 = q11.f30868d[i27];
                com.google.android.gms.internal.ads.C3217b1 c3217b1 = f11.f27279d;
                long j26 = (j25 - jE6) + ((long) this.f27646q);
                if (j26 < 0 || j26 >= 262144) {
                    q6.f30855a = j25;
                    return 1;
                }
                if (f11.f27276a.f30154h == 1) {
                    j26 += 8;
                    i28 -= 8;
                }
                interfaceC5300u0.I((int) j26);
                if (j$.util.Objects.equals(f11.f27276a.f30153g.f26574o, "video/avc")) {
                    c6 = 1;
                } else {
                    c6 = 1;
                    this.f27649t = true;
                }
                com.google.android.gms.internal.ads.N3 n6 = f11.f27276a;
                int i29 = n6.f30157k;
                if (i29 == 0) {
                    if ("audio/ac4".equals(n6.f30153g.f26574o)) {
                        if (this.f27647r == 0) {
                            com.google.android.gms.internal.ads.V.b(i28, this.f27634e);
                            i10 = 7;
                            interfaceC3107a1.a(this.f27634e, 7);
                            this.f27647r += 7;
                        } else {
                            i10 = 7;
                        }
                        i28 += i10;
                    } else if (c3217b1 != null) {
                        c3217b1.d(interfaceC5300u0);
                    }
                    while (true) {
                        int i30 = this.f27647r;
                        if (i30 >= i28) {
                            break;
                        }
                        int iE = interfaceC3107a1.e(interfaceC5300u0, i28 - i30, false);
                        this.f27646q += iE;
                        this.f27647r += iE;
                        this.f27648s -= iE;
                    }
                } else {
                    byte[] bArrN = this.f27633d.n();
                    bArrN[0] = 0;
                    bArrN[c6] = 0;
                    bArrN[2] = 0;
                    int i31 = i29 + 1;
                    int i32 = 4 - i29;
                    while (this.f27647r < i28) {
                        int i33 = this.f27648s;
                        if (i33 == 0) {
                            interfaceC5300u0.M(bArrN, i32, i31);
                            this.f27646q += i31;
                            this.f27633d.l(0);
                            int iW = this.f27633d.w();
                            if (iW <= 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a("Invalid NAL length", null);
                            }
                            this.f27648s = iW - 1;
                            this.f27632c.l(0);
                            interfaceC3107a1.a(this.f27632c, 4);
                            interfaceC3107a1.a(this.f27633d, 1);
                            this.f27647r += 5;
                            i28 += i32;
                            if (!this.f27649t && com.google.android.gms.internal.ads.AbstractC4371lb0.i(bArrN[4])) {
                                this.f27649t = true;
                            }
                        } else {
                            int iE2 = interfaceC3107a1.e(interfaceC5300u0, i33, false);
                            this.f27646q += iE2;
                            this.f27647r += iE2;
                            this.f27648s -= iE2;
                        }
                    }
                }
                com.google.android.gms.internal.ads.Q3 q12 = f11.f27277b;
                long j27 = q12.f30870f[i27];
                int i34 = q12.f30871g[i27];
                if (!this.f27649t) {
                    i34 |= 67108864;
                }
                if (c3217b1 != null) {
                    c3217b1.c(interfaceC3107a1, j27, i34, i28, 0, null);
                    if (i27 + 1 == f11.f27277b.f30866b) {
                        c3217b1.a(interfaceC3107a1, null);
                    }
                } else {
                    interfaceC3107a1.b(j27, i34, i28, 0, null);
                }
                f11.f27280e++;
                this.f27645p = -1;
                this.f27646q = 0;
                this.f27647r = 0;
                this.f27648s = 0;
                this.f27649t = true;
                return 0;
            }
            long j28 = this.f27642m - ((long) this.f27643n);
            long jE7 = interfaceC5300u0.e() + j28;
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f27644o;
            if (c5128sR2 != null) {
                interfaceC5300u0.M(c5128sR2.n(), this.f27643n, (int) j28);
                if (this.f27641l == 1718909296) {
                    this.f27650u = true;
                    c5128sR2.l(8);
                    int iD = d(c5128sR2.w());
                    if (iD == 0) {
                        c5128sR2.m(4);
                        do {
                            if (c5128sR2.r() <= 0) {
                                iD = 0;
                                break;
                            }
                            iD = d(c5128sR2.w());
                        } while (iD == 0);
                    }
                    this.f27628A = iD;
                } else if (!this.f27636g.isEmpty()) {
                    ((com.google.android.gms.internal.ads.C4257kZ) this.f27636g.peek()).e(new com.google.android.gms.internal.ads.LZ(this.f27641l, c5128sR2));
                }
            } else {
                if (!this.f27650u && this.f27641l == 1835295092) {
                    this.f27628A = 1;
                }
                if (j28 < 262144) {
                    interfaceC5300u0.I((int) j28);
                } else {
                    q6.f30855a = interfaceC5300u0.e() + j28;
                    z6 = true;
                }
                o(jE7);
                if (!z6 && this.f27640k != 2) {
                    return 1;
                }
            }
            z6 = false;
            o(jE7);
            if (!z6) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.X0 x0B = com.google.android.gms.internal.ads.M3.b(interfaceC5300u0, (this.f27631b & 2) != 0);
        this.f27639j = x0B != null ? com.google.android.gms.internal.ads.AbstractC3398ci0.P(x0B) : com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        return x0B == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        if ((this.f27631b & 16) == 0) {
            interfaceC5520w0 = new com.google.android.gms.internal.ads.C5198t4(interfaceC5520w0, this.f27630a);
        }
        this.f27651v = interfaceC5520w0;
    }
}
