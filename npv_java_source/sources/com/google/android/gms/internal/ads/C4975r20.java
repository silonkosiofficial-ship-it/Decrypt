package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4975r20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f38423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Bundle f38424b;

    public C4975r20(java.lang.String str, android.os.Bundle bundle) {
        this.f38423a = str;
        this.f38424b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        c3677fC.f35301a.putString("rtb", this.f38423a);
        if (this.f38424b.isEmpty()) {
            return;
        }
        c3677fC.f35301a.putBundle("adapter_initialization_status", this.f38424b);
    }
}
