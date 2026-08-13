package J2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f5664a = I2.j.f("Schedulers");

    static J2.e a(android.content.Context context, J2.j jVar) {
        L2.l lVar = new L2.l(context, jVar);
        R2.g.a(context, androidx.work.impl.background.systemjob.SystemJobService.class, true);
        I2.j.c().a(f5664a, "Created SystemJobScheduler and enabled SystemJobService", new java.lang.Throwable[0]);
        return lVar;
    }

    public static void b(androidx.work.a aVar, androidx.work.impl.WorkDatabase workDatabase, java.util.List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Q2.q qVarY = workDatabase.Y();
        workDatabase.g();
        try {
            java.util.List listG = qVarY.g(aVar.h());
            java.util.List listT = qVarY.t(200);
            if (listG != null && listG.size() > 0) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = listG.iterator();
                while (it.hasNext()) {
                    qVarY.d(((Q2.p) it.next()).f8803a, jCurrentTimeMillis);
                }
            }
            workDatabase.N();
            workDatabase.n();
            if (listG != null && listG.size() > 0) {
                Q2.p[] pVarArr = (Q2.p[]) listG.toArray(new Q2.p[listG.size()]);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    J2.e eVar = (J2.e) it2.next();
                    if (eVar.a()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            if (listT == null || listT.size() <= 0) {
                return;
            }
            Q2.p[] pVarArr2 = (Q2.p[]) listT.toArray(new Q2.p[listT.size()]);
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                J2.e eVar2 = (J2.e) it3.next();
                if (!eVar2.a()) {
                    eVar2.e(pVarArr2);
                }
            }
        } catch (java.lang.Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
