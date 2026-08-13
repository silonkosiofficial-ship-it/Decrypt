package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5141sc {
    public static int a(java.lang.String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (java.io.UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return V3.m.a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
    public static java.lang.String[] b(java.lang.String str, boolean z6) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char[] charArray = str.toCharArray();
        int i6 = 0;
        boolean z10 = false;
        int i10 = 0;
        while (i6 < str.length()) {
            int iCodePointAt = java.lang.Character.codePointAt(charArray, i6);
            int iCharCount = java.lang.Character.charCount(iCodePointAt);
            if (java.lang.Character.isLetter(iCodePointAt)) {
                java.lang.Character.UnicodeBlock unicodeBlockOf = java.lang.Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z10) {
                        arrayList.add(new java.lang.String(charArray, i10, i6 - i10));
                    }
                    arrayList.add(new java.lang.String(charArray, i6, iCharCount));
                } else {
                    if (!java.lang.Character.isLetterOrDigit(iCodePointAt) || java.lang.Character.getType(iCodePointAt) == 6 || java.lang.Character.getType(iCodePointAt) == 8) {
                        if (true != z10) {
                            i10 = i6;
                        }
                    } else if (z6 && java.lang.Character.charCount(iCodePointAt) == 1 && java.lang.Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z10) {
                            i10 = i6;
                        }
                    } else if (z10) {
                        arrayList.add(new java.lang.String(charArray, i10, i6 - i10));
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (java.lang.Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z10) {
                        i10 = i6;
                    }
                } else if (true != z10) {
                    i10 = i6;
                }
                z10 = true;
            }
            i6 += iCharCount;
        }
        if (z10) {
            arrayList.add(new java.lang.String(charArray, i10, i6 - i10));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}
