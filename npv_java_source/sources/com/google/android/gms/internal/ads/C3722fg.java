package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3722fg extends D3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f35385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3832gg f35386b;

    C3722fg(com.google.android.gms.internal.ads.C3832gg c3832gg, java.lang.String str) {
        this.f35385a = str;
        this.f35386b = c3832gg;
    }

    @Override // D3.b
    public final void a(java.lang.String str) {
        p224w3.p.g("Failed to generate query info for Custom Tab error: ".concat(java.lang.String.valueOf(str)));
        try {
            com.google.android.gms.internal.ads.C3832gg c3832gg = this.f35386b;
            c3832gg.f35659g.g(c3832gg.c(this.f35385a, str).toString(), null);
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error creating PACT Error Response JSON: ", e6);
        }
    }

    @Override // D3.b
    public final void b(D3.a aVar) {
        java.lang.String strB = aVar.b();
        try {
            com.google.android.gms.internal.ads.C3832gg c3832gg = this.f35386b;
            c3832gg.f35659g.g(c3832gg.d(this.f35385a, strB).toString(), null);
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error creating PACT Signal Response JSON: ", e6);
        }
    }
}
