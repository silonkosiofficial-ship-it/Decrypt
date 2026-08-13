package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J extends S8.I {
    public static char A1(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new java.util.NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new java.lang.IllegalArgumentException("Char sequence has more than one element.");
    }

    public static java.lang.String B1(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (i6 >= 0) {
            java.lang.String strSubstring = str.substring(0, E7.j.g(i6, str.length()));
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new java.lang.IllegalArgumentException(("Requested character count " + i6 + " is less than zero.").toString());
    }

    public static java.lang.String w1(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (i6 >= 0) {
            java.lang.String strSubstring = str.substring(E7.j.g(i6, str.length()));
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new java.lang.IllegalArgumentException(("Requested character count " + i6 + " is less than zero.").toString());
    }

    public static java.lang.String x1(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (i6 >= 0) {
            return S8.r.B1(str, E7.j.d(str.length() - i6, 0));
        }
        throw new java.lang.IllegalArgumentException(("Requested character count " + i6 + " is less than zero.").toString());
    }

    public static char y1(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new java.util.NoSuchElementException("Char sequence is empty.");
    }

    public static char z1(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(S8.r.j0(charSequence));
        }
        throw new java.util.NoSuchElementException("Char sequence is empty.");
    }
}
