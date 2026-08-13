package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class S4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42151C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42152D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42153E;

    S4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6, android.os.Bundle bundle) {
        this.f42151C = m6;
        this.f42152D = bundle;
        this.f42153E = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42153E.f41803d;
        if (interfaceC6654f == null) {
            this.f42153E.j().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Q3.AbstractC1477p.l(this.f42151C);
            interfaceC6654f.C1(this.f42152D, this.f42151C);
        } catch (android.os.RemoteException e6) {
            this.f42153E.j().G().b("Failed to send default event parameters to service", e6);
        }
    }
}
