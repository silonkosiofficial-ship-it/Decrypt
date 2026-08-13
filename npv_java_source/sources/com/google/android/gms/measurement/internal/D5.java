package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class D5 extends com.google.android.gms.measurement.internal.E5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.app.AlarmManager f41769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.AbstractC6466t f41770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Integer f41771f;

    protected D5(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
        this.f41769d = (android.app.AlarmManager) a().getSystemService("alarm");
    }

    private final int A() {
        if (this.f41771f == null) {
            this.f41771f = java.lang.Integer.valueOf(("measurement" + a().getPackageName()).hashCode());
        }
        return this.f41771f.intValue();
    }

    private final android.app.PendingIntent B() {
        android.content.Context contextA = a();
        return com.google.android.gms.internal.measurement.B0.a(contextA, 0, new android.content.Intent().setClassName(contextA, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.B0.f40448a);
    }

    private final com.google.android.gms.measurement.internal.AbstractC6466t C() {
        if (this.f41770e == null) {
            this.f41770e = new com.google.android.gms.measurement.internal.C5(this, this.f41809b.t0());
        }
        return this.f41770e;
    }

    private final void D() {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.Z5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.h6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6404k q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.I2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6403j5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.G5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        android.app.AlarmManager alarmManager = this.f41769d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return false;
        }
        D();
        return false;
    }

    public final void y(long j6) {
        u();
        android.content.Context contextA = a();
        if (!com.google.android.gms.measurement.internal.d6.d0(contextA)) {
            j().F().a("Receiver not registered/enabled");
        }
        if (!com.google.android.gms.measurement.internal.d6.e0(contextA, false)) {
            j().F().a("Service not registered/enabled");
        }
        z();
        j().K().b("Scheduling upload, millis", java.lang.Long.valueOf(j6));
        long jC = b().c() + j6;
        if (j6 < java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.G.f41925z.a(null)).longValue()) && !C().e()) {
            C().b(j6);
        }
        if (android.os.Build.VERSION.SDK_INT < 24) {
            android.app.AlarmManager alarmManager = this.f41769d;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, jC, java.lang.Math.max(((java.lang.Long) com.google.android.gms.measurement.internal.G.f41915u.a(null)).longValue(), j6), B());
                return;
            }
            return;
        }
        android.content.Context contextA2 = a();
        android.content.ComponentName componentName = new android.content.ComponentName(contextA2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iA = A();
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.A0.c(contextA2, new android.app.job.JobInfo.Builder(iA, componentName).setMinimumLatency(j6).setOverrideDeadline(j6 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        u();
        j().K().a("Unscheduling upload");
        android.app.AlarmManager alarmManager = this.f41769d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            D();
        }
    }
}
