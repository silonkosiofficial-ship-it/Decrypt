package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4898qI0 implements com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.InterfaceC5520w0, com.google.android.gms.internal.ads.InterfaceC3584eK0, com.google.android.gms.internal.ads.InterfaceC4024iK0, com.google.android.gms.internal.ads.BI0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final java.util.Map f38204p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.D f38205q0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.net.Uri f38206C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f38207D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XF0 f38208E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VH0 f38209F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SF0 f38210G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4458mI0 f38211H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final long f38212I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final long f38213J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3580eI0 f38215L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.google.android.gms.internal.ads.IH0 f38220Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3109a2 f38221R;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f38224U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f38225V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f38226W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f38227X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4788pI0 f38228Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private com.google.android.gms.internal.ads.T0 f38229Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long f38230a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f38231b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f38233d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f38234e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f38235f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f38236g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f38237h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private long f38238i0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f38240k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f38241l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f38242m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f38243n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YJ0 f38244o0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4462mK0 f38214K = new com.google.android.gms.internal.ads.C4462mK0("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QE f38216M = new com.google.android.gms.internal.ads.QE(com.google.android.gms.internal.ads.InterfaceC4447mD.f37298a);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.lang.Runnable f38217N = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.hI0
        @Override // java.lang.Runnable
        public final void run() {
            this.f36049C.F();
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.lang.Runnable f38218O = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.iI0
        @Override // java.lang.Runnable
        public final void run() {
            this.f36262C.u();
        }
    };

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.os.Handler f38219P = com.google.android.gms.internal.ads.EW.Q(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4678oI0[] f38223T = new com.google.android.gms.internal.ads.C4678oI0[0];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private com.google.android.gms.internal.ads.DI0[] f38222S = new com.google.android.gms.internal.ads.DI0[0];

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private long f38239j0 = -9223372036854775807L;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f38232c0 = 1;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("Icy-MetaData", "1");
        f38204p0 = j$.util.DesugarCollections.unmodifiableMap(map);
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.m("icy");
        c4682oK0.B("application/x-icy");
        f38205q0 = c4682oK0.H();
    }

    public C4898qI0(android.net.Uri uri, com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.InterfaceC3580eI0 interfaceC3580eI0, com.google.android.gms.internal.ads.XF0 xf0, com.google.android.gms.internal.ads.SF0 sf0, com.google.android.gms.internal.ads.C3365cK0 c3365cK0, com.google.android.gms.internal.ads.VH0 vh0, com.google.android.gms.internal.ads.InterfaceC4458mI0 interfaceC4458mI0, com.google.android.gms.internal.ads.YJ0 yj0, java.lang.String str, int i6, boolean z6, long j6, com.google.android.gms.internal.ads.InterfaceExecutorC5451vK0 interfaceExecutorC5451vK0) {
        this.f38206C = uri;
        this.f38207D = interfaceC4825pi0;
        this.f38208E = xf0;
        this.f38210G = sf0;
        this.f38209F = vh0;
        this.f38211H = interfaceC4458mI0;
        this.f38244o0 = yj0;
        this.f38212I = i6;
        this.f38215L = interfaceC3580eI0;
        this.f38213J = j6;
    }

    private final int B() {
        int iY = 0;
        for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
            iY += di0.y();
        }
        return iY;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long C(boolean z6) {
        int i6 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            com.google.android.gms.internal.ads.DI0[] di0Arr = this.f38222S;
            if (i6 >= di0Arr.length) {
                return jMax;
            }
            if (z6) {
                jMax = java.lang.Math.max(jMax, di0Arr[i6].A());
            } else {
                com.google.android.gms.internal.ads.C4788pI0 c4788pI0 = this.f38228Y;
                c4788pI0.getClass();
                if (c4788pI0.f37961c[i6]) {
                    jMax = java.lang.Math.max(jMax, di0Arr[i6].A());
                }
            }
            i6++;
        }
    }

    private final com.google.android.gms.internal.ads.InterfaceC3107a1 D(com.google.android.gms.internal.ads.C4678oI0 c4678oI0) {
        int length = this.f38222S.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (c4678oI0.equals(this.f38223T[i6])) {
                return this.f38222S[i6];
            }
        }
        if (this.f38224U) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + c4678oI0.f37763a + ") after finishing tracks.");
            return new com.google.android.gms.internal.ads.C4641o0();
        }
        com.google.android.gms.internal.ads.DI0 di0 = new com.google.android.gms.internal.ads.DI0(this.f38244o0, this.f38208E, this.f38210G);
        di0.J(this);
        int i10 = length + 1;
        com.google.android.gms.internal.ads.C4678oI0[] c4678oI0Arr = (com.google.android.gms.internal.ads.C4678oI0[]) java.util.Arrays.copyOf(this.f38223T, i10);
        c4678oI0Arr[length] = c4678oI0;
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f38223T = c4678oI0Arr;
        com.google.android.gms.internal.ads.DI0[] di0Arr = (com.google.android.gms.internal.ads.DI0[]) java.util.Arrays.copyOf(this.f38222S, i10);
        di0Arr[length] = di0;
        this.f38222S = di0Arr;
        return di0;
    }

    private final void E() {
        com.google.android.gms.internal.ads.LC.f(this.f38225V);
        this.f38228Y.getClass();
        this.f38229Z.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        int i6;
        if (this.f38243n0 || this.f38225V || !this.f38224U || this.f38229Z == null) {
            return;
        }
        for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
            if (di0.B() == null) {
                return;
            }
        }
        this.f38216M.c();
        int length = this.f38222S.length;
        com.google.android.gms.internal.ads.C2728Pm[] c2728PmArr = new com.google.android.gms.internal.ads.C2728Pm[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            com.google.android.gms.internal.ads.D dB = this.f38222S[i10].B();
            dB.getClass();
            java.lang.String str = dB.f26574o;
            boolean zG = com.google.android.gms.internal.ads.AbstractC3606ed.g(str);
            boolean z6 = zG || com.google.android.gms.internal.ads.AbstractC3606ed.i(str);
            zArr[i10] = z6;
            this.f38226W = z6 | this.f38226W;
            this.f38227X = this.f38213J != -9223372036854775807L && length == 1 && com.google.android.gms.internal.ads.AbstractC3606ed.h(str);
            com.google.android.gms.internal.ads.C3109a2 c3109a2 = this.f38221R;
            if (c3109a2 != null) {
                if (zG || this.f38223T[i10].f37764b) {
                    com.google.android.gms.internal.ads.C2227Cb c2227Cb = dB.f26571l;
                    com.google.android.gms.internal.ads.C2227Cb c2227Cb2 = c2227Cb == null ? new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, c3109a2) : c2227Cb.c(c3109a2);
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = dB.b();
                    c4682oK0B.t(c2227Cb2);
                    dB = c4682oK0B.H();
                }
                if (zG && dB.f26567h == -1 && dB.f26568i == -1 && (i6 = c3109a2.f33987C) != -1) {
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0B2 = dB.b();
                    c4682oK0B2.q0(i6);
                    dB = c4682oK0B2.H();
                }
            }
            com.google.android.gms.internal.ads.D dC = dB.c(this.f38208E.a(dB));
            c2728PmArr[i10] = new com.google.android.gms.internal.ads.C2728Pm(java.lang.Integer.toString(i10), dC);
            this.f38235f0 = dC.f26580u | this.f38235f0;
        }
        this.f38228Y = new com.google.android.gms.internal.ads.C4788pI0(new com.google.android.gms.internal.ads.PI0(c2728PmArr), zArr);
        if (this.f38227X && this.f38230a0 == -9223372036854775807L) {
            this.f38230a0 = this.f38213J;
            this.f38229Z = new com.google.android.gms.internal.ads.C4238kI0(this, this.f38229Z);
        }
        this.f38211H.d(this.f38230a0, this.f38229Z.g(), this.f38231b0);
        this.f38225V = true;
        com.google.android.gms.internal.ads.IH0 ih0 = this.f38220Q;
        ih0.getClass();
        ih0.l(this);
    }

    private final void G(int i6) {
        E();
        com.google.android.gms.internal.ads.C4788pI0 c4788pI0 = this.f38228Y;
        boolean[] zArr = c4788pI0.f37962d;
        if (zArr[i6]) {
            return;
        }
        com.google.android.gms.internal.ads.D dB = c4788pI0.f37959a.b(i6).b(0);
        this.f38209F.d(new com.google.android.gms.internal.ads.HH0(1, com.google.android.gms.internal.ads.AbstractC3606ed.b(dB.f26574o), dB, 0, null, com.google.android.gms.internal.ads.EW.N(this.f38238i0), -9223372036854775807L));
        zArr[i6] = true;
    }

    private final void H(int i6) {
        E();
        boolean[] zArr = this.f38228Y.f37960b;
        if (this.f38240k0 && zArr[i6] && !this.f38222S[i6].M(false)) {
            this.f38239j0 = 0L;
            this.f38240k0 = false;
            this.f38234e0 = true;
            this.f38238i0 = 0L;
            this.f38241l0 = 0;
            for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
                di0.H(false);
            }
            com.google.android.gms.internal.ads.IH0 ih0 = this.f38220Q;
            ih0.getClass();
            ih0.e(this);
        }
    }

    private final void I() {
        com.google.android.gms.internal.ads.C4348lI0 c4348lI0 = new com.google.android.gms.internal.ads.C4348lI0(this, this.f38206C, this.f38207D, this.f38215L, this, this.f38216M);
        if (this.f38225V) {
            com.google.android.gms.internal.ads.LC.f(J());
            long j6 = this.f38230a0;
            if (j6 != -9223372036854775807L && this.f38239j0 > j6) {
                this.f38242m0 = true;
                this.f38239j0 = -9223372036854775807L;
                return;
            }
            com.google.android.gms.internal.ads.T0 t6 = this.f38229Z;
            t6.getClass();
            com.google.android.gms.internal.ads.C4348lI0.f(c4348lI0, t6.b(this.f38239j0).f31105a.f32079b, this.f38239j0);
            for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
                di0.I(this.f38239j0);
            }
            this.f38239j0 = -9223372036854775807L;
        }
        this.f38241l0 = B();
        long jA = this.f38214K.a(c4348lI0, this, com.google.android.gms.internal.ads.C3365cK0.a(this.f38232c0));
        this.f38209F.h(new com.google.android.gms.internal.ads.BH0(c4348lI0.f37142a, c4348lI0.f37152k, jA), new com.google.android.gms.internal.ads.HH0(1, -1, null, 0, null, com.google.android.gms.internal.ads.EW.N(c4348lI0.f37151j), com.google.android.gms.internal.ads.EW.N(this.f38230a0)));
    }

    private final boolean J() {
        return this.f38239j0 != -9223372036854775807L;
    }

    private final boolean K() {
        return this.f38234e0 || J();
    }

    static /* bridge */ /* synthetic */ long T(com.google.android.gms.internal.ads.C4898qI0 c4898qI0, boolean z6) {
        return c4898qI0.C(true);
    }

    static /* bridge */ /* synthetic */ void t(final com.google.android.gms.internal.ads.C4898qI0 c4898qI0) {
        c4898qI0.f38219P.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.gI0
            @Override // java.lang.Runnable
            public final void run() {
                this.f35581C.v();
            }
        });
    }

    final boolean A(int i6) {
        return !K() && this.f38222S[i6].M(this.f38242m0);
    }

    final int L(int i6, com.google.android.gms.internal.ads.UA0 ua0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, int i10) {
        if (K()) {
            return -3;
        }
        G(i6);
        int iZ = this.f38222S[i6].z(ua0, c5518vz0, i10, this.f38242m0);
        if (iZ == -3) {
            H(i6);
        }
        return iZ;
    }

    final int M(int i6, long j6) {
        if (K()) {
            return 0;
        }
        G(i6);
        com.google.android.gms.internal.ads.DI0 di0 = this.f38222S[i6];
        int iX = di0.x(j6, this.f38242m0);
        di0.K(iX);
        if (iX != 0) {
            return iX;
        }
        H(i6);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024iK0
    public final void P() {
        for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
            di0.G();
        }
        this.f38215L.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final void Q() {
        this.f38224U = true;
        this.f38219P.post(this.f38217N);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final void R(final com.google.android.gms.internal.ads.T0 t6) {
        this.f38219P.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.jI0
            @Override // java.lang.Runnable
            public final void run() {
                this.f36628C.w(t6);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final com.google.android.gms.internal.ads.InterfaceC3107a1 S(int i6, int i10) {
        return D(new com.google.android.gms.internal.ads.C4678oI0(i6, false));
    }

    final com.google.android.gms.internal.ads.InterfaceC3107a1 W() {
        return D(new com.google.android.gms.internal.ads.C4678oI0(0, true));
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final void a(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long b() {
        long jC;
        E();
        if (this.f38242m0 || this.f38236g0 == 0) {
            return Long.MIN_VALUE;
        }
        if (J()) {
            return this.f38239j0;
        }
        if (this.f38226W) {
            int length = this.f38222S.length;
            jC = Long.MAX_VALUE;
            for (int i6 = 0; i6 < length; i6++) {
                com.google.android.gms.internal.ads.C4788pI0 c4788pI0 = this.f38228Y;
                if (c4788pI0.f37960b[i6] && c4788pI0.f37961c[i6] && !this.f38222S[i6].L()) {
                    jC = java.lang.Math.min(jC, this.f38222S[i6].A());
                }
            }
        } else {
            jC = Long.MAX_VALUE;
        }
        if (jC == Long.MAX_VALUE) {
            jC = C(false);
        }
        return jC == Long.MIN_VALUE ? this.f38238i0 : jC;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long c() {
        return b();
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean d(com.google.android.gms.internal.ads.ZA0 za0) {
        if (this.f38242m0) {
            return false;
        }
        com.google.android.gms.internal.ads.C4462mK0 c4462mK0 = this.f38214K;
        if (c4462mK0.k() || this.f38240k0) {
            return false;
        }
        if (this.f38225V && this.f38236g0 == 0) {
            return false;
        }
        boolean zE = this.f38216M.e();
        if (c4462mK0.l()) {
            return zE;
        }
        I();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3584eK0
    public final /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.InterfaceC3914hK0 interfaceC3914hK0, long j6, long j10, boolean z6) {
        com.google.android.gms.internal.ads.C4348lI0 c4348lI0 = (com.google.android.gms.internal.ads.C4348lI0) interfaceC3914hK0;
        com.google.android.gms.internal.ads.C5510vv0 c5510vv0 = c4348lI0.f37144c;
        com.google.android.gms.internal.ads.BH0 bh0 = new com.google.android.gms.internal.ads.BH0(c4348lI0.f37142a, c4348lI0.f37152k, c5510vv0.h(), c5510vv0.i(), j6, j10, c5510vv0.g());
        long unused = c4348lI0.f37142a;
        this.f38209F.e(bh0, new com.google.android.gms.internal.ads.HH0(1, -1, null, 0, null, com.google.android.gms.internal.ads.EW.N(c4348lI0.f37151j), com.google.android.gms.internal.ads.EW.N(this.f38230a0)));
        if (z6) {
            return;
        }
        for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
            di0.H(false);
        }
        if (this.f38236g0 > 0) {
            com.google.android.gms.internal.ads.IH0 ih0 = this.f38220Q;
            ih0.getClass();
            ih0.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long f() {
        if (this.f38235f0) {
            this.f38235f0 = false;
        } else {
            if (!this.f38234e0) {
                return -9223372036854775807L;
            }
            if (!this.f38242m0 && B() <= this.f38241l0) {
                return -9223372036854775807L;
            }
            this.f38234e0 = false;
        }
        return this.f38238i0;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final com.google.android.gms.internal.ads.PI0 g() {
        E();
        return this.f38228Y.f37959a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[LOOP:1: B:36:0x007a->B:37:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[LOOP:2: B:40:0x0091->B:41:0x0093, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0077, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x008a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.JH0
    public final long h(long j6) {
        com.google.android.gms.internal.ads.C4462mK0 c4462mK0;
        int i6;
        E();
        boolean[] zArr = this.f38228Y.f37960b;
        if (true != this.f38229Z.g()) {
            j6 = 0;
        }
        this.f38234e0 = false;
        long j10 = this.f38238i0;
        this.f38238i0 = j6;
        if (J()) {
            this.f38239j0 = j6;
            return j6;
        }
        if (this.f38232c0 == 7 || !(this.f38242m0 || this.f38214K.l())) {
            this.f38240k0 = false;
            this.f38239j0 = j6;
            this.f38242m0 = false;
            this.f38235f0 = false;
            c4462mK0 = this.f38214K;
            if (c4462mK0.l()) {
                c4462mK0.h();
                for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
                    di0.H(false);
                }
                break;
            }
            for (com.google.android.gms.internal.ads.DI0 di1 : this.f38222S) {
                di1.D();
            }
            this.f38214K.g();
            break;
        }
        int length = this.f38222S.length;
        for (int i10 = 0; i10 < length; i10++) {
            com.google.android.gms.internal.ads.DI0 di2 = this.f38222S[i10];
            if (di2.w() != 0 || j10 != j6) {
                if (!(this.f38227X ? di2.N(di2.v()) : di2.h(j6, false)) && (zArr[i10] || !this.f38226W)) {
                    this.f38240k0 = false;
                    this.f38239j0 = j6;
                    this.f38242m0 = false;
                    this.f38235f0 = false;
                    c4462mK0 = this.f38214K;
                    if (c4462mK0.l()) {
                        c4462mK0.h();
                        while (i6 < r2) {
                            di0.H(false);
                        }
                        break;
                        break;
                    }
                    while (i < r2) {
                        di1.D();
                    }
                    this.f38214K.g();
                    break;
                }
            }
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long i(long j6, com.google.android.gms.internal.ads.GB0 gb0) {
        E();
        if (!this.f38229Z.g()) {
            return 0L;
        }
        com.google.android.gms.internal.ads.R0 r0B = this.f38229Z.b(j6);
        com.google.android.gms.internal.ads.U0 u6 = r0B.f31105a;
        com.google.android.gms.internal.ads.U0 u10 = r0B.f31106b;
        long j10 = gb0.f27757a;
        if (j10 == 0) {
            if (gb0.f27758b == 0) {
                return j6;
            }
            j10 = 0;
        }
        long j11 = u6.f32078a;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        long j12 = j6 - j10;
        long j13 = gb0.f27758b;
        long j14 = j6 + j13;
        long j15 = j6 ^ j14;
        long j16 = j13 ^ j14;
        if (((j6 ^ j10) & (j6 ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((j15 & j16) < 0) {
            j14 = Long.MAX_VALUE;
        }
        boolean z6 = j12 <= j11 && j11 <= j14;
        long j17 = u10.f32078a;
        boolean z10 = j12 <= j17 && j17 <= j14;
        if (z6 && z10) {
            if (java.lang.Math.abs(j11 - j6) > java.lang.Math.abs(j17 - j6)) {
                return j17;
            }
        } else if (!z6) {
            return z10 ? j17 : j12;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void j(long j6, boolean z6) {
        if (this.f38227X) {
            return;
        }
        E();
        if (J()) {
            return;
        }
        boolean[] zArr = this.f38228Y.f37961c;
        int length = this.f38222S.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f38222S[i6].C(j6, false, zArr[i6]);
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void k() throws java.io.IOException {
        x();
        if (this.f38242m0 && !this.f38225V) {
            throw com.google.android.gms.internal.ads.C4708of.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3584eK0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.C3694fK0 l(com.google.android.gms.internal.ads.InterfaceC3914hK0 interfaceC3914hK0, long j6, long j10, java.io.IOException iOException, int i6) {
        long jMin;
        com.google.android.gms.internal.ads.C3694fK0 c3694fK0B;
        com.google.android.gms.internal.ads.T0 t6;
        com.google.android.gms.internal.ads.C4348lI0 c4348lI0 = (com.google.android.gms.internal.ads.C4348lI0) interfaceC3914hK0;
        com.google.android.gms.internal.ads.C5510vv0 c5510vv0 = c4348lI0.f37144c;
        com.google.android.gms.internal.ads.BH0 bh0 = new com.google.android.gms.internal.ads.BH0(c4348lI0.f37142a, c4348lI0.f37152k, c5510vv0.h(), c5510vv0.i(), j6, j10, c5510vv0.g());
        long unused = c4348lI0.f37151j;
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        if ((iOException instanceof com.google.android.gms.internal.ads.C4708of) || (iOException instanceof java.io.FileNotFoundException) || (iOException instanceof com.google.android.gms.internal.ads.Qq0) || (iOException instanceof com.google.android.gms.internal.ads.C4242kK0)) {
            jMin = -9223372036854775807L;
            break;
        }
        java.lang.Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = java.lang.Math.min((i6 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof com.google.android.gms.internal.ads.C2722Pi0) && ((com.google.android.gms.internal.ads.C2722Pi0) cause).f30767C == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            c3694fK0B = com.google.android.gms.internal.ads.C4462mK0.f37335e;
        } else {
            int iB = B();
            boolean z6 = iB > this.f38241l0;
            if (this.f38237h0 || !((t6 = this.f38229Z) == null || t6.a() == -9223372036854775807L)) {
                this.f38241l0 = iB;
            } else {
                boolean z10 = this.f38225V;
                if (!z10 || K()) {
                    this.f38234e0 = z10;
                    this.f38238i0 = 0L;
                    this.f38241l0 = 0;
                    for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
                        di0.H(false);
                    }
                    com.google.android.gms.internal.ads.C4348lI0.f(c4348lI0, 0L, 0L);
                } else {
                    this.f38240k0 = true;
                    c3694fK0B = com.google.android.gms.internal.ads.C4462mK0.f37334d;
                }
            }
            c3694fK0B = com.google.android.gms.internal.ads.C4462mK0.b(z6, jMin);
        }
        boolean zC = true ^ c3694fK0B.c();
        this.f38209F.g(bh0, new com.google.android.gms.internal.ads.HH0(1, -1, null, 0, null, com.google.android.gms.internal.ads.EW.N(c4348lI0.f37151j), com.google.android.gms.internal.ads.EW.N(this.f38230a0)), iOException, zC);
        if (zC) {
            long unused2 = c4348lI0.f37142a;
        }
        return c3694fK0B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3584eK0
    public final /* bridge */ /* synthetic */ void m(com.google.android.gms.internal.ads.InterfaceC3914hK0 interfaceC3914hK0, long j6, long j10) {
        com.google.android.gms.internal.ads.T0 t6;
        com.google.android.gms.internal.ads.C4348lI0 c4348lI0 = (com.google.android.gms.internal.ads.C4348lI0) interfaceC3914hK0;
        if (this.f38230a0 == -9223372036854775807L && (t6 = this.f38229Z) != null) {
            boolean zG = t6.g();
            long jC = C(true);
            long j11 = jC == Long.MIN_VALUE ? 0L : jC + 10000;
            this.f38230a0 = j11;
            this.f38211H.d(j11, zG, this.f38231b0);
        }
        com.google.android.gms.internal.ads.C5510vv0 c5510vv0 = c4348lI0.f37144c;
        com.google.android.gms.internal.ads.BH0 bh0 = new com.google.android.gms.internal.ads.BH0(c4348lI0.f37142a, c4348lI0.f37152k, c5510vv0.h(), c5510vv0.i(), j6, j10, c5510vv0.g());
        long unused = c4348lI0.f37142a;
        this.f38209F.f(bh0, new com.google.android.gms.internal.ads.HH0(1, -1, null, 0, null, com.google.android.gms.internal.ads.EW.N(c4348lI0.f37151j), com.google.android.gms.internal.ads.EW.N(this.f38230a0)));
        this.f38242m0 = true;
        com.google.android.gms.internal.ads.IH0 ih0 = this.f38220Q;
        ih0.getClass();
        ih0.e(this);
    }

    @Override // com.google.android.gms.internal.ads.BI0
    public final void n(com.google.android.gms.internal.ads.D d6) {
        this.f38219P.post(this.f38217N);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long o(com.google.android.gms.internal.ads.IJ0[] ij0Arr, boolean[] zArr, com.google.android.gms.internal.ads.EI0[] ei0Arr, boolean[] zArr2, long j6) {
        com.google.android.gms.internal.ads.IJ0 ij0;
        E();
        com.google.android.gms.internal.ads.C4788pI0 c4788pI0 = this.f38228Y;
        com.google.android.gms.internal.ads.PI0 pi0 = c4788pI0.f37959a;
        boolean[] zArr3 = c4788pI0.f37961c;
        int i6 = this.f38236g0;
        int i10 = 0;
        for (int i11 = 0; i11 < ij0Arr.length; i11++) {
            com.google.android.gms.internal.ads.EI0 ei0 = ei0Arr[i11];
            if (ei0 != null && (ij0Arr[i11] == null || !zArr[i11])) {
                int i12 = ((com.google.android.gms.internal.ads.C4568nI0) ei0).f37557a;
                com.google.android.gms.internal.ads.LC.f(zArr3[i12]);
                this.f38236g0--;
                zArr3[i12] = false;
                ei0Arr[i11] = null;
            }
        }
        boolean z6 = !this.f38233d0 ? j6 == 0 || this.f38227X : i6 != 0;
        for (int i13 = 0; i13 < ij0Arr.length; i13++) {
            if (ei0Arr[i13] == null && (ij0 = ij0Arr[i13]) != null) {
                com.google.android.gms.internal.ads.LC.f(ij0.f() == 1);
                com.google.android.gms.internal.ads.LC.f(ij0.r(0) == 0);
                int iA = pi0.a(ij0.i());
                com.google.android.gms.internal.ads.LC.f(!zArr3[iA]);
                this.f38236g0++;
                zArr3[iA] = true;
                this.f38235f0 = ij0.e().f26580u | this.f38235f0;
                ei0Arr[i13] = new com.google.android.gms.internal.ads.C4568nI0(this, iA);
                zArr2[i13] = true;
                if (!z6) {
                    com.google.android.gms.internal.ads.DI0 di0 = this.f38222S[iA];
                    z6 = (di0.w() == 0 || di0.h(j6, true)) ? false : true;
                }
            }
        }
        if (this.f38236g0 == 0) {
            this.f38240k0 = false;
            this.f38234e0 = false;
            this.f38235f0 = false;
            if (this.f38214K.l()) {
                com.google.android.gms.internal.ads.DI0[] di0Arr = this.f38222S;
                int length = di0Arr.length;
                while (i10 < length) {
                    di0Arr[i10].D();
                    i10++;
                }
                this.f38214K.g();
            } else {
                this.f38242m0 = false;
                for (com.google.android.gms.internal.ads.DI0 di1 : this.f38222S) {
                    di1.H(false);
                }
            }
        } else if (z6) {
            j6 = h(j6);
            while (i10 < ei0Arr.length) {
                if (ei0Arr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f38233d0 = true;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void p(com.google.android.gms.internal.ads.IH0 ih0, long j6) {
        this.f38220Q = ih0;
        this.f38216M.e();
        I();
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean q() {
        return this.f38214K.l() && this.f38216M.d();
    }

    final /* synthetic */ void u() {
        if (this.f38243n0) {
            return;
        }
        com.google.android.gms.internal.ads.IH0 ih0 = this.f38220Q;
        ih0.getClass();
        ih0.e(this);
    }

    final /* synthetic */ void v() {
        this.f38237h0 = true;
    }

    final /* synthetic */ void w(com.google.android.gms.internal.ads.T0 t6) {
        this.f38229Z = this.f38221R == null ? t6 : new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L);
        this.f38230a0 = t6.a();
        boolean z6 = false;
        if (!this.f38237h0 && t6.a() == -9223372036854775807L) {
            z6 = true;
        }
        this.f38231b0 = z6;
        this.f38232c0 = true == z6 ? 7 : 1;
        if (this.f38225V) {
            this.f38211H.d(this.f38230a0, t6.g(), this.f38231b0);
        } else {
            F();
        }
    }

    final void x() throws java.io.IOException {
        this.f38214K.i(com.google.android.gms.internal.ads.C3365cK0.a(this.f38232c0));
    }

    final void y(int i6) {
        this.f38222S[i6].E();
        x();
    }

    public final void z() {
        if (this.f38225V) {
            for (com.google.android.gms.internal.ads.DI0 di0 : this.f38222S) {
                di0.F();
            }
        }
        this.f38214K.j(this);
        this.f38219P.removeCallbacksAndMessages(null);
        this.f38220Q = null;
        this.f38243n0 = true;
    }
}
