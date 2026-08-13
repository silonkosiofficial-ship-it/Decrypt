package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class U4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42167C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42168D;

    U4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42167C = m6;
        this.f42168D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42168D.f41803d;
        if (interfaceC6654f == null) {
            this.f42168D.j().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Q3.AbstractC1477p.l(this.f42167C);
            interfaceC6654f.W5(this.f42167C);
            this.f42168D.m0();
        } catch (android.os.RemoteException e6) {
            this.f42168D.j().G().b("Failed to send measurementEnabled to the service", e6);
        }
    }
}
