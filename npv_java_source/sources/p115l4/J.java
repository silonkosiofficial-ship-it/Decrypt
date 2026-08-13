package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class J implements p115l4.InterfaceC6927h, p115l4.InterfaceC6926g, p115l4.InterfaceC6924e, p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f50009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p115l4.InterfaceC6930k f50010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p115l4.P f50011c;

    public J(java.util.concurrent.Executor executor, p115l4.InterfaceC6930k interfaceC6930k, p115l4.P p6) {
        this.f50009a = executor;
        this.f50010b = interfaceC6930k;
        this.f50011c = p6;
    }

    @Override // p115l4.InterfaceC6927h
    public final void a(java.lang.Object obj) {
        this.f50011c.s(obj);
    }

    @Override // p115l4.InterfaceC6924e
    public final void b() {
        this.f50011c.t();
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        this.f50009a.execute(new p115l4.I(this, abstractC6931l));
    }

    @Override // p115l4.InterfaceC6926g
    public final void d(java.lang.Exception exc) {
        this.f50011c.r(exc);
    }
}
