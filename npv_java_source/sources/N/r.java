package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.C1360j f7449D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f7450E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f7451F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ N.w f7452G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p087i7.InterfaceC6668n f7453H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N.C1360j c1360j, int i6, int i10, N.w wVar, p087i7.InterfaceC6668n interfaceC6668n) {
            super(0);
            this.f7449D = c1360j;
            this.f7450E = i6;
            this.f7451F = i10;
            this.f7452G = wVar;
            this.f7453H = interfaceC6668n;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N.C1361k.a b() {
            return N.r.k(this.f7449D, N.r.m(this.f7453H), this.f7450E, this.f7451F, this.f7452G.b(), this.f7452G.i() == N.EnumC1355e.CROSSED);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.C1360j f7454D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f7455E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N.C1360j c1360j, int i6) {
            super(0);
            this.f7454D = c1360j;
            this.f7455E = i6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer b() {
            return java.lang.Integer.valueOf(this.f7454D.k().q(this.f7455E));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N.C1361k e(N.w wVar, N.InterfaceC1353c interfaceC1353c) {
        boolean z6 = wVar.i() == N.EnumC1355e.CROSSED;
        return new N.C1361k(f(wVar.k(), z6, true, wVar.l(), interfaceC1353c), f(wVar.h(), z6, false, wVar.g(), interfaceC1353c), z6);
    }

    private static final N.C1361k.a f(N.C1360j c1360j, boolean z6, boolean z10, int i6, N.InterfaceC1353c interfaceC1353c) {
        int iG = z10 ? c1360j.g() : c1360j.e();
        if (i6 != c1360j.i()) {
            return c1360j.a(iG);
        }
        long jA = interfaceC1353c.a(c1360j, iG);
        return c1360j.a(z6 ^ z10 ? M0.N.n(jA) : M0.N.i(jA));
    }

    private static final N.C1361k.a g(N.C1361k.a aVar, N.C1360j c1360j, int i6) {
        return N.C1361k.a.b(aVar, c1360j.k().c(i6), i6, 0L, 4, null);
    }

    public static final N.C1361k h(N.C1361k c1361k, N.w wVar) {
        if (N.x.d(c1361k, wVar)) {
            return (wVar.a() > 1 || wVar.d() == null || wVar.c().c().length() == 0) ? c1361k : i(c1361k, wVar);
        }
        return c1361k;
    }

    private static final N.C1361k i(N.C1361k c1361k, N.w wVar) {
        N.C1361k.a aVarG;
        int i6;
        java.lang.Object obj;
        N.C1361k.a aVarG2;
        N.C1361k.a aVarG3;
        int i10;
        java.lang.Object obj2;
        N.C1361k.a aVarG4;
        boolean z6;
        N.C1360j c1360jC = wVar.c();
        java.lang.String strC = c1360jC.c();
        int iG = c1360jC.g();
        int length = strC.length();
        if (iG == 0) {
            int iA = H.A.a(strC, 0);
            if (wVar.b()) {
                aVarG4 = g(c1361k.e(), c1360jC, iA);
                i10 = 2;
                obj2 = null;
                aVarG3 = null;
                z6 = true;
            } else {
                aVarG3 = g(c1361k.c(), c1360jC, iA);
                i10 = 1;
                obj2 = null;
                aVarG4 = null;
                z6 = false;
            }
        } else {
            if (iG != length) {
                N.C1361k c1361kD = wVar.d();
                boolean z10 = c1361kD != null && c1361kD.d();
                int iB = wVar.b() ^ z10 ? H.A.b(strC, iG) : H.A.a(strC, iG);
                if (wVar.b()) {
                    aVarG2 = g(c1361k.e(), c1360jC, iB);
                    i6 = 2;
                    obj = null;
                    aVarG = null;
                } else {
                    aVarG = g(c1361k.c(), c1360jC, iB);
                    i6 = 1;
                    obj = null;
                    aVarG2 = null;
                }
                return N.C1361k.b(c1361k, aVarG2, aVarG, z10, i6, obj);
            }
            int iB2 = H.A.b(strC, length);
            if (wVar.b()) {
                aVarG4 = g(c1361k.e(), c1360jC, iB2);
                i10 = 2;
                obj2 = null;
                aVarG3 = null;
                z6 = false;
            } else {
                aVarG3 = g(c1361k.c(), c1360jC, iB2);
                i10 = 1;
                obj2 = null;
                aVarG4 = null;
                z6 = true;
            }
        }
        return N.C1361k.b(c1361k, aVarG4, aVarG3, z6, i10, obj2);
    }

    private static final boolean j(N.C1360j c1360j, int i6, boolean z6) {
        if (c1360j.f() == -1) {
            return true;
        }
        if (i6 == c1360j.f()) {
            return false;
        }
        boolean z10 = z6 ^ (c1360j.d() == N.EnumC1355e.CROSSED);
        int iF = c1360j.f();
        if (z10) {
            if (i6 < iF) {
                return true;
            }
        } else if (i6 > iF) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N.C1361k.a k(N.C1360j c1360j, int i6, int i10, int i11, boolean z6, boolean z10) {
        int iU;
        int iP;
        long jC = c1360j.k().C(i10);
        if (c1360j.k().q(M0.N.n(jC)) == i6) {
            iU = M0.N.n(jC);
        } else {
            iU = i6 >= c1360j.k().n() ? c1360j.k().u(c1360j.k().n() - 1) : c1360j.k().u(i6);
        }
        if (c1360j.k().q(M0.N.i(jC)) == i6) {
            iP = M0.N.i(jC);
        } else {
            iP = i6 >= c1360j.k().n() ? M0.K.p(c1360j.k(), c1360j.k().n() - 1, false, 2, null) : M0.K.p(c1360j.k(), i6, false, 2, null);
        }
        if (iU == i11) {
            return c1360j.a(iP);
        }
        if (iP == i11) {
            return c1360j.a(iU);
        }
        if (!(z6 ^ z10) ? i10 >= iU : i10 > iP) {
            iU = iP;
        }
        return c1360j.a(iU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N.C1361k.a l(N.w wVar, N.C1360j c1360j, N.C1361k.a aVar) {
        int iG = wVar.b() ? c1360j.g() : c1360j.e();
        if ((wVar.b() ? wVar.l() : wVar.g()) != c1360j.i()) {
            return c1360j.a(iG);
        }
        p087i7.r rVar = p087i7.r.NONE;
        p087i7.InterfaceC6668n interfaceC6668nA = p087i7.AbstractC6669o.a(rVar, new N.r.b(c1360j, iG));
        p087i7.InterfaceC6668n interfaceC6668nA2 = p087i7.AbstractC6669o.a(rVar, new N.r.a(c1360j, iG, wVar.b() ? c1360j.e() : c1360j.g(), wVar, interfaceC6668nA));
        if (c1360j.h() != aVar.d()) {
            return n(interfaceC6668nA2);
        }
        int iF = c1360j.f();
        if (iG == iF) {
            return aVar;
        }
        if (m(interfaceC6668nA) != c1360j.k().q(iF)) {
            return n(interfaceC6668nA2);
        }
        int iC = aVar.c();
        long jC = c1360j.k().C(iC);
        if (j(c1360j, iG, wVar.b())) {
            return (iC == M0.N.n(jC) || iC == M0.N.i(jC)) ? n(interfaceC6668nA2) : c1360j.a(iG);
        }
        return c1360j.a(iG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(p087i7.InterfaceC6668n interfaceC6668n) {
        return ((java.lang.Number) interfaceC6668n.getValue()).intValue();
    }

    private static final N.C1361k.a n(p087i7.InterfaceC6668n interfaceC6668n) {
        return (N.C1361k.a) interfaceC6668n.getValue();
    }
}
