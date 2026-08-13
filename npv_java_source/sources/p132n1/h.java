package p132n1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1.h.a f51393a = new n1.h.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p132n1.b.C0649b f51394b = new p132n1.b.C0649b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f51395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f51396d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final boolean a(int i6, p122m1.e eVar) {
            m1.e.b bVar;
            m1.e.b bVar2;
            m1.e.b bVarA = eVar.A();
            m1.e.b bVarY0 = eVar.y0();
            p122m1.f fVar = eVar.o0() != null ? (p122m1.f) eVar.o0() : null;
            if (fVar != null) {
                fVar.A();
                m1.e.b bVar3 = m1.e.b.FIXED;
            }
            if (fVar != null) {
                fVar.y0();
                m1.e.b bVar4 = m1.e.b.FIXED;
            }
            m1.e.b bVar5 = m1.e.b.FIXED;
            boolean z6 = bVarA == bVar5 || eVar.Q0() || bVarA == m1.e.b.WRAP_CONTENT || (bVarA == (bVar2 = m1.e.b.MATCH_CONSTRAINT) && eVar.Q() == 0 && eVar.I() == 0.0f && eVar.E0(0)) || (bVarA == bVar2 && eVar.Q() == 1 && eVar.H0(0, eVar.B0()));
            boolean z10 = bVarY0 == bVar5 || eVar.R0() || bVarY0 == m1.e.b.WRAP_CONTENT || (bVarY0 == (bVar = m1.e.b.MATCH_CONSTRAINT) && eVar.P() == 0 && eVar.I() == 0.0f && eVar.E0(1)) || (bVarY0 == bVar && eVar.P() == 1 && eVar.H0(1, eVar.w()));
            if (eVar.I() <= 0.0f || !(z6 || z10)) {
                return z6 && z10;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x025f  */
        /* JADX WARN: Code duplicated, block: B:109:0x0284  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:36:0x0109  */
        private final void b(int i6, p122m1.e eVar, n1.b.c cVar, boolean z6) {
            boolean z10;
            p122m1.e eVar2;
            int i10;
            boolean z11;
            int i11;
            p122m1.e eVar3;
            if (eVar.K0()) {
                return;
            }
            p132n1.h.f51395c++;
            if (!(eVar instanceof p122m1.f) && eVar.P0()) {
                int i12 = i6 + 1;
                if (a(i12, eVar)) {
                    p122m1.f.f50371h1.a(i12, eVar, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                }
            }
            p122m1.d dVarL = eVar.l(m1.d.b.LEFT);
            p122m1.d dVarL2 = eVar.l(m1.d.b.RIGHT);
            p247y7.AbstractC7350t.c(dVarL);
            int iE = dVarL.e();
            p247y7.AbstractC7350t.c(dVarL2);
            int iE2 = dVarL2.e();
            java.lang.String str = "next(...)";
            if (dVarL.d() != null && dVarL.s()) {
                java.util.HashSet hashSetD = dVarL.d();
                p247y7.AbstractC7350t.c(hashSetD);
                for (java.lang.Object obj : hashSetD) {
                    p247y7.AbstractC7350t.e(obj, str);
                    p122m1.d dVar = (p122m1.d) obj;
                    p122m1.e eVarG = dVar.g();
                    int i13 = i6 + 1;
                    boolean zA = a(i13, eVarG);
                    if (eVarG.P0() && zA) {
                        p122m1.f.f50371h1.a(i13, eVarG, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                    }
                    if (!p247y7.AbstractC7350t.b(dVar, eVarG.L()) || eVarG.b0().i() == null) {
                        if (p247y7.AbstractC7350t.b(dVar, eVarG.b0()) && eVarG.L().i() != null) {
                            p122m1.d dVarI = eVarG.L().i();
                            p247y7.AbstractC7350t.c(dVarI);
                            z11 = dVarI.s();
                        }
                    } else {
                        p122m1.d dVarI2 = eVarG.b0().i();
                        p247y7.AbstractC7350t.c(dVarI2);
                        if (!dVarI2.s()) {
                            if (p247y7.AbstractC7350t.b(dVar, eVarG.b0())) {
                                p122m1.d dVarI3 = eVarG.L().i();
                                p247y7.AbstractC7350t.c(dVarI3);
                                if (dVarI3.s()) {
                                }
                            }
                        }
                    }
                    m1.e.b bVarA = eVarG.A();
                    m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
                    if (bVarA != bVar || zA) {
                        if (!eVarG.P0()) {
                            if (p247y7.AbstractC7350t.b(dVar, eVarG.L()) && eVarG.b0().i() == null) {
                                int iK = eVarG.L().k() + iE;
                                eVar3 = eVarG;
                                eVar3.g1(iK, eVarG.B0() + iK);
                                i11 = i13;
                            } else {
                                i11 = i13;
                                eVar3 = eVarG;
                                if (p247y7.AbstractC7350t.b(dVar, eVar3.b0()) && eVar3.L().i() == null) {
                                    int iK2 = iE - eVar3.b0().k();
                                    eVar3.g1(iK2 - eVar3.B0(), iK2);
                                } else if (z11 && !eVar3.M0()) {
                                    e(i11, cVar, eVar3, z6);
                                }
                            }
                            b(i11, eVar3, cVar, z6);
                        }
                    } else if (eVarG.A() == bVar && eVarG.S() >= 0 && eVarG.U() >= 0 && ((eVarG.A0() == 8 || (eVarG.Q() == 0 && eVarG.s() == 0.0f)) && !eVarG.M0() && !eVarG.O0() && z11 && !eVarG.M0())) {
                        f(i13, eVar, cVar, eVarG, z6);
                    }
                    str = str;
                }
            }
            java.lang.String str2 = str;
            if (eVar instanceof p122m1.h) {
                return;
            }
            if (dVarL2.d() != null && dVarL2.s()) {
                java.util.HashSet hashSetD2 = dVarL2.d();
                p247y7.AbstractC7350t.c(hashSetD2);
                for (java.lang.Object obj2 : hashSetD2) {
                    java.lang.String str3 = str2;
                    p247y7.AbstractC7350t.e(obj2, str3);
                    p122m1.d dVar2 = (p122m1.d) obj2;
                    p122m1.e eVarG2 = dVar2.g();
                    int i14 = i6 + 1;
                    boolean zA2 = a(i14, eVarG2);
                    if (eVarG2.P0() && zA2) {
                        p122m1.f.f50371h1.a(i14, eVarG2, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                    }
                    if (!p247y7.AbstractC7350t.b(dVar2, eVarG2.L()) || eVarG2.b0().i() == null) {
                        if (p247y7.AbstractC7350t.b(dVar2, eVarG2.b0()) && eVarG2.L().i() != null) {
                            p122m1.d dVarI4 = eVarG2.L().i();
                            p247y7.AbstractC7350t.c(dVarI4);
                            z10 = dVarI4.s();
                        }
                    } else {
                        p122m1.d dVarI5 = eVarG2.b0().i();
                        p247y7.AbstractC7350t.c(dVarI5);
                        if (!dVarI5.s()) {
                            if (p247y7.AbstractC7350t.b(dVar2, eVarG2.b0())) {
                                p122m1.d dVarI6 = eVarG2.L().i();
                                p247y7.AbstractC7350t.c(dVarI6);
                                if (dVarI6.s()) {
                                }
                            }
                        }
                    }
                    m1.e.b bVarA2 = eVarG2.A();
                    m1.e.b bVar2 = m1.e.b.MATCH_CONSTRAINT;
                    if (bVarA2 != bVar2 || zA2) {
                        if (!eVarG2.P0()) {
                            if (p247y7.AbstractC7350t.b(dVar2, eVarG2.L()) && eVarG2.b0().i() == null) {
                                int iK3 = eVarG2.L().k() + iE2;
                                eVar2 = eVarG2;
                                eVar2.g1(iK3, eVarG2.B0() + iK3);
                                i10 = i14;
                            } else {
                                eVar2 = eVarG2;
                                i10 = i14;
                                if (p247y7.AbstractC7350t.b(dVar2, eVar2.b0()) && eVar2.L().i() == null) {
                                    int iK4 = iE2 - eVar2.b0().k();
                                    eVar2.g1(iK4 - eVar2.B0(), iK4);
                                } else if (z10 && !eVar2.M0()) {
                                    e(i10, cVar, eVar2, z6);
                                }
                            }
                            b(i10, eVar2, cVar, z6);
                        }
                    } else if (eVarG2.A() == bVar2 && eVarG2.S() >= 0 && eVarG2.U() >= 0 && ((eVarG2.A0() == 8 || (eVarG2.Q() == 0 && eVarG2.s() == 0.0f)) && !eVarG2.M0() && !eVarG2.O0() && z10 && !eVarG2.M0())) {
                        f(i14, eVar, cVar, eVarG2, z6);
                    }
                    str2 = str3;
                }
            }
            eVar.T0();
        }

        private final void d(int i6, p122m1.a aVar, n1.b.c cVar, int i10, boolean z6) {
            if (aVar.f2()) {
                int i11 = i6 + 1;
                if (i10 == 0) {
                    b(i11, aVar, cVar, z6);
                } else {
                    j(i11, aVar, cVar);
                }
            }
        }

        private final void e(int i6, n1.b.c cVar, p122m1.e eVar, boolean z6) {
            float fX = eVar.x();
            p122m1.d dVarI = eVar.L().i();
            p247y7.AbstractC7350t.c(dVarI);
            int iE = dVarI.e();
            p122m1.d dVarI2 = eVar.b0().i();
            p247y7.AbstractC7350t.c(dVarI2);
            int iE2 = dVarI2.e();
            int iK = eVar.L().k() + iE;
            int iK2 = iE2 - eVar.b0().k();
            if (iE == iE2) {
                fX = 0.5f;
            } else {
                iE = iK;
                iE2 = iK2;
            }
            int iB0 = eVar.B0();
            int i10 = (iE2 - iE) - iB0;
            if (iE > iE2) {
                i10 = (iE - iE2) - iB0;
            }
            int i11 = ((int) (i10 > 0 ? (fX * i10) + 0.5f : fX * i10)) + iE;
            int i12 = i11 + iB0;
            if (iE > iE2) {
                i12 = i11 - iB0;
            }
            eVar.g1(i11, i12);
            b(i6 + 1, eVar, cVar, z6);
        }

        private final void f(int i6, p122m1.e eVar, n1.b.c cVar, p122m1.e eVar2, boolean z6) {
            int iB0;
            float fX = eVar2.x();
            p122m1.d dVarI = eVar2.L().i();
            p247y7.AbstractC7350t.c(dVarI);
            int iE = dVarI.e() + eVar2.L().k();
            p122m1.d dVarI2 = eVar2.b0().i();
            p247y7.AbstractC7350t.c(dVarI2);
            int iE2 = dVarI2.e() - eVar2.b0().k();
            if (iE2 >= iE) {
                int iB1 = eVar2.B0();
                if (eVar2.A0() != 8) {
                    if (eVar2.Q() == 2) {
                        p122m1.f fVar = eVar instanceof p122m1.f ? (p122m1.f) eVar : null;
                        if (fVar != null) {
                            iB0 = fVar.B0();
                        } else {
                            p122m1.e eVarO0 = eVar.o0();
                            p247y7.AbstractC7350t.c(eVarO0);
                            iB0 = eVarO0.B0();
                        }
                        iB1 = (int) (eVar2.x() * 0.5f * iB0);
                    } else if (eVar2.Q() == 0) {
                        iB1 = iE2 - iE;
                    }
                    iB1 = java.lang.Math.max(eVar2.U(), iB1);
                    if (eVar2.S() > 0) {
                        iB1 = java.lang.Math.min(eVar2.S(), iB1);
                    }
                }
                int i10 = iE + ((int) ((fX * ((iE2 - iE) - iB1)) + 0.5f));
                eVar2.g1(i10, iB1 + i10);
                b(i6 + 1, eVar2, cVar, z6);
            }
        }

        private final void g(int i6, n1.b.c cVar, p122m1.e eVar) {
            float fV0 = eVar.v0();
            p122m1.d dVarI = eVar.c0().i();
            p247y7.AbstractC7350t.c(dVarI);
            int iE = dVarI.e();
            p122m1.d dVarI2 = eVar.G().i();
            p247y7.AbstractC7350t.c(dVarI2);
            int iE2 = dVarI2.e();
            int iK = eVar.c0().k() + iE;
            int iK2 = iE2 - eVar.G().k();
            if (iE == iE2) {
                fV0 = 0.5f;
            } else {
                iE = iK;
                iE2 = iK2;
            }
            int iW = eVar.w();
            int i10 = (iE2 - iE) - iW;
            if (iE > iE2) {
                i10 = (iE - iE2) - iW;
            }
            int i11 = (int) (i10 > 0 ? (fV0 * i10) + 0.5f : fV0 * i10);
            int i12 = iE + i11;
            int i13 = i12 + iW;
            if (iE > iE2) {
                i12 = iE - i11;
                i13 = i12 - iW;
            }
            eVar.j1(i12, i13);
            j(i6 + 1, eVar, cVar);
        }

        private final void h(int i6, p122m1.e eVar, n1.b.c cVar, p122m1.e eVar2) {
            int iW;
            float fV0 = eVar2.v0();
            p122m1.d dVarI = eVar2.c0().i();
            p247y7.AbstractC7350t.c(dVarI);
            int iE = dVarI.e() + eVar2.c0().k();
            p122m1.d dVarI2 = eVar2.G().i();
            p247y7.AbstractC7350t.c(dVarI2);
            int iE2 = dVarI2.e() - eVar2.G().k();
            if (iE2 >= iE) {
                int iW2 = eVar2.w();
                if (eVar2.A0() != 8) {
                    if (eVar2.P() == 2) {
                        p122m1.f fVar = eVar instanceof p122m1.f ? (p122m1.f) eVar : null;
                        if (fVar != null) {
                            iW = fVar.w();
                        } else {
                            p122m1.e eVarO0 = eVar.o0();
                            p247y7.AbstractC7350t.c(eVarO0);
                            iW = eVarO0.w();
                        }
                        iW2 = (int) (fV0 * 0.5f * iW);
                    } else if (eVar2.P() == 0) {
                        iW2 = iE2 - iE;
                    }
                    iW2 = java.lang.Math.max(eVar2.T(), iW2);
                    if (eVar2.R() > 0) {
                        iW2 = java.lang.Math.min(eVar2.R(), iW2);
                    }
                }
                int i10 = iE + ((int) ((fV0 * ((iE2 - iE) - iW2)) + 0.5f));
                eVar2.j1(i10, iW2 + i10);
                j(i6 + 1, eVar2, cVar);
            }
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0240  */
        /* JADX WARN: Code duplicated, block: B:109:0x0265  */
        /* JADX WARN: Code duplicated, block: B:30:0x00de  */
        /* JADX WARN: Code duplicated, block: B:36:0x0103  */
        private final void j(int i6, p122m1.e eVar, n1.b.c cVar) {
            boolean z6;
            boolean z10;
            if (eVar.S0()) {
                return;
            }
            p132n1.h.f51396d++;
            if (!(eVar instanceof p122m1.f) && eVar.P0()) {
                int i10 = i6 + 1;
                if (a(i10, eVar)) {
                    p122m1.f.f50371h1.a(i10, eVar, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                }
            }
            p122m1.d dVarL = eVar.l(m1.d.b.TOP);
            p122m1.d dVarL2 = eVar.l(m1.d.b.BOTTOM);
            p247y7.AbstractC7350t.c(dVarL);
            int iE = dVarL.e();
            p247y7.AbstractC7350t.c(dVarL2);
            int iE2 = dVarL2.e();
            java.lang.String str = "next(...)";
            if (dVarL.d() != null && dVarL.s()) {
                java.util.HashSet hashSetD = dVarL.d();
                p247y7.AbstractC7350t.c(hashSetD);
                for (java.lang.Object obj : hashSetD) {
                    p247y7.AbstractC7350t.e(obj, str);
                    p122m1.d dVar = (p122m1.d) obj;
                    p122m1.e eVarG = dVar.g();
                    int i11 = i6 + 1;
                    boolean zA = a(i11, eVarG);
                    if (eVarG.P0() && zA) {
                        p122m1.f.f50371h1.a(i11, eVarG, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                    }
                    if (p247y7.AbstractC7350t.b(dVar, eVarG.c0()) && eVarG.G().i() != null) {
                        p122m1.d dVarI = eVarG.G().i();
                        p247y7.AbstractC7350t.c(dVarI);
                        if (!dVarI.s()) {
                            if (p247y7.AbstractC7350t.b(dVar, eVarG.G())) {
                                p122m1.d dVarI2 = eVarG.c0().i();
                                p247y7.AbstractC7350t.c(dVarI2);
                                if (dVarI2.s()) {
                                }
                            }
                        }
                    } else if (p247y7.AbstractC7350t.b(dVar, eVarG.G()) && eVarG.c0().i() != null) {
                        p122m1.d dVarI3 = eVarG.c0().i();
                        p247y7.AbstractC7350t.c(dVarI3);
                        z10 = dVarI3.s();
                    }
                    m1.e.b bVarY0 = eVarG.y0();
                    m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
                    if (bVarY0 != bVar || zA) {
                        if (!eVarG.P0()) {
                            if (p247y7.AbstractC7350t.b(dVar, eVarG.c0()) && eVarG.G().i() == null) {
                                int iK = eVarG.c0().k() + iE;
                                eVarG.j1(iK, eVarG.w() + iK);
                            } else if (p247y7.AbstractC7350t.b(dVar, eVarG.G()) && eVarG.c0().i() == null) {
                                int iK2 = iE - eVarG.G().k();
                                eVarG.j1(iK2 - eVarG.w(), iK2);
                            } else if (z10 && !eVarG.N0()) {
                                g(i11, cVar, eVarG);
                            }
                            j(i11, eVarG, cVar);
                        }
                    } else if (eVarG.y0() == bVar && eVarG.R() >= 0 && eVarG.T() >= 0 && ((eVarG.A0() == 8 || (eVarG.P() == 0 && eVarG.s() == 0.0f)) && !eVarG.N0() && !eVarG.O0() && z10 && !eVarG.N0())) {
                        h(i11, eVar, cVar, eVarG);
                    }
                    str = str;
                }
            }
            java.lang.String str2 = str;
            if (eVar instanceof p122m1.h) {
                return;
            }
            if (dVarL2.d() != null && dVarL2.s()) {
                java.util.HashSet hashSetD2 = dVarL2.d();
                p247y7.AbstractC7350t.c(hashSetD2);
                for (java.lang.Object obj2 : hashSetD2) {
                    java.lang.String str3 = str2;
                    p247y7.AbstractC7350t.e(obj2, str3);
                    p122m1.d dVar2 = (p122m1.d) obj2;
                    p122m1.e eVarG2 = dVar2.g();
                    int i12 = i6 + 1;
                    boolean zA2 = a(i12, eVarG2);
                    if (eVarG2.P0() && zA2) {
                        p122m1.f.f50371h1.a(i12, eVarG2, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                    }
                    if (p247y7.AbstractC7350t.b(dVar2, eVarG2.c0()) && eVarG2.G().i() != null) {
                        p122m1.d dVarI4 = eVarG2.G().i();
                        p247y7.AbstractC7350t.c(dVarI4);
                        if (!dVarI4.s()) {
                            if (p247y7.AbstractC7350t.b(dVar2, eVarG2.G())) {
                                p122m1.d dVarI5 = eVarG2.c0().i();
                                p247y7.AbstractC7350t.c(dVarI5);
                                if (dVarI5.s()) {
                                }
                            }
                        }
                    } else if (p247y7.AbstractC7350t.b(dVar2, eVarG2.G()) && eVarG2.c0().i() != null) {
                        p122m1.d dVarI6 = eVarG2.c0().i();
                        p247y7.AbstractC7350t.c(dVarI6);
                        z6 = dVarI6.s();
                    }
                    m1.e.b bVarY1 = eVarG2.y0();
                    m1.e.b bVar2 = m1.e.b.MATCH_CONSTRAINT;
                    if (bVarY1 != bVar2 || zA2) {
                        if (!eVarG2.P0()) {
                            if (p247y7.AbstractC7350t.b(dVar2, eVarG2.c0()) && eVarG2.G().i() == null) {
                                int iK3 = eVarG2.c0().k() + iE2;
                                eVarG2.j1(iK3, eVarG2.w() + iK3);
                            } else if (p247y7.AbstractC7350t.b(dVar2, eVarG2.G()) && eVarG2.c0().i() == null) {
                                int iK4 = iE2 - eVarG2.G().k();
                                eVarG2.j1(iK4 - eVarG2.w(), iK4);
                            } else if (z6 && !eVarG2.N0()) {
                                g(i12, cVar, eVarG2);
                            }
                            j(i12, eVarG2, cVar);
                        }
                    } else if (eVarG2.y0() == bVar2 && eVarG2.R() >= 0 && eVarG2.T() >= 0 && ((eVarG2.A0() == 8 || (eVarG2.P() == 0 && eVarG2.s() == 0.0f)) && !eVarG2.N0() && !eVarG2.O0() && z6 && !eVarG2.N0())) {
                        h(i12, eVar, cVar, eVarG2);
                    }
                    str2 = str3;
                }
            }
            java.lang.String str4 = str2;
            p122m1.d dVarL3 = eVar.l(m1.d.b.BASELINE);
            p247y7.AbstractC7350t.c(dVarL3);
            if (dVarL3.d() != null && dVarL3.s()) {
                int iE3 = dVarL3.e();
                java.util.HashSet hashSetD3 = dVarL3.d();
                p247y7.AbstractC7350t.c(hashSetD3);
                for (java.lang.Object obj3 : hashSetD3) {
                    p247y7.AbstractC7350t.e(obj3, str4);
                    p122m1.d dVar3 = (p122m1.d) obj3;
                    p122m1.e eVarG3 = dVar3.g();
                    int i13 = i6 + 1;
                    boolean zA3 = a(i13, eVarG3);
                    if (eVarG3.P0() && zA3) {
                        p122m1.f.f50371h1.a(i13, eVarG3, cVar, new p132n1.b.C0649b(), p132n1.b.C0649b.f51342k.a());
                    }
                    if (eVarG3.y0() != m1.e.b.MATCH_CONSTRAINT || zA3) {
                        if (!eVarG3.P0() && p247y7.AbstractC7350t.b(dVar3, eVarG3.F())) {
                            eVarG3.f1(dVar3.k() + iE3);
                            j(i13, eVarG3, cVar);
                        }
                    }
                }
            }
            eVar.U0();
        }

        public final java.lang.String c(int i6) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i10 = 0; i10 < i6; i10++) {
                sb.append("  ");
            }
            sb.append("+-(" + i6 + ") ");
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:55:0x0106  */
        public final void i(p122m1.f fVar, n1.b.c cVar) {
            int i6;
            int i10;
            int iW;
            int iE2;
            p247y7.AbstractC7350t.f(fVar, "layout");
            m1.e.b bVarA = fVar.A();
            m1.e.b bVarY0 = fVar.y0();
            p132n1.h.f51395c = 0;
            p132n1.h.f51396d = 0;
            fVar.Y0();
            java.util.ArrayList arrayListC2 = fVar.c2();
            int size = arrayListC2.size();
            for (int i11 = 0; i11 < size; i11++) {
                java.lang.Object obj = arrayListC2.get(i11);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                ((p122m1.e) obj).Y0();
            }
            boolean zJ2 = fVar.J2();
            if (bVarA == m1.e.b.FIXED) {
                fVar.g1(0, fVar.B0());
            } else {
                fVar.h1(0);
            }
            int i12 = 0;
            boolean z6 = false;
            boolean z10 = false;
            while (true) {
                i6 = -1;
                if (i12 >= size) {
                    break;
                }
                java.lang.Object obj2 = arrayListC2.get(i12);
                p247y7.AbstractC7350t.e(obj2, "get(...)");
                p122m1.e eVar = (p122m1.e) obj2;
                if (eVar instanceof p122m1.h) {
                    p122m1.h hVar = (p122m1.h) eVar;
                    if (hVar.b2() == 1) {
                        if (hVar.c2() != -1) {
                            iE2 = hVar.c2();
                        } else if (hVar.d2() == -1 || !fVar.Q0()) {
                            if (fVar.Q0()) {
                                iE2 = (int) ((hVar.e2() * fVar.B0()) + 0.5f);
                            }
                            z6 = true;
                        } else {
                            iE2 = fVar.B0() - hVar.d2();
                        }
                        hVar.f2(iE2);
                        z6 = true;
                    }
                } else if ((eVar instanceof p122m1.a) && ((p122m1.a) eVar).j2() == 0) {
                    z10 = true;
                }
                i12++;
            }
            if (z6) {
                for (int i13 = 0; i13 < size; i13++) {
                    java.lang.Object obj3 = arrayListC2.get(i13);
                    p247y7.AbstractC7350t.e(obj3, "get(...)");
                    p122m1.e eVar2 = (p122m1.e) obj3;
                    if ((eVar2 instanceof p122m1.h) && ((p122m1.h) eVar2).b2() == 1) {
                        b(0, eVar2, cVar, zJ2);
                    }
                }
            }
            b(0, fVar, cVar, zJ2);
            if (z10) {
                int i14 = 0;
                while (i14 < size) {
                    java.lang.Object obj4 = arrayListC2.get(i14);
                    p247y7.AbstractC7350t.e(obj4, "get(...)");
                    p122m1.e eVar3 = (p122m1.e) obj4;
                    if (eVar3 instanceof p122m1.a) {
                        p122m1.a aVar = (p122m1.a) eVar3;
                        if (aVar.j2() == 0) {
                            d(0, aVar, cVar, 0, zJ2);
                        }
                    }
                    i14++;
                    i6 = i6;
                }
            }
            int i15 = i6;
            if (bVarY0 == m1.e.b.FIXED) {
                fVar.j1(0, fVar.w());
            } else {
                fVar.i1(0);
            }
            boolean z11 = false;
            boolean z12 = false;
            for (int i16 = 0; i16 < size; i16++) {
                java.lang.Object obj5 = arrayListC2.get(i16);
                p247y7.AbstractC7350t.e(obj5, "get(...)");
                p122m1.e eVar4 = (p122m1.e) obj5;
                if (eVar4 instanceof p122m1.h) {
                    p122m1.h hVar2 = (p122m1.h) eVar4;
                    if (hVar2.b2() == 0) {
                        if (hVar2.c2() != i15) {
                            iW = hVar2.c2();
                        } else {
                            if (hVar2.d2() != i15 && fVar.R0()) {
                                iW = fVar.w() - hVar2.d2();
                            } else if (fVar.R0()) {
                                hVar2.f2((int) ((hVar2.e2() * fVar.w()) + 0.5f));
                            }
                            z12 = true;
                        }
                        hVar2.f2(iW);
                        z12 = true;
                    }
                } else {
                    if (eVar4 instanceof p122m1.a) {
                        if (((p122m1.a) eVar4).j2() == 1) {
                            z11 = true;
                        }
                    }
                }
            }
            if (z12) {
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj6 = arrayListC2.get(i17);
                    p247y7.AbstractC7350t.e(obj6, "get(...)");
                    p122m1.e eVar5 = (p122m1.e) obj6;
                    if ((eVar5 instanceof p122m1.h) && ((p122m1.h) eVar5).b2() == 0) {
                        j(1, eVar5, cVar);
                    }
                }
            }
            j(0, fVar, cVar);
            if (z11) {
                for (int i18 = 0; i18 < size; i18++) {
                    java.lang.Object obj7 = arrayListC2.get(i18);
                    p247y7.AbstractC7350t.e(obj7, "get(...)");
                    p122m1.e eVar6 = (p122m1.e) obj7;
                    if (eVar6 instanceof p122m1.a) {
                        p122m1.a aVar2 = (p122m1.a) eVar6;
                        if (aVar2.j2() == 1) {
                            d(0, aVar2, cVar, 1, zJ2);
                        }
                    }
                }
            }
            for (int i19 = 0; i19 < size; i19++) {
                java.lang.Object obj8 = arrayListC2.get(i19);
                p247y7.AbstractC7350t.e(obj8, "get(...)");
                p122m1.e eVar7 = (p122m1.e) obj8;
                if (eVar7.P0() && a(0, eVar7)) {
                    p122m1.f.f50371h1.a(0, eVar7, cVar, p132n1.h.f51394b, p132n1.b.C0649b.f51342k.a());
                    if (!(eVar7 instanceof p122m1.h)) {
                        i10 = 0;
                        b(0, eVar7, cVar, zJ2);
                    } else if (((p122m1.h) eVar7).b2() == 0) {
                        i10 = 0;
                    } else {
                        b(0, eVar7, cVar, zJ2);
                    }
                    j(i10, eVar7, cVar);
                }
            }
        }
    }
}
