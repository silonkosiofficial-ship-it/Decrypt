package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G00 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27619a;

    public G00(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f27619a = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0O;
        com.google.android.gms.internal.ads.XZ xzA = com.google.android.gms.internal.ads.ZZ.a();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.f27619a.b();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25562g4)).booleanValue()) {
            abstractC3947hi0O = com.google.android.gms.internal.ads.AbstractC3947hi0.P(new com.google.android.gms.internal.ads.T10(xzA, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25573h4)).intValue(), scheduledExecutorService));
        } else {
            abstractC3947hi0O = com.google.android.gms.internal.ads.AbstractC3947hi0.O();
        }
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(abstractC3947hi0O);
        return abstractC3947hi0O;
    }
}
