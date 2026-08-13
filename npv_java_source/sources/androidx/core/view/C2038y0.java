package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2038y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.core.view.C2038y0 f21777b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.view.C2038y0.l f21778a;

    /* JADX INFO: renamed from: androidx.core.view.y0$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static java.lang.reflect.Field f21779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static java.lang.reflect.Field f21780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static java.lang.reflect.Field f21781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f21782d;

        static {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAttachInfo");
                f21779a = declaredField;
                declaredField.setAccessible(true);
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
                java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f21780b = declaredField2;
                declaredField2.setAccessible(true);
                java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f21781c = declaredField3;
                declaredField3.setAccessible(true);
                f21782d = true;
            } catch (java.lang.ReflectiveOperationException e6) {
                java.lang.String str = "Failed to get visible insets from AttachInfo " + e6.getMessage();
            }
        }

        public static androidx.core.view.C2038y0 a(android.view.View view) {
            if (f21782d && view.isAttachedToWindow()) {
                try {
                    java.lang.Object obj = f21779a.get(view.getRootView());
                    if (obj != null) {
                        android.graphics.Rect rect = (android.graphics.Rect) f21780b.get(obj);
                        android.graphics.Rect rect2 = (android.graphics.Rect) f21781c.get(obj);
                        if (rect != null && rect2 != null) {
                            androidx.core.view.C2038y0 c2038y0A = new androidx.core.view.C2038y0.b().c(androidx.core.graphics.f.c(rect)).d(androidx.core.graphics.f.c(rect2)).a();
                            c2038y0A.t(c2038y0A);
                            c2038y0A.d(view.getRootView());
                            return c2038y0A;
                        }
                    }
                } catch (java.lang.IllegalAccessException e6) {
                    java.lang.String str = "Failed to get insets from AttachInfo. " + e6.getMessage();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.view.C2038y0.f f21783a;

        public b() {
            int i6 = android.os.Build.VERSION.SDK_INT;
            this.f21783a = i6 >= 30 ? new androidx.core.view.C2038y0.e() : i6 >= 29 ? new androidx.core.view.C2038y0.d() : new androidx.core.view.C2038y0.c();
        }

        public b(androidx.core.view.C2038y0 c2038y0) {
            int i6 = android.os.Build.VERSION.SDK_INT;
            this.f21783a = i6 >= 30 ? new androidx.core.view.C2038y0.e(c2038y0) : i6 >= 29 ? new androidx.core.view.C2038y0.d(c2038y0) : new androidx.core.view.C2038y0.c(c2038y0);
        }

        public androidx.core.view.C2038y0 a() {
            return this.f21783a.b();
        }

        public androidx.core.view.C2038y0.b b(int i6, androidx.core.graphics.f fVar) {
            this.f21783a.c(i6, fVar);
            return this;
        }

        public androidx.core.view.C2038y0.b c(androidx.core.graphics.f fVar) {
            this.f21783a.e(fVar);
            return this;
        }

        public androidx.core.view.C2038y0.b d(androidx.core.graphics.f fVar) {
            this.f21783a.g(fVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$c */
    private static class c extends androidx.core.view.C2038y0.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static java.lang.reflect.Field f21784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f21785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static java.lang.reflect.Constructor f21786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f21787h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.view.WindowInsets f21788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.f f21789d;

        c() {
            this.f21788c = i();
        }

        c(androidx.core.view.C2038y0 c2038y0) {
            super(c2038y0);
            this.f21788c = c2038y0.v();
        }

        private static android.view.WindowInsets i() {
            if (!f21785f) {
                try {
                    f21784e = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (java.lang.ReflectiveOperationException e6) {
                }
                f21785f = true;
            }
            java.lang.reflect.Field field = f21784e;
            if (field != null) {
                try {
                    android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new android.view.WindowInsets(windowInsets);
                    }
                } catch (java.lang.ReflectiveOperationException e10) {
                }
            }
            if (!f21787h) {
                try {
                    f21786g = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
                } catch (java.lang.ReflectiveOperationException e11) {
                }
                f21787h = true;
            }
            java.lang.reflect.Constructor constructor = f21786g;
            if (constructor != null) {
                try {
                    return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
                } catch (java.lang.ReflectiveOperationException e12) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.C2038y0.f
        androidx.core.view.C2038y0 b() {
            a();
            androidx.core.view.C2038y0 c2038y0W = androidx.core.view.C2038y0.w(this.f21788c);
            c2038y0W.r(this.f21792b);
            c2038y0W.u(this.f21789d);
            return c2038y0W;
        }

        @Override // androidx.core.view.C2038y0.f
        void e(androidx.core.graphics.f fVar) {
            this.f21789d = fVar;
        }

        @Override // androidx.core.view.C2038y0.f
        void g(androidx.core.graphics.f fVar) {
            android.view.WindowInsets windowInsets = this.f21788c;
            if (windowInsets != null) {
                this.f21788c = windowInsets.replaceSystemWindowInsets(fVar.f21550a, fVar.f21551b, fVar.f21552c, fVar.f21553d);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$d */
    private static class d extends androidx.core.view.C2038y0.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final android.view.WindowInsets.Builder f21790c;

        d() {
            this.f21790c = p252z1.g.a();
        }

        d(androidx.core.view.C2038y0 c2038y0) {
            super(c2038y0);
            android.view.WindowInsets windowInsetsV = c2038y0.v();
            this.f21790c = windowInsetsV != null ? androidx.core.view.E0.a(windowInsetsV) : p252z1.g.a();
        }

        @Override // androidx.core.view.C2038y0.f
        androidx.core.view.C2038y0 b() {
            a();
            androidx.core.view.C2038y0 c2038y0W = androidx.core.view.C2038y0.w(this.f21790c.build());
            c2038y0W.r(this.f21792b);
            return c2038y0W;
        }

        @Override // androidx.core.view.C2038y0.f
        void d(androidx.core.graphics.f fVar) {
            this.f21790c.setMandatorySystemGestureInsets(fVar.e());
        }

        @Override // androidx.core.view.C2038y0.f
        void e(androidx.core.graphics.f fVar) {
            this.f21790c.setStableInsets(fVar.e());
        }

        @Override // androidx.core.view.C2038y0.f
        void f(androidx.core.graphics.f fVar) {
            this.f21790c.setSystemGestureInsets(fVar.e());
        }

        @Override // androidx.core.view.C2038y0.f
        void g(androidx.core.graphics.f fVar) {
            this.f21790c.setSystemWindowInsets(fVar.e());
        }

        @Override // androidx.core.view.C2038y0.f
        void h(androidx.core.graphics.f fVar) {
            this.f21790c.setTappableElementInsets(fVar.e());
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$e */
    private static class e extends androidx.core.view.C2038y0.d {
        e() {
        }

        e(androidx.core.view.C2038y0 c2038y0) {
            super(c2038y0);
        }

        @Override // androidx.core.view.C2038y0.f
        void c(int i6, androidx.core.graphics.f fVar) {
            this.f21790c.setInsets(androidx.core.view.C2038y0.n.a(i6), fVar.e());
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$f */
    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.view.C2038y0 f21791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.f[] f21792b;

        f() {
            this(new androidx.core.view.C2038y0((androidx.core.view.C2038y0) null));
        }

        f(androidx.core.view.C2038y0 c2038y0) {
            this.f21791a = c2038y0;
        }

        protected final void a() {
            androidx.core.graphics.f[] fVarArr = this.f21792b;
            if (fVarArr != null) {
                androidx.core.graphics.f fVarF = fVarArr[androidx.core.view.C2038y0.m.d(1)];
                androidx.core.graphics.f fVarF2 = this.f21792b[androidx.core.view.C2038y0.m.d(2)];
                if (fVarF2 == null) {
                    fVarF2 = this.f21791a.f(2);
                }
                if (fVarF == null) {
                    fVarF = this.f21791a.f(1);
                }
                g(androidx.core.graphics.f.a(fVarF, fVarF2));
                androidx.core.graphics.f fVar = this.f21792b[androidx.core.view.C2038y0.m.d(16)];
                if (fVar != null) {
                    f(fVar);
                }
                androidx.core.graphics.f fVar2 = this.f21792b[androidx.core.view.C2038y0.m.d(32)];
                if (fVar2 != null) {
                    d(fVar2);
                }
                androidx.core.graphics.f fVar3 = this.f21792b[androidx.core.view.C2038y0.m.d(64)];
                if (fVar3 != null) {
                    h(fVar3);
                }
            }
        }

        abstract androidx.core.view.C2038y0 b();

        void c(int i6, androidx.core.graphics.f fVar) {
            if (this.f21792b == null) {
                this.f21792b = new androidx.core.graphics.f[9];
            }
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i6 & i10) != 0) {
                    this.f21792b[androidx.core.view.C2038y0.m.d(i10)] = fVar;
                }
            }
        }

        void d(androidx.core.graphics.f fVar) {
        }

        abstract void e(androidx.core.graphics.f fVar);

        void f(androidx.core.graphics.f fVar) {
        }

        abstract void g(androidx.core.graphics.f fVar);

        void h(androidx.core.graphics.f fVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$g */
    private static class g extends androidx.core.view.C2038y0.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f21793h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static java.lang.reflect.Method f21794i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static java.lang.Class f21795j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static java.lang.reflect.Field f21796k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static java.lang.reflect.Field f21797l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final android.view.WindowInsets f21798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.f[] f21799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.f f21800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.core.view.C2038y0 f21801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.f f21802g;

        g(androidx.core.view.C2038y0 c2038y0, android.view.WindowInsets windowInsets) {
            super(c2038y0);
            this.f21800e = null;
            this.f21798c = windowInsets;
        }

        g(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0.g gVar) {
            this(c2038y0, new android.view.WindowInsets(gVar.f21798c));
        }

        @android.annotation.SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f21794i = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
                f21795j = cls;
                f21796k = cls.getDeclaredField("mVisibleInsets");
                f21797l = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f21796k.setAccessible(true);
                f21797l.setAccessible(true);
            } catch (java.lang.ReflectiveOperationException e6) {
                java.lang.String str = "Failed to get visible insets. (Reflection error). " + e6.getMessage();
            }
            f21793h = true;
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        private androidx.core.graphics.f v(int i6, boolean z6) {
            androidx.core.graphics.f fVarA = androidx.core.graphics.f.f21549e;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i6 & i10) != 0) {
                    fVarA = androidx.core.graphics.f.a(fVarA, w(i10, z6));
                }
            }
            return fVarA;
        }

        private androidx.core.graphics.f x() {
            androidx.core.view.C2038y0 c2038y0 = this.f21801f;
            return c2038y0 != null ? c2038y0.h() : androidx.core.graphics.f.f21549e;
        }

        private androidx.core.graphics.f y(android.view.View view) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f21793h) {
                A();
            }
            java.lang.reflect.Method method = f21794i;
            if (method != null && f21795j != null && f21796k != null) {
                try {
                    java.lang.Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        new java.lang.NullPointerException();
                        return null;
                    }
                    android.graphics.Rect rect = (android.graphics.Rect) f21796k.get(f21797l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.f.c(rect);
                    }
                    return null;
                } catch (java.lang.ReflectiveOperationException e6) {
                    java.lang.String str = "Failed to get visible insets. (Reflection error). " + e6.getMessage();
                }
            }
            return null;
        }

        @Override // androidx.core.view.C2038y0.l
        void d(android.view.View view) {
            androidx.core.graphics.f fVarY = y(view);
            if (fVarY == null) {
                fVarY = androidx.core.graphics.f.f21549e;
            }
            s(fVarY);
        }

        @Override // androidx.core.view.C2038y0.l
        void e(androidx.core.view.C2038y0 c2038y0) {
            c2038y0.t(this.f21801f);
            c2038y0.s(this.f21802g);
        }

        @Override // androidx.core.view.C2038y0.l
        public boolean equals(java.lang.Object obj) {
            if (super.equals(obj)) {
                return j$.util.Objects.equals(this.f21802g, ((androidx.core.view.C2038y0.g) obj).f21802g);
            }
            return false;
        }

        @Override // androidx.core.view.C2038y0.l
        public androidx.core.graphics.f g(int i6) {
            return v(i6, false);
        }

        @Override // androidx.core.view.C2038y0.l
        public androidx.core.graphics.f h(int i6) {
            return v(i6, true);
        }

        @Override // androidx.core.view.C2038y0.l
        final androidx.core.graphics.f l() {
            if (this.f21800e == null) {
                this.f21800e = androidx.core.graphics.f.b(this.f21798c.getSystemWindowInsetLeft(), this.f21798c.getSystemWindowInsetTop(), this.f21798c.getSystemWindowInsetRight(), this.f21798c.getSystemWindowInsetBottom());
            }
            return this.f21800e;
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.view.C2038y0 n(int i6, int i10, int i11, int i12) {
            androidx.core.view.C2038y0.b bVar = new androidx.core.view.C2038y0.b(androidx.core.view.C2038y0.w(this.f21798c));
            bVar.d(androidx.core.view.C2038y0.n(l(), i6, i10, i11, i12));
            bVar.c(androidx.core.view.C2038y0.n(j(), i6, i10, i11, i12));
            return bVar.a();
        }

        @Override // androidx.core.view.C2038y0.l
        boolean p() {
            return this.f21798c.isRound();
        }

        @Override // androidx.core.view.C2038y0.l
        @android.annotation.SuppressLint({"WrongConstant"})
        boolean q(int i6) {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i6 & i10) != 0 && !z(i10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.C2038y0.l
        public void r(androidx.core.graphics.f[] fVarArr) {
            this.f21799d = fVarArr;
        }

        @Override // androidx.core.view.C2038y0.l
        void s(androidx.core.graphics.f fVar) {
            this.f21802g = fVar;
        }

        @Override // androidx.core.view.C2038y0.l
        void t(androidx.core.view.C2038y0 c2038y0) {
            this.f21801f = c2038y0;
        }

        protected androidx.core.graphics.f w(int i6, boolean z6) {
            androidx.core.graphics.f fVarH;
            int i10;
            if (i6 == 1) {
                return z6 ? androidx.core.graphics.f.b(0, java.lang.Math.max(x().f21551b, l().f21551b), 0, 0) : androidx.core.graphics.f.b(0, l().f21551b, 0, 0);
            }
            if (i6 == 2) {
                if (z6) {
                    androidx.core.graphics.f fVarX = x();
                    androidx.core.graphics.f fVarJ = j();
                    return androidx.core.graphics.f.b(java.lang.Math.max(fVarX.f21550a, fVarJ.f21550a), 0, java.lang.Math.max(fVarX.f21552c, fVarJ.f21552c), java.lang.Math.max(fVarX.f21553d, fVarJ.f21553d));
                }
                androidx.core.graphics.f fVarL = l();
                androidx.core.view.C2038y0 c2038y0 = this.f21801f;
                fVarH = c2038y0 != null ? c2038y0.h() : null;
                int iMin = fVarL.f21553d;
                if (fVarH != null) {
                    iMin = java.lang.Math.min(iMin, fVarH.f21553d);
                }
                return androidx.core.graphics.f.b(fVarL.f21550a, 0, fVarL.f21552c, iMin);
            }
            if (i6 != 8) {
                if (i6 == 16) {
                    return k();
                }
                if (i6 == 32) {
                    return i();
                }
                if (i6 == 64) {
                    return m();
                }
                if (i6 != 128) {
                    return androidx.core.graphics.f.f21549e;
                }
                androidx.core.view.C2038y0 c2038y1 = this.f21801f;
                androidx.core.view.r rVarE = c2038y1 != null ? c2038y1.e() : f();
                return rVarE != null ? androidx.core.graphics.f.b(rVarE.b(), rVarE.d(), rVarE.c(), rVarE.a()) : androidx.core.graphics.f.f21549e;
            }
            androidx.core.graphics.f[] fVarArr = this.f21799d;
            fVarH = fVarArr != null ? fVarArr[androidx.core.view.C2038y0.m.d(8)] : null;
            if (fVarH != null) {
                return fVarH;
            }
            androidx.core.graphics.f fVarL2 = l();
            androidx.core.graphics.f fVarX2 = x();
            int i11 = fVarL2.f21553d;
            if (i11 > fVarX2.f21553d) {
                return androidx.core.graphics.f.b(0, 0, 0, i11);
            }
            androidx.core.graphics.f fVar = this.f21802g;
            return (fVar == null || fVar.equals(androidx.core.graphics.f.f21549e) || (i10 = this.f21802g.f21553d) <= fVarX2.f21553d) ? androidx.core.graphics.f.f21549e : androidx.core.graphics.f.b(0, 0, 0, i10);
        }

        protected boolean z(int i6) {
            if (i6 != 1 && i6 != 2) {
                if (i6 == 4) {
                    return false;
                }
                if (i6 != 8 && i6 != 128) {
                    return true;
                }
            }
            return !w(i6, false).equals(androidx.core.graphics.f.f21549e);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$h */
    private static class h extends androidx.core.view.C2038y0.g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.f f21803m;

        h(androidx.core.view.C2038y0 c2038y0, android.view.WindowInsets windowInsets) {
            super(c2038y0, windowInsets);
            this.f21803m = null;
        }

        h(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0.h hVar) {
            super(c2038y0, hVar);
            this.f21803m = null;
            this.f21803m = hVar.f21803m;
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.view.C2038y0 b() {
            return androidx.core.view.C2038y0.w(this.f21798c.consumeStableInsets());
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.view.C2038y0 c() {
            return androidx.core.view.C2038y0.w(this.f21798c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C2038y0.l
        final androidx.core.graphics.f j() {
            if (this.f21803m == null) {
                this.f21803m = androidx.core.graphics.f.b(this.f21798c.getStableInsetLeft(), this.f21798c.getStableInsetTop(), this.f21798c.getStableInsetRight(), this.f21798c.getStableInsetBottom());
            }
            return this.f21803m;
        }

        @Override // androidx.core.view.C2038y0.l
        boolean o() {
            return this.f21798c.isConsumed();
        }

        @Override // androidx.core.view.C2038y0.l
        public void u(androidx.core.graphics.f fVar) {
            this.f21803m = fVar;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$i */
    private static class i extends androidx.core.view.C2038y0.h {
        i(androidx.core.view.C2038y0 c2038y0, android.view.WindowInsets windowInsets) {
            super(c2038y0, windowInsets);
        }

        i(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0.i iVar) {
            super(c2038y0, iVar);
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.view.C2038y0 a() {
            return androidx.core.view.C2038y0.w(this.f21798c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C2038y0.g, androidx.core.view.C2038y0.l
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.C2038y0.i)) {
                return false;
            }
            androidx.core.view.C2038y0.i iVar = (androidx.core.view.C2038y0.i) obj;
            return j$.util.Objects.equals(this.f21798c, iVar.f21798c) && j$.util.Objects.equals(this.f21802g, iVar.f21802g);
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.view.r f() {
            return androidx.core.view.r.f(this.f21798c.getDisplayCutout());
        }

        @Override // androidx.core.view.C2038y0.l
        public int hashCode() {
            return this.f21798c.hashCode();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$j */
    private static class j extends androidx.core.view.C2038y0.i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.f f21804n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.f f21805o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.f f21806p;

        j(androidx.core.view.C2038y0 c2038y0, android.view.WindowInsets windowInsets) {
            super(c2038y0, windowInsets);
            this.f21804n = null;
            this.f21805o = null;
            this.f21806p = null;
        }

        j(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0.j jVar) {
            super(c2038y0, jVar);
            this.f21804n = null;
            this.f21805o = null;
            this.f21806p = null;
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.graphics.f i() {
            if (this.f21805o == null) {
                this.f21805o = androidx.core.graphics.f.d(this.f21798c.getMandatorySystemGestureInsets());
            }
            return this.f21805o;
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.graphics.f k() {
            if (this.f21804n == null) {
                this.f21804n = androidx.core.graphics.f.d(this.f21798c.getSystemGestureInsets());
            }
            return this.f21804n;
        }

        @Override // androidx.core.view.C2038y0.l
        androidx.core.graphics.f m() {
            if (this.f21806p == null) {
                this.f21806p = androidx.core.graphics.f.d(this.f21798c.getTappableElementInsets());
            }
            return this.f21806p;
        }

        @Override // androidx.core.view.C2038y0.g, androidx.core.view.C2038y0.l
        androidx.core.view.C2038y0 n(int i6, int i10, int i11, int i12) {
            return androidx.core.view.C2038y0.w(this.f21798c.inset(i6, i10, i11, i12));
        }

        @Override // androidx.core.view.C2038y0.h, androidx.core.view.C2038y0.l
        public void u(androidx.core.graphics.f fVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$k */
    private static class k extends androidx.core.view.C2038y0.j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final androidx.core.view.C2038y0 f21807q = androidx.core.view.C2038y0.w(android.view.WindowInsets.CONSUMED);

        k(androidx.core.view.C2038y0 c2038y0, android.view.WindowInsets windowInsets) {
            super(c2038y0, windowInsets);
        }

        k(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0.k kVar) {
            super(c2038y0, kVar);
        }

        @Override // androidx.core.view.C2038y0.g, androidx.core.view.C2038y0.l
        final void d(android.view.View view) {
        }

        @Override // androidx.core.view.C2038y0.g, androidx.core.view.C2038y0.l
        public androidx.core.graphics.f g(int i6) {
            return androidx.core.graphics.f.d(this.f21798c.getInsets(androidx.core.view.C2038y0.n.a(i6)));
        }

        @Override // androidx.core.view.C2038y0.g, androidx.core.view.C2038y0.l
        public androidx.core.graphics.f h(int i6) {
            return androidx.core.graphics.f.d(this.f21798c.getInsetsIgnoringVisibility(androidx.core.view.C2038y0.n.a(i6)));
        }

        @Override // androidx.core.view.C2038y0.g, androidx.core.view.C2038y0.l
        public boolean q(int i6) {
            return this.f21798c.isVisible(androidx.core.view.C2038y0.n.a(i6));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$l */
    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final androidx.core.view.C2038y0 f21808b = new androidx.core.view.C2038y0.b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.view.C2038y0 f21809a;

        l(androidx.core.view.C2038y0 c2038y0) {
            this.f21809a = c2038y0;
        }

        androidx.core.view.C2038y0 a() {
            return this.f21809a;
        }

        androidx.core.view.C2038y0 b() {
            return this.f21809a;
        }

        androidx.core.view.C2038y0 c() {
            return this.f21809a;
        }

        void d(android.view.View view) {
        }

        void e(androidx.core.view.C2038y0 c2038y0) {
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.C2038y0.l)) {
                return false;
            }
            androidx.core.view.C2038y0.l lVar = (androidx.core.view.C2038y0.l) obj;
            return p() == lVar.p() && o() == lVar.o() && B1.c.a(l(), lVar.l()) && B1.c.a(j(), lVar.j()) && B1.c.a(f(), lVar.f());
        }

        androidx.core.view.r f() {
            return null;
        }

        androidx.core.graphics.f g(int i6) {
            return androidx.core.graphics.f.f21549e;
        }

        androidx.core.graphics.f h(int i6) {
            if ((i6 & 8) == 0) {
                return androidx.core.graphics.f.f21549e;
            }
            throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return B1.c.b(java.lang.Boolean.valueOf(p()), java.lang.Boolean.valueOf(o()), l(), j(), f());
        }

        androidx.core.graphics.f i() {
            return l();
        }

        androidx.core.graphics.f j() {
            return androidx.core.graphics.f.f21549e;
        }

        androidx.core.graphics.f k() {
            return l();
        }

        androidx.core.graphics.f l() {
            return androidx.core.graphics.f.f21549e;
        }

        androidx.core.graphics.f m() {
            return l();
        }

        androidx.core.view.C2038y0 n(int i6, int i10, int i11, int i12) {
            return f21808b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i6) {
            return true;
        }

        public void r(androidx.core.graphics.f[] fVarArr) {
        }

        void s(androidx.core.graphics.f fVar) {
        }

        void t(androidx.core.view.C2038y0 c2038y0) {
        }

        public void u(androidx.core.graphics.f fVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$m */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i6) {
            if (i6 == 1) {
                return 0;
            }
            if (i6 == 2) {
                return 1;
            }
            if (i6 == 4) {
                return 2;
            }
            if (i6 == 8) {
                return 3;
            }
            if (i6 == 16) {
                return 4;
            }
            if (i6 == 32) {
                return 5;
            }
            if (i6 == 64) {
                return 6;
            }
            if (i6 == 128) {
                return 7;
            }
            if (i6 == 256) {
                return 8;
            }
            throw new java.lang.IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i6);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y0$n */
    private static final class n {
        static int a(int i6) {
            int iStatusBars;
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i6 & i11) != 0) {
                    if (i11 == 1) {
                        iStatusBars = android.view.WindowInsets.Type.statusBars();
                    } else if (i11 == 2) {
                        iStatusBars = android.view.WindowInsets.Type.navigationBars();
                    } else if (i11 == 4) {
                        iStatusBars = android.view.WindowInsets.Type.captionBar();
                    } else if (i11 == 8) {
                        iStatusBars = android.view.WindowInsets.Type.ime();
                    } else if (i11 == 16) {
                        iStatusBars = android.view.WindowInsets.Type.systemGestures();
                    } else if (i11 == 32) {
                        iStatusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                    } else if (i11 == 64) {
                        iStatusBars = android.view.WindowInsets.Type.tappableElement();
                    } else if (i11 == 128) {
                        iStatusBars = android.view.WindowInsets.Type.displayCutout();
                    }
                    i10 |= iStatusBars;
                }
            }
            return i10;
        }
    }

    static {
        f21777b = android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.view.C2038y0.k.f21807q : androidx.core.view.C2038y0.l.f21808b;
    }

    private C2038y0(android.view.WindowInsets windowInsets) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        this.f21778a = i6 >= 30 ? new androidx.core.view.C2038y0.k(this, windowInsets) : i6 >= 29 ? new androidx.core.view.C2038y0.j(this, windowInsets) : i6 >= 28 ? new androidx.core.view.C2038y0.i(this, windowInsets) : new androidx.core.view.C2038y0.h(this, windowInsets);
    }

    public C2038y0(androidx.core.view.C2038y0 c2038y0) {
        if (c2038y0 == null) {
            this.f21778a = new androidx.core.view.C2038y0.l(this);
            return;
        }
        androidx.core.view.C2038y0.l lVar = c2038y0.f21778a;
        int i6 = android.os.Build.VERSION.SDK_INT;
        this.f21778a = (i6 < 30 || !(lVar instanceof androidx.core.view.C2038y0.k)) ? (i6 < 29 || !(lVar instanceof androidx.core.view.C2038y0.j)) ? (i6 < 28 || !(lVar instanceof androidx.core.view.C2038y0.i)) ? lVar instanceof androidx.core.view.C2038y0.h ? new androidx.core.view.C2038y0.h(this, (androidx.core.view.C2038y0.h) lVar) : lVar instanceof androidx.core.view.C2038y0.g ? new androidx.core.view.C2038y0.g(this, (androidx.core.view.C2038y0.g) lVar) : new androidx.core.view.C2038y0.l(this) : new androidx.core.view.C2038y0.i(this, (androidx.core.view.C2038y0.i) lVar) : new androidx.core.view.C2038y0.j(this, (androidx.core.view.C2038y0.j) lVar) : new androidx.core.view.C2038y0.k(this, (androidx.core.view.C2038y0.k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.f n(androidx.core.graphics.f fVar, int i6, int i10, int i11, int i12) {
        int iMax = java.lang.Math.max(0, fVar.f21550a - i6);
        int iMax2 = java.lang.Math.max(0, fVar.f21551b - i10);
        int iMax3 = java.lang.Math.max(0, fVar.f21552c - i11);
        int iMax4 = java.lang.Math.max(0, fVar.f21553d - i12);
        return (iMax == i6 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? fVar : androidx.core.graphics.f.b(iMax, iMax2, iMax3, iMax4);
    }

    public static androidx.core.view.C2038y0 w(android.view.WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static androidx.core.view.C2038y0 x(android.view.WindowInsets windowInsets, android.view.View view) {
        androidx.core.view.C2038y0 c2038y0 = new androidx.core.view.C2038y0((android.view.WindowInsets) B1.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c2038y0.t(androidx.core.view.X.F(view));
            c2038y0.d(view.getRootView());
        }
        return c2038y0;
    }

    public androidx.core.view.C2038y0 a() {
        return this.f21778a.a();
    }

    public androidx.core.view.C2038y0 b() {
        return this.f21778a.b();
    }

    public androidx.core.view.C2038y0 c() {
        return this.f21778a.c();
    }

    void d(android.view.View view) {
        this.f21778a.d(view);
    }

    public androidx.core.view.r e() {
        return this.f21778a.f();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.view.C2038y0) {
            return B1.c.a(this.f21778a, ((androidx.core.view.C2038y0) obj).f21778a);
        }
        return false;
    }

    public androidx.core.graphics.f f(int i6) {
        return this.f21778a.g(i6);
    }

    public androidx.core.graphics.f g(int i6) {
        return this.f21778a.h(i6);
    }

    public androidx.core.graphics.f h() {
        return this.f21778a.j();
    }

    public int hashCode() {
        androidx.core.view.C2038y0.l lVar = this.f21778a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f21778a.l().f21553d;
    }

    public int j() {
        return this.f21778a.l().f21550a;
    }

    public int k() {
        return this.f21778a.l().f21552c;
    }

    public int l() {
        return this.f21778a.l().f21551b;
    }

    public androidx.core.view.C2038y0 m(int i6, int i10, int i11, int i12) {
        return this.f21778a.n(i6, i10, i11, i12);
    }

    public boolean o() {
        return this.f21778a.o();
    }

    public boolean p(int i6) {
        return this.f21778a.q(i6);
    }

    public androidx.core.view.C2038y0 q(int i6, int i10, int i11, int i12) {
        return new androidx.core.view.C2038y0.b(this).d(androidx.core.graphics.f.b(i6, i10, i11, i12)).a();
    }

    void r(androidx.core.graphics.f[] fVarArr) {
        this.f21778a.r(fVarArr);
    }

    void s(androidx.core.graphics.f fVar) {
        this.f21778a.s(fVar);
    }

    void t(androidx.core.view.C2038y0 c2038y0) {
        this.f21778a.t(c2038y0);
    }

    void u(androidx.core.graphics.f fVar) {
        this.f21778a.u(fVar);
    }

    public android.view.WindowInsets v() {
        androidx.core.view.C2038y0.l lVar = this.f21778a;
        if (lVar instanceof androidx.core.view.C2038y0.g) {
            return ((androidx.core.view.C2038y0.g) lVar).f21798c;
        }
        return null;
    }
}
