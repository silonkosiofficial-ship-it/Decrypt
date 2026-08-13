package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K00 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28796b;

    public K00(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f28795a = interfaceC5078rz0;
        this.f28796b = interfaceC5078rz1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0O;
        com.google.android.gms.internal.ads.C4094j10 c4094j10B = ((com.google.android.gms.internal.ads.C4314l10) this.f28795a).b();
        android.content.Context contextA = ((com.google.android.gms.internal.ads.C3204av) this.f28796b).a();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.lb)).booleanValue()) {
            p174r3.v.t();
            if (p214v3.E0.c(contextA)) {
                abstractC3947hi0O = com.google.android.gms.internal.ads.AbstractC3947hi0.P(c4094j10B);
            } else {
                abstractC3947hi0O = com.google.android.gms.internal.ads.AbstractC3947hi0.O();
            }
        } else {
            abstractC3947hi0O = com.google.android.gms.internal.ads.AbstractC3947hi0.O();
        }
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(abstractC3947hi0O);
        return abstractC3947hi0O;
    }
}
