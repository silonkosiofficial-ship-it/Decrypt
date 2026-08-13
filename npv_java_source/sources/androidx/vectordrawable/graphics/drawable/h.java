package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final android.graphics.PorterDuff.Mode f23717M = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.h.C0451h f23718D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.graphics.PorterDuffColorFilter f23719E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.graphics.ColorFilter f23720F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f23721G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f23722H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.graphics.drawable.Drawable.ConstantState f23723I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final float[] f23724J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final android.graphics.Matrix f23725K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final android.graphics.Rect f23726L;

    private static class b extends androidx.vectordrawable.graphics.drawable.h.f {
        b() {
        }

        b(androidx.vectordrawable.graphics.drawable.h.b bVar) {
            super(bVar);
        }

        private void f(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            java.lang.String string = typedArray.getString(0);
            if (string != null) {
                this.f23753b = string;
            }
            java.lang.String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f23752a = androidx.core.graphics.h.d(string2);
            }
            this.f23754c = androidx.core.content.res.k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            if (androidx.core.content.res.k.j(xmlPullParser, "pathData")) {
                android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23688d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }
    }

    private static class c extends androidx.vectordrawable.graphics.drawable.h.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f23727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f23728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f23729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f23730h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f23731i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f23732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f23733k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f23734l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f23735m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        android.graphics.Paint.Cap f23736n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        android.graphics.Paint.Join f23737o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f23738p;

        c() {
            this.f23729g = 0.0f;
            this.f23731i = 1.0f;
            this.f23732j = 1.0f;
            this.f23733k = 0.0f;
            this.f23734l = 1.0f;
            this.f23735m = 0.0f;
            this.f23736n = android.graphics.Paint.Cap.BUTT;
            this.f23737o = android.graphics.Paint.Join.MITER;
            this.f23738p = 4.0f;
        }

        c(androidx.vectordrawable.graphics.drawable.h.c cVar) {
            super(cVar);
            this.f23729g = 0.0f;
            this.f23731i = 1.0f;
            this.f23732j = 1.0f;
            this.f23733k = 0.0f;
            this.f23734l = 1.0f;
            this.f23735m = 0.0f;
            this.f23736n = android.graphics.Paint.Cap.BUTT;
            this.f23737o = android.graphics.Paint.Join.MITER;
            this.f23738p = 4.0f;
            this.f23727e = cVar.f23727e;
            this.f23728f = cVar.f23728f;
            this.f23729g = cVar.f23729g;
            this.f23731i = cVar.f23731i;
            this.f23730h = cVar.f23730h;
            this.f23754c = cVar.f23754c;
            this.f23732j = cVar.f23732j;
            this.f23733k = cVar.f23733k;
            this.f23734l = cVar.f23734l;
            this.f23735m = cVar.f23735m;
            this.f23736n = cVar.f23736n;
            this.f23737o = cVar.f23737o;
            this.f23738p = cVar.f23738p;
        }

        private android.graphics.Paint.Cap e(int i6, android.graphics.Paint.Cap cap) {
            if (i6 == 0) {
                return android.graphics.Paint.Cap.BUTT;
            }
            if (i6 != 1) {
                return i6 != 2 ? cap : android.graphics.Paint.Cap.SQUARE;
            }
            return android.graphics.Paint.Cap.ROUND;
        }

        private android.graphics.Paint.Join f(int i6, android.graphics.Paint.Join join) {
            if (i6 == 0) {
                return android.graphics.Paint.Join.MITER;
            }
            if (i6 != 1) {
                return i6 != 2 ? join : android.graphics.Paint.Join.BEVEL;
            }
            return android.graphics.Paint.Join.ROUND;
        }

        private void h(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) {
            this.f23727e = null;
            if (androidx.core.content.res.k.j(xmlPullParser, "pathData")) {
                java.lang.String string = typedArray.getString(0);
                if (string != null) {
                    this.f23753b = string;
                }
                java.lang.String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f23752a = androidx.core.graphics.h.d(string2);
                }
                this.f23730h = androidx.core.content.res.k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f23732j = androidx.core.content.res.k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f23732j);
                this.f23736n = e(androidx.core.content.res.k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f23736n);
                this.f23737o = f(androidx.core.content.res.k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f23737o);
                this.f23738p = androidx.core.content.res.k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f23738p);
                this.f23728f = androidx.core.content.res.k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f23731i = androidx.core.content.res.k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f23731i);
                this.f23729g = androidx.core.content.res.k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f23729g);
                this.f23734l = androidx.core.content.res.k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f23734l);
                this.f23735m = androidx.core.content.res.k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f23735m);
                this.f23733k = androidx.core.content.res.k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f23733k);
                this.f23754c = androidx.core.content.res.k.g(typedArray, xmlPullParser, "fillType", 13, this.f23754c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f23730h.i() || this.f23728f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f23728f.j(iArr) | this.f23730h.j(iArr);
        }

        public void g(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23687c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        float getFillAlpha() {
            return this.f23732j;
        }

        int getFillColor() {
            return this.f23730h.e();
        }

        float getStrokeAlpha() {
            return this.f23731i;
        }

        int getStrokeColor() {
            return this.f23728f.e();
        }

        float getStrokeWidth() {
            return this.f23729g;
        }

        float getTrimPathEnd() {
            return this.f23734l;
        }

        float getTrimPathOffset() {
            return this.f23735m;
        }

        float getTrimPathStart() {
            return this.f23733k;
        }

        void setFillAlpha(float f6) {
            this.f23732j = f6;
        }

        void setFillColor(int i6) {
            this.f23730h.k(i6);
        }

        void setStrokeAlpha(float f6) {
            this.f23731i = f6;
        }

        void setStrokeColor(int i6) {
            this.f23728f.k(i6);
        }

        void setStrokeWidth(float f6) {
            this.f23729g = f6;
        }

        void setTrimPathEnd(float f6) {
            this.f23734l = f6;
        }

        void setTrimPathOffset(float f6) {
            this.f23735m = f6;
        }

        void setTrimPathStart(float f6) {
            this.f23733k = f6;
        }
    }

    private static class d extends androidx.vectordrawable.graphics.drawable.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.graphics.Matrix f23739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.ArrayList f23740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f23741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f23742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f23743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f23744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f23745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f23746h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f23747i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final android.graphics.Matrix f23748j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f23749k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f23750l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private java.lang.String f23751m;

        public d() {
            super();
            this.f23739a = new android.graphics.Matrix();
            this.f23740b = new java.util.ArrayList();
            this.f23741c = 0.0f;
            this.f23742d = 0.0f;
            this.f23743e = 0.0f;
            this.f23744f = 1.0f;
            this.f23745g = 1.0f;
            this.f23746h = 0.0f;
            this.f23747i = 0.0f;
            this.f23748j = new android.graphics.Matrix();
            this.f23751m = null;
        }

        public d(androidx.vectordrawable.graphics.drawable.h.d dVar, p170r.C7026a c7026a) {
            androidx.vectordrawable.graphics.drawable.h.f bVar;
            super();
            this.f23739a = new android.graphics.Matrix();
            this.f23740b = new java.util.ArrayList();
            this.f23741c = 0.0f;
            this.f23742d = 0.0f;
            this.f23743e = 0.0f;
            this.f23744f = 1.0f;
            this.f23745g = 1.0f;
            this.f23746h = 0.0f;
            this.f23747i = 0.0f;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.f23748j = matrix;
            this.f23751m = null;
            this.f23741c = dVar.f23741c;
            this.f23742d = dVar.f23742d;
            this.f23743e = dVar.f23743e;
            this.f23744f = dVar.f23744f;
            this.f23745g = dVar.f23745g;
            this.f23746h = dVar.f23746h;
            this.f23747i = dVar.f23747i;
            this.f23750l = dVar.f23750l;
            java.lang.String str = dVar.f23751m;
            this.f23751m = str;
            this.f23749k = dVar.f23749k;
            if (str != null) {
                c7026a.put(str, this);
            }
            matrix.set(dVar.f23748j);
            java.util.ArrayList arrayList = dVar.f23740b;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                java.lang.Object obj = arrayList.get(i6);
                if (obj instanceof androidx.vectordrawable.graphics.drawable.h.d) {
                    this.f23740b.add(new androidx.vectordrawable.graphics.drawable.h.d((androidx.vectordrawable.graphics.drawable.h.d) obj, c7026a));
                } else {
                    if (obj instanceof androidx.vectordrawable.graphics.drawable.h.c) {
                        bVar = new androidx.vectordrawable.graphics.drawable.h.c((androidx.vectordrawable.graphics.drawable.h.c) obj);
                    } else {
                        if (!(obj instanceof androidx.vectordrawable.graphics.drawable.h.b)) {
                            throw new java.lang.IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new androidx.vectordrawable.graphics.drawable.h.b((androidx.vectordrawable.graphics.drawable.h.b) obj);
                    }
                    this.f23740b.add(bVar);
                    java.lang.Object obj2 = bVar.f23753b;
                    if (obj2 != null) {
                        c7026a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f23748j.reset();
            this.f23748j.postTranslate(-this.f23742d, -this.f23743e);
            this.f23748j.postScale(this.f23744f, this.f23745g);
            this.f23748j.postRotate(this.f23741c, 0.0f, 0.0f);
            this.f23748j.postTranslate(this.f23746h + this.f23742d, this.f23747i + this.f23743e);
        }

        private void e(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.f23750l = null;
            this.f23741c = androidx.core.content.res.k.f(typedArray, xmlPullParser, "rotation", 5, this.f23741c);
            this.f23742d = typedArray.getFloat(1, this.f23742d);
            this.f23743e = typedArray.getFloat(2, this.f23743e);
            this.f23744f = androidx.core.content.res.k.f(typedArray, xmlPullParser, "scaleX", 3, this.f23744f);
            this.f23745g = androidx.core.content.res.k.f(typedArray, xmlPullParser, "scaleY", 4, this.f23745g);
            this.f23746h = androidx.core.content.res.k.f(typedArray, xmlPullParser, "translateX", 6, this.f23746h);
            this.f23747i = androidx.core.content.res.k.f(typedArray, xmlPullParser, "translateY", 7, this.f23747i);
            java.lang.String string = typedArray.getString(0);
            if (string != null) {
                this.f23751m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i6 = 0; i6 < this.f23740b.size(); i6++) {
                if (((androidx.vectordrawable.graphics.drawable.h.e) this.f23740b.get(i6)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i6 = 0; i6 < this.f23740b.size(); i6++) {
                zB |= ((androidx.vectordrawable.graphics.drawable.h.e) this.f23740b.get(i6)).b(iArr);
            }
            return zB;
        }

        public void c(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23686b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public java.lang.String getGroupName() {
            return this.f23751m;
        }

        public android.graphics.Matrix getLocalMatrix() {
            return this.f23748j;
        }

        public float getPivotX() {
            return this.f23742d;
        }

        public float getPivotY() {
            return this.f23743e;
        }

        public float getRotation() {
            return this.f23741c;
        }

        public float getScaleX() {
            return this.f23744f;
        }

        public float getScaleY() {
            return this.f23745g;
        }

        public float getTranslateX() {
            return this.f23746h;
        }

        public float getTranslateY() {
            return this.f23747i;
        }

        public void setPivotX(float f6) {
            if (f6 != this.f23742d) {
                this.f23742d = f6;
                d();
            }
        }

        public void setPivotY(float f6) {
            if (f6 != this.f23743e) {
                this.f23743e = f6;
                d();
            }
        }

        public void setRotation(float f6) {
            if (f6 != this.f23741c) {
                this.f23741c = f6;
                d();
            }
        }

        public void setScaleX(float f6) {
            if (f6 != this.f23744f) {
                this.f23744f = f6;
                d();
            }
        }

        public void setScaleY(float f6) {
            if (f6 != this.f23745g) {
                this.f23745g = f6;
                d();
            }
        }

        public void setTranslateX(float f6) {
            if (f6 != this.f23746h) {
                this.f23746h = f6;
                d();
            }
        }

        public void setTranslateY(float f6) {
            if (f6 != this.f23747i) {
                this.f23747i = f6;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends androidx.vectordrawable.graphics.drawable.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected androidx.core.graphics.h.b[] f23752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f23753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23755d;

        public f() {
            super();
            this.f23752a = null;
            this.f23754c = 0;
        }

        public f(androidx.vectordrawable.graphics.drawable.h.f fVar) {
            super();
            this.f23752a = null;
            this.f23754c = 0;
            this.f23753b = fVar.f23753b;
            this.f23755d = fVar.f23755d;
            this.f23752a = androidx.core.graphics.h.f(fVar.f23752a);
        }

        public boolean c() {
            return false;
        }

        public void d(android.graphics.Path path) {
            path.reset();
            androidx.core.graphics.h.b[] bVarArr = this.f23752a;
            if (bVarArr != null) {
                androidx.core.graphics.h.b.i(bVarArr, path);
            }
        }

        public androidx.core.graphics.h.b[] getPathData() {
            return this.f23752a;
        }

        public java.lang.String getPathName() {
            return this.f23753b;
        }

        public void setPathData(androidx.core.graphics.h.b[] bVarArr) {
            if (androidx.core.graphics.h.b(this.f23752a, bVarArr)) {
                androidx.core.graphics.h.k(this.f23752a, bVarArr);
            } else {
                this.f23752a = androidx.core.graphics.h.f(bVarArr);
            }
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final android.graphics.Matrix f23756q = new android.graphics.Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.Path f23757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.graphics.Path f23758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.graphics.Matrix f23759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.graphics.Paint f23760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.graphics.Paint f23761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.graphics.PathMeasure f23762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f23763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final androidx.vectordrawable.graphics.drawable.h.d f23764h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f23765i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f23766j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f23767k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f23768l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f23769m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        java.lang.String f23770n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        java.lang.Boolean f23771o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final p170r.C7026a f23772p;

        public g() {
            this.f23759c = new android.graphics.Matrix();
            this.f23765i = 0.0f;
            this.f23766j = 0.0f;
            this.f23767k = 0.0f;
            this.f23768l = 0.0f;
            this.f23769m = 255;
            this.f23770n = null;
            this.f23771o = null;
            this.f23772p = new p170r.C7026a();
            this.f23764h = new androidx.vectordrawable.graphics.drawable.h.d();
            this.f23757a = new android.graphics.Path();
            this.f23758b = new android.graphics.Path();
        }

        public g(androidx.vectordrawable.graphics.drawable.h.g gVar) {
            this.f23759c = new android.graphics.Matrix();
            this.f23765i = 0.0f;
            this.f23766j = 0.0f;
            this.f23767k = 0.0f;
            this.f23768l = 0.0f;
            this.f23769m = 255;
            this.f23770n = null;
            this.f23771o = null;
            p170r.C7026a c7026a = new p170r.C7026a();
            this.f23772p = c7026a;
            this.f23764h = new androidx.vectordrawable.graphics.drawable.h.d(gVar.f23764h, c7026a);
            this.f23757a = new android.graphics.Path(gVar.f23757a);
            this.f23758b = new android.graphics.Path(gVar.f23758b);
            this.f23765i = gVar.f23765i;
            this.f23766j = gVar.f23766j;
            this.f23767k = gVar.f23767k;
            this.f23768l = gVar.f23768l;
            this.f23763g = gVar.f23763g;
            this.f23769m = gVar.f23769m;
            this.f23770n = gVar.f23770n;
            java.lang.String str = gVar.f23770n;
            if (str != null) {
                c7026a.put(str, this);
            }
            this.f23771o = gVar.f23771o;
        }

        private static float a(float f6, float f10, float f11, float f12) {
            return (f6 * f12) - (f10 * f11);
        }

        private void c(androidx.vectordrawable.graphics.drawable.h.d dVar, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i6, int i10, android.graphics.ColorFilter colorFilter) {
            dVar.f23739a.set(matrix);
            dVar.f23739a.preConcat(dVar.f23748j);
            canvas.save();
            for (int i11 = 0; i11 < dVar.f23740b.size(); i11++) {
                androidx.vectordrawable.graphics.drawable.h.e eVar = (androidx.vectordrawable.graphics.drawable.h.e) dVar.f23740b.get(i11);
                if (eVar instanceof androidx.vectordrawable.graphics.drawable.h.d) {
                    c((androidx.vectordrawable.graphics.drawable.h.d) eVar, dVar.f23739a, canvas, i6, i10, colorFilter);
                } else if (eVar instanceof androidx.vectordrawable.graphics.drawable.h.f) {
                    d(dVar, (androidx.vectordrawable.graphics.drawable.h.f) eVar, canvas, i6, i10, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(androidx.vectordrawable.graphics.drawable.h.d dVar, androidx.vectordrawable.graphics.drawable.h.f fVar, android.graphics.Canvas canvas, int i6, int i10, android.graphics.ColorFilter colorFilter) {
            float f6 = i6 / this.f23767k;
            float f10 = i10 / this.f23768l;
            float fMin = java.lang.Math.min(f6, f10);
            android.graphics.Matrix matrix = dVar.f23739a;
            this.f23759c.set(matrix);
            this.f23759c.postScale(f6, f10);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f23757a);
            android.graphics.Path path = this.f23757a;
            this.f23758b.reset();
            if (fVar.c()) {
                this.f23758b.setFillType(fVar.f23754c == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                this.f23758b.addPath(path, this.f23759c);
                canvas.clipPath(this.f23758b);
                return;
            }
            androidx.vectordrawable.graphics.drawable.h.c cVar = (androidx.vectordrawable.graphics.drawable.h.c) fVar;
            float f11 = cVar.f23733k;
            if (f11 != 0.0f || cVar.f23734l != 1.0f) {
                float f12 = cVar.f23735m;
                float f13 = (f11 + f12) % 1.0f;
                float f14 = (cVar.f23734l + f12) % 1.0f;
                if (this.f23762f == null) {
                    this.f23762f = new android.graphics.PathMeasure();
                }
                this.f23762f.setPath(this.f23757a, false);
                float length = this.f23762f.getLength();
                float f15 = f13 * length;
                float f16 = f14 * length;
                path.reset();
                if (f15 > f16) {
                    this.f23762f.getSegment(f15, length, path, true);
                    this.f23762f.getSegment(0.0f, f16, path, true);
                } else {
                    this.f23762f.getSegment(f15, f16, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f23758b.addPath(path, this.f23759c);
            if (cVar.f23730h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f23730h;
                if (this.f23761e == null) {
                    android.graphics.Paint paint = new android.graphics.Paint(1);
                    this.f23761e = paint;
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                }
                android.graphics.Paint paint2 = this.f23761e;
                if (dVar2.h()) {
                    android.graphics.Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f23759c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(java.lang.Math.round(cVar.f23732j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(androidx.vectordrawable.graphics.drawable.h.a(dVar2.e(), cVar.f23732j));
                }
                paint2.setColorFilter(colorFilter);
                this.f23758b.setFillType(cVar.f23754c == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f23758b, paint2);
            }
            if (cVar.f23728f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f23728f;
                if (this.f23760d == null) {
                    android.graphics.Paint paint3 = new android.graphics.Paint(1);
                    this.f23760d = paint3;
                    paint3.setStyle(android.graphics.Paint.Style.STROKE);
                }
                android.graphics.Paint paint4 = this.f23760d;
                android.graphics.Paint.Join join = cVar.f23737o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                android.graphics.Paint.Cap cap = cVar.f23736n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f23738p);
                if (dVar3.h()) {
                    android.graphics.Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f23759c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(java.lang.Math.round(cVar.f23731i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(androidx.vectordrawable.graphics.drawable.h.a(dVar3.e(), cVar.f23731i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f23729g * fMin * fE);
                canvas.drawPath(this.f23758b, paint4);
            }
        }

        private float e(android.graphics.Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) java.lang.Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) java.lang.Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = java.lang.Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return java.lang.Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(android.graphics.Canvas canvas, int i6, int i10, android.graphics.ColorFilter colorFilter) {
            c(this.f23764h, f23756q, canvas, i6, i10, colorFilter);
        }

        public boolean f() {
            if (this.f23771o == null) {
                this.f23771o = java.lang.Boolean.valueOf(this.f23764h.a());
            }
            return this.f23771o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f23764h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f23769m;
        }

        public void setAlpha(float f6) {
            setRootAlpha((int) (f6 * 255.0f));
        }

        public void setRootAlpha(int i6) {
            this.f23769m = i6;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$h, reason: collision with other inner class name */
    private static class C0451h extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.vectordrawable.graphics.drawable.h.g f23774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.content.res.ColorStateList f23775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.graphics.PorterDuff.Mode f23776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f23777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.graphics.Bitmap f23778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.content.res.ColorStateList f23779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        android.graphics.PorterDuff.Mode f23780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f23781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f23782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f23783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        android.graphics.Paint f23784l;

        public C0451h() {
            this.f23775c = null;
            this.f23776d = androidx.vectordrawable.graphics.drawable.h.f23717M;
            this.f23774b = new androidx.vectordrawable.graphics.drawable.h.g();
        }

        public C0451h(androidx.vectordrawable.graphics.drawable.h.C0451h c0451h) {
            this.f23775c = null;
            this.f23776d = androidx.vectordrawable.graphics.drawable.h.f23717M;
            if (c0451h != null) {
                this.f23773a = c0451h.f23773a;
                androidx.vectordrawable.graphics.drawable.h.g gVar = new androidx.vectordrawable.graphics.drawable.h.g(c0451h.f23774b);
                this.f23774b = gVar;
                if (c0451h.f23774b.f23761e != null) {
                    gVar.f23761e = new android.graphics.Paint(c0451h.f23774b.f23761e);
                }
                if (c0451h.f23774b.f23760d != null) {
                    this.f23774b.f23760d = new android.graphics.Paint(c0451h.f23774b.f23760d);
                }
                this.f23775c = c0451h.f23775c;
                this.f23776d = c0451h.f23776d;
                this.f23777e = c0451h.f23777e;
            }
        }

        public boolean a(int i6, int i10) {
            return i6 == this.f23778f.getWidth() && i10 == this.f23778f.getHeight();
        }

        public boolean b() {
            return !this.f23783k && this.f23779g == this.f23775c && this.f23780h == this.f23776d && this.f23782j == this.f23777e && this.f23781i == this.f23774b.getRootAlpha();
        }

        public void c(int i6, int i10) {
            if (this.f23778f == null || !a(i6, i10)) {
                this.f23778f = android.graphics.Bitmap.createBitmap(i6, i10, android.graphics.Bitmap.Config.ARGB_8888);
                this.f23783k = true;
            }
        }

        public void d(android.graphics.Canvas canvas, android.graphics.ColorFilter colorFilter, android.graphics.Rect rect) {
            canvas.drawBitmap(this.f23778f, (android.graphics.Rect) null, rect, e(colorFilter));
        }

        public android.graphics.Paint e(android.graphics.ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f23784l == null) {
                android.graphics.Paint paint = new android.graphics.Paint();
                this.f23784l = paint;
                paint.setFilterBitmap(true);
            }
            this.f23784l.setAlpha(this.f23774b.getRootAlpha());
            this.f23784l.setColorFilter(colorFilter);
            return this.f23784l;
        }

        public boolean f() {
            return this.f23774b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f23774b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23773a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f23774b.g(iArr);
            this.f23783k |= zG;
            return zG;
        }

        public void i() {
            this.f23779g = this.f23775c;
            this.f23780h = this.f23776d;
            this.f23781i = this.f23774b.getRootAlpha();
            this.f23782j = this.f23777e;
            this.f23783k = false;
        }

        public void j(int i6, int i10) {
            this.f23778f.eraseColor(0);
            this.f23774b.b(new android.graphics.Canvas(this.f23778f), i6, i10, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.vectordrawable.graphics.drawable.h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.vectordrawable.graphics.drawable.h(this);
        }
    }

    private static class i extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Drawable.ConstantState f23785a;

        public i(android.graphics.drawable.Drawable.ConstantState constantState) {
            this.f23785a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f23785a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23785a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            androidx.vectordrawable.graphics.drawable.h hVar = new androidx.vectordrawable.graphics.drawable.h();
            hVar.f23716C = (android.graphics.drawable.VectorDrawable) this.f23785a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            androidx.vectordrawable.graphics.drawable.h hVar = new androidx.vectordrawable.graphics.drawable.h();
            hVar.f23716C = (android.graphics.drawable.VectorDrawable) this.f23785a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            androidx.vectordrawable.graphics.drawable.h hVar = new androidx.vectordrawable.graphics.drawable.h();
            hVar.f23716C = (android.graphics.drawable.VectorDrawable) this.f23785a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f23722H = true;
        this.f23724J = new float[9];
        this.f23725K = new android.graphics.Matrix();
        this.f23726L = new android.graphics.Rect();
        this.f23718D = new androidx.vectordrawable.graphics.drawable.h.C0451h();
    }

    h(androidx.vectordrawable.graphics.drawable.h.C0451h c0451h) {
        this.f23722H = true;
        this.f23724J = new float[9];
        this.f23725K = new android.graphics.Matrix();
        this.f23726L = new android.graphics.Rect();
        this.f23718D = c0451h;
        this.f23719E = j(this.f23719E, c0451h.f23775c, c0451h.f23776d);
    }

    static int a(int i6, float f6) {
        return (i6 & 16777215) | (((int) (android.graphics.Color.alpha(i6) * f6)) << 24);
    }

    public static androidx.vectordrawable.graphics.drawable.h b(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
        int next;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.vectordrawable.graphics.drawable.h hVar = new androidx.vectordrawable.graphics.drawable.h();
            hVar.f23716C = androidx.core.content.res.h.e(resources, i6, theme);
            hVar.f23723I = new androidx.vectordrawable.graphics.drawable.h.i(hVar.f23716C.getConstantState());
            return hVar;
        }
        try {
            android.content.res.XmlResourceParser xml = resources.getXml(i6);
            android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } catch (java.io.IOException e6) {
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e10) {
            return null;
        }
    }

    public static androidx.vectordrawable.graphics.drawable.h c(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.h hVar = new androidx.vectordrawable.graphics.drawable.h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i6;
        int i10;
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h = this.f23718D;
        androidx.vectordrawable.graphics.drawable.h.g gVar = c0451h.f23774b;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(gVar.f23764h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z6 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                androidx.vectordrawable.graphics.drawable.h.d dVar = (androidx.vectordrawable.graphics.drawable.h.d) arrayDeque.peek();
                if ("path".equals(name)) {
                    androidx.vectordrawable.graphics.drawable.h.c cVar = new androidx.vectordrawable.graphics.drawable.h.c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f23740b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f23772p.put(cVar.getPathName(), cVar);
                    }
                    c0451h.f23773a = cVar.f23755d | c0451h.f23773a;
                    z6 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        androidx.vectordrawable.graphics.drawable.h.b bVar = new androidx.vectordrawable.graphics.drawable.h.b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f23740b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f23772p.put(bVar.getPathName(), bVar);
                        }
                        i6 = c0451h.f23773a;
                        i10 = bVar.f23755d;
                    } else if ("group".equals(name)) {
                        androidx.vectordrawable.graphics.drawable.h.d dVar2 = new androidx.vectordrawable.graphics.drawable.h.d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f23740b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f23772p.put(dVar2.getGroupName(), dVar2);
                        }
                        i6 = c0451h.f23773a;
                        i10 = dVar2.f23749k;
                    }
                    c0451h.f23773a = i10 | i6;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z6) {
            throw new org.xmlpull.v1.XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static android.graphics.PorterDuff.Mode g(int i6, android.graphics.PorterDuff.Mode mode) {
        if (i6 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException {
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h = this.f23718D;
        androidx.vectordrawable.graphics.drawable.h.g gVar = c0451h.f23774b;
        c0451h.f23776d = g(androidx.core.content.res.k.g(typedArray, xmlPullParser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        android.content.res.ColorStateList colorStateListC = androidx.core.content.res.k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            c0451h.f23775c = colorStateListC;
        }
        c0451h.f23777e = androidx.core.content.res.k.a(typedArray, xmlPullParser, "autoMirrored", 5, c0451h.f23777e);
        gVar.f23767k = androidx.core.content.res.k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f23767k);
        float f6 = androidx.core.content.res.k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f23768l);
        gVar.f23768l = f6;
        if (gVar.f23767k <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f6 <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f23765i = typedArray.getDimension(3, gVar.f23765i);
        float dimension = typedArray.getDimension(2, gVar.f23766j);
        gVar.f23766j = dimension;
        if (gVar.f23765i <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(androidx.core.content.res.k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        java.lang.String string = typedArray.getString(0);
        if (string != null) {
            gVar.f23770n = string;
            gVar.f23772p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    java.lang.Object d(java.lang.String str) {
        return this.f23718D.f23774b.f23772p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f23726L);
        if (this.f23726L.width() <= 0 || this.f23726L.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.f23720F;
        if (colorFilter == null) {
            colorFilter = this.f23719E;
        }
        canvas.getMatrix(this.f23725K);
        this.f23725K.getValues(this.f23724J);
        float fAbs = java.lang.Math.abs(this.f23724J[0]);
        float fAbs2 = java.lang.Math.abs(this.f23724J[4]);
        float fAbs3 = java.lang.Math.abs(this.f23724J[1]);
        float fAbs4 = java.lang.Math.abs(this.f23724J[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f23726L.width() * fAbs);
        int iHeight = (int) (this.f23726L.height() * fAbs2);
        int iMin = java.lang.Math.min(2048, iWidth);
        int iMin2 = java.lang.Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        android.graphics.Rect rect = this.f23726L;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f23726L.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f23726L.offsetTo(0, 0);
        this.f23718D.c(iMin, iMin2);
        if (!this.f23722H) {
            this.f23718D.j(iMin, iMin2);
        } else if (!this.f23718D.b()) {
            this.f23718D.j(iMin, iMin2);
            this.f23718D.i();
        }
        this.f23718D.d(canvas, colorFilter, this.f23726L);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f23718D.f23774b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23718D.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f23720F;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.f23716C != null && android.os.Build.VERSION.SDK_INT >= 24) {
            return new androidx.vectordrawable.graphics.drawable.h.i(this.f23716C.getConstantState());
        }
        this.f23718D.f23773a = getChangingConfigurations();
        return this.f23718D;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f23718D.f23774b.f23766j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f23718D.f23774b.f23765i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z6) {
        this.f23722H = z6;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h = this.f23718D;
        c0451h.f23774b = new androidx.vectordrawable.graphics.drawable.h.g();
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23685a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        c0451h.f23773a = getChangingConfigurations();
        c0451h.f23783k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f23719E = j(this.f23719E, c0451h.f23775c, c0451h.f23776d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f23718D.f23777e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h;
        android.content.res.ColorStateList colorStateList;
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((c0451h = this.f23718D) != null && (c0451h.g() || ((colorStateList = this.f23718D.f23775c) != null && colorStateList.isStateful())));
    }

    android.graphics.PorterDuffColorFilter j(android.graphics.PorterDuffColorFilter porterDuffColorFilter, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f23721G && super.mutate() == this) {
            this.f23718D = new androidx.vectordrawable.graphics.drawable.h.C0451h(this.f23718D);
            this.f23721G = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z6;
        android.graphics.PorterDuff.Mode mode;
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h = this.f23718D;
        android.content.res.ColorStateList colorStateList = c0451h.f23775c;
        if (colorStateList == null || (mode = c0451h.f23776d) == null) {
            z6 = false;
        } else {
            this.f23719E = j(this.f23719E, colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        if (!c0451h.g() || !c0451h.h(iArr)) {
            return z6;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable runnable, long j6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f23718D.f23774b.getRootAlpha() != i6) {
            this.f23718D.f23774b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z6);
        } else {
            this.f23718D.f23777e = z6;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i6) {
        super.setChangingConfigurations(i6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i6, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i6, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23720F = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z6) {
        super.setFilterBitmap(z6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f10) {
        super.setHotspot(f6, f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i6, int i10, int i11, int i12) {
        super.setHotspotBounds(i6, i10, i11, i12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i6);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h = this.f23718D;
        if (c0451h.f23775c != colorStateList) {
            c0451h.f23775c = colorStateList;
            this.f23719E = j(this.f23719E, colorStateList, c0451h.f23776d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        androidx.vectordrawable.graphics.drawable.h.C0451h c0451h = this.f23718D;
        if (c0451h.f23776d != mode) {
            c0451h.f23776d = mode;
            this.f23719E = j(this.f23719E, c0451h.f23775c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z10) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.setVisible(z6, z10) : super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
