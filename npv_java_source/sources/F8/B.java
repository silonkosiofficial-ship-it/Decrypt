package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B {
    public static final F8.AbstractC0963y a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.t0 t0VarZ0 = e6.Z0();
        p247y7.AbstractC7350t.d(t0VarZ0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (F8.AbstractC0963y) t0VarZ0;
    }

    public static final boolean b(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return e6.Z0() instanceof F8.AbstractC0963y;
    }

    public static final F8.M c(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            return ((F8.AbstractC0963y) t0VarZ0).e1();
        }
        if (t0VarZ0 instanceof F8.M) {
            return (F8.M) t0VarZ0;
        }
        throw new p087i7.s();
    }

    public static final F8.M d(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            return ((F8.AbstractC0963y) t0VarZ0).f1();
        }
        if (t0VarZ0 instanceof F8.M) {
            return (F8.M) t0VarZ0;
        }
        throw new p087i7.s();
    }
}
