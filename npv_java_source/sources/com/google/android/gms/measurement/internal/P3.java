package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class P3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42090C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42091D;

    P3(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f42090C = atomicReference;
        this.f42091D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42090C) {
            try {
                try {
                    this.f42090C.set(java.lang.Boolean.valueOf(this.f42091D.d().M(this.f42091D.p().F())));
                    this.f42090C.notify();
                } catch (java.lang.Throwable th) {
                    this.f42090C.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
