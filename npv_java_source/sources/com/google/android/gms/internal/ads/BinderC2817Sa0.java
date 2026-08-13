package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class BinderC2817Sa0 extends p184s3.J {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4062il0 f31715C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p184s3.V f31716D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2853Ta0 f31717E;

    BinderC2817Sa0(com.google.android.gms.internal.ads.C2853Ta0 c2853Ta0, com.google.android.gms.internal.ads.C4062il0 c4062il0, p184s3.V v6) {
        this.f31715C = c4062il0;
        this.f31716D = v6;
        this.f31717E = c2853Ta0;
    }

    @Override // p184s3.K
    public final void c() {
        com.google.android.gms.internal.ads.AbstractC2669Oa0.a(this.f31716D, this.f31715C);
    }

    @Override // p184s3.K
    public final void x0(p184s3.W0 w6) {
        p224w3.p.g("Failed to load interstitial ad with error: " + w6.f().toString() + " for ad unit: " + this.f31717E.f38985e.f54130C);
        this.f31717E.a(w6);
    }
}
