package com.google.android.gms.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends android.app.Service implements p085i4.B {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6417l5 f41685C;

    private final com.google.android.gms.measurement.internal.C6417l5 c() {
        if (this.f41685C == null) {
            this.f41685C = new com.google.android.gms.measurement.internal.C6417l5(this);
        }
        return this.f41685C;
    }

    @Override // p085i4.B
    public final void a(android.content.Intent intent) {
        Z1.a.b(intent);
    }

    @Override // p085i4.B
    public final void b(android.app.job.JobParameters jobParameters, boolean z6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i6, int i10) {
        return c().a(intent, i6, i10);
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return c().k(intent);
    }

    @Override // p085i4.B
    public final boolean r(int i6) {
        return stopSelfResult(i6);
    }
}
