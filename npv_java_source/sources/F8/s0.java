package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final F8.E a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        if (e6 instanceof F8.r0) {
            return ((F8.r0) e6).M();
        }
        return null;
    }

    public static final F8.t0 b(F8.t0 t0Var, F8.E e6) {
        p247y7.AbstractC7350t.f(t0Var, "<this>");
        p247y7.AbstractC7350t.f(e6, "origin");
        return d(t0Var, a(e6));
    }

    public static final F8.t0 c(F8.t0 t0Var, F8.E e6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(t0Var, "<this>");
        p247y7.AbstractC7350t.f(e6, "origin");
        p247y7.AbstractC7350t.f(lVar, "transform");
        F8.E eA = a(e6);
        return d(t0Var, eA != null ? (F8.E) lVar.l(eA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final F8.t0 d(F8.t0 t0Var, F8.E e6) {
        p247y7.AbstractC7350t.f(t0Var, "<this>");
        if (t0Var instanceof F8.r0) {
            return d(((F8.r0) t0Var).O0(), e6);
        }
        if (e6 == null || p247y7.AbstractC7350t.b(e6, t0Var)) {
            return t0Var;
        }
        if (t0Var instanceof F8.M) {
            return new F8.P((F8.M) t0Var, e6);
        }
        if (t0Var instanceof F8.AbstractC0963y) {
            return new F8.A((F8.AbstractC0963y) t0Var, e6);
        }
        throw new p087i7.s();
    }
}
