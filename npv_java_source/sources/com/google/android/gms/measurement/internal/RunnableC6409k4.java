package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6409k4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42490C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42491D;

    RunnableC6409k4(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f42490C = atomicReference;
        this.f42491D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42490C) {
            try {
                try {
                    this.f42490C.set(java.lang.Double.valueOf(this.f42491D.d().o(this.f42491D.p().F(), com.google.android.gms.measurement.internal.G.f41844R)));
                    this.f42490C.notify();
                } catch (java.lang.Throwable th) {
                    this.f42490C.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
