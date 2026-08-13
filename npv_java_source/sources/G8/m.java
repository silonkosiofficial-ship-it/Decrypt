package G8;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements G8.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G8.g f3157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G8.f f3158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p178r8.l f3159e;

    public m(G8.g gVar, G8.f fVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        p247y7.AbstractC7350t.f(fVar, "kotlinTypePreparator");
        this.f3157c = gVar;
        this.f3158d = fVar;
        p178r8.l lVarM = p178r8.l.m(c());
        p247y7.AbstractC7350t.e(lVarM, "createWithTypeRefiner(...)");
        this.f3159e = lVarM;
    }

    public /* synthetic */ m(G8.g gVar, G8.f fVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, (i6 & 2) != 0 ? G8.f.a.f3135a : fVar);
    }

    @Override // G8.l
    public p178r8.l a() {
        return this.f3159e;
    }

    @Override // G8.e
    public boolean b(F8.E e6, F8.E e10) {
        p247y7.AbstractC7350t.f(e6, "a");
        p247y7.AbstractC7350t.f(e10, "b");
        return e(G8.a.b(false, false, null, f(), c(), 6, null), e6.Z0(), e10.Z0());
    }

    @Override // G8.l
    public G8.g c() {
        return this.f3157c;
    }

    @Override // G8.e
    public boolean d(F8.E e6, F8.E e10) {
        p247y7.AbstractC7350t.f(e6, "subtype");
        p247y7.AbstractC7350t.f(e10, "supertype");
        return g(G8.a.b(true, false, null, f(), c(), 6, null), e6.Z0(), e10.Z0());
    }

    public final boolean e(F8.d0 d0Var, F8.t0 t0Var, F8.t0 t0Var2) {
        p247y7.AbstractC7350t.f(d0Var, "<this>");
        p247y7.AbstractC7350t.f(t0Var, "a");
        p247y7.AbstractC7350t.f(t0Var2, "b");
        return F8.C0944e.f2895a.k(d0Var, t0Var, t0Var2);
    }

    public G8.f f() {
        return this.f3158d;
    }

    public final boolean g(F8.d0 d0Var, F8.t0 t0Var, F8.t0 t0Var2) {
        p247y7.AbstractC7350t.f(d0Var, "<this>");
        p247y7.AbstractC7350t.f(t0Var, "subType");
        p247y7.AbstractC7350t.f(t0Var2, "superType");
        return F8.C0944e.t(F8.C0944e.f2895a, d0Var, t0Var, t0Var2, false, 8, null);
    }
}
