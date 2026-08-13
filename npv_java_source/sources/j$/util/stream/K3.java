package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class K3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.Runnable f48273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.Runnable f48274b;

    K3(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f48273a = runnable;
        this.f48274b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.f48274b;
        try {
            this.f48273a.run();
            runnable.run();
        } catch (java.lang.Throwable th) {
            try {
                runnable.run();
            } catch (java.lang.Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (java.lang.Throwable unused) {
                }
            }
            throw th;
        }
    }
}
