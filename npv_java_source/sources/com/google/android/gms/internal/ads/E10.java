package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class E10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f26872a;

    public E10(android.os.Bundle bundle) {
        this.f26872a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f26872a);
        bundle.putBundle("device", bundleA);
    }
}
