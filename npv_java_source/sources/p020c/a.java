package p020c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static java.security.MessageDigest a(java.lang.String str) {
        try {
            return java.security.MessageDigest.getInstance(str);
        } catch (java.security.NoSuchAlgorithmException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public static java.security.MessageDigest b() {
        return a("SHA-256");
    }

    public static byte[] c(java.lang.String str) {
        return d(p010b.b.b(str));
    }

    public static byte[] d(byte[] bArr) {
        return b().digest(bArr);
    }

    public static java.lang.String e(java.lang.String str) {
        return p010b.a.e(c(str));
    }
}
