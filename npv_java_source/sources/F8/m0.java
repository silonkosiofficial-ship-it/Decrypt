package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 {
    public static final F8.M a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.t0 t0VarZ0 = e6.Z0();
        F8.M m6 = t0VarZ0 instanceof F8.M ? (F8.M) t0VarZ0 : null;
        if (m6 != null) {
            return m6;
        }
        throw new java.lang.IllegalStateException(("This is should be simple type: " + e6).toString());
    }

    public static final F8.E b(F8.E e6, java.util.List list, P7.g gVar) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p247y7.AbstractC7350t.f(list, "newArguments");
        p247y7.AbstractC7350t.f(gVar, "newAnnotations");
        return e(e6, list, gVar, null, 4, null);
    }

    public static final F8.E c(F8.E e6, java.util.List list, P7.g gVar, java.util.List list2) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p247y7.AbstractC7350t.f(list, "newArguments");
        p247y7.AbstractC7350t.f(gVar, "newAnnotations");
        p247y7.AbstractC7350t.f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == e6.U0()) && gVar == e6.k()) {
            return e6;
        }
        F8.a0 a0VarV0 = e6.V0();
        if ((gVar instanceof P7.l) && gVar.isEmpty()) {
            gVar = P7.g.f8385d.b();
        }
        F8.a0 a0VarA = F8.b0.a(a0VarV0, gVar);
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0VarZ0;
            return F8.F.d(d(abstractC0963y.e1(), list, a0VarA), d(abstractC0963y.f1(), list2, a0VarA));
        }
        if (t0VarZ0 instanceof F8.M) {
            return d((F8.M) t0VarZ0, list, a0VarA);
        }
        throw new p087i7.s();
    }

    public static final F8.M d(F8.M m6, java.util.List list, F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        p247y7.AbstractC7350t.f(list, "newArguments");
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        if (list.isEmpty() && a0Var == m6.V0()) {
            return m6;
        }
        if (list.isEmpty()) {
            return m6.c1(a0Var);
        }
        return m6 instanceof H8.h ? ((H8.h) m6).i1(list) : F8.F.l(a0Var, m6.W0(), list, m6.X0(), null, 16, null);
    }

    public static /* synthetic */ F8.E e(F8.E e6, java.util.List list, P7.g gVar, java.util.List list2, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            list = e6.U0();
        }
        if ((i6 & 2) != 0) {
            gVar = e6.k();
        }
        if ((i6 & 4) != 0) {
            list2 = list;
        }
        return c(e6, list, gVar, list2);
    }

    public static /* synthetic */ F8.M f(F8.M m6, java.util.List list, F8.a0 a0Var, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            list = m6.U0();
        }
        if ((i6 & 2) != 0) {
            a0Var = m6.V0();
        }
        return d(m6, list, a0Var);
    }
}
