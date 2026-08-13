package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6417l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f42515a;

    public C6417l5(android.content.Context context) {
        Q3.AbstractC1477p.l(context);
        this.f42515a = context;
    }

    private final void f(java.lang.Runnable runnable) {
        com.google.android.gms.measurement.internal.H5 h5M = com.google.android.gms.measurement.internal.H5.m(this.f42515a);
        h5M.l().D(new com.google.android.gms.measurement.internal.RunnableC6424m5(this, h5M, runnable));
    }

    private final com.google.android.gms.measurement.internal.C6428n2 j() {
        return com.google.android.gms.measurement.internal.S2.c(this.f42515a, null, null).j();
    }

    public final int a(final android.content.Intent intent, int i6, final int i10) {
        final com.google.android.gms.measurement.internal.C6428n2 c6428n2J = com.google.android.gms.measurement.internal.S2.c(this.f42515a, null, null).j();
        if (intent == null) {
            c6428n2J.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        java.lang.String action = intent.getAction();
        c6428n2J.K().c("Local AppMeasurementService called. startId, action", java.lang.Integer.valueOf(i10), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42573C.d(i10, c6428n2J, intent);
                }
            });
        }
        return 2;
    }

    public final android.os.IBinder b(android.content.Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new com.google.android.gms.measurement.internal.X2(com.google.android.gms.measurement.internal.H5.m(this.f42515a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        com.google.android.gms.measurement.internal.S2.c(this.f42515a, null, null).j().K().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int i6, com.google.android.gms.measurement.internal.C6428n2 c6428n2, android.content.Intent intent) {
        if (((p085i4.B) this.f42515a).r(i6)) {
            c6428n2.K().b("Local AppMeasurementService processed last upload request. StartId", java.lang.Integer.valueOf(i6));
            j().K().a("Completed wakeful intent.");
            ((p085i4.B) this.f42515a).a(intent);
        }
    }

    final /* synthetic */ void e(com.google.android.gms.measurement.internal.C6428n2 c6428n2, android.app.job.JobParameters jobParameters) {
        c6428n2.K().a("AppMeasurementJobService processed last upload request.");
        ((p085i4.B) this.f42515a).b(jobParameters, false);
    }

    public final boolean g(final android.app.job.JobParameters jobParameters) {
        final com.google.android.gms.measurement.internal.C6428n2 c6428n2J = com.google.android.gms.measurement.internal.S2.c(this.f42515a, null, null).j();
        java.lang.String string = jobParameters.getExtras().getString("action");
        c6428n2J.K().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.k5
            @Override // java.lang.Runnable
            public final void run() {
                this.f42492C.e(c6428n2J, jobParameters);
            }
        });
        return true;
    }

    public final void h() {
        com.google.android.gms.measurement.internal.S2.c(this.f42515a, null, null).j().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(android.content.Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
        } else {
            j().K().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(android.content.Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
