package F8;

/* JADX INFO: loaded from: classes2.dex */
final class N extends F8.M {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.e0 f2847D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.List f2848E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f2849F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p248y8.h f2850G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p237x7.l f2851H;

    public N(F8.e0 e0Var, java.util.List list, boolean z6, p248y8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(hVar, "memberScope");
        p247y7.AbstractC7350t.f(lVar, "refinedTypeFactory");
        this.f2847D = e0Var;
        this.f2848E = list;
        this.f2849F = z6;
        this.f2850G = hVar;
        this.f2851H = lVar;
        if (!(u() instanceof H8.f) || (u() instanceof H8.l)) {
            return;
        }
        throw new java.lang.IllegalStateException("SimpleTypeImpl should not be created for error type: " + u() + '\n' + W0());
    }

    @Override // F8.E
    public java.util.List U0() {
        return this.f2848E;
    }

    @Override // F8.E
    public F8.a0 V0() {
        return F8.a0.f2872D.i();
    }

    @Override // F8.E
    public F8.e0 W0() {
        return this.f2847D;
    }

    @Override // F8.E
    public boolean X0() {
        return this.f2849F;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: d1 */
    public F8.M a1(boolean z6) {
        if (z6 == X0()) {
            return this;
        }
        return z6 ? new F8.K(this) : new F8.I(this);
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return a0Var.isEmpty() ? this : new F8.O(this, a0Var);
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public F8.M g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.M m6 = (F8.M) this.f2851H.l(gVar);
        return m6 == null ? this : m6;
    }

    @Override // F8.E
    public p248y8.h u() {
        return this.f2850G;
    }
}
