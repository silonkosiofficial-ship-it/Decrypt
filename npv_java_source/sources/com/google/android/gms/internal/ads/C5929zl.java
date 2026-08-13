package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5929zl implements com.google.android.gms.internal.ads.InterfaceC5595wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3294bl f40369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f40370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2173Al f40371c;

    public C5929zl(com.google.android.gms.internal.ads.C2173Al c2173Al, com.google.android.gms.internal.ads.C3294bl c3294bl, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f40371c = c2173Al;
        this.f40369a = c3294bl;
        this.f40370b = c4512mr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5595wj
    public final void a(org.json.JSONObject jSONObject) {
        try {
            try {
                this.f40370b.c(this.f40371c.f25778a.a(jSONObject));
            } catch (java.lang.IllegalStateException unused) {
            } catch (org.json.JSONException e6) {
                this.f40370b.d(e6);
            }
        } finally {
            this.f40369a.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5595wj
    public final void o(java.lang.String str) {
        try {
            if (str == null) {
                this.f40370b.d(new com.google.android.gms.internal.ads.C4280kl());
            } else {
                this.f40370b.d(new com.google.android.gms.internal.ads.C4280kl(str));
            }
        } catch (java.lang.IllegalStateException unused) {
        } finally {
            this.f40369a.h();
        }
    }
}
