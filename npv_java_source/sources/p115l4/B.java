package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class B implements p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f49989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f49990b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p115l4.InterfaceC6924e f49991c;

    public B(java.util.concurrent.Executor executor, p115l4.InterfaceC6924e interfaceC6924e) {
        this.f49989a = executor;
        this.f49991c = interfaceC6924e;
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        if (abstractC6931l.m()) {
            synchronized (this.f49990b) {
                try {
                    if (this.f49991c == null) {
                        return;
                    }
                    this.f49989a.execute(new p115l4.A(this));
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
