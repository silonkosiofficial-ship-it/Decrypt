package p086i5;

/* JADX INFO: loaded from: classes3.dex */
public class c implements p086i5.b, p086i5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p086i5.e f46689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.TimeUnit f46691c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f46693e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f46692d = new java.lang.Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46694f = false;

    public c(p086i5.e eVar, int i6, java.util.concurrent.TimeUnit timeUnit) {
        this.f46689a = eVar;
        this.f46690b = i6;
        this.f46691c = timeUnit;
    }

    @Override // p086i5.a
    public void a(java.lang.String str, android.os.Bundle bundle) {
        synchronized (this.f46692d) {
            try {
                p076h5.g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f46693e = new java.util.concurrent.CountDownLatch(1);
                this.f46694f = false;
                this.f46689a.a(str, bundle);
                p076h5.g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f46693e.await(this.f46690b, this.f46691c)) {
                        this.f46694f = true;
                        p076h5.g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        p076h5.g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (java.lang.InterruptedException unused) {
                    p076h5.g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f46693e = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p086i5.b
    public void b(java.lang.String str, android.os.Bundle bundle) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f46693e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
