package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5197t30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f38853a;

    public C5197t30(java.lang.String str) {
        this.f38853a = str;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("ms", this.f38853a);
        } catch (org.json.JSONException e6) {
            p214v3.AbstractC7265q0.l("Failed putting Ad ID.", e6);
        }
    }
}
