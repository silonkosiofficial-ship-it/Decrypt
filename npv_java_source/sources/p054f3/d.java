package p054f3;

/* JADX INFO: loaded from: classes.dex */
public class d implements p054f3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f44948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p064g3.InterfaceC6599d f44949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p054f3.f f44950c;

    public d(android.content.Context context, p064g3.InterfaceC6599d interfaceC6599d, p054f3.f fVar) {
        this.f44948a = context;
        this.f44949b = interfaceC6599d;
        this.f44950c = fVar;
    }

    private boolean d(android.app.job.JobScheduler jobScheduler, int i6, int i10) {
        for (android.app.job.JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i11 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i6) {
                return i11 >= i10;
            }
        }
        return false;
    }

    @Override // p054f3.x
    public void a(Y2.p pVar, int i6) {
        b(pVar, i6, false);
    }

    @Override // p054f3.x
    public void b(Y2.p pVar, int i6, boolean z6) {
        android.content.ComponentName componentName = new android.content.ComponentName(this.f44948a, (java.lang.Class<?>) com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class);
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) this.f44948a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z6 && d(jobScheduler, iC, i6)) {
            p024c3.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jM = this.f44949b.M(pVar);
        android.app.job.JobInfo.Builder builderC = this.f44950c.c(new android.app.job.JobInfo.Builder(iC, componentName), pVar.d(), jM, i6);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt("attemptNumber", i6);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", p094j3.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", android.util.Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        p024c3.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, java.lang.Integer.valueOf(iC), java.lang.Long.valueOf(this.f44950c.g(pVar.d(), jM, i6)), java.lang.Long.valueOf(jM), java.lang.Integer.valueOf(i6));
        jobScheduler.schedule(builderC.build());
    }

    int c(Y2.p pVar) {
        java.util.zip.Adler32 adler32 = new java.util.zip.Adler32();
        adler32.update(this.f44948a.getPackageName().getBytes(java.nio.charset.Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(java.nio.charset.Charset.forName("UTF-8")));
        adler32.update(java.nio.ByteBuffer.allocate(4).putInt(p094j3.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
