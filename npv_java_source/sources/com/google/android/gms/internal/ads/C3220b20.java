package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3220b20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f34197a;

    public C3220b20(android.os.Bundle bundle) {
        this.f34197a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        android.os.Bundle bundle = this.f34197a;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (bundle != null) {
            c3677fC.f35302b.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = this.f34197a;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (bundle != null) {
            c3677fC.f35301a.putAll(bundle);
        }
    }
}
