package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ta0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2853Ta0 extends com.google.android.gms.internal.ads.AbstractC5250tb0 {
    public C2853Ta0(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i6, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, p184s3.I1 i10, p184s3.InterfaceC7083c0 interfaceC7083c0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C2780Ra0 c2780Ra0, V3.f fVar) {
        super(clientApi, context, i6, interfaceC2945Vl, i10, interfaceC7083c0, scheduledExecutorService, c2780Ra0, fVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5250tb0
    protected final P4.d e() {
        com.google.android.gms.internal.ads.C2632Na0 c2632Na0;
        com.google.android.gms.internal.ads.C4062il0 c4062il0D = com.google.android.gms.internal.ads.C4062il0.D();
        p184s3.V vV5 = this.f38981a.v5(X3.b.c2(this.f38982b), new p184s3.c2(), this.f38985e.f54130C, this.f38984d, this.f38983c);
        if (vV5 != null) {
            try {
                vV5.o3(this.f38985e.f54132E, new com.google.android.gms.internal.ads.BinderC2817Sa0(this, c4062il0D, vV5));
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to load interstitial ad.", e6);
                c2632Na0 = new com.google.android.gms.internal.ads.C2632Na0(1, "remote exception");
                c4062il0D.h(c2632Na0);
            }
            return c4062il0D;
        }
        c2632Na0 = new com.google.android.gms.internal.ads.C2632Na0(1, "Failed to create an interstitial ad manager.");
        c4062il0D.h(c2632Na0);
        return c4062il0D;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5250tb0
    protected final /* bridge */ /* synthetic */ j$.util.Optional f(java.lang.Object obj) {
        try {
            return j$.util.Optional.ofNullable(((p184s3.V) obj).k());
        } catch (android.os.RemoteException e6) {
            p224w3.p.c("Failed to get response info for  the interstitial ad.", e6);
            return j$.util.Optional.empty();
        }
    }
}
