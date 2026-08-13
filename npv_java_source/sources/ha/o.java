package ha;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public static boolean a(java.lang.String str) {
        java.lang.String strB = b(str);
        if (strB == null) {
            return false;
        }
        return strB.equalsIgnoreCase("true");
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("null input");
        }
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }
}
