package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Z4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ boolean f42241C = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42242D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ boolean f42243E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6362e f42244F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6362e f42245G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42246H;

    Z4(com.google.android.gms.measurement.internal.F4 f6, boolean z6, com.google.android.gms.measurement.internal.M5 m6, boolean z10, com.google.android.gms.measurement.internal.C6362e c6362e, com.google.android.gms.measurement.internal.C6362e c6362e2) {
        this.f42242D = m6;
        this.f42243E = z10;
        this.f42244F = c6362e;
        this.f42245G = c6362e2;
        this.f42246H = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42246H.f41803d;
        if (interfaceC6654f == null) {
            this.f42246H.j().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f42241C) {
            Q3.AbstractC1477p.l(this.f42242D);
            this.f42246H.O(interfaceC6654f, this.f42243E ? null : this.f42244F, this.f42242D);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.f42245G.f42359C)) {
                    Q3.AbstractC1477p.l(this.f42242D);
                    interfaceC6654f.w2(this.f42244F, this.f42242D);
                } else {
                    interfaceC6654f.m3(this.f42244F);
                }
            } catch (android.os.RemoteException e6) {
                this.f42246H.j().G().b("Failed to send conditional user property to the service", e6);
            }
        }
        this.f42246H.m0();
    }
}
