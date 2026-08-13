package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4876q70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f38188a;

    public C4876q70(org.json.JSONObject jSONObject) {
        this.f38188a = jSONObject;
    }

    public final java.lang.String a() {
        if (c() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean b() {
        return this.f38188a.optBoolean((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25574h5), true);
    }

    public final int c() {
        int iOptInt = this.f38188a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
