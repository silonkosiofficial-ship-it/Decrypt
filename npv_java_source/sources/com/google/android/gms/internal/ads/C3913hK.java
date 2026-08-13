package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3913hK implements com.google.android.gms.internal.ads.ZC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f36052C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4129jJ f36053D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Executor f36054E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.Executor f36055F;

    public C3913hK(com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.C4129jJ c4129jJ, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.f36052C = c3581eJ;
        this.f36053D = c4129jJ;
        this.f36054E = executor;
        this.f36055F = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f36054E.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.fK
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2698Ot.O("onSdkImpression", new p170r.C7026a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        if (this.f36053D.d()) {
            com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f36052C;
            com.google.android.gms.internal.ads.QT qtH0 = c3581eJ.h0();
            if (qtH0 == null && c3581eJ.j0() != null && ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25617l5)).booleanValue()) {
                com.google.android.gms.internal.ads.C3581eJ c3581eJ2 = this.f36052C;
                P4.d dVarJ0 = c3581eJ2.j0();
                com.google.android.gms.internal.ads.C4512mr c4512mrC0 = c3581eJ2.c0();
                if (dVarJ0 == null || c4512mrC0 == null) {
                    return;
                }
                com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.l(dVarJ0, c4512mrC0), new com.google.android.gms.internal.ads.C3803gK(this), this.f36055F);
                return;
            }
            if (qtH0 != null) {
                com.google.android.gms.internal.ads.C3581eJ c3581eJ3 = this.f36052C;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtE0 = c3581eJ3.e0();
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtF0 = c3581eJ3.f0();
                if (interfaceC2698OtE0 == null) {
                    interfaceC2698OtE0 = interfaceC2698OtF0 != null ? interfaceC2698OtF0 : null;
                }
                if (interfaceC2698OtE0 != null) {
                    b(interfaceC2698OtE0);
                }
            }
        }
    }
}
