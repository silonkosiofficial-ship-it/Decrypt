package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n1.e.a f51359j = new n1.e.a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51360k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p122m1.f f51361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p122m1.f f51364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.ArrayList f51365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.ArrayList f51366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n1.b.c f51367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p132n1.b.C0649b f51368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f51369i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public e(p122m1.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "container");
        this.f51361a = fVar;
        this.f51362b = true;
        this.f51363c = true;
        this.f51364d = fVar;
        this.f51365e = new java.util.ArrayList();
        this.f51366f = new java.util.ArrayList();
        this.f51368h = new p132n1.b.C0649b();
        this.f51369i = new java.util.ArrayList();
    }

    private final void a(p132n1.f fVar, int i6, int i10, p132n1.f fVar2, java.util.ArrayList arrayList, p132n1.m mVar) {
        p132n1.p pVarF = fVar.f();
        if (pVarF.l() != null || p247y7.AbstractC7350t.b(pVarF, this.f51361a.K()) || p247y7.AbstractC7350t.b(pVarF, this.f51361a.e0())) {
            return;
        }
        if (mVar == null) {
            mVar = new p132n1.m(pVarF, i10);
            arrayList.add(mVar);
        }
        pVarF.y(mVar);
        mVar.b(pVarF);
        for (p132n1.d dVar : pVarF.q().d()) {
            if (dVar instanceof p132n1.f) {
                a((p132n1.f) dVar, i6, 0, fVar2, arrayList, mVar);
            }
        }
        for (p132n1.d dVar2 : pVarF.g().d()) {
            if (dVar2 instanceof p132n1.f) {
                a((p132n1.f) dVar2, i6, 1, fVar2, arrayList, mVar);
            }
        }
        if (i6 == 1 && (pVarF instanceof p132n1.n)) {
            for (p132n1.d dVar3 : ((p132n1.n) pVarF).H().d()) {
                if (dVar3 instanceof p132n1.f) {
                    a((p132n1.f) dVar3, i6, 2, fVar2, arrayList, mVar);
                }
            }
        }
        for (p132n1.f fVar3 : pVarF.q().g()) {
            if (p247y7.AbstractC7350t.b(fVar3, fVar2)) {
                mVar.d(true);
            }
            p247y7.AbstractC7350t.c(fVar3);
            a(fVar3, i6, 0, fVar2, arrayList, mVar);
        }
        for (p132n1.f fVar4 : pVarF.g().g()) {
            if (p247y7.AbstractC7350t.b(fVar4, fVar2)) {
                mVar.d(true);
            }
            p247y7.AbstractC7350t.c(fVar4);
            a(fVar4, i6, 1, fVar2, arrayList, mVar);
        }
        if (i6 == 1 && (pVarF instanceof p132n1.n)) {
            for (p132n1.f fVar5 : ((p132n1.n) pVarF).H().g()) {
                p247y7.AbstractC7350t.c(fVar5);
                a(fVar5, i6, 2, fVar2, arrayList, mVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    private final boolean b(p122m1.f fVar) {
        int iB0;
        m1.e.b bVar;
        int iW;
        m1.e.b bVar2;
        p132n1.g gVarI;
        int iW2;
        m1.e.b bVar3;
        for (p122m1.e eVar : fVar.d2()) {
            m1.e.b bVar4 = eVar.N()[0];
            m1.e.b bVar5 = eVar.N()[1];
            if (eVar.A0() != 8) {
                if (eVar.W() < 1.0f && bVar4 == m1.e.b.MATCH_CONSTRAINT) {
                    eVar.y1(2);
                }
                if (eVar.V() < 1.0f && bVar5 == m1.e.b.MATCH_CONSTRAINT) {
                    eVar.x1(2);
                }
                if (eVar.s() > 0.0f) {
                    m1.e.b bVar6 = m1.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar6 && (bVar5 == m1.e.b.WRAP_CONTENT || bVar5 == m1.e.b.FIXED)) {
                        eVar.y1(3);
                    } else if (bVar5 == bVar6 && (bVar4 == m1.e.b.WRAP_CONTENT || bVar4 == m1.e.b.FIXED)) {
                        eVar.x1(3);
                    } else if (bVar4 == bVar6 && bVar5 == bVar6) {
                        if (eVar.Q() == 0) {
                            eVar.y1(3);
                        }
                        if (eVar.P() == 0) {
                            eVar.x1(3);
                        }
                    }
                }
                m1.e.b bVar7 = m1.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar7 && eVar.Q() == 1 && (eVar.L().i() == null || eVar.b0().i() == null)) {
                    bVar4 = m1.e.b.WRAP_CONTENT;
                }
                m1.e.b bVar8 = bVar4;
                m1.e.b bVar9 = (bVar5 == bVar7 && eVar.P() == 1 && (eVar.c0().i() == null || eVar.G().i() == null)) ? m1.e.b.WRAP_CONTENT : bVar5;
                p132n1.l lVarK = eVar.K();
                p247y7.AbstractC7350t.c(lVarK);
                lVarK.w(bVar8);
                p132n1.l lVarK2 = eVar.K();
                p247y7.AbstractC7350t.c(lVarK2);
                lVarK2.B(eVar.Q());
                p132n1.n nVarE0 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE0);
                nVarE0.w(bVar9);
                p132n1.n nVarE1 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE1);
                nVarE1.B(eVar.P());
                m1.e.b bVar10 = m1.e.b.MATCH_PARENT;
                if ((bVar8 == bVar10 || bVar8 == m1.e.b.FIXED || bVar8 == m1.e.b.WRAP_CONTENT) && (bVar9 == bVar10 || bVar9 == m1.e.b.FIXED || bVar9 == m1.e.b.WRAP_CONTENT)) {
                    int iB1 = eVar.B0();
                    if (bVar8 == bVar10) {
                        iB0 = (fVar.B0() - eVar.L().f()) - eVar.b0().f();
                        bVar = m1.e.b.FIXED;
                    } else {
                        iB0 = iB1;
                        bVar = bVar8;
                    }
                    int iW3 = eVar.w();
                    if (bVar9 == bVar10) {
                        iW = (fVar.w() - eVar.c0().f()) - eVar.G().f();
                        bVar2 = m1.e.b.FIXED;
                    } else {
                        iW = iW3;
                        bVar2 = bVar9;
                    }
                    p247y7.AbstractC7350t.c(eVar);
                    k(eVar, bVar, iB0, bVar2, iW);
                    p132n1.l lVarK3 = eVar.K();
                    p247y7.AbstractC7350t.c(lVarK3);
                    lVarK3.i().k(eVar.B0());
                    p132n1.n nVarE2 = eVar.e0();
                    p247y7.AbstractC7350t.c(nVarE2);
                    nVarE2.i().k(eVar.w());
                } else if (bVar8 == bVar7 && (bVar9 == (bVar3 = m1.e.b.WRAP_CONTENT) || bVar9 == m1.e.b.FIXED)) {
                    if (eVar.Q() == 3) {
                        if (bVar9 == bVar3) {
                            p247y7.AbstractC7350t.c(eVar);
                            k(eVar, bVar3, 0, bVar3, 0);
                        }
                        iW = eVar.w();
                        iB0 = (int) ((iW * eVar.I()) + 0.5f);
                    } else {
                        if (eVar.Q() == 1) {
                            p247y7.AbstractC7350t.c(eVar);
                            k(eVar, bVar3, 0, bVar9, 0);
                            p132n1.l lVarK4 = eVar.K();
                            p247y7.AbstractC7350t.c(lVarK4);
                            gVarI = lVarK4.i();
                            iW2 = eVar.B0();
                        } else {
                            if (eVar.Q() == 2) {
                                m1.e.b bVar11 = fVar.N()[0];
                                bVar3 = m1.e.b.FIXED;
                                if (bVar11 == bVar3 || fVar.N()[0] == bVar10) {
                                    iB0 = (int) ((eVar.W() * fVar.B0()) + 0.5f);
                                    iW = eVar.w();
                                    p247y7.AbstractC7350t.c(eVar);
                                    bVar = bVar3;
                                    bVar2 = bVar9;
                                    k(eVar, bVar, iB0, bVar2, iW);
                                    p132n1.l lVarK5 = eVar.K();
                                    p247y7.AbstractC7350t.c(lVarK5);
                                    lVarK5.i().k(eVar.B0());
                                    p132n1.n nVarE3 = eVar.e0();
                                    p247y7.AbstractC7350t.c(nVarE3);
                                    nVarE3.i().k(eVar.w());
                                }
                            } else {
                                if (eVar.M()[0].i() == null || eVar.M()[1].i() == null) {
                                }
                                p247y7.AbstractC7350t.c(eVar);
                                iB0 = 0;
                                iW = 0;
                                bVar = bVar3;
                                bVar2 = bVar9;
                                k(eVar, bVar, iB0, bVar2, iW);
                                p132n1.l lVarK6 = eVar.K();
                                p247y7.AbstractC7350t.c(lVarK6);
                                lVarK6.i().k(eVar.B0());
                                p132n1.n nVarE4 = eVar.e0();
                                p247y7.AbstractC7350t.c(nVarE4);
                                nVarE4.i().k(eVar.w());
                            }
                            if (bVar9 != bVar7) {
                                if (bVar8 != bVar7) {
                                }
                            } else if (bVar8 != bVar7) {
                            }
                        }
                        gVarI.v(iW2);
                    }
                    p247y7.AbstractC7350t.c(eVar);
                    bVar2 = m1.e.b.FIXED;
                    bVar = bVar2;
                    k(eVar, bVar, iB0, bVar2, iW);
                    p132n1.l lVarK7 = eVar.K();
                    p247y7.AbstractC7350t.c(lVarK7);
                    lVarK7.i().k(eVar.B0());
                    p132n1.n nVarE5 = eVar.e0();
                    p247y7.AbstractC7350t.c(nVarE5);
                    nVarE5.i().k(eVar.w());
                } else if (bVar9 != bVar7 && (bVar8 == (bVar3 = m1.e.b.WRAP_CONTENT) || bVar8 == m1.e.b.FIXED)) {
                    if (eVar.P() == 3) {
                        if (bVar8 == bVar3) {
                            p247y7.AbstractC7350t.c(eVar);
                            k(eVar, bVar3, 0, bVar3, 0);
                        }
                        iB0 = eVar.B0();
                        float fI = eVar.I();
                        if (eVar.t() == -1) {
                            fI = 1.0f / fI;
                        }
                        iW = (int) ((iB0 * fI) + 0.5f);
                        p247y7.AbstractC7350t.c(eVar);
                        bVar2 = m1.e.b.FIXED;
                        bVar = bVar2;
                    } else {
                        if (eVar.P() == 1) {
                            p247y7.AbstractC7350t.c(eVar);
                            k(eVar, bVar8, 0, bVar3, 0);
                        } else {
                            if (eVar.P() == 2) {
                                m1.e.b bVar12 = fVar.N()[1];
                                bVar2 = m1.e.b.FIXED;
                                if (bVar12 == bVar2 || fVar.N()[1] == bVar10) {
                                    float fV = eVar.V();
                                    iB0 = eVar.B0();
                                    int iW4 = (int) ((fV * fVar.w()) + 0.5f);
                                    p247y7.AbstractC7350t.c(eVar);
                                    bVar = bVar8;
                                    iW = iW4;
                                }
                            } else if (eVar.M()[2].i() == null || eVar.M()[3].i() == null) {
                                p247y7.AbstractC7350t.c(eVar);
                                iB0 = 0;
                                iW = 0;
                                bVar = bVar3;
                                bVar2 = bVar9;
                            }
                            if (bVar8 != bVar7) {
                            }
                        }
                        p132n1.n nVarE6 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE6);
                        gVarI = nVarE6.i();
                        iW2 = eVar.w();
                        gVarI.v(iW2);
                    }
                    k(eVar, bVar, iB0, bVar2, iW);
                    p132n1.l lVarK8 = eVar.K();
                    p247y7.AbstractC7350t.c(lVarK8);
                    lVarK8.i().k(eVar.B0());
                    p132n1.n nVarE7 = eVar.e0();
                    p247y7.AbstractC7350t.c(nVarE7);
                    nVarE7.i().k(eVar.w());
                } else if (bVar8 != bVar7 && bVar9 == bVar7) {
                    if (eVar.Q() == 1 || eVar.P() == 1) {
                        p247y7.AbstractC7350t.c(eVar);
                        m1.e.b bVar13 = m1.e.b.WRAP_CONTENT;
                        k(eVar, bVar13, 0, bVar13, 0);
                        p132n1.l lVarK9 = eVar.K();
                        p247y7.AbstractC7350t.c(lVarK9);
                        lVarK9.i().v(eVar.B0());
                        p132n1.n nVarE8 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE8);
                        gVarI = nVarE8.i();
                        iW2 = eVar.w();
                        gVarI.v(iW2);
                    } else if (eVar.P() == 2 && eVar.Q() == 2) {
                        m1.e.b bVar14 = fVar.N()[0];
                        bVar2 = m1.e.b.FIXED;
                        if (bVar14 == bVar2 && fVar.N()[1] == bVar2) {
                            float fW = eVar.W();
                            float fV2 = eVar.V();
                            iB0 = (int) ((fW * fVar.B0()) + 0.5f);
                            iW = (int) ((fV2 * fVar.w()) + 0.5f);
                            p247y7.AbstractC7350t.c(eVar);
                            bVar = bVar2;
                            k(eVar, bVar, iB0, bVar2, iW);
                            p132n1.l lVarK10 = eVar.K();
                            p247y7.AbstractC7350t.c(lVarK10);
                            lVarK10.i().k(eVar.B0());
                            p132n1.n nVarE9 = eVar.e0();
                            p247y7.AbstractC7350t.c(nVarE9);
                            nVarE9.i().k(eVar.w());
                        }
                    }
                }
            }
            eVar.F1(true);
        }
        return false;
    }

    private final int e(p122m1.f fVar, int i6) {
        int size = this.f51369i.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            java.lang.Object obj = this.f51369i.get(i10);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            jMax = java.lang.Math.max(jMax, ((p132n1.m) obj).c(fVar, i6));
        }
        return (int) jMax;
    }

    private final void i(p132n1.p pVar, int i6, java.util.ArrayList arrayList) {
        for (p132n1.d dVar : pVar.q().d()) {
            if (dVar instanceof p132n1.f) {
                a((p132n1.f) dVar, i6, 0, pVar.g(), arrayList, null);
            } else if (dVar instanceof p132n1.p) {
                a(((p132n1.p) dVar).q(), i6, 0, pVar.g(), arrayList, null);
            }
        }
        for (p132n1.d dVar2 : pVar.g().d()) {
            if (dVar2 instanceof p132n1.f) {
                a((p132n1.f) dVar2, i6, 1, pVar.q(), arrayList, null);
            } else if (dVar2 instanceof p132n1.p) {
                a(((p132n1.p) dVar2).g(), i6, 1, pVar.q(), arrayList, null);
            }
        }
        if (i6 == 1) {
            p247y7.AbstractC7350t.d(pVar, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun");
            for (p132n1.d dVar3 : ((p132n1.n) pVar).H().d()) {
                if (dVar3 instanceof p132n1.f) {
                    a((p132n1.f) dVar3, i6, 2, null, arrayList, null);
                }
            }
        }
    }

    private final void k(p122m1.e eVar, m1.e.b bVar, int i6, m1.e.b bVar2, int i10) {
        this.f51368h.n(bVar);
        this.f51368h.v(bVar2);
        this.f51368h.o(i6);
        this.f51368h.w(i10);
        n1.b.c cVar = this.f51367g;
        p247y7.AbstractC7350t.c(cVar);
        cVar.b(eVar, this.f51368h);
        eVar.U1(this.f51368h.k());
        eVar.m1(this.f51368h.i());
        eVar.l1(this.f51368h.h());
        eVar.a1(this.f51368h.g());
    }

    public final void c() {
        d(this.f51365e);
        this.f51369i.clear();
        p132n1.m.f51401g.a(0);
        p132n1.l lVarK = this.f51361a.K();
        p247y7.AbstractC7350t.c(lVarK);
        i(lVarK, 0, this.f51369i);
        p132n1.n nVarE0 = this.f51361a.e0();
        p247y7.AbstractC7350t.c(nVarE0);
        i(nVarE0, 1, this.f51369i);
        this.f51362b = false;
    }

    public final void d(java.util.ArrayList arrayList) {
        p132n1.p jVar;
        p247y7.AbstractC7350t.f(arrayList, "runs");
        arrayList.clear();
        p132n1.l lVarK = this.f51364d.K();
        p247y7.AbstractC7350t.c(lVarK);
        lVarK.f();
        p132n1.n nVarE0 = this.f51364d.e0();
        p247y7.AbstractC7350t.c(nVarE0);
        nVarE0.f();
        p132n1.l lVarK2 = this.f51364d.K();
        p247y7.AbstractC7350t.c(lVarK2);
        arrayList.add(lVarK2);
        p132n1.n nVarE1 = this.f51364d.e0();
        p247y7.AbstractC7350t.c(nVarE1);
        arrayList.add(nVarE1);
        java.util.HashSet hashSet = null;
        for (p122m1.e eVar : this.f51364d.d2()) {
            if (eVar instanceof p122m1.h) {
                jVar = new p132n1.j(eVar);
            } else {
                if (eVar.M0()) {
                    if (eVar.y() == null) {
                        p247y7.AbstractC7350t.c(eVar);
                        eVar.o1(new p132n1.c(eVar, 0));
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    p132n1.c cVarY = eVar.y();
                    p247y7.AbstractC7350t.c(cVarY);
                    hashSet.add(cVarY);
                } else {
                    p132n1.l lVarK3 = eVar.K();
                    p247y7.AbstractC7350t.c(lVarK3);
                    arrayList.add(lVarK3);
                }
                if (eVar.N0()) {
                    if (eVar.w0() == null) {
                        p247y7.AbstractC7350t.c(eVar);
                        eVar.M1(new p132n1.c(eVar, 1));
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    p132n1.c cVarW0 = eVar.w0();
                    p247y7.AbstractC7350t.c(cVarW0);
                    hashSet.add(cVarW0);
                } else {
                    p132n1.n nVarE2 = eVar.e0();
                    p247y7.AbstractC7350t.c(nVarE2);
                    arrayList.add(nVarE2);
                }
                if (eVar instanceof p122m1.j) {
                    jVar = new p132n1.k(eVar);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p132n1.p) it.next()).f();
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p132n1.p pVar = (p132n1.p) it2.next();
            if (!p247y7.AbstractC7350t.b(pVar.n(), this.f51364d)) {
                pVar.d();
            }
        }
    }

    public final boolean f(boolean z6) {
        boolean z10;
        boolean z11 = false;
        if (this.f51362b || this.f51363c) {
            for (p122m1.e eVar : this.f51361a.d2()) {
                eVar.k();
                eVar.F1(false);
                p132n1.l lVarK = eVar.K();
                p247y7.AbstractC7350t.c(lVarK);
                lVarK.I();
                p132n1.n nVarE0 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE0);
                nVarE0.J();
            }
            this.f51361a.k();
            this.f51361a.F1(false);
            p132n1.l lVarK2 = this.f51361a.K();
            p247y7.AbstractC7350t.c(lVarK2);
            lVarK2.I();
            p132n1.n nVarE1 = this.f51361a.e0();
            p247y7.AbstractC7350t.c(nVarE1);
            nVarE1.J();
            this.f51363c = false;
        }
        if (b(this.f51364d)) {
            return false;
        }
        this.f51361a.V1(0);
        this.f51361a.W1(0);
        m1.e.b bVarR = this.f51361a.r(0);
        m1.e.b bVarR2 = this.f51361a.r(1);
        if (this.f51362b) {
            c();
        }
        int iC0 = this.f51361a.C0();
        int iD0 = this.f51361a.D0();
        p132n1.l lVarK3 = this.f51361a.K();
        p247y7.AbstractC7350t.c(lVarK3);
        lVarK3.q().k(iC0);
        p132n1.n nVarE2 = this.f51361a.e0();
        p247y7.AbstractC7350t.c(nVarE2);
        nVarE2.q().k(iD0);
        l();
        m1.e.b bVar = m1.e.b.WRAP_CONTENT;
        if (bVarR == bVar || bVarR2 == bVar) {
            if (z6) {
                java.util.Iterator it = this.f51365e.iterator();
                while (it.hasNext()) {
                    if (!((p132n1.p) it.next()).D()) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && bVarR == m1.e.b.WRAP_CONTENT) {
                this.f51361a.r1(m1.e.b.FIXED);
                p122m1.f fVar = this.f51361a;
                fVar.U1(e(fVar, 0));
                p132n1.l lVarK4 = this.f51361a.K();
                p247y7.AbstractC7350t.c(lVarK4);
                lVarK4.i().k(this.f51361a.B0());
            }
            if (z6 && bVarR2 == m1.e.b.WRAP_CONTENT) {
                this.f51361a.P1(m1.e.b.FIXED);
                p122m1.f fVar2 = this.f51361a;
                fVar2.m1(e(fVar2, 1));
                p132n1.n nVarE3 = this.f51361a.e0();
                p247y7.AbstractC7350t.c(nVarE3);
                nVarE3.i().k(this.f51361a.w());
            }
        }
        m1.e.b bVar2 = this.f51361a.N()[0];
        m1.e.b bVar3 = m1.e.b.FIXED;
        if (bVar2 == bVar3 || this.f51361a.N()[0] == m1.e.b.MATCH_PARENT) {
            int iB0 = this.f51361a.B0() + iC0;
            p132n1.l lVarK5 = this.f51361a.K();
            p247y7.AbstractC7350t.c(lVarK5);
            lVarK5.g().k(iB0);
            p132n1.l lVarK6 = this.f51361a.K();
            p247y7.AbstractC7350t.c(lVarK6);
            lVarK6.i().k(iB0 - iC0);
            l();
            if (this.f51361a.N()[1] == bVar3 || this.f51361a.N()[1] == m1.e.b.MATCH_PARENT) {
                int iW = this.f51361a.w() + iD0;
                p132n1.n nVarE4 = this.f51361a.e0();
                p247y7.AbstractC7350t.c(nVarE4);
                nVarE4.g().k(iW);
                p132n1.n nVarE5 = this.f51361a.e0();
                p247y7.AbstractC7350t.c(nVarE5);
                nVarE5.i().k(iW - iD0);
            }
            l();
            z10 = true;
        } else {
            z10 = false;
        }
        for (p132n1.p pVar : this.f51365e) {
            if (!p247y7.AbstractC7350t.b(pVar.n(), this.f51361a) || pVar.k()) {
                pVar.e();
            }
        }
        for (p132n1.p pVar2 : this.f51365e) {
            if (z10 || !p247y7.AbstractC7350t.b(pVar2.n(), this.f51361a)) {
                if (!pVar2.q().i() || ((!pVar2.g().i() && !(pVar2 instanceof p132n1.j)) || (!pVar2.i().i() && !(pVar2 instanceof p132n1.c) && !(pVar2 instanceof p132n1.j)))) {
                    p122m1.f fVar3 = this.f51361a;
                    p247y7.AbstractC7350t.c(bVarR);
                    fVar3.r1(bVarR);
                    p122m1.f fVar4 = this.f51361a;
                    p247y7.AbstractC7350t.c(bVarR2);
                    fVar4.P1(bVarR2);
                    return z11;
                }
            }
        }
        z11 = true;
        p122m1.f fVar5 = this.f51361a;
        p247y7.AbstractC7350t.c(bVarR);
        fVar5.r1(bVarR);
        p122m1.f fVar6 = this.f51361a;
        p247y7.AbstractC7350t.c(bVarR2);
        fVar6.P1(bVarR2);
        return z11;
    }

    public final boolean g(boolean z6) {
        if (this.f51362b) {
            for (p122m1.e eVar : this.f51361a.d2()) {
                eVar.k();
                eVar.F1(false);
                p132n1.l lVarK = eVar.K();
                p247y7.AbstractC7350t.c(lVarK);
                lVarK.i().r(false);
                p132n1.l lVarK2 = eVar.K();
                p247y7.AbstractC7350t.c(lVarK2);
                lVarK2.x(false);
                p132n1.l lVarK3 = eVar.K();
                p247y7.AbstractC7350t.c(lVarK3);
                lVarK3.I();
                p132n1.n nVarE0 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE0);
                nVarE0.i().r(false);
                p132n1.n nVarE1 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE1);
                nVarE1.x(false);
                p132n1.n nVarE2 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE2);
                nVarE2.J();
            }
            this.f51361a.k();
            this.f51361a.F1(false);
            p132n1.l lVarK4 = this.f51361a.K();
            p247y7.AbstractC7350t.c(lVarK4);
            lVarK4.i().r(false);
            p132n1.l lVarK5 = this.f51361a.K();
            p247y7.AbstractC7350t.c(lVarK5);
            lVarK5.x(false);
            p132n1.l lVarK6 = this.f51361a.K();
            p247y7.AbstractC7350t.c(lVarK6);
            lVarK6.I();
            p132n1.n nVarE3 = this.f51361a.e0();
            p247y7.AbstractC7350t.c(nVarE3);
            nVarE3.i().r(false);
            p132n1.n nVarE4 = this.f51361a.e0();
            p247y7.AbstractC7350t.c(nVarE4);
            nVarE4.x(false);
            p132n1.n nVarE5 = this.f51361a.e0();
            p247y7.AbstractC7350t.c(nVarE5);
            nVarE5.J();
            c();
        }
        if (b(this.f51364d)) {
            return false;
        }
        this.f51361a.V1(0);
        this.f51361a.W1(0);
        p132n1.l lVarK7 = this.f51361a.K();
        p247y7.AbstractC7350t.c(lVarK7);
        lVarK7.q().k(0);
        p132n1.n nVarE6 = this.f51361a.e0();
        p247y7.AbstractC7350t.c(nVarE6);
        nVarE6.q().k(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    public final boolean h(boolean z6, int i6) {
        boolean z10;
        m1.e.b bVar;
        p132n1.g gVarI;
        int iW;
        boolean z11 = false;
        m1.e.b bVarR = this.f51361a.r(0);
        m1.e.b bVarR2 = this.f51361a.r(1);
        int iC0 = this.f51361a.C0();
        int iD0 = this.f51361a.D0();
        if (z6 && (bVarR == (bVar = m1.e.b.WRAP_CONTENT) || bVarR2 == bVar)) {
            for (p132n1.p pVar : this.f51365e) {
                if (pVar.p() == i6 && !pVar.D()) {
                    z6 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z6 && bVarR == m1.e.b.WRAP_CONTENT) {
                    this.f51361a.r1(m1.e.b.FIXED);
                    p122m1.f fVar = this.f51361a;
                    fVar.U1(e(fVar, 0));
                    p132n1.l lVarK = this.f51361a.K();
                    p247y7.AbstractC7350t.c(lVarK);
                    gVarI = lVarK.i();
                    iW = this.f51361a.B0();
                    gVarI.k(iW);
                }
            } else if (z6 && bVarR2 == m1.e.b.WRAP_CONTENT) {
                this.f51361a.P1(m1.e.b.FIXED);
                p122m1.f fVar2 = this.f51361a;
                fVar2.m1(e(fVar2, 1));
                p132n1.n nVarE0 = this.f51361a.e0();
                p247y7.AbstractC7350t.c(nVarE0);
                gVarI = nVarE0.i();
                iW = this.f51361a.w();
                gVarI.k(iW);
            }
        }
        m1.e.b[] bVarArrN = this.f51361a.N();
        if (i6 == 0) {
            if (bVarArrN[0] == m1.e.b.FIXED || this.f51361a.N()[0] == m1.e.b.MATCH_PARENT) {
                int iB0 = this.f51361a.B0() + iC0;
                p132n1.l lVarK2 = this.f51361a.K();
                p247y7.AbstractC7350t.c(lVarK2);
                lVarK2.g().k(iB0);
                p132n1.l lVarK3 = this.f51361a.K();
                p247y7.AbstractC7350t.c(lVarK3);
                lVarK3.i().k(iB0 - iC0);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (bVarArrN[1] == m1.e.b.FIXED || this.f51361a.N()[1] == m1.e.b.MATCH_PARENT) {
            int iW2 = this.f51361a.w() + iD0;
            p132n1.n nVarE1 = this.f51361a.e0();
            p247y7.AbstractC7350t.c(nVarE1);
            nVarE1.g().k(iW2);
            p132n1.n nVarE2 = this.f51361a.e0();
            p247y7.AbstractC7350t.c(nVarE2);
            nVarE2.i().k(iW2 - iD0);
            z10 = true;
        } else {
            z10 = false;
        }
        l();
        for (p132n1.p pVar2 : this.f51365e) {
            if (pVar2.p() == i6 && (!p247y7.AbstractC7350t.b(pVar2.n(), this.f51361a) || pVar2.k())) {
                pVar2.e();
            }
        }
        for (p132n1.p pVar3 : this.f51365e) {
            if (pVar3.p() == i6 && (z10 || !p247y7.AbstractC7350t.b(pVar3.n(), this.f51361a))) {
                if (!pVar3.q().i() || !pVar3.g().i() || (!(pVar3 instanceof p132n1.c) && !pVar3.i().i())) {
                    p122m1.f fVar3 = this.f51361a;
                    p247y7.AbstractC7350t.c(bVarR);
                    fVar3.r1(bVarR);
                    p122m1.f fVar4 = this.f51361a;
                    p247y7.AbstractC7350t.c(bVarR2);
                    fVar4.P1(bVarR2);
                    return z11;
                }
            }
        }
        z11 = true;
        p122m1.f fVar5 = this.f51361a;
        p247y7.AbstractC7350t.c(bVarR);
        fVar5.r1(bVarR);
        p122m1.f fVar6 = this.f51361a;
        p247y7.AbstractC7350t.c(bVarR2);
        fVar6.P1(bVarR2);
        return z11;
    }

    public final void j() {
        this.f51362b = true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x000a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x000a A[SYNTHETIC] */
    public final void l() {
        p132n1.g gVarI;
        int iB0;
        p132n1.g gVarI2;
        int iB1;
        p132n1.n nVarE0;
        for (p122m1.e eVar : this.f51361a.d2()) {
            if (!eVar.k0()) {
                boolean z6 = false;
                m1.e.b bVar = eVar.N()[0];
                m1.e.b bVar2 = eVar.N()[1];
                int iQ = eVar.Q();
                int iP = eVar.P();
                m1.e.b bVar3 = m1.e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == m1.e.b.MATCH_CONSTRAINT && iQ == 1);
                if (bVar2 == bVar3 || (bVar2 == m1.e.b.MATCH_CONSTRAINT && iP == 1)) {
                    z6 = true;
                }
                p132n1.l lVarK = eVar.K();
                p247y7.AbstractC7350t.c(lVarK);
                boolean zI = lVarK.i().i();
                p132n1.n nVarE1 = eVar.e0();
                p247y7.AbstractC7350t.c(nVarE1);
                boolean zI2 = nVarE1.i().i();
                if (zI && zI2) {
                    p247y7.AbstractC7350t.c(eVar);
                    m1.e.b bVar4 = m1.e.b.FIXED;
                    p132n1.l lVarK2 = eVar.K();
                    p247y7.AbstractC7350t.c(lVarK2);
                    int iJ = lVarK2.i().j();
                    p132n1.n nVarE2 = eVar.e0();
                    p247y7.AbstractC7350t.c(nVarE2);
                    k(eVar, bVar4, iJ, bVar4, nVarE2.i().j());
                } else {
                    if (zI && z6) {
                        p247y7.AbstractC7350t.c(eVar);
                        m1.e.b bVar5 = m1.e.b.FIXED;
                        p132n1.l lVarK3 = eVar.K();
                        p247y7.AbstractC7350t.c(lVarK3);
                        int iJ2 = lVarK3.i().j();
                        p132n1.n nVarE3 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE3);
                        k(eVar, bVar5, iJ2, bVar3, nVarE3.i().j());
                        if (bVar2 == m1.e.b.MATCH_CONSTRAINT) {
                            p132n1.n nVarE4 = eVar.e0();
                            p247y7.AbstractC7350t.c(nVarE4);
                            gVarI2 = nVarE4.i();
                            iB1 = eVar.w();
                            gVarI2.v(iB1);
                        } else {
                            p132n1.n nVarE5 = eVar.e0();
                            p247y7.AbstractC7350t.c(nVarE5);
                            gVarI = nVarE5.i();
                            iB0 = eVar.w();
                            gVarI.k(iB0);
                        }
                    } else if (zI2 && z10) {
                        p247y7.AbstractC7350t.c(eVar);
                        p132n1.l lVarK4 = eVar.K();
                        p247y7.AbstractC7350t.c(lVarK4);
                        int iJ3 = lVarK4.i().j();
                        m1.e.b bVar6 = m1.e.b.FIXED;
                        p132n1.n nVarE6 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE6);
                        k(eVar, bVar3, iJ3, bVar6, nVarE6.i().j());
                        if (bVar == m1.e.b.MATCH_CONSTRAINT) {
                            p132n1.l lVarK5 = eVar.K();
                            p247y7.AbstractC7350t.c(lVarK5);
                            gVarI2 = lVarK5.i();
                            iB1 = eVar.B0();
                            gVarI2.v(iB1);
                        } else {
                            p132n1.l lVarK6 = eVar.K();
                            p247y7.AbstractC7350t.c(lVarK6);
                            gVarI = lVarK6.i();
                            iB0 = eVar.B0();
                            gVarI.k(iB0);
                        }
                    }
                    if (eVar.k0()) {
                        nVarE0 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE0);
                        if (nVarE0.I() != null) {
                            p132n1.n nVarE7 = eVar.e0();
                            p247y7.AbstractC7350t.c(nVarE7);
                            p132n1.g gVarI3 = nVarE7.I();
                            p247y7.AbstractC7350t.c(gVarI3);
                            gVarI3.k(eVar.m());
                        }
                    }
                }
                eVar.F1(true);
                if (eVar.k0()) {
                    nVarE0 = eVar.e0();
                    p247y7.AbstractC7350t.c(nVarE0);
                    if (nVarE0.I() != null) {
                        p132n1.n nVarE8 = eVar.e0();
                        p247y7.AbstractC7350t.c(nVarE8);
                        p132n1.g gVarI4 = nVarE8.I();
                        p247y7.AbstractC7350t.c(gVarI4);
                        gVarI4.k(eVar.m());
                    }
                }
            }
        }
    }

    public final void m(n1.b.c cVar) {
        this.f51367g = cVar;
    }
}
