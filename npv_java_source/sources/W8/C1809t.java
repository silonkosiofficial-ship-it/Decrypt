package W8;

/* JADX INFO: renamed from: W8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1809t extends W8.E0 implements W8.InterfaceC1807s {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final W8.InterfaceC1811u f15532G;

    public C1809t(W8.InterfaceC1811u interfaceC1811u) {
        this.f15532G = interfaceC1811u;
    }

    @Override // W8.InterfaceC1807s
    public boolean g(java.lang.Throwable th) {
        return v().K(th);
    }

    @Override // W8.InterfaceC1807s
    public W8.InterfaceC1822z0 getParent() {
        return v();
    }

    @Override // W8.E0
    public boolean w() {
        return true;
    }

    @Override // W8.E0
    public void x(java.lang.Throwable th) {
        this.f15532G.r0(v());
    }
}
