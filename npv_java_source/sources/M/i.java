package M;

/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.compose.ui.d.c implements F0.E, F0.InterfaceC0932s, F0.z0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.lang.String f6520P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private M0.P f6521Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private R0.AbstractC1494h.b f6522R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f6523S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f6524T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f6525U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f6526V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p141o0.B0 f6527W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private java.util.Map f6528X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private M.f f6529Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private p237x7.l f6530Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private M.i.a f6531a0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f6532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f6533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private M.f f6535d;

        public a(java.lang.String str, java.lang.String str2, boolean z6, M.f fVar) {
            this.f6532a = str;
            this.f6533b = str2;
            this.f6534c = z6;
            this.f6535d = fVar;
        }

        public /* synthetic */ a(java.lang.String str, java.lang.String str2, boolean z6, M.f fVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(str, str2, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? null : fVar);
        }

        public final M.f a() {
            return this.f6535d;
        }

        public final java.lang.String b() {
            return this.f6533b;
        }

        public final boolean c() {
            return this.f6534c;
        }

        public final void d(M.f fVar) {
            this.f6535d = fVar;
        }

        public final void e(boolean z6) {
            this.f6534c = z6;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M.i.a)) {
                return false;
            }
            M.i.a aVar = (M.i.a) obj;
            return p247y7.AbstractC7350t.b(this.f6532a, aVar.f6532a) && p247y7.AbstractC7350t.b(this.f6533b, aVar.f6533b) && this.f6534c == aVar.f6534c && p247y7.AbstractC7350t.b(this.f6535d, aVar.f6535d);
        }

        public final void f(java.lang.String str) {
            this.f6533b = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.f6532a.hashCode() * 31) + this.f6533b.hashCode()) * 31) + p190t.h.a(this.f6534c)) * 31;
            M.f fVar = this.f6535d;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public java.lang.String toString() {
            return "TextSubstitution(layoutCache=" + this.f6535d + ", isShowingSubstitution=" + this.f6534c + ')';
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.util.List list) {
            M.f fVarC2 = M.i.this.c2();
            M0.P p6 = M.i.this.f6521Q;
            p141o0.B0 b6 = M.i.this.f6527W;
            M0.K kO = fVarC2.o(p6.J((16777214 & 1) != 0 ? p141o0.C7016y0.f52264b.g() : b6 != null ? b6.a() : p141o0.C7016y0.f52264b.g(), (16777214 & 2) != 0 ? Y0.x.f16237b.a() : 0L, (16777214 & 4) != 0 ? null : null, (16777214 & 8) != 0 ? null : null, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : null, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? Y0.x.f16237b.a() : 0L, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? p141o0.C7016y0.f52264b.g() : 0L, (16777214 & 4096) != 0 ? null : null, (16777214 & 8192) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? X0.j.f15622b.g() : 0, (16777214 & 65536) != 0 ? X0.l.f15636b.f() : 0, (16777214 & 131072) != 0 ? Y0.x.f16237b.a() : 0L, (16777214 & 262144) != 0 ? null : null, (16777214 & 524288) != 0 ? null : null, (16777214 & 1048576) != 0 ? X0.f.f15584b.b() : 0, (16777214 & 2097152) != 0 ? X0.e.f15579b.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null));
            if (kO != null) {
                list.add(kO);
            } else {
                kO = null;
            }
            return java.lang.Boolean.valueOf(kO != null);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(M0.C1332d c1332d) {
            M.i.this.f2(c1332d.i());
            M.i.this.e2();
            return java.lang.Boolean.TRUE;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        d() {
            super(1);
        }

        public final java.lang.Boolean a(boolean z6) {
            if (M.i.this.f6531a0 == null) {
                return java.lang.Boolean.FALSE;
            }
            M.i.a aVar = M.i.this.f6531a0;
            if (aVar != null) {
                aVar.e(z6);
            }
            M.i.this.e2();
            return java.lang.Boolean.TRUE;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Boolean) obj).booleanValue());
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            M.i.this.a2();
            M.i.this.e2();
            return java.lang.Boolean.TRUE;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f6540D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D0.X x6) {
            super(1);
            this.f6540D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f6540D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private i(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, p141o0.B0 b6) {
        this.f6520P = str;
        this.f6521Q = p6;
        this.f6522R = bVar;
        this.f6523S = i6;
        this.f6524T = z6;
        this.f6525U = i10;
        this.f6526V = i11;
        this.f6527W = b6;
    }

    public /* synthetic */ i(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, p141o0.B0 b6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, p6, bVar, i6, z6, i10, i11, b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        this.f6531a0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M.f c2() {
        if (this.f6529Y == null) {
            this.f6529Y = new M.f(this.f6520P, this.f6521Q, this.f6522R, this.f6523S, this.f6524T, this.f6525U, this.f6526V, null);
        }
        M.f fVar = this.f6529Y;
        p247y7.AbstractC7350t.c(fVar);
        return fVar;
    }

    private final M.f d2(Y0.e eVar) {
        M.f fVarA;
        M.i.a aVar = this.f6531a0;
        if (aVar != null && aVar.c() && (fVarA = aVar.a()) != null) {
            fVarA.m(eVar);
            return fVarA;
        }
        M.f fVarC2 = c2();
        fVarC2.m(eVar);
        return fVarC2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        F0.A0.b(this);
        F0.H.b(this);
        F0.AbstractC0933t.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f2(java.lang.String str) {
        p087i7.M m6;
        M.i.a aVar = this.f6531a0;
        if (aVar == null) {
            M.i.a aVar2 = new M.i.a(this.f6520P, str, false, null, 12, null);
            M.f fVar = new M.f(str, this.f6521Q, this.f6522R, this.f6523S, this.f6524T, this.f6525U, this.f6526V, null);
            fVar.m(c2().a());
            aVar2.d(fVar);
            this.f6531a0 = aVar2;
            return true;
        }
        if (p247y7.AbstractC7350t.b(str, aVar.b())) {
            return false;
        }
        aVar.f(str);
        M.f fVarA = aVar.a();
        if (fVarA != null) {
            fVarA.p(str, this.f6521Q, this.f6522R, this.f6523S, this.f6524T, this.f6525U, this.f6526V);
            m6 = p087i7.M.f46721a;
        } else {
            m6 = null;
        }
        return m6 != null;
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return d2(interfaceC0896o).k(interfaceC0896o.getLayoutDirection());
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return d2(interfaceC0896o).j(interfaceC0896o.getLayoutDirection());
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        p237x7.l bVar = this.f6530Z;
        if (bVar == null) {
            bVar = new M.i.b();
            this.f6530Z = bVar;
        }
        K0.u.c0(wVar, new M0.C1332d(this.f6520P, null, null, 6, null));
        M.i.a aVar = this.f6531a0;
        if (aVar != null) {
            K0.u.b0(wVar, aVar.c());
            K0.u.g0(wVar, new M0.C1332d(aVar.b(), null, null, 6, null));
        }
        K0.u.i0(wVar, null, new M.i.c(), 1, null);
        K0.u.o0(wVar, null, new M.i.d(), 1, null);
        K0.u.d(wVar, null, new M.i.e(), 1, null);
        K0.u.q(wVar, null, bVar, 1, null);
    }

    public final void b2(boolean z6, boolean z10, boolean z11) {
        if (z10 || z11) {
            c2().p(this.f6520P, this.f6521Q, this.f6522R, this.f6523S, this.f6524T, this.f6525U, this.f6526V);
        }
        if (A1()) {
            if (z10 || (z6 && this.f6530Z != null)) {
                F0.A0.b(this);
            }
            if (z10 || z11) {
                F0.H.b(this);
                F0.AbstractC0933t.a(this);
            }
            if (z6) {
                F0.AbstractC0933t.a(this);
            }
        }
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        M.f fVarD2 = d2(m6);
        boolean zH = fVarD2.h(j6, m6.getLayoutDirection());
        fVarD2.d();
        M0.InterfaceC1344p interfaceC1344pE = fVarD2.e();
        p247y7.AbstractC7350t.c(interfaceC1344pE);
        long jC = fVarD2.c();
        if (zH) {
            F0.H.a(this);
            java.util.Map linkedHashMap = this.f6528X;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
            }
            linkedHashMap.put(D0.AbstractC0883b.a(), java.lang.Integer.valueOf(java.lang.Math.round(interfaceC1344pE.l())));
            linkedHashMap.put(D0.AbstractC0883b.b(), java.lang.Integer.valueOf(java.lang.Math.round(interfaceC1344pE.h())));
            this.f6528X = linkedHashMap;
        }
        D0.X xU = g6.U(Y0.C1859b.f16201b.b(Y0.t.g(jC), Y0.t.g(jC), Y0.t.f(jC), Y0.t.f(jC)));
        int iG = Y0.t.g(jC);
        int iF = Y0.t.f(jC);
        java.util.Map map = this.f6528X;
        p247y7.AbstractC7350t.c(map);
        return m6.f0(iG, iF, map, new M.i.f(xU));
    }

    public final boolean g2(p141o0.B0 b6, M0.P p6) {
        boolean z6 = !p247y7.AbstractC7350t.b(b6, this.f6527W);
        this.f6527W = b6;
        return z6 || !p6.F(this.f6521Q);
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    public final boolean h2(M0.P p6, int i6, int i10, boolean z6, R0.AbstractC1494h.b bVar, int i11) {
        boolean z10 = !this.f6521Q.G(p6);
        this.f6521Q = p6;
        if (this.f6526V != i6) {
            this.f6526V = i6;
            z10 = true;
        }
        if (this.f6525U != i10) {
            this.f6525U = i10;
            z10 = true;
        }
        if (this.f6524T != z6) {
            this.f6524T = z6;
            z10 = true;
        }
        if (!p247y7.AbstractC7350t.b(this.f6522R, bVar)) {
            this.f6522R = bVar;
            z10 = true;
        }
        if (X0.u.e(this.f6523S, i11)) {
            return z10;
        }
        this.f6523S = i11;
        return true;
    }

    public final boolean i2(java.lang.String str) {
        if (p247y7.AbstractC7350t.b(this.f6520P, str)) {
            return false;
        }
        this.f6520P = str;
        a2();
        return true;
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return d2(interfaceC0896o).f(i6, interfaceC0896o.getLayoutDirection());
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }

    @Override // F0.InterfaceC0932s
    public /* synthetic */ void m0() {
        F0.r.a(this);
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return d2(interfaceC0896o).f(i6, interfaceC0896o.getLayoutDirection());
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        if (A1()) {
            M.f fVarD2 = d2(cVar);
            M0.InterfaceC1344p interfaceC1344pE = fVarD2.e();
            if (interfaceC1344pE == null) {
                throw new java.lang.IllegalArgumentException(("no paragraph (layoutCache=" + this.f6529Y + ", textSubstitution=" + this.f6531a0 + ')').toString());
            }
            p141o0.InterfaceC6993q0 interfaceC6993q0H = cVar.F0().h();
            boolean zB = fVarD2.b();
            if (zB) {
                float fG = Y0.t.g(fVarD2.c());
                float f6 = Y0.t.f(fVarD2.c());
                interfaceC6993q0H.m();
                p141o0.AbstractC6990p0.d(interfaceC6993q0H, 0.0f, 0.0f, fG, f6, 0, 16, null);
            }
            try {
                X0.k kVarA = this.f6521Q.A();
                if (kVarA == null) {
                    kVarA = X0.k.f15631b.c();
                }
                X0.k kVar = kVarA;
                p141o0.c2 c2VarX = this.f6521Q.x();
                if (c2VarX == null) {
                    c2VarX = p141o0.c2.f52187d.a();
                }
                p141o0.c2 c2Var = c2VarX;
                p161q0.h hVarI = this.f6521Q.i();
                if (hVarI == null) {
                    hVarI = p161q0.l.f52928a;
                }
                p161q0.h hVar = hVarI;
                p141o0.AbstractC6984n0 abstractC6984n0G = this.f6521Q.g();
                if (abstractC6984n0G != null) {
                    M0.AbstractC1343o.b(interfaceC1344pE, interfaceC6993q0H, abstractC6984n0G, this.f6521Q.d(), c2Var, kVar, hVar, 0, 64, null);
                } else {
                    p141o0.B0 b6 = this.f6527W;
                    long jA = b6 != null ? b6.a() : p141o0.C7016y0.f52264b.g();
                    if (jA == 16) {
                        jA = this.f6521Q.h() != 16 ? this.f6521Q.h() : p141o0.C7016y0.f52264b.a();
                    }
                    M0.AbstractC1343o.a(interfaceC1344pE, interfaceC6993q0H, jA, c2Var, kVar, hVar, 0, 32, null);
                }
            } finally {
                if (zB) {
                    interfaceC6993q0H.s();
                }
            }
        }
    }
}
