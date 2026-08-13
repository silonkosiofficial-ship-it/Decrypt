package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4103j6 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f36569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f36570c = new com.google.android.gms.internal.ads.C5128sR(new byte[9400], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.util.SparseIntArray f36571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4433m6 f36572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f36573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.util.SparseArray f36574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.util.SparseBooleanArray f36575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.util.SparseBooleanArray f36576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3775g6 f36577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3665f6 f36578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f36579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36585r;

    public C4103j6(int i6, int i10, com.google.android.gms.internal.ads.InterfaceC4869q4 interfaceC4869q4, com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.InterfaceC4433m6 interfaceC4433m6, int i11) {
        this.f36572e = interfaceC4433m6;
        this.f36568a = i10;
        this.f36573f = interfaceC4869q4;
        this.f36569b = java.util.Collections.singletonList(c3267bV);
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        this.f36575h = sparseBooleanArray;
        this.f36576i = new android.util.SparseBooleanArray();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f36574g = sparseArray;
        this.f36571d = new android.util.SparseIntArray();
        this.f36577j = new com.google.android.gms.internal.ads.C3775g6(112800);
        this.f36579l = com.google.android.gms.internal.ads.InterfaceC5520w0.f39494n;
        this.f36585r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        android.util.SparseArray sparseArrayA = interfaceC4433m6.a();
        int size = sparseArrayA.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f36574g.put(sparseArrayA.keyAt(i12), (com.google.android.gms.internal.ads.InterfaceC4653o6) sparseArrayA.valueAt(i12));
        }
        this.f36574g.put(0, new com.google.android.gms.internal.ads.C3227b6(new com.google.android.gms.internal.ads.C3885h6(this)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        com.google.android.gms.internal.ads.C3665f6 c3665f6;
        int size = this.f36569b.size();
        for (int i6 = 0; i6 < size; i6++) {
            com.google.android.gms.internal.ads.C3267bV c3267bV = (com.google.android.gms.internal.ads.C3267bV) this.f36569b.get(i6);
            if (c3267bV.f() != -9223372036854775807L) {
                long jD = c3267bV.d();
                if (jD != -9223372036854775807L && jD != 0 && jD != j10) {
                    c3267bV.i(j10);
                }
            } else {
                c3267bV.i(j10);
            }
        }
        if (j10 != 0 && (c3665f6 = this.f36578k) != null) {
            c3665f6.d(j10);
        }
        this.f36570c.i(0);
        this.f36571d.clear();
        for (int i10 = 0; i10 < this.f36574g.size(); i10++) {
            ((com.google.android.gms.internal.ads.InterfaceC4653o6) this.f36574g.valueAt(i10)).c();
        }
        this.f36584q = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.T5] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.o6] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        ?? r6;
        ?? r10;
        com.google.android.gms.internal.ads.InterfaceC4653o6 interfaceC4653o6;
        long j6;
        boolean z6;
        long jF = interfaceC5300u0.f();
        if (this.f36581n) {
            if (jF != -1) {
                com.google.android.gms.internal.ads.C3775g6 c3775g6 = this.f36577j;
                if (!c3775g6.d()) {
                    return c3775g6.a(interfaceC5300u0, q6, this.f36585r);
                }
            }
            if (this.f36582o) {
                j6 = 0;
            } else {
                this.f36582o = true;
                com.google.android.gms.internal.ads.C3775g6 c3775g7 = this.f36577j;
                if (c3775g7.b() != -9223372036854775807L) {
                    j6 = 0;
                    com.google.android.gms.internal.ads.C3665f6 c3665f6 = new com.google.android.gms.internal.ads.C3665f6(c3775g7.c(), c3775g7.b(), jF, this.f36585r, 112800);
                    this.f36578k = c3665f6;
                    this.f36579l.R(c3665f6.b());
                } else {
                    j6 = 0;
                    this.f36579l.R(new com.google.android.gms.internal.ads.S0(c3775g7.b(), 0L));
                }
            }
            if (this.f36583p) {
                z6 = false;
                this.f36583p = false;
                e(j6, j6);
                if (interfaceC5300u0.e() != j6) {
                    q6.f30855a = j6;
                    return 1;
                }
            } else {
                z6 = false;
            }
            com.google.android.gms.internal.ads.C3665f6 c3665f7 = this.f36578k;
            r6 = z6;
            if (c3665f7 != null && c3665f7.e()) {
                r6 = z6;
                return c3665f7.a(interfaceC5300u0, q6);
            }
        } else {
            r6 = 0;
        }
        r6 = z6;
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f36570c;
        byte[] bArrN = c5128sR.n();
        if (9400 - c5128sR.t() < 188) {
            int iR = c5128sR.r();
            if (iR > 0) {
                java.lang.System.arraycopy(bArrN, c5128sR.t(), bArrN, r6, iR);
            }
            this.f36570c.j(bArrN, iR);
        }
        while (true) {
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f36570c;
            if (c5128sR2.r() >= 188) {
                int iT = c5128sR2.t();
                int iU = c5128sR2.u();
                int iA = com.google.android.gms.internal.ads.AbstractC4763p6.a(c5128sR2.n(), iT, iU);
                this.f36570c.l(iA);
                int i6 = iA + 188;
                if (i6 > iU) {
                    this.f36584q += iA - iT;
                } else {
                    this.f36584q = r6;
                }
                com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f36570c;
                int iU2 = c5128sR3.u();
                if (i6 > iU2) {
                    return r6;
                }
                int iW = c5128sR3.w();
                if ((8388608 & iW) == 0) {
                    ?? r11 = (4194304 & iW) != 0 ? 1 : r6;
                    int i10 = iW & 32;
                    int i11 = (iW >> 8) & 8191;
                    if ((iW & 16) != 0) {
                        interfaceC4653o6 = (com.google.android.gms.internal.ads.InterfaceC4653o6) this.f36574g.get(i11);
                    } else {
                        r10 = 0;
                    }
                    if (r10 != 0) {
                        int i12 = iW & 15;
                        int i13 = this.f36571d.get(i11, i12 - 1);
                        this.f36571d.put(i11, i12);
                        if (i13 != i12) {
                            if (i12 != ((i13 + 1) & 15)) {
                                r10 = interfaceC4653o6;
                                r10.c();
                            }
                            if (i10 != 0) {
                                com.google.android.gms.internal.ads.C5128sR c5128sR4 = this.f36570c;
                                int iC = c5128sR4.C();
                                r11 = (r11 == true ? 1 : 0) | ((c5128sR4.C() & 64) != 0 ? 2 : r6);
                                this.f36570c.m(iC - 1);
                            }
                            boolean z10 = this.f36581n;
                            if (z10 || !this.f36576i.get(i11, r6)) {
                                this.f36570c.k(i6);
                                r10.b(this.f36570c, r11);
                                this.f36570c.k(iU2);
                                if (!z10) {
                                    if (this.f36581n && jF != -1) {
                                        this.f36583p = true;
                                    }
                                }
                            } else if (this.f36581n) {
                                this.f36583p = true;
                            }
                        }
                    }
                }
                r10 = interfaceC4653o6;
                r10 = interfaceC4653o6;
                this.f36570c.l(i6);
                return r6;
            }
            int iU3 = c5128sR2.u();
            int iH = interfaceC5300u0.H(bArrN, iU3, 9400 - iU3);
            if (iH == -1) {
                for (?? r12 = r6; r12 < this.f36574g.size(); r12++) {
                    com.google.android.gms.internal.ads.InterfaceC4653o6 interfaceC4653o7 = (com.google.android.gms.internal.ads.InterfaceC4653o6) this.f36574g.valueAt(r12);
                    if (interfaceC4653o7 instanceof com.google.android.gms.internal.ads.T5) {
                        ?? r13 = (com.google.android.gms.internal.ads.T5) interfaceC4653o7;
                        if (r13.d(r6)) {
                            r13.b(new com.google.android.gms.internal.ads.C5128sR(), 1);
                        }
                    }
                }
                return -1;
            }
            this.f36570c.k(iU3 + iH);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        byte[] bArrN = this.f36570c.n();
        com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i0.L(bArrN, 0, 940, false);
        for (int i6 = 0; i6 < 188; i6++) {
            int i10 = 0;
            while (true) {
                if (i10 >= 5) {
                    c3983i0.h(i6, false);
                    return true;
                }
                if (bArrN[(i10 * 188) + i6] != 71) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        if (this.f36568a == 0) {
            interfaceC5520w0 = new com.google.android.gms.internal.ads.C5198t4(interfaceC5520w0, this.f36573f);
        }
        this.f36579l = interfaceC5520w0;
    }
}
