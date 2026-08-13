package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class BinderC2384Gf0 extends com.google.android.gms.internal.ads.AbstractBinderC3041Ye0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2642Nf0 f27862C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2421Hf0 f27863D;

    BinderC2384Gf0(com.google.android.gms.internal.ads.C2421Hf0 c2421Hf0, com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0) {
        this.f27863D = c2421Hf0;
        this.f27862C = interfaceC2642Nf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3077Ze0
    public final void r4(android.os.Bundle bundle) {
        int i6 = bundle.getInt("statusCode", 8150);
        java.lang.String string = bundle.getString("sessionToken");
        com.google.android.gms.internal.ads.AbstractC2532Kf0 abstractC2532Kf0C = com.google.android.gms.internal.ads.AbstractC2605Mf0.c();
        abstractC2532Kf0C.b(i6);
        if (string != null) {
            abstractC2532Kf0C.a(string);
        }
        this.f27862C.a(abstractC2532Kf0C.c());
        if (i6 == 8157) {
            this.f27863D.a();
        }
    }
}
