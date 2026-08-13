package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y4.h f16382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f16383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f16384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile java.util.concurrent.ScheduledFuture f16385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f16386e = -1;

    k(Y4.h hVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f16382a = (Y4.h) Q3.AbstractC1477p.l(hVar);
        this.f16383b = executor;
        this.f16384c = scheduledExecutorService;
    }

    private long d() {
        if (this.f16386e == -1) {
            return 30L;
        }
        if (this.f16386e * 2 < 960) {
            return this.f16386e * 2;
        }
        return 960L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(java.lang.Exception exc) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f16382a.i().d(this.f16383b, new p115l4.InterfaceC6926g() { // from class: Y4.j
            @Override // p115l4.InterfaceC6926g
            public final void d(java.lang.Exception exc) {
                this.f16381a.e(exc);
            }
        });
    }

    private void h() {
        c();
        this.f16386e = d();
        this.f16385d = this.f16384c.schedule(new Y4.i(this), this.f16386e, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void c() {
        if (this.f16385d == null || this.f16385d.isDone()) {
            return;
        }
        this.f16385d.cancel(false);
    }

    public void g(long j6) {
        c();
        this.f16386e = -1L;
        this.f16385d = this.f16384c.schedule(new Y4.i(this), java.lang.Math.max(0L, j6), java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
