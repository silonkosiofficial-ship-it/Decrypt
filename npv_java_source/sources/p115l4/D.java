package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class D implements p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f49994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f49995b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p115l4.InterfaceC6925f f49996c;

    public D(java.util.concurrent.Executor executor, p115l4.InterfaceC6925f interfaceC6925f) {
        this.f49994a = executor;
        this.f49996c = interfaceC6925f;
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        synchronized (this.f49995b) {
            try {
                if (this.f49996c == null) {
                    return;
                }
                this.f49994a.execute(new p115l4.C(this, abstractC6931l));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
