package N8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final java.lang.String a(java.lang.String str) {
        char cCharAt;
        p247y7.AbstractC7350t.f(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(cCharAt);
        java.lang.String strSubstring = str.substring(1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return upperCase + strSubstring;
    }

    public static final java.lang.String b(java.lang.String str) {
        char cCharAt;
        p247y7.AbstractC7350t.f(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = java.lang.Character.toLowerCase(cCharAt);
        java.lang.String strSubstring = str.substring(1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public static final java.lang.String c(java.lang.String str, boolean z6) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(str, "<this>");
        if (str.length() == 0 || !d(str, 0, z6)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z6)) {
            if (z6) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
            java.lang.String strSubstring = str.substring(1);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        java.util.Iterator it = S8.r.i0(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!d(str, ((java.lang.Number) next).intValue(), z6)));
        java.lang.Integer num = (java.lang.Integer) next;
        if (num == null) {
            return e(str, z6);
        }
        int iIntValue = num.intValue() - 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring2 = str.substring(0, iIntValue);
        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
        sb.append(e(strSubstring2, z6));
        java.lang.String strSubstring3 = str.substring(iIntValue);
        p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
        sb.append(strSubstring3);
        return sb.toString();
    }

    private static final boolean d(java.lang.String str, int i6, boolean z6) {
        char cCharAt = str.charAt(i6);
        if (z6) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return java.lang.Character.isUpperCase(cCharAt);
    }

    private static final java.lang.String e(java.lang.String str, boolean z6) {
        if (z6) {
            return f(str);
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final java.lang.String f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = java.lang.Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
