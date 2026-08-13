package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class O30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f30442a;

    public O30(java.util.List list) {
        this.f30442a = list;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("eid", android.text.TextUtils.join(",", this.f30442a));
        } catch (org.json.JSONException unused) {
            p214v3.AbstractC7265q0.k("Failed putting experiment ids.");
        }
    }
}
