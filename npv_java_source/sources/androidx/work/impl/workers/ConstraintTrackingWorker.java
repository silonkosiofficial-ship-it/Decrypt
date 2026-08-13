package androidx.work.impl.workers;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends androidx.work.ListenableWorker implements M2.c {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final java.lang.String f23982M = I2.j.f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.work.WorkerParameters f23983H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final java.lang.Object f23984I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    volatile boolean f23985J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f23986K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private androidx.work.ListenableWorker f23987L;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.work.impl.workers.ConstraintTrackingWorker.this.e();
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ P4.d f23989C;

        b(P4.d dVar) {
            this.f23989C = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (androidx.work.impl.workers.ConstraintTrackingWorker.this.f23984I) {
                try {
                    if (androidx.work.impl.workers.ConstraintTrackingWorker.this.f23985J) {
                        androidx.work.impl.workers.ConstraintTrackingWorker.this.d();
                    } else {
                        androidx.work.impl.workers.ConstraintTrackingWorker.this.f23986K.s(this.f23989C);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f23983H = workerParameters;
        this.f23984I = new java.lang.Object();
        this.f23985J = false;
        this.f23986K = androidx.work.impl.utils.futures.c.u();
    }

    public androidx.work.impl.WorkDatabase a() {
        return J2.j.k(getApplicationContext()).o();
    }

    @Override // M2.c
    public void b(java.util.List list) {
        I2.j.c().a(f23982M, java.lang.String.format("Constraints changed for %s", list), new java.lang.Throwable[0]);
        synchronized (this.f23984I) {
            this.f23985J = true;
        }
    }

    void c() {
        this.f23986K.q(androidx.work.ListenableWorker.a.a());
    }

    void d() {
        this.f23986K.q(androidx.work.ListenableWorker.a.b());
    }

    void e() {
        java.lang.String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (android.text.TextUtils.isEmpty(strI)) {
            I2.j.c().b(f23982M, "No worker to delegate to.", new java.lang.Throwable[0]);
        } else {
            androidx.work.ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.f23983H);
            this.f23987L = listenableWorkerB;
            if (listenableWorkerB != null) {
                Q2.p pVarN = a().Y().n(getId().toString());
                if (pVarN == null) {
                    c();
                    return;
                }
                M2.d dVar = new M2.d(getApplicationContext(), getTaskExecutor(), this);
                dVar.d(java.util.Collections.singletonList(pVarN));
                if (!dVar.c(getId().toString())) {
                    I2.j.c().a(f23982M, java.lang.String.format("Constraints not met for delegate %s. Requesting retry.", strI), new java.lang.Throwable[0]);
                    d();
                    return;
                }
                I2.j.c().a(f23982M, java.lang.String.format("Constraints met for delegate %s", strI), new java.lang.Throwable[0]);
                try {
                    P4.d dVarStartWork = this.f23987L.startWork();
                    dVarStartWork.e(new androidx.work.impl.workers.ConstraintTrackingWorker.b(dVarStartWork), getBackgroundExecutor());
                    return;
                } catch (java.lang.Throwable th) {
                    I2.j jVarC = I2.j.c();
                    java.lang.String str = f23982M;
                    jVarC.a(str, java.lang.String.format("Delegated worker %s threw exception in startWork.", strI), th);
                    synchronized (this.f23984I) {
                        try {
                            if (this.f23985J) {
                                I2.j.c().a(str, "Constraints were unmet, Retrying.", new java.lang.Throwable[0]);
                                d();
                            } else {
                                c();
                            }
                            return;
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            I2.j.c().a(f23982M, "No worker to delegate to.", new java.lang.Throwable[0]);
        }
        c();
    }

    @Override // M2.c
    public void f(java.util.List list) {
    }

    @Override // androidx.work.ListenableWorker
    public S2.a getTaskExecutor() {
        return J2.j.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        androidx.work.ListenableWorker listenableWorker = this.f23987L;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        androidx.work.ListenableWorker listenableWorker = this.f23987L;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f23987L.stop();
    }

    @Override // androidx.work.ListenableWorker
    public P4.d startWork() {
        getBackgroundExecutor().execute(new androidx.work.impl.workers.ConstraintTrackingWorker.a());
        return this.f23986K;
    }
}
