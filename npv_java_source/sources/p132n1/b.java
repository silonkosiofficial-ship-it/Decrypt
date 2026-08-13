package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1.b.a f51337d = new n1.b.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51338e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f51339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p132n1.b.C0649b f51340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p122m1.f f51341c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: n1.b$b, reason: collision with other inner class name */
    public static final class C0649b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f51344m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m1.e.b f51347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m1.e.b f51348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f51353g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f51354h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f51355i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f51356j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final p132n1.b.C0649b.a f51342k = new p132n1.b.C0649b.a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f51343l = 8;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f51345n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f51346o = 2;

        /* JADX INFO: renamed from: n1.b$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a() {
                return p132n1.b.C0649b.f51344m;
            }

            public final int b() {
                return p132n1.b.C0649b.f51345n;
            }

            public final int c() {
                return p132n1.b.C0649b.f51346o;
            }
        }

        public final m1.e.b d() {
            m1.e.b bVar = this.f51347a;
            if (bVar != null) {
                return bVar;
            }
            p247y7.AbstractC7350t.p("horizontalBehavior");
            return null;
        }

        public final int e() {
            return this.f51349c;
        }

        public final int f() {
            return this.f51356j;
        }

        public final int g() {
            return this.f51353g;
        }

        public final boolean h() {
            return this.f51354h;
        }

        public final int i() {
            return this.f51352f;
        }

        public final boolean j() {
            return this.f51355i;
        }

        public final int k() {
            return this.f51351e;
        }

        public final m1.e.b l() {
            m1.e.b bVar = this.f51348b;
            if (bVar != null) {
                return bVar;
            }
            p247y7.AbstractC7350t.p("verticalBehavior");
            return null;
        }

        public final int m() {
            return this.f51350d;
        }

        public final void n(m1.e.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "<set-?>");
            this.f51347a = bVar;
        }

        public final void o(int i6) {
            this.f51349c = i6;
        }

        public final void p(int i6) {
            this.f51356j = i6;
        }

        public final void q(int i6) {
            this.f51353g = i6;
        }

        public final void r(boolean z6) {
            this.f51354h = z6;
        }

        public final void s(int i6) {
            this.f51352f = i6;
        }

        public final void t(boolean z6) {
            this.f51355i = z6;
        }

        public final void u(int i6) {
            this.f51351e = i6;
        }

        public final void v(m1.e.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "<set-?>");
            this.f51348b = bVar;
        }

        public final void w(int i6) {
            this.f51350d = i6;
        }
    }

    public interface c {
        void a();

        void b(p122m1.e eVar, p132n1.b.C0649b c0649b);
    }

    public b(p122m1.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "constraintWidgetContainer");
        this.f51339a = new java.util.ArrayList();
        this.f51340b = new p132n1.b.C0649b();
        this.f51341c = fVar;
    }

    private final boolean a(n1.b.c cVar, p122m1.e eVar, int i6) {
        this.f51340b.n(eVar.A());
        this.f51340b.v(eVar.y0());
        this.f51340b.o(eVar.B0());
        this.f51340b.w(eVar.w());
        this.f51340b.t(false);
        this.f51340b.p(i6);
        m1.e.b bVarD = this.f51340b.d();
        m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
        boolean z6 = bVarD == bVar;
        boolean z10 = this.f51340b.l() == bVar;
        boolean z11 = z6 && eVar.I() > 0.0f;
        boolean z12 = z10 && eVar.I() > 0.0f;
        if (z11 && eVar.a0()[0] == 4) {
            this.f51340b.n(m1.e.b.FIXED);
        }
        if (z12 && eVar.a0()[1] == 4) {
            this.f51340b.v(m1.e.b.FIXED);
        }
        cVar.b(eVar, this.f51340b);
        eVar.U1(this.f51340b.k());
        eVar.m1(this.f51340b.i());
        eVar.l1(this.f51340b.h());
        eVar.a1(this.f51340b.g());
        this.f51340b.p(p132n1.b.C0649b.f51342k.a());
        return this.f51340b.j();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5 A[PHI: r10
  0x00c5: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0089, B:34:0x008f, B:36:0x0093, B:54:0x00c2, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x006b, please report this as an issue */
    private final void b(p122m1.f fVar) {
        m1.e.b bVarR;
        m1.e.b bVar;
        boolean z6;
        boolean z10;
        int size = fVar.d2().size();
        boolean zL2 = fVar.L2(64);
        n1.b.c cVarE2 = fVar.E2();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = fVar.d2().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p122m1.e eVar = (p122m1.e) obj;
            if (!(eVar instanceof p122m1.h) && !(eVar instanceof p122m1.a) && !eVar.O0()) {
                if (!zL2 || eVar.K() == null || eVar.e0() == null) {
                    bVarR = eVar.r(0);
                    m1.e.b bVarR2 = eVar.r(1);
                    bVar = m1.e.b.MATCH_CONSTRAINT;
                    if (bVarR == bVar || eVar.Q() == 1 || bVarR2 != bVar || eVar.P() == 1) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6 && fVar.L2(1) && !(eVar instanceof p122m1.l)) {
                        if (bVarR == bVar && eVar.Q() == 0 && bVarR2 != bVar && !eVar.M0()) {
                            z6 = true;
                        }
                        if (bVarR2 == bVar && eVar.P() == 0 && bVarR != bVar && !eVar.M0()) {
                            z6 = true;
                        }
                        z10 = (!(bVarR == bVar || bVarR2 == bVar) || eVar.I() <= 0.0f) ? z6 : true;
                    }
                    if (!z10) {
                        p247y7.AbstractC7350t.c(cVarE2);
                        a(cVarE2, eVar, p132n1.b.C0649b.f51342k.a());
                        fVar.z2();
                    }
                } else {
                    p132n1.l lVarK = eVar.K();
                    p247y7.AbstractC7350t.c(lVarK);
                    if (lVarK.i().i()) {
                        p132n1.n nVarE0 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE0);
                        if (!nVarE0.i().i()) {
                            bVarR = eVar.r(0);
                            m1.e.b bVarR3 = eVar.r(1);
                            bVar = m1.e.b.MATCH_CONSTRAINT;
                            if (bVarR == bVar) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                            }
                            if (!z10) {
                                p247y7.AbstractC7350t.c(cVarE2);
                                a(cVarE2, eVar, p132n1.b.C0649b.f51342k.a());
                                fVar.z2();
                            }
                        }
                    } else {
                        bVarR = eVar.r(0);
                        m1.e.b bVarR4 = eVar.r(1);
                        bVar = m1.e.b.MATCH_CONSTRAINT;
                        if (bVarR == bVar) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                        }
                        if (!z10) {
                            p247y7.AbstractC7350t.c(cVarE2);
                            a(cVarE2, eVar, p132n1.b.C0649b.f51342k.a());
                            fVar.z2();
                        }
                    }
                }
            }
        }
        p247y7.AbstractC7350t.c(cVarE2);
        cVarE2.a();
    }

    private final void c(p122m1.f fVar, java.lang.String str, int i6, int i10, int i11) {
        fVar.z2();
        int iM0 = fVar.m0();
        int iL0 = fVar.l0();
        fVar.H1(0);
        fVar.G1(0);
        fVar.U1(i10);
        fVar.m1(i11);
        fVar.H1(iM0);
        fVar.G1(iL0);
        this.f51341c.P2(i6);
        this.f51341c.e2();
        fVar.z2();
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0268  */
    /* JADX WARN: Code duplicated, block: B:146:0x026c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0272  */
    /* JADX WARN: Code duplicated, block: B:149:0x028b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fa  */
    public final long d(p122m1.f fVar, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zV2;
        int i18;
        int i19;
        int iB0;
        int iW;
        boolean z6;
        p132n1.b.C0649b.a aVar;
        int iB;
        int i20;
        boolean zA;
        int iB1;
        int iW2;
        boolean z10;
        p132n1.b bVar = this;
        p247y7.AbstractC7350t.f(fVar, "layout");
        n1.b.c cVarE2 = fVar.E2();
        int size = fVar.d2().size();
        int iB2 = fVar.B0();
        int iW3 = fVar.w();
        m1.k.a aVar2 = p122m1.k.f50458a;
        boolean zB = aVar2.b(i6, 128);
        boolean z11 = zB || aVar2.b(i6, 64);
        if (z11) {
            for (int i21 = 0; i21 < size; i21++) {
                java.lang.Object obj = fVar.d2().get(i21);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                p122m1.e eVar = (p122m1.e) obj;
                m1.e.b bVarA = eVar.A();
                m1.e.b bVar2 = m1.e.b.MATCH_CONSTRAINT;
                boolean z12 = (bVarA == bVar2) && (eVar.y0() == bVar2) && eVar.s() > 0.0f;
                if ((eVar.M0() && z12) || ((eVar.N0() && z12) || (eVar instanceof p122m1.l) || eVar.M0() || eVar.N0())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            p042e1.d.f44549s.d();
        }
        boolean z13 = z11 & ((i12 == 1073741824 && i14 == 1073741824) || zB);
        int i22 = 2;
        if (z13) {
            int iMin = java.lang.Math.min(fVar.j0(), i13);
            int iMin2 = java.lang.Math.min(fVar.i0(), i15);
            if (i12 == 1073741824 && fVar.B0() != iMin) {
                fVar.U1(iMin);
                fVar.I2();
            }
            if (i14 == 1073741824 && fVar.w() != iMin2) {
                fVar.m1(iMin2);
                fVar.I2();
            }
            if (i12 == 1073741824 && i14 == 1073741824) {
                zV2 = fVar.t2(zB);
                i18 = 2;
            } else {
                boolean zU2 = fVar.u2(zB);
                if (i12 == 1073741824) {
                    zU2 &= fVar.v2(zB, 0);
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                if (i14 == 1073741824) {
                    zV2 = fVar.v2(zB, 1) & zU2;
                    i18++;
                } else {
                    zV2 = zU2;
                }
            }
            if (zV2) {
                fVar.Y1(i12 == 1073741824, i14 == 1073741824);
            }
        } else {
            zV2 = false;
            i18 = 0;
        }
        if (!zV2 || i18 != 2) {
            int iF2 = fVar.F2();
            if (size > 0) {
                b(fVar);
            }
            fVar.z2();
            e(fVar);
            int size2 = bVar.f51339a.size();
            if (size > 0) {
                c(fVar, "First pass", 0, iB2, iW3);
            }
            if (size2 > 0) {
                m1.e.b bVarA2 = fVar.A();
                m1.e.b bVar3 = m1.e.b.WRAP_CONTENT;
                boolean z14 = bVarA2 == bVar3;
                boolean z15 = fVar.y0() == bVar3;
                int iMax = java.lang.Math.max(fVar.B0(), bVar.f51341c.m0());
                int iMax2 = java.lang.Math.max(fVar.w(), bVar.f51341c.l0());
                int i23 = 0;
                boolean zP2 = false;
                while (i23 < size2) {
                    java.lang.Object obj2 = bVar.f51339a.get(i23);
                    p247y7.AbstractC7350t.e(obj2, "get(...)");
                    p122m1.e eVar2 = (p122m1.e) obj2;
                    if (eVar2 instanceof p122m1.l) {
                        int iB3 = eVar2.B0();
                        int iW4 = eVar2.w();
                        p247y7.AbstractC7350t.c(cVarE2);
                        boolean zA2 = bVar.a(cVarE2, eVar2, p132n1.b.C0649b.f51342k.b()) | zP2;
                        fVar.z2();
                        int iB4 = eVar2.B0();
                        int iW5 = eVar2.w();
                        if (iB4 != iB3) {
                            eVar2.U1(iB4);
                            if (z14 && eVar2.q0() > iMax) {
                                int iQ0 = eVar2.q0();
                                p122m1.d dVarL = eVar2.l(m1.d.b.RIGHT);
                                p247y7.AbstractC7350t.c(dVarL);
                                iMax = java.lang.Math.max(iMax, iQ0 + dVarL.k());
                            }
                            z10 = true;
                        } else {
                            z10 = zA2;
                        }
                        if (iW5 != iW4) {
                            eVar2.m1(iW5);
                            if (z15 && eVar2.o() > iMax2) {
                                int iO = eVar2.o();
                                p122m1.d dVarL2 = eVar2.l(m1.d.b.BOTTOM);
                                p247y7.AbstractC7350t.c(dVarL2);
                                iMax2 = java.lang.Math.max(iMax2, iO + dVarL2.k());
                            }
                            z10 = true;
                        }
                        zP2 = z10 | ((p122m1.l) eVar2).p2();
                    }
                    i23++;
                    iF2 = iF2;
                    iW3 = iW3;
                    i22 = 2;
                }
                int i24 = iF2;
                int i25 = iW3;
                int i26 = i22;
                int i27 = 0;
                while (i27 < i26) {
                    int i28 = 0;
                    while (i28 < size2) {
                        java.lang.Object obj3 = bVar.f51339a.get(i28);
                        p247y7.AbstractC7350t.e(obj3, "get(...)");
                        p122m1.e eVar3 = (p122m1.e) obj3;
                        if (((eVar3 instanceof p122m1.i) && !(eVar3 instanceof p122m1.l)) || (eVar3 instanceof p122m1.h) || eVar3.A0() == 8) {
                            z6 = z13;
                            i20 = size2;
                        } else if (z13) {
                            p132n1.l lVarK = eVar3.K();
                            p247y7.AbstractC7350t.c(lVarK);
                            if (lVarK.i().i()) {
                                p132n1.n nVarE0 = eVar3.e0();
                                p247y7.AbstractC7350t.c(nVarE0);
                                if (nVarE0.i().i()) {
                                    z6 = z13;
                                    i20 = size2;
                                } else if (eVar3 instanceof p122m1.l) {
                                    z6 = z13;
                                    i20 = size2;
                                } else {
                                    iB0 = eVar3.B0();
                                    iW = eVar3.w();
                                    z6 = z13;
                                    int iM = eVar3.m();
                                    aVar = p132n1.b.C0649b.f51342k;
                                    iB = aVar.b();
                                    i20 = size2;
                                    if (i27 == 1) {
                                        iB = aVar.c();
                                    }
                                    p247y7.AbstractC7350t.c(cVarE2);
                                    zA = bVar.a(cVarE2, eVar3, iB) | zP2;
                                    fVar.z2();
                                    iB1 = eVar3.B0();
                                    iW2 = eVar3.w();
                                    if (iB1 != iB0) {
                                        eVar3.U1(iB1);
                                        if (z14 && eVar3.q0() > iMax) {
                                            int iQ1 = eVar3.q0();
                                            p122m1.d dVarL3 = eVar3.l(m1.d.b.RIGHT);
                                            p247y7.AbstractC7350t.c(dVarL3);
                                            iMax = java.lang.Math.max(iMax, iQ1 + dVarL3.k());
                                        }
                                        zA = true;
                                    }
                                    if (iW2 != iW) {
                                        eVar3.m1(iW2);
                                        if (z15 && eVar3.o() > iMax2) {
                                            int iO2 = eVar3.o();
                                            p122m1.d dVarL4 = eVar3.l(m1.d.b.BOTTOM);
                                            p247y7.AbstractC7350t.c(dVarL4);
                                            iMax2 = java.lang.Math.max(iMax2, iO2 + dVarL4.k());
                                        }
                                        zA = true;
                                    }
                                    if (eVar3.v() || iM == eVar3.m()) {
                                        zP2 = zA;
                                    } else {
                                        zP2 = true;
                                    }
                                }
                            } else if (eVar3 instanceof p122m1.l) {
                                z6 = z13;
                                i20 = size2;
                            } else {
                                iB0 = eVar3.B0();
                                iW = eVar3.w();
                                z6 = z13;
                                int iM2 = eVar3.m();
                                aVar = p132n1.b.C0649b.f51342k;
                                iB = aVar.b();
                                i20 = size2;
                                if (i27 == 1) {
                                    iB = aVar.c();
                                }
                                p247y7.AbstractC7350t.c(cVarE2);
                                zA = bVar.a(cVarE2, eVar3, iB) | zP2;
                                fVar.z2();
                                iB1 = eVar3.B0();
                                iW2 = eVar3.w();
                                if (iB1 != iB0) {
                                    eVar3.U1(iB1);
                                    if (z14) {
                                        int iQ2 = eVar3.q0();
                                        p122m1.d dVarL5 = eVar3.l(m1.d.b.RIGHT);
                                        p247y7.AbstractC7350t.c(dVarL5);
                                        iMax = java.lang.Math.max(iMax, iQ2 + dVarL5.k());
                                    }
                                    zA = true;
                                }
                                if (iW2 != iW) {
                                    eVar3.m1(iW2);
                                    if (z15) {
                                        int iO3 = eVar3.o();
                                        p122m1.d dVarL6 = eVar3.l(m1.d.b.BOTTOM);
                                        p247y7.AbstractC7350t.c(dVarL6);
                                        iMax2 = java.lang.Math.max(iMax2, iO3 + dVarL6.k());
                                    }
                                    zA = true;
                                }
                                if (eVar3.v()) {
                                    zP2 = zA;
                                } else {
                                    zP2 = zA;
                                }
                            }
                        } else if (eVar3 instanceof p122m1.l) {
                            z6 = z13;
                            i20 = size2;
                        } else {
                            iB0 = eVar3.B0();
                            iW = eVar3.w();
                            z6 = z13;
                            int iM3 = eVar3.m();
                            aVar = p132n1.b.C0649b.f51342k;
                            iB = aVar.b();
                            i20 = size2;
                            if (i27 == 1) {
                                iB = aVar.c();
                            }
                            p247y7.AbstractC7350t.c(cVarE2);
                            zA = bVar.a(cVarE2, eVar3, iB) | zP2;
                            fVar.z2();
                            iB1 = eVar3.B0();
                            iW2 = eVar3.w();
                            if (iB1 != iB0) {
                                eVar3.U1(iB1);
                                if (z14) {
                                    int iQ3 = eVar3.q0();
                                    p122m1.d dVarL7 = eVar3.l(m1.d.b.RIGHT);
                                    p247y7.AbstractC7350t.c(dVarL7);
                                    iMax = java.lang.Math.max(iMax, iQ3 + dVarL7.k());
                                }
                                zA = true;
                            }
                            if (iW2 != iW) {
                                eVar3.m1(iW2);
                                if (z15) {
                                    int iO4 = eVar3.o();
                                    p122m1.d dVarL8 = eVar3.l(m1.d.b.BOTTOM);
                                    p247y7.AbstractC7350t.c(dVarL8);
                                    iMax2 = java.lang.Math.max(iMax2, iO4 + dVarL8.k());
                                }
                                zA = true;
                            }
                            if (eVar3.v()) {
                                zP2 = zA;
                            } else {
                                zP2 = zA;
                            }
                        }
                        i28++;
                        bVar = this;
                        z13 = z6;
                        size2 = i20;
                    }
                    boolean z16 = z13;
                    int i29 = size2;
                    if (!zP2) {
                        break;
                    }
                    i27++;
                    c(fVar, "intermediate pass", i27, iB2, i25);
                    bVar = this;
                    z13 = z16;
                    size2 = i29;
                    i26 = 2;
                    zP2 = false;
                }
                i19 = i24;
            } else {
                i19 = iF2;
            }
            fVar.O2(i19);
        }
        fVar.z2();
        return 0L;
    }

    public final void e(p122m1.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "layout");
        this.f51339a.clear();
        int size = fVar.d2().size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = fVar.d2().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p122m1.e eVar = (p122m1.e) obj;
            m1.e.b bVarA = eVar.A();
            m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || eVar.y0() == bVar) {
                this.f51339a.add(eVar);
            }
        }
        fVar.I2();
    }
}
