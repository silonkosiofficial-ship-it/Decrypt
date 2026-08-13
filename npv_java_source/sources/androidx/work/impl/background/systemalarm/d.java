package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public class d implements M2.c, J2.b, R2.r.b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final java.lang.String f23888L = I2.j.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f23889C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f23890D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f23891E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.work.impl.background.systemalarm.e f23892F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final M2.d f23893G;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private android.os.PowerManager.WakeLock f23896J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f23897K = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f23895I = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.lang.Object f23894H = new java.lang.Object();

    d(android.content.Context context, int i6, java.lang.String str, androidx.work.impl.background.systemalarm.e eVar) {
        this.f23889C = context;
        this.f23890D = i6;
        this.f23892F = eVar;
        this.f23891E = str;
        this.f23893G = new M2.d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f23894H) {
            try {
                this.f23893G.e();
                this.f23892F.h().c(this.f23891E);
                android.os.PowerManager.WakeLock wakeLock = this.f23896J;
                if (wakeLock != null && wakeLock.isHeld()) {
                    I2.j.c().a(f23888L, java.lang.String.format("Releasing wakelock %s for WorkSpec %s", this.f23896J, this.f23891E), new java.lang.Throwable[0]);
                    this.f23896J.release();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void g() {
        synchronized (this.f23894H) {
            try {
                if (this.f23895I < 2) {
                    this.f23895I = 2;
                    I2.j jVarC = I2.j.c();
                    java.lang.String str = f23888L;
                    jVarC.a(str, java.lang.String.format("Stopping work for WorkSpec %s", this.f23891E), new java.lang.Throwable[0]);
                    android.content.Intent intentF = androidx.work.impl.background.systemalarm.b.f(this.f23889C, this.f23891E);
                    androidx.work.impl.background.systemalarm.e eVar = this.f23892F;
                    eVar.k(new androidx.work.impl.background.systemalarm.e.b(eVar, intentF, this.f23890D));
                    if (this.f23892F.e().g(this.f23891E)) {
                        I2.j.c().a(str, java.lang.String.format("WorkSpec %s needs to be rescheduled", this.f23891E), new java.lang.Throwable[0]);
                        android.content.Intent intentE = androidx.work.impl.background.systemalarm.b.e(this.f23889C, this.f23891E);
                        androidx.work.impl.background.systemalarm.e eVar2 = this.f23892F;
                        eVar2.k(new androidx.work.impl.background.systemalarm.e.b(eVar2, intentE, this.f23890D));
                    } else {
                        I2.j.c().a(str, java.lang.String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f23891E), new java.lang.Throwable[0]);
                    }
                } else {
                    I2.j.c().a(f23888L, java.lang.String.format("Already stopped work for %s", this.f23891E), new java.lang.Throwable[0]);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.r.b
    public void a(java.lang.String str) {
        I2.j.c().a(f23888L, java.lang.String.format("Exceeded time limits on execution for %s", str), new java.lang.Throwable[0]);
        g();
    }

    @Override // M2.c
    public void b(java.util.List list) {
        g();
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        I2.j.c().a(f23888L, java.lang.String.format("onExecuted %s, %s", str, java.lang.Boolean.valueOf(z6)), new java.lang.Throwable[0]);
        d();
        if (z6) {
            android.content.Intent intentE = androidx.work.impl.background.systemalarm.b.e(this.f23889C, this.f23891E);
            androidx.work.impl.background.systemalarm.e eVar = this.f23892F;
            eVar.k(new androidx.work.impl.background.systemalarm.e.b(eVar, intentE, this.f23890D));
        }
        if (this.f23897K) {
            android.content.Intent intentA = androidx.work.impl.background.systemalarm.b.a(this.f23889C);
            androidx.work.impl.background.systemalarm.e eVar2 = this.f23892F;
            eVar2.k(new androidx.work.impl.background.systemalarm.e.b(eVar2, intentA, this.f23890D));
        }
    }

    void e() {
        this.f23896J = R2.n.b(this.f23889C, java.lang.String.format("%s (%s)", this.f23891E, java.lang.Integer.valueOf(this.f23890D)));
        I2.j jVarC = I2.j.c();
        java.lang.String str = f23888L;
        jVarC.a(str, java.lang.String.format("Acquiring wakelock %s for WorkSpec %s", this.f23896J, this.f23891E), new java.lang.Throwable[0]);
        this.f23896J.acquire();
        Q2.p pVarN = this.f23892F.g().o().Y().n(this.f23891E);
        if (pVarN == null) {
            g();
            return;
        }
        boolean zB = pVarN.b();
        this.f23897K = zB;
        if (zB) {
            this.f23893G.d(java.util.Collections.singletonList(pVarN));
        } else {
            I2.j.c().a(str, java.lang.String.format("No constraints for %s", this.f23891E), new java.lang.Throwable[0]);
            f(java.util.Collections.singletonList(this.f23891E));
        }
    }

    @Override // M2.c
    public void f(java.util.List list) {
        if (list.contains(this.f23891E)) {
            synchronized (this.f23894H) {
                try {
                    if (this.f23895I == 0) {
                        this.f23895I = 1;
                        I2.j.c().a(f23888L, java.lang.String.format("onAllConstraintsMet for %s", this.f23891E), new java.lang.Throwable[0]);
                        if (this.f23892F.e().j(this.f23891E)) {
                            this.f23892F.h().b(this.f23891E, 600000L, this);
                        } else {
                            d();
                        }
                    } else {
                        I2.j.c().a(f23888L, java.lang.String.format("Already started work for %s", this.f23891E), new java.lang.Throwable[0]);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
