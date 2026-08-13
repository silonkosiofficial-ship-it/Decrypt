package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6368e5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ p085i4.InterfaceC6654f f42377C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 f42378D;

    RunnableC6368e5(com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 serviceConnectionC6361d5, p085i4.InterfaceC6654f interfaceC6654f) {
        this.f42377C = interfaceC6654f;
        this.f42378D = serviceConnectionC6361d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f42378D) {
            try {
                this.f42378D.f42348a = false;
                if (!this.f42378D.f42350c.g0()) {
                    this.f42378D.f42350c.j().F().a("Connected to remote service");
                    this.f42378D.f42350c.N(this.f42377C);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
