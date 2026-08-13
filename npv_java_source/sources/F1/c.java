package F1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f2733a = new java.lang.String[0];

    private static class a {
        static void a(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i6) {
            editorInfo.setInitialSurroundingSubText(charSequence, i6);
        }
    }

    public static java.lang.String[] a(android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.lang.String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f2733a;
        }
        android.os.Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f2733a;
        }
        java.lang.String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f2733a;
    }

    private static boolean b(java.lang.CharSequence charSequence, int i6, int i10) {
        if (i10 == 0) {
            return java.lang.Character.isLowSurrogate(charSequence.charAt(i6));
        }
        if (i10 != 1) {
            return false;
        }
        return java.lang.Character.isHighSurrogate(charSequence.charAt(i6));
    }

    private static boolean c(int i6) {
        int i10 = i6 & 4095;
        return i10 == 129 || i10 == 225 || i10 == 18;
    }

    public static void d(android.view.inputmethod.EditorInfo editorInfo, java.lang.String[] strArr) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i6) {
        B1.i.g(charSequence);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            F1.c.a.a(editorInfo, charSequence, i6);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 - i6 : i10 - i6;
        int i13 = i10 > i11 ? i10 - i6 : i11 - i6;
        int length = charSequence.length();
        if (i6 < 0 || i12 < 0 || i13 > length) {
            h(editorInfo, null, 0, 0);
            return;
        }
        if (c(editorInfo.inputType)) {
            h(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            h(editorInfo, charSequence, i12, i13);
        } else {
            i(editorInfo, charSequence, i12, i13);
        }
    }

    public static void f(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            F1.c.a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    public static void g(android.view.inputmethod.EditorInfo editorInfo, boolean z6) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z6);
    }

    private static void h(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i6, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i6);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }

    private static void i(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i6, int i10) {
        int i11 = i10 - i6;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int iMin = java.lang.Math.min(charSequence.length() - i10, i13 - java.lang.Math.min(i6, (int) (((double) i13) * 0.8d)));
        int iMin2 = java.lang.Math.min(i6, i13 - iMin);
        int i14 = i6 - iMin2;
        if (b(charSequence, i14, 0)) {
            i14++;
            iMin2--;
        }
        if (b(charSequence, (i10 + iMin) - 1, 1)) {
            iMin--;
        }
        h(editorInfo, i12 != i11 ? android.text.TextUtils.concat(charSequence.subSequence(i14, i14 + iMin2), charSequence.subSequence(i10, iMin + i10)) : charSequence.subSequence(i14, iMin2 + i12 + iMin + i14), iMin2, i12 + iMin2);
    }
}
