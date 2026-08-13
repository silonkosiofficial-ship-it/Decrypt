package W8;

/* JADX INFO: loaded from: classes2.dex */
final class P0 extends W8.E0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final W8.C1798n f15468G;

    public P0(W8.C1798n c1798n) {
        this.f15468G = c1798n;
    }

    @Override // W8.E0
    public boolean w() {
        return false;
    }

    @Override // W8.E0
    public void x(java.lang.Throwable th) {
        W8.C1798n c1798n;
        java.lang.Object objH;
        java.lang.Object objB0 = v().b0();
        if (objB0 instanceof W8.A) {
            c1798n = this.f15468G;
            i7.w.a aVar = p087i7.w.f46751D;
            objH = p087i7.x.a(((W8.A) objB0).f15423a);
        } else {
            c1798n = this.f15468G;
            i7.w.a aVar2 = p087i7.w.f46751D;
            objH = W8.G0.h(objB0);
        }
        c1798n.t(p087i7.w.b(objH));
    }
}
