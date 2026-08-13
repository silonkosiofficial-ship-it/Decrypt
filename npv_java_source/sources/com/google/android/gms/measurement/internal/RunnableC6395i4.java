package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6395i4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42433C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42434D;

    RunnableC6395i4(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f42433C = atomicReference;
        this.f42434D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42433C) {
            try {
                try {
                    this.f42433C.set(java.lang.Long.valueOf(this.f42434D.d().A(this.f42434D.p().F(), com.google.android.gms.measurement.internal.G.f41840P)));
                    this.f42433C.notify();
                } catch (java.lang.Throwable th) {
                    this.f42433C.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
