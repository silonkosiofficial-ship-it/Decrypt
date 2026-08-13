package R2;

/* JADX INFO: loaded from: classes.dex */
public class m implements java.lang.Runnable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.String f9438F = I2.j.f("StopWorkRunnable");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final J2.j f9439C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f9440D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f9441E;

    public m(J2.j jVar, java.lang.String str, boolean z6) {
        this.f9439C = jVar;
        this.f9440D = str;
        this.f9441E = z6;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        androidx.work.impl.WorkDatabase workDatabaseO = this.f9439C.o();
        J2.d dVarM = this.f9439C.m();
        Q2.q qVarY = workDatabaseO.Y();
        workDatabaseO.g();
        try {
            boolean zH = dVarM.h(this.f9440D);
            if (this.f9441E) {
                zO = this.f9439C.m().n(this.f9440D);
            } else {
                if (!zH && qVarY.m(this.f9440D) == I2.s.RUNNING) {
                    qVarY.b(I2.s.ENQUEUED, this.f9440D);
                }
                zO = this.f9439C.m().o(this.f9440D);
            }
            I2.j.c().a(f9438F, java.lang.String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f9440D, java.lang.Boolean.valueOf(zO)), new java.lang.Throwable[0]);
            workDatabaseO.N();
        } finally {
            workDatabaseO.n();
        }
    }
}
