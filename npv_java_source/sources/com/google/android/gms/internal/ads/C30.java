package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class C30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f26136a;

    public C30(org.json.JSONObject jSONObject) {
        this.f26136a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("cache_state", this.f26136a);
        } catch (org.json.JSONException unused) {
            p214v3.AbstractC7265q0.k("Unable to get cache_state");
        }
    }
}
