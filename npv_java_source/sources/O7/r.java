package O7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends O7.AbstractC1439u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.n0 f8181a;

    public r(O7.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "delegate");
        this.f8181a = n0Var;
    }

    @Override // O7.AbstractC1439u
    public O7.n0 b() {
        return this.f8181a;
    }

    @Override // O7.AbstractC1439u
    public java.lang.String c() {
        return b().b();
    }

    @Override // O7.AbstractC1439u
    public O7.AbstractC1439u f() {
        O7.AbstractC1439u abstractC1439uJ = O7.AbstractC1438t.j(b().d());
        p247y7.AbstractC7350t.e(abstractC1439uJ, "toDescriptorVisibility(...)");
        return abstractC1439uJ;
    }
}
