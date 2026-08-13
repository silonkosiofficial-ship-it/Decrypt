package L8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6444a;

        static {
            int[] iArr = new int[F8.u0.values().length];
            try {
                iArr[F8.u0.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F8.u0.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F8.u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6444a = iArr;
        }
    }

    /* JADX INFO: renamed from: L8.b$b, reason: collision with other inner class name */
    static final class C0156b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final L8.b.C0156b f6445D = new L8.b.C0156b();

        C0156b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            p247y7.AbstractC7350t.c(t0Var);
            return java.lang.Boolean.valueOf(p188s8.d.d(t0Var));
        }
    }

    public static final class c extends F8.f0 {
        c() {
        }

        @Override // F8.f0
        public F8.i0 k(F8.e0 e0Var) {
            p247y7.AbstractC7350t.f(e0Var, "key");
            p188s8.b bVar = e0Var instanceof p188s8.b ? (p188s8.b) e0Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.a().b() ? new F8.k0(F8.u0.OUT_VARIANCE, bVar.a().getType()) : bVar.a();
        }
    }

    public static final L8.a a(F8.E e6) {
        java.lang.Object objE;
        p247y7.AbstractC7350t.f(e6, "type");
        if (F8.B.b(e6)) {
            L8.a aVarA = a(F8.B.c(e6));
            L8.a aVarA2 = a(F8.B.d(e6));
            return new L8.a(F8.s0.b(F8.F.d(F8.B.c((F8.E) aVarA.c()), F8.B.d((F8.E) aVarA2.c())), e6), F8.s0.b(F8.F.d(F8.B.c((F8.E) aVarA.d()), F8.B.d((F8.E) aVarA2.d())), e6));
        }
        F8.e0 e0VarW0 = e6.W0();
        if (p188s8.d.d(e6)) {
            p247y7.AbstractC7350t.d(e0VarW0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            F8.i0 i0VarA = ((p188s8.b) e0VarW0).a();
            F8.E type = i0VarA.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            F8.E eB = b(type, e6);
            int i6 = L8.b.a.f6444a[i0VarA.a().ordinal()];
            if (i6 == 2) {
                F8.M mI = K8.a.i(e6).I();
                p247y7.AbstractC7350t.e(mI, "getNullableAnyType(...)");
                return new L8.a(eB, mI);
            }
            if (i6 == 3) {
                F8.M mH = K8.a.i(e6).H();
                p247y7.AbstractC7350t.e(mH, "getNothingType(...)");
                return new L8.a(b(mH, e6), eB);
            }
            throw new java.lang.AssertionError("Only nontrivial projections should have been captured, not: " + i0VarA);
        }
        if (e6.U0().isEmpty() || e6.U0().size() != e0VarW0.x().size()) {
            return new L8.a(e6, e6);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List listU0 = e6.U0();
        java.util.List listX = e0VarW0.x();
        p247y7.AbstractC7350t.e(listX, "getParameters(...)");
        for (p087i7.u uVar : p097j7.AbstractC6879v.c1(listU0, listX)) {
            F8.i0 i0Var = (F8.i0) uVar.a();
            O7.f0 f0Var = (O7.f0) uVar.b();
            p247y7.AbstractC7350t.c(f0Var);
            L8.c cVarG = g(i0Var, f0Var);
            if (i0Var.b()) {
                arrayList.add(cVarG);
            } else {
                L8.a aVarD = d(cVarG);
                L8.c cVar = (L8.c) aVarD.a();
                cVarG = (L8.c) aVarD.b();
                arrayList.add(cVar);
            }
            arrayList2.add(cVarG);
        }
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((L8.c) it.next()).d()) {
                    z6 = true;
                    break;
                }
            }
        }
        if (z6) {
            objE = K8.a.i(e6).H();
            p247y7.AbstractC7350t.e(objE, "getNothingType(...)");
        } else {
            objE = e(e6, arrayList);
        }
        return new L8.a(objE, e(e6, arrayList2));
    }

    private static final F8.E b(F8.E e6, F8.E e10) {
        F8.E eQ = F8.q0.q(e6, e10.X0());
        p247y7.AbstractC7350t.e(eQ, "makeNullableIfNeeded(...)");
        return eQ;
    }

    public static final F8.i0 c(F8.i0 i0Var, boolean z6) {
        if (i0Var == null) {
            return null;
        }
        if (i0Var.b()) {
            return i0Var;
        }
        F8.E type = i0Var.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        if (!F8.q0.c(type, L8.b.C0156b.f6445D)) {
            return i0Var;
        }
        F8.u0 u0VarA = i0Var.a();
        p247y7.AbstractC7350t.e(u0VarA, "getProjectionKind(...)");
        if (u0VarA == F8.u0.OUT_VARIANCE) {
            return new F8.k0(u0VarA, (F8.E) a(type).d());
        }
        return z6 ? new F8.k0(u0VarA, (F8.E) a(type).c()) : f(i0Var);
    }

    private static final L8.a d(L8.c cVar) {
        L8.a aVarA = a(cVar.a());
        F8.E e6 = (F8.E) aVarA.a();
        F8.E e10 = (F8.E) aVarA.b();
        L8.a aVarA2 = a(cVar.b());
        return new L8.a(new L8.c(cVar.c(), e10, (F8.E) aVarA2.a()), new L8.c(cVar.c(), e6, (F8.E) aVarA2.b()));
    }

    private static final F8.E e(F8.E e6, java.util.List list) {
        e6.U0().size();
        list.size();
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(h((L8.c) it.next()));
        }
        return F8.m0.e(e6, arrayList, null, null, 6, null);
    }

    private static final F8.i0 f(F8.i0 i0Var) {
        F8.n0 n0VarG = F8.n0.g(new L8.b.c());
        p247y7.AbstractC7350t.e(n0VarG, "create(...)");
        return n0VarG.t(i0Var);
    }

    private static final L8.c g(F8.i0 i0Var, O7.f0 f0Var) {
        int i6 = L8.b.a.f6444a[F8.n0.c(f0Var.s(), i0Var).ordinal()];
        if (i6 == 1) {
            F8.E type = i0Var.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            F8.E type2 = i0Var.getType();
            p247y7.AbstractC7350t.e(type2, "getType(...)");
            return new L8.c(f0Var, type, type2);
        }
        if (i6 == 2) {
            F8.E type3 = i0Var.getType();
            p247y7.AbstractC7350t.e(type3, "getType(...)");
            F8.M mI = p218v8.c.j(f0Var).I();
            p247y7.AbstractC7350t.e(mI, "getNullableAnyType(...)");
            return new L8.c(f0Var, type3, mI);
        }
        if (i6 != 3) {
            throw new p087i7.s();
        }
        F8.M mH = p218v8.c.j(f0Var).H();
        p247y7.AbstractC7350t.e(mH, "getNothingType(...)");
        F8.E type4 = i0Var.getType();
        p247y7.AbstractC7350t.e(type4, "getType(...)");
        return new L8.c(f0Var, mH, type4);
    }

    private static final F8.i0 h(L8.c cVar) {
        cVar.d();
        if (!p247y7.AbstractC7350t.b(cVar.a(), cVar.b())) {
            F8.u0 u0VarS = cVar.c().s();
            F8.u0 u0Var = F8.u0.IN_VARIANCE;
            if (u0VarS != u0Var) {
                if ((!L7.g.n0(cVar.a()) || cVar.c().s() == u0Var) && L7.g.p0(cVar.b())) {
                    return new F8.k0(i(cVar, u0Var), cVar.a());
                }
                return new F8.k0(i(cVar, F8.u0.OUT_VARIANCE), cVar.b());
            }
        }
        return new F8.k0(cVar.a());
    }

    private static final F8.u0 i(L8.c cVar, F8.u0 u0Var) {
        return u0Var == cVar.c().s() ? F8.u0.INVARIANT : u0Var;
    }
}
