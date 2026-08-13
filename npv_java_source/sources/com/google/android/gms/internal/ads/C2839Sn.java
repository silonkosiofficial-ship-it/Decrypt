package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2839Sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31753c;

    public C2839Sn(boolean z6, java.lang.String str, boolean z10) {
        this.f31751a = z6;
        this.f31752b = str;
        this.f31753c = z10;
    }

    public static com.google.android.gms.internal.ads.C2839Sn a(org.json.JSONObject jSONObject) {
        return new com.google.android.gms.internal.ads.C2839Sn(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
