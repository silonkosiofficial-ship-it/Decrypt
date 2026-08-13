package H8;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H8.k f4528a = new H8.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final O7.G f4529b = H8.d.f4407C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final H8.a f4530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final F8.E f4531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final F8.E f4532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final O7.U f4533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Set f4534g;

    static {
        java.lang.String str = java.lang.String.format(H8.b.ERROR_CLASS.g(), java.util.Arrays.copyOf(new java.lang.Object[]{"unknown class"}, 1));
        p247y7.AbstractC7350t.e(str, "format(...)");
        p138n8.f fVarS = p138n8.f.s(str);
        p247y7.AbstractC7350t.e(fVarS, "special(...)");
        f4530c = new H8.a(fVarS);
        f4531d = d(H8.j.f4482X, new java.lang.String[0]);
        f4532e = d(H8.j.f4477U0, new java.lang.String[0]);
        H8.e eVar = new H8.e();
        f4533f = eVar;
        f4534g = p097j7.Z.c(eVar);
    }

    private k() {
    }

    public static final H8.f a(H8.g gVar, boolean z6, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(gVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return z6 ? new H8.l(gVar, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)) : new H8.f(gVar, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final H8.f b(H8.g gVar, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(gVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return a(gVar, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final H8.h d(H8.j jVar, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return f4528a.g(jVar, p097j7.AbstractC6879v.m(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m != null) {
            H8.k kVar = f4528a;
            if (kVar.n(interfaceC1432m) || kVar.n(interfaceC1432m.b()) || interfaceC1432m == f4529b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(O7.InterfaceC1432m interfaceC1432m) {
        return interfaceC1432m instanceof H8.a;
    }

    public static final boolean o(F8.E e6) {
        if (e6 == null) {
            return false;
        }
        F8.e0 e0VarW0 = e6.W0();
        return (e0VarW0 instanceof H8.i) && ((H8.i) e0VarW0).b() == H8.j.f4488a0;
    }

    public final H8.h c(H8.j jVar, F8.e0 e0Var, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(e0Var, "typeConstructor");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return f(jVar, p097j7.AbstractC6879v.m(), e0Var, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final H8.i e(H8.j jVar, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return new H8.i(jVar, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final H8.h f(H8.j jVar, java.util.List list, F8.e0 e0Var, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(e0Var, "typeConstructor");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return new H8.h(e0Var, b(H8.g.ERROR_TYPE_SCOPE, e0Var.toString()), jVar, list, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final H8.h g(H8.j jVar, java.util.List list, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        return f(jVar, list, e(jVar, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final H8.a h() {
        return f4530c;
    }

    public final O7.G i() {
        return f4529b;
    }

    public final java.util.Set j() {
        return f4534g;
    }

    public final F8.E k() {
        return f4532e;
    }

    public final F8.E l() {
        return f4531d;
    }

    public final java.lang.String p(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
        K8.a.u(e6);
        F8.e0 e0VarW0 = e6.W0();
        p247y7.AbstractC7350t.d(e0VarW0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((H8.i) e0VarW0).c(0);
    }
}
