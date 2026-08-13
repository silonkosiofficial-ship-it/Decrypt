package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends F8.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.E f2855a;

    public S(L7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinBuiltIns");
        F8.M mI = gVar.I();
        p247y7.AbstractC7350t.e(mI, "getNullableAnyType(...)");
        this.f2855a = mI;
    }

    @Override // F8.i0
    public F8.u0 a() {
        return F8.u0.OUT_VARIANCE;
    }

    @Override // F8.i0
    public boolean b() {
        return true;
    }

    @Override // F8.i0
    public F8.E getType() {
        return this.f2855a;
    }

    @Override // F8.i0
    public F8.i0 v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this;
    }
}
