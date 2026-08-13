package p182s1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p172r1.f f54056a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p172r1.f f54059d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54057b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54058c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.ArrayList f54060e = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.ArrayList f54061f = new java.util.ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p182s1.b.InterfaceC0704b f54062g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s1.b.a f54063h = new s1.b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    java.util.ArrayList f54064i = new java.util.ArrayList();

    public e(p172r1.f fVar) {
        this.f54056a = fVar;
        this.f54059d = fVar;
    }

    private void a(p182s1.f fVar, int i6, int i10, p182s1.f fVar2, java.util.ArrayList arrayList, p182s1.k kVar) {
        p182s1.m mVar = fVar.f54068d;
        if (mVar.f54102c == null) {
            p172r1.f fVar3 = this.f54056a;
            if (mVar == fVar3.f53673e || mVar == fVar3.f53675f) {
                return;
            }
            if (kVar == null) {
                kVar = new p182s1.k(mVar, i10);
                arrayList.add(kVar);
            }
            mVar.f54102c = kVar;
            kVar.a(mVar);
            for (p182s1.d dVar : mVar.f54107h.f54075k) {
                if (dVar instanceof p182s1.f) {
                    a((p182s1.f) dVar, i6, 0, fVar2, arrayList, kVar);
                }
            }
            for (p182s1.d dVar2 : mVar.f54108i.f54075k) {
                if (dVar2 instanceof p182s1.f) {
                    a((p182s1.f) dVar2, i6, 1, fVar2, arrayList, kVar);
                }
            }
            if (i6 == 1 && (mVar instanceof p182s1.l)) {
                for (p182s1.d dVar3 : ((p182s1.l) mVar).f54097k.f54075k) {
                    if (dVar3 instanceof p182s1.f) {
                        a((p182s1.f) dVar3, i6, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            for (p182s1.f fVar4 : mVar.f54107h.f54076l) {
                if (fVar4 == fVar2) {
                    kVar.f54091b = true;
                }
                a(fVar4, i6, 0, fVar2, arrayList, kVar);
            }
            for (p182s1.f fVar5 : mVar.f54108i.f54076l) {
                if (fVar5 == fVar2) {
                    kVar.f54091b = true;
                }
                a(fVar5, i6, 1, fVar2, arrayList, kVar);
            }
            if (i6 == 1 && (mVar instanceof p182s1.l)) {
                java.util.Iterator it = ((p182s1.l) mVar).f54097k.f54076l.iterator();
                while (it.hasNext()) {
                    a((p182s1.f) it.next(), i6, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015b  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    private boolean b(p172r1.f fVar) {
        int iP;
        r1.e.b bVar;
        int iV;
        r1.e.b bVar2;
        r1.e.b[] bVarArr;
        r1.e.b bVar3;
        p182s1.g gVar;
        int iV2;
        r1.e.b bVar4;
        r1.e.b bVar5;
        for (p172r1.e eVar : fVar.f53808w0) {
            r1.e.b[] bVarArr2 = eVar.f53651M;
            r1.e.b bVar6 = bVarArr2[0];
            r1.e.b bVar7 = bVarArr2[1];
            if (eVar.O() != 8) {
                if (eVar.f53697q < 1.0f && bVar6 == r1.e.b.MATCH_CONSTRAINT) {
                    eVar.f53687l = 2;
                }
                if (eVar.f53703t < 1.0f && bVar7 == r1.e.b.MATCH_CONSTRAINT) {
                    eVar.f53689m = 2;
                }
                if (eVar.t() > 0.0f) {
                    r1.e.b bVar8 = r1.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == r1.e.b.WRAP_CONTENT || bVar7 == r1.e.b.FIXED)) {
                        eVar.f53687l = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == r1.e.b.WRAP_CONTENT || bVar6 == r1.e.b.FIXED)) {
                        eVar.f53689m = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f53687l == 0) {
                            eVar.f53687l = 3;
                        }
                        if (eVar.f53689m == 0) {
                            eVar.f53689m = 3;
                        }
                    }
                }
                r1.e.b bVar9 = r1.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f53687l == 1 && (eVar.f53640B.f53623d == null || eVar.f53642D.f53623d == null)) {
                    bVar6 = r1.e.b.WRAP_CONTENT;
                }
                r1.e.b bVar10 = bVar6;
                if (bVar7 == bVar9 && eVar.f53689m == 1 && (eVar.f53641C.f53623d == null || eVar.f53643E.f53623d == null)) {
                    bVar7 = r1.e.b.WRAP_CONTENT;
                }
                r1.e.b bVar11 = bVar7;
                p182s1.j jVar = eVar.f53673e;
                jVar.f54103d = bVar10;
                int i6 = eVar.f53687l;
                jVar.f54100a = i6;
                p182s1.l lVar = eVar.f53675f;
                lVar.f54103d = bVar11;
                int i10 = eVar.f53689m;
                lVar.f54100a = i10;
                r1.e.b bVar12 = r1.e.b.MATCH_PARENT;
                if ((bVar10 == bVar12 || bVar10 == r1.e.b.FIXED || bVar10 == r1.e.b.WRAP_CONTENT) && (bVar11 == bVar12 || bVar11 == r1.e.b.FIXED || bVar11 == r1.e.b.WRAP_CONTENT)) {
                    int iP2 = eVar.P();
                    if (bVar10 == bVar12) {
                        iP = (fVar.P() - eVar.f53640B.f53624e) - eVar.f53642D.f53624e;
                        bVar = r1.e.b.FIXED;
                    } else {
                        iP = iP2;
                        bVar = bVar10;
                    }
                    int iV3 = eVar.v();
                    if (bVar11 == bVar12) {
                        iV = (fVar.v() - eVar.f53641C.f53624e) - eVar.f53643E.f53624e;
                        bVar2 = r1.e.b.FIXED;
                    } else {
                        iV = iV3;
                        bVar2 = bVar11;
                    }
                    this = this;
                    eVar = eVar;
                    this.l(eVar, bVar, iP, bVar2, iV);
                    eVar.f53673e.f54104e.d(eVar.P());
                    eVar.f53675f.f54104e.d(eVar.v());
                } else if (bVar10 == bVar9 && (bVar11 == (bVar5 = r1.e.b.WRAP_CONTENT) || bVar11 == r1.e.b.FIXED)) {
                    if (i6 == 3) {
                        if (bVar11 == bVar5) {
                            l(eVar, bVar5, 0, bVar5, 0);
                        }
                        iV = eVar.v();
                        iP = (int) ((iV * eVar.f53655Q) + 0.5f);
                    } else {
                        if (i6 == 1) {
                            l(eVar, bVar5, 0, bVar11, 0);
                            gVar = eVar.f53673e.f54104e;
                            iV2 = eVar.P();
                        } else if (i6 == 2) {
                            r1.e.b bVar13 = fVar.f53651M[0];
                            bVar5 = r1.e.b.FIXED;
                            if (bVar13 == bVar5 || bVar13 == bVar12) {
                                iP = (int) ((eVar.f53697q * fVar.P()) + 0.5f);
                                iV = eVar.v();
                                bVar = bVar5;
                                bVar2 = bVar11;
                                this.l(eVar, bVar, iP, bVar2, iV);
                                eVar.f53673e.f54104e.d(eVar.P());
                                eVar.f53675f.f54104e.d(eVar.v());
                            } else if (bVar11 != bVar9) {
                                if (bVar10 != bVar9) {
                                }
                            } else if (bVar10 != bVar9) {
                            }
                        } else {
                            p172r1.d[] dVarArr = eVar.f53648J;
                            if (dVarArr[0].f53623d == null || dVarArr[1].f53623d == null) {
                                iP = 0;
                                iV = 0;
                                bVar = bVar5;
                                bVar2 = bVar11;
                                this.l(eVar, bVar, iP, bVar2, iV);
                                eVar.f53673e.f54104e.d(eVar.P());
                                eVar.f53675f.f54104e.d(eVar.v());
                            } else if (bVar11 != bVar9) {
                                if (bVar10 != bVar9) {
                                }
                            } else if (bVar10 != bVar9) {
                            }
                        }
                        gVar.f54086m = iV2;
                    }
                    bVar2 = r1.e.b.FIXED;
                    this = this;
                    eVar = eVar;
                    bVar = bVar2;
                    this.l(eVar, bVar, iP, bVar2, iV);
                    eVar.f53673e.f54104e.d(eVar.P());
                    eVar.f53675f.f54104e.d(eVar.v());
                } else if (bVar11 != bVar9 && (bVar10 == (bVar4 = r1.e.b.WRAP_CONTENT) || bVar10 == r1.e.b.FIXED)) {
                    if (i10 == 3) {
                        if (bVar10 == bVar4) {
                            l(eVar, bVar4, 0, bVar4, 0);
                        }
                        iP = eVar.P();
                        float f6 = eVar.f53655Q;
                        if (eVar.u() == -1) {
                            f6 = 1.0f / f6;
                        }
                        iV = (int) ((iP * f6) + 0.5f);
                        bVar2 = r1.e.b.FIXED;
                        this = this;
                        eVar = eVar;
                        bVar = bVar2;
                    } else {
                        if (i10 == 1) {
                            l(eVar, bVar10, 0, bVar4, 0);
                        } else {
                            if (i10 == 2) {
                                r1.e.b bVar14 = fVar.f53651M[1];
                                bVar2 = r1.e.b.FIXED;
                                if (bVar14 == bVar2 || bVar14 == bVar12) {
                                    float f10 = eVar.f53703t;
                                    iP = eVar.P();
                                    this = this;
                                    eVar = eVar;
                                    bVar = bVar10;
                                    iV = (int) ((f10 * fVar.v()) + 0.5f);
                                }
                            } else {
                                p172r1.d[] dVarArr2 = eVar.f53648J;
                                if (dVarArr2[2].f53623d == null || dVarArr2[3].f53623d == null) {
                                    iP = 0;
                                    iV = 0;
                                    bVar = bVar4;
                                    bVar2 = bVar11;
                                }
                            }
                            if (bVar10 != bVar9) {
                            }
                        }
                        gVar = eVar.f53675f.f54104e;
                        iV2 = eVar.v();
                        gVar.f54086m = iV2;
                    }
                    this.l(eVar, bVar, iP, bVar2, iV);
                    eVar.f53673e.f54104e.d(eVar.P());
                    eVar.f53675f.f54104e.d(eVar.v());
                } else if (bVar10 != bVar9 && bVar11 == bVar9) {
                    if (i6 == 1 || i10 == 1) {
                        r1.e.b bVar15 = r1.e.b.WRAP_CONTENT;
                        l(eVar, bVar15, 0, bVar15, 0);
                        eVar.f53673e.f54104e.f54086m = eVar.P();
                        gVar = eVar.f53675f.f54104e;
                        iV2 = eVar.v();
                        gVar.f54086m = iV2;
                    } else if (i10 == 2 && i6 == 2 && ((bVar3 = (bVarArr = fVar.f53651M)[0]) == (bVar2 = r1.e.b.FIXED) || bVar3 == bVar2)) {
                        r1.e.b bVar16 = bVarArr[1];
                        if (bVar16 == bVar2 || bVar16 == bVar2) {
                            float f11 = eVar.f53697q;
                            float f12 = eVar.f53703t;
                            iP = (int) ((f11 * fVar.P()) + 0.5f);
                            iV = (int) ((f12 * fVar.v()) + 0.5f);
                            this = this;
                            eVar = eVar;
                            bVar = bVar2;
                            this.l(eVar, bVar, iP, bVar2, iV);
                            eVar.f53673e.f54104e.d(eVar.P());
                            eVar.f53675f.f54104e.d(eVar.v());
                        }
                    }
                }
            }
            eVar.f53665a = true;
        }
        return false;
    }

    private int e(p172r1.f fVar, int i6) {
        int size = this.f54064i.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = java.lang.Math.max(jMax, ((p182s1.k) this.f54064i.get(i10)).b(fVar, i6));
        }
        return (int) jMax;
    }

    private void i(p182s1.m mVar, int i6, java.util.ArrayList arrayList) {
        for (p182s1.d dVar : mVar.f54107h.f54075k) {
            if (dVar instanceof p182s1.f) {
                a((p182s1.f) dVar, i6, 0, mVar.f54108i, arrayList, null);
            } else if (dVar instanceof p182s1.m) {
                a(((p182s1.m) dVar).f54107h, i6, 0, mVar.f54108i, arrayList, null);
            }
        }
        for (p182s1.d dVar2 : mVar.f54108i.f54075k) {
            if (dVar2 instanceof p182s1.f) {
                a((p182s1.f) dVar2, i6, 1, mVar.f54107h, arrayList, null);
            } else if (dVar2 instanceof p182s1.m) {
                a(((p182s1.m) dVar2).f54108i, i6, 1, mVar.f54107h, arrayList, null);
            }
        }
        if (i6 == 1) {
            for (p182s1.d dVar3 : ((p182s1.l) mVar).f54097k.f54075k) {
                if (dVar3 instanceof p182s1.f) {
                    a((p182s1.f) dVar3, i6, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(p172r1.e eVar, r1.e.b bVar, int i6, r1.e.b bVar2, int i10) {
        s1.b.a aVar = this.f54063h;
        aVar.f54044a = bVar;
        aVar.f54045b = bVar2;
        aVar.f54046c = i6;
        aVar.f54047d = i10;
        this.f54062g.b(eVar, aVar);
        eVar.E0(this.f54063h.f54048e);
        eVar.h0(this.f54063h.f54049f);
        eVar.g0(this.f54063h.f54051h);
        eVar.b0(this.f54063h.f54050g);
    }

    public void c() {
        d(this.f54060e);
        this.f54064i.clear();
        p182s1.k.f54089h = 0;
        i(this.f54056a.f53673e, 0, this.f54064i);
        i(this.f54056a.f53675f, 1, this.f54064i);
        this.f54057b = false;
    }

    public void d(java.util.ArrayList arrayList) {
        p182s1.d hVar;
        arrayList.clear();
        this.f54059d.f53673e.f();
        this.f54059d.f53675f.f();
        arrayList.add(this.f54059d.f53673e);
        arrayList.add(this.f54059d.f53675f);
        java.util.HashSet hashSet = null;
        for (p172r1.e eVar : this.f54059d.f53808w0) {
            if (eVar instanceof p172r1.h) {
                hVar = new p182s1.h(eVar);
            } else {
                if (eVar.V()) {
                    if (eVar.f53669c == null) {
                        eVar.f53669c = new p182s1.c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(eVar.f53669c);
                } else {
                    arrayList.add(eVar.f53673e);
                }
                if (eVar.X()) {
                    if (eVar.f53671d == null) {
                        eVar.f53671d = new p182s1.c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(eVar.f53671d);
                } else {
                    arrayList.add(eVar.f53675f);
                }
                if (eVar instanceof p172r1.j) {
                    hVar = new p182s1.i(eVar);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p182s1.m) it.next()).f();
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p182s1.m mVar = (p182s1.m) it2.next();
            if (mVar.f54101b != this.f54059d) {
                mVar.d();
            }
        }
    }

    public boolean f(boolean z6) {
        boolean z10;
        boolean z11 = false;
        if (this.f54057b || this.f54058c) {
            for (p172r1.e eVar : this.f54056a.f53808w0) {
                eVar.f53665a = false;
                eVar.f53673e.r();
                eVar.f53675f.q();
            }
            p172r1.f fVar = this.f54056a;
            fVar.f53665a = false;
            fVar.f53673e.r();
            this.f54056a.f53675f.q();
            this.f54058c = false;
        }
        if (b(this.f54059d)) {
            return false;
        }
        this.f54056a.F0(0);
        this.f54056a.G0(0);
        r1.e.b bVarS = this.f54056a.s(0);
        r1.e.b bVarS2 = this.f54056a.s(1);
        if (this.f54057b) {
            c();
        }
        int iQ = this.f54056a.Q();
        int iR = this.f54056a.R();
        this.f54056a.f53673e.f54107h.d(iQ);
        this.f54056a.f53675f.f54107h.d(iR);
        m();
        r1.e.b bVar = r1.e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z6) {
                java.util.Iterator it = this.f54060e.iterator();
                while (it.hasNext()) {
                    if (!((p182s1.m) it.next()).m()) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && bVarS == r1.e.b.WRAP_CONTENT) {
                this.f54056a.l0(r1.e.b.FIXED);
                p172r1.f fVar2 = this.f54056a;
                fVar2.E0(e(fVar2, 0));
                p172r1.f fVar3 = this.f54056a;
                fVar3.f53673e.f54104e.d(fVar3.P());
            }
            if (z6 && bVarS2 == r1.e.b.WRAP_CONTENT) {
                this.f54056a.A0(r1.e.b.FIXED);
                p172r1.f fVar4 = this.f54056a;
                fVar4.h0(e(fVar4, 1));
                p172r1.f fVar5 = this.f54056a;
                fVar5.f53675f.f54104e.d(fVar5.v());
            }
        }
        p172r1.f fVar6 = this.f54056a;
        r1.e.b bVar2 = fVar6.f53651M[0];
        r1.e.b bVar3 = r1.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == r1.e.b.MATCH_PARENT) {
            int iP = fVar6.P() + iQ;
            this.f54056a.f53673e.f54108i.d(iP);
            this.f54056a.f53673e.f54104e.d(iP - iQ);
            m();
            p172r1.f fVar7 = this.f54056a;
            r1.e.b bVar4 = fVar7.f53651M[1];
            if (bVar4 == bVar3 || bVar4 == r1.e.b.MATCH_PARENT) {
                int iV = fVar7.v() + iR;
                this.f54056a.f53675f.f54108i.d(iV);
                this.f54056a.f53675f.f54104e.d(iV - iR);
            }
            m();
            z10 = true;
        } else {
            z10 = false;
        }
        for (p182s1.m mVar : this.f54060e) {
            if (mVar.f54101b != this.f54056a || mVar.f54106g) {
                mVar.e();
            }
        }
        for (p182s1.m mVar2 : this.f54060e) {
            if (z10 || mVar2.f54101b != this.f54056a) {
                if (!mVar2.f54107h.f54074j || ((!mVar2.f54108i.f54074j && !(mVar2 instanceof p182s1.h)) || (!mVar2.f54104e.f54074j && !(mVar2 instanceof p182s1.c) && !(mVar2 instanceof p182s1.h)))) {
                    this.f54056a.l0(bVarS);
                    this.f54056a.A0(bVarS2);
                    return z11;
                }
            }
        }
        z11 = true;
        this.f54056a.l0(bVarS);
        this.f54056a.A0(bVarS2);
        return z11;
    }

    public boolean g(boolean z6) {
        if (this.f54057b) {
            for (p172r1.e eVar : this.f54056a.f53808w0) {
                eVar.f53665a = false;
                p182s1.j jVar = eVar.f53673e;
                jVar.f54104e.f54074j = false;
                jVar.f54106g = false;
                jVar.r();
                p182s1.l lVar = eVar.f53675f;
                lVar.f54104e.f54074j = false;
                lVar.f54106g = false;
                lVar.q();
            }
            p172r1.f fVar = this.f54056a;
            fVar.f53665a = false;
            p182s1.j jVar2 = fVar.f53673e;
            jVar2.f54104e.f54074j = false;
            jVar2.f54106g = false;
            jVar2.r();
            p182s1.l lVar2 = this.f54056a.f53675f;
            lVar2.f54104e.f54074j = false;
            lVar2.f54106g = false;
            lVar2.q();
            c();
        }
        if (b(this.f54059d)) {
            return false;
        }
        this.f54056a.F0(0);
        this.f54056a.G0(0);
        this.f54056a.f53673e.f54107h.d(0);
        this.f54056a.f53675f.f54107h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    public boolean h(boolean z6, int i6) {
        boolean z10;
        r1.e.b bVar;
        p182s1.g gVar;
        int iV;
        boolean z11 = false;
        r1.e.b bVarS = this.f54056a.s(0);
        r1.e.b bVarS2 = this.f54056a.s(1);
        int iQ = this.f54056a.Q();
        int iR = this.f54056a.R();
        if (z6 && (bVarS == (bVar = r1.e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            for (p182s1.m mVar : this.f54060e) {
                if (mVar.f54105f == i6 && !mVar.m()) {
                    z6 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z6 && bVarS == r1.e.b.WRAP_CONTENT) {
                    this.f54056a.l0(r1.e.b.FIXED);
                    p172r1.f fVar = this.f54056a;
                    fVar.E0(e(fVar, 0));
                    p172r1.f fVar2 = this.f54056a;
                    gVar = fVar2.f53673e.f54104e;
                    iV = fVar2.P();
                    gVar.d(iV);
                }
            } else if (z6 && bVarS2 == r1.e.b.WRAP_CONTENT) {
                this.f54056a.A0(r1.e.b.FIXED);
                p172r1.f fVar3 = this.f54056a;
                fVar3.h0(e(fVar3, 1));
                p172r1.f fVar4 = this.f54056a;
                gVar = fVar4.f53675f.f54104e;
                iV = fVar4.v();
                gVar.d(iV);
            }
        }
        p172r1.f fVar5 = this.f54056a;
        if (i6 == 0) {
            r1.e.b bVar2 = fVar5.f53651M[0];
            if (bVar2 == r1.e.b.FIXED || bVar2 == r1.e.b.MATCH_PARENT) {
                int iP = fVar5.P() + iQ;
                this.f54056a.f53673e.f54108i.d(iP);
                this.f54056a.f53673e.f54104e.d(iP - iQ);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            r1.e.b bVar3 = fVar5.f53651M[1];
            if (bVar3 == r1.e.b.FIXED || bVar3 == r1.e.b.MATCH_PARENT) {
                int iV2 = fVar5.v() + iR;
                this.f54056a.f53675f.f54108i.d(iV2);
                this.f54056a.f53675f.f54104e.d(iV2 - iR);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        m();
        for (p182s1.m mVar2 : this.f54060e) {
            if (mVar2.f54105f == i6 && (mVar2.f54101b != this.f54056a || mVar2.f54106g)) {
                mVar2.e();
            }
        }
        for (p182s1.m mVar3 : this.f54060e) {
            if (mVar3.f54105f == i6 && (z10 || mVar3.f54101b != this.f54056a)) {
                if (!mVar3.f54107h.f54074j || !mVar3.f54108i.f54074j || (!(mVar3 instanceof p182s1.c) && !mVar3.f54104e.f54074j)) {
                    this.f54056a.l0(bVarS);
                    this.f54056a.A0(bVarS2);
                    return z11;
                }
            }
        }
        z11 = true;
        this.f54056a.l0(bVarS);
        this.f54056a.A0(bVarS2);
        return z11;
    }

    public void j() {
        this.f54057b = true;
    }

    public void k() {
        this.f54058c = true;
    }

    public void m() {
        p182s1.g gVar;
        int iP;
        p182s1.g gVar2;
        int iP2;
        p182s1.g gVar3;
        for (p172r1.e eVar : this.f54056a.f53808w0) {
            if (!eVar.f53665a) {
                r1.e.b[] bVarArr = eVar.f53651M;
                boolean z6 = false;
                r1.e.b bVar = bVarArr[0];
                r1.e.b bVar2 = bVarArr[1];
                int i6 = eVar.f53687l;
                int i10 = eVar.f53689m;
                r1.e.b bVar3 = r1.e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == r1.e.b.MATCH_CONSTRAINT && i6 == 1);
                if (bVar2 == bVar3 || (bVar2 == r1.e.b.MATCH_CONSTRAINT && i10 == 1)) {
                    z6 = true;
                }
                p182s1.g gVar4 = eVar.f53673e.f54104e;
                boolean z11 = gVar4.f54074j;
                p182s1.g gVar5 = eVar.f53675f.f54104e;
                boolean z12 = gVar5.f54074j;
                if (z11 && z12) {
                    r1.e.b bVar4 = r1.e.b.FIXED;
                    l(eVar, bVar4, gVar4.f54071g, bVar4, gVar5.f54071g);
                } else {
                    if (z11 && z6) {
                        l(eVar, r1.e.b.FIXED, gVar4.f54071g, bVar3, gVar5.f54071g);
                        if (bVar2 == r1.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.f53675f.f54104e;
                            iP2 = eVar.v();
                            gVar2.f54086m = iP2;
                        } else {
                            gVar = eVar.f53675f.f54104e;
                            iP = eVar.v();
                            gVar.d(iP);
                        }
                    } else if (z12 && z10) {
                        l(eVar, bVar3, gVar4.f54071g, r1.e.b.FIXED, gVar5.f54071g);
                        if (bVar == r1.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.f53673e.f54104e;
                            iP2 = eVar.P();
                            gVar2.f54086m = iP2;
                        } else {
                            gVar = eVar.f53673e.f54104e;
                            iP = eVar.P();
                            gVar.d(iP);
                        }
                    }
                    if (!eVar.f53665a && (gVar3 = eVar.f53675f.f54098l) != null) {
                        gVar3.d(eVar.n());
                    }
                }
                eVar.f53665a = true;
                if (!eVar.f53665a) {
                }
            }
        }
    }

    public void n(p182s1.b.InterfaceC0704b interfaceC0704b) {
        this.f54062g = interfaceC0704b;
    }
}
