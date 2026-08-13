package W6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    public static final W6.l a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return new W6.l(str);
    }

    private static final char b(char c6) {
        if ('A' > c6 || c6 >= '[') {
            return (c6 < 0 || c6 >= 128) ? java.lang.Character.toLowerCase(c6) : c6;
        }
        return (char) (c6 + ' ');
    }

    public static final java.lang.String c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        int length = str.length();
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            char cCharAt = str.charAt(i6);
            if (b(cCharAt) != cCharAt) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        sb.append((java.lang.CharSequence) str, 0, i6);
        int iJ0 = S8.r.j0(str);
        if (i6 <= iJ0) {
            while (true) {
                sb.append(b(str.charAt(i6)));
                if (i6 == iJ0) {
                    break;
                }
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
