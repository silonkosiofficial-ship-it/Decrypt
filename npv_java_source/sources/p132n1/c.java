package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p132n1.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.util.ArrayList f51357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f51358l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p122m1.e eVar, int i6) {
        super(eVar);
        p247y7.AbstractC7350t.f(eVar, "widget");
        this.f51357k = new java.util.ArrayList();
        C(i6);
        H();
    }

    private final void H() {
        p122m1.e eVar;
        int iX0;
        p122m1.e eVarN = n();
        p247y7.AbstractC7350t.c(eVarN);
        do {
            eVar = eVarN;
            eVarN = eVarN.p0(p());
        } while (eVarN != null);
        A(eVar);
        java.util.ArrayList arrayList = this.f51357k;
        p132n1.p pVarR0 = eVar.r0(p());
        p247y7.AbstractC7350t.c(pVarR0);
        arrayList.add(pVarR0);
        p122m1.e eVarN0 = eVar.n0(p());
        while (eVarN0 != null) {
            java.util.ArrayList arrayList2 = this.f51357k;
            p132n1.p pVarR1 = eVarN0.r0(p());
            p247y7.AbstractC7350t.c(pVarR1);
            arrayList2.add(pVarR1);
            eVarN0 = eVarN0.n0(p());
        }
        for (p132n1.p pVar : this.f51357k) {
            if (p() == 0) {
                p122m1.e eVarN2 = pVar.n();
                p247y7.AbstractC7350t.c(eVarN2);
                eVarN2.o1(this);
            } else if (p() == 1) {
                p122m1.e eVarN3 = pVar.n();
                p247y7.AbstractC7350t.c(eVarN3);
                eVarN3.M1(this);
            }
        }
        if (p() == 0) {
            p122m1.e eVarN4 = n();
            p247y7.AbstractC7350t.c(eVarN4);
            p122m1.f fVar = (p122m1.f) eVarN4.o0();
            p247y7.AbstractC7350t.c(fVar);
            if (fVar.J2() && this.f51357k.size() > 1) {
                java.util.ArrayList arrayList3 = this.f51357k;
                A(((p132n1.p) arrayList3.get(arrayList3.size() - 1)).n());
            }
        }
        if (p() == 0) {
            p122m1.e eVarN5 = n();
            p247y7.AbstractC7350t.c(eVarN5);
            iX0 = eVarN5.z();
        } else {
            p122m1.e eVarN6 = n();
            p247y7.AbstractC7350t.c(eVarN6);
            iX0 = eVarN6.x0();
        }
        this.f51358l = iX0;
    }

    private final p122m1.e I() {
        int size = this.f51357k.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = this.f51357k.get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p132n1.p pVar = (p132n1.p) obj;
            p122m1.e eVarN = pVar.n();
            p247y7.AbstractC7350t.c(eVarN);
            if (eVarN.A0() != 8) {
                return pVar.n();
            }
        }
        return null;
    }

    private final p122m1.e J() {
        int size = this.f51357k.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i6 = size - 1;
            java.lang.Object obj = this.f51357k.get(size);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p132n1.p pVar = (p132n1.p) obj;
            p122m1.e eVarN = pVar.n();
            p247y7.AbstractC7350t.c(eVarN);
            if (eVarN.A0() != 8) {
                return pVar.n();
            }
            if (i6 < 0) {
                return null;
            }
            size = i6;
        }
    }

    @Override // p132n1.p
    public boolean D() {
        int size = this.f51357k.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = this.f51357k.get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            if (!((p132n1.p) obj).D()) {
                return false;
            }
        }
        return true;
    }

    @Override // p132n1.p, p132n1.d
    public void a(p132n1.d dVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        int iJ;
        float f6;
        boolean z6;
        int i13;
        int i14;
        int i15;
        float fV0;
        int i16;
        int iR;
        int iT;
        p247y7.AbstractC7350t.f(dVar, "node");
        if (q().i() && g().i()) {
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.c(eVarN);
            p122m1.e eVarO0 = eVarN.o0();
            boolean zJ2 = eVarO0 instanceof p122m1.f ? ((p122m1.f) eVarO0).J2() : false;
            int iJ2 = g().j() - q().j();
            int size = this.f51357k.size();
            int i17 = 0;
            while (true) {
                i6 = -1;
                i10 = 8;
                if (i17 >= size) {
                    i17 = -1;
                    break;
                }
                java.lang.Object obj = this.f51357k.get(i17);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                p122m1.e eVarN2 = ((p132n1.p) obj).n();
                p247y7.AbstractC7350t.c(eVarN2);
                if (eVarN2.A0() != 8) {
                    break;
                } else {
                    i17++;
                }
            }
            int i18 = size - 1;
            for (int i19 = i18; -1 < i19; i19--) {
                java.lang.Object obj2 = this.f51357k.get(i19);
                p247y7.AbstractC7350t.e(obj2, "get(...)");
                p122m1.e eVarN3 = ((p132n1.p) obj2).n();
                p247y7.AbstractC7350t.c(eVarN3);
                if (eVarN3.A0() != 8) {
                    i6 = i19;
                    break;
                }
            }
            int i20 = 0;
            while (true) {
                if (i20 >= 2) {
                    i11 = 0;
                    i12 = 0;
                    iJ = 0;
                    f6 = 0.0f;
                    break;
                }
                int i21 = 0;
                iJ = 0;
                int i22 = 0;
                int i23 = 0;
                f6 = 0.0f;
                while (i21 < size) {
                    java.lang.Object obj3 = this.f51357k.get(i21);
                    p247y7.AbstractC7350t.e(obj3, "get(...)");
                    p132n1.p pVar = (p132n1.p) obj3;
                    p122m1.e eVarN4 = pVar.n();
                    p247y7.AbstractC7350t.c(eVarN4);
                    if (eVarN4.A0() != i10) {
                        i23++;
                        if (i21 > 0 && i21 >= i17) {
                            iJ += pVar.q().e();
                        }
                        int iJ3 = pVar.i().j();
                        boolean z10 = pVar.j() != m1.e.b.MATCH_CONSTRAINT;
                        if (z10) {
                            if (p() == 0) {
                                p122m1.e eVarN5 = pVar.n();
                                p247y7.AbstractC7350t.c(eVarN5);
                                p132n1.l lVarK = eVarN5.K();
                                p247y7.AbstractC7350t.c(lVarK);
                                if (!lVarK.i().i()) {
                                    return;
                                }
                            }
                            if (p() == 1) {
                                p122m1.e eVarN6 = pVar.n();
                                p247y7.AbstractC7350t.c(eVarN6);
                                p132n1.n nVarE0 = eVarN6.e0();
                                p247y7.AbstractC7350t.c(nVarE0);
                                if (!nVarE0.i().i()) {
                                    return;
                                }
                            }
                        } else {
                            if (pVar.o() == 1 && i20 == 0) {
                                iJ3 = pVar.i().u();
                                i22++;
                            } else if (pVar.i().i()) {
                            }
                            z10 = true;
                        }
                        if (z10) {
                            iJ += iJ3;
                        } else {
                            i22++;
                            p122m1.e eVarN7 = pVar.n();
                            p247y7.AbstractC7350t.c(eVarN7);
                            float f10 = eVarN7.f0()[p()];
                            if (f10 >= 0.0f) {
                                f6 += f10;
                            }
                        }
                        if (i21 < i18 && i21 < i6) {
                            iJ += -pVar.g().e();
                        }
                    }
                    i21++;
                    i10 = 8;
                }
                if (iJ < iJ2 || i22 == 0) {
                    i11 = i22;
                    i12 = i23;
                    break;
                } else {
                    i20++;
                    i10 = 8;
                }
            }
            int iJ4 = q().j();
            if (zJ2) {
                iJ4 = g().j();
            }
            if (iJ > iJ2) {
                int i24 = (int) (((iJ - iJ2) / 2.0f) + 0.5f);
                iJ4 = zJ2 ? iJ4 + i24 : iJ4 - i24;
            }
            if (i11 > 0) {
                float f11 = iJ2 - iJ;
                int i25 = (int) ((f11 / i11) + 0.5f);
                int i26 = 0;
                int i27 = 0;
                while (i26 < size) {
                    java.lang.Object obj4 = this.f51357k.get(i26);
                    p247y7.AbstractC7350t.e(obj4, "get(...)");
                    p132n1.p pVar2 = (p132n1.p) obj4;
                    p122m1.e eVarN8 = pVar2.n();
                    p247y7.AbstractC7350t.c(eVarN8);
                    int i28 = i25;
                    int iA0 = eVarN8.A0();
                    int i29 = iJ;
                    if (iA0 != 8 && pVar2.j() == m1.e.b.MATCH_CONSTRAINT && !pVar2.i().i()) {
                        if (f6 > 0.0f) {
                            p122m1.e eVarN9 = pVar2.n();
                            p247y7.AbstractC7350t.c(eVarN9);
                            i16 = (int) (((eVarN9.f0()[p()] * f11) / f6) + 0.5f);
                        } else {
                            i16 = i28;
                        }
                        if (p() == 0) {
                            p122m1.e eVarN10 = pVar2.n();
                            p247y7.AbstractC7350t.c(eVarN10);
                            iR = eVarN10.S();
                            p122m1.e eVarN11 = pVar2.n();
                            p247y7.AbstractC7350t.c(eVarN11);
                            iT = eVarN11.U();
                        } else {
                            p122m1.e eVarN12 = pVar2.n();
                            p247y7.AbstractC7350t.c(eVarN12);
                            iR = eVarN12.R();
                            p122m1.e eVarN13 = pVar2.n();
                            p247y7.AbstractC7350t.c(eVarN13);
                            iT = eVarN13.T();
                        }
                        int i30 = iR;
                        int iMax = java.lang.Math.max(iT, pVar2.o() == 1 ? java.lang.Math.min(i16, pVar2.i().u()) : i16);
                        if (i30 > 0) {
                            iMax = java.lang.Math.min(i30, iMax);
                        }
                        if (iMax != i16) {
                            i27++;
                            i16 = iMax;
                        }
                        pVar2.i().k(i16);
                    }
                    i26++;
                    f11 = f11;
                    iJ = i29;
                    i25 = i28;
                    iJ4 = iJ4;
                    zJ2 = zJ2;
                }
                z6 = zJ2;
                i13 = iJ4;
                int i31 = iJ;
                if (i27 > 0) {
                    i11 -= i27;
                    iJ = 0;
                    for (int i32 = 0; i32 < size; i32++) {
                        java.lang.Object obj5 = this.f51357k.get(i32);
                        p247y7.AbstractC7350t.e(obj5, "get(...)");
                        p132n1.p pVar3 = (p132n1.p) obj5;
                        p122m1.e eVarN14 = pVar3.n();
                        p247y7.AbstractC7350t.c(eVarN14);
                        if (eVarN14.A0() != 8) {
                            if (i32 > 0 && i32 >= i17) {
                                iJ += pVar3.q().e();
                            }
                            iJ += pVar3.i().j();
                            if (i32 < i18 && i32 < i6) {
                                iJ += -pVar3.g().e();
                            }
                        }
                    }
                } else {
                    iJ = i31;
                }
                i15 = 2;
                if (this.f51358l == 2 && i27 == 0) {
                    i14 = 0;
                    this.f51358l = 0;
                } else {
                    i14 = 0;
                }
            } else {
                z6 = zJ2;
                i13 = iJ4;
                i14 = 0;
                i15 = 2;
            }
            if (iJ > iJ2) {
                this.f51358l = i15;
            }
            if (i12 > 0 && i11 == 0 && i17 == i6) {
                this.f51358l = i15;
            }
            int i33 = this.f51358l;
            if (i33 == 1) {
                int i34 = i12 > 1 ? (iJ2 - iJ) / (i12 - 1) : i12 == 1 ? (iJ2 - iJ) / 2 : i14;
                if (i11 > 0) {
                    i34 = i14;
                }
                int i35 = i13;
                for (int i36 = i14; i36 < size; i36++) {
                    java.lang.Object obj6 = this.f51357k.get(z6 ? size - (i36 + 1) : i36);
                    p247y7.AbstractC7350t.e(obj6, "get(...)");
                    p132n1.p pVar4 = (p132n1.p) obj6;
                    p122m1.e eVarN15 = pVar4.n();
                    p247y7.AbstractC7350t.c(eVarN15);
                    if (eVarN15.A0() == 8) {
                        pVar4.q().k(i35);
                        pVar4.g().k(i35);
                    } else {
                        if (i36 > 0) {
                            i35 = z6 ? i35 - i34 : i35 + i34;
                        }
                        if (i36 > 0 && i36 >= i17) {
                            int iE = pVar4.q().e();
                            i35 = z6 ? i35 - iE : i35 + iE;
                        }
                        (z6 ? pVar4.g() : pVar4.q()).k(i35);
                        int iJ5 = pVar4.i().j();
                        if (pVar4.j() == m1.e.b.MATCH_CONSTRAINT && pVar4.o() == 1) {
                            iJ5 = pVar4.i().u();
                        }
                        i35 = z6 ? i35 - iJ5 : i35 + iJ5;
                        (z6 ? pVar4.q() : pVar4.g()).k(i35);
                        pVar4.x(true);
                        if (i36 < i18 && i36 < i6) {
                            int i37 = -pVar4.g().e();
                            i35 = z6 ? i35 - i37 : i35 + i37;
                        }
                    }
                }
                return;
            }
            if (i33 == 0) {
                int i38 = (iJ2 - iJ) / (i12 + 1);
                if (i11 > 0) {
                    i38 = i14;
                }
                int i39 = i13;
                for (int i40 = i14; i40 < size; i40++) {
                    java.lang.Object obj7 = this.f51357k.get(z6 ? size - (i40 + 1) : i40);
                    p247y7.AbstractC7350t.e(obj7, "get(...)");
                    p132n1.p pVar5 = (p132n1.p) obj7;
                    p122m1.e eVarN16 = pVar5.n();
                    p247y7.AbstractC7350t.c(eVarN16);
                    if (eVarN16.A0() == 8) {
                        pVar5.q().k(i39);
                        pVar5.g().k(i39);
                    } else {
                        int i41 = z6 ? i39 - i38 : i39 + i38;
                        if (i40 > 0 && i40 >= i17) {
                            int iE2 = pVar5.q().e();
                            i41 = z6 ? i41 - iE2 : i41 + iE2;
                        }
                        (z6 ? pVar5.g() : pVar5.q()).k(i41);
                        int iJ6 = pVar5.i().j();
                        if (pVar5.j() == m1.e.b.MATCH_CONSTRAINT && pVar5.o() == 1) {
                            iJ6 = java.lang.Math.min(iJ6, pVar5.i().u());
                        }
                        i39 = z6 ? i41 - iJ6 : i41 + iJ6;
                        (z6 ? pVar5.q() : pVar5.g()).k(i39);
                        if (i40 < i18 && i40 < i6) {
                            int i42 = -pVar5.g().e();
                            i39 = z6 ? i39 - i42 : i39 + i42;
                        }
                    }
                }
                return;
            }
            if (i33 == 2) {
                if (p() == 0) {
                    p122m1.e eVarN17 = n();
                    p247y7.AbstractC7350t.c(eVarN17);
                    fV0 = eVarN17.x();
                } else {
                    p122m1.e eVarN18 = n();
                    p247y7.AbstractC7350t.c(eVarN18);
                    fV0 = eVarN18.v0();
                }
                if (z6) {
                    fV0 = 1 - fV0;
                }
                int i43 = (int) (((iJ2 - iJ) * fV0) + 0.5f);
                if (i43 < 0 || i11 > 0) {
                    i43 = i14;
                }
                int i44 = z6 ? i13 - i43 : i13 + i43;
                for (int i45 = i14; i45 < size; i45++) {
                    java.lang.Object obj8 = this.f51357k.get(z6 ? size - (i45 + 1) : i45);
                    p247y7.AbstractC7350t.e(obj8, "get(...)");
                    p132n1.p pVar6 = (p132n1.p) obj8;
                    p122m1.e eVarN19 = pVar6.n();
                    p247y7.AbstractC7350t.c(eVarN19);
                    if (eVarN19.A0() == 8) {
                        pVar6.q().k(i44);
                        pVar6.g().k(i44);
                    } else {
                        if (i45 > 0 && i45 >= i17) {
                            int iE3 = pVar6.q().e();
                            i44 = z6 ? i44 - iE3 : i44 + iE3;
                        }
                        (z6 ? pVar6.g() : pVar6.q()).k(i44);
                        int iJ7 = pVar6.i().j();
                        if (pVar6.j() == m1.e.b.MATCH_CONSTRAINT && pVar6.o() == 1) {
                            iJ7 = pVar6.i().u();
                        }
                        i44 = z6 ? i44 - iJ7 : i44 + iJ7;
                        (z6 ? pVar6.q() : pVar6.g()).k(i44);
                        if (i45 < i18 && i45 < i6) {
                            int i46 = -pVar6.g().e();
                            i44 = z6 ? i44 - i46 : i44 + i46;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085 A[PHI: r0 r1
  0x0085: PHI (r0v15 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00ce, B:19:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r1v3 n1.f) = (r1v2 n1.f), (r1v7 n1.f) binds: [B:29:0x00ce, B:19:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p132n1.p
    public void d() {
        p132n1.f fVarS;
        int iK;
        java.util.Iterator it = this.f51357k.iterator();
        while (it.hasNext()) {
            ((p132n1.p) it.next()).d();
        }
        int size = this.f51357k.size();
        if (size < 1) {
            return;
        }
        p122m1.e eVarN = ((p132n1.p) this.f51357k.get(0)).n();
        p122m1.e eVarN2 = ((p132n1.p) this.f51357k.get(size - 1)).n();
        int iP = p();
        p247y7.AbstractC7350t.c(eVarN);
        if (iP == 0) {
            p122m1.d dVarL = eVarN.L();
            p247y7.AbstractC7350t.c(eVarN2);
            p122m1.d dVarB0 = eVarN2.b0();
            p132n1.f fVarS2 = s(dVarL, 0);
            int iK2 = dVarL.k();
            p122m1.e eVarI = I();
            if (eVarI != null) {
                iK2 = eVarI.L().k();
            }
            if (fVarS2 != null) {
                b(q(), fVarS2, iK2);
            }
            fVarS = s(dVarB0, 0);
            iK = dVarB0.k();
            p122m1.e eVarJ = J();
            if (eVarJ != null) {
                iK = eVarJ.b0().k();
            }
            if (fVarS != null) {
                b(g(), fVarS, -iK);
            }
        } else {
            p122m1.d dVarC0 = eVarN.c0();
            p247y7.AbstractC7350t.c(eVarN2);
            p122m1.d dVarG = eVarN2.G();
            p132n1.f fVarS3 = s(dVarC0, 1);
            int iK3 = dVarC0.k();
            p122m1.e eVarI2 = I();
            if (eVarI2 != null) {
                iK3 = eVarI2.c0().k();
            }
            if (fVarS3 != null) {
                b(q(), fVarS3, iK3);
            }
            fVarS = s(dVarG, 1);
            iK = dVarG.k();
            p122m1.e eVarJ2 = J();
            if (eVarJ2 != null) {
                iK = eVarJ2.G().k();
            }
            if (fVarS != null) {
                b(g(), fVarS, -iK);
            }
        }
        q().s(this);
        g().s(this);
    }

    @Override // p132n1.p
    public void e() {
        int size = this.f51357k.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = this.f51357k.get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            ((p132n1.p) obj).e();
        }
    }

    @Override // p132n1.p
    public void f() {
        y(null);
        java.util.Iterator it = this.f51357k.iterator();
        while (it.hasNext()) {
            ((p132n1.p) it.next()).f();
        }
    }

    @Override // p132n1.p
    public long t() {
        int size = this.f51357k.size();
        long jE = 0;
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = this.f51357k.get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p132n1.p pVar = (p132n1.p) obj;
            jE = jE + ((long) pVar.q().e()) + pVar.t() + ((long) pVar.g().e());
        }
        return jE;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChainRun ");
        sb.append(p() == 0 ? "horizontal : " : "vertical : ");
        for (p132n1.p pVar : this.f51357k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
