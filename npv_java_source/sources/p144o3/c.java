package p144o3;

/* JADX INFO: loaded from: classes.dex */
final class c extends java.lang.Thread {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.ref.WeakReference f52546C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f52547D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final java.util.concurrent.CountDownLatch f52548E = new java.util.concurrent.CountDownLatch(1);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f52549F = false;

    public c(p144o3.a aVar, long j6) {
        this.f52546C = new java.lang.ref.WeakReference(aVar);
        this.f52547D = j6;
        start();
    }

    private final void a() {
        p144o3.a aVar = (p144o3.a) this.f52546C.get();
        if (aVar != null) {
            aVar.f();
            this.f52549F = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f52548E.await(this.f52547D, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (java.lang.InterruptedException unused) {
            a();
        }
    }
}
