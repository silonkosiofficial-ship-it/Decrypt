package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3108a10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f33984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f33985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.os.Bundle f33986c;

    /* synthetic */ C3108a10(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.ads.AbstractC3218b10 abstractC3218b10) {
        this.f33984a = str;
        this.f33985b = str2;
        this.f33986c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        bundle.putString("consent_string", this.f33984a);
        bundle.putString("fc_consent", this.f33985b);
        android.os.Bundle bundle2 = this.f33986c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
