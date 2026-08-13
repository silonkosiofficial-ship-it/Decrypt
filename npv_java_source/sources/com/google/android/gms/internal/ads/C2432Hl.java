package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2432Hl implements com.google.android.gms.internal.ads.InterfaceC5595wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f28105a;

    public C2432Hl(com.google.android.gms.internal.ads.C2469Il c2469Il, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f28105a = c4512mr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5595wj
    public final void a(org.json.JSONObject jSONObject) {
        try {
            this.f28105a.c(jSONObject);
        } catch (java.lang.IllegalStateException unused) {
        } catch (org.json.JSONException e6) {
            this.f28105a.d(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5595wj
    public final void o(java.lang.String str) {
        try {
            if (str == null) {
                this.f28105a.d(new com.google.android.gms.internal.ads.C4280kl());
            } else {
                this.f28105a.d(new com.google.android.gms.internal.ads.C4280kl(str));
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }
}
