package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class O4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42075C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42076D;

    O4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42075C = m6;
        this.f42076D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42076D.f41803d;
        if (interfaceC6654f == null) {
            this.f42076D.j().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Q3.AbstractC1477p.l(this.f42075C);
            interfaceC6654f.X0(this.f42075C);
            this.f42076D.q().J();
            this.f42076D.O(interfaceC6654f, null, this.f42075C);
            this.f42076D.m0();
        } catch (android.os.RemoteException e6) {
            this.f42076D.j().G().b("Failed to send app launch to the service", e6);
        }
    }
}
