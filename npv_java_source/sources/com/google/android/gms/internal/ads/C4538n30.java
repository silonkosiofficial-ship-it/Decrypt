package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4538n30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p144o3.a.C0676a f37492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f37493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2530Ke0 f37494c;

    public C4538n30(p144o3.a.C0676a c0676a, java.lang.String str, com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0) {
        this.f37492a = c0676a;
        this.f37493b = str;
        this.f37494c = c2530Ke0;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            org.json.JSONObject jSONObjectG = p214v3.V.g((org.json.JSONObject) obj, "pii");
            p144o3.a.C0676a c0676a = this.f37492a;
            if (c0676a == null || android.text.TextUtils.isEmpty(c0676a.a())) {
                java.lang.String str = this.f37493b;
                if (str != null) {
                    jSONObjectG.put("pdid", str);
                    jSONObjectG.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectG.put("rdid", this.f37492a.a());
            jSONObjectG.put("is_lat", this.f37492a.b());
            jSONObjectG.put("idtype", "adid");
            com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0 = this.f37494c;
            if (c2530Ke0.c()) {
                jSONObjectG.put("paidv1_id_android_3p", c2530Ke0.b());
                jSONObjectG.put("paidv1_creation_time_android_3p", this.f37494c.a());
            }
        } catch (org.json.JSONException e6) {
            p214v3.AbstractC7265q0.l("Failed putting Ad ID.", e6);
        }
    }
}
