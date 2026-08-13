package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class N4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42065C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42066D;

    N4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42065C = m6;
        this.f42066D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42066D.f41803d;
        if (interfaceC6654f == null) {
            this.f42066D.j().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Q3.AbstractC1477p.l(this.f42065C);
            interfaceC6654f.A1(this.f42065C);
        } catch (android.os.RemoteException e6) {
            this.f42066D.j().G().b("Failed to reset data on the service: remote exception", e6);
        }
        this.f42066D.m0();
    }
}
