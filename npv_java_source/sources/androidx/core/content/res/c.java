package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f21497a = new java.lang.ThreadLocal();

    public static android.content.res.ColorStateList a(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }

    public static android.content.res.ColorStateList b(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException {
        java.lang.String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static android.util.TypedValue c() {
        java.lang.ThreadLocal threadLocal = f21497a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static android.content.res.ColorStateList d(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i6), theme);
        } catch (java.lang.Exception e6) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    private static android.content.res.ColorStateList e(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int color;
        int i6;
        int i10;
        int attributeCount;
        int i11;
        int attributeNameResource;
        int i12 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i13 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i12 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray typedArrayH = h(resources, theme, attributeSet, p202u1.d.f55434b);
                int resourceId = typedArrayH.getResourceId(p202u1.d.f55435c, -1);
                if (resourceId == -1 || f(resources, resourceId)) {
                    color = typedArrayH.getColor(p202u1.d.f55435c, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (java.lang.Exception unused) {
                        color = typedArrayH.getColor(p202u1.d.f55435c, -65281);
                    }
                }
                float f6 = 1.0f;
                if (typedArrayH.hasValue(p202u1.d.f55436d)) {
                    i6 = p202u1.d.f55436d;
                } else {
                    if (typedArrayH.hasValue(p202u1.d.f55438f)) {
                        i6 = p202u1.d.f55438f;
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 31 || !typedArrayH.hasValue(p202u1.d.f55437e)) {
                        i10 = p202u1.d.f55439g;
                    } else {
                        i10 = p202u1.d.f55437e;
                    }
                    float f10 = typedArrayH.getFloat(i10, -1.0f);
                    typedArrayH.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i14 = 0;
                    for (i11 = 0; i11 < attributeCount; i11++) {
                        attributeNameResource = attributeSet.getAttributeNameResource(i11);
                        if (attributeNameResource == 16843173 && attributeNameResource != 16843551 && attributeNameResource != p202u1.a.f55367a && attributeNameResource != p202u1.a.f55368b) {
                            int i15 = i14 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i14] = attributeNameResource;
                            i14 = i15;
                        }
                    }
                    int[] iArrTrimStateSet = android.util.StateSet.trimStateSet(iArr2, i14);
                    iArrA = androidx.core.content.res.g.a(iArrA, i13, g(color, f6, f10));
                    iArr = (int[][]) androidx.core.content.res.g.b(iArr, i13, iArrTrimStateSet);
                    i13++;
                }
                f6 = typedArrayH.getFloat(i6, 1.0f);
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    i10 = p202u1.d.f55439g;
                } else {
                    i10 = p202u1.d.f55439g;
                }
                float f11 = typedArrayH.getFloat(i10, -1.0f);
                typedArrayH.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i16 = 0;
                while (i11 < attributeCount) {
                    attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource == 16843173) {
                    }
                }
                int[] iArrTrimStateSet2 = android.util.StateSet.trimStateSet(iArr3, i16);
                iArrA = androidx.core.content.res.g.a(iArrA, i13, g(color, f6, f11));
                iArr = (int[][]) androidx.core.content.res.g.b(iArr, i13, iArrTrimStateSet2);
                i13++;
            }
            i12 = 1;
        }
        int[] iArr4 = new int[i13];
        int[][] iArr5 = new int[i13][];
        java.lang.System.arraycopy(iArrA, 0, iArr4, 0, i13);
        java.lang.System.arraycopy(iArr, 0, iArr5, 0, i13);
        return new android.content.res.ColorStateList(iArr5, iArr4);
    }

    private static boolean f(android.content.res.Resources resources, int i6) {
        android.util.TypedValue typedValueC = c();
        resources.getValue(i6, typedValueC, true);
        int i10 = typedValueC.type;
        return i10 >= 28 && i10 <= 31;
    }

    private static int g(int i6, float f6, float f10) {
        boolean z6 = f10 >= 0.0f && f10 <= 100.0f;
        if (f6 == 1.0f && !z6) {
            return i6;
        }
        int iB = p222w1.a.b((int) ((android.graphics.Color.alpha(i6) * f6) + 0.5f), 0, 255);
        if (z6) {
            androidx.core.content.res.a aVarC = androidx.core.content.res.a.c(i6);
            i6 = androidx.core.content.res.a.m(aVarC.j(), aVarC.i(), f10);
        }
        return (i6 & 16777215) | (iB << 24);
    }

    private static android.content.res.TypedArray h(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
