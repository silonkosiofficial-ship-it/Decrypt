package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f21512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f21513b;

        a(int i6, int i10) {
            this.f21512a = new int[]{i6, i10};
            this.f21513b = new float[]{0.0f, 1.0f};
        }

        a(int i6, int i10, int i11) {
            this.f21512a = new int[]{i6, i10, i11};
            this.f21513b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(java.util.List list, java.util.List list2) {
            int size = list.size();
            this.f21512a = new int[size];
            this.f21513b = new float[size];
            for (int i6 = 0; i6 < size; i6++) {
                this.f21512a[i6] = ((java.lang.Integer) list.get(i6)).intValue();
                this.f21513b[i6] = ((java.lang.Float) list2.get(i6)).floatValue();
            }
        }
    }

    private static androidx.core.content.res.f.a a(androidx.core.content.res.f.a aVar, int i6, int i10, boolean z6, int i11) {
        if (aVar != null) {
            return aVar;
        }
        return z6 ? new androidx.core.content.res.f.a(i6, i11, i10) : new androidx.core.content.res.f.a(i6, i10);
    }

    static android.graphics.Shader b(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException {
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, p202u1.d.f55417A);
        float f6 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "startX", p202u1.d.f55426J, 0.0f);
        float f10 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "startY", p202u1.d.f55427K, 0.0f);
        float f11 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "endX", p202u1.d.f55428L, 0.0f);
        float f12 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "endY", p202u1.d.f55429M, 0.0f);
        float f13 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "centerX", p202u1.d.f55421E, 0.0f);
        float f14 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "centerY", p202u1.d.f55422F, 0.0f);
        int iG = androidx.core.content.res.k.g(typedArrayK, xmlPullParser, "type", p202u1.d.f55420D, 0);
        int iB = androidx.core.content.res.k.b(typedArrayK, xmlPullParser, "startColor", p202u1.d.f55418B, 0);
        boolean zJ = androidx.core.content.res.k.j(xmlPullParser, "centerColor");
        int iB2 = androidx.core.content.res.k.b(typedArrayK, xmlPullParser, "centerColor", p202u1.d.f55425I, 0);
        int iB3 = androidx.core.content.res.k.b(typedArrayK, xmlPullParser, "endColor", p202u1.d.f55419C, 0);
        int iG2 = androidx.core.content.res.k.g(typedArrayK, xmlPullParser, "tileMode", p202u1.d.f55424H, 0);
        float f15 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "gradientRadius", p202u1.d.f55423G, 0.0f);
        typedArrayK.recycle();
        androidx.core.content.res.f.a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new android.graphics.LinearGradient(f6, f10, f11, f12, aVarA.f21512a, aVarA.f21513b, d(iG2)) : new android.graphics.SweepGradient(f13, f14, aVarA.f21512a, aVarA.f21513b);
        }
        if (f15 > 0.0f) {
            return new android.graphics.RadialGradient(f13, f14, f15, aVarA.f21512a, aVarA.f21513b, d(iG2));
        }
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static androidx.core.content.res.f.a c(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, p202u1.d.f55430N);
                boolean zHasValue = typedArrayK.hasValue(p202u1.d.f55431O);
                boolean zHasValue2 = typedArrayK.hasValue(p202u1.d.f55432P);
                if (!zHasValue || !zHasValue2) {
                    throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayK.getColor(p202u1.d.f55431O, 0);
                float f6 = typedArrayK.getFloat(p202u1.d.f55432P, 0.0f);
                typedArrayK.recycle();
                arrayList2.add(java.lang.Integer.valueOf(color));
                arrayList.add(java.lang.Float.valueOf(f6));
            }
        }
        if (arrayList2.size() > 0) {
            return new androidx.core.content.res.f.a(arrayList2, arrayList);
        }
        return null;
    }

    private static android.graphics.Shader.TileMode d(int i6) {
        if (i6 != 1) {
            return i6 != 2 ? android.graphics.Shader.TileMode.CLAMP : android.graphics.Shader.TileMode.MIRROR;
        }
        return android.graphics.Shader.TileMode.REPEAT;
    }
}
