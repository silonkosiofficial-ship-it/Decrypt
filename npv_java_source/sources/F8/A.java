package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends F8.AbstractC0963y implements F8.r0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final F8.AbstractC0963y f2815F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final F8.E f2816G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(F8.AbstractC0963y abstractC0963y, F8.E e6) {
        super(abstractC0963y.e1(), abstractC0963y.f1());
        p247y7.AbstractC7350t.f(abstractC0963y, "origin");
        p247y7.AbstractC7350t.f(e6, "enhancement");
        this.f2815F = abstractC0963y;
        this.f2816G = e6;
    }

    @Override // F8.r0
    public F8.E M() {
        return this.f2816G;
    }

    @Override // F8.t0
    public F8.t0 a1(boolean z6) {
        return F8.s0.d(O0().a1(z6), M().Z0().a1(z6));
    }

    @Override // F8.t0
    public F8.t0 c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return F8.s0.d(O0().c1(a0Var), M());
    }

    @Override // F8.AbstractC0963y
    public F8.M d1() {
        return O0().d1();
    }

    @Override // F8.AbstractC0963y
    public java.lang.String g1(p168q8.c cVar, p168q8.f fVar) {
        p247y7.AbstractC7350t.f(cVar, "renderer");
        p247y7.AbstractC7350t.f(fVar, "options");
        return fVar.g() ? cVar.w(M()) : O0().g1(cVar, fVar);
    }

    @Override // F8.r0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public F8.AbstractC0963y O0() {
        return this.f2815F;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public F8.A g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.E eA = gVar.a(O0());
        p247y7.AbstractC7350t.d(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new F8.A((F8.AbstractC0963y) eA, gVar.a(M()));
    }

    @Override // F8.AbstractC0963y
    public java.lang.String toString() {
        return "[@EnhancedForWarnings(" + M() + ")] " + O0();
    }
}
