package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3961hp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f36139a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static java.security.Provider a() {
        java.lang.String[] strArr = f36139a;
        for (int i6 = 0; i6 < 3; i6++) {
            java.security.Provider provider = java.security.Security.getProvider(strArr[i6]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
