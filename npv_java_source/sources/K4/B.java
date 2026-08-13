package K4;

/* JADX INFO: loaded from: classes3.dex */
final class B extends K4.y {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.C6932m f6096D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ K4.y f6097E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ K4.C1307d f6098F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(K4.C1307d c1307d, p115l4.C6932m c6932m, p115l4.C6932m c6932m2, K4.y yVar) {
        super(c6932m);
        this.f6098F = c1307d;
        this.f6096D = c6932m2;
        this.f6097E = yVar;
    }

    @Override // K4.y
    public final void b() {
        synchronized (this.f6098F.f6112f) {
            try {
                K4.C1307d.o(this.f6098F, this.f6096D);
                if (this.f6098F.f6118l.getAndIncrement() > 0) {
                    this.f6098F.f6108b.c("Already connected to the service.", new java.lang.Object[0]);
                }
                K4.C1307d.q(this.f6098F, this.f6097E);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
