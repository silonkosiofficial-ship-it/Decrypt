package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f28821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f28822b;

    public K30(java.lang.String str, java.lang.String str2) {
        this.f28821a = str;
        this.f28822b = str2;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            org.json.JSONObject jSONObjectG = p214v3.V.g((org.json.JSONObject) obj, "pii");
            jSONObjectG.put("doritos", this.f28821a);
            jSONObjectG.put("doritos_v2", this.f28822b);
        } catch (org.json.JSONException unused) {
            p214v3.AbstractC7265q0.k("Failed putting doritos string.");
        }
    }
}
