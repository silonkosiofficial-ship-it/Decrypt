package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.po0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4837po0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f38078a = new com.google.android.gms.internal.ads.C4727oo0();

    public static java.security.spec.AlgorithmParameterSpec a(byte[] bArr, int i6, int i10) {
        j$.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project");
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, i6, 12);
    }

    public static javax.crypto.Cipher b() {
        return (javax.crypto.Cipher) f38078a.get();
    }

    public static javax.crypto.SecretKey c(byte[] bArr) throws java.security.InvalidAlgorithmParameterException {
        com.google.android.gms.internal.ads.Ju0.a(bArr.length);
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }
}
