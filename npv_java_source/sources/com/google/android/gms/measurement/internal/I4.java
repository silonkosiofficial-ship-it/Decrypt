package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class I4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41989C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41990D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f41991E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f41992F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f41993G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f41994H;

    I4(com.google.android.gms.measurement.internal.F4 f6, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.M5 m6, boolean z6, com.google.android.gms.internal.measurement.U0 u6) {
        this.f41989C = str;
        this.f41990D = str2;
        this.f41991E = m6;
        this.f41992F = z6;
        this.f41993G = u6;
        this.f41994H = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            try {
                p085i4.InterfaceC6654f interfaceC6654f = this.f41994H.f41803d;
                if (interfaceC6654f == null) {
                    this.f41994H.j().G().c("Failed to get user properties; not connected to service", this.f41989C, this.f41990D);
                } else {
                    Q3.AbstractC1477p.l(this.f41991E);
                    bundle = com.google.android.gms.measurement.internal.d6.G(interfaceC6654f.S4(this.f41989C, this.f41990D, this.f41992F, this.f41991E));
                    this.f41994H.m0();
                }
            } catch (android.os.RemoteException e6) {
                this.f41994H.j().G().c("Failed to get user properties; remote exception", this.f41989C, e6);
            }
        } finally {
            this.f41994H.i().R(this.f41993G, bundle);
        }
    }
}
