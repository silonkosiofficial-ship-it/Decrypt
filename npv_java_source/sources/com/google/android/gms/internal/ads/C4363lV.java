package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4363lV implements com.google.android.gms.internal.ads.XT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f37178a;

    public C4363lV(com.google.android.gms.internal.ads.SM sm) {
        this.f37178a = sm;
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final com.google.android.gms.internal.ads.YT a(java.lang.String str, org.json.JSONObject jSONObject) {
        return new com.google.android.gms.internal.ads.YT(this.f37178a.c(str, jSONObject), new com.google.android.gms.internal.ads.TU(), str);
    }
}
