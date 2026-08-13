package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final android.graphics.RectF f18108l = new android.graphics.RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static j$.util.concurrent.ConcurrentHashMap f18109m = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static j$.util.concurrent.ConcurrentHashMap f18110n = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18111a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18112b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f18113c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f18114d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f18115e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f18116f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18117g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.text.TextPaint f18118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.widget.TextView f18119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f18120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.appcompat.widget.E.f f18121k;

    private static final class a {
        static android.text.StaticLayout a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i6, android.widget.TextView textView, android.text.TextPaint textPaint) {
            return new android.text.StaticLayout(charSequence, textPaint, i6, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(android.widget.TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(android.view.View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static android.text.StaticLayout a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i6, int i10, android.widget.TextView textView, android.text.TextPaint textPaint, androidx.appcompat.widget.E.f fVar) {
            android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i6);
            android.text.StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i10 == -1) {
                i10 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i10);
            try {
                fVar.a(builderObtain, textView);
            } catch (java.lang.ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    private static class d extends androidx.appcompat.widget.E.f {
        d() {
        }

        @Override // androidx.appcompat.widget.E.f
        void a(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
            builder.setTextDirection((android.text.TextDirectionHeuristic) androidx.appcompat.widget.E.m(textView, "getTextDirectionHeuristic", android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends androidx.appcompat.widget.E.d {
        e() {
        }

        @Override // androidx.appcompat.widget.E.d, androidx.appcompat.widget.E.f
        void a(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.E.f
        boolean b(android.widget.TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        abstract void a(android.text.StaticLayout.Builder builder, android.widget.TextView textView);

        boolean b(android.widget.TextView textView) {
            return ((java.lang.Boolean) androidx.appcompat.widget.E.m(textView, "getHorizontallyScrolling", java.lang.Boolean.FALSE)).booleanValue();
        }
    }

    E(android.widget.TextView textView) {
        this.f18119i = textView;
        this.f18120j = textView.getContext();
        this.f18121k = android.os.Build.VERSION.SDK_INT >= 29 ? new androidx.appcompat.widget.E.e() : new androidx.appcompat.widget.E.d();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        java.util.Arrays.sort(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 : iArr) {
            if (i6 > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i6)) < 0) {
                arrayList.add(java.lang.Integer.valueOf(i6));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr2[i10] = ((java.lang.Integer) arrayList.get(i10)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f18111a = 0;
        this.f18114d = -1.0f;
        this.f18115e = -1.0f;
        this.f18113c = -1.0f;
        this.f18116f = new int[0];
        this.f18112b = false;
    }

    private int e(android.graphics.RectF rectF) {
        int length = this.f18116f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i6 = 1;
        int i10 = length - 1;
        int i11 = 0;
        while (i6 <= i10) {
            int i12 = (i6 + i10) / 2;
            if (x(this.f18116f[i12], rectF)) {
                int i13 = i12 + 1;
                i11 = i6;
                i6 = i13;
            } else {
                i11 = i12 - 1;
                i10 = i11;
            }
        }
        return this.f18116f[i11];
    }

    private static java.lang.reflect.Method k(java.lang.String str) {
        try {
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) f18109m.get(str);
            if (declaredMethod == null && (declaredMethod = android.widget.TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f18109m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (java.lang.Exception e6) {
            java.lang.String str2 = "Failed to retrieve TextView#" + str + "() method";
            return null;
        }
    }

    static java.lang.Object m(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (java.lang.Exception e6) {
            java.lang.String str2 = "Failed to invoke TextView#" + str + "() method";
            return obj2;
        }
    }

    private void s(float f6) {
        if (f6 != this.f18119i.getPaint().getTextSize()) {
            this.f18119i.getPaint().setTextSize(f6);
            boolean zA = androidx.appcompat.widget.E.b.a(this.f18119i);
            if (this.f18119i.getLayout() != null) {
                this.f18112b = false;
                try {
                    java.lang.reflect.Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f18119i, null);
                    }
                } catch (java.lang.Exception e6) {
                }
                if (zA) {
                    this.f18119i.forceLayout();
                } else {
                    this.f18119i.requestLayout();
                }
                this.f18119i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f18111a == 1) {
            if (!this.f18117g || this.f18116f.length == 0) {
                int iFloor = ((int) java.lang.Math.floor((this.f18115e - this.f18114d) / this.f18113c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i6 = 0; i6 < iFloor; i6++) {
                    iArr[i6] = java.lang.Math.round(this.f18114d + (i6 * this.f18113c));
                }
                this.f18116f = b(iArr);
            }
            this.f18112b = true;
        } else {
            this.f18112b = false;
        }
        return this.f18112b;
    }

    private void v(android.content.res.TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = typedArray.getDimensionPixelSize(i6, -1);
            }
            this.f18116f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f18116f;
        int length = iArr.length;
        boolean z6 = length > 0;
        this.f18117g = z6;
        if (z6) {
            this.f18111a = 1;
            this.f18114d = iArr[0];
            this.f18115e = iArr[length - 1];
            this.f18113c = -1.0f;
        }
        return z6;
    }

    private boolean x(int i6, android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        java.lang.CharSequence text = this.f18119i.getText();
        android.text.method.TransformationMethod transformationMethod = this.f18119i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f18119i)) != null) {
            text = transformation;
        }
        int iB = androidx.appcompat.widget.E.a.b(this.f18119i);
        l(i6);
        android.text.StaticLayout staticLayoutD = d(text, (android.text.Layout.Alignment) m(this.f18119i, "getLayoutAlignment", android.text.Layout.Alignment.ALIGN_NORMAL), java.lang.Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f18119i instanceof androidx.appcompat.widget.C1906l);
    }

    private void z(float f6, float f10, float f11) {
        if (f6 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f10 <= f6) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f18111a = 1;
        this.f18114d = f6;
        this.f18115e = f10;
        this.f18113c = f11;
        this.f18117g = false;
    }

    void a() {
        if (n()) {
            if (this.f18112b) {
                if (this.f18119i.getMeasuredHeight() <= 0 || this.f18119i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f18121k.b(this.f18119i) ? 1048576 : (this.f18119i.getMeasuredWidth() - this.f18119i.getTotalPaddingLeft()) - this.f18119i.getTotalPaddingRight();
                int height = (this.f18119i.getHeight() - this.f18119i.getCompoundPaddingBottom()) - this.f18119i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = f18108l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f18119i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            this.f18112b = true;
        }
    }

    android.text.StaticLayout d(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i6, int i10) {
        return androidx.appcompat.widget.E.c.a(charSequence, alignment, i6, i10, this.f18119i, this.f18118h, this.f18121k);
    }

    int f() {
        return java.lang.Math.round(this.f18115e);
    }

    int g() {
        return java.lang.Math.round(this.f18114d);
    }

    int h() {
        return java.lang.Math.round(this.f18113c);
    }

    int[] i() {
        return this.f18116f;
    }

    int j() {
        return this.f18111a;
    }

    void l(int i6) {
        android.text.TextPaint textPaint = this.f18118h;
        if (textPaint == null) {
            this.f18118h = new android.text.TextPaint();
        } else {
            textPaint.reset();
        }
        this.f18118h.set(this.f18119i.getPaint());
        this.f18118h.setTextSize(i6);
    }

    boolean n() {
        return y() && this.f18111a != 0;
    }

    void o(android.util.AttributeSet attributeSet, int i6) {
        int resourceId;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.f18120j.obtainStyledAttributes(attributeSet, p090j.j.f48932g0, i6, 0);
        android.widget.TextView textView = this.f18119i;
        androidx.core.view.X.l0(textView, textView.getContext(), p090j.j.f48932g0, attributeSet, typedArrayObtainStyledAttributes, i6, 0);
        if (typedArrayObtainStyledAttributes.hasValue(p090j.j.f48957l0)) {
            this.f18111a = typedArrayObtainStyledAttributes.getInt(p090j.j.f48957l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(p090j.j.f48952k0) ? typedArrayObtainStyledAttributes.getDimension(p090j.j.f48952k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(p090j.j.f48942i0) ? typedArrayObtainStyledAttributes.getDimension(p090j.j.f48942i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(p090j.j.f48937h0) ? typedArrayObtainStyledAttributes.getDimension(p090j.j.f48937h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(p090j.j.f48947j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48947j0, 0)) > 0) {
            android.content.res.TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f18111a = 0;
            return;
        }
        if (this.f18111a == 1) {
            if (!this.f18117g) {
                android.util.DisplayMetrics displayMetrics = this.f18120j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i6, int i10, int i11, int i12) {
        if (y()) {
            android.util.DisplayMetrics displayMetrics = this.f18120j.getResources().getDisplayMetrics();
            z(android.util.TypedValue.applyDimension(i12, i6, displayMetrics), android.util.TypedValue.applyDimension(i12, i10, displayMetrics), android.util.TypedValue.applyDimension(i12, i11, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i6) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i6 == 0) {
                    iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = this.f18120j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = java.lang.Math.round(android.util.TypedValue.applyDimension(i6, iArr[i10], displayMetrics));
                    }
                }
                this.f18116f = b(iArrCopyOf);
                if (!w()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                this.f18117g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i6) {
        if (y()) {
            if (i6 == 0) {
                c();
                return;
            }
            if (i6 != 1) {
                throw new java.lang.IllegalArgumentException("Unknown auto-size text type: " + i6);
            }
            android.util.DisplayMetrics displayMetrics = this.f18120j.getResources().getDisplayMetrics();
            z(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i6, float f6) {
        android.content.Context context = this.f18120j;
        s(android.util.TypedValue.applyDimension(i6, f6, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
