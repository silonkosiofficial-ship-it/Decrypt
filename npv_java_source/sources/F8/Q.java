package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {
    public static final F8.C0940a a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.C0940a) {
            return (F8.C0940a) t0VarZ0;
        }
        return null;
    }

    public static final F8.M b(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.C0940a c0940aA = a(e6);
        if (c0940aA != null) {
            return c0940aA.i1();
        }
        return null;
    }

    public static final boolean c(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return e6.Z0() instanceof F8.C0954o;
    }

    private static final F8.D d(F8.D d6) {
        F8.E e6;
        java.util.Collection collectionU = d6.u();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionU, 10));
        java.util.Iterator it = collectionU.iterator();
        boolean z6 = false;
        while (true) {
            e6 = null;
            if (!it.hasNext()) {
                break;
            }
            F8.E eF = (F8.E) it.next();
            if (F8.q0.l(eF)) {
                eF = f(eF.Z0(), false, 1, null);
                z6 = true;
            }
            arrayList.add(eF);
        }
        if (!z6) {
            return null;
        }
        F8.E eD = d6.d();
        if (eD != null) {
            if (F8.q0.l(eD)) {
                eD = f(eD.Z0(), false, 1, null);
            }
            e6 = eD;
        }
        return new F8.D(arrayList).h(e6);
    }

    public static final F8.t0 e(F8.t0 t0Var, boolean z6) {
        p247y7.AbstractC7350t.f(t0Var, "<this>");
        F8.C0954o c0954oC = F8.C0954o.a.c(F8.C0954o.f2958F, t0Var, z6, false, 4, null);
        if (c0954oC != null) {
            return c0954oC;
        }
        F8.M mG = g(t0Var);
        return mG != null ? mG : t0Var.a1(false);
    }

    public static /* synthetic */ F8.t0 f(F8.t0 t0Var, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return e(t0Var, z6);
    }

    private static final F8.M g(F8.E e6) {
        F8.D d6;
        F8.e0 e0VarW0 = e6.W0();
        F8.D d10 = e0VarW0 instanceof F8.D ? (F8.D) e0VarW0 : null;
        if (d10 == null || (d6 = d(d10)) == null) {
            return null;
        }
        return d6.c();
    }

    public static final F8.M h(F8.M m6, boolean z6) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        F8.C0954o c0954oC = F8.C0954o.a.c(F8.C0954o.f2958F, m6, z6, false, 4, null);
        if (c0954oC != null) {
            return c0954oC;
        }
        F8.M mG = g(m6);
        return mG == null ? m6.a1(false) : mG;
    }

    public static /* synthetic */ F8.M i(F8.M m6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return h(m6, z6);
    }

    public static final F8.M j(F8.M m6, F8.M m10) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        p247y7.AbstractC7350t.f(m10, "abbreviatedType");
        return F8.G.a(m6) ? m6 : new F8.C0940a(m6, m10);
    }

    public static final G8.i k(G8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return new G8.i(iVar.f1(), iVar.W0(), iVar.h1(), iVar.V0(), iVar.X0(), true);
    }
}
