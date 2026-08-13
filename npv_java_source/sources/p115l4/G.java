package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class G implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.AbstractC6931l f50002C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.H f50003D;

    G(p115l4.H h6, p115l4.AbstractC6931l abstractC6931l) {
        this.f50003D = h6;
        this.f50002C = abstractC6931l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f50003D.f50005b) {
            try {
                p115l4.H h6 = this.f50003D;
                if (h6.f50006c != null) {
                    h6.f50006c.a(this.f50002C.l());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
