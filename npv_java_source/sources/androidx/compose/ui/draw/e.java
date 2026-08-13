package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
final class e extends androidx.compose.ui.d.c implements F0.E, F0.InterfaceC0932s {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p191t0.b f19624P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19625Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p071h0.c f19626R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private D0.InterfaceC0889h f19627S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f19628T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f19629U;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19630D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6) {
            super(1);
            this.f19630D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.l(aVar, this.f19630D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public e(p191t0.b bVar, boolean z6, p071h0.c cVar, D0.InterfaceC0889h interfaceC0889h, float f6, p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f19624P = bVar;
        this.f19625Q = z6;
        this.f19626R = cVar;
        this.f19627S = interfaceC0889h;
        this.f19628T = f6;
        this.f19629U = abstractC7019z0;
    }

    private final long T1(long j6) {
        if (!W1()) {
            return j6;
        }
        long jA = p131n0.n.a(!Y1(this.f19624P.h()) ? p131n0.m.i(j6) : p131n0.m.i(this.f19624P.h()), !X1(this.f19624P.h()) ? p131n0.m.g(j6) : p131n0.m.g(this.f19624P.h()));
        return (p131n0.m.i(j6) == 0.0f || p131n0.m.g(j6) == 0.0f) ? p131n0.m.f51333b.b() : D0.f0.b(jA, this.f19627S.a(jA, j6));
    }

    private final boolean W1() {
        return this.f19625Q && this.f19624P.h() != 9205357640488583168L;
    }

    private final boolean X1(long j6) {
        if (!p131n0.m.f(j6, p131n0.m.f51333b.a())) {
            float fG = p131n0.m.g(j6);
            if (!java.lang.Float.isInfinite(fG) && !java.lang.Float.isNaN(fG)) {
                return true;
            }
        }
        return false;
    }

    private final boolean Y1(long j6) {
        if (!p131n0.m.f(j6, p131n0.m.f51333b.a())) {
            float fI = p131n0.m.i(j6);
            if (!java.lang.Float.isInfinite(fI) && !java.lang.Float.isNaN(fI)) {
                return true;
            }
        }
        return false;
    }

    private final long Z1(long j6) {
        int i6;
        int iH;
        boolean z6 = false;
        boolean z10 = Y0.C1859b.h(j6) && Y0.C1859b.g(j6);
        if (Y0.C1859b.j(j6) && Y0.C1859b.i(j6)) {
            z6 = true;
        }
        if ((W1() || !z10) && !z6) {
            long jH = this.f19624P.h();
            long jT1 = T1(p131n0.n.a(Y0.c.i(j6, Y1(jH) ? java.lang.Math.round(p131n0.m.i(jH)) : Y0.C1859b.n(j6)), Y0.c.h(j6, X1(jH) ? java.lang.Math.round(p131n0.m.g(jH)) : Y0.C1859b.m(j6))));
            i6 = Y0.c.i(j6, java.lang.Math.round(p131n0.m.i(jT1)));
            iH = Y0.c.h(j6, java.lang.Math.round(p131n0.m.g(jT1)));
        } else {
            i6 = Y0.C1859b.l(j6);
            iH = Y0.C1859b.k(j6);
        }
        return Y0.C1859b.d(j6, i6, 0, iH, 0, 10, null);
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        if (!W1()) {
            return interfaceC0895n.S(i6);
        }
        long jZ1 = Z1(Y0.c.b(0, 0, 0, i6, 7, null));
        return java.lang.Math.max(Y0.C1859b.n(jZ1), interfaceC0895n.S(i6));
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        if (!W1()) {
            return interfaceC0895n.T(i6);
        }
        long jZ1 = Z1(Y0.c.b(0, 0, 0, i6, 7, null));
        return java.lang.Math.max(Y0.C1859b.n(jZ1), interfaceC0895n.T(i6));
    }

    public final p191t0.b U1() {
        return this.f19624P;
    }

    public final boolean V1() {
        return this.f19625Q;
    }

    public final void a2(p071h0.c cVar) {
        this.f19626R = cVar;
    }

    public final void b(float f6) {
        this.f19628T = f6;
    }

    public final void b2(p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f19629U = abstractC7019z0;
    }

    public final void c2(D0.InterfaceC0889h interfaceC0889h) {
        this.f19627S = interfaceC0889h;
    }

    public final void d2(p191t0.b bVar) {
        this.f19624P = bVar;
    }

    public final void e2(boolean z6) {
        this.f19625Q = z6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(Z1(j6));
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.ui.draw.e.a(xU), 4, null);
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        if (!W1()) {
            return interfaceC0895n.t(i6);
        }
        long jZ1 = Z1(Y0.c.b(0, i6, 0, 0, 13, null));
        return java.lang.Math.max(Y0.C1859b.m(jZ1), interfaceC0895n.t(i6));
    }

    @Override // F0.InterfaceC0932s
    public /* synthetic */ void m0() {
        F0.r.a(this);
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        if (!W1()) {
            return interfaceC0895n.n0(i6);
        }
        long jZ1 = Z1(Y0.c.b(0, i6, 0, 0, 13, null));
        return java.lang.Math.max(Y0.C1859b.m(jZ1), interfaceC0895n.n0(i6));
    }

    public java.lang.String toString() {
        return "PainterModifier(painter=" + this.f19624P + ", sizeToIntrinsics=" + this.f19625Q + ", alignment=" + this.f19626R + ", alpha=" + this.f19628T + ", colorFilter=" + this.f19629U + ')';
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        long jH = this.f19624P.h();
        float fI = Y1(jH) ? p131n0.m.i(jH) : p131n0.m.i(cVar.i());
        if (!X1(jH)) {
            jH = cVar.i();
        }
        long jA = p131n0.n.a(fI, p131n0.m.g(jH));
        long jB = (p131n0.m.i(cVar.i()) == 0.0f || p131n0.m.g(cVar.i()) == 0.0f) ? p131n0.m.f51333b.b() : D0.f0.b(jA, this.f19627S.a(jA, cVar.i()));
        long jA2 = this.f19626R.a(Y0.u.a(java.lang.Math.round(p131n0.m.i(jB)), java.lang.Math.round(p131n0.m.g(jB))), Y0.u.a(java.lang.Math.round(p131n0.m.i(cVar.i())), java.lang.Math.round(p131n0.m.g(cVar.i()))), cVar.getLayoutDirection());
        float fH = Y0.p.h(jA2);
        float fI2 = Y0.p.i(jA2);
        cVar.F0().c().d(fH, fI2);
        try {
            this.f19624P.g(cVar, jB, this.f19628T, this.f19629U);
            cVar.F0().c().d(-fH, -fI2);
            cVar.l1();
        } catch (java.lang.Throwable th) {
            cVar.F0().c().d(-fH, -fI2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return false;
    }
}
