package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3709fZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f35359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35360b;

    public C3709fZ(java.lang.String str, boolean z6) {
        this.f35359a = str;
        this.f35360b = z6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.String str = this.f35359a;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (str != null) {
            android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(c3677fC.f35301a, "pii");
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.f35360b);
        }
    }
}
