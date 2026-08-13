package p182s1;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f54041a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s1.b.a f54042b = new s1.b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p172r1.f f54043c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r1.e.b f54044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r1.e.b f54045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f54048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f54049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f54050g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f54051h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f54052i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f54053j;
    }

    /* JADX INFO: renamed from: s1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0704b {
        void a();

        void b(p172r1.e eVar, s1.b.a aVar);
    }

    public b(p172r1.f fVar) {
        this.f54043c = fVar;
    }

    private boolean a(p182s1.b.InterfaceC0704b interfaceC0704b, p172r1.e eVar, boolean z6) {
        this.f54042b.f54044a = eVar.y();
        this.f54042b.f54045b = eVar.M();
        this.f54042b.f54046c = eVar.P();
        this.f54042b.f54047d = eVar.v();
        s1.b.a aVar = this.f54042b;
        aVar.f54052i = false;
        aVar.f54053j = z6;
        r1.e.b bVar = aVar.f54044a;
        r1.e.b bVar2 = r1.e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f54045b == bVar2;
        boolean z12 = z10 && eVar.f53655Q > 0.0f;
        boolean z13 = z11 && eVar.f53655Q > 0.0f;
        if (z12 && eVar.f53691n[0] == 4) {
            aVar.f54044a = r1.e.b.FIXED;
        }
        if (z13 && eVar.f53691n[1] == 4) {
            aVar.f54045b = r1.e.b.FIXED;
        }
        interfaceC0704b.b(eVar, aVar);
        eVar.E0(this.f54042b.f54048e);
        eVar.h0(this.f54042b.f54049f);
        eVar.g0(this.f54042b.f54051h);
        eVar.b0(this.f54042b.f54050g);
        s1.b.a aVar2 = this.f54042b;
        aVar2.f54053j = false;
        return aVar2.f54052i;
    }

    private void b(p172r1.f fVar) {
        int size = fVar.f53808w0.size();
        p182s1.b.InterfaceC0704b interfaceC0704bU0 = fVar.U0();
        for (int i6 = 0; i6 < size; i6++) {
            p172r1.e eVar = (p172r1.e) fVar.f53808w0.get(i6);
            if (!(eVar instanceof p172r1.h) && (!eVar.f53673e.f54104e.f54074j || !eVar.f53675f.f54104e.f54074j)) {
                r1.e.b bVarS = eVar.s(0);
                r1.e.b bVarS2 = eVar.s(1);
                r1.e.b bVar = r1.e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || eVar.f53687l == 1 || bVarS2 != bVar || eVar.f53689m == 1) {
                    a(interfaceC0704bU0, eVar, false);
                }
            }
        }
        interfaceC0704bU0.a();
    }

    private void c(p172r1.f fVar, java.lang.String str, int i6, int i10) {
        int iE = fVar.E();
        int iD = fVar.D();
        fVar.u0(0);
        fVar.t0(0);
        fVar.E0(i6);
        fVar.h0(i10);
        fVar.u0(iE);
        fVar.t0(iD);
        this.f54043c.K0();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x020d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [s1.b] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    public long d(p172r1.f fVar, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z6;
        boolean zS0;
        int i18;
        boolean z10;
        boolean z11;
        ?? r15;
        int i19;
        int i20;
        p182s1.b.InterfaceC0704b interfaceC0704b;
        int i21;
        ?? r16;
        int i22;
        int i23;
        ?? r6;
        p182s1.b.InterfaceC0704b interfaceC0704bU0 = fVar.U0();
        int size = fVar.f53808w0.size();
        int iP = fVar.P();
        int iV = fVar.v();
        boolean zB = p172r1.k.b(i6, 128);
        ?? r11 = 1;
        boolean z12 = zB || p172r1.k.b(i6, 64);
        if (z12) {
            for (int i24 = 0; i24 < size; i24++) {
                p172r1.e eVar = (p172r1.e) fVar.f53808w0.get(i24);
                r1.e.b bVarY = eVar.y();
                r1.e.b bVar = r1.e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarY == bVar) && (eVar.M() == bVar) && eVar.t() > 0.0f;
                if ((eVar.V() && z13) || ((eVar.X() && z13) || (eVar instanceof p172r1.l) || eVar.V() || eVar.X())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = p162q1.d.f52959r;
        }
        int i25 = 2;
        if (z12 && ((i12 == 1073741824 && i14 == 1073741824) || zB)) {
            int iMin = java.lang.Math.min(fVar.C(), i13);
            int iMin2 = java.lang.Math.min(fVar.B(), i15);
            if (i12 == 1073741824 && fVar.P() != iMin) {
                fVar.E0(iMin);
                fVar.X0();
            }
            if (i14 == 1073741824 && fVar.v() != iMin2) {
                fVar.h0(iMin2);
                fVar.X0();
            }
            if (i12 == 1073741824 && i14 == 1073741824) {
                zS0 = fVar.R0(zB);
                i18 = 2;
                z6 = false;
            } else {
                zS0 = fVar.S0(zB);
                z6 = false;
                if (i12 == 1073741824) {
                    zS0 &= fVar.T0(zB, 0);
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                if (i14 == 1073741824) {
                    zS0 &= fVar.T0(zB, 1);
                    i18++;
                }
            }
            if (zS0) {
                fVar.I0(i12 == 1073741824 ? true : z6, i14 == 1073741824 ? true : z6);
            }
        } else {
            z6 = false;
            zS0 = false;
            i18 = 0;
        }
        if (zS0 && i18 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int iV0 = fVar.V0();
        int size2 = this.f54041a.size();
        if (size > 0) {
            c(fVar, "First pass", iP, iV);
        }
        if (size2 > 0) {
            r1.e.b bVarY2 = fVar.y();
            r1.e.b bVar2 = r1.e.b.WRAP_CONTENT;
            boolean z15 = bVarY2 == bVar2 ? true : z6;
            boolean z16 = fVar.M() == bVar2 ? true : z6;
            int iMax = java.lang.Math.max(fVar.P(), this.f54043c.E());
            int iMax2 = java.lang.Math.max(fVar.v(), this.f54043c.D());
            boolean z17 = z6;
            ?? r17 = z17;
            ?? r14 = z17;
            while (r14 < size2) {
                p172r1.e eVar2 = (p172r1.e) this.f54041a.get(r14);
                if (eVar2 instanceof p172r1.l) {
                    int iP2 = eVar2.P();
                    int iV2 = eVar2.v();
                    int i26 = (r17 == true ? 1 : 0) | (a(interfaceC0704bU0, eVar2, r11) ? 1 : 0);
                    int iP3 = eVar2.P();
                    int iV3 = eVar2.v();
                    if (iP3 != iP2) {
                        eVar2.E0(iP3);
                        if (z15 && eVar2.I() > iMax) {
                            iMax = java.lang.Math.max(iMax, eVar2.I() + eVar2.m(r1.d.b.RIGHT).c());
                        }
                        i23 = 1;
                    } else {
                        i23 = i26;
                    }
                    if (iV3 != iV2) {
                        eVar2.h0(iV3);
                        if (z16 && eVar2.p() > iMax2) {
                            iMax2 = java.lang.Math.max(iMax2, eVar2.p() + eVar2.m(r1.d.b.BOTTOM).c());
                        }
                        i23 = 1;
                    }
                    r17 = i23 | (((p172r1.l) eVar2).V0() ? 1 : 0);
                    r6 = 1;
                } else {
                    r6 = r11;
                }
                int i27 = r14 + r6;
                r11 = r6;
                i25 = 2;
                iV0 = iV0;
                r14 = i27;
                r17 = r17;
            }
            int i28 = iV0;
            int i29 = i25;
            int i30 = 0;
            ?? r18 = r17;
            while (i30 < i29) {
                int i31 = 0;
                while (i31 < size2) {
                    p172r1.e eVar3 = (p172r1.e) this.f54041a.get(i31);
                    if (!(eVar3 instanceof p172r1.i) || (eVar3 instanceof p172r1.l)) {
                        r15 = r18;
                        r15 = r18;
                        if ((eVar3 instanceof p172r1.h) || eVar3.O() == 8 || ((eVar3.f53673e.f54104e.f54074j && eVar3.f53675f.f54104e.f54074j) || (eVar3 instanceof p172r1.l))) {
                            r15 = r18;
                            i19 = size2;
                            interfaceC0704b = interfaceC0704bU0;
                            i20 = i30;
                            r16 = r15;
                        } else {
                            int iP4 = eVar3.P();
                            int iV4 = eVar3.v();
                            i19 = size2;
                            int iN = eVar3.n();
                            i20 = i30;
                            int i32 = (r15 == true ? 1 : 0) | (a(interfaceC0704bU0, eVar3, true) ? 1 : 0);
                            int iP5 = eVar3.P();
                            interfaceC0704b = interfaceC0704bU0;
                            int iV5 = eVar3.v();
                            if (iP5 != iP4) {
                                eVar3.E0(iP5);
                                if (z15 && eVar3.I() > iMax) {
                                    iMax = java.lang.Math.max(iMax, eVar3.I() + eVar3.m(r1.d.b.RIGHT).c());
                                }
                                i21 = 1;
                            } else {
                                i21 = i32;
                            }
                            if (iV5 != iV4) {
                                eVar3.h0(iV5);
                                if (z16 && eVar3.p() > iMax2) {
                                    iMax2 = java.lang.Math.max(iMax2, eVar3.p() + eVar3.m(r1.d.b.BOTTOM).c());
                                }
                                i21 = 1;
                            }
                            if (!eVar3.S() || iN == eVar3.n()) {
                                r16 = i21;
                            } else {
                                i22 = 1;
                                r16 = 1;
                            }
                        }
                        i22 = 1;
                    } else {
                        r15 = r18;
                        i19 = size2;
                        interfaceC0704b = interfaceC0704bU0;
                        i20 = i30;
                        r16 = r15;
                        i22 = 1;
                    }
                    i31 += i22;
                    size2 = i19;
                    interfaceC0704bU0 = interfaceC0704b;
                    i30 = i20;
                    r15 = r16;
                }
                r15 = r18;
                int i33 = size2;
                p182s1.b.InterfaceC0704b interfaceC0704b2 = interfaceC0704bU0;
                int i34 = i30;
                if (r15 != 0) {
                    c(fVar, "intermediate pass", iP, iV);
                    r15 = 0;
                }
                i30 = i34 + 1;
                size2 = i33;
                interfaceC0704bU0 = interfaceC0704b2;
                i29 = 2;
                r18 = r15;
            }
            if (r18 != 0) {
                c(fVar, "2nd pass", iP, iV);
                if (fVar.P() < iMax) {
                    fVar.E0(iMax);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fVar.v() < iMax2) {
                    fVar.h0(iMax2);
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    c(fVar, "3rd pass", iP, iV);
                }
            }
            iV0 = i28;
        }
        fVar.g1(iV0);
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public void e(p172r1.f fVar) {
        this.f54041a.clear();
        int size = fVar.f53808w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            p172r1.e eVar = (p172r1.e) fVar.f53808w0.get(i6);
            r1.e.b bVarY = eVar.y();
            r1.e.b bVar = r1.e.b.MATCH_CONSTRAINT;
            if (bVarY != bVar) {
                r1.e.b bVarY2 = eVar.y();
                r1.e.b bVar2 = r1.e.b.MATCH_PARENT;
                if (bVarY2 == bVar2 || eVar.M() == bVar || eVar.M() == bVar2) {
                    this.f54041a.add(eVar);
                }
            } else {
                this.f54041a.add(eVar);
            }
        }
        fVar.X0();
    }
}
