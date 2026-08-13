package F8;

/* JADX INFO: renamed from: F8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0958t extends F8.l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F8.C0958t.a f2972e = new F8.C0958t.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F8.l0 f2973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.l0 f2974d;

    /* JADX INFO: renamed from: F8.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final F8.l0 a(F8.l0 l0Var, F8.l0 l0Var2) {
            p247y7.AbstractC7350t.f(l0Var, "first");
            p247y7.AbstractC7350t.f(l0Var2, "second");
            if (l0Var.f()) {
                return l0Var2;
            }
            return l0Var2.f() ? l0Var : new F8.C0958t(l0Var, l0Var2, null);
        }
    }

    private C0958t(F8.l0 l0Var, F8.l0 l0Var2) {
        this.f2973c = l0Var;
        this.f2974d = l0Var2;
    }

    public /* synthetic */ C0958t(F8.l0 l0Var, F8.l0 l0Var2, p247y7.AbstractC7342k abstractC7342k) {
        this(l0Var, l0Var2);
    }

    public static final F8.l0 i(F8.l0 l0Var, F8.l0 l0Var2) {
        return f2972e.a(l0Var, l0Var2);
    }

    @Override // F8.l0
    public boolean a() {
        return this.f2973c.a() || this.f2974d.a();
    }

    @Override // F8.l0
    public boolean b() {
        return this.f2973c.b() || this.f2974d.b();
    }

    @Override // F8.l0
    public P7.g d(P7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "annotations");
        return this.f2974d.d(this.f2973c.d(gVar));
    }

    @Override // F8.l0
    public F8.i0 e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "key");
        F8.i0 i0VarE = this.f2973c.e(e6);
        return i0VarE == null ? this.f2974d.e(e6) : i0VarE;
    }

    @Override // F8.l0
    public boolean f() {
        return false;
    }

    @Override // F8.l0
    public F8.E g(F8.E e6, F8.u0 u0Var) {
        p247y7.AbstractC7350t.f(e6, "topLevelType");
        p247y7.AbstractC7350t.f(u0Var, "position");
        return this.f2974d.g(this.f2973c.g(e6, u0Var), u0Var);
    }
}
