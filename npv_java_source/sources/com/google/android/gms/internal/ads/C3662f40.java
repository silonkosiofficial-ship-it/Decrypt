package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3662f40 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f35271a;

    public C3662f40(java.lang.String str) {
        this.f35271a = str;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            if (android.text.TextUtils.isEmpty(this.f35271a)) {
                return;
            }
            p214v3.V.g(jSONObject, "pii").put("adsid", this.f35271a);
        } catch (org.json.JSONException e6) {
            p224w3.p.h("Failed putting trustless token.", e6);
        }
    }
}
