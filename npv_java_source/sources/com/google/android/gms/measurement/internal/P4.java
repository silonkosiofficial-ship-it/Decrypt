package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class P4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42094E;

    P4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6, com.google.android.gms.internal.measurement.U0 u6) {
        this.f42092C = m6;
        this.f42093D = u6;
        this.f42094E = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String strK2 = null;
        try {
            try {
                if (this.f42094E.h().M().z()) {
                    p085i4.InterfaceC6654f interfaceC6654f = this.f42094E.f41803d;
                    if (interfaceC6654f == null) {
                        this.f42094E.j().G().a("Failed to get app instance id");
                    } else {
                        Q3.AbstractC1477p.l(this.f42092C);
                        strK2 = interfaceC6654f.k2(this.f42092C);
                        if (strK2 != null) {
                            this.f42094E.r().a1(strK2);
                            this.f42094E.h().f42730i.b(strK2);
                        }
                        this.f42094E.m0();
                    }
                } else {
                    this.f42094E.j().M().a("Analytics storage consent denied; will not get app instance id");
                    this.f42094E.r().a1(null);
                    this.f42094E.h().f42730i.b(null);
                }
            } catch (android.os.RemoteException e6) {
                this.f42094E.j().G().b("Failed to get app instance id", e6);
            }
        } finally {
            this.f42094E.i().S(this.f42093D, null);
        }
    }
}
