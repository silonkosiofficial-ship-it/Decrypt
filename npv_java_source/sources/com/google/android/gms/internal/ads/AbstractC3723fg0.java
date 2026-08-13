package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3723fg0 {
    public static java.lang.String a(java.lang.String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            if (e(str.charAt(i6))) {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c6 = charArray[i6];
                    if (e(c6)) {
                        charArray[i6] = (char) (c6 ^ ' ');
                    }
                    i6++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static java.lang.String b(java.lang.String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            if (d(str.charAt(i6))) {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c6 = charArray[i6];
                    if (d(c6)) {
                        charArray[i6] = (char) (c6 ^ ' ');
                    }
                    i6++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static boolean c(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        int iF;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = charSequence.charAt(i6);
            char cCharAt2 = charSequence2.charAt(i6);
            if (cCharAt != cCharAt2 && ((iF = f(cCharAt)) >= 26 || iF != f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(char c6) {
        return c6 >= 'a' && c6 <= 'z';
    }

    public static boolean e(char c6) {
        return c6 >= 'A' && c6 <= 'Z';
    }

    private static int f(char c6) {
        return (char) ((c6 | ' ') - 97);
    }
}
