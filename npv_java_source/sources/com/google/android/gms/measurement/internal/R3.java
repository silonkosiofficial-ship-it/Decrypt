package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class R3 implements P4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.B5 f42108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42109b;

    R3(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.measurement.internal.B5 b6) {
        this.f42108a = b6;
        this.f42109b = f6;
    }

    private final void c() {
        android.util.SparseArray sparseArrayK = this.f42109b.h().K();
        com.google.android.gms.measurement.internal.B5 b6 = this.f42108a;
        sparseArrayK.put(b6.f41740E, java.lang.Long.valueOf(b6.f41739D));
        this.f42109b.h().v(sparseArrayK);
    }

    @Override // P4.a
    public final void a(java.lang.Object obj) {
        this.f42109b.n();
        if (!this.f42109b.d().t(com.google.android.gms.measurement.internal.G.f41839O0)) {
            this.f42109b.f41788i = false;
            this.f42109b.H0();
            this.f42109b.j().F().b("registerTriggerAsync ran. uri", this.f42108a.f41738C);
        } else {
            c();
            this.f42109b.f41788i = false;
            this.f42109b.f41789j = 1;
            this.f42109b.j().F().b("Successfully registered trigger URI", this.f42108a.f41738C);
            this.f42109b.H0();
        }
    }

    @Override // P4.a
    public final void b(java.lang.Throwable th) {
        this.f42109b.n();
        this.f42109b.f41788i = false;
        if (!this.f42109b.d().t(com.google.android.gms.measurement.internal.G.f41839O0)) {
            this.f42109b.H0();
            this.f42109b.j().G().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        int iC = (this.f42109b.d().t(com.google.android.gms.measurement.internal.G.f41835M0) ? com.google.android.gms.measurement.internal.F3.C(this.f42109b, th) : 2) - 1;
        if (iC == 0) {
            this.f42109b.j().L().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", com.google.android.gms.measurement.internal.C6428n2.v(this.f42109b.p().F()), com.google.android.gms.measurement.internal.C6428n2.v(th.toString()));
            this.f42109b.f41789j = 1;
            this.f42109b.A0().add(this.f42108a);
            return;
        }
        if (iC != 1) {
            if (iC != 2) {
                return;
            }
            this.f42109b.j().G().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", com.google.android.gms.measurement.internal.C6428n2.v(this.f42109b.p().F()), th);
            c();
            this.f42109b.f41789j = 1;
            this.f42109b.H0();
            return;
        }
        this.f42109b.A0().add(this.f42108a);
        if (this.f42109b.f41789j > 32) {
            this.f42109b.f41789j = 1;
            this.f42109b.j().L().c("registerTriggerAsync failed. May try later. App ID, throwable", com.google.android.gms.measurement.internal.C6428n2.v(this.f42109b.p().F()), com.google.android.gms.measurement.internal.C6428n2.v(th.toString()));
            return;
        }
        this.f42109b.j().L().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", com.google.android.gms.measurement.internal.C6428n2.v(this.f42109b.p().F()), com.google.android.gms.measurement.internal.C6428n2.v(java.lang.String.valueOf(this.f42109b.f41789j)), com.google.android.gms.measurement.internal.C6428n2.v(th.toString()));
        com.google.android.gms.measurement.internal.F3 f6 = this.f42109b;
        com.google.android.gms.measurement.internal.F3.P0(f6, f6.f41789j);
        this.f42109b.f41789j <<= 1;
    }
}
