package L2;

/* JADX INFO: loaded from: classes.dex */
public class l implements J2.e {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.lang.String f6186G = I2.j.f("SystemJobScheduler");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f6187C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.app.job.JobScheduler f6188D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final J2.j f6189E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final L2.k f6190F;

    public l(android.content.Context context, J2.j jVar) {
        this(context, jVar, (android.app.job.JobScheduler) context.getSystemService("jobscheduler"), new L2.k(context));
    }

    public l(android.content.Context context, J2.j jVar, android.app.job.JobScheduler jobScheduler, L2.k kVar) {
        this.f6187C = context;
        this.f6189E = jVar;
        this.f6188D = jobScheduler;
        this.f6190F = kVar;
    }

    public static void b(android.content.Context context) {
        java.util.List listG;
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        java.util.Iterator it = listG.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((android.app.job.JobInfo) it.next()).getId());
        }
    }

    private static void c(android.app.job.JobScheduler jobScheduler, int i6) {
        try {
            jobScheduler.cancel(i6);
        } catch (java.lang.Throwable th) {
            I2.j.c().b(f6186G, java.lang.String.format(java.util.Locale.getDefault(), "Exception while trying to cancel job (%d)", java.lang.Integer.valueOf(i6)), th);
        }
    }

    private static java.util.List f(android.content.Context context, android.app.job.JobScheduler jobScheduler, java.lang.String str) {
        java.util.List<android.app.job.JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        for (android.app.job.JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(java.lang.Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static java.util.List g(android.content.Context context, android.app.job.JobScheduler jobScheduler) {
        java.util.List<android.app.job.JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (java.lang.Throwable th) {
            I2.j.c().b(f6186G, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(allPendingJobs.size());
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
        for (android.app.job.JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static java.lang.String h(android.app.job.JobInfo jobInfo) {
        android.os.PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(android.content.Context context, J2.j jVar) {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        java.util.List<android.app.job.JobInfo> listG = g(context, jobScheduler);
        java.util.List listA = jVar.o().V().a();
        boolean z6 = false;
        java.util.HashSet hashSet = new java.util.HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (android.app.job.JobInfo jobInfo : listG) {
                java.lang.String strH = h(jobInfo);
                if (android.text.TextUtils.isEmpty(strH)) {
                    c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        java.util.Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((java.lang.String) it.next())) {
                I2.j.c().a(f6186G, "Reconciling jobs", new java.lang.Throwable[0]);
                z6 = true;
                break;
            }
        }
        if (z6) {
            androidx.work.impl.WorkDatabase workDatabaseO = jVar.o();
            workDatabaseO.g();
            try {
                Q2.q qVarY = workDatabaseO.Y();
                java.util.Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    qVarY.d((java.lang.String) it2.next(), -1L);
                }
                workDatabaseO.N();
            } finally {
                workDatabaseO.n();
            }
        }
        return z6;
    }

    @Override // J2.e
    public boolean a() {
        return true;
    }

    @Override // J2.e
    public void d(java.lang.String str) {
        java.util.List listF = f(this.f6187C, this.f6188D, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        java.util.Iterator it = listF.iterator();
        while (it.hasNext()) {
            c(this.f6188D, ((java.lang.Integer) it.next()).intValue());
        }
        this.f6189E.o().V().d(str);
    }

    @Override // J2.e
    public void e(Q2.p... pVarArr) {
        java.util.List listF;
        androidx.work.impl.WorkDatabase workDatabaseO = this.f6189E.o();
        R2.f fVar = new R2.f(workDatabaseO);
        for (Q2.p pVar : pVarArr) {
            workDatabaseO.g();
            try {
                Q2.p pVarN = workDatabaseO.Y().n(pVar.f8803a);
                if (pVarN == null) {
                    I2.j.c().h(f6186G, "Skipping scheduling " + pVar.f8803a + " because it's no longer in the DB", new java.lang.Throwable[0]);
                } else if (pVarN.f8804b != I2.s.ENQUEUED) {
                    I2.j.c().h(f6186G, "Skipping scheduling " + pVar.f8803a + " because it is no longer enqueued", new java.lang.Throwable[0]);
                } else {
                    Q2.g gVarB = workDatabaseO.V().b(pVar.f8803a);
                    int iD = gVarB != null ? gVarB.f8781b : fVar.d(this.f6189E.i().i(), this.f6189E.i().g());
                    if (gVarB == null) {
                        this.f6189E.o().V().c(new Q2.g(pVar.f8803a, iD));
                    }
                    j(pVar, iD);
                    if (android.os.Build.VERSION.SDK_INT == 23 && (listF = f(this.f6187C, this.f6188D, pVar.f8803a)) != null) {
                        int iIndexOf = listF.indexOf(java.lang.Integer.valueOf(iD));
                        if (iIndexOf >= 0) {
                            listF.remove(iIndexOf);
                        }
                        j(pVar, !listF.isEmpty() ? ((java.lang.Integer) listF.get(0)).intValue() : fVar.d(this.f6189E.i().i(), this.f6189E.i().g()));
                    }
                }
                workDatabaseO.N();
                workDatabaseO.n();
            } catch (java.lang.Throwable th) {
                workDatabaseO.n();
                throw th;
            }
        }
    }

    public void j(Q2.p pVar, int i6) {
        android.app.job.JobInfo jobInfoA = this.f6190F.a(pVar, i6);
        I2.j jVarC = I2.j.c();
        java.lang.String str = f6186G;
        jVarC.a(str, java.lang.String.format("Scheduling work ID %s Job ID %s", pVar.f8803a, java.lang.Integer.valueOf(i6)), new java.lang.Throwable[0]);
        try {
            if (this.f6188D.schedule(jobInfoA) == 0) {
                I2.j.c().h(str, java.lang.String.format("Unable to schedule work ID %s", pVar.f8803a), new java.lang.Throwable[0]);
                if (pVar.f8819q && pVar.f8820r == I2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f8819q = false;
                    I2.j.c().a(str, java.lang.String.format("Scheduling a non-expedited job (work ID %s)", pVar.f8803a), new java.lang.Throwable[0]);
                    j(pVar, i6);
                }
            }
        } catch (java.lang.IllegalStateException e6) {
            java.util.List listG = g(this.f6187C, this.f6188D);
            java.lang.String str2 = java.lang.String.format(java.util.Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", java.lang.Integer.valueOf(listG != null ? listG.size() : 0), java.lang.Integer.valueOf(this.f6189E.o().Y().h().size()), java.lang.Integer.valueOf(this.f6189E.i().h()));
            I2.j.c().b(f6186G, str2, new java.lang.Throwable[0]);
            throw new java.lang.IllegalStateException(str2, e6);
        } catch (java.lang.Throwable th) {
            I2.j.c().b(f6186G, java.lang.String.format("Unable to schedule %s", pVar), th);
        }
    }
}
