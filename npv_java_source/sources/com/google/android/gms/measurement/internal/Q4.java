package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Q4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6499x4 f42103C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42104D;

    Q4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.C6499x4 c6499x4) {
        this.f42103C = c6499x4;
        this.f42104D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42104D.f41803d;
        if (interfaceC6654f == null) {
            this.f42104D.j().G().a("Failed to send current screen to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.C6499x4 c6499x4 = this.f42103C;
            if (c6499x4 == null) {
                interfaceC6654f.U2(0L, null, null, this.f42104D.a().getPackageName());
            } else {
                interfaceC6654f.U2(c6499x4.f42702c, c6499x4.f42700a, c6499x4.f42701b, this.f42104D.a().getPackageName());
            }
            this.f42104D.m0();
        } catch (android.os.RemoteException e6) {
            this.f42104D.j().G().b("Failed to send current screen to the service", e6);
        }
    }
}
