package p122m1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p122m1.m {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final m1.f.a f50371h1 = new m1.f.a(null);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f50372i1 = 8;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final boolean f50373j1 = false;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private p132n1.b f50374H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private p132n1.e f50375I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f50376J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private n1.b.c f50377K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private boolean f50378L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private p042e1.d f50379M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f50380N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f50381O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f50382P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f50383Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private int f50384R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private int f50385S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private p122m1.c[] f50386T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private p122m1.c[] f50387U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private int f50388V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private boolean f50389W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private boolean f50390X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private boolean f50391Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private java.lang.String f50392Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f50393a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private java.lang.ref.WeakReference f50394b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private java.lang.ref.WeakReference f50395c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private java.lang.ref.WeakReference f50396d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private java.lang.ref.WeakReference f50397e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private java.util.HashSet f50398f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private p132n1.b.C0649b f50399g1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean a(int i6, p122m1.e eVar, n1.b.c cVar, p132n1.b.C0649b c0649b, int i10) {
            int iK;
            int i11;
            p247y7.AbstractC7350t.f(eVar, "widget");
            p247y7.AbstractC7350t.f(c0649b, "measure");
            if (p122m1.f.f50373j1) {
                java.lang.System.out.println((java.lang.Object) (p132n1.h.f51393a.c(i6) + "(M) call to measure " + eVar.q()));
            }
            if (cVar == null) {
                return false;
            }
            if (eVar.A0() == 8 || (eVar instanceof p122m1.h) || (eVar instanceof p122m1.a)) {
                if (p122m1.f.f50373j1) {
                    java.lang.System.out.println((java.lang.Object) (p132n1.h.f51393a.c(i6) + "(M) no measure needed for " + eVar.q()));
                }
                c0649b.u(0);
                c0649b.s(0);
                return false;
            }
            c0649b.n(eVar.A());
            c0649b.v(eVar.y0());
            c0649b.o(eVar.B0());
            c0649b.w(eVar.w());
            c0649b.t(false);
            c0649b.p(i10);
            m1.e.b bVarD = c0649b.d();
            m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
            boolean z6 = bVarD == bVar;
            boolean z10 = c0649b.l() == bVar;
            boolean z11 = z6 && eVar.I() > 0.0f;
            boolean z12 = z10 && eVar.I() > 0.0f;
            if (z6 && eVar.E0(0) && eVar.Q() == 0 && !z11) {
                c0649b.n(m1.e.b.WRAP_CONTENT);
                if (z10 && eVar.P() == 0) {
                    c0649b.n(m1.e.b.FIXED);
                }
                z6 = false;
            }
            if (z10 && eVar.E0(1) && eVar.P() == 0 && !z12) {
                c0649b.v(m1.e.b.WRAP_CONTENT);
                if (z6 && eVar.Q() == 0) {
                    c0649b.v(m1.e.b.FIXED);
                }
                z10 = false;
            }
            if (eVar.Q0()) {
                c0649b.n(m1.e.b.FIXED);
                z6 = false;
            }
            if (eVar.R0()) {
                c0649b.v(m1.e.b.FIXED);
                z10 = false;
            }
            if (z11) {
                if (eVar.a0()[0] == 4) {
                    c0649b.n(m1.e.b.FIXED);
                } else if (!z10) {
                    m1.e.b bVarL = c0649b.l();
                    m1.e.b bVar2 = m1.e.b.FIXED;
                    if (bVarL == bVar2) {
                        i11 = c0649b.m();
                    } else {
                        c0649b.n(m1.e.b.WRAP_CONTENT);
                        cVar.b(eVar, c0649b);
                        i11 = c0649b.i();
                    }
                    c0649b.n(bVar2);
                    c0649b.o((int) (eVar.s() * i11));
                    if (p122m1.f.f50373j1) {
                        java.lang.System.out.println((java.lang.Object) "(M) Measured once for ratio on horizontal side...");
                    }
                }
            }
            if (z12) {
                if (eVar.a0()[1] == 4) {
                    c0649b.v(m1.e.b.FIXED);
                } else if (!z6) {
                    m1.e.b bVarD2 = c0649b.d();
                    m1.e.b bVar3 = m1.e.b.FIXED;
                    if (bVarD2 == bVar3) {
                        iK = c0649b.e();
                    } else {
                        c0649b.v(m1.e.b.WRAP_CONTENT);
                        cVar.b(eVar, c0649b);
                        iK = c0649b.k();
                    }
                    c0649b.v(bVar3);
                    c0649b.w(eVar.t() == -1 ? (int) (iK / eVar.s()) : (int) (eVar.s() * iK));
                    if (p122m1.f.f50373j1) {
                        java.lang.System.out.println((java.lang.Object) "(M) Measured once for ratio on vertical side...");
                    }
                }
            }
            cVar.b(eVar, c0649b);
            eVar.U1(c0649b.k());
            eVar.m1(c0649b.i());
            eVar.l1(c0649b.h());
            eVar.a1(c0649b.g());
            c0649b.p(p132n1.b.C0649b.f51342k.a());
            if (p122m1.f.f50373j1) {
                java.lang.System.out.println((java.lang.Object) ("(M) Measured " + eVar.q() + " with : " + eVar.A() + " x " + eVar.y0() + " => " + eVar.B0() + " x " + eVar.w()));
            }
            return c0649b.j();
        }
    }

    public f(int i6, int i10) {
        super(i6, i10);
        this.f50374H0 = new p132n1.b(this);
        this.f50375I0 = new p132n1.e(this);
        this.f50379M0 = new p042e1.d();
        this.f50386T0 = new p122m1.c[4];
        this.f50387U0 = new p122m1.c[4];
        this.f50388V0 = 257;
        this.f50392Z0 = "ConstraintLayout";
        this.f50398f1 = new java.util.HashSet();
        this.f50399g1 = new p132n1.b.C0649b();
    }

    private final void M2() {
        this.f50384R0 = 0;
        this.f50385S0 = 0;
    }

    private final void l2(p122m1.e eVar) {
        int i6 = this.f50384R0 + 1;
        p122m1.c[] cVarArr = this.f50387U0;
        if (i6 >= cVarArr.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(cVarArr, cVarArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            this.f50387U0 = (p122m1.c[]) objArrCopyOf;
        }
        this.f50387U0[this.f50384R0] = new p122m1.c(eVar, 0, J2());
        this.f50384R0++;
    }

    private final void o2(p122m1.d dVar, p042e1.i iVar) {
        p042e1.i iVarU = this.f50379M0.u(dVar);
        p042e1.d dVar2 = this.f50379M0;
        p247y7.AbstractC7350t.c(iVarU);
        dVar2.l(iVar, iVarU, 0, 5);
    }

    private final void p2(p122m1.d dVar, p042e1.i iVar) {
        p042e1.i iVarU = this.f50379M0.u(dVar);
        p042e1.d dVar2 = this.f50379M0;
        p247y7.AbstractC7350t.c(iVarU);
        dVar2.l(iVarU, iVar, 0, 5);
    }

    private final void q2(p122m1.e eVar) {
        int i6 = this.f50385S0 + 1;
        p122m1.c[] cVarArr = this.f50386T0;
        if (i6 >= cVarArr.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(cVarArr, cVarArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            this.f50386T0 = (p122m1.c[]) objArrCopyOf;
        }
        this.f50386T0[this.f50385S0] = new p122m1.c(eVar, 1, J2());
        this.f50385S0++;
    }

    public final int A2() {
        return this.f50380N0;
    }

    public final int B2() {
        return this.f50381O0;
    }

    public final p122m1.c[] C2() {
        return this.f50386T0;
    }

    public final int D2() {
        return this.f50385S0;
    }

    public final n1.b.c E2() {
        return this.f50377K0;
    }

    public final int F2() {
        return this.f50388V0;
    }

    public final p042e1.d G2() {
        return this.f50379M0;
    }

    public final boolean H2() {
        return false;
    }

    public final void I2() {
        this.f50375I0.j();
    }

    public final boolean J2() {
        return this.f50378L0;
    }

    @Override // p122m1.e
    public void K1(java.lang.String str) {
        this.f50392Z0 = str;
    }

    public final long K2(int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f50380N0 = i16;
        this.f50381O0 = i17;
        return this.f50374H0.d(this, i6, i16, i17, i10, i11, i12, i13, i14, i15);
    }

    public final boolean L2(int i6) {
        return (this.f50388V0 & i6) == i6;
    }

    public final void N2(n1.b.c cVar) {
        this.f50377K0 = cVar;
        this.f50375I0.m(cVar);
    }

    public final void O2(int i6) {
        this.f50388V0 = i6;
        p042e1.d.f44549s.f(L2(512));
    }

    public final void P2(int i6) {
        this.f50376J0 = i6;
    }

    public final boolean Q2(p042e1.d dVar, boolean[] zArr) {
        p247y7.AbstractC7350t.f(zArr, "flags");
        zArr[2] = false;
        boolean zL2 = L2(64);
        p247y7.AbstractC7350t.c(dVar);
        Z1(dVar, zL2);
        int size = d2().size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = d2().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p122m1.e eVar = (p122m1.e) obj;
            eVar.Z1(dVar, zL2);
            if (eVar.G0()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void R2() {
        this.f50374H0.e(this);
    }

    @Override // p122m1.m, p122m1.e
    public void W0() {
        this.f50379M0.H();
        this.f50380N0 = 0;
        this.f50382P0 = 0;
        this.f50381O0 = 0;
        this.f50383Q0 = 0;
        this.f50389W0 = false;
        super.W0();
    }

    @Override // p122m1.e
    public void Y1(boolean z6, boolean z10) {
        super.Y1(z6, z10);
        int size = d2().size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = d2().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            ((p122m1.e) obj).Y1(z6, z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:134:0x02da  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0 A[LOOP:5: B:135:0x02de->B:136:0x02e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x0380  */
    /* JADX WARN: Code duplicated, block: B:160:0x039f  */
    /* JADX WARN: Code duplicated, block: B:162:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x03df A[PHI: r0 r11
  0x03df: PHI (r0v22 boolean) = (r0v21 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:159:0x039d, B:167:0x03c7, B:168:0x03c9, B:169:0x03cb] A[DONT_GENERATE, DONT_INLINE]
  0x03df: PHI (r11v5 boolean) = (r11v4 boolean), (r11v7 boolean), (r11v7 boolean), (r11v7 boolean) binds: [B:159:0x039d, B:167:0x03c7, B:168:0x03c9, B:169:0x03cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // p122m1.m
    public void e2() {
        int i6;
        int i10;
        boolean z6;
        p042e1.d dVar;
        int i11;
        boolean zQ2;
        boolean z10;
        boolean z11;
        int i12;
        m1.e.b bVar;
        m1.e.b bVar2;
        ?? r6;
        boolean z12;
        m1.e.b bVar3;
        if (f50373j1) {
            java.io.PrintStream printStream = java.lang.System.out;
            printStream.println((java.lang.Object) "\n#####################################");
            printStream.println((java.lang.Object) "##          CL LAYOUT PASS           ##");
            printStream.println((java.lang.Object) "#####################################\n");
            this.f50393a1 = 0;
        }
        A1(0);
        B1(0);
        this.f50390X0 = false;
        this.f50391Y0 = false;
        int size = d2().size();
        int iMax = java.lang.Math.max(0, B0());
        int iMax2 = java.lang.Math.max(0, w());
        m1.e.b bVar4 = N()[1];
        m1.e.b bVar5 = N()[0];
        if (this.f50376J0 == 0 && p122m1.k.f50458a.b(this.f50388V0, 1)) {
            p132n1.h.f51393a.i(this, E2());
            for (int i13 = 0; i13 < size; i13++) {
                java.lang.Object obj = d2().get(i13);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                p122m1.e eVar = (p122m1.e) obj;
                if (eVar.P0() && !(eVar instanceof p122m1.h) && !(eVar instanceof p122m1.a) && !(eVar instanceof p122m1.l) && !eVar.O0()) {
                    m1.e.b bVarR = eVar.r(0);
                    m1.e.b bVarR2 = eVar.r(1);
                    m1.e.b bVar6 = m1.e.b.MATCH_CONSTRAINT;
                    if (bVarR != bVar6 || eVar.Q() == 1 || bVarR2 != bVar6 || eVar.P() == 1) {
                        f50371h1.a(0, eVar, this.f50377K0, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                    }
                }
            }
        }
        if (size <= 2 || !((bVar5 == (bVar3 = m1.e.b.WRAP_CONTENT) || bVar4 == bVar3) && p122m1.k.f50458a.b(this.f50388V0, 1024) && p132n1.i.f51397a.c(this, E2()))) {
            i6 = iMax2;
            i10 = iMax;
            z6 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax >= B0() || iMax <= 0) {
                    iMax = B0();
                } else {
                    U1(iMax);
                    this.f50390X0 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax2 >= w() || iMax2 <= 0) {
                    iMax2 = w();
                } else {
                    m1(iMax2);
                    this.f50391Y0 = true;
                }
            }
            i6 = iMax2;
            i10 = iMax;
            z6 = true;
        }
        boolean z13 = L2(64) || L2(128);
        this.f50379M0.I(false);
        this.f50379M0.K(false);
        if (this.f50388V0 != 0 && z13) {
            this.f50379M0.K(true);
        }
        java.util.ArrayList arrayListD2 = d2();
        m1.e.b bVarA = A();
        m1.e.b bVar7 = m1.e.b.WRAP_CONTENT;
        boolean z14 = bVarA == bVar7 || y0() == bVar7;
        M2();
        for (int i14 = 0; i14 < size; i14++) {
            java.lang.Object obj2 = d2().get(i14);
            p247y7.AbstractC7350t.e(obj2, "get(...)");
            p122m1.e eVar2 = (p122m1.e) obj2;
            if (eVar2 instanceof p122m1.m) {
                ((p122m1.m) eVar2).e2();
            }
        }
        boolean zL2 = L2(64);
        boolean z15 = z6;
        boolean zK2 = true;
        int i15 = 0;
        while (zK2) {
            i15++;
            try {
                this.f50379M0.H();
                M2();
                if (f50373j1) {
                    java.lang.String strQ = q();
                    if (strQ == null) {
                        strQ = "root";
                    }
                    d1(this.f50379M0, strQ);
                    int i16 = 0;
                    while (i16 < size) {
                        java.lang.Object obj3 = d2().get(i16);
                        p247y7.AbstractC7350t.e(obj3, "get(...)");
                        p122m1.e eVar3 = (p122m1.e) obj3;
                        if (eVar3.q() != null) {
                            p042e1.d dVar2 = this.f50379M0;
                            z12 = zK2;
                            try {
                                java.lang.String strQ2 = eVar3.q();
                                p247y7.AbstractC7350t.c(strQ2);
                                eVar3.d1(dVar2, strQ2);
                            } catch (java.lang.Exception e6) {
                                e = e6;
                                zK2 = z12;
                                e.printStackTrace();
                                java.lang.System.out.println((java.lang.Object) ("EXCEPTION : " + e));
                                dVar = this.f50379M0;
                                if (zK2) {
                                    zQ2 = Q2(dVar, p122m1.k.f50458a.c());
                                } else {
                                    Z1(dVar, zL2);
                                    for (i11 = 0; i11 < size; i11++) {
                                        java.lang.Object obj4 = d2().get(i11);
                                        p247y7.AbstractC7350t.e(obj4, "get(...)");
                                        ((p122m1.e) obj4).Z1(this.f50379M0, zL2);
                                    }
                                    zQ2 = false;
                                }
                                if (z14) {
                                    z10 = zQ2;
                                    zL2 = zL2;
                                    z11 = z10;
                                } else {
                                    z10 = zQ2;
                                    zL2 = zL2;
                                    z11 = z10;
                                }
                                int iMax3 = java.lang.Math.max(Y(), B0());
                                int iMax4 = java.lang.Math.max(X(), w());
                                if (z15) {
                                    zK2 = z11;
                                    i12 = 8;
                                } else {
                                    bVar = N()[0];
                                    bVar2 = m1.e.b.WRAP_CONTENT;
                                    if (bVar == bVar2) {
                                        r6 = 1;
                                    } else {
                                        r6 = 1;
                                    }
                                    if (N()[r6] == bVar2) {
                                        zK2 = z11;
                                        i12 = 8;
                                    } else {
                                        zK2 = z11;
                                        i12 = 8;
                                    }
                                }
                                if (i15 > i12) {
                                    zK2 = false;
                                }
                            }
                        } else {
                            z12 = zK2;
                        }
                        i16++;
                        zK2 = z12;
                    }
                } else {
                    j(this.f50379M0);
                    for (int i17 = 0; i17 < size; i17++) {
                        java.lang.Object obj5 = d2().get(i17);
                        p247y7.AbstractC7350t.e(obj5, "get(...)");
                        ((p122m1.e) obj5).j(this.f50379M0);
                    }
                }
                zK2 = k2(this.f50379M0);
                try {
                    java.lang.ref.WeakReference weakReference = this.f50394b1;
                    if (weakReference != null) {
                        p247y7.AbstractC7350t.c(weakReference);
                        if (weakReference.get() != null) {
                            java.lang.ref.WeakReference weakReference2 = this.f50394b1;
                            p247y7.AbstractC7350t.c(weakReference2);
                            java.lang.Object obj6 = weakReference2.get();
                            p247y7.AbstractC7350t.c(obj6);
                            p042e1.i iVarU = this.f50379M0.u(c0());
                            p247y7.AbstractC7350t.c(iVarU);
                            p2((p122m1.d) obj6, iVarU);
                            this.f50394b1 = null;
                        }
                    }
                    java.lang.ref.WeakReference weakReference3 = this.f50396d1;
                    if (weakReference3 != null) {
                        p247y7.AbstractC7350t.c(weakReference3);
                        if (weakReference3.get() != null) {
                            java.lang.ref.WeakReference weakReference4 = this.f50396d1;
                            p247y7.AbstractC7350t.c(weakReference4);
                            java.lang.Object obj7 = weakReference4.get();
                            p247y7.AbstractC7350t.c(obj7);
                            p042e1.i iVarU2 = this.f50379M0.u(G());
                            p247y7.AbstractC7350t.c(iVarU2);
                            o2((p122m1.d) obj7, iVarU2);
                            this.f50396d1 = null;
                        }
                    }
                    java.lang.ref.WeakReference weakReference5 = this.f50395c1;
                    if (weakReference5 != null) {
                        p247y7.AbstractC7350t.c(weakReference5);
                        if (weakReference5.get() != null) {
                            java.lang.ref.WeakReference weakReference6 = this.f50395c1;
                            p247y7.AbstractC7350t.c(weakReference6);
                            java.lang.Object obj8 = weakReference6.get();
                            p247y7.AbstractC7350t.c(obj8);
                            p042e1.i iVarU3 = this.f50379M0.u(L());
                            p247y7.AbstractC7350t.c(iVarU3);
                            p2((p122m1.d) obj8, iVarU3);
                            this.f50395c1 = null;
                        }
                    }
                    java.lang.ref.WeakReference weakReference7 = this.f50397e1;
                    if (weakReference7 != null) {
                        p247y7.AbstractC7350t.c(weakReference7);
                        if (weakReference7.get() != null) {
                            java.lang.ref.WeakReference weakReference8 = this.f50397e1;
                            p247y7.AbstractC7350t.c(weakReference8);
                            java.lang.Object obj9 = weakReference8.get();
                            p247y7.AbstractC7350t.c(obj9);
                            p042e1.i iVarU4 = this.f50379M0.u(b0());
                            p247y7.AbstractC7350t.c(iVarU4);
                            o2((p122m1.d) obj9, iVarU4);
                            this.f50397e1 = null;
                        }
                    }
                    if (zK2) {
                        this.f50379M0.D();
                    }
                } catch (java.lang.Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    java.lang.System.out.println((java.lang.Object) ("EXCEPTION : " + e));
                }
            } catch (java.lang.Exception e11) {
                e = e11;
            }
            dVar = this.f50379M0;
            if (zK2) {
                zQ2 = Q2(dVar, p122m1.k.f50458a.c());
            } else {
                Z1(dVar, zL2);
                while (i11 < size) {
                    java.lang.Object obj10 = d2().get(i11);
                    p247y7.AbstractC7350t.e(obj10, "get(...)");
                    ((p122m1.e) obj10).Z1(this.f50379M0, zL2);
                }
                zQ2 = false;
            }
            if (z14 || i15 >= 8 || !p122m1.k.f50458a.c()[2]) {
                z10 = zQ2;
                zL2 = zL2;
            } else {
                int iMax5 = 0;
                int i18 = 0;
                int iMax6 = 0;
                while (true) {
                    z10 = zQ2;
                    if (i18 >= size) {
                        break;
                    }
                    java.lang.Object obj11 = d2().get(i18);
                    p247y7.AbstractC7350t.e(obj11, "get(...)");
                    p122m1.e eVar4 = (p122m1.e) obj11;
                    iMax6 = java.lang.Math.max(iMax6, eVar4.g0() + eVar4.B0());
                    iMax5 = java.lang.Math.max(iMax5, eVar4.h0() + eVar4.w());
                    i18++;
                    zQ2 = z10;
                    zL2 = zL2;
                }
                zL2 = zL2;
                int iMax7 = java.lang.Math.max(Y(), iMax6);
                int iMax8 = java.lang.Math.max(X(), iMax5);
                m1.e.b bVar8 = m1.e.b.WRAP_CONTENT;
                if (bVar5 == bVar8 && B0() < iMax7) {
                    U1(iMax7);
                    N()[0] = bVar8;
                    z15 = true;
                    z10 = true;
                }
                if (bVar4 == bVar8 && w() < iMax8) {
                    m1(iMax8);
                    N()[1] = bVar8;
                    z11 = true;
                    z15 = true;
                }
                int iMax9 = java.lang.Math.max(Y(), B0());
                int iMax10 = java.lang.Math.max(X(), w());
                if (z15) {
                    bVar = N()[0];
                    bVar2 = m1.e.b.WRAP_CONTENT;
                    if (bVar == bVar2 || i10 <= 0 || iMax9 <= i10) {
                        r6 = 1;
                    } else {
                        r6 = 1;
                        this.f50390X0 = true;
                        N()[0] = m1.e.b.FIXED;
                        U1(i10);
                        z11 = true;
                        z15 = true;
                    }
                    if (N()[r6] == bVar2 || i6 <= 0 || iMax10 <= i6) {
                        zK2 = z11;
                        i12 = 8;
                    } else {
                        this.f50391Y0 = r6;
                        N()[r6] = m1.e.b.FIXED;
                        m1(i6);
                        i12 = 8;
                        z15 = true;
                        zK2 = true;
                    }
                } else {
                    zK2 = z11;
                    i12 = 8;
                }
                if (i15 > i12) {
                    zK2 = false;
                }
            }
            z11 = z10;
            int iMax11 = java.lang.Math.max(Y(), B0());
            int iMax12 = java.lang.Math.max(X(), w());
            if (z15) {
                bVar = N()[0];
                bVar2 = m1.e.b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    r6 = 1;
                } else {
                    r6 = 1;
                }
                if (N()[r6] == bVar2) {
                    zK2 = z11;
                    i12 = 8;
                } else {
                    zK2 = z11;
                    i12 = 8;
                }
            } else {
                zK2 = z11;
                i12 = 8;
            }
            if (i15 > i12) {
                zK2 = false;
            }
        }
        p247y7.AbstractC7350t.d(arrayListD2, "null cannot be cast to non-null type java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget>{ kotlin.collections.TypeAliasesKt.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> }");
        h2(arrayListD2);
        if (z15) {
            N()[0] = bVar5;
            N()[1] = bVar4;
        }
        Z0(this.f50379M0.y());
    }

    public final void j2(p122m1.e eVar, int i6) {
        p247y7.AbstractC7350t.f(eVar, "constraintWidget");
        if (i6 == 0) {
            l2(eVar);
        } else {
            if (i6 != 1) {
                return;
            }
            q2(eVar);
        }
    }

    public final boolean k2(p042e1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "system");
        if (f50373j1) {
            java.io.PrintStream printStream = java.lang.System.out;
            printStream.println((java.lang.Object) "\n#######################################");
            printStream.println((java.lang.Object) ("##    ADD CHILDREN TO SOLVER  (" + this.f50393a1 + ") ##"));
            printStream.println((java.lang.Object) "#######################################\n");
            this.f50393a1 = this.f50393a1 + 1;
        }
        boolean zL2 = L2(64);
        d(dVar, zL2);
        int size = d2().size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = d2().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p122m1.e eVar = (p122m1.e) obj;
            eVar.v1(0, false);
            eVar.v1(1, false);
            if (eVar instanceof p122m1.a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i10 = 0; i10 < size; i10++) {
                java.lang.Object obj2 = d2().get(i10);
                p247y7.AbstractC7350t.e(obj2, "get(...)");
                p122m1.e eVar2 = (p122m1.e) obj2;
                if (eVar2 instanceof p122m1.a) {
                    ((p122m1.a) eVar2).k2();
                }
            }
        }
        this.f50398f1.clear();
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj3 = d2().get(i11);
            p247y7.AbstractC7350t.e(obj3, "get(...)");
            p122m1.e eVar3 = (p122m1.e) obj3;
            if (eVar3.c()) {
                if (eVar3 instanceof p122m1.l) {
                    this.f50398f1.add(eVar3);
                } else {
                    eVar3.d(dVar, zL2);
                }
            }
        }
        while (this.f50398f1.size() > 0) {
            int size2 = this.f50398f1.size();
            for (p122m1.e eVar4 : this.f50398f1) {
                p247y7.AbstractC7350t.d(eVar4, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.VirtualLayout");
                p122m1.l lVar = (p122m1.l) eVar4;
                if (lVar.f2(this.f50398f1)) {
                    lVar.d(dVar, zL2);
                    this.f50398f1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f50398f1.size()) {
                java.util.Iterator it = this.f50398f1.iterator();
                while (it.hasNext()) {
                    ((p122m1.e) it.next()).d(dVar, zL2);
                }
                this.f50398f1.clear();
            }
        }
        if (p042e1.d.f44549s.e()) {
            java.util.HashSet<p122m1.e> hashSet = new java.util.HashSet();
            for (int i12 = 0; i12 < size; i12++) {
                java.lang.Object obj4 = d2().get(i12);
                p247y7.AbstractC7350t.e(obj4, "get(...)");
                p122m1.e eVar5 = (p122m1.e) obj4;
                if (!eVar5.c()) {
                    hashSet.add(eVar5);
                }
            }
            b(this, dVar, hashSet, A() == m1.e.b.WRAP_CONTENT ? 0 : 1, false);
            for (p122m1.e eVar6 : hashSet) {
                m1.k.a aVar = p122m1.k.f50458a;
                p247y7.AbstractC7350t.c(eVar6);
                aVar.a(this, dVar, eVar6);
                eVar6.d(dVar, zL2);
            }
        } else {
            for (int i13 = 0; i13 < size; i13++) {
                java.lang.Object obj5 = d2().get(i13);
                p247y7.AbstractC7350t.e(obj5, "get(...)");
                p122m1.e eVar7 = (p122m1.e) obj5;
                if (eVar7 instanceof p122m1.f) {
                    m1.e.b bVar = eVar7.N()[0];
                    m1.e.b bVar2 = eVar7.N()[1];
                    m1.e.b bVar3 = m1.e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar7.r1(m1.e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.P1(m1.e.b.FIXED);
                    }
                    eVar7.d(dVar, zL2);
                    if (bVar == bVar3) {
                        eVar7.r1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.P1(bVar2);
                    }
                } else {
                    p122m1.k.f50458a.a(this, dVar, eVar7);
                    if (!eVar7.c()) {
                        eVar7.d(dVar, zL2);
                    }
                }
            }
        }
        if (this.f50384R0 > 0) {
            p122m1.b.f50231a.b(this, dVar, null, 0);
        }
        if (this.f50385S0 > 0) {
            p122m1.b.f50231a.b(this, dVar, null, 1);
        }
        return true;
    }

    public final void m2(p122m1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "right");
        java.lang.ref.WeakReference weakReference = this.f50397e1;
        if (weakReference != null) {
            p247y7.AbstractC7350t.c(weakReference);
            if (weakReference.get() != null) {
                int iE = dVar.e();
                java.lang.ref.WeakReference weakReference2 = this.f50397e1;
                p247y7.AbstractC7350t.c(weakReference2);
                java.lang.Object obj = weakReference2.get();
                p247y7.AbstractC7350t.c(obj);
                if (iE <= ((p122m1.d) obj).e()) {
                    return;
                }
            }
        }
        this.f50397e1 = new java.lang.ref.WeakReference(dVar);
    }

    public final void n2(p122m1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "left");
        java.lang.ref.WeakReference weakReference = this.f50395c1;
        if (weakReference != null) {
            p247y7.AbstractC7350t.c(weakReference);
            if (weakReference.get() != null) {
                int iE = dVar.e();
                java.lang.ref.WeakReference weakReference2 = this.f50395c1;
                p247y7.AbstractC7350t.c(weakReference2);
                java.lang.Object obj = weakReference2.get();
                p247y7.AbstractC7350t.c(obj);
                if (iE <= ((p122m1.d) obj).e()) {
                    return;
                }
            }
        }
        this.f50395c1 = new java.lang.ref.WeakReference(dVar);
    }

    public final void r2(p122m1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "bottom");
        java.lang.ref.WeakReference weakReference = this.f50396d1;
        if (weakReference != null) {
            if ((weakReference != null ? (p122m1.d) weakReference.get() : null) != null) {
                int iE = dVar.e();
                java.lang.ref.WeakReference weakReference2 = this.f50396d1;
                p122m1.d dVar2 = weakReference2 != null ? (p122m1.d) weakReference2.get() : null;
                p247y7.AbstractC7350t.c(dVar2);
                if (iE <= dVar2.e()) {
                    return;
                }
            }
        }
        this.f50396d1 = new java.lang.ref.WeakReference(dVar);
    }

    public final void s2(p122m1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "top");
        java.lang.ref.WeakReference weakReference = this.f50394b1;
        if (weakReference != null) {
            p247y7.AbstractC7350t.c(weakReference);
            if (weakReference.get() != null) {
                int iE = dVar.e();
                java.lang.ref.WeakReference weakReference2 = this.f50394b1;
                p247y7.AbstractC7350t.c(weakReference2);
                java.lang.Object obj = weakReference2.get();
                p247y7.AbstractC7350t.c(obj);
                if (iE <= ((p122m1.d) obj).e()) {
                    return;
                }
            }
        }
        this.f50394b1 = new java.lang.ref.WeakReference(dVar);
    }

    public final boolean t2(boolean z6) {
        return this.f50375I0.f(z6);
    }

    @Override // p122m1.e
    public java.lang.String u0() {
        return this.f50392Z0;
    }

    public final boolean u2(boolean z6) {
        return this.f50375I0.g(z6);
    }

    public final boolean v2(boolean z6, int i6) {
        return this.f50375I0.h(z6, i6);
    }

    public final p122m1.c[] w2() {
        return this.f50387U0;
    }

    public final int x2() {
        return this.f50384R0;
    }

    public final p132n1.b.C0649b y2() {
        return this.f50399g1;
    }

    public final p042e1.e z2() {
        return null;
    }
}
