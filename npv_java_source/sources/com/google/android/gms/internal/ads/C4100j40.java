package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4100j40 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f36556a;

    public C4100j40(java.util.Map map) {
        this.f36556a = map;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("video_decoders", p184s3.C7147y.b().l(this.f36556a));
        } catch (org.json.JSONException e6) {
            p214v3.AbstractC7265q0.k("Could not encode video decoder properties: ".concat(java.lang.String.valueOf(e6.getMessage())));
        }
    }
}
