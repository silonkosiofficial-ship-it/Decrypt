package R2;

/* JADX INFO: loaded from: classes.dex */
public class o implements java.lang.Runnable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final java.lang.String f9444I = I2.j.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f9445C = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final android.content.Context f9446D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final Q2.p f9447E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final androidx.work.ListenableWorker f9448F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final I2.f f9449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final S2.a f9450H;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f9451C;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f9451C = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9451C.s(R2.o.this.f9448F.getForegroundInfoAsync());
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f9453C;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f9453C = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                I2.e eVar = (I2.e) this.f9453C.get();
                if (eVar == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Worker was marked important (%s) but did not provide ForegroundInfo", R2.o.this.f9447E.f8805c));
                }
                I2.j.c().a(R2.o.f9444I, java.lang.String.format("Updating notification for %s", R2.o.this.f9447E.f8805c), new java.lang.Throwable[0]);
                R2.o.this.f9448F.setRunInForeground(true);
                R2.o oVar = R2.o.this;
                oVar.f9445C.s(oVar.f9449G.a(oVar.f9446D, oVar.f9448F.getId(), eVar));
            } catch (java.lang.Throwable th) {
                R2.o.this.f9445C.r(th);
            }
        }
    }

    public o(android.content.Context context, Q2.p pVar, androidx.work.ListenableWorker listenableWorker, I2.f fVar, S2.a aVar) {
        this.f9446D = context;
        this.f9447E = pVar;
        this.f9448F = listenableWorker;
        this.f9449G = fVar;
        this.f9450H = aVar;
    }

    public P4.d a() {
        return this.f9445C;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f9447E.f8819q || androidx.core.os.a.b()) {
            this.f9445C.q(null);
            return;
        }
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f9450H.a().execute(new R2.o.a(cVarU));
        cVarU.e(new R2.o.b(cVarU), this.f9450H.a());
    }
}
