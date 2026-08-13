package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2469Il implements com.google.android.gms.internal.ads.InterfaceC5268tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f28497a = "google.afma.activeView.handleUpdate";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P4.d f28498b;

    C2469Il(P4.d dVar, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC4720ol interfaceC4720ol, com.google.android.gms.internal.ads.InterfaceC4610nl interfaceC4610nl) {
        this.f28498b = dVar;
    }

    final /* synthetic */ P4.d a(java.lang.Object obj, com.google.android.gms.internal.ads.InterfaceC4061il interfaceC4061il) throws org.json.JSONException {
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        p174r3.v.t();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        com.google.android.gms.internal.ads.AbstractC3728fj.f35410o.c(string, new com.google.android.gms.internal.ads.C2432Hl(this, c4512mr));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (org.json.JSONObject) obj);
        interfaceC4061il.G0(this.f28497a, jSONObject);
        return c4512mr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
    public final P4.d b(java.lang.Object obj) {
        return c(obj);
    }

    public final P4.d c(final java.lang.Object obj) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f28498b, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Gl
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj2) {
                return this.f27873a.a(obj, (com.google.android.gms.internal.ads.InterfaceC4061il) obj2);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }
}
