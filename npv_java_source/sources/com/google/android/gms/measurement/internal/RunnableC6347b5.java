package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6347b5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42283C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42284D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42285E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42286F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42287G;

    RunnableC6347b5(com.google.android.gms.measurement.internal.F4 f6, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.M5 m6, com.google.android.gms.internal.measurement.U0 u6) {
        this.f42283C = str;
        this.f42284D = str2;
        this.f42285E = m6;
        this.f42286F = u6;
        this.f42287G = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                p085i4.InterfaceC6654f interfaceC6654f = this.f42287G.f41803d;
                if (interfaceC6654f == null) {
                    this.f42287G.j().G().c("Failed to get conditional properties; not connected to service", this.f42283C, this.f42284D);
                } else {
                    Q3.AbstractC1477p.l(this.f42285E);
                    arrayList = com.google.android.gms.measurement.internal.d6.t0(interfaceC6654f.N0(this.f42283C, this.f42284D, this.f42285E));
                    this.f42287G.m0();
                }
            } catch (android.os.RemoteException e6) {
                this.f42287G.j().G().d("Failed to get conditional properties; remote exception", this.f42283C, this.f42284D, e6);
            }
        } finally {
            this.f42287G.i().T(this.f42286F, arrayList);
        }
    }
}
