package G6;

/* JADX INFO: loaded from: classes3.dex */
final class b implements H9.InterfaceC1240f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6.e f3042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W8.InterfaceC1794l f3043b;

    public b(O6.e eVar, W8.InterfaceC1794l interfaceC1794l) {
        p247y7.AbstractC7350t.f(eVar, "requestData");
        p247y7.AbstractC7350t.f(interfaceC1794l, "continuation");
        this.f3042a = eVar;
        this.f3043b = interfaceC1794l;
    }

    @Override // H9.InterfaceC1240f
    public void c(H9.InterfaceC1239e interfaceC1239e, H9.B b6) {
        p247y7.AbstractC7350t.f(interfaceC1239e, "call");
        p247y7.AbstractC7350t.f(b6, "response");
        if (interfaceC1239e.D()) {
            return;
        }
        this.f3043b.t(p087i7.w.b(b6));
    }

    @Override // H9.InterfaceC1240f
    public void d(H9.InterfaceC1239e interfaceC1239e, java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(interfaceC1239e, "call");
        p247y7.AbstractC7350t.f(iOException, "e");
        if (this.f3043b.isCancelled()) {
            return;
        }
        W8.InterfaceC1794l interfaceC1794l = this.f3043b;
        i7.w.a aVar = p087i7.w.f46751D;
        interfaceC1794l.t(p087i7.w.b(p087i7.x.a(G6.q.f(this.f3042a, iOException))));
    }
}
