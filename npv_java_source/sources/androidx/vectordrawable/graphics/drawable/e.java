package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    private static class a implements android.animation.TypeEvaluator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.core.graphics.h.b[] f23714a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.core.graphics.h.b[] evaluate(float f6, androidx.core.graphics.h.b[] bVarArr, androidx.core.graphics.h.b[] bVarArr2) {
            if (!androidx.core.graphics.h.b(bVarArr, bVarArr2)) {
                throw new java.lang.IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!androidx.core.graphics.h.b(this.f23714a, bVarArr)) {
                this.f23714a = androidx.core.graphics.h.f(bVarArr);
            }
            for (int i6 = 0; i6 < bVarArr.length; i6++) {
                this.f23714a[i6].h(bVarArr[i6], bVarArr2[i6], f6);
            }
            return this.f23714a;
        }
    }

    private static android.animation.Animator a(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, float f6) {
        return b(context, resources, theme, xmlPullParser, android.util.Xml.asAttributeSet(xmlPullParser), null, 0, f6);
    }

    private static android.animation.Animator b(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.animation.AnimatorSet animatorSet, int i6, float f6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i10;
        int depth = xmlPullParser.getDepth();
        android.animation.Animator animatorL = null;
        java.util.ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i10 = 0;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    animatorL = n(context, resources, theme, attributeSet, f6, xmlPullParser);
                } else {
                    if (name.equals("animator")) {
                        animatorL = l(context, resources, theme, attributeSet, null, f6, xmlPullParser);
                    } else if (name.equals("set")) {
                        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23692h);
                        b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, androidx.core.content.res.k.g(typedArrayK, xmlPullParser, "ordering", 0, 0), f6);
                        typedArrayK.recycle();
                        animatorL = animatorSet2;
                    } else {
                        if (!name.equals("propertyValuesHolder")) {
                            throw new java.lang.RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        android.animation.PropertyValuesHolder[] propertyValuesHolderArrP = p(context, resources, theme, xmlPullParser, android.util.Xml.asAttributeSet(xmlPullParser));
                        if (propertyValuesHolderArrP != null && (animatorL instanceof android.animation.ValueAnimator)) {
                            ((android.animation.ValueAnimator) animatorL).setValues(propertyValuesHolderArrP);
                        }
                        i10 = 1;
                    }
                    if (animatorSet == null && i10 == 0) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(animatorL);
                    }
                }
                if (animatorSet == null) {
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            android.animation.Animator[] animatorArr = new android.animation.Animator[arrayList.size()];
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i10] = (android.animation.Animator) it.next();
                i10++;
            }
            if (i6 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorL;
    }

    private static android.animation.Keyframe c(android.animation.Keyframe keyframe, float f6) {
        if (keyframe.getType() == java.lang.Float.TYPE) {
            return android.animation.Keyframe.ofFloat(f6);
        }
        return keyframe.getType() == java.lang.Integer.TYPE ? android.animation.Keyframe.ofInt(f6) : android.animation.Keyframe.ofObject(f6);
    }

    private static void d(android.animation.Keyframe[] keyframeArr, float f6, int i6, int i10) {
        float f10 = f6 / ((i10 - i6) + 2);
        while (i6 <= i10) {
            keyframeArr[i6].setFraction(keyframeArr[i6 - 1].getFraction() + f10);
            i6++;
        }
    }

    private static android.animation.PropertyValuesHolder e(android.content.res.TypedArray typedArray, int i6, int i10, int i11, java.lang.String str) {
        int color;
        int color2;
        int color3;
        android.animation.PropertyValuesHolder propertyValuesHolderOfFloat;
        android.animation.PropertyValuesHolder propertyValuesHolderOfObject;
        android.util.TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z6 = typedValuePeekValue != null;
        int i12 = z6 ? typedValuePeekValue.type : 0;
        android.util.TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue2 != null;
        int i13 = z10 ? typedValuePeekValue2.type : 0;
        if (i6 == 4) {
            i6 = ((z6 && h(i12)) || (z10 && h(i13))) ? 3 : 0;
        }
        boolean z11 = i6 == 0;
        android.animation.PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i6 == 2) {
            java.lang.String string = typedArray.getString(i10);
            java.lang.String string2 = typedArray.getString(i11);
            androidx.core.graphics.h.b[] bVarArrD = androidx.core.graphics.h.d(string);
            androidx.core.graphics.h.b[] bVarArrD2 = androidx.core.graphics.h.d(string2);
            if (bVarArrD == null && bVarArrD2 == null) {
                return null;
            }
            if (bVarArrD == null) {
                if (bVarArrD2 != null) {
                    return android.animation.PropertyValuesHolder.ofObject(str, new androidx.vectordrawable.graphics.drawable.e.a(), bVarArrD2);
                }
                return null;
            }
            androidx.vectordrawable.graphics.drawable.e.a aVar = new androidx.vectordrawable.graphics.drawable.e.a();
            if (bVarArrD2 == null) {
                propertyValuesHolderOfObject = android.animation.PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
            } else {
                if (!androidx.core.graphics.h.b(bVarArrD, bVarArrD2)) {
                    throw new android.view.InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = android.animation.PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
            }
            return propertyValuesHolderOfObject;
        }
        androidx.vectordrawable.graphics.drawable.f fVarA = i6 == 3 ? androidx.vectordrawable.graphics.drawable.f.a() : null;
        if (z11) {
            if (z6) {
                float dimension = i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f);
                if (z10) {
                    propertyValuesHolderOfFloat = android.animation.PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = android.animation.PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = android.animation.PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z6) {
            if (i12 == 5) {
                color2 = (int) typedArray.getDimension(i10, 0.0f);
            } else {
                color2 = h(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
            }
            if (z10) {
                if (i13 == 5) {
                    color3 = (int) typedArray.getDimension(i11, 0.0f);
                } else {
                    color3 = h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                }
                propertyValuesHolderOfInt = android.animation.PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = android.animation.PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z10) {
            if (i13 == 5) {
                color = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color = h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            propertyValuesHolderOfInt = android.animation.PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || fVarA == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(fVarA);
        return propertyValuesHolderOfInt;
    }

    private static int f(android.content.res.TypedArray typedArray, int i6, int i10) {
        android.util.TypedValue typedValuePeekValue = typedArray.peekValue(i6);
        boolean z6 = typedValuePeekValue != null;
        int i11 = z6 ? typedValuePeekValue.type : 0;
        android.util.TypedValue typedValuePeekValue2 = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue2 != null;
        return ((z6 && h(i11)) || (z10 && h(z10 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    private static int g(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23694j);
        int i6 = 0;
        android.util.TypedValue typedValueL = androidx.core.content.res.k.l(typedArrayK, xmlPullParser, "value", 0);
        if (typedValueL != null && h(typedValueL.type)) {
            i6 = 3;
        }
        typedArrayK.recycle();
        return i6;
    }

    private static boolean h(int i6) {
        return i6 >= 28 && i6 <= 31;
    }

    public static android.animation.Animator i(android.content.Context context, int i6) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? android.animation.AnimatorInflater.loadAnimator(context, i6) : j(context, context.getResources(), context.getTheme(), i6);
    }

    public static android.animation.Animator j(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, int i6) {
        return k(context, resources, theme, i6, 1.0f);
    }

    public static android.animation.Animator k(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, int i6, float f6) {
        android.content.res.XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i6);
                    android.animation.Animator animatorA = a(context, resources, theme, animation, f6);
                    if (animation != null) {
                        animation.close();
                    }
                    return animatorA;
                } catch (java.io.IOException e6) {
                    android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("Can't load animation resource ID #0x" + java.lang.Integer.toHexString(i6));
                    notFoundException.initCause(e6);
                    throw notFoundException;
                }
            } catch (org.xmlpull.v1.XmlPullParserException e10) {
                android.content.res.Resources.NotFoundException notFoundException2 = new android.content.res.Resources.NotFoundException("Can't load animation resource ID #0x" + java.lang.Integer.toHexString(i6));
                notFoundException2.initCause(e10);
                throw notFoundException2;
            }
        } catch (java.lang.Throwable th) {
            if (animation != null) {
                animation.close();
            }
            throw th;
        }
    }

    private static android.animation.ValueAnimator l(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, android.animation.ValueAnimator valueAnimator, float f6, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23691g);
        android.content.res.TypedArray typedArrayK2 = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23695k);
        if (valueAnimator == null) {
            valueAnimator = new android.animation.ValueAnimator();
        }
        q(valueAnimator, typedArrayK, typedArrayK2, f6, xmlPullParser);
        int iH = androidx.core.content.res.k.h(typedArrayK, xmlPullParser, "interpolator", 0, 0);
        if (iH > 0) {
            valueAnimator.setInterpolator(androidx.vectordrawable.graphics.drawable.d.a(context, iH));
        }
        typedArrayK.recycle();
        if (typedArrayK2 != null) {
            typedArrayK2.recycle();
        }
        return valueAnimator;
    }

    private static android.animation.Keyframe m(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int i6, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.animation.Keyframe keyframeOfFloat;
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23694j);
        float f6 = androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "fraction", 3, -1.0f);
        android.util.TypedValue typedValueL = androidx.core.content.res.k.l(typedArrayK, xmlPullParser, "value", 0);
        boolean z6 = typedValueL != null;
        if (i6 == 4) {
            i6 = (z6 && h(typedValueL.type)) ? 3 : 0;
        }
        if (!z6) {
            keyframeOfFloat = i6 == 0 ? android.animation.Keyframe.ofFloat(f6) : android.animation.Keyframe.ofInt(f6);
        } else if (i6 != 0) {
            keyframeOfFloat = (i6 == 1 || i6 == 3) ? android.animation.Keyframe.ofInt(f6, androidx.core.content.res.k.g(typedArrayK, xmlPullParser, "value", 0, 0)) : null;
        } else {
            keyframeOfFloat = android.animation.Keyframe.ofFloat(f6, androidx.core.content.res.k.f(typedArrayK, xmlPullParser, "value", 0, 0.0f));
        }
        int iH = androidx.core.content.res.k.h(typedArrayK, xmlPullParser, "interpolator", 1, 0);
        if (iH > 0) {
            keyframeOfFloat.setInterpolator(androidx.vectordrawable.graphics.drawable.d.a(context, iH));
        }
        typedArrayK.recycle();
        return keyframeOfFloat;
    }

    private static android.animation.ObjectAnimator n(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, float f6, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f6, xmlPullParser);
        return objectAnimator;
    }

    private static android.animation.PropertyValuesHolder o(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int size;
        android.animation.PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        java.util.ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i6 == 4) {
                    i6 = g(resources, theme, android.util.Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                android.animation.Keyframe keyframeM = m(context, resources, theme, android.util.Xml.asAttributeSet(xmlPullParser), i6, xmlPullParser);
                if (keyframeM != null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(keyframeM);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            android.animation.Keyframe keyframe = (android.animation.Keyframe) arrayList.get(0);
            android.animation.Keyframe keyframe2 = (android.animation.Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            android.animation.Keyframe[] keyframeArr = new android.animation.Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i10 = 0; i10 < size; i10++) {
                android.animation.Keyframe keyframe3 = keyframeArr[i10];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i10 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i11 = size - 1;
                        if (i10 == i11) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i12 = i10;
                            for (int i13 = i10 + 1; i13 < i11 && keyframeArr[i13].getFraction() < 0.0f; i13++) {
                                i12 = i13;
                            }
                            d(keyframeArr, keyframeArr[i12 + 1].getFraction() - keyframeArr[i10 - 1].getFraction(), i10, i12);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = android.animation.PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i6 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(androidx.vectordrawable.graphics.drawable.f.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static android.animation.PropertyValuesHolder[] p(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i6;
        android.animation.PropertyValuesHolder[] propertyValuesHolderArr = null;
        java.util.ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23693i);
                java.lang.String strI = androidx.core.content.res.k.i(typedArrayK, xmlPullParser, "propertyName", 3);
                int iG = androidx.core.content.res.k.g(typedArrayK, xmlPullParser, "valueType", 2, 4);
                android.animation.PropertyValuesHolder propertyValuesHolderO = o(context, resources, theme, xmlPullParser, strI, iG);
                if (propertyValuesHolderO == null) {
                    propertyValuesHolderO = e(typedArrayK, iG, 0, 1, strI);
                }
                if (propertyValuesHolderO != null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(propertyValuesHolderO);
                }
                typedArrayK.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new android.animation.PropertyValuesHolder[size];
            for (i6 = 0; i6 < size; i6++) {
                propertyValuesHolderArr[i6] = (android.animation.PropertyValuesHolder) arrayList.get(i6);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void q(android.animation.ValueAnimator valueAnimator, android.content.res.TypedArray typedArray, android.content.res.TypedArray typedArray2, float f6, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        long jG = androidx.core.content.res.k.g(typedArray, xmlPullParser, "duration", 1, 300);
        long jG2 = androidx.core.content.res.k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iG = androidx.core.content.res.k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (androidx.core.content.res.k.j(xmlPullParser, "valueFrom") && androidx.core.content.res.k.j(xmlPullParser, "valueTo")) {
            if (iG == 4) {
                iG = f(typedArray, 5, 6);
            }
            android.animation.PropertyValuesHolder propertyValuesHolderE = e(typedArray, iG, 5, 6, "");
            if (propertyValuesHolderE != null) {
                valueAnimator.setValues(propertyValuesHolderE);
            }
        }
        valueAnimator.setDuration(jG);
        valueAnimator.setStartDelay(jG2);
        valueAnimator.setRepeatCount(androidx.core.content.res.k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(androidx.core.content.res.k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, iG, f6, xmlPullParser);
        }
    }

    private static void r(android.animation.ValueAnimator valueAnimator, android.content.res.TypedArray typedArray, int i6, float f6, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) valueAnimator;
        java.lang.String strI = androidx.core.content.res.k.i(typedArray, xmlPullParser, "pathData", 1);
        if (strI == null) {
            objectAnimator.setPropertyName(androidx.core.content.res.k.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        java.lang.String strI2 = androidx.core.content.res.k.i(typedArray, xmlPullParser, "propertyXName", 2);
        java.lang.String strI3 = androidx.core.content.res.k.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i6 != 2) {
        }
        if (strI2 != null || strI3 != null) {
            s(androidx.core.graphics.h.e(strI), objectAnimator, f6 * 0.5f, strI2, strI3);
            return;
        }
        throw new android.view.InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void s(android.graphics.Path path, android.animation.ObjectAnimator objectAnimator, float f6, java.lang.String str, java.lang.String str2) {
        int i6 = 1;
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float f10 = 0.0f;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(java.lang.Float.valueOf(length));
        } while (pathMeasure.nextContour());
        android.graphics.PathMeasure pathMeasure2 = new android.graphics.PathMeasure(path, false);
        int iMin = java.lang.Math.min(100, ((int) (length / f6)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f11 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f10 - ((java.lang.Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f10 += f11;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f10 > ((java.lang.Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i6 = 1;
            i10++;
        }
        android.animation.PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? android.animation.PropertyValuesHolder.ofFloat(str, fArr) : null;
        android.animation.PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? android.animation.PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArr = new android.animation.PropertyValuesHolder[i6];
            propertyValuesHolderArr[0] = propertyValuesHolderOfFloat2;
            objectAnimator.setValues(propertyValuesHolderArr);
        } else if (propertyValuesHolderOfFloat2 == null) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArr2 = new android.animation.PropertyValuesHolder[i6];
            propertyValuesHolderArr2[0] = propertyValuesHolderOfFloat;
            objectAnimator.setValues(propertyValuesHolderArr2);
        } else {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArr3 = new android.animation.PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = propertyValuesHolderOfFloat;
            propertyValuesHolderArr3[i6] = propertyValuesHolderOfFloat2;
            objectAnimator.setValues(propertyValuesHolderArr3);
        }
    }
}
