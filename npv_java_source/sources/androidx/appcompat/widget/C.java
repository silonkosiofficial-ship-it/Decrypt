package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.TextView f18070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.appcompat.widget.E f18078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18079j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18080k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.graphics.Typeface f18081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18082m;

    class a extends androidx.core.content.res.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.ref.WeakReference f18085c;

        a(int i6, int i10, java.lang.ref.WeakReference weakReference) {
            this.f18083a = i6;
            this.f18084b = i10;
            this.f18085c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        /* JADX INFO: renamed from: h */
        public void f(int i6) {
        }

        @Override // androidx.core.content.res.h.e
        /* JADX INFO: renamed from: i */
        public void g(android.graphics.Typeface typeface) {
            int i6;
            if (android.os.Build.VERSION.SDK_INT >= 28 && (i6 = this.f18083a) != -1) {
                typeface = androidx.appcompat.widget.C.g.a(typeface, i6, (this.f18084b & 2) != 0);
            }
            androidx.appcompat.widget.C.this.n(this.f18085c, typeface);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f18087C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.graphics.Typeface f18088D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f18089E;

        b(android.widget.TextView textView, android.graphics.Typeface typeface, int i6) {
            this.f18087C = textView;
            this.f18088D = typeface;
            this.f18089E = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18087C.setTypeface(this.f18088D, this.f18089E);
        }
    }

    static class c {
        static android.graphics.drawable.Drawable[] a(android.widget.TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(android.widget.TextView textView, java.util.Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static java.util.Locale a(java.lang.String str) {
            return java.util.Locale.forLanguageTag(str);
        }
    }

    static class e {
        static android.os.LocaleList a(java.lang.String str) {
            return android.os.LocaleList.forLanguageTags(str);
        }

        static void b(android.widget.TextView textView, android.os.LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class f {
        static int a(android.widget.TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(android.widget.TextView textView, int i6, int i10, int i11, int i12) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i6, i10, i11, i12);
        }

        static void c(android.widget.TextView textView, int[] iArr, int i6) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        static boolean d(android.widget.TextView textView, java.lang.String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class g {
        static android.graphics.Typeface a(android.graphics.Typeface typeface, int i6, boolean z6) {
            return android.graphics.Typeface.create(typeface, i6, z6);
        }
    }

    C(android.widget.TextView textView) {
        this.f18070a = textView;
        this.f18078i = new androidx.appcompat.widget.E(textView);
    }

    private void B(int i6, float f6) {
        this.f18078i.t(i6, f6);
    }

    private void C(android.content.Context context, androidx.appcompat.widget.c0 c0Var) {
        java.lang.String strO;
        android.graphics.Typeface typefaceCreate;
        android.graphics.Typeface typeface;
        this.f18079j = c0Var.k(p090j.j.f48828H2, this.f18079j);
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int iK = c0Var.k(p090j.j.f48836J2, -1);
            this.f18080k = iK;
            if (iK != -1) {
                this.f18079j &= 2;
            }
        }
        if (!c0Var.s(p090j.j.f48832I2) && !c0Var.s(p090j.j.f48840K2)) {
            if (c0Var.s(p090j.j.f48824G2)) {
                this.f18082m = false;
                int iK2 = c0Var.k(p090j.j.f48824G2, 1);
                if (iK2 == 1) {
                    typeface = android.graphics.Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = android.graphics.Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = android.graphics.Typeface.MONOSPACE;
                }
                this.f18081l = typeface;
                return;
            }
            return;
        }
        this.f18081l = null;
        int i10 = c0Var.s(p090j.j.f48840K2) ? p090j.j.f48840K2 : p090j.j.f48832I2;
        int i11 = this.f18080k;
        int i12 = this.f18079j;
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface typefaceJ = c0Var.j(i10, this.f18079j, new androidx.appcompat.widget.C.a(i11, i12, new java.lang.ref.WeakReference(this.f18070a)));
                if (typefaceJ != null) {
                    if (i6 >= 28 && this.f18080k != -1) {
                        typefaceJ = androidx.appcompat.widget.C.g.a(android.graphics.Typeface.create(typefaceJ, 0), this.f18080k, (this.f18079j & 2) != 0);
                    }
                    this.f18081l = typefaceJ;
                }
                this.f18082m = this.f18081l == null;
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            }
        }
        if (this.f18081l != null || (strO = c0Var.o(i10)) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 28 || this.f18080k == -1) {
            typefaceCreate = android.graphics.Typeface.create(strO, this.f18079j);
        } else {
            typefaceCreate = androidx.appcompat.widget.C.g.a(android.graphics.Typeface.create(strO, 0), this.f18080k, (this.f18079j & 2) != 0);
        }
        this.f18081l = typefaceCreate;
    }

    private void a(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.a0 a0Var) {
        if (drawable == null || a0Var == null) {
            return;
        }
        androidx.appcompat.widget.C1905k.h(drawable, a0Var, this.f18070a.getDrawableState());
    }

    private static androidx.appcompat.widget.a0 d(android.content.Context context, androidx.appcompat.widget.C1905k c1905k, int i6) {
        android.content.res.ColorStateList colorStateListF = c1905k.f(context, i6);
        if (colorStateListF == null) {
            return null;
        }
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0();
        a0Var.f18422d = true;
        a0Var.f18419a = colorStateListF;
        return a0Var;
    }

    private void y(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4, android.graphics.drawable.Drawable drawable5, android.graphics.drawable.Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            android.graphics.drawable.Drawable[] drawableArrA = androidx.appcompat.widget.C.c.a(this.f18070a);
            android.widget.TextView textView = this.f18070a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            androidx.appcompat.widget.C.c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        android.graphics.drawable.Drawable[] drawableArrA2 = androidx.appcompat.widget.C.c.a(this.f18070a);
        android.graphics.drawable.Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            android.widget.TextView textView2 = this.f18070a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            android.graphics.drawable.Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            androidx.appcompat.widget.C.c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawables = this.f18070a.getCompoundDrawables();
        android.widget.TextView textView3 = this.f18070a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        androidx.appcompat.widget.a0 a0Var = this.f18077h;
        this.f18071b = a0Var;
        this.f18072c = a0Var;
        this.f18073d = a0Var;
        this.f18074e = a0Var;
        this.f18075f = a0Var;
        this.f18076g = a0Var;
    }

    void A(int i6, float f6) {
        if (androidx.appcompat.widget.n0.f18559b || l()) {
            return;
        }
        B(i6, f6);
    }

    void b() {
        if (this.f18071b != null || this.f18072c != null || this.f18073d != null || this.f18074e != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = this.f18070a.getCompoundDrawables();
            a(compoundDrawables[0], this.f18071b);
            a(compoundDrawables[1], this.f18072c);
            a(compoundDrawables[2], this.f18073d);
            a(compoundDrawables[3], this.f18074e);
        }
        if (this.f18075f == null && this.f18076g == null) {
            return;
        }
        android.graphics.drawable.Drawable[] drawableArrA = androidx.appcompat.widget.C.c.a(this.f18070a);
        a(drawableArrA[0], this.f18075f);
        a(drawableArrA[2], this.f18076g);
    }

    void c() {
        this.f18078i.a();
    }

    int e() {
        return this.f18078i.f();
    }

    int f() {
        return this.f18078i.g();
    }

    int g() {
        return this.f18078i.h();
    }

    int[] h() {
        return this.f18078i.i();
    }

    int i() {
        return this.f18078i.j();
    }

    android.content.res.ColorStateList j() {
        androidx.appcompat.widget.a0 a0Var = this.f18077h;
        if (a0Var != null) {
            return a0Var.f18419a;
        }
        return null;
    }

    android.graphics.PorterDuff.Mode k() {
        androidx.appcompat.widget.a0 a0Var = this.f18077h;
        if (a0Var != null) {
            return a0Var.f18420b;
        }
        return null;
    }

    boolean l() {
        return this.f18078i.n();
    }

    void m(android.util.AttributeSet attributeSet, int i6) {
        boolean zA;
        boolean z6;
        java.lang.String strO;
        java.lang.String strO2;
        boolean z10;
        android.content.Context context = this.f18070a.getContext();
        androidx.appcompat.widget.C1905k c1905kB = androidx.appcompat.widget.C1905k.b();
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f48893Y, i6, 0);
        android.widget.TextView textView = this.f18070a;
        androidx.core.view.X.l0(textView, textView.getContext(), p090j.j.f48893Y, attributeSet, c0VarV.r(), i6, 0);
        int iN = c0VarV.n(p090j.j.f48897Z, -1);
        if (c0VarV.s(p090j.j.f48912c0)) {
            this.f18071b = d(context, c1905kB, c0VarV.n(p090j.j.f48912c0, 0));
        }
        if (c0VarV.s(p090j.j.f48902a0)) {
            this.f18072c = d(context, c1905kB, c0VarV.n(p090j.j.f48902a0, 0));
        }
        if (c0VarV.s(p090j.j.f48917d0)) {
            this.f18073d = d(context, c1905kB, c0VarV.n(p090j.j.f48917d0, 0));
        }
        if (c0VarV.s(p090j.j.f48907b0)) {
            this.f18074e = d(context, c1905kB, c0VarV.n(p090j.j.f48907b0, 0));
        }
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (c0VarV.s(p090j.j.f48922e0)) {
            this.f18075f = d(context, c1905kB, c0VarV.n(p090j.j.f48922e0, 0));
        }
        if (c0VarV.s(p090j.j.f48927f0)) {
            this.f18076g = d(context, c1905kB, c0VarV.n(p090j.j.f48927f0, 0));
        }
        c0VarV.w();
        boolean z11 = this.f18070a.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        if (iN != -1) {
            androidx.appcompat.widget.c0 c0VarT = androidx.appcompat.widget.c0.t(context, iN, p090j.j.f48816E2);
            if (z11 || !c0VarT.s(p090j.j.f48848M2)) {
                zA = false;
                z6 = false;
            } else {
                zA = c0VarT.a(p090j.j.f48848M2, false);
                z6 = true;
            }
            C(context, c0VarT);
            strO2 = c0VarT.s(p090j.j.f48852N2) ? c0VarT.o(p090j.j.f48852N2) : null;
            strO = (i10 < 26 || !c0VarT.s(p090j.j.f48844L2)) ? null : c0VarT.o(p090j.j.f48844L2);
            c0VarT.w();
        } else {
            zA = false;
            z6 = false;
            strO = null;
            strO2 = null;
        }
        androidx.appcompat.widget.c0 c0VarV2 = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f48816E2, i6, 0);
        if (z11 || !c0VarV2.s(p090j.j.f48848M2)) {
            z10 = z6;
        } else {
            zA = c0VarV2.a(p090j.j.f48848M2, false);
            z10 = true;
        }
        if (c0VarV2.s(p090j.j.f48852N2)) {
            strO2 = c0VarV2.o(p090j.j.f48852N2);
        }
        if (i10 >= 26 && c0VarV2.s(p090j.j.f48844L2)) {
            strO = c0VarV2.o(p090j.j.f48844L2);
        }
        if (i10 >= 28 && c0VarV2.s(p090j.j.f48820F2) && c0VarV2.f(p090j.j.f48820F2, -1) == 0) {
            this.f18070a.setTextSize(0, 0.0f);
        }
        C(context, c0VarV2);
        c0VarV2.w();
        if (!z11 && z10) {
            s(zA);
        }
        android.graphics.Typeface typeface = this.f18081l;
        if (typeface != null) {
            if (this.f18080k == -1) {
                this.f18070a.setTypeface(typeface, this.f18079j);
            } else {
                this.f18070a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            androidx.appcompat.widget.C.f.d(this.f18070a, strO);
        }
        if (strO2 != null) {
            if (i10 >= 24) {
                androidx.appcompat.widget.C.e.b(this.f18070a, androidx.appcompat.widget.C.e.a(strO2));
            } else {
                androidx.appcompat.widget.C.c.c(this.f18070a, androidx.appcompat.widget.C.d.a(strO2.split(",")[0]));
            }
        }
        this.f18078i.o(attributeSet, i6);
        if (androidx.appcompat.widget.n0.f18559b && this.f18078i.j() != 0) {
            int[] iArrI = this.f18078i.i();
            if (iArrI.length > 0) {
                if (androidx.appcompat.widget.C.f.a(this.f18070a) != -1.0f) {
                    androidx.appcompat.widget.C.f.b(this.f18070a, this.f18078i.g(), this.f18078i.f(), this.f18078i.h(), 0);
                } else {
                    androidx.appcompat.widget.C.f.c(this.f18070a, iArrI, 0);
                }
            }
        }
        androidx.appcompat.widget.c0 c0VarU = androidx.appcompat.widget.c0.u(context, attributeSet, p090j.j.f48932g0);
        int iN2 = c0VarU.n(p090j.j.f48972o0, -1);
        android.graphics.drawable.Drawable drawableC = iN2 != -1 ? c1905kB.c(context, iN2) : null;
        int iN3 = c0VarU.n(p090j.j.f48997t0, -1);
        android.graphics.drawable.Drawable drawableC2 = iN3 != -1 ? c1905kB.c(context, iN3) : null;
        int iN4 = c0VarU.n(p090j.j.f48977p0, -1);
        android.graphics.drawable.Drawable drawableC3 = iN4 != -1 ? c1905kB.c(context, iN4) : null;
        int iN5 = c0VarU.n(p090j.j.f48962m0, -1);
        android.graphics.drawable.Drawable drawableC4 = iN5 != -1 ? c1905kB.c(context, iN5) : null;
        int iN6 = c0VarU.n(p090j.j.f48982q0, -1);
        android.graphics.drawable.Drawable drawableC5 = iN6 != -1 ? c1905kB.c(context, iN6) : null;
        int iN7 = c0VarU.n(p090j.j.f48967n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c1905kB.c(context, iN7) : null);
        if (c0VarU.s(p090j.j.f48987r0)) {
            androidx.core.widget.h.g(this.f18070a, c0VarU.c(p090j.j.f48987r0));
        }
        if (c0VarU.s(p090j.j.f48992s0)) {
            androidx.core.widget.h.h(this.f18070a, androidx.appcompat.widget.K.d(c0VarU.k(p090j.j.f48992s0, -1), null));
        }
        int iF = c0VarU.f(p090j.j.f49007v0, -1);
        int iF2 = c0VarU.f(p090j.j.f49012w0, -1);
        int iF3 = c0VarU.f(p090j.j.f49017x0, -1);
        c0VarU.w();
        if (iF != -1) {
            androidx.core.widget.h.j(this.f18070a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.h.k(this.f18070a, iF2);
        }
        if (iF3 != -1) {
            androidx.core.widget.h.l(this.f18070a, iF3);
        }
    }

    void n(java.lang.ref.WeakReference weakReference, android.graphics.Typeface typeface) {
        if (this.f18082m) {
            this.f18081l = typeface;
            android.widget.TextView textView = (android.widget.TextView) weakReference.get();
            if (textView != null) {
                if (androidx.core.view.X.Q(textView)) {
                    textView.post(new androidx.appcompat.widget.C.b(textView, typeface, this.f18079j));
                } else {
                    textView.setTypeface(typeface, this.f18079j);
                }
            }
        }
    }

    void o(boolean z6, int i6, int i10, int i11, int i12) {
        if (androidx.appcompat.widget.n0.f18559b) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(android.content.Context context, int i6) {
        java.lang.String strO;
        androidx.appcompat.widget.c0 c0VarT = androidx.appcompat.widget.c0.t(context, i6, p090j.j.f48816E2);
        if (c0VarT.s(p090j.j.f48848M2)) {
            s(c0VarT.a(p090j.j.f48848M2, false));
        }
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (c0VarT.s(p090j.j.f48820F2) && c0VarT.f(p090j.j.f48820F2, -1) == 0) {
            this.f18070a.setTextSize(0, 0.0f);
        }
        C(context, c0VarT);
        if (i10 >= 26 && c0VarT.s(p090j.j.f48844L2) && (strO = c0VarT.o(p090j.j.f48844L2)) != null) {
            androidx.appcompat.widget.C.f.d(this.f18070a, strO);
        }
        c0VarT.w();
        android.graphics.Typeface typeface = this.f18081l;
        if (typeface != null) {
            this.f18070a.setTypeface(typeface, this.f18079j);
        }
    }

    void r(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        F1.c.f(editorInfo, textView.getText());
    }

    void s(boolean z6) {
        this.f18070a.setAllCaps(z6);
    }

    void t(int i6, int i10, int i11, int i12) {
        this.f18078i.p(i6, i10, i11, i12);
    }

    void u(int[] iArr, int i6) {
        this.f18078i.q(iArr, i6);
    }

    void v(int i6) {
        this.f18078i.r(i6);
    }

    void w(android.content.res.ColorStateList colorStateList) {
        if (this.f18077h == null) {
            this.f18077h = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18077h;
        a0Var.f18419a = colorStateList;
        a0Var.f18422d = colorStateList != null;
        z();
    }

    void x(android.graphics.PorterDuff.Mode mode) {
        if (this.f18077h == null) {
            this.f18077h = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18077h;
        a0Var.f18420b = mode;
        a0Var.f18421c = mode != null;
        z();
    }
}
