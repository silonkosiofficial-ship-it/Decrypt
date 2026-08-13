package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6, boolean z6) {
        return !j(xmlPullParser, str) ? z6 : typedArray.getBoolean(i6, z6);
    }

    public static int b(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6, int i10) {
        return !j(xmlPullParser, str) ? i10 : typedArray.getColor(i6, i10);
    }

    public static android.content.res.ColorStateList c(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i6) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArray.getValue(i6, typedValue);
        int i10 = typedValue.type;
        if (i10 != 2) {
            return (i10 < 28 || i10 > 31) ? androidx.core.content.res.c.d(typedArray.getResources(), typedArray.getResourceId(i6, 0), theme) : d(typedValue);
        }
        throw new java.lang.UnsupportedOperationException("Failed to resolve attribute at index " + i6 + ": " + typedValue);
    }

    private static android.content.res.ColorStateList d(android.util.TypedValue typedValue) {
        return android.content.res.ColorStateList.valueOf(typedValue.data);
    }

    public static androidx.core.content.res.d e(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i6, int i10) {
        if (j(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i6, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return androidx.core.content.res.d.b(typedValue.data);
            }
            androidx.core.content.res.d dVarG = androidx.core.content.res.d.g(typedArray.getResources(), typedArray.getResourceId(i6, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return androidx.core.content.res.d.b(i10);
    }

    public static float f(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6, float f6) {
        return !j(xmlPullParser, str) ? f6 : typedArray.getFloat(i6, f6);
    }

    public static int g(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6, int i10) {
        return !j(xmlPullParser, str) ? i10 : typedArray.getInt(i6, i10);
    }

    public static int h(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6, int i10) {
        return !j(xmlPullParser, str) ? i10 : typedArray.getResourceId(i6, i10);
    }

    public static java.lang.String i(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6) {
        if (j(xmlPullParser, str)) {
            return typedArray.getString(i6);
        }
        return null;
    }

    public static boolean j(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static android.content.res.TypedArray k(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static android.util.TypedValue l(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6) {
        if (j(xmlPullParser, str)) {
            return typedArray.peekValue(i6);
        }
        return null;
    }
}
