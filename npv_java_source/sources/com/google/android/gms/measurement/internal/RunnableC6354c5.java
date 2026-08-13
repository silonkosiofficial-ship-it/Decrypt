package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6354c5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ p085i4.InterfaceC6654f f42337C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 f42338D;

    RunnableC6354c5(com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 serviceConnectionC6361d5, p085i4.InterfaceC6654f interfaceC6654f) {
        this.f42337C = interfaceC6654f;
        this.f42338D = serviceConnectionC6361d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42338D) {
            try {
                this.f42338D.f42348a = false;
                if (!this.f42338D.f42350c.g0()) {
                    this.f42338D.f42350c.j().K().a("Connected to service");
                    this.f42338D.f42350c.N(this.f42337C);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
