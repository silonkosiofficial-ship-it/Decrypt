package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class G30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f27656a;

    G30(android.content.Context context) {
        this.f27656a = com.google.android.gms.internal.ads.C2583Lo.c(context, p224w3.a.e());
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Pb)).booleanValue() ? new com.google.android.gms.internal.ads.K20() { // from class: com.google.android.gms.internal.ads.E30
            @Override // com.google.android.gms.internal.ads.K20
            public final /* synthetic */ void b(java.lang.Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.K20
            public final void c(java.lang.Object obj) {
            }
        } : new com.google.android.gms.internal.ads.K20() { // from class: com.google.android.gms.internal.ads.F30
            @Override // com.google.android.gms.internal.ads.K20
            public final /* synthetic */ void b(java.lang.Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.K20
            public final void c(java.lang.Object obj) {
                this.f27281a.c((org.json.JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void c(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f27656a);
        } catch (org.json.JSONException unused) {
            p214v3.AbstractC7265q0.k("Failed putting version constants.");
        }
    }
}
