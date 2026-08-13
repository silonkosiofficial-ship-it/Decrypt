package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class z implements p115l4.InterfaceC6927h, p115l4.InterfaceC6926g, p115l4.InterfaceC6924e, p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f50048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p115l4.InterfaceC6922c f50049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p115l4.P f50050c;

    public z(java.util.concurrent.Executor executor, p115l4.InterfaceC6922c interfaceC6922c, p115l4.P p6) {
        this.f50048a = executor;
        this.f50049b = interfaceC6922c;
        this.f50050c = p6;
    }

    @Override // p115l4.InterfaceC6927h
    public final void a(java.lang.Object obj) {
        this.f50050c.s(obj);
    }

    @Override // p115l4.InterfaceC6924e
    public final void b() {
        this.f50050c.t();
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        this.f50048a.execute(new p115l4.y(this, abstractC6931l));
    }

    @Override // p115l4.InterfaceC6926g
    public final void d(java.lang.Exception exc) {
        this.f50050c.r(exc);
    }
}
