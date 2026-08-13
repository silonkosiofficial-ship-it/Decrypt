package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F8.V.a f2860c = new F8.V.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final F8.V f2861d = new F8.V(F8.X.a.f2869a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.X f2862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2863b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i6, O7.e0 e0Var) {
            if (i6 <= 100) {
                return;
            }
            throw new java.lang.AssertionError("Too deep recursion while expanding type alias " + e0Var.getName());
        }
    }

    public V(F8.X x6, boolean z6) {
        p247y7.AbstractC7350t.f(x6, "reportStrategy");
        this.f2862a = x6;
        this.f2863b = z6;
    }

    private final void a(P7.g gVar, P7.g gVar2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((P7.c) it.next()).e());
        }
        java.util.Iterator it2 = gVar2.iterator();
        while (it2.hasNext()) {
            P7.c cVar = (P7.c) it2.next();
            if (hashSet.contains(cVar.e())) {
                this.f2862a.b(cVar);
            }
        }
    }

    private final void b(F8.E e6, F8.E e10) {
        F8.n0 n0VarF = F8.n0.f(e10);
        p247y7.AbstractC7350t.e(n0VarF, "create(...)");
        int i6 = 0;
        for (java.lang.Object obj : e10.U0()) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            F8.i0 i0Var = (F8.i0) obj;
            if (!i0Var.b()) {
                F8.E type = i0Var.getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                if (!K8.a.d(type)) {
                    F8.i0 i0Var2 = (F8.i0) e6.U0().get(i6);
                    O7.f0 f0Var = (O7.f0) e6.W0().x().get(i6);
                    if (this.f2863b) {
                        F8.X x6 = this.f2862a;
                        F8.E type2 = i0Var2.getType();
                        p247y7.AbstractC7350t.e(type2, "getType(...)");
                        F8.E type3 = i0Var.getType();
                        p247y7.AbstractC7350t.e(type3, "getType(...)");
                        p247y7.AbstractC7350t.c(f0Var);
                        x6.a(n0VarF, type2, type3, f0Var);
                    }
                }
            }
            i6 = i10;
        }
    }

    private final F8.M c(F8.M m6, F8.a0 a0Var) {
        return F8.G.a(m6) ? m6 : F8.m0.f(m6, null, g(m6, a0Var), 1, null);
    }

    private final F8.M d(F8.M m6, F8.E e6) {
        F8.M mR = F8.q0.r(m6, e6.X0());
        p247y7.AbstractC7350t.e(mR, "makeNullableIfNeeded(...)");
        return mR;
    }

    private final F8.M e(F8.M m6, F8.E e6) {
        return c(d(m6, e6), e6.V0());
    }

    private final F8.M f(F8.W w6, F8.a0 a0Var, boolean z6) {
        F8.e0 e0VarP = w6.b().p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        return F8.F.m(a0Var, e0VarP, w6.a(), z6, y8.h.b.f57356b);
    }

    private final F8.a0 g(F8.E e6, F8.a0 a0Var) {
        boolean zA = F8.G.a(e6);
        F8.a0 a0VarV0 = e6.V0();
        return zA ? a0VarV0 : a0Var.s(a0VarV0);
    }

    private final F8.i0 i(F8.i0 i0Var, F8.W w6, int i6) {
        F8.t0 t0VarZ0 = i0Var.getType().Z0();
        if (F8.AbstractC0959u.a(t0VarZ0)) {
            return i0Var;
        }
        F8.M mA = F8.m0.a(t0VarZ0);
        if (F8.G.a(mA) || !K8.a.z(mA)) {
            return i0Var;
        }
        F8.e0 e0VarW0 = mA.W0();
        O7.InterfaceC1427h interfaceC1427hW = e0VarW0.w();
        e0VarW0.x().size();
        mA.U0().size();
        if (interfaceC1427hW instanceof O7.f0) {
            return i0Var;
        }
        if (!(interfaceC1427hW instanceof O7.e0)) {
            F8.M mL = l(mA, w6, i6);
            b(mA, mL);
            return new F8.k0(i0Var.a(), mL);
        }
        O7.e0 e0Var = (O7.e0) interfaceC1427hW;
        if (w6.d(e0Var)) {
            this.f2862a.d(e0Var);
            F8.u0 u0Var = F8.u0.INVARIANT;
            H8.j jVar = H8.j.f4476U;
            java.lang.String string = e0Var.getName().toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return new F8.k0(u0Var, H8.k.d(jVar, string));
        }
        java.util.List listU0 = mA.U0();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listU0, 10));
        int i10 = 0;
        for (java.lang.Object obj : listU0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p097j7.AbstractC6879v.w();
            }
            arrayList.add(k((F8.i0) obj, w6, (O7.f0) e0VarW0.x().get(i10), i6 + 1));
            i10 = i11;
        }
        F8.M mJ = j(F8.W.f2864e.a(w6, e0Var, arrayList), mA.V0(), mA.X0(), i6 + 1, false);
        F8.M mL2 = l(mA, w6, i6);
        if (!F8.AbstractC0959u.a(mJ)) {
            mJ = F8.Q.j(mJ, mL2);
        }
        return new F8.k0(i0Var.a(), mJ);
    }

    private final F8.M j(F8.W w6, F8.a0 a0Var, boolean z6, int i6, boolean z10) {
        F8.i0 i0VarK = k(new F8.k0(F8.u0.INVARIANT, w6.b().o0()), w6, null, i6);
        F8.E type = i0VarK.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        F8.M mA = F8.m0.a(type);
        if (F8.G.a(mA)) {
            return mA;
        }
        i0VarK.a();
        a(mA.k(), F8.AbstractC0949j.a(a0Var));
        F8.M mR = F8.q0.r(c(mA, a0Var), z6);
        p247y7.AbstractC7350t.e(mR, "let(...)");
        return z10 ? F8.Q.j(mR, f(w6, a0Var, z6)) : mR;
    }

    private final F8.i0 k(F8.i0 i0Var, F8.W w6, O7.f0 f0Var, int i6) {
        F8.u0 u0VarS;
        F8.u0 u0Var;
        F8.u0 u0Var2;
        f2860c.b(i6, w6.b());
        if (!i0Var.b()) {
            F8.E type = i0Var.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            F8.i0 i0VarC = w6.c(type.W0());
            if (i0VarC == null) {
                return i(i0Var, w6, i6);
            }
            if (!i0VarC.b()) {
                F8.t0 t0VarZ0 = i0VarC.getType().Z0();
                F8.u0 u0VarA = i0VarC.a();
                p247y7.AbstractC7350t.e(u0VarA, "getProjectionKind(...)");
                F8.u0 u0VarA2 = i0Var.a();
                p247y7.AbstractC7350t.e(u0VarA2, "getProjectionKind(...)");
                if (u0VarA2 != u0VarA && u0VarA2 != (u0Var2 = F8.u0.INVARIANT)) {
                    if (u0VarA == u0Var2) {
                        u0VarA = u0VarA2;
                    } else {
                        this.f2862a.c(w6.b(), f0Var, t0VarZ0);
                    }
                }
                if (f0Var == null || (u0VarS = f0Var.s()) == null) {
                    u0VarS = F8.u0.INVARIANT;
                }
                p247y7.AbstractC7350t.c(u0VarS);
                if (u0VarS != u0VarA && u0VarS != (u0Var = F8.u0.INVARIANT)) {
                    if (u0VarA == u0Var) {
                        u0VarA = u0Var;
                    } else {
                        this.f2862a.c(w6.b(), f0Var, t0VarZ0);
                    }
                }
                a(type.k(), t0VarZ0.k());
                return new F8.k0(u0VarA, e(F8.m0.a(t0VarZ0), type));
            }
        }
        p247y7.AbstractC7350t.c(f0Var);
        F8.i0 i0VarS = F8.q0.s(f0Var);
        p247y7.AbstractC7350t.e(i0VarS, "makeStarProjection(...)");
        return i0VarS;
    }

    private final F8.M l(F8.M m6, F8.W w6, int i6) {
        F8.e0 e0VarW0 = m6.W0();
        java.util.List listU0 = m6.U0();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listU0, 10));
        int i10 = 0;
        for (java.lang.Object obj : listU0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p097j7.AbstractC6879v.w();
            }
            F8.i0 i0Var = (F8.i0) obj;
            F8.i0 i0VarK = k(i0Var, w6, (O7.f0) e0VarW0.x().get(i10), i6 + 1);
            if (!i0VarK.b()) {
                i0VarK = new F8.k0(i0VarK.a(), F8.q0.q(i0VarK.getType(), i0Var.getType().X0()));
            }
            arrayList.add(i0VarK);
            i10 = i11;
        }
        return F8.m0.f(m6, arrayList, null, 2, null);
    }

    public final F8.M h(F8.W w6, F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(w6, "typeAliasExpansion");
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        return j(w6, a0Var, false, 0, true);
    }
}
