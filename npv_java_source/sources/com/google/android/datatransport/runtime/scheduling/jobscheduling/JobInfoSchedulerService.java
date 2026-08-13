package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends android.app.job.JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.app.job.JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final android.app.job.JobParameters jobParameters) {
        java.lang.String string = jobParameters.getExtras().getString("backendName");
        java.lang.String string2 = jobParameters.getExtras().getString("extras");
        int i6 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        Y2.u.f(getApplicationContext());
        Y2.p.a aVarD = Y2.p.a().b(string).d(p094j3.a.b(i6));
        if (string2 != null) {
            aVarD.c(android.util.Base64.decode(string2, 0));
        }
        Y2.u.c().e().v(aVarD.a(), i10, new java.lang.Runnable() { // from class: f3.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f44951C.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return true;
    }
}
