package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class YY implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f33370a;

    YY(android.os.Bundle bundle) {
        this.f33370a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (this.f33370a.isEmpty()) {
            return;
        }
        c3677fC.f35301a.putBundle("installed_adapter_data", this.f33370a);
    }
}
