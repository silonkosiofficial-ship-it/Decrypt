package p110l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private l.b.d f49892C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.graphics.Rect f49893D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.graphics.drawable.Drawable f49894E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.graphics.drawable.Drawable f49895F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f49897H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f49899J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.lang.Runnable f49900K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f49901L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f49902M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private l.b.c f49903N;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f49896G = 255;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f49898I = -1;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p110l.b.this.a(true);
            p110l.b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l.b$b, reason: collision with other inner class name */
    private static class C0630b {
        public static boolean a(android.graphics.drawable.Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(android.graphics.drawable.Drawable drawable, android.graphics.Outline outline) {
            drawable.getOutline(outline);
        }

        public static android.content.res.Resources c(android.content.res.Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private android.graphics.drawable.Drawable.Callback f49905C;

        c() {
        }

        public android.graphics.drawable.Drawable.Callback a() {
            android.graphics.drawable.Drawable.Callback callback = this.f49905C;
            this.f49905C = null;
            return callback;
        }

        public l.b.c b(android.graphics.drawable.Drawable.Callback callback) {
            this.f49905C = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j6) {
            android.graphics.drawable.Drawable.Callback callback = this.f49905C;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j6);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
            android.graphics.drawable.Drawable.Callback callback = this.f49905C;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        int f49906A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        int f49907B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f49908C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        android.graphics.ColorFilter f49909D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f49910E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        android.content.res.ColorStateList f49911F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        android.graphics.PorterDuff.Mode f49912G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        boolean f49913H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        boolean f49914I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p110l.b f49915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.content.res.Resources f49916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f49917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f49918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.util.SparseArray f49920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.graphics.drawable.Drawable[] f49921g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f49922h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f49923i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f49924j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        android.graphics.Rect f49925k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f49926l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f49927m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49928n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f49929o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f49930p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f49931q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f49932r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f49933s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f49934t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f49935u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f49936v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f49937w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f49938x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f49939y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f49940z;

        d(l.b.d dVar, p110l.b bVar, android.content.res.Resources resources) {
            this.f49923i = false;
            this.f49926l = false;
            this.f49938x = true;
            this.f49906A = 0;
            this.f49907B = 0;
            this.f49915a = bVar;
            this.f49916b = resources != null ? resources : dVar != null ? dVar.f49916b : null;
            int iF = p110l.b.f(resources, dVar != null ? dVar.f49917c : 0);
            this.f49917c = iF;
            if (dVar == null) {
                this.f49921g = new android.graphics.drawable.Drawable[10];
                this.f49922h = 0;
                return;
            }
            this.f49918d = dVar.f49918d;
            this.f49919e = dVar.f49919e;
            this.f49936v = true;
            this.f49937w = true;
            this.f49923i = dVar.f49923i;
            this.f49926l = dVar.f49926l;
            this.f49938x = dVar.f49938x;
            this.f49939y = dVar.f49939y;
            this.f49940z = dVar.f49940z;
            this.f49906A = dVar.f49906A;
            this.f49907B = dVar.f49907B;
            this.f49908C = dVar.f49908C;
            this.f49909D = dVar.f49909D;
            this.f49910E = dVar.f49910E;
            this.f49911F = dVar.f49911F;
            this.f49912G = dVar.f49912G;
            this.f49913H = dVar.f49913H;
            this.f49914I = dVar.f49914I;
            if (dVar.f49917c == iF) {
                if (dVar.f49924j) {
                    this.f49925k = dVar.f49925k != null ? new android.graphics.Rect(dVar.f49925k) : null;
                    this.f49924j = true;
                }
                if (dVar.f49927m) {
                    this.f49928n = dVar.f49928n;
                    this.f49929o = dVar.f49929o;
                    this.f49930p = dVar.f49930p;
                    this.f49931q = dVar.f49931q;
                    this.f49927m = true;
                }
            }
            if (dVar.f49932r) {
                this.f49933s = dVar.f49933s;
                this.f49932r = true;
            }
            if (dVar.f49934t) {
                this.f49935u = dVar.f49935u;
                this.f49934t = true;
            }
            android.graphics.drawable.Drawable[] drawableArr = dVar.f49921g;
            this.f49921g = new android.graphics.drawable.Drawable[drawableArr.length];
            this.f49922h = dVar.f49922h;
            android.util.SparseArray sparseArray = dVar.f49920f;
            this.f49920f = sparseArray != null ? sparseArray.clone() : new android.util.SparseArray(this.f49922h);
            int i6 = this.f49922h;
            for (int i10 = 0; i10 < i6; i10++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f49920f.put(i10, constantState);
                    } else {
                        this.f49921g[i10] = drawableArr[i10];
                    }
                }
            }
        }

        private void e() {
            android.util.SparseArray sparseArray = this.f49920f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    this.f49921g[this.f49920f.keyAt(i6)] = s(((android.graphics.drawable.Drawable.ConstantState) this.f49920f.valueAt(i6)).newDrawable(this.f49916b));
                }
                this.f49920f = null;
            }
        }

        private android.graphics.drawable.Drawable s(android.graphics.drawable.Drawable drawable) {
            androidx.core.graphics.drawable.a.m(drawable, this.f49940z);
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f49915a);
            return drawableMutate;
        }

        public final int a(android.graphics.drawable.Drawable drawable) {
            int i6 = this.f49922h;
            if (i6 >= this.f49921g.length) {
                o(i6, i6 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f49915a);
            this.f49921g[i6] = drawable;
            this.f49922h++;
            this.f49919e = drawable.getChangingConfigurations() | this.f49919e;
            p();
            this.f49925k = null;
            this.f49924j = false;
            this.f49927m = false;
            this.f49936v = false;
            return i6;
        }

        final void b(android.content.res.Resources.Theme theme) {
            if (theme != null) {
                e();
                int i6 = this.f49922h;
                android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
                for (int i10 = 0; i10 < i6; i10++) {
                    android.graphics.drawable.Drawable drawable = drawableArr[i10];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i10], theme);
                        this.f49919e |= drawableArr[i10].getChangingConfigurations();
                    }
                }
                y(p110l.b.C0630b.c(theme));
            }
        }

        public boolean c() {
            if (this.f49936v) {
                return this.f49937w;
            }
            e();
            this.f49936v = true;
            int i6 = this.f49922h;
            android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
            for (int i10 = 0; i10 < i6; i10++) {
                if (drawableArr[i10].getConstantState() == null) {
                    this.f49937w = false;
                    return false;
                }
            }
            this.f49937w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i6 = this.f49922h;
            android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
            for (int i10 = 0; i10 < i6; i10++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i10];
                if (drawable == null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) this.f49920f.get(i10);
                    if (constantState != null && p110l.b.C0630b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f49927m = true;
            e();
            int i6 = this.f49922h;
            android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
            this.f49929o = -1;
            this.f49928n = -1;
            this.f49931q = 0;
            this.f49930p = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i10];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f49928n) {
                    this.f49928n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f49929o) {
                    this.f49929o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f49930p) {
                    this.f49930p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f49931q) {
                    this.f49931q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f49921g.length;
        }

        public final android.graphics.drawable.Drawable g(int i6) {
            int iIndexOfKey;
            android.graphics.drawable.Drawable drawable = this.f49921g[i6];
            if (drawable != null) {
                return drawable;
            }
            android.util.SparseArray sparseArray = this.f49920f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i6)) < 0) {
                return null;
            }
            android.graphics.drawable.Drawable drawableS = s(((android.graphics.drawable.Drawable.ConstantState) this.f49920f.valueAt(iIndexOfKey)).newDrawable(this.f49916b));
            this.f49921g[i6] = drawableS;
            this.f49920f.removeAt(iIndexOfKey);
            if (this.f49920f.size() == 0) {
                this.f49920f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f49918d | this.f49919e;
        }

        public final int h() {
            return this.f49922h;
        }

        public final int i() {
            if (!this.f49927m) {
                d();
            }
            return this.f49929o;
        }

        public final int j() {
            if (!this.f49927m) {
                d();
            }
            return this.f49931q;
        }

        public final int k() {
            if (!this.f49927m) {
                d();
            }
            return this.f49930p;
        }

        public final android.graphics.Rect l() {
            android.graphics.Rect rect = null;
            if (this.f49923i) {
                return null;
            }
            android.graphics.Rect rect2 = this.f49925k;
            if (rect2 != null || this.f49924j) {
                return rect2;
            }
            e();
            android.graphics.Rect rect3 = new android.graphics.Rect();
            int i6 = this.f49922h;
            android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
            for (int i10 = 0; i10 < i6; i10++) {
                if (drawableArr[i10].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new android.graphics.Rect(0, 0, 0, 0);
                    }
                    int i11 = rect3.left;
                    if (i11 > rect.left) {
                        rect.left = i11;
                    }
                    int i12 = rect3.top;
                    if (i12 > rect.top) {
                        rect.top = i12;
                    }
                    int i13 = rect3.right;
                    if (i13 > rect.right) {
                        rect.right = i13;
                    }
                    int i14 = rect3.bottom;
                    if (i14 > rect.bottom) {
                        rect.bottom = i14;
                    }
                }
            }
            this.f49924j = true;
            this.f49925k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f49927m) {
                d();
            }
            return this.f49928n;
        }

        public final int n() {
            if (this.f49932r) {
                return this.f49933s;
            }
            e();
            int i6 = this.f49922h;
            android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
            int opacity = i6 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i6; i10++) {
                opacity = android.graphics.drawable.Drawable.resolveOpacity(opacity, drawableArr[i10].getOpacity());
            }
            this.f49933s = opacity;
            this.f49932r = true;
            return opacity;
        }

        public void o(int i6, int i10) {
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[i10];
            android.graphics.drawable.Drawable[] drawableArr2 = this.f49921g;
            if (drawableArr2 != null) {
                java.lang.System.arraycopy(drawableArr2, 0, drawableArr, 0, i6);
            }
            this.f49921g = drawableArr;
        }

        void p() {
            this.f49932r = false;
            this.f49934t = false;
        }

        public final boolean q() {
            return this.f49926l;
        }

        abstract void r();

        public final void t(boolean z6) {
            this.f49926l = z6;
        }

        public final void u(int i6) {
            this.f49906A = i6;
        }

        public final void v(int i6) {
            this.f49907B = i6;
        }

        final boolean w(int i6, int i10) {
            int i11 = this.f49922h;
            android.graphics.drawable.Drawable[] drawableArr = this.f49921g;
            boolean z6 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    boolean zM = androidx.core.graphics.drawable.a.m(drawable, i6);
                    if (i12 == i10) {
                        z6 = zM;
                    }
                }
            }
            this.f49940z = i6;
            return z6;
        }

        public final void x(boolean z6) {
            this.f49923i = z6;
        }

        final void y(android.content.res.Resources resources) {
            if (resources != null) {
                this.f49916b = resources;
                int iF = p110l.b.f(resources, this.f49917c);
                int i6 = this.f49917c;
                this.f49917c = iF;
                if (i6 != iF) {
                    this.f49927m = false;
                    this.f49924j = false;
                }
            }
        }
    }

    private void d(android.graphics.drawable.Drawable drawable) {
        if (this.f49903N == null) {
            this.f49903N = new l.b.c();
        }
        drawable.setCallback(this.f49903N.b(drawable.getCallback()));
        try {
            if (this.f49892C.f49906A <= 0 && this.f49897H) {
                drawable.setAlpha(this.f49896G);
            }
            l.b.d dVar = this.f49892C;
            if (dVar.f49910E) {
                drawable.setColorFilter(dVar.f49909D);
            } else {
                if (dVar.f49913H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.f49911F);
                }
                l.b.d dVar2 = this.f49892C;
                if (dVar2.f49914I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.f49912G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f49892C.f49938x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            androidx.core.graphics.drawable.a.j(drawable, this.f49892C.f49908C);
            android.graphics.Rect rect = this.f49893D;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f49903N.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(android.content.res.Resources resources, int i6) {
        if (resources != null) {
            i6 = resources.getDisplayMetrics().densityDpi;
        }
        if (i6 == 0) {
            return 160;
        }
        return i6;
    }

    void a(boolean z6) {
        boolean z10;
        boolean z11 = true;
        this.f49897H = true;
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            long j6 = this.f49901L;
            if (j6 == 0) {
                z10 = false;
            } else if (j6 <= jUptimeMillis) {
                drawable.setAlpha(this.f49896G);
                this.f49901L = 0L;
                z10 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j6 - jUptimeMillis) * 255)) / this.f49892C.f49906A)) * this.f49896G) / 255);
                z10 = true;
            }
        } else {
            this.f49901L = 0L;
            z10 = false;
        }
        android.graphics.drawable.Drawable drawable2 = this.f49895F;
        if (drawable2 != null) {
            long j10 = this.f49902M;
            if (j10 == 0) {
                z11 = z10;
            } else if (j10 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f49895F = null;
                this.f49902M = 0L;
                z11 = z10;
            } else {
                drawable2.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f49892C.f49907B) * this.f49896G) / 255);
            }
        } else {
            this.f49902M = 0L;
            z11 = z10;
        }
        if (z6 && z11) {
            scheduleSelf(this.f49900K, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        this.f49892C.b(theme);
    }

    abstract l.b.d b();

    int c() {
        return this.f49898I;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f49892C.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable2 = this.f49895F;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    boolean g(int i6) {
        if (i6 == this.f49898I) {
            return false;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.f49892C.f49907B > 0) {
            android.graphics.drawable.Drawable drawable = this.f49895F;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            android.graphics.drawable.Drawable drawable2 = this.f49894E;
            if (drawable2 != null) {
                this.f49895F = drawable2;
                this.f49902M = ((long) this.f49892C.f49907B) + jUptimeMillis;
            } else {
                this.f49895F = null;
                this.f49902M = 0L;
            }
        } else {
            android.graphics.drawable.Drawable drawable3 = this.f49894E;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i6 >= 0) {
            l.b.d dVar = this.f49892C;
            if (i6 < dVar.f49922h) {
                android.graphics.drawable.Drawable drawableG = dVar.g(i6);
                this.f49894E = drawableG;
                this.f49898I = i6;
                if (drawableG != null) {
                    int i10 = this.f49892C.f49906A;
                    if (i10 > 0) {
                        this.f49901L = jUptimeMillis + ((long) i10);
                    }
                    d(drawableG);
                }
            } else {
                this.f49894E = null;
                this.f49898I = -1;
            }
        } else {
            this.f49894E = null;
            this.f49898I = -1;
        }
        if (this.f49901L != 0 || this.f49902M != 0) {
            java.lang.Runnable runnable = this.f49900K;
            if (runnable == null) {
                this.f49900K = new l.b.a();
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49896G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f49892C.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (!this.f49892C.c()) {
            return null;
        }
        this.f49892C.f49918d = getChangingConfigurations();
        return this.f49892C;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        return this.f49894E;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f49893D;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f49892C.q()) {
            return this.f49892C.i();
        }
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f49892C.q()) {
            return this.f49892C.m();
        }
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f49892C.q()) {
            return this.f49892C.j();
        }
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f49892C.q()) {
            return this.f49892C.k();
        }
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f49892C.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            p110l.b.C0630b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        boolean padding;
        android.graphics.Rect rectL = this.f49892C.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            android.graphics.drawable.Drawable drawable = this.f49894E;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i6 = rect.left;
            rect.left = rect.right;
            rect.right = i6;
        }
        return padding;
    }

    void h(l.b.d dVar) {
        this.f49892C = dVar;
        int i6 = this.f49898I;
        if (i6 >= 0) {
            android.graphics.drawable.Drawable drawableG = dVar.g(i6);
            this.f49894E = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f49895F = null;
    }

    final void i(android.content.res.Resources resources) {
        this.f49892C.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        l.b.d dVar = this.f49892C;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f49894E || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f49892C.f49908C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z6;
        android.graphics.drawable.Drawable drawable = this.f49895F;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f49895F = null;
            z6 = true;
        } else {
            z6 = false;
        }
        android.graphics.drawable.Drawable drawable2 = this.f49894E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f49897H) {
                this.f49894E.setAlpha(this.f49896G);
            }
        }
        if (this.f49902M != 0) {
            this.f49902M = 0L;
            z6 = true;
        }
        if (this.f49901L != 0) {
            this.f49901L = 0L;
        } else {
            z10 = z6;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.f49899J && super.mutate() == this) {
            l.b.d dVarB = b();
            dVarB.r();
            h(dVarB);
            this.f49899J = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.f49895F;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        android.graphics.drawable.Drawable drawable2 = this.f49894E;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i6) {
        return this.f49892C.w(i6, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        android.graphics.drawable.Drawable drawable = this.f49895F;
        if (drawable != null) {
            return drawable.setLevel(i6);
        }
        android.graphics.drawable.Drawable drawable2 = this.f49894E;
        if (drawable2 != null) {
            return drawable2.setLevel(i6);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j6) {
        if (drawable != this.f49894E || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        if (this.f49897H && this.f49896G == i6) {
            return;
        }
        this.f49897H = true;
        this.f49896G = i6;
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            if (this.f49901L == 0) {
                drawable.setAlpha(i6);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        l.b.d dVar = this.f49892C;
        if (dVar.f49908C != z6) {
            dVar.f49908C = z6;
            android.graphics.drawable.Drawable drawable = this.f49894E;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        l.b.d dVar = this.f49892C;
        dVar.f49910E = true;
        if (dVar.f49909D != colorFilter) {
            dVar.f49909D = colorFilter;
            android.graphics.drawable.Drawable drawable = this.f49894E;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        l.b.d dVar = this.f49892C;
        if (dVar.f49938x != z6) {
            dVar.f49938x = z6;
            android.graphics.drawable.Drawable drawable = this.f49894E;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f10) {
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f6, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i6, int i10, int i11, int i12) {
        android.graphics.Rect rect = this.f49893D;
        if (rect == null) {
            this.f49893D = new android.graphics.Rect(i6, i10, i11, i12);
        } else {
            rect.set(i6, i10, i11, i12);
        }
        android.graphics.drawable.Drawable drawable = this.f49894E;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i6, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        setTintList(android.content.res.ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        l.b.d dVar = this.f49892C;
        dVar.f49913H = true;
        if (dVar.f49911F != colorStateList) {
            dVar.f49911F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f49894E, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        l.b.d dVar = this.f49892C;
        dVar.f49914I = true;
        if (dVar.f49912G != mode) {
            dVar.f49912G = mode;
            androidx.core.graphics.drawable.a.p(this.f49894E, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        android.graphics.drawable.Drawable drawable = this.f49895F;
        if (drawable != null) {
            drawable.setVisible(z6, z10);
        }
        android.graphics.drawable.Drawable drawable2 = this.f49894E;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        if (drawable != this.f49894E || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
