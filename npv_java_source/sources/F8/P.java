package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends F8.AbstractC0956q implements F8.r0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.M f2853D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F8.E f2854E;

    public P(F8.M m6, F8.E e6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        p247y7.AbstractC7350t.f(e6, "enhancement");
        this.f2853D = m6;
        this.f2854E = e6;
    }

    @Override // F8.r0
    public F8.E M() {
        return this.f2854E;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: d1 */
    public F8.M a1(boolean z6) {
        F8.t0 t0VarD = F8.s0.d(O0().a1(z6), M().Z0().a1(z6));
        p247y7.AbstractC7350t.d(t0VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (F8.M) t0VarD;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        F8.t0 t0VarD = F8.s0.d(O0().c1(a0Var), M());
        p247y7.AbstractC7350t.d(t0VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (F8.M) t0VarD;
    }

    @Override // F8.AbstractC0956q
    protected F8.M f1() {
        return this.f2853D;
    }

    @Override // F8.r0
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public F8.M O0() {
        return f1();
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public F8.P g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.E eA = gVar.a(f1());
        p247y7.AbstractC7350t.d(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new F8.P((F8.M) eA, gVar.a(M()));
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public F8.P h1(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        return new F8.P(m6, M());
    }

    @Override // F8.M
    public java.lang.String toString() {
        return "[@EnhancedForWarnings(" + M() + ")] " + O0();
    }
}
