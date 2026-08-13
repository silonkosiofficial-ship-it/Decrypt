package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.HandlerThread f55862a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.os.Handler f55863b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55864c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f55865d = new java.lang.Object();

    public final android.os.Handler a() {
        return this.f55863b;
    }

    public final android.os.Looper b() {
        android.os.Looper looper;
        synchronized (this.f55865d) {
            try {
                if (this.f55864c != 0) {
                    Q3.AbstractC1477p.m(this.f55862a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f55862a == null) {
                    p214v3.AbstractC7265q0.k("Starting the looper thread.");
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("LooperProvider");
                    this.f55862a = handlerThread;
                    handlerThread.start();
                    this.f55863b = new com.google.android.gms.internal.ads.HandlerC2345Fe0(this.f55862a.getLooper());
                    p214v3.AbstractC7265q0.k("Looper thread started.");
                } else {
                    p214v3.AbstractC7265q0.k("Resuming the looper thread");
                    this.f55865d.notifyAll();
                }
                this.f55864c++;
                looper = this.f55862a.getLooper();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
