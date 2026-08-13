package p188s8;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements p188s8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.i0 f54406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private G8.j f54407b;

    public c(F8.i0 i0Var) {
        p247y7.AbstractC7350t.f(i0Var, "projection");
        this.f54406a = i0Var;
        a().a();
        F8.u0 u0Var = F8.u0.INVARIANT;
    }

    @Override // p188s8.b
    public F8.i0 a() {
        return this.f54406a;
    }

    public java.lang.Void b() {
        return null;
    }

    public final G8.j c() {
        return this.f54407b;
    }

    @Override // F8.e0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p188s8.c v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.i0 i0VarV = a().v(gVar);
        p247y7.AbstractC7350t.e(i0VarV, "refine(...)");
        return new p188s8.c(i0VarV);
    }

    public final void e(G8.j jVar) {
        this.f54407b = jVar;
    }

    @Override // F8.e0
    public L7.g t() {
        L7.g gVarT = a().getType().W0().t();
        p247y7.AbstractC7350t.e(gVarT, "getBuiltIns(...)");
        return gVarT;
    }

    public java.lang.String toString() {
        return "CapturedTypeConstructor(" + a() + ')';
    }

    @Override // F8.e0
    public java.util.Collection u() {
        F8.E type = a().a() == F8.u0.OUT_VARIANCE ? a().getType() : t().I();
        p247y7.AbstractC7350t.c(type);
        return p097j7.AbstractC6879v.e(type);
    }

    @Override // F8.e0
    public /* bridge */ /* synthetic */ O7.InterfaceC1427h w() {
        return (O7.InterfaceC1427h) b();
    }

    @Override // F8.e0
    public java.util.List x() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.e0
    public boolean y() {
        return false;
    }
}
