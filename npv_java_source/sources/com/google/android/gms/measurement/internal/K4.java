package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class K4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42012C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42013D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42014E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42015F;

    K4(com.google.android.gms.measurement.internal.F4 f6, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.M5 m6, android.os.Bundle bundle) {
        this.f42012C = atomicReference;
        this.f42013D = m6;
        this.f42014E = bundle;
        this.f42015F = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        synchronized (this.f42012C) {
            try {
                try {
                    p085i4.InterfaceC6654f interfaceC6654f = this.f42015F.f41803d;
                    if (interfaceC6654f == null) {
                        this.f42015F.j().G().a("Failed to get trigger URIs; not connected to service");
                        this.f42012C.notify();
                        return;
                    }
                    Q3.AbstractC1477p.l(this.f42013D);
                    this.f42012C.set(interfaceC6654f.k5(this.f42013D, this.f42014E));
                    this.f42015F.m0();
                    atomicReference = this.f42012C;
                    atomicReference.notify();
                } catch (android.os.RemoteException e6) {
                    this.f42015F.j().G().b("Failed to get trigger URIs; remote exception", e6);
                    atomicReference = this.f42012C;
                }
            } catch (java.lang.Throwable th) {
                this.f42012C.notify();
                throw th;
            }
        }
    }
}
