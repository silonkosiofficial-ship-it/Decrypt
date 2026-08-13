package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class L4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42020C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42022E;

    L4(com.google.android.gms.measurement.internal.F4 f6, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42020C = atomicReference;
        this.f42021D = m6;
        this.f42022E = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        synchronized (this.f42020C) {
            try {
                try {
                    if (!this.f42022E.h().M().z()) {
                        this.f42022E.j().M().a("Analytics storage consent denied; will not get app instance id");
                        this.f42022E.r().a1(null);
                        this.f42022E.h().f42730i.b(null);
                        this.f42020C.set(null);
                        this.f42020C.notify();
                        return;
                    }
                    p085i4.InterfaceC6654f interfaceC6654f = this.f42022E.f41803d;
                    if (interfaceC6654f == null) {
                        this.f42022E.j().G().a("Failed to get app instance id");
                        this.f42020C.notify();
                        return;
                    }
                    Q3.AbstractC1477p.l(this.f42021D);
                    this.f42020C.set(interfaceC6654f.k2(this.f42021D));
                    java.lang.String str = (java.lang.String) this.f42020C.get();
                    if (str != null) {
                        this.f42022E.r().a1(str);
                        this.f42022E.h().f42730i.b(str);
                    }
                    this.f42022E.m0();
                    atomicReference = this.f42020C;
                    atomicReference.notify();
                } catch (android.os.RemoteException e6) {
                    this.f42022E.j().G().b("Failed to get app instance id", e6);
                    atomicReference = this.f42020C;
                }
            } catch (java.lang.Throwable th) {
                this.f42020C.notify();
                throw th;
            }
        }
    }
}
