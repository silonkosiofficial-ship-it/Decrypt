package F0;

/* JADX INFO: renamed from: F0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0911c extends androidx.compose.ui.d.c implements F0.E, F0.InterfaceC0932s, F0.z0, F0.v0, E0.i, E0.l, F0.r0, F0.C, F0.InterfaceC0934u, p121m0.b, p121m0.j, p121m0.m, F0.p0, p111l0.b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private androidx.compose.ui.d.b f2564P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f2565Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private E0.a f2566R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private java.util.HashSet f2567S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private D0.InterfaceC0900t f2568T;

    /* JADX INFO: renamed from: F0.c$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final void a() {
            F0.C0911c.this.Z1();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: F0.c$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.d.b bVarT1 = F0.C0911c.this.T1();
            p247y7.AbstractC7350t.d(bVarT1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((E0.d) bVarT1).h(F0.C0911c.this);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public C0911c(androidx.compose.ui.d.b bVar) {
        N1(F0.AbstractC0920g0.f(bVar));
        this.f2564P = bVar;
        this.f2565Q = true;
        this.f2567S = new java.util.HashSet();
    }

    private final void V1(boolean z6) {
        if (!A1()) {
            C0.a.b("initializeModifier called on unattached node");
        }
        androidx.compose.ui.d.b bVar = this.f2564P;
        if ((F0.AbstractC0918f0.a(32) & v1()) != 0) {
            if (bVar instanceof E0.d) {
                R1(new F0.C0911c.a());
            }
            if (bVar instanceof E0.k) {
                a2((E0.k) bVar);
            }
        }
        if ((F0.AbstractC0918f0.a(4) & v1()) != 0 && !z6) {
            F0.H.a(this);
        }
        if ((F0.AbstractC0918f0.a(2) & v1()) != 0) {
            if (F0.AbstractC0913d.d(this)) {
                F0.AbstractC0914d0 abstractC0914d0S1 = s1();
                p247y7.AbstractC7350t.c(abstractC0914d0S1);
                ((F0.F) abstractC0914d0S1).l3(this);
                abstractC0914d0S1.D2();
            }
            if (!z6) {
                F0.H.a(this);
                F0.AbstractC0925k.m(this).F0();
            }
        }
        if (bVar instanceof D0.a0) {
            ((D0.a0) bVar).a(F0.AbstractC0925k.m(this));
        }
        F0.AbstractC0918f0.a(128);
        v1();
        if ((F0.AbstractC0918f0.a(256) & v1()) != 0 && (bVar instanceof D0.S) && F0.AbstractC0913d.d(this)) {
            F0.AbstractC0925k.m(this).F0();
        }
        if ((F0.AbstractC0918f0.a(16) & v1()) != 0 && (bVar instanceof p251z0.I)) {
            ((p251z0.I) bVar).e().f(s1());
        }
        if ((F0.AbstractC0918f0.a(8) & v1()) != 0) {
            F0.AbstractC0925k.n(this).t();
        }
    }

    private final void Y1() {
        if (!A1()) {
            C0.a.b("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.d.b bVar = this.f2564P;
        if ((F0.AbstractC0918f0.a(32) & v1()) != 0) {
            if (bVar instanceof E0.k) {
                F0.AbstractC0925k.n(this).getModifierLocalManager().d(this, ((E0.k) bVar).getKey());
            }
            if (bVar instanceof E0.d) {
                ((E0.d) bVar).h(F0.AbstractC0913d.f2573a);
            }
        }
        if ((F0.AbstractC0918f0.a(8) & v1()) != 0) {
            F0.AbstractC0925k.n(this).t();
        }
    }

    private final void a2(E0.k kVar) {
        E0.a aVar = this.f2566R;
        if (aVar != null && aVar.a(kVar.getKey())) {
            aVar.c(kVar);
            F0.AbstractC0925k.n(this).getModifierLocalManager().f(this, kVar.getKey());
        } else {
            this.f2566R = new E0.a(kVar);
            if (F0.AbstractC0913d.d(this)) {
                F0.AbstractC0925k.n(this).getModifierLocalManager().a(this, kVar.getKey());
            }
        }
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.A) bVar).C(interfaceC0896o, interfaceC0895n, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // E0.l
    public java.lang.Object D0(E0.c cVar) {
        F0.C0910b0 c0910b0K0;
        this.f2567S.add(cVar);
        int iA = F0.AbstractC0918f0.a(32);
        if (!E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = E0().x1();
        F0.J jM = F0.AbstractC0925k.m(this);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        ?? G10 = cVarX1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            if (G10 instanceof E0.i) {
                                E0.i iVar = (E0.i) G10;
                                if (iVar.s0().a(cVar)) {
                                    return iVar.s0().b(cVar);
                                }
                            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                int i6 = 0;
                                G10 = G10;
                                bVar = bVar;
                                while (cVarU1 != null) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            bVar = bVar;
                                            G10 = cVarU1;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (G10 != 0) {
                                                bVar.d(G10);
                                                G10 = 0;
                                            }
                                            bVar.d(cVarU1);
                                        }
                                    }
                                    cVarU1 = cVarU1.r1();
                                    G10 = G10;
                                    bVar = bVar;
                                }
                                if (i6 == 1) {
                                }
                            }
                            G10 = F0.AbstractC0925k.g(bVar);
                        }
                    }
                    cVarX1 = cVarX1.x1();
                }
            }
            jM = jM.o0();
            cVarX1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
        return cVar.a().b();
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        V1(true);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        Y1();
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.A) bVar).F(interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.r0
    public java.lang.Object G(Y0.e eVar, java.lang.Object obj) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((D0.U) bVar).G(eVar, obj);
    }

    @Override // F0.C
    public void M(long j6) {
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        K0.k kVarI = ((K0.m) bVar).i();
        p247y7.AbstractC7350t.d(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((K0.k) wVar).e(kVarI);
    }

    @Override // F0.p0
    public boolean R() {
        return A1();
    }

    @Override // p121m0.b
    public void R0(p121m0.n nVar) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        C0.a.b("onFocusEvent called on wrong node");
        androidx.appcompat.app.D.a(bVar);
        throw null;
    }

    public final androidx.compose.ui.d.b T1() {
        return this.f2564P;
    }

    public final java.util.HashSet U1() {
        return this.f2567S;
    }

    public final void W1() {
        this.f2565Q = true;
        F0.AbstractC0933t.a(this);
    }

    public final void X1(androidx.compose.ui.d.b bVar) {
        if (A1()) {
            Y1();
        }
        this.f2564P = bVar;
        N1(F0.AbstractC0920g0.f(bVar));
        if (A1()) {
            V1(false);
        }
    }

    @Override // p121m0.j
    public void Y(androidx.compose.ui.focus.j jVar) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        C0.a.b("applyFocusProperties called on wrong node");
        androidx.appcompat.app.D.a(bVar);
        new p121m0.g(jVar);
        throw null;
    }

    @Override // F0.v0
    public boolean Y0() {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((p251z0.I) bVar).e().c();
    }

    public final void Z1() {
        if (A1()) {
            this.f2567S.clear();
            F0.AbstractC0925k.n(this).getSnapshotObserver().i(this, F0.AbstractC0913d.f2575c, new F0.C0911c.b());
        }
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.A) bVar).f(m6, g6, j6);
    }

    @Override // F0.v0
    public /* synthetic */ void f1() {
        F0.u0.c(this);
    }

    @Override // F0.v0
    public void g0() {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((p251z0.I) bVar).e().d();
    }

    @Override // p111l0.b
    public Y0.e getDensity() {
        return F0.AbstractC0925k.m(this).K();
    }

    @Override // p111l0.b
    public Y0.v getLayoutDirection() {
        return F0.AbstractC0925k.m(this).getLayoutDirection();
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    @Override // p111l0.b
    public long i() {
        return Y0.u.d(F0.AbstractC0925k.h(this, F0.AbstractC0918f0.a(128)).a());
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.A) bVar).k(interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }

    @Override // F0.InterfaceC0932s
    public void m0() {
        this.f2565Q = true;
        F0.AbstractC0933t.a(this);
    }

    @Override // F0.C
    public void m1(D0.InterfaceC0900t interfaceC0900t) {
        this.f2568T = interfaceC0900t;
    }

    @Override // F0.v0
    public boolean n0() {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((p251z0.I) bVar).e().a();
    }

    @Override // F0.InterfaceC0934u
    public void s(D0.InterfaceC0900t interfaceC0900t) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((D0.S) bVar).s(interfaceC0900t);
    }

    @Override // E0.i
    public E0.g s0() {
        E0.a aVar = this.f2566R;
        return aVar != null ? aVar : E0.j.a();
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.A) bVar).t(interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.v0
    public /* synthetic */ void t0() {
        F0.u0.b(this);
    }

    public java.lang.String toString() {
        return this.f2564P.toString();
    }

    @Override // F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((p251z0.I) bVar).e().e(c7380p, rVar, j6);
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        androidx.compose.ui.d.b bVar = this.f2564P;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((p111l0.g) bVar).y(cVar);
    }
}
