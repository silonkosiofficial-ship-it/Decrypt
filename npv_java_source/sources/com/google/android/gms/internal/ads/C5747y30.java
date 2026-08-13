package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5747y30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f39978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f39979b;

    public C5747y30(java.lang.String str, int i6) {
        this.f39978a = str;
        this.f39979b = i6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (android.text.TextUtils.isEmpty(this.f39978a) || this.f39979b == -1) {
            return;
        }
        try {
            org.json.JSONObject jSONObjectG = p214v3.V.g(jSONObject, "pii");
            jSONObjectG.put("pvid", this.f39978a);
            jSONObjectG.put("pvid_s", this.f39979b);
        } catch (org.json.JSONException e6) {
            p214v3.AbstractC7265q0.l("Failed putting gms core app set ID info.", e6);
        }
    }
}
