package p122m1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p122m1.j {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final p122m1.a.C0645a f50225M0 = new p122m1.a.C0645a(null);

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final int f50226N0 = 8;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f50227I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f50228J0 = true;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f50229K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private boolean f50230L0;

    /* JADX INFO: renamed from: m1.a$a, reason: collision with other inner class name */
    public static final class C0645a {
        private C0645a() {
        }

        public /* synthetic */ C0645a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    @Override // p122m1.e
    public boolean Q0() {
        return this.f50230L0;
    }

    @Override // p122m1.e
    public boolean R0() {
        return this.f50230L0;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01d7  */
    @Override // p122m1.e
    public void d(p042e1.d dVar, boolean z6) {
        boolean z10;
        p042e1.i iVarH;
        p122m1.d dVarL;
        int iF;
        int i6;
        int i10;
        int i11;
        p042e1.i iVarH2;
        int iG0;
        p247y7.AbstractC7350t.f(dVar, "system");
        M()[0] = L();
        M()[2] = c0();
        M()[1] = b0();
        M()[3] = G();
        int length = M().length;
        for (int i12 = 0; i12 < length; i12++) {
            M()[i12].B(dVar.u(M()[i12]));
        }
        int i13 = this.f50227I0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        p122m1.d dVar2 = M()[this.f50227I0];
        if (!this.f50230L0) {
            f2();
        }
        if (this.f50230L0) {
            this.f50230L0 = false;
            int i14 = this.f50227I0;
            if (i14 == 0 || i14 == 1) {
                p042e1.i iVarH3 = L().h();
                p247y7.AbstractC7350t.c(iVarH3);
                dVar.j(iVarH3, g0());
                iVarH2 = b0().h();
                p247y7.AbstractC7350t.c(iVarH2);
                iG0 = g0();
            } else {
                if (i14 != 2 && i14 != 3) {
                    return;
                }
                p042e1.i iVarH4 = c0().h();
                p247y7.AbstractC7350t.c(iVarH4);
                dVar.j(iVarH4, h0());
                iVarH2 = G().h();
                p247y7.AbstractC7350t.c(iVarH2);
                iG0 = h0();
            }
            dVar.j(iVarH2, iG0);
            return;
        }
        int iE2 = e2();
        int i15 = 0;
        while (true) {
            if (i15 >= iE2) {
                z10 = false;
                break;
            }
            p122m1.e eVar = d2()[i15];
            p247y7.AbstractC7350t.c(eVar);
            if ((this.f50228J0 || eVar.e()) && ((((i10 = this.f50227I0) == 0 || i10 == 1) && eVar.A() == m1.e.b.MATCH_CONSTRAINT && eVar.L().i() != null && eVar.b0().i() != null) || (((i11 = this.f50227I0) == 2 || i11 == 3) && eVar.y0() == m1.e.b.MATCH_CONSTRAINT && eVar.c0().i() != null && eVar.G().i() != null))) {
                z10 = true;
                break;
            }
            i15++;
        }
        boolean z11 = L().q() || b0().q();
        boolean z12 = c0().q() || G().q();
        int i16 = !(!z10 && (((i6 = this.f50227I0) == 0 && z11) || ((i6 == 2 && z12) || ((i6 == 1 && z11) || (i6 == 3 && z12))))) ? 4 : 5;
        int iE3 = e2();
        for (int i17 = 0; i17 < iE3; i17++) {
            p122m1.e eVar2 = d2()[i17];
            p247y7.AbstractC7350t.c(eVar2);
            if (this.f50228J0 || eVar2.e()) {
                p042e1.i iVarU = dVar.u(eVar2.M()[this.f50227I0]);
                eVar2.M()[this.f50227I0].B(iVarU);
                if (eVar2.M()[this.f50227I0].i() != null) {
                    p122m1.d dVarI = eVar2.M()[this.f50227I0].i();
                    p247y7.AbstractC7350t.c(dVarI);
                    if (p247y7.AbstractC7350t.b(dVarI.g(), this)) {
                        iF = eVar2.M()[this.f50227I0].f();
                    } else {
                        iF = 0;
                    }
                } else {
                    iF = 0;
                }
                int i18 = this.f50227I0;
                if (i18 == 0 || i18 == 2) {
                    p042e1.i iVarH5 = dVar2.h();
                    p247y7.AbstractC7350t.c(iVarH5);
                    p247y7.AbstractC7350t.c(iVarU);
                    dVar.m(iVarH5, iVarU, this.f50229K0 - iF, z10);
                } else {
                    p042e1.i iVarH6 = dVar2.h();
                    p247y7.AbstractC7350t.c(iVarH6);
                    p247y7.AbstractC7350t.c(iVarU);
                    dVar.k(iVarH6, iVarU, this.f50229K0 + iF, z10);
                }
                p042e1.i iVarH7 = dVar2.h();
                p247y7.AbstractC7350t.c(iVarH7);
                dVar.i(iVarH7, iVarU, this.f50229K0 + iF, i16);
            }
        }
        int i19 = this.f50227I0;
        if (i19 == 0) {
            p042e1.i iVarH8 = b0().h();
            p247y7.AbstractC7350t.c(iVarH8);
            p042e1.i iVarH9 = L().h();
            p247y7.AbstractC7350t.c(iVarH9);
            dVar.i(iVarH8, iVarH9, 0, 8);
            p042e1.i iVarH10 = L().h();
            p247y7.AbstractC7350t.c(iVarH10);
            p122m1.e eVarO0 = o0();
            p247y7.AbstractC7350t.c(eVarO0);
            p042e1.i iVarH11 = eVarO0.b0().h();
            p247y7.AbstractC7350t.c(iVarH11);
            dVar.i(iVarH10, iVarH11, 0, 4);
            iVarH = L().h();
            p247y7.AbstractC7350t.c(iVarH);
            p122m1.e eVarO1 = o0();
            p247y7.AbstractC7350t.c(eVarO1);
            dVarL = eVarO1.L();
        } else if (i19 == 1) {
            p042e1.i iVarH12 = L().h();
            p247y7.AbstractC7350t.c(iVarH12);
            p042e1.i iVarH13 = b0().h();
            p247y7.AbstractC7350t.c(iVarH13);
            dVar.i(iVarH12, iVarH13, 0, 8);
            p042e1.i iVarH14 = L().h();
            p247y7.AbstractC7350t.c(iVarH14);
            p122m1.e eVarO2 = o0();
            p247y7.AbstractC7350t.c(eVarO2);
            p042e1.i iVarH15 = eVarO2.L().h();
            p247y7.AbstractC7350t.c(iVarH15);
            dVar.i(iVarH14, iVarH15, 0, 4);
            iVarH = L().h();
            p247y7.AbstractC7350t.c(iVarH);
            p122m1.e eVarO3 = o0();
            p247y7.AbstractC7350t.c(eVarO3);
            dVarL = eVarO3.b0();
        } else if (i19 == 2) {
            p042e1.i iVarH16 = G().h();
            p247y7.AbstractC7350t.c(iVarH16);
            p042e1.i iVarH17 = c0().h();
            p247y7.AbstractC7350t.c(iVarH17);
            dVar.i(iVarH16, iVarH17, 0, 8);
            p042e1.i iVarH18 = c0().h();
            p247y7.AbstractC7350t.c(iVarH18);
            p122m1.e eVarO4 = o0();
            p247y7.AbstractC7350t.c(eVarO4);
            p042e1.i iVarH19 = eVarO4.G().h();
            p247y7.AbstractC7350t.c(iVarH19);
            dVar.i(iVarH18, iVarH19, 0, 4);
            iVarH = c0().h();
            p247y7.AbstractC7350t.c(iVarH);
            p122m1.e eVarO5 = o0();
            p247y7.AbstractC7350t.c(eVarO5);
            dVarL = eVarO5.c0();
        } else {
            if (i19 != 3) {
                return;
            }
            p042e1.i iVarH20 = c0().h();
            p247y7.AbstractC7350t.c(iVarH20);
            p042e1.i iVarH21 = G().h();
            p247y7.AbstractC7350t.c(iVarH21);
            dVar.i(iVarH20, iVarH21, 0, 8);
            p042e1.i iVarH22 = c0().h();
            p247y7.AbstractC7350t.c(iVarH22);
            p122m1.e eVarO6 = o0();
            p247y7.AbstractC7350t.c(eVarO6);
            p042e1.i iVarH23 = eVarO6.c0().h();
            p247y7.AbstractC7350t.c(iVarH23);
            dVar.i(iVarH22, iVarH23, 0, 4);
            iVarH = c0().h();
            p247y7.AbstractC7350t.c(iVarH);
            p122m1.e eVarO7 = o0();
            p247y7.AbstractC7350t.c(eVarO7);
            dVarL = eVarO7.G();
        }
        p042e1.i iVarH24 = dVarL.h();
        p247y7.AbstractC7350t.c(iVarH24);
        dVar.i(iVarH, iVarH24, 0, 0);
    }

    @Override // p122m1.e
    public boolean e() {
        return true;
    }

    public final boolean f2() {
        m1.d.b bVar;
        m1.d.b bVar2;
        m1.d.b bVar3;
        int i6;
        int i10;
        int iE2 = e2();
        boolean z6 = true;
        for (int i11 = 0; i11 < iE2; i11++) {
            p122m1.e eVar = d2()[i11];
            p247y7.AbstractC7350t.c(eVar);
            if ((this.f50228J0 || eVar.e()) && ((((i6 = this.f50227I0) == 0 || i6 == 1) && !eVar.Q0()) || (((i10 = this.f50227I0) == 2 || i10 == 3) && !eVar.R0()))) {
                z6 = false;
            }
        }
        if (!z6 || e2() <= 0) {
            return false;
        }
        int iE3 = e2();
        int iMin = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < iE3; i12++) {
            p122m1.e eVar2 = d2()[i12];
            p247y7.AbstractC7350t.c(eVar2);
            if (this.f50228J0 || eVar2.e()) {
                if (!z10) {
                    int i13 = this.f50227I0;
                    if (i13 == 0) {
                        bVar3 = m1.d.b.LEFT;
                    } else if (i13 == 1) {
                        bVar3 = m1.d.b.RIGHT;
                    } else if (i13 != 2) {
                        if (i13 == 3) {
                            bVar3 = m1.d.b.BOTTOM;
                        }
                        z10 = true;
                    } else {
                        bVar3 = m1.d.b.TOP;
                    }
                    p122m1.d dVarL = eVar2.l(bVar3);
                    p247y7.AbstractC7350t.c(dVarL);
                    iMin = dVarL.e();
                    z10 = true;
                }
                int i14 = this.f50227I0;
                if (i14 != 0) {
                    if (i14 == 1) {
                        bVar2 = m1.d.b.RIGHT;
                    } else if (i14 == 2) {
                        bVar = m1.d.b.TOP;
                    } else if (i14 == 3) {
                        bVar2 = m1.d.b.BOTTOM;
                    }
                    p122m1.d dVarL2 = eVar2.l(bVar2);
                    p247y7.AbstractC7350t.c(dVarL2);
                    iMin = java.lang.Math.max(iMin, dVarL2.e());
                } else {
                    bVar = m1.d.b.LEFT;
                }
                p122m1.d dVarL3 = eVar2.l(bVar);
                p247y7.AbstractC7350t.c(dVarL3);
                iMin = java.lang.Math.min(iMin, dVarL3.e());
            }
        }
        int i15 = iMin + this.f50229K0;
        int i16 = this.f50227I0;
        if (i16 == 0 || i16 == 1) {
            g1(i15, i15);
        } else {
            j1(i15, i15);
        }
        this.f50230L0 = true;
        return true;
    }

    public final boolean g2() {
        return this.f50228J0;
    }

    public final int h2() {
        return this.f50227I0;
    }

    public final int i2() {
        return this.f50229K0;
    }

    public final int j2() {
        int i6 = this.f50227I0;
        if (i6 == 0 || i6 == 1) {
            return 0;
        }
        return (i6 == 2 || i6 == 3) ? 1 : -1;
    }

    public final void k2() {
        int iE2 = e2();
        for (int i6 = 0; i6 < iE2; i6++) {
            p122m1.e eVar = d2()[i6];
            p247y7.AbstractC7350t.c(eVar);
            if (this.f50228J0 || eVar.e()) {
                int i10 = this.f50227I0;
                if (i10 == 0 || i10 == 1) {
                    eVar.v1(0, true);
                } else if (i10 == 2 || i10 == 3) {
                    eVar.v1(1, true);
                }
            }
        }
    }

    public final void l2(int i6) {
        this.f50227I0 = i6;
    }

    public final void m2(int i6) {
        this.f50229K0 = i6;
    }

    @Override // p122m1.e
    public java.lang.String toString() {
        java.lang.String str = "[Barrier] " + q() + " {";
        int iE2 = e2();
        for (int i6 = 0; i6 < iE2; i6++) {
            p122m1.e eVar = d2()[i6];
            p247y7.AbstractC7350t.c(eVar);
            if (i6 > 0) {
                str = str + ", ";
            }
            str = str + eVar.q();
        }
        return str + "}";
    }
}
