package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class x implements p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f50043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p115l4.InterfaceC6922c f50044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p115l4.P f50045c;

    public x(java.util.concurrent.Executor executor, p115l4.InterfaceC6922c interfaceC6922c, p115l4.P p6) {
        this.f50043a = executor;
        this.f50044b = interfaceC6922c;
        this.f50045c = p6;
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        this.f50043a.execute(new p115l4.w(this, abstractC6931l));
    }
}
