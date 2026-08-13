package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.core.os.e.a f21588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f21589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21590d;

    public interface a {
        void onCancel();
    }

    private void c() {
        while (this.f21590d) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f21587a) {
                    return;
                }
                this.f21587a = true;
                this.f21590d = true;
                androidx.core.os.e.a aVar = this.f21588b;
                java.lang.Object obj = this.f21589c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (java.lang.Throwable th) {
                        synchronized (this) {
                            this.f21590d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((android.os.CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f21590d = false;
                    notifyAll();
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(androidx.core.os.e.a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f21588b == aVar) {
                    return;
                }
                this.f21588b = aVar;
                if (this.f21587a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
