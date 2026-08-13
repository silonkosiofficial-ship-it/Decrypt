package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Vp0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Vp0 f32587b = new com.google.android.gms.internal.ads.Vp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f32588a = new java.util.HashMap();

    Vp0() {
    }

    public static com.google.android.gms.internal.ads.Vp0 b() {
        return f32587b;
    }

    public final synchronized com.google.android.gms.internal.ads.Sl0 a(java.lang.String str) {
        if (!this.f32588a.containsKey("AES128_GCM")) {
            throw new java.security.GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (com.google.android.gms.internal.ads.Sl0) this.f32588a.get("AES128_GCM");
    }

    public final synchronized void c(java.lang.String str, com.google.android.gms.internal.ads.Sl0 sl0) {
        try {
            if (!this.f32588a.containsKey(str)) {
                this.f32588a.put(str, sl0);
                return;
            }
            if (((com.google.android.gms.internal.ads.Sl0) this.f32588a.get(str)).equals(sl0)) {
                return;
            }
            throw new java.security.GeneralSecurityException("Parameters object with name " + str + " already exists (" + java.lang.String.valueOf(this.f32588a.get(str)) + "), cannot insert " + java.lang.String.valueOf(sl0));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            c((java.lang.String) entry.getKey(), (com.google.android.gms.internal.ads.Sl0) entry.getValue());
        }
    }
}
