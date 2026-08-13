package F0;

/* JADX INFO: loaded from: classes.dex */
public final class L implements p161q0.g, p161q0.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p161q0.a f2393C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private F0.InterfaceC0932s f2394D;

    public L(p161q0.a aVar) {
        this.f2393C = aVar;
    }

    public /* synthetic */ L(p161q0.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new p161q0.a() : aVar);
    }

    @Override // Y0.e
    public float B0(float f6) {
        return this.f2393C.B0(f6);
    }

    @Override // p161q0.g
    public void C0(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.C0(abstractC6984n0, j6, j10, f6, hVar, abstractC7019z0, i6);
    }

    @Override // p161q0.g
    public p161q0.d F0() {
        return this.f2393C.F0();
    }

    @Override // p161q0.g
    public void I(long j6, float f6, float f10, boolean z6, long j10, long j11, float f11, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.I(j6, f6, f10, z6, j10, j11, f11, hVar, abstractC7019z0, i6);
    }

    @Override // p161q0.g
    public void J0(p141o0.E1 e6, long j6, long j10, long j11, long j12, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10) {
        this.f2393C.J0(e6, j6, j10, j11, j12, f6, hVar, abstractC7019z0, i6, i10);
    }

    @Override // Y0.e
    public int K0(long j6) {
        return this.f2393C.K0(j6);
    }

    @Override // Y0.n
    public long O(float f6) {
        return this.f2393C.O(f6);
    }

    @Override // Y0.e
    public long P(long j6) {
        return this.f2393C.P(j6);
    }

    @Override // p161q0.g
    public void Q0(p141o0.Q1 q6, long j6, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.Q0(q6, j6, f6, hVar, abstractC7019z0, i6);
    }

    @Override // Y0.e
    public int S0(float f6) {
        return this.f2393C.S0(f6);
    }

    @Override // p161q0.g
    public void U0(long j6, long j10, long j11, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.U0(j6, j10, j11, f6, hVar, abstractC7019z0, i6);
    }

    @Override // p161q0.g
    public void V0(p141o0.E1 e6, long j6, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.V0(e6, j6, f6, hVar, abstractC7019z0, i6);
    }

    @Override // p161q0.g
    public long W0() {
        return this.f2393C.W0();
    }

    @Override // Y0.n
    public float X(long j6) {
        return this.f2393C.X(j6);
    }

    @Override // p161q0.g
    public void Z0(long j6, float f6, long j10, float f10, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.Z0(j6, f6, j10, f10, hVar, abstractC7019z0, i6);
    }

    @Override // p161q0.g
    public void a0(long j6, long j10, long j11, long j12, p161q0.h hVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.a0(j6, j10, j11, j12, hVar, f6, abstractC7019z0, i6);
    }

    @Override // Y0.e
    public long b1(long j6) {
        return this.f2393C.b1(j6);
    }

    @Override // p161q0.g
    public void d1(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, long j11, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.d1(abstractC6984n0, j6, j10, j11, f6, hVar, abstractC7019z0, i6);
    }

    @Override // p161q0.g
    public void e0(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, float f6, int i6, p141o0.R1 r6, float f10, p141o0.AbstractC7019z0 abstractC7019z0, int i10) {
        this.f2393C.e0(abstractC6984n0, j6, j10, f6, i6, r6, f10, abstractC7019z0, i10);
    }

    public final void f(p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, F0.AbstractC0914d0 abstractC0914d0, androidx.compose.ui.d.c cVar, p171r0.C7053c c7053c) {
        int iA = F0.AbstractC0918f0.a(4);
        androidx.compose.ui.d.c cVarG = cVar;
        X.b bVar = null;
        while (cVarG != null) {
            if (cVarG instanceof F0.InterfaceC0932s) {
                k(interfaceC6993q0, j6, abstractC0914d0, (F0.InterfaceC0932s) cVarG, c7053c);
            } else if ((cVarG.v1() & iA) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                int i6 = 0;
                for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                    if ((cVarU1.v1() & iA) != 0) {
                        i6++;
                        if (i6 == 1) {
                            cVarG = cVarU1;
                        } else {
                            if (bVar == null) {
                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (cVarG != null) {
                                bVar.d(cVarG);
                                cVarG = null;
                            }
                            bVar.d(cVarU1);
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            cVarG = F0.AbstractC0925k.g(bVar);
        }
    }

    @Override // Y0.e
    public float g1(long j6) {
        return this.f2393C.g1(j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f2393C.getDensity();
    }

    @Override // p161q0.g
    public Y0.v getLayoutDirection() {
        return this.f2393C.getLayoutDirection();
    }

    @Override // p161q0.g
    public long i() {
        return this.f2393C.i();
    }

    public final void k(p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, F0.AbstractC0914d0 abstractC0914d0, F0.InterfaceC0932s interfaceC0932s, p171r0.C7053c c7053c) {
        F0.InterfaceC0932s interfaceC0932s2 = this.f2394D;
        this.f2394D = interfaceC0932s;
        p161q0.a aVar = this.f2393C;
        Y0.v layoutDirection = abstractC0914d0.getLayoutDirection();
        Y0.e density = aVar.F0().getDensity();
        Y0.v layoutDirection2 = aVar.F0().getLayoutDirection();
        p141o0.InterfaceC6993q0 interfaceC6993q0H = aVar.F0().h();
        long jI = aVar.F0().i();
        p171r0.C7053c c7053cF = aVar.F0().f();
        p161q0.d dVarF0 = aVar.F0();
        dVarF0.a(abstractC0914d0);
        dVarF0.b(layoutDirection);
        dVarF0.g(interfaceC6993q0);
        dVarF0.d(j6);
        dVarF0.e(c7053c);
        interfaceC6993q0.m();
        try {
            interfaceC0932s.y(this);
            interfaceC6993q0.s();
            p161q0.d dVarF1 = aVar.F0();
            dVarF1.a(density);
            dVarF1.b(layoutDirection2);
            dVarF1.g(interfaceC6993q0H);
            dVarF1.d(jI);
            dVarF1.e(c7053cF);
            this.f2394D = interfaceC0932s2;
        } catch (java.lang.Throwable th) {
            interfaceC6993q0.s();
            p161q0.d dVarF2 = aVar.F0();
            dVarF2.a(density);
            dVarF2.b(layoutDirection2);
            dVarF2.g(interfaceC6993q0H);
            dVarF2.d(jI);
            dVarF2.e(c7053cF);
            throw th;
        }
    }

    @Override // Y0.e
    public long k0(float f6) {
        return this.f2393C.k0(f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p161q0.c
    public void l1() {
        p141o0.InterfaceC6993q0 interfaceC6993q0H = F0().h();
        F0.InterfaceC0932s interfaceC0932s = this.f2394D;
        p247y7.AbstractC7350t.c(interfaceC0932s);
        ?? B6 = F0.M.b(interfaceC0932s);
        if (B6 == 0) {
            F0.AbstractC0914d0 abstractC0914d0H = F0.AbstractC0925k.h(interfaceC0932s, F0.AbstractC0918f0.a(4));
            if (abstractC0914d0H.n2() == interfaceC0932s.E0()) {
                abstractC0914d0H = abstractC0914d0H.o2();
                p247y7.AbstractC7350t.c(abstractC0914d0H);
            }
            abstractC0914d0H.J2(interfaceC6993q0H, F0().f());
            return;
        }
        int iA = F0.AbstractC0918f0.a(4);
        ?? bVar = 0;
        while (B6 != 0) {
            if (B6 instanceof F0.InterfaceC0932s) {
                s((F0.InterfaceC0932s) B6, interfaceC6993q0H, F0().f());
            } else if ((B6.v1() & iA) != 0 && (B6 instanceof F0.AbstractC0927m)) {
                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) B6).U1();
                int i6 = 0;
                B6 = B6;
                bVar = bVar;
                while (cVarU1 != null) {
                    if ((cVarU1.v1() & iA) != 0) {
                        i6++;
                        if (i6 == 1) {
                            bVar = bVar;
                            B6 = cVarU1;
                        } else {
                            if (bVar == 0) {
                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (B6 != 0) {
                                bVar.d(B6);
                                B6 = 0;
                            }
                            bVar.d(cVarU1);
                        }
                    }
                    cVarU1 = cVarU1.r1();
                    B6 = B6;
                    bVar = bVar;
                }
                if (i6 == 1) {
                }
            }
            B6 = F0.AbstractC0925k.g(bVar);
        }
    }

    @Override // Y0.e
    public float o0(int i6) {
        return this.f2393C.o0(i6);
    }

    @Override // p161q0.g
    public void p1(p141o0.Q1 q6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f2393C.p1(q6, abstractC6984n0, f6, hVar, abstractC7019z0, i6);
    }

    @Override // Y0.e
    public float q0(float f6) {
        return this.f2393C.q0(f6);
    }

    public final void s(F0.InterfaceC0932s interfaceC0932s, p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        F0.AbstractC0914d0 abstractC0914d0H = F0.AbstractC0925k.h(interfaceC0932s, F0.AbstractC0918f0.a(4));
        abstractC0914d0H.o1().c0().k(interfaceC6993q0, Y0.u.d(abstractC0914d0H.a()), abstractC0914d0H, interfaceC0932s, c7053c);
    }

    @Override // Y0.n
    public float v0() {
        return this.f2393C.v0();
    }

    @Override // p161q0.g
    public void y0(long j6, long j10, long j11, float f6, int i6, p141o0.R1 r6, float f10, p141o0.AbstractC7019z0 abstractC7019z0, int i10) {
        this.f2393C.y0(j6, j10, j11, f6, i6, r6, f10, abstractC7019z0, i10);
    }
}
