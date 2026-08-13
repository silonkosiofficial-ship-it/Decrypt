package androidx.work.impl.workers;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends androidx.work.Worker {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.lang.String f23991I = I2.j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static java.lang.String a(Q2.p pVar, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        return java.lang.String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f8803a, pVar.f8805c, num, pVar.f8804b.name(), str, str2);
    }

    private static java.lang.String c(Q2.k kVar, Q2.t tVar, Q2.h hVar, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            Q2.p pVar = (Q2.p) it.next();
            Q2.g gVarB = hVar.b(pVar.f8803a);
            sb.append(a(pVar, android.text.TextUtils.join(",", kVar.b(pVar.f8803a)), gVarB != null ? java.lang.Integer.valueOf(gVarB.f8781b) : null, android.text.TextUtils.join(",", tVar.b(pVar.f8803a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public androidx.work.ListenableWorker.a doWork() {
        androidx.work.impl.WorkDatabase workDatabaseO = J2.j.k(getApplicationContext()).o();
        Q2.q qVarY = workDatabaseO.Y();
        Q2.k kVarW = workDatabaseO.W();
        Q2.t tVarZ = workDatabaseO.Z();
        Q2.h hVarV = workDatabaseO.V();
        java.util.List listF = qVarY.f(java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.DAYS.toMillis(1L));
        java.util.List listJ = qVarY.j();
        java.util.List listT = qVarY.t(200);
        if (listF != null && !listF.isEmpty()) {
            I2.j jVarC = I2.j.c();
            java.lang.String str = f23991I;
            jVarC.d(str, "Recently completed work:\n\n", new java.lang.Throwable[0]);
            I2.j.c().d(str, c(kVarW, tVarZ, hVarV, listF), new java.lang.Throwable[0]);
        }
        if (listJ != null && !listJ.isEmpty()) {
            I2.j jVarC2 = I2.j.c();
            java.lang.String str2 = f23991I;
            jVarC2.d(str2, "Running work:\n\n", new java.lang.Throwable[0]);
            I2.j.c().d(str2, c(kVarW, tVarZ, hVarV, listJ), new java.lang.Throwable[0]);
        }
        if (listT != null && !listT.isEmpty()) {
            I2.j jVarC3 = I2.j.c();
            java.lang.String str3 = f23991I;
            jVarC3.d(str3, "Enqueued work:\n\n", new java.lang.Throwable[0]);
            I2.j.c().d(str3, c(kVarW, tVarZ, hVarV, listT), new java.lang.Throwable[0]);
        }
        return androidx.work.ListenableWorker.a.c();
    }
}
