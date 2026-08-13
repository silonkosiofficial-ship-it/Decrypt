package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class E implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.AbstractC6931l f49997C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.F f49998D;

    E(p115l4.F f6, p115l4.AbstractC6931l abstractC6931l) {
        this.f49998D = f6;
        this.f49997C = abstractC6931l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f49998D.f50000b) {
            try {
                p115l4.F f6 = this.f49998D;
                if (f6.f50001c != null) {
                    f6.f50001c.d((java.lang.Exception) Q3.AbstractC1477p.l(this.f49997C.k()));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
