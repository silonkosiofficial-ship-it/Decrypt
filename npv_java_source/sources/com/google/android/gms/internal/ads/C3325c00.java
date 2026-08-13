package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3325c00 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f34410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.json.JSONObject f34411b;

    public C3325c00(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        this.f34410a = jSONObject;
        this.f34411b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        org.json.JSONObject jSONObject = this.f34411b;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (jSONObject != null) {
            c3677fC.f35302b.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        org.json.JSONObject jSONObject = this.f34410a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        org.json.JSONObject jSONObject2 = this.f34411b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
