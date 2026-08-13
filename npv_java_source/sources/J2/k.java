package J2;

/* JADX INFO: loaded from: classes.dex */
public class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    static final java.lang.String f5690V = I2.j.f("WorkerWrapper");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    android.content.Context f5691C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.String f5692D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.List f5693E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.work.WorkerParameters.a f5694F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    Q2.p f5695G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    androidx.work.ListenableWorker f5696H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    S2.a f5697I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private androidx.work.a f5699K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private P2.a f5700L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private androidx.work.impl.WorkDatabase f5701M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Q2.q f5702N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Q2.b f5703O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Q2.t f5704P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private java.util.List f5705Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.lang.String f5706R;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private volatile boolean f5709U;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    androidx.work.ListenableWorker.a f5698J = androidx.work.ListenableWorker.a.a();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f5707S = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    P4.d f5708T = null;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ P4.d f5710C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f5711D;

        a(P4.d dVar, androidx.work.impl.utils.futures.c cVar) {
            this.f5710C = dVar;
            this.f5711D = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5710C.get();
                I2.j.c().a(J2.k.f5690V, java.lang.String.format("Starting work for %s", J2.k.this.f5695G.f8805c), new java.lang.Throwable[0]);
                J2.k kVar = J2.k.this;
                kVar.f5708T = kVar.f5696H.startWork();
                this.f5711D.s(J2.k.this.f5708T);
            } catch (java.lang.Throwable th) {
                this.f5711D.r(th);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f5713C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5714D;

        b(androidx.work.impl.utils.futures.c cVar, java.lang.String str) {
            this.f5713C = cVar;
            this.f5714D = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    androidx.work.ListenableWorker.a aVar = (androidx.work.ListenableWorker.a) this.f5713C.get();
                    if (aVar == null) {
                        I2.j.c().b(J2.k.f5690V, java.lang.String.format("%s returned a null result. Treating it as a failure.", J2.k.this.f5695G.f8805c), new java.lang.Throwable[0]);
                    } else {
                        I2.j.c().a(J2.k.f5690V, java.lang.String.format("%s returned a %s result.", J2.k.this.f5695G.f8805c, aVar), new java.lang.Throwable[0]);
                        J2.k.this.f5698J = aVar;
                    }
                } catch (java.lang.InterruptedException e6) {
                    e = e6;
                    I2.j.c().b(J2.k.f5690V, java.lang.String.format("%s failed because it threw an exception/error", this.f5714D), e);
                } catch (java.util.concurrent.CancellationException e10) {
                    I2.j.c().d(J2.k.f5690V, java.lang.String.format("%s was cancelled", this.f5714D), e10);
                } catch (java.util.concurrent.ExecutionException e11) {
                    e = e11;
                    I2.j.c().b(J2.k.f5690V, java.lang.String.format("%s failed because it threw an exception/error", this.f5714D), e);
                }
                J2.k.this.f();
            } catch (java.lang.Throwable th) {
                J2.k.this.f();
                throw th;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.content.Context f5716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.work.ListenableWorker f5717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        P2.a f5718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        S2.a f5719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.work.a f5720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.work.impl.WorkDatabase f5721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        java.lang.String f5722g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        java.util.List f5723h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.work.WorkerParameters.a f5724i = new androidx.work.WorkerParameters.a();

        public c(android.content.Context context, androidx.work.a aVar, S2.a aVar2, P2.a aVar3, androidx.work.impl.WorkDatabase workDatabase, java.lang.String str) {
            this.f5716a = context.getApplicationContext();
            this.f5719d = aVar2;
            this.f5718c = aVar3;
            this.f5720e = aVar;
            this.f5721f = workDatabase;
            this.f5722g = str;
        }

        public J2.k a() {
            return new J2.k(this);
        }

        public J2.k.c b(androidx.work.WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f5724i = aVar;
            }
            return this;
        }

        public J2.k.c c(java.util.List list) {
            this.f5723h = list;
            return this;
        }
    }

    k(J2.k.c cVar) {
        this.f5691C = cVar.f5716a;
        this.f5697I = cVar.f5719d;
        this.f5700L = cVar.f5718c;
        this.f5692D = cVar.f5722g;
        this.f5693E = cVar.f5723h;
        this.f5694F = cVar.f5724i;
        this.f5696H = cVar.f5717b;
        this.f5699K = cVar.f5720e;
        androidx.work.impl.WorkDatabase workDatabase = cVar.f5721f;
        this.f5701M = workDatabase;
        this.f5702N = workDatabase.Y();
        this.f5703O = this.f5701M.Q();
        this.f5704P = this.f5701M.Z();
    }

    private java.lang.String a(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Work [ id=");
        sb.append(this.f5692D);
        sb.append(", tags={ ");
        java.util.Iterator it = list.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(androidx.work.ListenableWorker.a aVar) {
        if (aVar instanceof androidx.work.ListenableWorker.a.c) {
            I2.j.c().d(f5690V, java.lang.String.format("Worker result SUCCESS for %s", this.f5706R), new java.lang.Throwable[0]);
            if (!this.f5695G.d()) {
                m();
                return;
            }
        } else if (aVar instanceof androidx.work.ListenableWorker.a.b) {
            I2.j.c().d(f5690V, java.lang.String.format("Worker result RETRY for %s", this.f5706R), new java.lang.Throwable[0]);
            g();
            return;
        } else {
            I2.j.c().d(f5690V, java.lang.String.format("Worker result FAILURE for %s", this.f5706R), new java.lang.Throwable[0]);
            if (!this.f5695G.d()) {
                l();
                return;
            }
        }
        h();
    }

    private void e(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            java.lang.String str2 = (java.lang.String) linkedList.remove();
            if (this.f5702N.m(str2) != I2.s.CANCELLED) {
                this.f5702N.b(I2.s.FAILED, str2);
            }
            linkedList.addAll(this.f5703O.a(str2));
        }
    }

    private void g() {
        this.f5701M.g();
        try {
            this.f5702N.b(I2.s.ENQUEUED, this.f5692D);
            this.f5702N.s(this.f5692D, java.lang.System.currentTimeMillis());
            this.f5702N.d(this.f5692D, -1L);
            this.f5701M.N();
        } finally {
            this.f5701M.n();
            i(true);
        }
    }

    private void h() {
        this.f5701M.g();
        try {
            this.f5702N.s(this.f5692D, java.lang.System.currentTimeMillis());
            this.f5702N.b(I2.s.ENQUEUED, this.f5692D);
            this.f5702N.o(this.f5692D);
            this.f5702N.d(this.f5692D, -1L);
            this.f5701M.N();
        } finally {
            this.f5701M.n();
            i(false);
        }
    }

    private void i(boolean z6) {
        androidx.work.ListenableWorker listenableWorker;
        this.f5701M.g();
        try {
            if (!this.f5701M.Y().k()) {
                R2.g.a(this.f5691C, androidx.work.impl.background.systemalarm.RescheduleReceiver.class, false);
            }
            if (z6) {
                this.f5702N.b(I2.s.ENQUEUED, this.f5692D);
                this.f5702N.d(this.f5692D, -1L);
            }
            if (this.f5695G != null && (listenableWorker = this.f5696H) != null && listenableWorker.isRunInForeground()) {
                this.f5700L.b(this.f5692D);
            }
            this.f5701M.N();
            this.f5701M.n();
            this.f5707S.q(java.lang.Boolean.valueOf(z6));
        } catch (java.lang.Throwable th) {
            this.f5701M.n();
            throw th;
        }
    }

    private void j() {
        I2.s sVarM = this.f5702N.m(this.f5692D);
        if (sVarM == I2.s.RUNNING) {
            I2.j.c().a(f5690V, java.lang.String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f5692D), new java.lang.Throwable[0]);
            i(true);
        } else {
            I2.j.c().a(f5690V, java.lang.String.format("Status for %s is %s; not doing any work", this.f5692D, sVarM), new java.lang.Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.b bVarB;
        if (n()) {
            return;
        }
        this.f5701M.g();
        try {
            Q2.p pVarN = this.f5702N.n(this.f5692D);
            this.f5695G = pVarN;
            if (pVarN == null) {
                I2.j.c().b(f5690V, java.lang.String.format("Didn't find WorkSpec for id %s", this.f5692D), new java.lang.Throwable[0]);
                i(false);
                this.f5701M.N();
                this.f5701M.n();
                return;
            }
            if (pVarN.f8804b != I2.s.ENQUEUED) {
                j();
                this.f5701M.N();
                I2.j.c().a(f5690V, java.lang.String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f5695G.f8805c), new java.lang.Throwable[0]);
                this.f5701M.n();
                return;
            }
            if (pVarN.d() || this.f5695G.c()) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                Q2.p pVar = this.f5695G;
                if (pVar.f8816n != 0 && jCurrentTimeMillis < pVar.a()) {
                    I2.j.c().a(f5690V, java.lang.String.format("Delaying execution for %s because it is being executed before schedule.", this.f5695G.f8805c), new java.lang.Throwable[0]);
                    i(true);
                    this.f5701M.N();
                    this.f5701M.n();
                    return;
                }
            }
            this.f5701M.N();
            this.f5701M.n();
            if (this.f5695G.d()) {
                bVarB = this.f5695G.f8807e;
            } else {
                I2.h hVarB = this.f5699K.f().b(this.f5695G.f8806d);
                if (hVarB == null) {
                    I2.j.c().b(f5690V, java.lang.String.format("Could not create Input Merger %s", this.f5695G.f8806d), new java.lang.Throwable[0]);
                    l();
                    return;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(this.f5695G.f8807e);
                    arrayList.addAll(this.f5702N.q(this.f5692D));
                    bVarB = hVarB.b(arrayList);
                }
            }
            androidx.work.WorkerParameters workerParameters = new androidx.work.WorkerParameters(java.util.UUID.fromString(this.f5692D), bVarB, this.f5705Q, this.f5694F, this.f5695G.f8813k, this.f5699K.e(), this.f5697I, this.f5699K.m(), new R2.q(this.f5701M, this.f5697I), new R2.p(this.f5701M, this.f5700L, this.f5697I));
            if (this.f5696H == null) {
                this.f5696H = this.f5699K.m().b(this.f5691C, this.f5695G.f8805c, workerParameters);
            }
            androidx.work.ListenableWorker listenableWorker = this.f5696H;
            if (listenableWorker == null) {
                I2.j.c().b(f5690V, java.lang.String.format("Could not create Worker %s", this.f5695G.f8805c), new java.lang.Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                I2.j.c().b(f5690V, java.lang.String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f5695G.f8805c), new java.lang.Throwable[0]);
                l();
                return;
            }
            this.f5696H.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
            R2.o oVar = new R2.o(this.f5691C, this.f5695G, this.f5696H, workerParameters.b(), this.f5697I);
            this.f5697I.a().execute(oVar);
            P4.d dVarA = oVar.a();
            dVarA.e(new J2.k.a(dVarA, cVarU), this.f5697I.a());
            cVarU.e(new J2.k.b(cVarU, this.f5706R), this.f5697I.c());
        } catch (java.lang.Throwable th) {
            this.f5701M.n();
            throw th;
        }
    }

    private void m() {
        this.f5701M.g();
        try {
            this.f5702N.b(I2.s.SUCCEEDED, this.f5692D);
            this.f5702N.i(this.f5692D, ((androidx.work.ListenableWorker.a.c) this.f5698J).e());
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            for (java.lang.String str : this.f5703O.a(this.f5692D)) {
                if (this.f5702N.m(str) == I2.s.BLOCKED && this.f5703O.c(str)) {
                    I2.j.c().d(f5690V, java.lang.String.format("Setting status to enqueued for %s", str), new java.lang.Throwable[0]);
                    this.f5702N.b(I2.s.ENQUEUED, str);
                    this.f5702N.s(str, jCurrentTimeMillis);
                }
            }
            this.f5701M.N();
        } finally {
            this.f5701M.n();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f5709U) {
            return false;
        }
        I2.j.c().a(f5690V, java.lang.String.format("Work interrupted for %s", this.f5706R), new java.lang.Throwable[0]);
        I2.s sVarM = this.f5702N.m(this.f5692D);
        if (sVarM == null) {
            i(false);
        } else {
            i(!sVarM.e());
        }
        return true;
    }

    private boolean o() {
        boolean z6;
        this.f5701M.g();
        try {
            if (this.f5702N.m(this.f5692D) == I2.s.ENQUEUED) {
                this.f5702N.b(I2.s.RUNNING, this.f5692D);
                this.f5702N.r(this.f5692D);
                z6 = true;
            } else {
                z6 = false;
            }
            this.f5701M.N();
            return z6;
        } finally {
            this.f5701M.n();
        }
    }

    public P4.d b() {
        return this.f5707S;
    }

    public void d() {
        boolean zIsDone;
        this.f5709U = true;
        n();
        P4.d dVar = this.f5708T;
        if (dVar != null) {
            zIsDone = dVar.isDone();
            this.f5708T.cancel(true);
        } else {
            zIsDone = false;
        }
        androidx.work.ListenableWorker listenableWorker = this.f5696H;
        if (listenableWorker == null || zIsDone) {
            I2.j.c().a(f5690V, java.lang.String.format("WorkSpec %s is already done. Not interrupting.", this.f5695G), new java.lang.Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    void f() {
        if (!n()) {
            this.f5701M.g();
            try {
                I2.s sVarM = this.f5702N.m(this.f5692D);
                this.f5701M.X().a(this.f5692D);
                if (sVarM == null) {
                    i(false);
                } else if (sVarM == I2.s.RUNNING) {
                    c(this.f5698J);
                } else if (!sVarM.e()) {
                    g();
                }
                this.f5701M.N();
                this.f5701M.n();
            } catch (java.lang.Throwable th) {
                this.f5701M.n();
                throw th;
            }
        }
        java.util.List list = this.f5693E;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((J2.e) it.next()).d(this.f5692D);
            }
            J2.f.b(this.f5699K, this.f5701M, this.f5693E);
        }
    }

    void l() {
        this.f5701M.g();
        try {
            e(this.f5692D);
            this.f5702N.i(this.f5692D, ((androidx.work.ListenableWorker.a.C0452a) this.f5698J).e());
            this.f5701M.N();
        } finally {
            this.f5701M.n();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List listB = this.f5704P.b(this.f5692D);
        this.f5705Q = listB;
        this.f5706R = a(listB);
        k();
    }
}
