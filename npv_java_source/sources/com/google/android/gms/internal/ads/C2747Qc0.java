package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2747Qc0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final byte[] f31016c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final byte[] f31017d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f31018a = f31017d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f31019b = f31016c;

    public final boolean a(java.io.File file) throws java.security.GeneralSecurityException {
        try {
            java.security.cert.X509Certificate[][] x509CertificateArrA = com.google.android.gms.internal.ads.J6.a(file.getAbsolutePath());
            if (x509CertificateArrA.length != 1) {
                throw new java.security.GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA-256").digest(x509CertificateArrA[0][0].getEncoded());
            if (java.util.Arrays.equals(this.f31019b, bArrDigest)) {
                return true;
            }
            return !"user".equals(android.os.Build.TYPE) && java.util.Arrays.equals(this.f31018a, bArrDigest);
        } catch (com.google.android.gms.internal.ads.F6 e6) {
            throw new java.security.GeneralSecurityException("Package is not signed", e6);
        } catch (java.io.IOException e10) {
            e = e10;
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        } catch (java.lang.RuntimeException e11) {
            e = e11;
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
