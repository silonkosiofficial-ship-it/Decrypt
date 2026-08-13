package F8;

/* JADX INFO: renamed from: F8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0940a extends F8.AbstractC0956q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.M f2870D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F8.M f2871E;

    public C0940a(F8.M m6, F8.M m10) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        p247y7.AbstractC7350t.f(m10, "abbreviation");
        this.f2870D = m6;
        this.f2871E = m10;
    }

    public final F8.M c0() {
        return f1();
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return new F8.C0940a(f1().c1(a0Var), this.f2871E);
    }

    @Override // F8.AbstractC0956q
    protected F8.M f1() {
        return this.f2870D;
    }

    public final F8.M i1() {
        return this.f2871E;
    }

    @Override // F8.M
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public F8.C0940a a1(boolean z6) {
        return new F8.C0940a(f1().a1(z6), this.f2871E.a1(z6));
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public F8.C0940a g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.E eA = gVar.a(f1());
        p247y7.AbstractC7350t.d(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        F8.E eA2 = gVar.a(this.f2871E);
        p247y7.AbstractC7350t.d(eA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new F8.C0940a((F8.M) eA, (F8.M) eA2);
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public F8.C0940a h1(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        return new F8.C0940a(m6, this.f2871E);
    }
}
