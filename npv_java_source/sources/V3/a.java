package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static byte[] a(android.content.Context context, java.lang.String str) {
        java.security.MessageDigest messageDigestB;
        android.content.pm.PackageInfo packageInfoF = W3.e.a(context).f(str, 64);
        android.content.pm.Signature[] signatureArr = packageInfoF.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b("SHA1")) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoF.signatures[0].toByteArray());
    }

    public static java.security.MessageDigest b(java.lang.String str) {
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
