package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1905k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final android.graphics.PorterDuff.Mode f18517b = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static androidx.appcompat.widget.C1905k f18518c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.appcompat.widget.T f18519a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a implements androidx.appcompat.widget.T.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f18520a = {p090j.e.f48689R, p090j.e.f48687P, p090j.e.f48691a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f18521b = {p090j.e.f48705o, p090j.e.f48673B, p090j.e.f48710t, p090j.e.f48706p, p090j.e.f48707q, p090j.e.f48709s, p090j.e.f48708r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f18522c = {p090j.e.f48686O, p090j.e.f48688Q, p090j.e.f48701k, p090j.e.f48682K, p090j.e.f48683L, p090j.e.f48684M, p090j.e.f48685N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f18523d = {p090j.e.f48713w, p090j.e.f48699i, p090j.e.f48712v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f18524e = {p090j.e.f48681J, p090j.e.f48690S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f18525f = {p090j.e.f48693c, p090j.e.f48697g, p090j.e.f48694d, p090j.e.f48698h};

        a() {
        }

        private boolean f(int[] iArr, int i6) {
            for (int i10 : iArr) {
                if (i10 == i6) {
                    return true;
                }
            }
            return false;
        }

        private android.content.res.ColorStateList g(android.content.Context context) {
            return h(context, 0);
        }

        private android.content.res.ColorStateList h(android.content.Context context, int i6) {
            int iC = androidx.appcompat.widget.Y.c(context, p090j.a.f48643t);
            return new android.content.res.ColorStateList(new int[][]{androidx.appcompat.widget.Y.f18395b, androidx.appcompat.widget.Y.f18398e, androidx.appcompat.widget.Y.f18396c, androidx.appcompat.widget.Y.f18402i}, new int[]{androidx.appcompat.widget.Y.b(context, p090j.a.f48641r), androidx.core.graphics.a.g(iC, i6), androidx.core.graphics.a.g(iC, i6), i6});
        }

        private android.content.res.ColorStateList i(android.content.Context context) {
            return h(context, androidx.appcompat.widget.Y.c(context, p090j.a.f48640q));
        }

        private android.content.res.ColorStateList j(android.content.Context context) {
            return h(context, androidx.appcompat.widget.Y.c(context, p090j.a.f48641r));
        }

        private android.content.res.ColorStateList k(android.content.Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            android.content.res.ColorStateList colorStateListE = androidx.appcompat.widget.Y.e(context, p090j.a.f48645v);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = androidx.appcompat.widget.Y.f18395b;
                iArr2[0] = androidx.appcompat.widget.Y.b(context, p090j.a.f48645v);
                iArr[1] = androidx.appcompat.widget.Y.f18399f;
                iArr2[1] = androidx.appcompat.widget.Y.c(context, p090j.a.f48642s);
                iArr[2] = androidx.appcompat.widget.Y.f18402i;
                iArr2[2] = androidx.appcompat.widget.Y.c(context, p090j.a.f48645v);
            } else {
                int[] iArr3 = androidx.appcompat.widget.Y.f18395b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = androidx.appcompat.widget.Y.f18399f;
                iArr2[1] = androidx.appcompat.widget.Y.c(context, p090j.a.f48642s);
                iArr[2] = androidx.appcompat.widget.Y.f18402i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new android.content.res.ColorStateList(iArr, iArr2);
        }

        private android.graphics.drawable.LayerDrawable l(androidx.appcompat.widget.T t6, android.content.Context context, int i6) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable;
            android.graphics.drawable.BitmapDrawable bitmapDrawable2;
            android.graphics.drawable.BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
            android.graphics.drawable.Drawable drawableJ = t6.j(context, p090j.e.f48677F);
            android.graphics.drawable.Drawable drawableJ2 = t6.j(context, p090j.e.f48678G);
            if ((drawableJ instanceof android.graphics.drawable.BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawableJ;
                bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof android.graphics.drawable.BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawableJ2;
            } else {
                android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap2);
            }
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        private void m(android.graphics.drawable.Drawable drawable, int i6, android.graphics.PorterDuff.Mode mode) {
            if (androidx.appcompat.widget.K.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = androidx.appcompat.widget.C1905k.f18517b;
            }
            drawable.setColorFilter(androidx.appcompat.widget.C1905k.e(i6, mode));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x0068  */
        /* JADX WARN: Code duplicated, block: B:29:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.T.f
        public boolean a(android.content.Context context, int i6, android.graphics.drawable.Drawable drawable) {
            int i10;
            boolean z6;
            int iRound;
            android.graphics.PorterDuff.Mode mode = androidx.appcompat.widget.C1905k.f18517b;
            if (!f(this.f18520a, i6)) {
                if (f(this.f18522c, i6)) {
                    i10 = p090j.a.f48642s;
                } else {
                    if (f(this.f18523d, i6)) {
                        mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                    } else if (i6 == p090j.e.f48711u) {
                        z6 = true;
                        iRound = java.lang.Math.round(40.8f);
                        i10 = 16842800;
                        mode = mode;
                    } else if (i6 != p090j.e.f48702l) {
                        i10 = 0;
                        z6 = false;
                        iRound = -1;
                    }
                    mode = mode;
                    iRound = -1;
                    i10 = 16842801;
                    z6 = true;
                }
                if (z6) {
                    return false;
                }
                if (androidx.appcompat.widget.K.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(androidx.appcompat.widget.C1905k.e(androidx.appcompat.widget.Y.c(context, i10), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                return true;
            }
            i10 = p090j.a.f48644u;
            z6 = true;
            iRound = -1;
            if (z6) {
                return false;
            }
            if (androidx.appcompat.widget.K.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(androidx.appcompat.widget.C1905k.e(androidx.appcompat.widget.Y.c(context, i10), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.T.f
        public android.graphics.PorterDuff.Mode b(int i6) {
            if (i6 == p090j.e.f48679H) {
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.T.f
        public android.graphics.drawable.Drawable c(androidx.appcompat.widget.T t6, android.content.Context context, int i6) {
            int i10;
            if (i6 == p090j.e.f48700j) {
                return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{t6.j(context, p090j.e.f48699i), t6.j(context, p090j.e.f48701k)});
            }
            if (i6 == p090j.e.f48715y) {
                i10 = p090j.d.f48665g;
            } else if (i6 == p090j.e.f48714x) {
                i10 = p090j.d.f48666h;
            } else {
                if (i6 != p090j.e.f48716z) {
                    return null;
                }
                i10 = p090j.d.f48667i;
            }
            return l(t6, context, i10);
        }

        @Override // androidx.appcompat.widget.T.f
        public android.content.res.ColorStateList d(android.content.Context context, int i6) {
            if (i6 == p090j.e.f48703m) {
                return p100k.a.a(context, p090j.c.f48655e);
            }
            if (i6 == p090j.e.f48680I) {
                return p100k.a.a(context, p090j.c.f48658h);
            }
            if (i6 == p090j.e.f48679H) {
                return k(context);
            }
            if (i6 == p090j.e.f48696f) {
                return j(context);
            }
            if (i6 == p090j.e.f48692b) {
                return g(context);
            }
            if (i6 == p090j.e.f48695e) {
                return i(context);
            }
            if (i6 == p090j.e.f48675D || i6 == p090j.e.f48676E) {
                return p100k.a.a(context, p090j.c.f48657g);
            }
            if (f(this.f18521b, i6)) {
                return androidx.appcompat.widget.Y.e(context, p090j.a.f48644u);
            }
            if (f(this.f18524e, i6)) {
                return p100k.a.a(context, p090j.c.f48654d);
            }
            if (f(this.f18525f, i6)) {
                return p100k.a.a(context, p090j.c.f48653c);
            }
            if (i6 == p090j.e.f48672A) {
                return p100k.a.a(context, p090j.c.f48656f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.T.f
        public boolean e(android.content.Context context, int i6, android.graphics.drawable.Drawable drawable) {
            android.graphics.drawable.LayerDrawable layerDrawable;
            android.graphics.drawable.Drawable drawableFindDrawableByLayerId;
            int i10;
            if (i6 == p090j.e.f48674C) {
                layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(android.R.id.background), androidx.appcompat.widget.Y.c(context, p090j.a.f48644u), androidx.appcompat.widget.C1905k.f18517b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress);
                i10 = p090j.a.f48644u;
            } else {
                if (i6 != p090j.e.f48715y && i6 != p090j.e.f48714x && i6 != p090j.e.f48716z) {
                    return false;
                }
                layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(android.R.id.background), androidx.appcompat.widget.Y.b(context, p090j.a.f48644u), androidx.appcompat.widget.C1905k.f18517b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress);
                i10 = p090j.a.f48642s;
            }
            m(drawableFindDrawableByLayerId, androidx.appcompat.widget.Y.c(context, i10), androidx.appcompat.widget.C1905k.f18517b);
            m(layerDrawable.findDrawableByLayerId(android.R.id.progress), androidx.appcompat.widget.Y.c(context, p090j.a.f48642s), androidx.appcompat.widget.C1905k.f18517b);
            return true;
        }
    }

    public static synchronized androidx.appcompat.widget.C1905k b() {
        try {
            if (f18518c == null) {
                g();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f18518c;
    }

    public static synchronized android.graphics.PorterDuffColorFilter e(int i6, android.graphics.PorterDuff.Mode mode) {
        return androidx.appcompat.widget.T.l(i6, mode);
    }

    public static synchronized void g() {
        if (f18518c == null) {
            androidx.appcompat.widget.C1905k c1905k = new androidx.appcompat.widget.C1905k();
            f18518c = c1905k;
            c1905k.f18519a = androidx.appcompat.widget.T.h();
            f18518c.f18519a.t(new androidx.appcompat.widget.C1905k.a());
        }
    }

    static void h(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.a0 a0Var, int[] iArr) {
        androidx.appcompat.widget.T.v(drawable, a0Var, iArr);
    }

    public synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i6) {
        return this.f18519a.j(context, i6);
    }

    synchronized android.graphics.drawable.Drawable d(android.content.Context context, int i6, boolean z6) {
        return this.f18519a.k(context, i6, z6);
    }

    synchronized android.content.res.ColorStateList f(android.content.Context context, int i6) {
        return this.f18519a.m(context, i6);
    }
}
