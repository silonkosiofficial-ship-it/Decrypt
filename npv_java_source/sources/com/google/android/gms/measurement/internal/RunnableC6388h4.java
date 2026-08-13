package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6388h4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42421C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42422D;

    RunnableC6388h4(com.google.android.gms.measurement.internal.F3 f6, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f42421C = atomicReference;
        this.f42422D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42421C) {
            try {
                try {
                    this.f42421C.set(java.lang.Integer.valueOf(this.f42422D.d().w(this.f42422D.p().F(), com.google.android.gms.measurement.internal.G.f41842Q)));
                    this.f42421C.notify();
                } catch (java.lang.Throwable th) {
                    this.f42421C.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
