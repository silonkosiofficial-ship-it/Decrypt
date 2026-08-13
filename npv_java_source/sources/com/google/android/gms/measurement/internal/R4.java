package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class R4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42110C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42111D;

    R4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42110C = m6;
        this.f42111D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42111D.f41803d;
        if (interfaceC6654f == null) {
            this.f42111D.j().L().a("Failed to send app backgrounded");
            return;
        }
        try {
            Q3.AbstractC1477p.l(this.f42110C);
            interfaceC6654f.Y2(this.f42110C);
            this.f42111D.m0();
        } catch (android.os.RemoteException e6) {
            this.f42111D.j().G().b("Failed to send app backgrounded to the service", e6);
        }
    }
}
