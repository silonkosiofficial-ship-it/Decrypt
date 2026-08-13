package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4804pW implements com.google.android.gms.internal.ads.XT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f38014a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f38015b;

    public C4804pW(com.google.android.gms.internal.ads.SM sm) {
        this.f38015b = sm;
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final com.google.android.gms.internal.ads.YT a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.YT yt;
        synchronized (this) {
            try {
                yt = (com.google.android.gms.internal.ads.YT) this.f38014a.get(str);
                if (yt == null) {
                    yt = new com.google.android.gms.internal.ads.YT(this.f38015b.c(str, jSONObject), new com.google.android.gms.internal.ads.UU(), str);
                    this.f38014a.put(str, yt);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return yt;
    }
}
