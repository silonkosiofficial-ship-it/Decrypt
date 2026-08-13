package Q3;

/* JADX INFO: loaded from: classes.dex */
final class q0 extends Q3.AbstractC1469h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.HashMap f9006f = new java.util.HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.Context f9007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile android.os.Handler f9008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q3.p0 f9009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final U3.b f9010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f9011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f9012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile java.util.concurrent.Executor f9013m;

    q0(android.content.Context context, android.os.Looper looper, java.util.concurrent.Executor executor) {
        Q3.p0 p0Var = new Q3.p0(this, null);
        this.f9009i = p0Var;
        this.f9007g = context.getApplicationContext();
        this.f9008h = new p045e4.e(looper, p0Var);
        this.f9010j = U3.b.b();
        this.f9011k = 5000L;
        this.f9012l = 300000L;
        this.f9013m = executor;
    }

    @Override // Q3.AbstractC1469h
    protected final void c(Q3.l0 l0Var, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        Q3.AbstractC1477p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9006f) {
            try {
                Q3.n0 n0Var = (Q3.n0) this.f9006f.get(l0Var);
                if (n0Var == null) {
                    throw new java.lang.IllegalStateException("Nonexistent connection status for service config: " + l0Var.toString());
                }
                if (!n0Var.h(serviceConnection)) {
                    throw new java.lang.IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + l0Var.toString());
                }
                n0Var.f(serviceConnection, str);
                if (n0Var.i()) {
                    this.f9008h.sendMessageDelayed(this.f9008h.obtainMessage(0, l0Var), this.f9011k);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q3.AbstractC1469h
    protected final boolean e(Q3.l0 l0Var, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        boolean zJ;
        Q3.AbstractC1477p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9006f) {
            try {
                Q3.n0 n0Var = (Q3.n0) this.f9006f.get(l0Var);
                if (executor == null) {
                    executor = this.f9013m;
                }
                if (n0Var == null) {
                    n0Var = new Q3.n0(this, l0Var);
                    n0Var.d(serviceConnection, serviceConnection, str);
                    n0Var.e(str, executor);
                    this.f9006f.put(l0Var, n0Var);
                } else {
                    this.f9008h.removeMessages(0, l0Var);
                    if (n0Var.h(serviceConnection)) {
                        throw new java.lang.IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + l0Var.toString());
                    }
                    n0Var.d(serviceConnection, serviceConnection, str);
                    int iA = n0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(n0Var.b(), n0Var.c());
                    } else if (iA == 2) {
                        n0Var.e(str, executor);
                    }
                }
                zJ = n0Var.j();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
