package R2;

/* JADX INFO: loaded from: classes.dex */
public class p implements I2.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f9455d = I2.j.f("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2.a f9456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final P2.a f9457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Q2.q f9458c;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f9459C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.UUID f9460D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ I2.e f9461E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ android.content.Context f9462F;

        a(androidx.work.impl.utils.futures.c cVar, java.util.UUID uuid, I2.e eVar, android.content.Context context) {
            this.f9459C = cVar;
            this.f9460D = uuid;
            this.f9461E = eVar;
            this.f9462F = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f9459C.isCancelled()) {
                    java.lang.String string = this.f9460D.toString();
                    I2.s sVarM = R2.p.this.f9458c.m(string);
                    if (sVarM == null || sVarM.e()) {
                        throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    R2.p.this.f9457b.a(string, this.f9461E);
                    this.f9462F.startService(androidx.work.impl.foreground.a.a(this.f9462F, string, this.f9461E));
                }
                this.f9459C.q(null);
            } catch (java.lang.Throwable th) {
                this.f9459C.r(th);
            }
        }
    }

    public p(androidx.work.impl.WorkDatabase workDatabase, P2.a aVar, S2.a aVar2) {
        this.f9457b = aVar;
        this.f9456a = aVar2;
        this.f9458c = workDatabase.Y();
    }

    @Override // I2.f
    public P4.d a(android.content.Context context, java.util.UUID uuid, I2.e eVar) {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f9456a.b(new R2.p.a(cVarU, uuid, eVar, context));
        return cVarU;
    }
}
