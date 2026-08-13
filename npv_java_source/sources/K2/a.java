package K2;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final java.lang.String f6079d = I2.j.f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final K2.b f6080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I2.q f6081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f6082c = new java.util.HashMap();

    /* JADX INFO: renamed from: K2.a$a, reason: collision with other inner class name */
    class RunnableC0145a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Q2.p f6083C;

        RunnableC0145a(Q2.p pVar) {
            this.f6083C = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            I2.j.c().a(K2.a.f6079d, java.lang.String.format("Scheduling work %s", this.f6083C.f8803a), new java.lang.Throwable[0]);
            K2.a.this.f6080a.e(this.f6083C);
        }
    }

    public a(K2.b bVar, I2.q qVar) {
        this.f6080a = bVar;
        this.f6081b = qVar;
    }

    public void a(Q2.p pVar) {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f6082c.remove(pVar.f8803a);
        if (runnable != null) {
            this.f6081b.b(runnable);
        }
        K2.a.RunnableC0145a runnableC0145a = new K2.a.RunnableC0145a(pVar);
        this.f6082c.put(pVar.f8803a, runnableC0145a);
        this.f6081b.a(pVar.a() - java.lang.System.currentTimeMillis(), runnableC0145a);
    }

    public void b(java.lang.String str) {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f6082c.remove(str);
        if (runnable != null) {
            this.f6081b.b(runnable);
        }
    }
}
