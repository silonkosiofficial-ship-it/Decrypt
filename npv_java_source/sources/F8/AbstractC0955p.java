package F8;

/* JADX INFO: renamed from: F8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0955p extends F8.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F8.l0 f2961c;

    public AbstractC0955p(F8.l0 l0Var) {
        p247y7.AbstractC7350t.f(l0Var, "substitution");
        this.f2961c = l0Var;
    }

    @Override // F8.l0
    public boolean a() {
        return this.f2961c.a();
    }

    @Override // F8.l0
    public P7.g d(P7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "annotations");
        return this.f2961c.d(gVar);
    }

    @Override // F8.l0
    public F8.i0 e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "key");
        return this.f2961c.e(e6);
    }

    @Override // F8.l0
    public boolean f() {
        return this.f2961c.f();
    }

    @Override // F8.l0
    public F8.E g(F8.E e6, F8.u0 u0Var) {
        p247y7.AbstractC7350t.f(e6, "topLevelType");
        p247y7.AbstractC7350t.f(u0Var, "position");
        return this.f2961c.g(e6, u0Var);
    }
}
