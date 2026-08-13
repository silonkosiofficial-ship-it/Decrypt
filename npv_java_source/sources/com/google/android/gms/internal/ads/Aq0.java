package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Aq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f25793a = new com.google.android.gms.internal.ads.C5940zq0();

    static /* synthetic */ java.security.SecureRandom a() {
        java.security.SecureRandom secureRandomC = c();
        secureRandomC.nextLong();
        return secureRandomC;
    }

    public static byte[] b(int i6) {
        byte[] bArr = new byte[i6];
        ((java.security.SecureRandom) f25793a.get()).nextBytes(bArr);
        return bArr;
    }

    private static java.security.SecureRandom c() {
        java.security.Provider providerA = com.google.android.gms.internal.ads.AbstractC3961hp0.a();
        if (providerA != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        java.security.Provider provider = null;
        try {
            provider = (java.security.Provider) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (java.security.GeneralSecurityException unused3) {
            }
        }
        return new java.security.SecureRandom();
    }
}
