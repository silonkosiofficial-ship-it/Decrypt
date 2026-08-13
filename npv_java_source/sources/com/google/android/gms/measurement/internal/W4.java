package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class W4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ boolean f42191C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42192D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ boolean f42193E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.E f42194F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42195G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42196H;

    W4(com.google.android.gms.measurement.internal.F4 f6, boolean z6, com.google.android.gms.measurement.internal.M5 m6, boolean z10, com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        this.f42191C = z6;
        this.f42192D = m6;
        this.f42193E = z10;
        this.f42194F = e6;
        this.f42195G = str;
        this.f42196H = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jC;
        long j6;
        long jA;
        p085i4.InterfaceC6654f interfaceC6654f = this.f42196H.f41803d;
        if (interfaceC6654f == null) {
            this.f42196H.j().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f42191C) {
            Q3.AbstractC1477p.l(this.f42192D);
            this.f42196H.O(interfaceC6654f, this.f42193E ? null : this.f42194F, this.f42192D);
        } else {
            boolean zT = this.f42196H.d().t(com.google.android.gms.measurement.internal.G.f41821F0);
            try {
                if (android.text.TextUtils.isEmpty(this.f42195G)) {
                    Q3.AbstractC1477p.l(this.f42192D);
                    if (zT) {
                        jA = this.f42196H.f42679a.b().a();
                        try {
                            jC = this.f42196H.f42679a.b().c();
                        } catch (android.os.RemoteException e6) {
                            e = e6;
                            jC = 0;
                            j6 = jA;
                            this.f42196H.j().G().b("Failed to send event to the service", e);
                            if (zT) {
                                com.google.android.gms.measurement.internal.C6414l2.a(this.f42196H.f42679a).b(36301, 13, j6, this.f42196H.f42679a.b().a(), (int) (this.f42196H.f42679a.b().c() - jC));
                            }
                            this.f42196H.m0();
                        }
                    } else {
                        jA = 0;
                        jC = 0;
                    }
                    try {
                        interfaceC6654f.d6(this.f42194F, this.f42192D);
                        if (zT) {
                            this.f42196H.j().K().a("Logging telemetry for logEvent");
                            com.google.android.gms.measurement.internal.C6414l2.a(this.f42196H.f42679a).b(36301, 0, jA, this.f42196H.f42679a.b().a(), (int) (this.f42196H.f42679a.b().c() - jC));
                        }
                    } catch (android.os.RemoteException e10) {
                        e = e10;
                        j6 = jA;
                        this.f42196H.j().G().b("Failed to send event to the service", e);
                        if (zT && j6 != 0) {
                            com.google.android.gms.measurement.internal.C6414l2.a(this.f42196H.f42679a).b(36301, 13, j6, this.f42196H.f42679a.b().a(), (int) (this.f42196H.f42679a.b().c() - jC));
                        }
                    }
                } else {
                    interfaceC6654f.U3(this.f42194F, this.f42195G, this.f42196H.j().O());
                }
            } catch (android.os.RemoteException e11) {
                e = e11;
                jC = 0;
                j6 = 0;
            }
        }
        this.f42196H.m0();
    }
}
