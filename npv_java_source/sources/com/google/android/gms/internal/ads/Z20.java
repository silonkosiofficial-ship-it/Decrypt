package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f33459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33464f;

    public Z20(java.lang.String str, int i6, int i10, int i11, boolean z6, int i12) {
        this.f33459a = str;
        this.f33460b = i6;
        this.f33461c = i10;
        this.f33462d = i11;
        this.f33463e = z6;
        this.f33464f = i12;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        com.google.android.gms.internal.ads.B70.f(bundle, "carrier", this.f33459a, !android.text.TextUtils.isEmpty(this.f33459a));
        int i6 = this.f33460b;
        com.google.android.gms.internal.ads.B70.e(bundle, "cnt", i6, i6 != -2);
        bundle.putInt("gnt", this.f33461c);
        bundle.putInt("pt", this.f33462d);
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        android.os.Bundle bundleA2 = com.google.android.gms.internal.ads.B70.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f33464f);
        bundleA2.putBoolean("active_network_metered", this.f33463e);
    }
}
