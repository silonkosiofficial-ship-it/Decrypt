package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5654xC extends p184s3.T0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f39800C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f39801D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f39802E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f39803F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.List f39804G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final long f39805H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String f39806I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f39807J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final android.os.Bundle f39808K;

    public BinderC5654xC(com.google.android.gms.internal.ads.R60 r60, java.lang.String str, com.google.android.gms.internal.ads.C3266bU c3266bU, com.google.android.gms.internal.ads.U60 u60, java.lang.String str2) {
        java.lang.String string = null;
        this.f39801D = r60 == null ? null : r60.f31163b0;
        this.f39802E = str2;
        this.f39803F = u60 == null ? null : u60.f32114b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && r60 != null) {
            try {
                string = r60.f31202v.getString("class_name");
            } catch (org.json.JSONException unused) {
            }
        }
        this.f39800C = string != null ? string : str;
        this.f39804G = c3266bU.c();
        this.f39807J = c3266bU;
        this.f39805H = p174r3.v.c().a() / 1000;
        this.f39808K = (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25257E6)).booleanValue() || u60 == null) ? new android.os.Bundle() : u60.f32123k;
        this.f39806I = (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25555f9)).booleanValue() || u60 == null || android.text.TextUtils.isEmpty(u60.f32121i)) ? "" : u60.f32121i;
    }

    public final long c() {
        return this.f39805H;
    }

    @Override // p184s3.U0
    public final android.os.Bundle d() {
        return this.f39808K;
    }

    @Override // p184s3.U0
    public final p184s3.g2 e() {
        com.google.android.gms.internal.ads.C3266bU c3266bU = this.f39807J;
        if (c3266bU != null) {
            return c3266bU.a();
        }
        return null;
    }

    public final java.lang.String f() {
        return this.f39806I;
    }

    @Override // p184s3.U0
    public final java.lang.String g() {
        return this.f39802E;
    }

    @Override // p184s3.U0
    public final java.lang.String h() {
        return this.f39801D;
    }

    @Override // p184s3.U0
    public final java.lang.String i() {
        return this.f39800C;
    }

    @Override // p184s3.U0
    public final java.util.List j() {
        return this.f39804G;
    }

    public final java.lang.String k() {
        return this.f39803F;
    }
}
