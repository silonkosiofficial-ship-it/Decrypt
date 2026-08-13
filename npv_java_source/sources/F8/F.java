package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.F f2828a = new F8.F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p237x7.l f2829b = F8.F.a.f2830D;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F8.F.a f2830D = new F8.F.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void l(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F8.M f2831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F8.e0 f2832b;

        public b(F8.M m6, F8.e0 e0Var) {
            this.f2831a = m6;
            this.f2832b = e0Var;
        }

        public final F8.M a() {
            return this.f2831a;
        }

        public final F8.e0 b() {
            return this.f2832b;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F8.e0 f2833D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.List f2834E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ F8.a0 f2835F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f2836G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F8.e0 e0Var, java.util.List list, F8.a0 a0Var, boolean z6) {
            super(1);
            this.f2833D = e0Var;
            this.f2834E = list;
            this.f2835F = a0Var;
            this.f2836G = z6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M l(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "refiner");
            F8.F.b bVarF = F8.F.f2828a.f(this.f2833D, gVar, this.f2834E);
            if (bVarF == null) {
                return null;
            }
            F8.M mA = bVarF.a();
            if (mA != null) {
                return mA;
            }
            F8.a0 a0Var = this.f2835F;
            F8.e0 e0VarB = bVarF.b();
            p247y7.AbstractC7350t.c(e0VarB);
            return F8.F.j(a0Var, e0VarB, this.f2834E, this.f2836G, gVar);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F8.e0 f2837D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.List f2838E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ F8.a0 f2839F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f2840G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p248y8.h f2841H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(F8.e0 e0Var, java.util.List list, F8.a0 a0Var, boolean z6, p248y8.h hVar) {
            super(1);
            this.f2837D = e0Var;
            this.f2838E = list;
            this.f2839F = a0Var;
            this.f2840G = z6;
            this.f2841H = hVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M l(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            F8.F.b bVarF = F8.F.f2828a.f(this.f2837D, gVar, this.f2838E);
            if (bVarF == null) {
                return null;
            }
            F8.M mA = bVarF.a();
            if (mA != null) {
                return mA;
            }
            F8.a0 a0Var = this.f2839F;
            F8.e0 e0VarB = bVarF.b();
            p247y7.AbstractC7350t.c(e0VarB);
            return F8.F.m(a0Var, e0VarB, this.f2838E, this.f2840G, this.f2841H);
        }
    }

    private F() {
    }

    public static final F8.M b(O7.e0 e0Var, java.util.List list) {
        p247y7.AbstractC7350t.f(e0Var, "<this>");
        p247y7.AbstractC7350t.f(list, "arguments");
        return new F8.V(F8.X.a.f2869a, false).h(F8.W.f2864e.a(null, e0Var, list), F8.a0.f2872D.i());
    }

    private final p248y8.h c(F8.e0 e0Var, java.util.List list, G8.g gVar) {
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        if (interfaceC1427hW instanceof O7.f0) {
            return ((O7.f0) interfaceC1427hW).w().u();
        }
        if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
            if (gVar == null) {
                gVar = p218v8.c.o(p218v8.c.p(interfaceC1427hW));
            }
            O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1427hW;
            return list.isEmpty() ? R7.u.b(interfaceC1424e, gVar) : R7.u.a(interfaceC1424e, F8.f0.f2923c.b(e0Var, list), gVar);
        }
        if (interfaceC1427hW instanceof O7.e0) {
            H8.g gVar2 = H8.g.SCOPE_FOR_ABBREVIATION_TYPE;
            java.lang.String string = ((O7.e0) interfaceC1427hW).getName().toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return H8.k.a(gVar2, true, string);
        }
        if (e0Var instanceof F8.D) {
            return ((F8.D) e0Var).b();
        }
        throw new java.lang.IllegalStateException("Unsupported classifier: " + interfaceC1427hW + " for constructor: " + e0Var);
    }

    public static final F8.t0 d(F8.M m6, F8.M m10) {
        p247y7.AbstractC7350t.f(m6, "lowerBound");
        p247y7.AbstractC7350t.f(m10, "upperBound");
        return p247y7.AbstractC7350t.b(m6, m10) ? m6 : new F8.C0964z(m6, m10);
    }

    public static final F8.M e(F8.a0 a0Var, p198t8.n nVar, boolean z6) {
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        p247y7.AbstractC7350t.f(nVar, "constructor");
        return m(a0Var, nVar, p097j7.AbstractC6879v.m(), z6, H8.k.a(H8.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F8.F.b f(F8.e0 e0Var, G8.g gVar, java.util.List list) {
        O7.InterfaceC1427h interfaceC1427hF;
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        if (interfaceC1427hW == null || (interfaceC1427hF = gVar.f(interfaceC1427hW)) == null) {
            return null;
        }
        if (interfaceC1427hF instanceof O7.e0) {
            return new F8.F.b(b((O7.e0) interfaceC1427hF, list), null);
        }
        F8.e0 e0VarV = interfaceC1427hF.p().v(gVar);
        p247y7.AbstractC7350t.e(e0VarV, "refine(...)");
        return new F8.F.b(null, e0VarV);
    }

    public static final F8.M g(F8.a0 a0Var, O7.InterfaceC1424e interfaceC1424e, java.util.List list) {
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        p247y7.AbstractC7350t.f(interfaceC1424e, "descriptor");
        p247y7.AbstractC7350t.f(list, "arguments");
        F8.e0 e0VarP = interfaceC1424e.p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        return l(a0Var, e0VarP, list, false, null, 16, null);
    }

    public static final F8.M h(F8.M m6, F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(m6, "baseType");
        p247y7.AbstractC7350t.f(a0Var, "annotations");
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(list, "arguments");
        return l(a0Var, e0Var, list, z6, null, 16, null);
    }

    public static final F8.M i(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(list, "arguments");
        return l(a0Var, e0Var, list, z6, null, 16, null);
    }

    public static final F8.M j(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6, G8.g gVar) {
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(list, "arguments");
        if (!a0Var.isEmpty() || !list.isEmpty() || z6 || e0Var.w() == null) {
            return n(a0Var, e0Var, list, z6, f2828a.c(e0Var, list, gVar), new F8.F.c(e0Var, list, a0Var, z6));
        }
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        p247y7.AbstractC7350t.c(interfaceC1427hW);
        F8.M mW = interfaceC1427hW.w();
        p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
        return mW;
    }

    public static /* synthetic */ F8.M k(F8.M m6, F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            a0Var = m6.V0();
        }
        if ((i6 & 4) != 0) {
            e0Var = m6.W0();
        }
        if ((i6 & 8) != 0) {
            list = m6.U0();
        }
        if ((i6 & 16) != 0) {
            z6 = m6.X0();
        }
        return h(m6, a0Var, e0Var, list, z6);
    }

    public static /* synthetic */ F8.M l(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6, G8.g gVar, int i6, java.lang.Object obj) {
        if ((i6 & 16) != 0) {
            gVar = null;
        }
        return j(a0Var, e0Var, list, z6, gVar);
    }

    public static final F8.M m(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6, p248y8.h hVar) {
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(hVar, "memberScope");
        F8.N n6 = new F8.N(e0Var, list, z6, hVar, new F8.F.d(e0Var, list, a0Var, z6, hVar));
        return a0Var.isEmpty() ? n6 : new F8.O(n6, a0Var);
    }

    public static final F8.M n(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6, p248y8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(hVar, "memberScope");
        p247y7.AbstractC7350t.f(lVar, "refinedTypeFactory");
        F8.N n6 = new F8.N(e0Var, list, z6, hVar, lVar);
        return a0Var.isEmpty() ? n6 : new F8.O(n6, a0Var);
    }
}
