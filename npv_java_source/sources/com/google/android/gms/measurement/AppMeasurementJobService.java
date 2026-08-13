package com.google.android.gms.measurement;

/* JADX INFO: loaded from: classes3.dex */
@android.annotation.TargetApi(24)
public final class AppMeasurementJobService extends android.app.job.JobService implements p085i4.B {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6417l5 f41683C;

    private final com.google.android.gms.measurement.internal.C6417l5 c() {
        if (this.f41683C == null) {
            this.f41683C = new com.google.android.gms.measurement.internal.C6417l5(this);
        }
        return this.f41683C;
    }

    @Override // p085i4.B
    public final void a(android.content.Intent intent) {
    }

    @Override // p085i4.B
    public final void b(android.app.job.JobParameters jobParameters, boolean z6) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        c().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return c().k(intent);
    }

    @Override // p085i4.B
    public final boolean r(int i6) {
        throw new java.lang.UnsupportedOperationException();
    }
}
