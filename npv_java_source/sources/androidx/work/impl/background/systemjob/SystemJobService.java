package androidx.work.impl.background.systemjob;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends android.app.job.JobService implements J2.b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.lang.String f23914E = I2.j.f("SystemJobService");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private J2.j f23915C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f23916D = new java.util.HashMap();

    private static java.lang.String a(android.app.job.JobParameters jobParameters) {
        try {
            android.os.PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        android.app.job.JobParameters jobParameters;
        I2.j.c().a(f23914E, java.lang.String.format("%s executed on JobScheduler", str), new java.lang.Throwable[0]);
        synchronized (this.f23916D) {
            jobParameters = (android.app.job.JobParameters) this.f23916D.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            J2.j jVarK = J2.j.k(getApplicationContext());
            this.f23915C = jVarK;
            jVarK.m().d(this);
        } catch (java.lang.IllegalStateException unused) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            I2.j.c().h(f23914E, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new java.lang.Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        J2.j jVar = this.f23915C;
        if (jVar != null) {
            jVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        androidx.work.WorkerParameters.a aVar;
        if (this.f23915C == null) {
            I2.j.c().a(f23914E, "WorkManager is not initialized; requesting retry.", new java.lang.Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        java.lang.String strA = a(jobParameters);
        if (android.text.TextUtils.isEmpty(strA)) {
            I2.j.c().b(f23914E, "WorkSpec id not found!", new java.lang.Throwable[0]);
            return false;
        }
        synchronized (this.f23916D) {
            try {
                if (this.f23916D.containsKey(strA)) {
                    I2.j.c().a(f23914E, java.lang.String.format("Job is already being executed by SystemJobService: %s", strA), new java.lang.Throwable[0]);
                    return false;
                }
                I2.j.c().a(f23914E, java.lang.String.format("onStartJob for %s", strA), new java.lang.Throwable[0]);
                this.f23916D.put(strA, jobParameters);
                int i6 = android.os.Build.VERSION.SDK_INT;
                if (i6 >= 24) {
                    aVar = new androidx.work.WorkerParameters.a();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        aVar.f23819b = java.util.Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        aVar.f23818a = java.util.Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i6 >= 28) {
                        aVar.f23820c = jobParameters.getNetwork();
                    }
                } else {
                    aVar = null;
                }
                this.f23915C.v(strA, aVar);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        if (this.f23915C == null) {
            I2.j.c().a(f23914E, "WorkManager is not initialized; requesting retry.", new java.lang.Throwable[0]);
            return true;
        }
        java.lang.String strA = a(jobParameters);
        if (android.text.TextUtils.isEmpty(strA)) {
            I2.j.c().b(f23914E, "WorkSpec id not found!", new java.lang.Throwable[0]);
            return false;
        }
        I2.j.c().a(f23914E, java.lang.String.format("onStopJob for %s", strA), new java.lang.Throwable[0]);
        synchronized (this.f23916D) {
            this.f23916D.remove(strA);
        }
        this.f23915C.x(strA);
        return !this.f23915C.m().f(strA);
    }
}
