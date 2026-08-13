package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class A20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f25016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f25021h;

    A20(boolean z6, boolean z10, java.lang.String str, boolean z11, int i6, int i10, int i11, java.lang.String str2) {
        this.f25014a = z6;
        this.f25015b = z10;
        this.f25016c = str;
        this.f25017d = z11;
        this.f25018e = i6;
        this.f25019f = i10;
        this.f25020g = i11;
        this.f25021h = str2;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        c3677fC.f35302b.putString("js", this.f25016c);
        c3677fC.f35302b.putInt("target_api", this.f25018e);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        bundle.putString("js", this.f25016c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25375P3));
        bundle.putInt("target_api", this.f25018e);
        bundle.putInt("dv", this.f25019f);
        bundle.putInt("lv", this.f25020g);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25366O5)).booleanValue() && !android.text.TextUtils.isEmpty(this.f25021h)) {
            bundle.putString("ev", this.f25021h);
        }
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26274c.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.f25014a);
        bundleA.putBoolean("lite", this.f25015b);
        bundleA.putBoolean("is_privileged_process", this.f25017d);
        bundle.putBundle("sdk_env", bundleA);
        android.os.Bundle bundleA2 = com.google.android.gms.internal.ads.B70.a(bundleA, "build_meta");
        bundleA2.putString("cl", "697668803");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
