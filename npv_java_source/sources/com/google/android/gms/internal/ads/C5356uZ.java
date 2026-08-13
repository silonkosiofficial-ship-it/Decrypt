package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5356uZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f39175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f39176b;

    public C5356uZ(java.lang.String str, int i6) {
        this.f39175a = str;
        this.f39176b = i6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        if (android.text.TextUtils.isEmpty(this.f39175a) || this.f39176b == -1) {
            return;
        }
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", this.f39175a);
        bundleA.putInt("pvid_s", this.f39176b);
    }
}
