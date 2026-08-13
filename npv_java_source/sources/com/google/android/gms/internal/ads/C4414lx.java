package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4414lx implements com.google.android.gms.internal.ads.InterfaceC3318bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f37256a;

    C4414lx(com.google.android.gms.internal.ads.KP kp) {
        this.f37256a = kp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3318bx
    public final void a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25544e9)).booleanValue()) {
                this.f37256a.o(jSONObject);
            }
        }
    }
}
