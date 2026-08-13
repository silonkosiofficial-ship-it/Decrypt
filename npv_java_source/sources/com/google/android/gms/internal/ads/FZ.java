package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f27386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f27387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f27388k;

    public FZ(int i6, boolean z6, boolean z10, int i10, int i11, int i12, int i13, int i14, float f6, boolean z11, boolean z12) {
        this.f27378a = i6;
        this.f27379b = z6;
        this.f27380c = z10;
        this.f27381d = i10;
        this.f27382e = i11;
        this.f27383f = i12;
        this.f27384g = i13;
        this.f27385h = i14;
        this.f27386i = f6;
        this.f27387j = z11;
        this.f27388k = z12;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ra)).booleanValue()) {
            bundle.putInt("muv_min", this.f27382e);
            bundle.putInt("muv_max", this.f27383f);
        }
        bundle.putFloat("android_app_volume", this.f27386i);
        bundle.putBoolean("android_app_muted", this.f27387j);
        if (this.f27388k) {
            return;
        }
        bundle.putInt("am", this.f27378a);
        bundle.putBoolean("ma", this.f27379b);
        bundle.putBoolean("sp", this.f27380c);
        bundle.putInt("muv", this.f27381d);
        bundle.putInt("rm", this.f27384g);
        bundle.putInt("riv", this.f27385h);
    }
}
