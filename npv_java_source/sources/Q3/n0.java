package Q3;

/* JADX INFO: loaded from: classes.dex */
final class n0 implements android.content.ServiceConnection, Q3.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f8994a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8995b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.os.IBinder f8997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q3.l0 f8998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.content.ComponentName f8999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q3.q0 f9000g;

    public n0(Q3.q0 q0Var, Q3.l0 l0Var) {
        this.f9000g = q0Var;
        this.f8998e = l0Var;
    }

    public final int a() {
        return this.f8995b;
    }

    public final android.content.ComponentName b() {
        return this.f8999f;
    }

    public final android.os.IBinder c() {
        return this.f8997d;
    }

    public final void d(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2, java.lang.String str) {
        this.f8994a.put(serviceConnection, serviceConnection2);
    }

    public final void e(java.lang.String str, java.util.concurrent.Executor executor) {
        this.f8995b = 3;
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (V3.n.l()) {
            android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            Q3.q0 q0Var = this.f9000g;
            boolean zD = q0Var.f9010j.d(q0Var.f9007g, str, this.f8998e.b(q0Var.f9007g), this, 4225, executor);
            this.f8996c = zD;
            if (zD) {
                this.f9000g.f9008h.sendMessageDelayed(this.f9000g.f9008h.obtainMessage(1, this.f8998e), this.f9000g.f9012l);
            } else {
                this.f8995b = 2;
                try {
                    Q3.q0 q0Var2 = this.f9000g;
                    q0Var2.f9010j.c(q0Var2.f9007g, this);
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        } finally {
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        this.f8994a.remove(serviceConnection);
    }

    public final void g(java.lang.String str) {
        this.f9000g.f9008h.removeMessages(1, this.f8998e);
        Q3.q0 q0Var = this.f9000g;
        q0Var.f9010j.c(q0Var.f9007g, this);
        this.f8996c = false;
        this.f8995b = 2;
    }

    public final boolean h(android.content.ServiceConnection serviceConnection) {
        return this.f8994a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f8994a.isEmpty();
    }

    public final boolean j() {
        return this.f8996c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.f9000g.f9006f) {
            try {
                this.f9000g.f9008h.removeMessages(1, this.f8998e);
                this.f8997d = iBinder;
                this.f8999f = componentName;
                java.util.Iterator it = this.f8994a.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8995b = 1;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f9000g.f9006f) {
            try {
                this.f9000g.f9008h.removeMessages(1, this.f8998e);
                this.f8997d = null;
                this.f8999f = componentName;
                java.util.Iterator it = this.f8994a.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8995b = 2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
