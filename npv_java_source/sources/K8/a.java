package K8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: K8.a$a, reason: collision with other inner class name */
    static final class C0149a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K8.a.C0149a f6156D = new K8.a.C0149a();

        C0149a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            p247y7.AbstractC7350t.f(t0Var, "it");
            O7.InterfaceC1427h interfaceC1427hW = t0Var.W0().w();
            return java.lang.Boolean.valueOf(interfaceC1427hW != null ? K8.a.s(interfaceC1427hW) : false);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K8.a.b f6157D = new K8.a.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            return java.lang.Boolean.valueOf(F8.q0.m(t0Var));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K8.a.c f6158D = new K8.a.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            p247y7.AbstractC7350t.f(t0Var, "it");
            O7.InterfaceC1427h interfaceC1427hW = t0Var.W0().w();
            boolean z6 = false;
            if (interfaceC1427hW != null && ((interfaceC1427hW instanceof O7.e0) || (interfaceC1427hW instanceof O7.f0))) {
                z6 = true;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    public static final F8.i0 a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return new F8.k0(e6);
    }

    public static final boolean b(F8.E e6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return F8.q0.c(e6, lVar);
    }

    private static final boolean c(F8.E e6, F8.e0 e0Var, java.util.Set set) {
        boolean zC;
        if (p247y7.AbstractC7350t.b(e6.W0(), e0Var)) {
            return true;
        }
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        O7.InterfaceC1428i interfaceC1428i = interfaceC1427hW instanceof O7.InterfaceC1428i ? (O7.InterfaceC1428i) interfaceC1427hW : null;
        java.util.List listA = interfaceC1428i != null ? interfaceC1428i.A() : null;
        java.lang.Iterable<p097j7.L> iterableA1 = p097j7.AbstractC6879v.a1(e6.U0());
        if (!(iterableA1 instanceof java.util.Collection) || !((java.util.Collection) iterableA1).isEmpty()) {
            for (p097j7.L l6 : iterableA1) {
                int iA = l6.a();
                F8.i0 i0Var = (F8.i0) l6.b();
                O7.f0 f0Var = listA != null ? (O7.f0) p097j7.AbstractC6879v.l0(listA, iA) : null;
                if ((f0Var == null || set == null || !set.contains(f0Var)) && !i0Var.b()) {
                    F8.E type = i0Var.getType();
                    p247y7.AbstractC7350t.e(type, "getType(...)");
                    zC = c(type, e0Var, set);
                } else {
                    zC = false;
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return b(e6, K8.a.C0149a.f6156D);
    }

    public static final boolean e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return F8.q0.c(e6, K8.a.b.f6157D);
    }

    public static final F8.i0 f(F8.E e6, F8.u0 u0Var, O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(e6, "type");
        p247y7.AbstractC7350t.f(u0Var, "projectionKind");
        if ((f0Var != null ? f0Var.s() : null) == u0Var) {
            u0Var = F8.u0.INVARIANT;
        }
        return new F8.k0(u0Var, e6);
    }

    public static final java.util.Set g(F8.E e6, java.util.Set set) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        h(e6, e6, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void h(F8.E e6, F8.E e10, java.util.Set set, java.util.Set set2) {
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW instanceof O7.f0) {
            if (!p247y7.AbstractC7350t.b(e6.W0(), e10.W0())) {
                set.add(interfaceC1427hW);
                return;
            }
            for (F8.E e11 : ((O7.f0) interfaceC1427hW).getUpperBounds()) {
                p247y7.AbstractC7350t.c(e11);
                h(e11, e10, set, set2);
            }
            return;
        }
        O7.InterfaceC1427h interfaceC1427hW2 = e6.W0().w();
        O7.InterfaceC1428i interfaceC1428i = interfaceC1427hW2 instanceof O7.InterfaceC1428i ? (O7.InterfaceC1428i) interfaceC1427hW2 : null;
        java.util.List listA = interfaceC1428i != null ? interfaceC1428i.A() : null;
        int i6 = 0;
        for (F8.i0 i0Var : e6.U0()) {
            int i10 = i6 + 1;
            O7.f0 f0Var = listA != null ? (O7.f0) p097j7.AbstractC6879v.l0(listA, i6) : null;
            if ((f0Var == null || set2 == null || !set2.contains(f0Var)) && !i0Var.b() && !p097j7.AbstractC6879v.Z(set, i0Var.getType().W0().w()) && !p247y7.AbstractC7350t.b(i0Var.getType().W0(), e10.W0())) {
                F8.E type = i0Var.getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                h(type, e10, set, set2);
            }
            i6 = i10;
        }
    }

    public static final L7.g i(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        L7.g gVarT = e6.W0().t();
        p247y7.AbstractC7350t.e(gVarT, "getBuiltIns(...)");
        return gVarT;
    }

    public static final F8.E j(O7.f0 f0Var) {
        java.lang.Object obj;
        p247y7.AbstractC7350t.f(f0Var, "<this>");
        java.util.List upperBounds = f0Var.getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        java.util.List upperBounds2 = f0Var.getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds2, "getUpperBounds(...)");
        java.util.Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            O7.InterfaceC1427h interfaceC1427hW = ((F8.E) next).W0().w();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
            if (interfaceC1424e != null && interfaceC1424e.j() != O7.EnumC1425f.INTERFACE && interfaceC1424e.j() != O7.EnumC1425f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        F8.E e6 = (F8.E) obj;
        if (e6 != null) {
            return e6;
        }
        java.util.List upperBounds3 = f0Var.getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds3, "getUpperBounds(...)");
        java.lang.Object objI0 = p097j7.AbstractC6879v.i0(upperBounds3);
        p247y7.AbstractC7350t.e(objI0, "first(...)");
        return (F8.E) objI0;
    }

    public static final boolean k(O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        return m(f0Var, null, null, 6, null);
    }

    public static final boolean l(O7.f0 f0Var, F8.e0 e0Var, java.util.Set set) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        java.util.List upperBounds = f0Var.getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
        java.util.List<F8.E> list = upperBounds;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (F8.E e6 : list) {
            p247y7.AbstractC7350t.c(e6);
            if (c(e6, f0Var.w().W0(), set) && (e0Var == null || p247y7.AbstractC7350t.b(e6.W0(), e0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean m(O7.f0 f0Var, F8.e0 e0Var, java.util.Set set, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            e0Var = null;
        }
        if ((i6 & 4) != 0) {
            set = null;
        }
        return l(f0Var, e0Var, set);
    }

    public static final boolean n(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return L7.g.f0(e6);
    }

    public static final boolean o(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return L7.g.n0(e6);
    }

    public static final boolean p(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        if (!(e6 instanceof F8.C0954o)) {
            return false;
        }
        ((F8.C0954o) e6).i1();
        return false;
    }

    public static final boolean q(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        if (!(e6 instanceof F8.C0954o)) {
            return false;
        }
        ((F8.C0954o) e6).i1();
        return false;
    }

    public static final boolean r(F8.E e6, F8.E e10) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p247y7.AbstractC7350t.f(e10, "superType");
        return G8.e.f3134a.d(e6, e10);
    }

    public static final boolean s(O7.InterfaceC1427h interfaceC1427h) {
        p247y7.AbstractC7350t.f(interfaceC1427h, "<this>");
        return (interfaceC1427h instanceof O7.f0) && (((O7.f0) interfaceC1427h).b() instanceof O7.e0);
    }

    public static final boolean t(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return F8.q0.m(e6);
    }

    public static final boolean u(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
        return (e6 instanceof H8.h) && ((H8.h) e6).g1().i();
    }

    public static final F8.E v(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.E eN = F8.q0.n(e6);
        p247y7.AbstractC7350t.e(eN, "makeNotNullable(...)");
        return eN;
    }

    public static final F8.E w(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.E eO = F8.q0.o(e6);
        p247y7.AbstractC7350t.e(eO, "makeNullable(...)");
        return eO;
    }

    public static final F8.E x(F8.E e6, P7.g gVar) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p247y7.AbstractC7350t.f(gVar, "newAnnotations");
        return (e6.k().isEmpty() && gVar.isEmpty()) ? e6 : e6.Z0().c1(F8.b0.a(e6.V0(), gVar));
    }

    public static final F8.E y(F8.E e6) {
        F8.M m6;
        F8.t0 t0VarF;
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0VarZ0;
            F8.M mE1 = abstractC0963y.e1();
            if (!mE1.W0().x().isEmpty() && mE1.W0().w() != null) {
                java.util.List listX = mE1.W0().x();
                p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                java.util.List list = listX;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new F8.T((O7.f0) it.next()));
                }
                mE1 = F8.m0.f(mE1, arrayList, null, 2, null);
            }
            F8.M mF1 = abstractC0963y.f1();
            if (!mF1.W0().x().isEmpty() && mF1.W0().w() != null) {
                java.util.List listX2 = mF1.W0().x();
                p247y7.AbstractC7350t.e(listX2, "getParameters(...)");
                java.util.List list2 = listX2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new F8.T((O7.f0) it2.next()));
                }
                mF1 = F8.m0.f(mF1, arrayList2, null, 2, null);
            }
            t0VarF = F8.F.d(mE1, mF1);
        } else {
            if (!(t0VarZ0 instanceof F8.M)) {
                throw new p087i7.s();
            }
            m6 = (F8.M) t0VarZ0;
            if (!m6.W0().x().isEmpty() && m6.W0().w() != null) {
                t0VarF = m6;
                t0VarF = m6;
                java.util.List listX3 = m6.W0().x();
                p247y7.AbstractC7350t.e(listX3, "getParameters(...)");
                java.util.List list3 = listX3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
                java.util.Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new F8.T((O7.f0) it3.next()));
                }
                t0VarF = F8.m0.f(m6, arrayList3, null, 2, null);
            }
        }
        t0VarF = m6;
        t0VarF = m6;
        t0VarF = m6;
        return F8.s0.b(t0VarF, t0VarZ0);
    }

    public static final boolean z(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return b(e6, K8.a.c.f6158D);
    }
}
