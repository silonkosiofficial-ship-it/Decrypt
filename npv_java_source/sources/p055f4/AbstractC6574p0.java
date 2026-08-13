package p055f4;

/* JADX INFO: renamed from: f4.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6574p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f45218a;

    public static synchronized java.lang.String a(android.content.Context context) {
        try {
            if (f45218a == null) {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                java.lang.String string = contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || p055f4.AbstractC6589x0.a(true)) {
                    string = "emulator";
                }
                f45218a = b(string);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f45218a;
    }

    private static java.lang.String b(java.lang.String str) {
        for (int i6 = 0; i6 < 3; i6++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return java.lang.String.format("%032X", new java.math.BigInteger(1, messageDigest.digest()));
            } catch (java.lang.ArithmeticException unused) {
                return "";
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
