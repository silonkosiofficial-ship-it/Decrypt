package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Y3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42221C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42222D;

    Y3(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f42221C = atomicReference;
        this.f42222D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42221C) {
            try {
                try {
                    this.f42221C.set(this.f42222D.d().G(this.f42222D.p().F()));
                    this.f42221C.notify();
                } catch (java.lang.Throwable th) {
                    this.f42221C.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
