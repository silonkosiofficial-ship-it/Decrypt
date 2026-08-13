package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5515vy implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39483a;

    public C5515vy(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f39483a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        try {
            return new org.json.JSONObject(((com.google.android.gms.internal.ads.C5650xA) this.f39483a).a().f31210z);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
