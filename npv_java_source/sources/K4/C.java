package K4;

/* JADX INFO: loaded from: classes3.dex */
final class C extends K4.y {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ K4.C1307d f6099D;

    C(K4.C1307d c1307d) {
        this.f6099D = c1307d;
    }

    @Override // K4.y
    public final void b() {
        synchronized (this.f6099D.f6112f) {
            try {
                if (this.f6099D.f6118l.get() > 0 && this.f6099D.f6118l.decrementAndGet() > 0) {
                    this.f6099D.f6108b.c("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                    return;
                }
                K4.C1307d c1307d = this.f6099D;
                if (c1307d.f6120n != null) {
                    c1307d.f6108b.c("Unbind from service.", new java.lang.Object[0]);
                    K4.C1307d c1307d2 = this.f6099D;
                    c1307d2.f6107a.unbindService(c1307d2.f6119m);
                    this.f6099D.f6113g = false;
                    this.f6099D.f6120n = null;
                    this.f6099D.f6119m = null;
                }
                this.f6099D.x();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
