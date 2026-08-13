package T;

/* JADX INFO: loaded from: classes.dex */
public final class v implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f12877b;

    public v(A.S s6) {
        this.f12877b = V.A1.d(s6, null, 2, null);
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        return e().a(eVar, vVar);
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        return e().b(eVar);
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        return e().c(eVar);
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        return e().d(eVar, vVar);
    }

    public final A.S e() {
        return (A.S) this.f12877b.getValue();
    }

    public final void f(A.S s6) {
        this.f12877b.setValue(s6);
    }
}
