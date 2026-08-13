package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3239bC implements com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.InterfaceC3131aD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f34253C;

    public C3239bC(android.content.Context context, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C2803Rn c2803Rn) {
        this.f34253C = r60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void g(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void k(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void r(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        com.google.android.gms.internal.ads.C2839Sn c2839Sn = this.f34253C.f31167d0;
        if (c2839Sn == null || !c2839Sn.f31751a) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f34253C.f31167d0.f31752b.isEmpty()) {
            return;
        }
        arrayList.add(this.f34253C.f31167d0.f31752b);
    }
}
