package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Objects {
    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t6) {
        t6.getClass();
        return t6;
    }

    public static <T> T requireNonNull(T t6, java.lang.String str) {
        if (t6 != null) {
            return t6;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.String toString(java.lang.Object obj, java.lang.String str) {
        return obj != null ? obj.toString() : str;
    }
}
