package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6382g5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 f42412C;

    RunnableC6382g5(com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 serviceConnectionC6361d5) {
        this.f42412C = serviceConnectionC6361d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42412C.f42350c.f41803d = null;
        this.f42412C.f42350c.l0();
    }
}
