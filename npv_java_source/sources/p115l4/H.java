package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class H implements p115l4.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f50004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f50005b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p115l4.InterfaceC6927h f50006c;

    public H(java.util.concurrent.Executor executor, p115l4.InterfaceC6927h interfaceC6927h) {
        this.f50004a = executor;
        this.f50006c = interfaceC6927h;
    }

    @Override // p115l4.K
    public final void c(p115l4.AbstractC6931l abstractC6931l) {
        if (abstractC6931l.o()) {
            synchronized (this.f50005b) {
                try {
                    if (this.f50006c == null) {
                        return;
                    }
                    this.f50004a.execute(new p115l4.G(this, abstractC6931l));
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
