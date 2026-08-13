package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static androidx.appcompat.widget.T f18298i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.WeakHashMap f18300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p170r.Y f18301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p170r.Z f18302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.WeakHashMap f18303d = new java.util.WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.util.TypedValue f18304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.appcompat.widget.T.f f18306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final android.graphics.PorterDuff.Mode f18297h = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final androidx.appcompat.widget.T.c f18299j = new androidx.appcompat.widget.T.c(6);

    static class a implements androidx.appcompat.widget.T.e {
        a() {
        }

        @Override // androidx.appcompat.widget.T.e
        public android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return p110l.a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception e6) {
                return null;
            }
        }
    }

    private static class b implements androidx.appcompat.widget.T.e {
        b() {
        }

        @Override // androidx.appcompat.widget.T.e
        public android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception e6) {
                return null;
            }
        }
    }

    private static class c extends p170r.C7048x {
        public c(int i6) {
            super(i6);
        }

        private static int j(int i6, android.graphics.PorterDuff.Mode mode) {
            return ((i6 + 31) * 31) + mode.hashCode();
        }

        android.graphics.PorterDuffColorFilter k(int i6, android.graphics.PorterDuff.Mode mode) {
            return (android.graphics.PorterDuffColorFilter) c(java.lang.Integer.valueOf(j(i6, mode)));
        }

        android.graphics.PorterDuffColorFilter l(int i6, android.graphics.PorterDuff.Mode mode, android.graphics.PorterDuffColorFilter porterDuffColorFilter) {
            return (android.graphics.PorterDuffColorFilter) d(java.lang.Integer.valueOf(j(i6, mode)), porterDuffColorFilter);
        }
    }

    static class d implements androidx.appcompat.widget.T.e {
        d() {
        }

        @Override // androidx.appcompat.widget.T.e
        public android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) androidx.appcompat.widget.T.d.class.getClassLoader().loadClass(classAttribute).asSubclass(android.graphics.drawable.Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    p120m.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (java.lang.Exception e6) {
                }
            }
            return null;
        }
    }

    private interface e {
        android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme);
    }

    public interface f {
        boolean a(android.content.Context context, int i6, android.graphics.drawable.Drawable drawable);

        android.graphics.PorterDuff.Mode b(int i6);

        android.graphics.drawable.Drawable c(androidx.appcompat.widget.T t6, android.content.Context context, int i6);

        android.content.res.ColorStateList d(android.content.Context context, int i6);

        boolean e(android.content.Context context, int i6, android.graphics.drawable.Drawable drawable);
    }

    private static class g implements androidx.appcompat.widget.T.e {
        g() {
        }

        @Override // androidx.appcompat.widget.T.e
        public android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception e6) {
                return null;
            }
        }
    }

    private void a(java.lang.String str, androidx.appcompat.widget.T.e eVar) {
        if (this.f18301b == null) {
            this.f18301b = new p170r.Y();
        }
        this.f18301b.put(str, eVar);
    }

    private synchronized boolean b(android.content.Context context, long j6, android.graphics.drawable.Drawable drawable) {
        try {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            p170r.C7046v c7046v = (p170r.C7046v) this.f18303d.get(context);
            if (c7046v == null) {
                c7046v = new p170r.C7046v();
                this.f18303d.put(context, c7046v);
            }
            c7046v.m(j6, new java.lang.ref.WeakReference(constantState));
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private void c(android.content.Context context, int i6, android.content.res.ColorStateList colorStateList) {
        if (this.f18300a == null) {
            this.f18300a = new java.util.WeakHashMap();
        }
        p170r.Z z6 = (p170r.Z) this.f18300a.get(context);
        if (z6 == null) {
            z6 = new p170r.Z();
            this.f18300a.put(context, z6);
        }
        z6.a(i6, colorStateList);
    }

    private void d(android.content.Context context) {
        if (this.f18305f) {
            return;
        }
        this.f18305f = true;
        android.graphics.drawable.Drawable drawableJ = j(context, p120m.d.f50184a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f18305f = false;
            throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(android.util.TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private android.graphics.drawable.Drawable f(android.content.Context context, int i6) {
        if (this.f18304e == null) {
            this.f18304e = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f18304e;
        context.getResources().getValue(i6, typedValue, true);
        long jE = e(typedValue);
        android.graphics.drawable.Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        androidx.appcompat.widget.T.f fVar = this.f18306g;
        android.graphics.drawable.Drawable drawableC = fVar == null ? null : fVar.c(this, context, i6);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableC);
        }
        return drawableC;
    }

    private static android.graphics.PorterDuffColorFilter g(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized androidx.appcompat.widget.T h() {
        try {
            if (f18298i == null) {
                androidx.appcompat.widget.T t6 = new androidx.appcompat.widget.T();
                f18298i = t6;
                p(t6);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f18298i;
    }

    private synchronized android.graphics.drawable.Drawable i(android.content.Context context, long j6) {
        p170r.C7046v c7046v = (p170r.C7046v) this.f18303d.get(context);
        if (c7046v == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) c7046v.e(j6);
        if (weakReference != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c7046v.n(j6);
        }
        return null;
    }

    public static synchronized android.graphics.PorterDuffColorFilter l(int i6, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilterK;
        androidx.appcompat.widget.T.c cVar = f18299j;
        porterDuffColorFilterK = cVar.k(i6, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new android.graphics.PorterDuffColorFilter(i6, mode);
            cVar.l(i6, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private android.content.res.ColorStateList n(android.content.Context context, int i6) {
        p170r.Z z6;
        java.util.WeakHashMap weakHashMap = this.f18300a;
        if (weakHashMap == null || (z6 = (p170r.Z) weakHashMap.get(context)) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) z6.e(i6);
    }

    private static void p(androidx.appcompat.widget.T t6) {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            t6.a("vector", new androidx.appcompat.widget.T.g());
            t6.a("animated-vector", new androidx.appcompat.widget.T.b());
            t6.a("animated-selector", new androidx.appcompat.widget.T.a());
            t6.a("drawable", new androidx.appcompat.widget.T.d());
        }
    }

    private static boolean q(android.graphics.drawable.Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private android.graphics.drawable.Drawable r(android.content.Context context, int i6) {
        int next;
        p170r.Y y6 = this.f18301b;
        if (y6 == null || y6.isEmpty()) {
            return null;
        }
        p170r.Z z6 = this.f18302c;
        if (z6 != null) {
            java.lang.String str = (java.lang.String) z6.e(i6);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f18301b.get(str) == null)) {
                return null;
            }
        } else {
            this.f18302c = new p170r.Z();
        }
        if (this.f18304e == null) {
            this.f18304e = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f18304e;
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        long jE = e(typedValue);
        android.graphics.drawable.Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                android.content.res.XmlResourceParser xml = resources.getXml(i6);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                }
                java.lang.String name = xml.getName();
                this.f18302c.a(i6, name);
                androidx.appcompat.widget.T.e eVar = (androidx.appcompat.widget.T.e) this.f18301b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (java.lang.Exception e6) {
            }
        }
        if (drawableI == null) {
            this.f18302c.a(i6, "appcompat_skip_skip");
        }
        return drawableI;
    }

    private android.graphics.drawable.Drawable u(android.content.Context context, int i6, boolean z6, android.graphics.drawable.Drawable drawable) {
        android.content.res.ColorStateList colorStateListM = m(context, i6);
        if (colorStateListM == null) {
            androidx.appcompat.widget.T.f fVar = this.f18306g;
            if ((fVar == null || !fVar.e(context, i6, drawable)) && !w(context, i6, drawable) && z6) {
                return null;
            }
            return drawable;
        }
        if (androidx.appcompat.widget.K.a(drawable)) {
            drawable = drawable.mutate();
        }
        android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(drawableR, colorStateListM);
        android.graphics.PorterDuff.Mode modeO = o(i6);
        if (modeO == null) {
            return drawableR;
        }
        androidx.core.graphics.drawable.a.p(drawableR, modeO);
        return drawableR;
    }

    static void v(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.a0 a0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (!androidx.appcompat.widget.K.a(drawable) || drawable.mutate() == drawable) {
            if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z6 = a0Var.f18422d;
            if (z6 || a0Var.f18421c) {
                drawable.setColorFilter(g(z6 ? a0Var.f18419a : null, a0Var.f18421c ? a0Var.f18420b : f18297h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (android.os.Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public synchronized android.graphics.drawable.Drawable j(android.content.Context context, int i6) {
        return k(context, i6, false);
    }

    synchronized android.graphics.drawable.Drawable k(android.content.Context context, int i6, boolean z6) {
        android.graphics.drawable.Drawable drawableR;
        try {
            d(context);
            drawableR = r(context, i6);
            if (drawableR == null) {
                drawableR = f(context, i6);
            }
            if (drawableR == null) {
                drawableR = androidx.core.content.a.e(context, i6);
            }
            if (drawableR != null) {
                drawableR = u(context, i6, z6, drawableR);
            }
            if (drawableR != null) {
                androidx.appcompat.widget.K.b(drawableR);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return drawableR;
    }

    synchronized android.content.res.ColorStateList m(android.content.Context context, int i6) {
        android.content.res.ColorStateList colorStateListN;
        colorStateListN = n(context, i6);
        if (colorStateListN == null) {
            androidx.appcompat.widget.T.f fVar = this.f18306g;
            colorStateListN = fVar == null ? null : fVar.d(context, i6);
            if (colorStateListN != null) {
                c(context, i6, colorStateListN);
            }
        }
        return colorStateListN;
    }

    android.graphics.PorterDuff.Mode o(int i6) {
        androidx.appcompat.widget.T.f fVar = this.f18306g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i6);
    }

    synchronized android.graphics.drawable.Drawable s(android.content.Context context, androidx.appcompat.widget.m0 m0Var, int i6) {
        try {
            android.graphics.drawable.Drawable drawableR = r(context, i6);
            if (drawableR == null) {
                drawableR = m0Var.a(i6);
            }
            if (drawableR == null) {
                return null;
            }
            return u(context, i6, false, drawableR);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized void t(androidx.appcompat.widget.T.f fVar) {
        this.f18306g = fVar;
    }

    boolean w(android.content.Context context, int i6, android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.T.f fVar = this.f18306g;
        return fVar != null && fVar.a(context, i6, drawable);
    }
}
