package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class R30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f31113a;

    public R30(android.os.Bundle bundle) {
        this.f31113a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (this.f31113a != null) {
            try {
                p214v3.V.g(p214v3.V.g(jSONObject, "device"), "play_store").put("parental_controls", p184s3.C7147y.b().k(this.f31113a));
            } catch (org.json.JSONException unused) {
                p214v3.AbstractC7265q0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
