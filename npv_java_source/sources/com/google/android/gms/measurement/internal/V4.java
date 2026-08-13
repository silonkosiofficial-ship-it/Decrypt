package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class V4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.E f42176C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42177D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42178E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42179F;

    V4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.E e6, java.lang.String str, com.google.android.gms.internal.measurement.U0 u6) {
        this.f42176C = e6;
        this.f42177D = str;
        this.f42178E = u6;
        this.f42179F = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrL5 = null;
        try {
            try {
                p085i4.InterfaceC6654f interfaceC6654f = this.f42179F.f41803d;
                if (interfaceC6654f == null) {
                    this.f42179F.j().G().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrL5 = interfaceC6654f.l5(this.f42176C, this.f42177D);
                    this.f42179F.m0();
                }
            } catch (android.os.RemoteException e6) {
                this.f42179F.j().G().b("Failed to send event to the service to bundle", e6);
            }
        } finally {
            this.f42179F.i().V(this.f42178E, bArrL5);
        }
    }
}
