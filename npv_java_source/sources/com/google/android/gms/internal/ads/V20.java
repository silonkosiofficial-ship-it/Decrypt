package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f32388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f32392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f32393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f32394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f32395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f32396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f32397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f32398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f32399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f32400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f32401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f32402q;

    public V20(boolean z6, boolean z10, java.lang.String str, boolean z11, boolean z12, boolean z13, java.lang.String str2, java.util.ArrayList arrayList, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z14, java.lang.String str6, long j6, boolean z15, java.lang.String str7, int i6) {
        this.f32386a = z6;
        this.f32387b = z10;
        this.f32388c = str;
        this.f32389d = z11;
        this.f32390e = z12;
        this.f32391f = z13;
        this.f32392g = str2;
        this.f32393h = arrayList;
        this.f32394i = str3;
        this.f32395j = str4;
        this.f32396k = str5;
        this.f32397l = z14;
        this.f32398m = str6;
        this.f32399n = j6;
        this.f32400o = z15;
        this.f32401p = str7;
        this.f32402q = i6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b;
        bundle.putBoolean("simulator", this.f32389d);
        bundle.putInt("build_api_level", this.f32402q);
        if (!this.f32393h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f32393h);
        }
        bundle.putString("submodel", this.f32398m);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        bundle.putBoolean("cog", this.f32386a);
        bundle.putBoolean("coh", this.f32387b);
        bundle.putString("gl", this.f32388c);
        bundle.putBoolean("simulator", this.f32389d);
        bundle.putBoolean("is_latchsky", this.f32390e);
        bundle.putInt("build_api_level", this.f32402q);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ua)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f32391f);
        }
        bundle.putString("hl", this.f32392g);
        if (!this.f32393h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f32393h);
        }
        bundle.putString("mv", this.f32394i);
        bundle.putString("submodel", this.f32398m);
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.f32396k);
        bundleA.putLong("remaining_data_partition_space", this.f32399n);
        android.os.Bundle bundleA2 = com.google.android.gms.internal.ads.B70.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f32397l);
        if (!android.text.TextUtils.isEmpty(this.f32395j)) {
            android.os.Bundle bundleA3 = com.google.android.gms.internal.ads.B70.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", this.f32395j);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.kb)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f32400o);
        }
        if (!android.text.TextUtils.isEmpty(this.f32401p)) {
            bundle.putString("v_unity", this.f32401p);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.eb)).booleanValue()) {
            com.google.android.gms.internal.ads.B70.g(bundle, "gotmt_l", true, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue());
            com.google.android.gms.internal.ads.B70.g(bundle, "gotmt_i", true, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ab)).booleanValue());
        }
    }
}
