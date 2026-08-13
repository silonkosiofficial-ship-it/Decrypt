package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5269tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.nio.charset.Charset f39019a = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC4940ql f39020b = new com.google.android.gms.internal.ads.C5159sl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC4610nl f39021c = new com.google.android.gms.internal.ads.InterfaceC4610nl() { // from class: com.google.android.gms.internal.ads.rl
        @Override // com.google.android.gms.internal.ads.InterfaceC4610nl
        public final java.lang.Object a(org.json.JSONObject jSONObject) {
            return com.google.android.gms.internal.ads.AbstractC5269tl.a(jSONObject);
        }
    };

    static /* synthetic */ java.io.InputStream a(org.json.JSONObject jSONObject) {
        return new java.io.ByteArrayInputStream(jSONObject.toString().getBytes(f39019a));
    }
}
