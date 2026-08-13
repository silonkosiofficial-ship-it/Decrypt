package R2;

/* JADX INFO: loaded from: classes.dex */
public class q implements I2.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.lang.String f9464c = I2.j.f("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.WorkDatabase f9465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final S2.a f9466b;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.UUID f9467C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f9468D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f9469E;

        a(java.util.UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.c cVar) {
            this.f9467C = uuid;
            this.f9468D = bVar;
            this.f9469E = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String string = this.f9467C.toString();
            I2.j jVarC = I2.j.c();
            java.lang.String str = R2.q.f9464c;
            jVarC.a(str, java.lang.String.format("Updating progress for %s (%s)", this.f9467C, this.f9468D), new java.lang.Throwable[0]);
            R2.q.this.f9465a.g();
            try {
                Q2.p pVarN = R2.q.this.f9465a.Y().n(string);
                if (pVarN == null) {
                    throw new java.lang.IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (pVarN.f8804b == I2.s.RUNNING) {
                    R2.q.this.f9465a.X().b(new Q2.m(string, this.f9468D));
                } else {
                    I2.j.c().h(str, java.lang.String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new java.lang.Throwable[0]);
                }
                this.f9469E.q(null);
                R2.q.this.f9465a.N();
            } catch (java.lang.Throwable th) {
                try {
                    I2.j.c().b(R2.q.f9464c, "Error updating Worker progress", th);
                    this.f9469E.r(th);
                } finally {
                    R2.q.this.f9465a.n();
                }
            }
        }
    }

    public q(androidx.work.impl.WorkDatabase workDatabase, S2.a aVar) {
        this.f9465a = workDatabase;
        this.f9466b = aVar;
    }

    @Override // I2.o
    public P4.d a(android.content.Context context, java.util.UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f9466b.b(new R2.q.a(uuid, bVar, cVarU));
        return cVarU;
    }
}
