package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class C implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.AbstractC6931l f49992C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.D f49993D;

    C(p115l4.D d6, p115l4.AbstractC6931l abstractC6931l) {
        this.f49993D = d6;
        this.f49992C = abstractC6931l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f49993D.f49995b) {
            try {
                p115l4.D d6 = this.f49993D;
                if (d6.f49996c != null) {
                    d6.f49996c.a(this.f49992C);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
