package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p131n0.i f54729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f54730b;

    static {
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.5f);
        f54729a = new p131n0.i(0.5f, 0.5f, 0.5f, 0.5f);
        p200u.x0 x0VarJ = p200u.z0.j(p247y7.C7349s.f57306a);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(1.0f);
        p087i7.u uVarA = p087i7.B.a(x0VarJ, fValueOf2);
        p087i7.u uVarA2 = p087i7.B.a(p200u.z0.e(Y0.t.f16230b), fValueOf2);
        p087i7.u uVarA3 = p087i7.B.a(p200u.z0.d(Y0.p.f16221b), fValueOf2);
        p087i7.u uVarA4 = p087i7.B.a(p200u.z0.i(p247y7.C7344m.f57303a), java.lang.Float.valueOf(0.01f));
        p087i7.u uVarA5 = p087i7.B.a(p200u.z0.g(p131n0.i.f51317e), fValueOf);
        p087i7.u uVarA6 = p087i7.B.a(p200u.z0.h(p131n0.m.f51333b), fValueOf);
        p087i7.u uVarA7 = p087i7.B.a(p200u.z0.f(p131n0.g.f51312b), fValueOf);
        p200u.x0 x0VarB = p200u.z0.b(Y0.i.f16208D);
        java.lang.Float fValueOf3 = java.lang.Float.valueOf(0.1f);
        f54730b = p097j7.S.k(uVarA, uVarA2, uVarA3, uVarA4, uVarA5, uVarA6, uVarA7, p087i7.B.a(x0VarB, fValueOf3), p087i7.B.a(p200u.z0.c(Y0.k.f16213b), fValueOf3));
    }

    public static final float a(Y0.i.a aVar) {
        return Y0.i.q(0.1f);
    }

    public static final int b(p247y7.C7349s c7349s) {
        return 1;
    }

    public static final long c(Y0.p.a aVar) {
        return Y0.q.a(1, 1);
    }

    public static final long d(Y0.t.a aVar) {
        return Y0.u.a(1, 1);
    }

    public static final long e(n0.g.a aVar) {
        return p131n0.h.a(0.5f, 0.5f);
    }

    public static final long f(n0.m.a aVar) {
        return p131n0.n.a(0.5f, 0.5f);
    }

    public static final p131n0.i g(n0.i.a aVar) {
        return f54729a;
    }

    public static final java.util.Map h() {
        return f54730b;
    }
}
