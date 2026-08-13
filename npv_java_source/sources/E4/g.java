package E4;

/* JADX INFO: loaded from: classes3.dex */
public class g extends android.graphics.drawable.Drawable implements E4.n {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final java.lang.String f2110Z = "g";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final android.graphics.Paint f2111a0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private E4.g.c f2112C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final E4.m.g[] f2113D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final E4.m.g[] f2114E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.BitSet f2115F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f2116G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final android.graphics.Matrix f2117H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.graphics.Path f2118I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final android.graphics.Path f2119J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final android.graphics.RectF f2120K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final android.graphics.RectF f2121L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final android.graphics.Region f2122M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final android.graphics.Region f2123N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private E4.k f2124O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.graphics.Paint f2125P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final android.graphics.Paint f2126Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final D4.a f2127R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final E4.l.b f2128S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final E4.l f2129T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private android.graphics.PorterDuffColorFilter f2130U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private android.graphics.PorterDuffColorFilter f2131V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f2132W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final android.graphics.RectF f2133X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f2134Y;

    class a implements E4.l.b {
        a() {
        }

        @Override // E4.l.b
        public void a(E4.m mVar, android.graphics.Matrix matrix, int i6) {
            E4.g.this.f2115F.set(i6 + 4, mVar.e());
            E4.g.this.f2114E[i6] = mVar.f(matrix);
        }

        @Override // E4.l.b
        public void b(E4.m mVar, android.graphics.Matrix matrix, int i6) {
            E4.g.this.f2115F.set(i6, mVar.e());
            E4.g.this.f2113D[i6] = mVar.f(matrix);
        }
    }

    class b implements E4.k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2136a;

        b(float f6) {
            this.f2136a = f6;
        }

        @Override // E4.k.c
        public E4.c a(E4.c cVar) {
            return cVar instanceof E4.i ? cVar : new E4.b(this.f2136a, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        E4.k f2138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        p215v4.a f2139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.graphics.ColorFilter f2140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.content.res.ColorStateList f2141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.content.res.ColorStateList f2142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.content.res.ColorStateList f2143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.content.res.ColorStateList f2144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        android.graphics.PorterDuff.Mode f2145h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        android.graphics.Rect f2146i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f2147j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f2148k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f2149l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f2150m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f2151n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f2152o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f2153p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2154q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2155r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2156s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f2157t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f2158u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        android.graphics.Paint.Style f2159v;

        public c(E4.g.c cVar) {
            this.f2141d = null;
            this.f2142e = null;
            this.f2143f = null;
            this.f2144g = null;
            this.f2145h = android.graphics.PorterDuff.Mode.SRC_IN;
            this.f2146i = null;
            this.f2147j = 1.0f;
            this.f2148k = 1.0f;
            this.f2150m = 255;
            this.f2151n = 0.0f;
            this.f2152o = 0.0f;
            this.f2153p = 0.0f;
            this.f2154q = 0;
            this.f2155r = 0;
            this.f2156s = 0;
            this.f2157t = 0;
            this.f2158u = false;
            this.f2159v = android.graphics.Paint.Style.FILL_AND_STROKE;
            this.f2138a = cVar.f2138a;
            this.f2139b = cVar.f2139b;
            this.f2149l = cVar.f2149l;
            this.f2140c = cVar.f2140c;
            this.f2141d = cVar.f2141d;
            this.f2142e = cVar.f2142e;
            this.f2145h = cVar.f2145h;
            this.f2144g = cVar.f2144g;
            this.f2150m = cVar.f2150m;
            this.f2147j = cVar.f2147j;
            this.f2156s = cVar.f2156s;
            this.f2154q = cVar.f2154q;
            this.f2158u = cVar.f2158u;
            this.f2148k = cVar.f2148k;
            this.f2151n = cVar.f2151n;
            this.f2152o = cVar.f2152o;
            this.f2153p = cVar.f2153p;
            this.f2155r = cVar.f2155r;
            this.f2157t = cVar.f2157t;
            this.f2143f = cVar.f2143f;
            this.f2159v = cVar.f2159v;
            if (cVar.f2146i != null) {
                this.f2146i = new android.graphics.Rect(cVar.f2146i);
            }
        }

        public c(E4.k kVar, p215v4.a aVar) {
            this.f2141d = null;
            this.f2142e = null;
            this.f2143f = null;
            this.f2144g = null;
            this.f2145h = android.graphics.PorterDuff.Mode.SRC_IN;
            this.f2146i = null;
            this.f2147j = 1.0f;
            this.f2148k = 1.0f;
            this.f2150m = 255;
            this.f2151n = 0.0f;
            this.f2152o = 0.0f;
            this.f2153p = 0.0f;
            this.f2154q = 0;
            this.f2155r = 0;
            this.f2156s = 0;
            this.f2157t = 0;
            this.f2158u = false;
            this.f2159v = android.graphics.Paint.Style.FILL_AND_STROKE;
            this.f2138a = kVar;
            this.f2139b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            E4.g gVar = new E4.g(this);
            gVar.f2116G = true;
            return gVar;
        }
    }

    static {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        f2111a0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new E4.k());
    }

    protected g(E4.g.c cVar) {
        this.f2113D = new E4.m.g[4];
        this.f2114E = new E4.m.g[4];
        this.f2115F = new java.util.BitSet(8);
        this.f2117H = new android.graphics.Matrix();
        this.f2118I = new android.graphics.Path();
        this.f2119J = new android.graphics.Path();
        this.f2120K = new android.graphics.RectF();
        this.f2121L = new android.graphics.RectF();
        this.f2122M = new android.graphics.Region();
        this.f2123N = new android.graphics.Region();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f2125P = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f2126Q = paint2;
        this.f2127R = new D4.a();
        this.f2129T = android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread() ? E4.l.k() : new E4.l();
        this.f2133X = new android.graphics.RectF();
        this.f2134Y = true;
        this.f2112C = cVar;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        e0();
        d0(getState());
        this.f2128S = new E4.g.a();
    }

    public g(E4.k kVar) {
        this(new E4.g.c(kVar, null));
    }

    public g(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        this(E4.k.e(context, attributeSet, i6, i10).m());
    }

    private float C() {
        if (J()) {
            return this.f2126Q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean H() {
        E4.g.c cVar = this.f2112C;
        int i6 = cVar.f2154q;
        return i6 != 1 && cVar.f2155r > 0 && (i6 == 2 || R());
    }

    private boolean I() {
        android.graphics.Paint.Style style = this.f2112C.f2159v;
        return style == android.graphics.Paint.Style.FILL_AND_STROKE || style == android.graphics.Paint.Style.FILL;
    }

    private boolean J() {
        android.graphics.Paint.Style style = this.f2112C.f2159v;
        return (style == android.graphics.Paint.Style.FILL_AND_STROKE || style == android.graphics.Paint.Style.STROKE) && this.f2126Q.getStrokeWidth() > 0.0f;
    }

    private void L() {
        super.invalidateSelf();
    }

    private void O(android.graphics.Canvas canvas) {
        if (H()) {
            canvas.save();
            Q(canvas);
            if (this.f2134Y) {
                int iWidth = (int) (this.f2133X.width() - getBounds().width());
                int iHeight = (int) (this.f2133X.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new java.lang.IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(((int) this.f2133X.width()) + (this.f2112C.f2155r * 2) + iWidth, ((int) this.f2133X.height()) + (this.f2112C.f2155r * 2) + iHeight, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
                float f6 = (getBounds().left - this.f2112C.f2155r) - iWidth;
                float f10 = (getBounds().top - this.f2112C.f2155r) - iHeight;
                canvas2.translate(-f6, -f10);
                n(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f6, f10, (android.graphics.Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    private static int P(int i6, int i10) {
        return (i6 * (i10 + (i10 >>> 7))) >>> 8;
    }

    private void Q(android.graphics.Canvas canvas) {
        canvas.translate(z(), A());
    }

    private boolean d0(int[] iArr) {
        boolean z6;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f2112C.f2141d == null || color2 == (colorForState2 = this.f2112C.f2141d.getColorForState(iArr, (color2 = this.f2125P.getColor())))) {
            z6 = false;
        } else {
            this.f2125P.setColor(colorForState2);
            z6 = true;
        }
        if (this.f2112C.f2142e == null || color == (colorForState = this.f2112C.f2142e.getColorForState(iArr, (color = this.f2126Q.getColor())))) {
            return z6;
        }
        this.f2126Q.setColor(colorForState);
        return true;
    }

    private boolean e0() {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = this.f2130U;
        android.graphics.PorterDuffColorFilter porterDuffColorFilter2 = this.f2131V;
        E4.g.c cVar = this.f2112C;
        this.f2130U = k(cVar.f2144g, cVar.f2145h, this.f2125P, true);
        E4.g.c cVar2 = this.f2112C;
        this.f2131V = k(cVar2.f2143f, cVar2.f2145h, this.f2126Q, false);
        E4.g.c cVar3 = this.f2112C;
        if (cVar3.f2158u) {
            this.f2127R.d(cVar3.f2144g.getColorForState(getState(), 0));
        }
        return (B1.c.a(porterDuffColorFilter, this.f2130U) && B1.c.a(porterDuffColorFilter2, this.f2131V)) ? false : true;
    }

    private android.graphics.PorterDuffColorFilter f(android.graphics.Paint paint, boolean z6) {
        if (!z6) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f2132W = iL;
        if (iL != color) {
            return new android.graphics.PorterDuffColorFilter(iL, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void f0() {
        float fG = G();
        this.f2112C.f2155r = (int) java.lang.Math.ceil(0.75f * fG);
        this.f2112C.f2156s = (int) java.lang.Math.ceil(fG * 0.25f);
        e0();
        L();
    }

    private void g(android.graphics.RectF rectF, android.graphics.Path path) {
        h(rectF, path);
        if (this.f2112C.f2147j != 1.0f) {
            this.f2117H.reset();
            android.graphics.Matrix matrix = this.f2117H;
            float f6 = this.f2112C.f2147j;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f2117H);
        }
        path.computeBounds(this.f2133X, true);
    }

    private void i() {
        E4.k kVarY = B().y(new E4.g.b(-C()));
        this.f2124O = kVarY;
        this.f2129T.e(kVarY, this.f2112C.f2148k, t(), this.f2119J);
    }

    private android.graphics.PorterDuffColorFilter j(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, boolean z6) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z6) {
            colorForState = l(colorForState);
        }
        this.f2132W = colorForState;
        return new android.graphics.PorterDuffColorFilter(colorForState, mode);
    }

    private android.graphics.PorterDuffColorFilter k(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.graphics.Paint paint, boolean z6) {
        return (colorStateList == null || mode == null) ? f(paint, z6) : j(colorStateList, mode, z6);
    }

    public static E4.g m(android.content.Context context, float f6, android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(p195t4.a.c(context, p125m4.a.f50520n, E4.g.class.getSimpleName()));
        }
        E4.g gVar = new E4.g();
        gVar.K(context);
        gVar.V(colorStateList);
        gVar.U(f6);
        return gVar;
    }

    private void n(android.graphics.Canvas canvas) {
        if (this.f2115F.cardinality() > 0) {
            java.lang.String str = f2110Z;
        }
        if (this.f2112C.f2156s != 0) {
            canvas.drawPath(this.f2118I, this.f2127R.c());
        }
        for (int i6 = 0; i6 < 4; i6++) {
            this.f2113D[i6].a(this.f2127R, this.f2112C.f2155r, canvas);
            this.f2114E[i6].a(this.f2127R, this.f2112C.f2155r, canvas);
        }
        if (this.f2134Y) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f2118I, f2111a0);
            canvas.translate(iZ, iA);
        }
    }

    private void o(android.graphics.Canvas canvas) {
        p(canvas, this.f2125P, this.f2118I, this.f2112C.f2138a, s());
    }

    private void p(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Path path, E4.k kVar, android.graphics.RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f2112C.f2148k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private android.graphics.RectF t() {
        this.f2121L.set(s());
        float fC = C();
        this.f2121L.inset(fC, fC);
        return this.f2121L;
    }

    public int A() {
        E4.g.c cVar = this.f2112C;
        return (int) (((double) cVar.f2156s) * java.lang.Math.cos(java.lang.Math.toRadians(cVar.f2157t)));
    }

    public E4.k B() {
        return this.f2112C.f2138a;
    }

    public float D() {
        return this.f2112C.f2138a.r().a(s());
    }

    public float E() {
        return this.f2112C.f2138a.t().a(s());
    }

    public float F() {
        return this.f2112C.f2153p;
    }

    public float G() {
        return u() + F();
    }

    public void K(android.content.Context context) {
        this.f2112C.f2139b = new p215v4.a(context);
        f0();
    }

    public boolean M() {
        p215v4.a aVar = this.f2112C.f2139b;
        return aVar != null && aVar.d();
    }

    public boolean N() {
        return this.f2112C.f2138a.u(s());
    }

    public boolean R() {
        return (N() || this.f2118I.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void S(float f6) {
        setShapeAppearanceModel(this.f2112C.f2138a.w(f6));
    }

    public void T(E4.c cVar) {
        setShapeAppearanceModel(this.f2112C.f2138a.x(cVar));
    }

    public void U(float f6) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2152o != f6) {
            cVar.f2152o = f6;
            f0();
        }
    }

    public void V(android.content.res.ColorStateList colorStateList) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2141d != colorStateList) {
            cVar.f2141d = colorStateList;
            onStateChange(getState());
        }
    }

    public void W(float f6) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2148k != f6) {
            cVar.f2148k = f6;
            this.f2116G = true;
            invalidateSelf();
        }
    }

    public void X(int i6, int i10, int i11, int i12) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2146i == null) {
            cVar.f2146i = new android.graphics.Rect();
        }
        this.f2112C.f2146i.set(i6, i10, i11, i12);
        invalidateSelf();
    }

    public void Y(float f6) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2151n != f6) {
            cVar.f2151n = f6;
            f0();
        }
    }

    public void Z(float f6, int i6) {
        c0(f6);
        b0(android.content.res.ColorStateList.valueOf(i6));
    }

    public void a0(float f6, android.content.res.ColorStateList colorStateList) {
        c0(f6);
        b0(colorStateList);
    }

    public void b0(android.content.res.ColorStateList colorStateList) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2142e != colorStateList) {
            cVar.f2142e = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f6) {
        this.f2112C.f2149l = f6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        this.f2125P.setColorFilter(this.f2130U);
        int alpha = this.f2125P.getAlpha();
        this.f2125P.setAlpha(P(alpha, this.f2112C.f2150m));
        this.f2126Q.setColorFilter(this.f2131V);
        this.f2126Q.setStrokeWidth(this.f2112C.f2149l);
        int alpha2 = this.f2126Q.getAlpha();
        this.f2126Q.setAlpha(P(alpha2, this.f2112C.f2150m));
        if (this.f2116G) {
            i();
            g(s(), this.f2118I);
            this.f2116G = false;
        }
        O(canvas);
        if (I()) {
            o(canvas);
        }
        if (J()) {
            r(canvas);
        }
        this.f2125P.setAlpha(alpha);
        this.f2126Q.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2112C.f2150m;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f2112C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.f2112C.f2154q == 2) {
            return;
        }
        if (N()) {
            outline.setRoundRect(getBounds(), D() * this.f2112C.f2148k);
        } else {
            g(s(), this.f2118I);
            com.google.android.material.drawable.d.i(outline, this.f2118I);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f2112C.f2146i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        this.f2122M.set(getBounds());
        g(s(), this.f2118I);
        this.f2123N.setPath(this.f2118I, this.f2122M);
        this.f2122M.op(this.f2123N, android.graphics.Region.Op.DIFFERENCE);
        return this.f2122M;
    }

    protected final void h(android.graphics.RectF rectF, android.graphics.Path path) {
        E4.l lVar = this.f2129T;
        E4.g.c cVar = this.f2112C;
        lVar.d(cVar.f2138a, cVar.f2148k, rectF, this.f2128S, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f2116G = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.content.res.ColorStateList colorStateList3;
        android.content.res.ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f2112C.f2144g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f2112C.f2143f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f2112C.f2142e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f2112C.f2141d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i6) {
        float fG = G() + x();
        p215v4.a aVar = this.f2112C.f2139b;
        return aVar != null ? aVar.c(i6, fG) : i6;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        this.f2112C = new E4.g.c(this.f2112C);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        this.f2116G = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z6 = d0(iArr) || e0();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    protected void q(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Path path, android.graphics.RectF rectF) {
        p(canvas, paint, path, this.f2112C.f2138a, rectF);
    }

    protected void r(android.graphics.Canvas canvas) {
        p(canvas, this.f2126Q, this.f2119J, this.f2124O, t());
    }

    protected android.graphics.RectF s() {
        this.f2120K.set(getBounds());
        return this.f2120K;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2150m != i6) {
            cVar.f2150m = i6;
            L();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f2112C.f2140c = colorFilter;
        L();
    }

    @Override // E4.n
    public void setShapeAppearanceModel(E4.k kVar) {
        this.f2112C.f2138a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        setTintList(android.content.res.ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.f2112C.f2144g = colorStateList;
        e0();
        L();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        E4.g.c cVar = this.f2112C;
        if (cVar.f2145h != mode) {
            cVar.f2145h = mode;
            e0();
            L();
        }
    }

    public float u() {
        return this.f2112C.f2152o;
    }

    public android.content.res.ColorStateList v() {
        return this.f2112C.f2141d;
    }

    public float w() {
        return this.f2112C.f2148k;
    }

    public float x() {
        return this.f2112C.f2151n;
    }

    public int y() {
        return this.f2132W;
    }

    public int z() {
        E4.g.c cVar = this.f2112C;
        return (int) (((double) cVar.f2156s) * java.lang.Math.sin(java.lang.Math.toRadians(cVar.f2157t)));
    }
}
