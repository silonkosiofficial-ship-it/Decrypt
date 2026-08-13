package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class F implements p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f49999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f50000b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p115l4.InterfaceC6926g f50001c;

    public F(java.util.concurrent.Executor executor, p115l4.InterfaceC6926g interfaceC6926g) {
        this.f49999a = executor;
        this.f50001c = interfaceC6926g;
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        if (abstractC6931l.o() || abstractC6931l.m()) {
            return;
        }
        synchronized (this.f50000b) {
            try {
                if (this.f50001c == null) {
                    return;
                }
                this.f49999a.execute(new p115l4.E(this, abstractC6931l));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
