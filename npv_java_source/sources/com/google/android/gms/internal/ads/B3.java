package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class B3 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final byte[] f25844J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.D f25845K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f25846A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f25847B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f25848C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f25849D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f25850E;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f25854I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f25855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f25857c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f25862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25863i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f25872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f25873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5128sR f25874t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f25875u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25876v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.gms.internal.ads.A3 f25880z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U1 f25864j = new com.google.android.gms.internal.ads.U1();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25865k = new com.google.android.gms.internal.ads.C5128sR(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25859e = new com.google.android.gms.internal.ads.C5128sR(com.google.android.gms.internal.ads.AbstractC4371lb0.f37187a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25860f = new com.google.android.gms.internal.ads.C5128sR(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25861g = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.ArrayDeque f25866l = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.ArrayDeque f25867m = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.util.SparseArray f25858d = new android.util.SparseArray();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3398ci0 f25869o = com.google.android.gms.internal.ads.AbstractC3398ci0.O();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f25878x = -9223372036854775807L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f25877w = -9223372036854775807L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f25879y = -9223372036854775807L;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f25851F = com.google.android.gms.internal.ads.InterfaceC5520w0.f39494n;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1[] f25852G = new com.google.android.gms.internal.ads.InterfaceC3107a1[0];

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1[] f25853H = new com.google.android.gms.internal.ads.InterfaceC3107a1[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4595nd0 f25868n = new com.google.android.gms.internal.ads.C4595nd0(new com.google.android.gms.internal.ads.InterfaceC4483mc0() { // from class: com.google.android.gms.internal.ads.y3
        @Override // com.google.android.gms.internal.ads.InterfaceC4483mc0
        public final void a(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
            this.f39977a.a(j6, c5128sR);
        }
    });

    static {
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B("application/x-emsg");
        f25845K = c4682oK0.H();
    }

    public B3(com.google.android.gms.internal.ads.InterfaceC4869q4 interfaceC4869q4, int i6, com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.N3 n6, java.util.List list, com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        this.f25855a = interfaceC4869q4;
        this.f25856b = i6;
        this.f25857c = j$.util.DesugarCollections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f25862h = bArr;
        this.f25863i = new com.google.android.gms.internal.ads.C5128sR(bArr);
    }

    private static int b(int i6) throws com.google.android.gms.internal.ads.C4708of {
        if (i6 >= 0) {
            return i6;
        }
        throw com.google.android.gms.internal.ads.C4708of.a("Unexpected negative value: " + i6, null);
    }

    private static com.google.android.gms.internal.ads.EH0 d(java.util.List list) {
        int i6;
        java.util.ArrayList arrayList;
        java.util.UUID[] uuidArr;
        com.google.android.gms.internal.ads.I3 i10;
        java.lang.StringBuilder sb;
        java.lang.String str;
        int size = list.size();
        int i11 = 0;
        java.util.ArrayList arrayList2 = null;
        while (i11 < size) {
            com.google.android.gms.internal.ads.LZ lz = (com.google.android.gms.internal.ads.LZ) list.get(i11);
            if (lz.f30137a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                byte[] bArrN = lz.f29519b.n();
                com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(bArrN);
                if (c5128sR.u() < 32) {
                    i6 = i11;
                    arrayList = arrayList2;
                    i10 = null;
                } else {
                    c5128sR.l(0);
                    int iR = c5128sR.r();
                    int iW = c5128sR.w();
                    if (iW != iR) {
                        sb = new java.lang.StringBuilder();
                        sb.append("Advertised atom size (");
                        sb.append(iW);
                        str = ") does not match buffer size: ";
                    } else {
                        iR = c5128sR.w();
                        if (iR != 1886614376) {
                            sb = new java.lang.StringBuilder();
                            str = "Atom type is not pssh: ";
                        } else {
                            int iA = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR.w());
                            if (iA > 1) {
                                sb = new java.lang.StringBuilder();
                                sb.append("Unsupported pssh version: ");
                                sb.append(iA);
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("PsshAtomUtil", sb.toString());
                                i6 = i11;
                                arrayList = arrayList2;
                                i10 = null;
                            } else {
                                java.util.UUID uuid = new java.util.UUID(c5128sR.J(), c5128sR.J());
                                if (iA == 1) {
                                    int iF = c5128sR.F();
                                    uuidArr = new java.util.UUID[iF];
                                    int i12 = 0;
                                    while (i12 < iF) {
                                        uuidArr[i12] = new java.util.UUID(c5128sR.J(), c5128sR.J());
                                        i12++;
                                        i11 = i11;
                                        arrayList2 = arrayList2;
                                    }
                                    i6 = i11;
                                    arrayList = arrayList2;
                                } else {
                                    i6 = i11;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iF2 = c5128sR.F();
                                int iR2 = c5128sR.r();
                                if (iF2 != iR2) {
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("PsshAtomUtil", "Atom data size (" + iF2 + ") does not match the bytes left: " + iR2);
                                    i10 = null;
                                } else {
                                    byte[] bArr = new byte[iF2];
                                    c5128sR.h(bArr, 0, iF2);
                                    i10 = new com.google.android.gms.internal.ads.I3(uuid, iA, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(iR);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("PsshAtomUtil", sb.toString());
                    i6 = i11;
                    arrayList = arrayList2;
                    i10 = null;
                }
                java.util.UUID uuid2 = i10 == null ? null : i10.f28380a;
                if (uuid2 == null) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(new com.google.android.gms.internal.ads.C3140aH0(uuid2, null, "video/mp4", bArrN));
                }
                i11 = i6 + 1;
            } else {
                i6 = i11;
            }
            i11 = i6 + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.EH0(arrayList2);
    }

    private final void g() {
        this.f25870p = 0;
        this.f25873s = 0;
    }

    private static void h(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, com.google.android.gms.internal.ads.P3 p6) throws com.google.android.gms.internal.ads.C4708of {
        c5128sR.l(i6 + 8);
        int iW = c5128sR.w();
        int i10 = com.google.android.gms.internal.ads.AbstractC5416v3.f39315b;
        if ((iW & 1) != 0) {
            throw com.google.android.gms.internal.ads.C4708of.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (iW & 2) != 0;
        int iF = c5128sR.F();
        if (iF == 0) {
            java.util.Arrays.fill(p6.f30632l, 0, p6.f30625e, false);
            return;
        }
        int i11 = p6.f30625e;
        if (iF != i11) {
            throw com.google.android.gms.internal.ads.C4708of.a("Senc sample count " + iF + " is different from fragment sample count" + i11, null);
        }
        java.util.Arrays.fill(p6.f30632l, 0, iF, z6);
        p6.a(c5128sR.r());
        com.google.android.gms.internal.ads.C5128sR c5128sR2 = p6.f30634n;
        c5128sR.h(c5128sR2.n(), 0, c5128sR2.u());
        p6.f30634n.l(0);
        p6.f30635o = false;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x041b  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0267  */
    private final void l(long j6) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.B3 b6;
        int i6;
        android.util.SparseArray sparseArray;
        int i10;
        int i11;
        int i12;
        com.google.android.gms.internal.ads.C4257kZ c4257kZ;
        byte[] bArr;
        int i13;
        int i14;
        byte[] bArr2;
        byte[] bArr3;
        int i15;
        boolean z6;
        int i16;
        int i17;
        com.google.android.gms.internal.ads.P3 p6;
        com.google.android.gms.internal.ads.A3 a6;
        boolean z10;
        int i18;
        int i19;
        int iW;
        boolean z11;
        int i20;
        final com.google.android.gms.internal.ads.B3 b10 = this;
        int i21 = 8;
        while (!b10.f25866l.isEmpty() && ((com.google.android.gms.internal.ads.C4257kZ) b10.f25866l.peek()).f36978b == j6) {
            com.google.android.gms.internal.ads.C4257kZ c4257kZ2 = (com.google.android.gms.internal.ads.C4257kZ) b10.f25866l.pop();
            int i22 = c4257kZ2.f30137a;
            int i23 = 12;
            if (i22 == 1836019574) {
                com.google.android.gms.internal.ads.EH0 eh0D = d(c4257kZ2.f36979c);
                com.google.android.gms.internal.ads.C4257kZ c4257kZB = c4257kZ2.b(1836475768);
                c4257kZB.getClass();
                android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                int size = c4257kZB.f36979c.size();
                long jK = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    com.google.android.gms.internal.ads.LZ lz = (com.google.android.gms.internal.ads.LZ) c4257kZB.f36979c.get(i24);
                    int i25 = lz.f30137a;
                    if (i25 == 1953654136) {
                        com.google.android.gms.internal.ads.C5128sR c5128sR = lz.f29519b;
                        c5128sR.l(i23);
                        android.util.Pair pairCreate = android.util.Pair.create(java.lang.Integer.valueOf(c5128sR.w()), new com.google.android.gms.internal.ads.C5526w3(c5128sR.w() - 1, c5128sR.w(), c5128sR.w(), c5128sR.w()));
                        sparseArray2.put(((java.lang.Integer) pairCreate.first).intValue(), (com.google.android.gms.internal.ads.C5526w3) pairCreate.second);
                    } else if (i25 == 1835362404) {
                        com.google.android.gms.internal.ads.C5128sR c5128sR2 = lz.f29519b;
                        c5128sR2.l(i21);
                        jK = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR2.w()) == 0 ? c5128sR2.K() : c5128sR2.M();
                    }
                    i24++;
                    i23 = 12;
                }
                java.util.List listF = com.google.android.gms.internal.ads.AbstractC5416v3.f(c4257kZ2, new com.google.android.gms.internal.ads.I0(), jK, eh0D, (b10.f25856b & 16) != 0, false, new com.google.android.gms.internal.ads.InterfaceC4821pg0(b10) { // from class: com.google.android.gms.internal.ads.x3
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (com.google.android.gms.internal.ads.N3) obj;
                    }
                });
                int size2 = listF.size();
                if (b10.f25858d.size() == 0) {
                    for (int i26 = 0; i26 < size2; i26++) {
                        com.google.android.gms.internal.ads.Q3 q6 = (com.google.android.gms.internal.ads.Q3) listF.get(i26);
                        com.google.android.gms.internal.ads.N3 n6 = q6.f30865a;
                        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = b10.f25851F.S(i26, n6.f30148b);
                        interfaceC3107a1S.d(n6.f30151e);
                        b10.f25858d.put(n6.f30147a, new com.google.android.gms.internal.ads.A3(interfaceC3107a1S, q6, m(sparseArray2, n6.f30147a)));
                        b10.f25878x = java.lang.Math.max(b10.f25878x, n6.f30151e);
                    }
                    b10.f25851F.Q();
                } else {
                    com.google.android.gms.internal.ads.LC.f(b10.f25858d.size() == size2);
                    for (int i27 = 0; i27 < size2; i27++) {
                        com.google.android.gms.internal.ads.Q3 q10 = (com.google.android.gms.internal.ads.Q3) listF.get(i27);
                        com.google.android.gms.internal.ads.N3 n10 = q10.f30865a;
                        ((com.google.android.gms.internal.ads.A3) b10.f25858d.get(n10.f30147a)).h(q10, m(sparseArray2, n10.f30147a));
                    }
                }
            } else {
                if (i22 == 1836019558) {
                    android.util.SparseArray sparseArray3 = b10.f25858d;
                    int i28 = b10.f25856b;
                    byte[] bArr4 = b10.f25862h;
                    int size3 = c4257kZ2.f36980d.size();
                    int i29 = 0;
                    while (i29 < size3) {
                        com.google.android.gms.internal.ads.C4257kZ c4257kZ3 = (com.google.android.gms.internal.ads.C4257kZ) c4257kZ2.f36980d.get(i29);
                        if (c4257kZ3.f30137a == 1953653094) {
                            com.google.android.gms.internal.ads.LZ lzC = c4257kZ3.c(1952868452);
                            lzC.getClass();
                            com.google.android.gms.internal.ads.C5128sR c5128sR3 = lzC.f29519b;
                            c5128sR3.l(i21);
                            int iW2 = c5128sR3.w();
                            int i30 = com.google.android.gms.internal.ads.AbstractC5416v3.f39315b;
                            com.google.android.gms.internal.ads.A3 a10 = (com.google.android.gms.internal.ads.A3) sparseArray3.get(c5128sR3.w());
                            if (a10 == null) {
                                a10 = null;
                            } else {
                                if ((iW2 & 1) != 0) {
                                    long jM = c5128sR3.M();
                                    com.google.android.gms.internal.ads.P3 p10 = a10.f25023b;
                                    p10.f30622b = jM;
                                    p10.f30623c = jM;
                                }
                                com.google.android.gms.internal.ads.C5526w3 c5526w3 = a10.f25026e;
                                a10.f25023b.f30621a = new com.google.android.gms.internal.ads.C5526w3((iW2 & 2) != 0 ? c5128sR3.w() - 1 : c5526w3.f39510a, (iW2 & 8) != 0 ? c5128sR3.w() : c5526w3.f39511b, (iW2 & 16) != 0 ? c5128sR3.w() : c5526w3.f39512c, (iW2 & 32) != 0 ? c5128sR3.w() : c5526w3.f39513d);
                            }
                            if (a10 == null) {
                                sparseArray = sparseArray3;
                                i10 = i28;
                                i11 = size3;
                                i12 = i29;
                                c4257kZ = c4257kZ2;
                                bArr = bArr4;
                                i13 = i21;
                            } else {
                                com.google.android.gms.internal.ads.P3 p11 = a10.f25023b;
                                long j10 = p11.f30636p;
                                boolean z12 = p11.f30637q;
                                a10.i();
                                a10.f25033l = true;
                                com.google.android.gms.internal.ads.LZ lzC2 = c4257kZ3.c(1952867444);
                                if (lzC2 == null || (i28 & 2) != 0) {
                                    p11.f30636p = j10;
                                    p11.f30637q = z12;
                                } else {
                                    com.google.android.gms.internal.ads.C5128sR c5128sR4 = lzC2.f29519b;
                                    c5128sR4.l(i21);
                                    p11.f30636p = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR4.w()) == 1 ? c5128sR4.M() : c5128sR4.K();
                                    p11.f30637q = true;
                                }
                                java.util.List list = c4257kZ3.f36979c;
                                int size4 = list.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    android.util.SparseArray sparseArray4 = sparseArray3;
                                    com.google.android.gms.internal.ads.LZ lz2 = (com.google.android.gms.internal.ads.LZ) list.get(i31);
                                    int i34 = size3;
                                    if (lz2.f30137a == 1953658222) {
                                        com.google.android.gms.internal.ads.C5128sR c5128sR5 = lz2.f29519b;
                                        c5128sR5.l(12);
                                        int iF = c5128sR5.F();
                                        if (iF > 0) {
                                            i33 += iF;
                                            i20 = 1;
                                            i32++;
                                        } else {
                                            i20 = 1;
                                        }
                                    } else {
                                        i20 = 1;
                                    }
                                    i31 += i20;
                                    size3 = i34;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i11 = size3;
                                a10.f25029h = 0;
                                a10.f25028g = 0;
                                a10.f25027f = 0;
                                com.google.android.gms.internal.ads.P3 p12 = a10.f25023b;
                                p12.f30624d = i32;
                                p12.f30625e = i33;
                                if (p12.f30627g.length < i32) {
                                    p12.f30626f = new long[i32];
                                    p12.f30627g = new int[i32];
                                }
                                if (p12.f30628h.length < i33) {
                                    int i35 = (i33 * 125) / 100;
                                    p12.f30628h = new int[i35];
                                    p12.f30629i = new long[i35];
                                    p12.f30630j = new boolean[i35];
                                    p12.f30632l = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    long j11 = 0;
                                    if (i36 >= size4) {
                                        break;
                                    }
                                    com.google.android.gms.internal.ads.LZ lz3 = (com.google.android.gms.internal.ads.LZ) list.get(i36);
                                    if (lz3.f30137a == i14) {
                                        int i39 = i37 + 1;
                                        com.google.android.gms.internal.ads.C5128sR c5128sR6 = lz3.f29519b;
                                        c5128sR6.l(8);
                                        int iW3 = c5128sR6.w();
                                        com.google.android.gms.internal.ads.N3 n11 = a10.f25025d.f30865a;
                                        com.google.android.gms.internal.ads.P3 p13 = a10.f25023b;
                                        com.google.android.gms.internal.ads.C5526w3 c5526w4 = p13.f30621a;
                                        int i40 = com.google.android.gms.internal.ads.EW.f27061a;
                                        p13.f30627g[i37] = c5128sR6.F();
                                        long[] jArr = p13.f30626f;
                                        long j12 = p13.f30622b;
                                        jArr[i37] = j12;
                                        if ((iW3 & 1) != 0) {
                                            jArr[i37] = j12 + ((long) c5128sR6.w());
                                        }
                                        boolean z13 = (iW3 & 4) != 0;
                                        int iW4 = c5526w4.f39513d;
                                        if (z13) {
                                            iW4 = c5128sR6.w();
                                        }
                                        int i41 = iW3 & 256;
                                        int i42 = iW3 & 512;
                                        int i43 = iW3 & 1024;
                                        int i44 = iW3 & 2048;
                                        long[] jArr2 = n11.f30155i;
                                        if (jArr2 != null) {
                                            i18 = iW4;
                                            p6 = p11;
                                            if (jArr2.length != 1 || n11.f30156j == null) {
                                                z10 = z13;
                                                i19 = i36;
                                                a6 = a10;
                                            } else {
                                                long j13 = jArr2[0];
                                                if (j13 == 0) {
                                                    z10 = z13;
                                                    i19 = i36;
                                                    a6 = a10;
                                                } else {
                                                    a6 = a10;
                                                    long j14 = n11.f30150d;
                                                    java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
                                                    long jM2 = com.google.android.gms.internal.ads.EW.M(j13, 1000000L, j14, roundingMode);
                                                    z10 = z13;
                                                    i19 = i36;
                                                    if (jM2 + com.google.android.gms.internal.ads.EW.M(n11.f30156j[0], 1000000L, n11.f30149c, roundingMode) >= n11.f30151e) {
                                                    }
                                                }
                                                j11 = n11.f30156j[0];
                                            }
                                        } else {
                                            z10 = z13;
                                            i18 = iW4;
                                            p6 = p11;
                                            a6 = a10;
                                            i19 = i36;
                                        }
                                        int[] iArr = p13.f30628h;
                                        long[] jArr3 = p13.f30629i;
                                        boolean[] zArr = p13.f30630j;
                                        i16 = i19;
                                        boolean z14 = n11.f30148b == 2 && (i28 & 1) != 0;
                                        int i45 = i38 + p13.f30627g[i37];
                                        long j15 = n11.f30149c;
                                        i17 = i28;
                                        long j16 = p13.f30636p;
                                        boolean z15 = z14;
                                        int i46 = i38;
                                        while (i46 < i45) {
                                            int iW5 = i41 != 0 ? c5128sR6.w() : c5526w4.f39511b;
                                            b(iW5);
                                            int iW6 = i42 != 0 ? c5128sR6.w() : c5526w4.f39512c;
                                            b(iW6);
                                            if (i43 != 0) {
                                                iW = c5128sR6.w();
                                            } else if (i46 != 0) {
                                                iW = c5526w4.f39513d;
                                            } else if (z10) {
                                                iW = i18;
                                                i46 = 0;
                                            } else {
                                                i46 = 0;
                                                iW = c5526w4.f39513d;
                                            }
                                            long jM3 = com.google.android.gms.internal.ads.EW.M((((long) (i44 != 0 ? c5128sR6.w() : 0)) + j16) - j11, 1000000L, j15, java.math.RoundingMode.DOWN);
                                            jArr3[i46] = jM3;
                                            if (!p13.f30637q) {
                                                jArr3[i46] = jM3 + a6.f25025d.f30872h;
                                            }
                                            iArr[i46] = iW6;
                                            if (((iW >> 16) & 1) != 0) {
                                                z11 = false;
                                            } else if (!z15) {
                                                z11 = true;
                                            } else if (i46 == 0) {
                                                z11 = true;
                                                i46 = 0;
                                            } else {
                                                z11 = false;
                                            }
                                            zArr[i46] = z11;
                                            j16 += (long) iW5;
                                            i46++;
                                            j15 = j15;
                                            i45 = i45;
                                            i41 = i41;
                                            i42 = i42;
                                            c5526w4 = c5526w4;
                                            i43 = i43;
                                        }
                                        int i47 = i45;
                                        p13.f30636p = j16;
                                        i37 = i39;
                                        i38 = i47;
                                    } else {
                                        i16 = i36;
                                        i17 = i28;
                                        bArr4 = bArr4;
                                        p6 = p11;
                                        c4257kZ3 = c4257kZ3;
                                        a6 = a10;
                                    }
                                    i36 = i16 + 1;
                                    a10 = a6;
                                    list = list;
                                    size4 = size4;
                                    c4257kZ2 = c4257kZ2;
                                    i29 = i29;
                                    bArr4 = bArr4;
                                    c4257kZ3 = c4257kZ3;
                                    p11 = p6;
                                    i28 = i17;
                                    i14 = 1953658222;
                                }
                                i10 = i28;
                                byte[] bArr5 = bArr4;
                                i12 = i29;
                                c4257kZ = c4257kZ2;
                                com.google.android.gms.internal.ads.P3 p14 = p11;
                                com.google.android.gms.internal.ads.C4257kZ c4257kZ4 = c4257kZ3;
                                com.google.android.gms.internal.ads.N3 n12 = a10.f25025d.f30865a;
                                com.google.android.gms.internal.ads.C5526w3 c5526w5 = p14.f30621a;
                                c5526w5.getClass();
                                com.google.android.gms.internal.ads.O3 o3B = n12.b(c5526w5.f39510a);
                                com.google.android.gms.internal.ads.LZ lzC3 = c4257kZ4.c(1935763834);
                                if (lzC3 != null) {
                                    o3B.getClass();
                                    int i48 = o3B.f30440d;
                                    com.google.android.gms.internal.ads.C5128sR c5128sR7 = lzC3.f29519b;
                                    c5128sR7.l(8);
                                    if ((c5128sR7.w() & 1) == 1) {
                                        c5128sR7.m(8);
                                    }
                                    int iC = c5128sR7.C();
                                    int iF2 = c5128sR7.F();
                                    int i49 = p14.f30625e;
                                    if (iF2 > i49) {
                                        throw com.google.android.gms.internal.ads.C4708of.a("Saiz sample count " + iF2 + " is greater than fragment sample count" + i49, null);
                                    }
                                    if (iC == 0) {
                                        boolean[] zArr2 = p14.f30632l;
                                        i15 = 0;
                                        for (int i50 = 0; i50 < iF2; i50++) {
                                            int iC2 = c5128sR7.C();
                                            i15 += iC2;
                                            zArr2[i50] = iC2 > i48;
                                        }
                                        z6 = false;
                                    } else {
                                        boolean z16 = iC > i48;
                                        i15 = iC * iF2;
                                        z6 = false;
                                        java.util.Arrays.fill(p14.f30632l, 0, iF2, z16);
                                    }
                                    java.util.Arrays.fill(p14.f30632l, iF2, p14.f30625e, z6);
                                    if (i15 > 0) {
                                        p14.a(i15);
                                    }
                                }
                                com.google.android.gms.internal.ads.LZ lzC4 = c4257kZ4.c(1935763823);
                                if (lzC4 != null) {
                                    com.google.android.gms.internal.ads.C5128sR c5128sR8 = lzC4.f29519b;
                                    c5128sR8.l(8);
                                    int iW7 = c5128sR8.w();
                                    if ((iW7 & 1) == 1) {
                                        c5128sR8.m(8);
                                    }
                                    int iF3 = c5128sR8.F();
                                    if (iF3 != 1) {
                                        throw com.google.android.gms.internal.ads.C4708of.a("Unexpected saio entry count: " + iF3, null);
                                    }
                                    p14.f30623c += com.google.android.gms.internal.ads.AbstractC5416v3.a(iW7) == 0 ? c5128sR8.K() : c5128sR8.M();
                                }
                                com.google.android.gms.internal.ads.LZ lzC5 = c4257kZ4.c(1936027235);
                                if (lzC5 != null) {
                                    h(lzC5.f29519b, 0, p14);
                                }
                                java.lang.String str = o3B != null ? o3B.f30438b : null;
                                com.google.android.gms.internal.ads.C5128sR c5128sR9 = null;
                                com.google.android.gms.internal.ads.C5128sR c5128sR10 = null;
                                for (int i51 = 0; i51 < c4257kZ4.f36979c.size(); i51++) {
                                    com.google.android.gms.internal.ads.LZ lz4 = (com.google.android.gms.internal.ads.LZ) c4257kZ4.f36979c.get(i51);
                                    com.google.android.gms.internal.ads.C5128sR c5128sR11 = lz4.f29519b;
                                    int i52 = lz4.f30137a;
                                    if (i52 == 1935828848) {
                                        c5128sR11.l(12);
                                        if (c5128sR11.w() == 1936025959) {
                                            c5128sR9 = c5128sR11;
                                        }
                                    } else if (i52 == 1936158820) {
                                        c5128sR11.l(12);
                                        if (c5128sR11.w() == 1936025959) {
                                            c5128sR10 = c5128sR11;
                                        }
                                    }
                                }
                                if (c5128sR9 != null && c5128sR10 != null) {
                                    c5128sR9.l(8);
                                    int iA = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR9.w());
                                    c5128sR9.m(4);
                                    if (iA == 1) {
                                        c5128sR9.m(4);
                                    }
                                    if (c5128sR9.w() != 1) {
                                        throw com.google.android.gms.internal.ads.C4708of.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    c5128sR10.l(8);
                                    int iA2 = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR10.w());
                                    c5128sR10.m(4);
                                    if (iA2 == 1) {
                                        if (c5128sR10.K() == 0) {
                                            throw com.google.android.gms.internal.ads.C4708of.c("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iA2 >= 2) {
                                        c5128sR10.m(4);
                                    }
                                    if (c5128sR10.K() != 1) {
                                        throw com.google.android.gms.internal.ads.C4708of.c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    c5128sR10.m(1);
                                    int iC3 = c5128sR10.C();
                                    int i53 = (iC3 & 240) >> 4;
                                    int i54 = iC3 & 15;
                                    if (c5128sR10.C() == 1) {
                                        int iC4 = c5128sR10.C();
                                        byte[] bArr6 = new byte[16];
                                        c5128sR10.h(bArr6, 0, 16);
                                        if (iC4 == 0) {
                                            int iC5 = c5128sR10.C();
                                            byte[] bArr7 = new byte[iC5];
                                            c5128sR10.h(bArr7, 0, iC5);
                                            bArr3 = bArr7;
                                        } else {
                                            bArr3 = null;
                                        }
                                        p14.f30631k = true;
                                        p14.f30633m = new com.google.android.gms.internal.ads.O3(true, str, iC4, bArr6, i53, i54, bArr3);
                                    }
                                }
                                int size5 = c4257kZ4.f36979c.size();
                                int i55 = 0;
                                while (i55 < size5) {
                                    com.google.android.gms.internal.ads.LZ lz5 = (com.google.android.gms.internal.ads.LZ) c4257kZ4.f36979c.get(i55);
                                    if (lz5.f30137a == 1970628964) {
                                        com.google.android.gms.internal.ads.C5128sR c5128sR12 = lz5.f29519b;
                                        c5128sR12.l(8);
                                        bArr2 = bArr5;
                                        c5128sR12.h(bArr2, 0, 16);
                                        if (java.util.Arrays.equals(bArr2, f25844J)) {
                                            h(c5128sR12, 16, p14);
                                        }
                                    } else {
                                        bArr2 = bArr5;
                                    }
                                    i55++;
                                    bArr5 = bArr2;
                                }
                                bArr = bArr5;
                                i13 = 8;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            i10 = i28;
                            i11 = size3;
                            i12 = i29;
                            c4257kZ = c4257kZ2;
                            bArr = bArr4;
                            i13 = i21;
                        }
                        i21 = i13;
                        bArr4 = bArr;
                        size3 = i11;
                        sparseArray3 = sparseArray;
                        c4257kZ2 = c4257kZ;
                        i28 = i10;
                        i29 = i12 + 1;
                    }
                    i6 = i21;
                    com.google.android.gms.internal.ads.EH0 eh0D2 = d(c4257kZ2.f36979c);
                    b6 = this;
                    if (eh0D2 != null) {
                        int size6 = b6.f25858d.size();
                        for (int i56 = 0; i56 < size6; i56++) {
                            com.google.android.gms.internal.ads.A3 a11 = (com.google.android.gms.internal.ads.A3) b6.f25858d.valueAt(i56);
                            com.google.android.gms.internal.ads.N3 n13 = a11.f25025d.f30865a;
                            com.google.android.gms.internal.ads.C5526w3 c5526w6 = a11.f25023b.f30621a;
                            int i57 = com.google.android.gms.internal.ads.EW.f27061a;
                            com.google.android.gms.internal.ads.O3 o3B2 = n13.b(c5526w6.f39510a);
                            com.google.android.gms.internal.ads.EH0 eh0B = eh0D2.b(o3B2 != null ? o3B2.f30438b : null);
                            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = a11.f25025d.f30865a.f30153g.b();
                            c4682oK0B.f(eh0B);
                            a11.f25022a.c(c4682oK0B.H());
                        }
                    }
                    if (b6.f25877w != -9223372036854775807L) {
                        int size7 = b6.f25858d.size();
                        for (int i58 = 0; i58 < size7; i58++) {
                            com.google.android.gms.internal.ads.A3 a12 = (com.google.android.gms.internal.ads.A3) b6.f25858d.valueAt(i58);
                            long j17 = b6.f25877w;
                            int i59 = a12.f25027f;
                            while (true) {
                                com.google.android.gms.internal.ads.P3 p15 = a12.f25023b;
                                if (i59 >= p15.f30625e || p15.f30629i[i59] > j17) {
                                    break;
                                }
                                if (p15.f30630j[i59]) {
                                    a12.f25030i = i59;
                                }
                                i59++;
                            }
                        }
                        b6.f25877w = -9223372036854775807L;
                    }
                } else {
                    b6 = b10;
                    i6 = i21;
                    if (!b6.f25866l.isEmpty()) {
                        ((com.google.android.gms.internal.ads.C4257kZ) b6.f25866l.peek()).d(c4257kZ2);
                    }
                }
                b10 = b6;
                i21 = i6;
            }
        }
        g();
    }

    private static final com.google.android.gms.internal.ads.C5526w3 m(android.util.SparseArray sparseArray, int i6) {
        if (sparseArray.size() == 1) {
            return (com.google.android.gms.internal.ads.C5526w3) sparseArray.valueAt(0);
        }
        com.google.android.gms.internal.ads.C5526w3 c5526w3 = (com.google.android.gms.internal.ads.C5526w3) sparseArray.get(i6);
        c5526w3.getClass();
        return c5526w3;
    }

    final /* synthetic */ void a(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.AbstractC3543e0.a(j6, c5128sR, this.f25853H);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        int size = this.f25858d.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((com.google.android.gms.internal.ads.A3) this.f25858d.valueAt(i6)).i();
        }
        this.f25867m.clear();
        this.f25876v = 0;
        this.f25868n.c();
        this.f25877w = j10;
        this.f25866l.clear();
        g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return this.f25869o;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x0250  */
    /* JADX WARN: Code duplicated, block: B:110:0x0256  */
    /* JADX WARN: Code duplicated, block: B:114:0x0272  */
    /* JADX WARN: Code duplicated, block: B:115:0x0277  */
    /* JADX WARN: Code duplicated, block: B:119:0x028e  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:124:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:221:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:229:0x0610  */
    /* JADX WARN: Code duplicated, block: B:231:0x0619 A[LOOP:2: B:230:0x0617->B:231:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x063b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x062e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0268 A[EDGE_INSN: B:377:0x0268->B:112:0x0268 BREAK  A[LOOP:5: B:66:0x0134->B:68:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0134 A[LOOP:5: B:66:0x0134->B:68:0x013a, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:68:0x013a A[LOOP:5: B:66:0x0134->B:68:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0173  */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        boolean z6;
        int i6;
        long jM;
        long jM2;
        java.lang.String str;
        java.lang.String str2;
        long jK;
        long j6;
        java.util.ArrayDeque arrayDeque;
        com.google.android.gms.internal.ads.C5856z3 c5856z3;
        long jM3;
        long jM4;
        com.google.android.gms.internal.ads.A3 a6;
        com.google.android.gms.internal.ads.N3 n6;
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1;
        long jE;
        int i10;
        byte[] bArrN;
        int i11;
        int i12;
        int i13;
        int iE;
        int i14;
        int iW;
        boolean z10;
        java.lang.String str3;
        com.google.android.gms.internal.ads.O3 o3F;
        com.google.android.gms.internal.ads.Z0 z11;
        int i15;
        com.google.android.gms.internal.ads.C5856z3 c5856z4;
        long j10;
        com.google.android.gms.internal.ads.InterfaceC3107a1[] interfaceC3107a1Arr;
        int length;
        int i16;
        int i17;
        int i18;
        int iC;
        long jE2;
        long j11;
        long j12;
        long jE3;
        int i19;
        int i20;
        long jE4;
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        int size;
        int i21;
        com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u1 = interfaceC5300u0;
        loop0: while (true) {
            z6 = true;
            while (true) {
                int i22 = this.f25870p;
                i6 = 0;
                if (i22 == 0) {
                    if (this.f25873s == 0) {
                        if (!interfaceC5300u1.J(this.f25865k.n(), 0, 8, true)) {
                            this.f25868n.c();
                            return -1;
                        }
                        this.f25873s = 8;
                        this.f25865k.l(0);
                        this.f25872r = this.f25865k.K();
                        this.f25871q = this.f25865k.w();
                    }
                    long j13 = this.f25872r;
                    if (j13 == 1) {
                        interfaceC5300u1.M(this.f25865k.n(), 8, 8);
                        this.f25873s += 8;
                        jE2 = this.f25865k.M();
                    } else {
                        if (j13 == 0) {
                            long jF = interfaceC5300u0.f();
                            if (jF == -1) {
                                jF = !this.f25866l.isEmpty() ? ((com.google.android.gms.internal.ads.C4257kZ) this.f25866l.peek()).f36978b : -1L;
                            }
                            if (jF != -1) {
                                jE2 = (jF - interfaceC5300u0.e()) + ((long) this.f25873s);
                            }
                        }
                        j11 = this.f25872r;
                        j12 = this.f25873s;
                        if (j11 >= j12) {
                            throw com.google.android.gms.internal.ads.C4708of.c("Atom size less than header length (unsupported).");
                        }
                        jE3 = interfaceC5300u0.e() - j12;
                        i19 = this.f25871q;
                        if ((i19 != 1836019558 || i19 == 1835295092) && !this.f25854I) {
                            this.f25851F.R(new com.google.android.gms.internal.ads.S0(this.f25878x, jE3));
                            this.f25854I = true;
                        }
                        if (this.f25871q == 1836019558) {
                            size = this.f25858d.size();
                            for (i21 = 0; i21 < size; i21++) {
                                com.google.android.gms.internal.ads.P3 p6 = ((com.google.android.gms.internal.ads.A3) this.f25858d.valueAt(i21)).f25023b;
                                p6.f30623c = jE3;
                                p6.f30622b = jE3;
                            }
                        }
                        i20 = this.f25871q;
                        if (i20 == 1835295092) {
                            this.f25880z = null;
                            this.f25875u = jE3 + this.f25872r;
                            this.f25870p = 2;
                            break;
                        }
                        if (i20 != 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1836019558 || i20 == 1953653094 || i20 == 1836475768 || i20 == 1701082227) {
                            z6 = true;
                            z6 = true;
                            jE4 = (interfaceC5300u0.e() + this.f25872r) - 8;
                            this.f25866l.push(new com.google.android.gms.internal.ads.C4257kZ(i20, jE4));
                            if (this.f25872r == this.f25873s) {
                                l(jE4);
                            } else {
                                g();
                            }
                        } else {
                            if (i20 == 1751411826 || i20 == 1835296868 || i20 == 1836476516 || i20 == 1936286840 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1668576371 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1937011571 || i20 == 1952867444 || i20 == 1952868452 || i20 == 1953196132 || i20 == 1953654136 || i20 == 1953658222 || i20 == 1886614376 || i20 == 1935763834 || i20 == 1935763823 || i20 == 1936027235 || i20 == 1970628964 || i20 == 1935828848 || i20 == 1936158820 || i20 == 1701606260 || i20 == 1835362404 || i20 == 1701671783) {
                                if (this.f25873s != 8) {
                                    throw com.google.android.gms.internal.ads.C4708of.c("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (this.f25872r > 2147483647L) {
                                    throw com.google.android.gms.internal.ads.C4708of.c("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                c5128sR = new com.google.android.gms.internal.ads.C5128sR((int) this.f25872r);
                                java.lang.System.arraycopy(this.f25865k.n(), 0, c5128sR.n(), 0, 8);
                            } else {
                                if (this.f25872r > 2147483647L) {
                                    throw com.google.android.gms.internal.ads.C4708of.c("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                c5128sR = null;
                            }
                            this.f25874t = c5128sR;
                            z6 = true;
                            this.f25870p = 1;
                        }
                    }
                    this.f25872r = jE2;
                    j11 = this.f25872r;
                    j12 = this.f25873s;
                    if (j11 >= j12) {
                        throw com.google.android.gms.internal.ads.C4708of.c("Atom size less than header length (unsupported).");
                    }
                    jE3 = interfaceC5300u0.e() - j12;
                    i19 = this.f25871q;
                    if (i19 != 1836019558) {
                        this.f25851F.R(new com.google.android.gms.internal.ads.S0(this.f25878x, jE3));
                        this.f25854I = true;
                    } else {
                        this.f25851F.R(new com.google.android.gms.internal.ads.S0(this.f25878x, jE3));
                        this.f25854I = true;
                    }
                    if (this.f25871q == 1836019558) {
                        size = this.f25858d.size();
                        while (i21 < size) {
                            com.google.android.gms.internal.ads.P3 p10 = ((com.google.android.gms.internal.ads.A3) this.f25858d.valueAt(i21)).f25023b;
                            p10.f30623c = jE3;
                            p10.f30622b = jE3;
                        }
                    }
                    i20 = this.f25871q;
                    if (i20 == 1835295092) {
                        this.f25880z = null;
                        this.f25875u = jE3 + this.f25872r;
                        this.f25870p = 2;
                        break;
                        break;
                    }
                    if (i20 != 1836019574) {
                    }
                    z6 = true;
                    z6 = true;
                    jE4 = (interfaceC5300u0.e() + this.f25872r) - 8;
                    this.f25866l.push(new com.google.android.gms.internal.ads.C4257kZ(i20, jE4));
                    if (this.f25872r == this.f25873s) {
                        l(jE4);
                    } else {
                        g();
                    }
                } else {
                    if (i22 == z6) {
                        int i23 = ((int) this.f25872r) - this.f25873s;
                        com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f25874t;
                        if (c5128sR2 != null) {
                            interfaceC5300u1.M(c5128sR2.n(), 8, i23);
                            com.google.android.gms.internal.ads.LZ lz = new com.google.android.gms.internal.ads.LZ(this.f25871q, c5128sR2);
                            long jE5 = interfaceC5300u0.e();
                            if (this.f25866l.isEmpty()) {
                                int i24 = lz.f30137a;
                                if (i24 == 1936286840) {
                                    com.google.android.gms.internal.ads.C5128sR c5128sR3 = lz.f29519b;
                                    c5128sR3.l(8);
                                    int iA = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR3.w());
                                    c5128sR3.m(4);
                                    long jK2 = c5128sR3.K();
                                    if (iA == 0) {
                                        jM3 = c5128sR3.K();
                                        jM4 = c5128sR3.K();
                                    } else {
                                        jM3 = c5128sR3.M();
                                        jM4 = c5128sR3.M();
                                    }
                                    long j14 = jE5 + jM4;
                                    long jM5 = com.google.android.gms.internal.ads.EW.M(jM3, 1000000L, jK2, java.math.RoundingMode.DOWN);
                                    c5128sR3.m(2);
                                    int iG = c5128sR3.G();
                                    int[] iArr = new int[iG];
                                    long[] jArr = new long[iG];
                                    long[] jArr2 = new long[iG];
                                    long[] jArr3 = new long[iG];
                                    long jM6 = jM5;
                                    int i25 = 0;
                                    while (i25 < iG) {
                                        int iW2 = c5128sR3.w();
                                        if ((iW2 & Integer.MIN_VALUE) != 0) {
                                            throw com.google.android.gms.internal.ads.C4708of.a("Unhandled indirect reference", null);
                                        }
                                        long jK3 = c5128sR3.K();
                                        iArr[i25] = iW2 & Integer.MAX_VALUE;
                                        jArr[i25] = j14;
                                        jArr3[i25] = jM6;
                                        jM3 += jK3;
                                        jM6 = com.google.android.gms.internal.ads.EW.M(jM3, 1000000L, jK2, java.math.RoundingMode.DOWN);
                                        jArr2[i25] = jM6 - jArr3[i25];
                                        c5128sR3.m(4);
                                        j14 += (long) iArr[i25];
                                        i25++;
                                        iG = iG;
                                        jK2 = jK2;
                                    }
                                    android.util.Pair pairCreate = android.util.Pair.create(java.lang.Long.valueOf(jM5), new com.google.android.gms.internal.ads.C3763g0(iArr, jArr, jArr2, jArr3));
                                    this.f25879y = ((java.lang.Long) pairCreate.first).longValue();
                                    this.f25851F.R((com.google.android.gms.internal.ads.T0) pairCreate.second);
                                    this.f25854I = true;
                                } else if (i24 == 1701671783) {
                                    com.google.android.gms.internal.ads.C5128sR c5128sR4 = lz.f29519b;
                                    if (this.f25852G.length != 0) {
                                        c5128sR4.l(8);
                                        int iA2 = com.google.android.gms.internal.ads.AbstractC5416v3.a(c5128sR4.w());
                                        if (iA2 == 0) {
                                            java.lang.String strO = c5128sR4.O((char) 0);
                                            strO.getClass();
                                            java.lang.String strO2 = c5128sR4.O((char) 0);
                                            strO2.getClass();
                                            long jK4 = c5128sR4.K();
                                            long jK5 = c5128sR4.K();
                                            java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
                                            jM = com.google.android.gms.internal.ads.EW.M(jK5, 1000000L, jK4, roundingMode);
                                            long j15 = this.f25879y;
                                            long j16 = j15 != -9223372036854775807L ? j15 + jM : -9223372036854775807L;
                                            jM2 = com.google.android.gms.internal.ads.EW.M(c5128sR4.K(), 1000L, jK4, roundingMode);
                                            str = strO;
                                            str2 = strO2;
                                            jK = c5128sR4.K();
                                            j6 = j16;
                                        } else if (iA2 != 1) {
                                            com.google.android.gms.internal.ads.AbstractC3586eM.f("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iA2);
                                        } else {
                                            long jK6 = c5128sR4.K();
                                            long jM7 = c5128sR4.M();
                                            java.math.RoundingMode roundingMode2 = java.math.RoundingMode.DOWN;
                                            long jM8 = com.google.android.gms.internal.ads.EW.M(jM7, 1000000L, jK6, roundingMode2);
                                            long jM9 = com.google.android.gms.internal.ads.EW.M(c5128sR4.K(), 1000L, jK6, roundingMode2);
                                            long jK7 = c5128sR4.K();
                                            java.lang.String strO3 = c5128sR4.O((char) 0);
                                            strO3.getClass();
                                            java.lang.String strO4 = c5128sR4.O((char) 0);
                                            strO4.getClass();
                                            jM2 = jM9;
                                            jK = jK7;
                                            str = strO3;
                                            str2 = strO4;
                                            j6 = jM8;
                                            jM = -9223372036854775807L;
                                        }
                                        byte[] bArr = new byte[c5128sR4.r()];
                                        c5128sR4.h(bArr, 0, c5128sR4.r());
                                        com.google.android.gms.internal.ads.C5128sR c5128sR5 = new com.google.android.gms.internal.ads.C5128sR(this.f25864j.a(new com.google.android.gms.internal.ads.T1(str, str2, jM2, jK, bArr)));
                                        int iR = c5128sR5.r();
                                        for (com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a2 : this.f25852G) {
                                            c5128sR5.l(0);
                                            interfaceC3107a2.a(c5128sR5, iR);
                                        }
                                        if (j6 == -9223372036854775807L) {
                                            arrayDeque = this.f25867m;
                                            c5856z3 = new com.google.android.gms.internal.ads.C5856z3(jM, true, iR);
                                        } else if (this.f25867m.isEmpty()) {
                                            for (com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a3 : this.f25852G) {
                                                interfaceC3107a3.b(j6, 1, iR, 0, null);
                                            }
                                        } else {
                                            arrayDeque = this.f25867m;
                                            c5856z3 = new com.google.android.gms.internal.ads.C5856z3(j6, false, iR);
                                        }
                                        arrayDeque.addLast(c5856z3);
                                        this.f25876v += iR;
                                    }
                                }
                                interfaceC5300u1 = interfaceC5300u0;
                            } else {
                                ((com.google.android.gms.internal.ads.C4257kZ) this.f25866l.peek()).e(lz);
                            }
                        } else {
                            interfaceC5300u1.I(i23);
                        }
                        l(interfaceC5300u0.e());
                        break;
                    }
                    long j17 = Long.MAX_VALUE;
                    if (i22 != 2) {
                        a6 = this.f25880z;
                        if (a6 != null) {
                            break loop0;
                        }
                        android.util.SparseArray sparseArray = this.f25858d;
                        int size2 = sparseArray.size();
                        long j18 = Long.MAX_VALUE;
                        com.google.android.gms.internal.ads.A3 a10 = null;
                        for (int i26 = 0; i26 < size2; i26 += z6 ? 1 : 0) {
                            com.google.android.gms.internal.ads.A3 a11 = (com.google.android.gms.internal.ads.A3) sparseArray.valueAt(i26);
                            if ((a11.f25033l || a11.f25027f != a11.f25025d.f30866b) && (!a11.f25033l || a11.f25029h != a11.f25023b.f30624d)) {
                                long jD = a11.d();
                                if (jD < j18) {
                                    a10 = a11;
                                    j18 = jD;
                                }
                            }
                        }
                        if (a10 != null) {
                            int iD = (int) (a10.d() - interfaceC5300u0.e());
                            if (iD < 0) {
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iD = 0;
                            }
                            interfaceC5300u1.I(iD);
                            this.f25880z = a10;
                            a6 = a10;
                            break loop0;
                        }
                        int iE2 = (int) (this.f25875u - interfaceC5300u0.e());
                        if (iE2 < 0) {
                            throw com.google.android.gms.internal.ads.C4708of.a("Offset to end of mdat was negative.", null);
                        }
                        interfaceC5300u1.I(iE2);
                        g();
                    } else {
                        int size3 = this.f25858d.size();
                        com.google.android.gms.internal.ads.A3 a12 = null;
                        for (int i27 = 0; i27 < size3; i27 += z6 ? 1 : 0) {
                            com.google.android.gms.internal.ads.P3 p11 = ((com.google.android.gms.internal.ads.A3) this.f25858d.valueAt(i27)).f25023b;
                            if (p11.f30635o) {
                                long j19 = p11.f30623c;
                                if (j19 < j17) {
                                    a12 = (com.google.android.gms.internal.ads.A3) this.f25858d.valueAt(i27);
                                    j17 = j19;
                                }
                            }
                        }
                        if (a12 == null) {
                            this.f25870p = 3;
                        } else {
                            int iE3 = (int) (j17 - interfaceC5300u0.e());
                            if (iE3 < 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a("Offset to encryption data was negative.", null);
                            }
                            interfaceC5300u1.I(iE3);
                            com.google.android.gms.internal.ads.P3 p12 = a12.f25023b;
                            com.google.android.gms.internal.ads.C5128sR c5128sR6 = p12.f30634n;
                            interfaceC5300u1.M(c5128sR6.n(), 0, c5128sR6.u());
                            p12.f30634n.l(0);
                            p12.f30635o = false;
                        }
                    }
                }
            }
        }
        char c6 = 6;
        if (this.f25870p == 3) {
            int iB = a6.b();
            this.f25846A = iB;
            this.f25849D = z6;
            if (a6.f25027f < a6.f25030i) {
                interfaceC5300u1.I(iB);
                com.google.android.gms.internal.ads.O3 o3F2 = a6.f();
                if (o3F2 != null) {
                    com.google.android.gms.internal.ads.C5128sR c5128sR7 = a6.f25023b.f30634n;
                    int i28 = o3F2.f30440d;
                    if (i28 != 0) {
                        c5128sR7.m(i28);
                    }
                    if (a6.f25023b.b(a6.f25027f)) {
                        c5128sR7.m(c5128sR7.G() * 6);
                    }
                }
                if (!a6.k()) {
                    this.f25880z = null;
                }
                i15 = 3;
            } else {
                if (a6.f25025d.f30865a.f30154h == z6) {
                    this.f25846A = iB - 8;
                    interfaceC5300u1.I(8);
                }
                if ("audio/ac4".equals(a6.f25025d.f30865a.f30153g.f26574o)) {
                    this.f25847B = a6.c(this.f25846A, 7);
                    com.google.android.gms.internal.ads.V.b(this.f25846A, this.f25863i);
                    a6.f25022a.a(this.f25863i, 7);
                    iC = this.f25847B + 7;
                } else {
                    iC = a6.c(this.f25846A, 0);
                }
                this.f25847B = iC;
                this.f25846A += iC;
                this.f25870p = 4;
                this.f25848C = 0;
                n6 = a6.f25025d.f30865a;
                interfaceC3107a1 = a6.f25022a;
                jE = a6.e();
                i10 = n6.f30157k;
                if (i10 == 0) {
                    while (true) {
                        i17 = this.f25847B;
                        i18 = this.f25846A;
                        if (i17 < i18) {
                            break;
                        }
                        this.f25847B += interfaceC3107a1.e(interfaceC5300u1, i18 - i17, false);
                    }
                } else {
                    bArrN = this.f25860f.n();
                    bArrN[0] = 0;
                    bArrN[z6 ? 1 : 0] = 0;
                    bArrN[2] = 0;
                    i11 = i10 + 1;
                    i12 = 4 - i10;
                    while (this.f25847B < this.f25846A) {
                        i13 = this.f25848C;
                        if (i13 == 0) {
                            interfaceC5300u1.M(bArrN, i12, i11);
                            this.f25860f.l(i6);
                            iW = this.f25860f.w();
                            if (iW > 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a("Invalid NAL length", null);
                            }
                            this.f25848C = iW - 1;
                            this.f25859e.l(i6);
                            interfaceC3107a1.a(this.f25859e, 4);
                            interfaceC3107a1.a(this.f25860f, z6 ? 1 : 0);
                            if (this.f25853H.length > 0) {
                                com.google.android.gms.internal.ads.D d6 = n6.f30153g;
                                byte b6 = bArrN[4];
                                byte[] bArr2 = com.google.android.gms.internal.ads.AbstractC4371lb0.f37187a;
                                str3 = d6.f26574o;
                                if (("video/avc".equals(str3) || (b6 & 31) != c6) && !("video/hevc".equals(str3) && ((b6 & 126) >> (z6 ? 1 : 0)) == 39)) {
                                    z10 = false;
                                } else {
                                    z10 = z6 ? 1 : 0;
                                }
                            } else {
                                z10 = false;
                            }
                            this.f25850E = z10;
                            this.f25847B += 5;
                            this.f25846A += i12;
                            if (this.f25849D && j$.util.Objects.equals(a6.f25025d.f30865a.f30153g.f26574o, "video/avc") && com.google.android.gms.internal.ads.AbstractC4371lb0.i(bArrN[4])) {
                                this.f25849D = z6;
                            }
                        } else {
                            if (this.f25850E) {
                                this.f25861g.i(i13);
                                interfaceC5300u1.M(this.f25861g.n(), 0, this.f25848C);
                                interfaceC3107a1.a(this.f25861g, this.f25848C);
                                iE = this.f25848C;
                                com.google.android.gms.internal.ads.C5128sR c5128sR8 = this.f25861g;
                                int iB2 = com.google.android.gms.internal.ads.AbstractC4371lb0.b(c5128sR8.n(), c5128sR8.u());
                                this.f25861g.l("video/hevc".equals(n6.f30153g.f26574o) ? 1 : 0);
                                this.f25861g.k(iB2);
                                i14 = n6.f30153g.f26576q;
                                if (i14 != -1 && i14 != this.f25868n.a()) {
                                    this.f25868n.d(n6.f30153g.f26576q);
                                }
                                this.f25868n.b(jE, this.f25861g);
                                if ((a6.a() & 5) != 0) {
                                    this.f25868n.c();
                                }
                            } else {
                                iE = interfaceC3107a1.e(interfaceC5300u1, i13, false);
                            }
                            this.f25847B += iE;
                            this.f25848C -= iE;
                            c6 = 6;
                        }
                        i6 = 0;
                    }
                }
                int iA3 = a6.a();
                o3F = a6.f();
                if (o3F != null) {
                    z11 = o3F.f30439c;
                } else {
                    z11 = null;
                }
                interfaceC3107a1.b(jE, iA3, this.f25846A, 0, z11);
                while (!this.f25867m.isEmpty()) {
                    c5856z4 = (com.google.android.gms.internal.ads.C5856z3) this.f25867m.removeFirst();
                    this.f25876v -= c5856z4.f40197c;
                    j10 = c5856z4.f40195a;
                    if (c5856z4.f40196b) {
                        j10 += jE;
                    }
                    interfaceC3107a1Arr = this.f25852G;
                    i16 = 0;
                    for (length = interfaceC3107a1Arr.length; i16 < length; length = length) {
                        interfaceC3107a1Arr[i16].b(j10, 1, c5856z4.f40197c, this.f25876v, null);
                        i16++;
                    }
                }
                if (!a6.k()) {
                    this.f25880z = null;
                }
                i15 = 3;
            }
        } else {
            n6 = a6.f25025d.f30865a;
            interfaceC3107a1 = a6.f25022a;
            jE = a6.e();
            i10 = n6.f30157k;
            if (i10 == 0) {
                while (true) {
                    i17 = this.f25847B;
                    i18 = this.f25846A;
                    if (i17 < i18) {
                        break;
                        break;
                    }
                    this.f25847B += interfaceC3107a1.e(interfaceC5300u1, i18 - i17, false);
                }
            } else {
                bArrN = this.f25860f.n();
                bArrN[0] = 0;
                bArrN[z6 ? 1 : 0] = 0;
                bArrN[2] = 0;
                i11 = i10 + 1;
                i12 = 4 - i10;
                while (this.f25847B < this.f25846A) {
                    i13 = this.f25848C;
                    if (i13 == 0) {
                        interfaceC5300u1.M(bArrN, i12, i11);
                        this.f25860f.l(i6);
                        iW = this.f25860f.w();
                        if (iW > 0) {
                            throw com.google.android.gms.internal.ads.C4708of.a("Invalid NAL length", null);
                        }
                        this.f25848C = iW - 1;
                        this.f25859e.l(i6);
                        interfaceC3107a1.a(this.f25859e, 4);
                        interfaceC3107a1.a(this.f25860f, z6 ? 1 : 0);
                        if (this.f25853H.length > 0) {
                            com.google.android.gms.internal.ads.D d10 = n6.f30153g;
                            byte b10 = bArrN[4];
                            byte[] bArr3 = com.google.android.gms.internal.ads.AbstractC4371lb0.f37187a;
                            str3 = d10.f26574o;
                            if ("video/avc".equals(str3)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        this.f25850E = z10;
                        this.f25847B += 5;
                        this.f25846A += i12;
                        if (this.f25849D) {
                        }
                    } else {
                        if (this.f25850E) {
                            this.f25861g.i(i13);
                            interfaceC5300u1.M(this.f25861g.n(), 0, this.f25848C);
                            interfaceC3107a1.a(this.f25861g, this.f25848C);
                            iE = this.f25848C;
                            com.google.android.gms.internal.ads.C5128sR c5128sR9 = this.f25861g;
                            int iB3 = com.google.android.gms.internal.ads.AbstractC4371lb0.b(c5128sR9.n(), c5128sR9.u());
                            this.f25861g.l("video/hevc".equals(n6.f30153g.f26574o) ? 1 : 0);
                            this.f25861g.k(iB3);
                            i14 = n6.f30153g.f26576q;
                            if (i14 != -1) {
                                this.f25868n.d(n6.f30153g.f26576q);
                            }
                            this.f25868n.b(jE, this.f25861g);
                            if ((a6.a() & 5) != 0) {
                                this.f25868n.c();
                            }
                        } else {
                            iE = interfaceC3107a1.e(interfaceC5300u1, i13, false);
                        }
                        this.f25847B += iE;
                        this.f25848C -= iE;
                        c6 = 6;
                    }
                    i6 = 0;
                }
            }
            int iA4 = a6.a();
            o3F = a6.f();
            if (o3F != null) {
                z11 = o3F.f30439c;
            } else {
                z11 = null;
            }
            interfaceC3107a1.b(jE, iA4, this.f25846A, 0, z11);
            while (!this.f25867m.isEmpty()) {
                c5856z4 = (com.google.android.gms.internal.ads.C5856z3) this.f25867m.removeFirst();
                this.f25876v -= c5856z4.f40197c;
                j10 = c5856z4.f40195a;
                if (c5856z4.f40196b) {
                    j10 += jE;
                }
                interfaceC3107a1Arr = this.f25852G;
                i16 = 0;
                while (i16 < length) {
                    interfaceC3107a1Arr[i16].b(j10, 1, c5856z4.f40197c, this.f25876v, null);
                    i16++;
                }
            }
            if (!a6.k()) {
                this.f25880z = null;
            }
            i15 = 3;
        }
        this.f25870p = i15;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.X0 x0A = com.google.android.gms.internal.ads.M3.a(interfaceC5300u0);
        this.f25869o = x0A != null ? com.google.android.gms.internal.ads.AbstractC3398ci0.P(x0A) : com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        return x0A == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        int i6;
        if ((this.f25856b & 32) == 0) {
            interfaceC5520w0 = new com.google.android.gms.internal.ads.C5198t4(interfaceC5520w0, this.f25855a);
        }
        this.f25851F = interfaceC5520w0;
        g();
        com.google.android.gms.internal.ads.InterfaceC3107a1[] interfaceC3107a1Arr = new com.google.android.gms.internal.ads.InterfaceC3107a1[2];
        this.f25852G = interfaceC3107a1Arr;
        int i10 = 100;
        int i11 = 0;
        if ((this.f25856b & 4) != 0) {
            interfaceC3107a1Arr[0] = this.f25851F.S(100, 5);
            i6 = 1;
            i10 = 101;
        } else {
            i6 = 0;
        }
        com.google.android.gms.internal.ads.InterfaceC3107a1[] interfaceC3107a1Arr2 = (com.google.android.gms.internal.ads.InterfaceC3107a1[]) com.google.android.gms.internal.ads.EW.n(this.f25852G, i6);
        this.f25852G = interfaceC3107a1Arr2;
        for (com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 : interfaceC3107a1Arr2) {
            interfaceC3107a1.c(f25845K);
        }
        this.f25853H = new com.google.android.gms.internal.ads.InterfaceC3107a1[this.f25857c.size()];
        while (i11 < this.f25853H.length) {
            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = this.f25851F.S(i10, 3);
            interfaceC3107a1S.c((com.google.android.gms.internal.ads.D) this.f25857c.get(i11));
            this.f25853H[i11] = interfaceC3107a1S;
            i11++;
            i10++;
        }
    }
}
