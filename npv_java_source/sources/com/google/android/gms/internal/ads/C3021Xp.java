package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3021Xp extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3021Xp> CREATOR = new com.google.android.gms.internal.ads.C3057Yp();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f33171C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f33172D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f33173E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f33174F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.util.List f33175G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f33176H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f33177I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.util.List f33178J;

    public C3021Xp(java.lang.String str, java.lang.String str2, boolean z6, boolean z10, java.util.List list, boolean z11, boolean z12, java.util.List list2) {
        this.f33171C = str;
        this.f33172D = str2;
        this.f33173E = z6;
        this.f33174F = z10;
        this.f33175G = list;
        this.f33176H = z11;
        this.f33177I = z12;
        this.f33178J = list2 == null ? new java.util.ArrayList() : list2;
    }

    public static com.google.android.gms.internal.ads.C3021Xp e(org.json.JSONObject jSONObject) {
        return new com.google.android.gms.internal.ads.C3021Xp(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), p214v3.V.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), p214v3.V.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f33171C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, str, false);
        R3.c.q(parcel, 3, this.f33172D, false);
        R3.c.c(parcel, 4, this.f33173E);
        R3.c.c(parcel, 5, this.f33174F);
        R3.c.s(parcel, 6, this.f33175G, false);
        R3.c.c(parcel, 7, this.f33176H);
        R3.c.c(parcel, 8, this.f33177I);
        R3.c.s(parcel, 9, this.f33178J, false);
        R3.c.b(parcel, iA);
    }
}
