package p028c8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends F8.l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c8.g.a f24456e = new c8.g.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p028c8.a f24457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p028c8.a f24458g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p028c8.f f24459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.h0 f24460d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1424e f24461D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p028c8.g f24462E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ F8.M f24463F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p028c8.a f24464G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O7.InterfaceC1424e interfaceC1424e, p028c8.g gVar, F8.M m6, p028c8.a aVar) {
            super(1);
            this.f24461D = interfaceC1424e;
            this.f24462E = gVar;
            this.f24463F = m6;
            this.f24464G = aVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M l(G8.g gVar) {
            p138n8.b bVarK;
            O7.InterfaceC1424e interfaceC1424eB;
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            O7.InterfaceC1424e interfaceC1424e = this.f24461D;
            if (!(interfaceC1424e instanceof O7.InterfaceC1424e)) {
                interfaceC1424e = null;
            }
            if (interfaceC1424e == null || (bVarK = p218v8.c.k(interfaceC1424e)) == null || (interfaceC1424eB = gVar.b(bVarK)) == null || p247y7.AbstractC7350t.b(interfaceC1424eB, this.f24461D)) {
                return null;
            }
            return (F8.M) this.f24462E.j(this.f24463F, interfaceC1424eB, this.f24464G).c();
        }
    }

    static {
        F8.p0 p0Var = F8.p0.COMMON;
        f24457f = p028c8.b.b(p0Var, false, true, null, 5, null).l(p028c8.c.FLEXIBLE_LOWER_BOUND);
        f24458g = p028c8.b.b(p0Var, false, true, null, 5, null).l(p028c8.c.FLEXIBLE_UPPER_BOUND);
    }

    public g(F8.h0 h0Var) {
        p028c8.f fVar = new p028c8.f();
        this.f24459c = fVar;
        this.f24460d = h0Var == null ? new F8.h0(fVar, null, 2, null) : h0Var;
    }

    public /* synthetic */ g(F8.h0 h0Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p087i7.u j(F8.M m6, O7.InterfaceC1424e interfaceC1424e, p028c8.a aVar) {
        java.lang.Boolean bool;
        F8.M mN = m6;
        if (m6.W0().x().isEmpty()) {
            bool = java.lang.Boolean.FALSE;
        } else {
            if (L7.g.c0(m6)) {
                F8.i0 i0Var = (F8.i0) m6.U0().get(0);
                F8.u0 u0VarA = i0Var.a();
                F8.E type = i0Var.getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                mN = F8.F.l(m6.V0(), m6.W0(), p097j7.AbstractC6879v.e(new F8.k0(u0VarA, k(type, aVar))), m6.X0(), null, 16, null);
            } else if (F8.G.a(m6)) {
                mN = H8.k.d(H8.j.f4512m0, m6.W0().toString());
            } else {
                p248y8.h hVarF0 = interfaceC1424e.f0(this);
                p247y7.AbstractC7350t.e(hVarF0, "getMemberScope(...)");
                F8.a0 a0VarV0 = m6.V0();
                F8.e0 e0VarP = interfaceC1424e.p();
                p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
                java.util.List listX = interfaceC1424e.p().x();
                p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                java.util.List<O7.f0> list = listX;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                for (O7.f0 f0Var : list) {
                    p028c8.f fVar = this.f24459c;
                    p247y7.AbstractC7350t.c(f0Var);
                    arrayList.add(F8.AbstractC0960v.b(fVar, f0Var, aVar, this.f24460d, null, 8, null));
                }
                mN = F8.F.n(a0VarV0, e0VarP, arrayList, m6.X0(), hVarF0, new c8.g.b(interfaceC1424e, this, mN, aVar));
                bool = java.lang.Boolean.TRUE;
            }
            bool = java.lang.Boolean.FALSE;
        }
        return p087i7.B.a(mN, bool);
    }

    private final F8.E k(F8.E e6, p028c8.a aVar) {
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW instanceof O7.f0) {
            return k(this.f24460d.c((O7.f0) interfaceC1427hW, aVar.j(true)), aVar);
        }
        if (!(interfaceC1427hW instanceof O7.InterfaceC1424e)) {
            throw new java.lang.IllegalStateException(("Unexpected declaration kind: " + interfaceC1427hW).toString());
        }
        O7.InterfaceC1427h interfaceC1427hW2 = F8.B.d(e6).W0().w();
        if (interfaceC1427hW2 instanceof O7.InterfaceC1424e) {
            p087i7.u uVarJ = j(F8.B.c(e6), (O7.InterfaceC1424e) interfaceC1427hW, f24457f);
            F8.M m6 = (F8.M) uVarJ.a();
            boolean zBooleanValue = ((java.lang.Boolean) uVarJ.b()).booleanValue();
            p087i7.u uVarJ2 = j(F8.B.d(e6), (O7.InterfaceC1424e) interfaceC1427hW2, f24458g);
            F8.M m10 = (F8.M) uVarJ2.a();
            return (zBooleanValue || ((java.lang.Boolean) uVarJ2.b()).booleanValue()) ? new p028c8.h(m6, m10) : F8.F.d(m6, m10);
        }
        throw new java.lang.IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC1427hW2 + "\" while for lower it's \"" + interfaceC1427hW + '\"').toString());
    }

    static /* synthetic */ F8.E l(p028c8.g gVar, F8.E e6, p028c8.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            aVar = new p028c8.a(F8.p0.COMMON, null, false, false, null, null, 62, null);
        }
        return gVar.k(e6, aVar);
    }

    @Override // F8.l0
    public boolean f() {
        return false;
    }

    @Override // F8.l0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public F8.k0 e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "key");
        return new F8.k0(l(this, e6, null, 2, null));
    }
}
