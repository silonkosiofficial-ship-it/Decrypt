package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DI implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BI f26638a;

    public DI(com.google.android.gms.internal.ads.BI bi) {
        this.f26638a = bi;
    }

    public static org.json.JSONObject a(com.google.android.gms.internal.ads.BI bi) {
        org.json.JSONObject jSONObjectB = bi.b();
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(jSONObjectB);
        return jSONObjectB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* synthetic */ java.lang.Object b() {
        return a(this.f26638a);
    }

    public final org.json.JSONObject c() {
        return a(this.f26638a);
    }
}
