package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends android.view.View implements F0.m0 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final androidx.compose.ui.platform.B1.c f19815R = new androidx.compose.ui.platform.B1.c(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f19816S = 8;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final p237x7.p f19817T = androidx.compose.ui.platform.B1.b.f19838D;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final android.view.ViewOutlineProvider f19818U = new androidx.compose.ui.platform.B1.a();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static java.lang.reflect.Method f19819V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static java.lang.reflect.Field f19820W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static boolean f19821a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static boolean f19822b0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f19823C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.compose.ui.platform.C1983w0 f19824D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p237x7.p f19825E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p237x7.a f19826F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final androidx.compose.ui.platform.P0 f19827G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f19828H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.graphics.Rect f19829I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f19830J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f19831K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p141o0.C6995r0 f19832L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final androidx.compose.ui.platform.K0 f19833M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f19834N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f19835O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final long f19836P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f19837Q;

    public static final class a extends android.view.ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, android.graphics.Outline outline) {
            p247y7.AbstractC7350t.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            android.graphics.Outline outlineB = ((androidx.compose.ui.platform.B1) view).f19827G.b();
            p247y7.AbstractC7350t.c(outlineB);
            outline.set(outlineB);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.B1.b f19838D = new androidx.compose.ui.platform.B1.b();

        b() {
            super(2);
        }

        public final void a(android.view.View view, android.graphics.Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((android.view.View) obj, (android.graphics.Matrix) obj2);
            return p087i7.M.f46721a;
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean a() {
            return androidx.compose.ui.platform.B1.f19821a0;
        }

        public final boolean b() {
            return androidx.compose.ui.platform.B1.f19822b0;
        }

        public final void c(boolean z6) {
            androidx.compose.ui.platform.B1.f19822b0 = z6;
        }

        public final void d(android.view.View view) {
            java.lang.reflect.Field declaredField;
            try {
                if (!a()) {
                    androidx.compose.ui.platform.B1.f19821a0 = true;
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        androidx.compose.ui.platform.B1.f19819V = android.view.View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        declaredField = android.view.View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        androidx.compose.ui.platform.B1.f19819V = (java.lang.reflect.Method) java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass()).invoke(android.view.View.class, "updateDisplayListIfDirty", new java.lang.Class[0]);
                        declaredField = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(android.view.View.class, "mRecreateDisplayList");
                    }
                    androidx.compose.ui.platform.B1.f19820W = declaredField;
                    java.lang.reflect.Method method = androidx.compose.ui.platform.B1.f19819V;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    java.lang.reflect.Field field = androidx.compose.ui.platform.B1.f19820W;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                java.lang.reflect.Field field2 = androidx.compose.ui.platform.B1.f19820W;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                java.lang.reflect.Method method2 = androidx.compose.ui.platform.B1.f19819V;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (java.lang.Throwable unused) {
                c(true);
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.compose.ui.platform.B1.d f19839a = new androidx.compose.ui.platform.B1.d();

        private d() {
        }

        public static final long a(android.view.View view) {
            return view.getUniqueDrawingId();
        }
    }

    public B1(androidx.compose.ui.platform.r rVar, androidx.compose.ui.platform.C1983w0 c1983w0, p237x7.p pVar, p237x7.a aVar) {
        super(rVar.getContext());
        this.f19823C = rVar;
        this.f19824D = c1983w0;
        this.f19825E = pVar;
        this.f19826F = aVar;
        this.f19827G = new androidx.compose.ui.platform.P0();
        this.f19832L = new p141o0.C6995r0();
        this.f19833M = new androidx.compose.ui.platform.K0(f19817T);
        this.f19834N = androidx.compose.ui.graphics.f.f19784b.a();
        this.f19835O = true;
        setWillNotDraw(false);
        c1983w0.addView(this);
        this.f19836P = android.view.View.generateViewId();
    }

    private final p141o0.Q1 getManualClipPath() {
        if (!getClipToOutline() || this.f19827G.e()) {
            return null;
        }
        return this.f19827G.d();
    }

    private final void setInvalidated(boolean z6) {
        if (z6 != this.f19830J) {
            this.f19830J = z6;
            this.f19823C.x0(this, z6);
        }
    }

    private final void v() {
        android.graphics.Rect rect;
        if (this.f19828H) {
            android.graphics.Rect rect2 = this.f19829I;
            if (rect2 == null) {
                this.f19829I = new android.graphics.Rect(0, 0, getWidth(), getHeight());
            } else {
                p247y7.AbstractC7350t.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f19829I;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void w() {
        setOutlineProvider(this.f19827G.b() != null ? f19818U : null);
    }

    @Override // F0.m0
    public void a(float[] fArr) {
        p141o0.J1.n(fArr, this.f19833M.b(this));
    }

    @Override // F0.m0
    public void b(p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        boolean z6 = getElevation() > 0.0f;
        this.f19831K = z6;
        if (z6) {
            interfaceC6993q0.v();
        }
        this.f19824D.a(interfaceC6993q0, this, getDrawingTime());
        if (this.f19831K) {
            interfaceC6993q0.n();
        }
    }

    @Override // F0.m0
    public void c(p237x7.p pVar, p237x7.a aVar) {
        this.f19824D.addView(this);
        this.f19828H = false;
        this.f19831K = false;
        this.f19834N = androidx.compose.ui.graphics.f.f19784b.a();
        this.f19825E = pVar;
        this.f19826F = aVar;
    }

    @Override // F0.m0
    public boolean d(long j6) {
        float fM = p131n0.g.m(j6);
        float fN = p131n0.g.n(j6);
        if (this.f19828H) {
            return 0.0f <= fM && fM < ((float) getWidth()) && 0.0f <= fN && fN < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f19827G.f(j6);
        }
        return true;
    }

    @Override // F0.m0
    public void destroy() {
        setInvalidated(false);
        this.f19823C.I0();
        this.f19825E = null;
        this.f19826F = null;
        this.f19823C.G0(this);
        this.f19824D.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z6;
        p141o0.C6995r0 c6995r0 = this.f19832L;
        android.graphics.Canvas canvasA = c6995r0.a().a();
        c6995r0.a().w(canvas);
        p141o0.G gA = c6995r0.a();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z6 = false;
        } else {
            gA.m();
            this.f19827G.a(gA);
            z6 = true;
        }
        p237x7.p pVar = this.f19825E;
        if (pVar != null) {
            pVar.u(gA, null);
        }
        if (z6) {
            gA.s();
        }
        c6995r0.a().w(canvasA);
        setInvalidated(false);
    }

    @Override // F0.m0
    public void e(androidx.compose.ui.graphics.d dVar) {
        p237x7.a aVar;
        int iF = dVar.F() | this.f19837Q;
        if ((iF & 4096) != 0) {
            long jN0 = dVar.N0();
            this.f19834N = jN0;
            setPivotX(androidx.compose.ui.graphics.f.f(jN0) * getWidth());
            setPivotY(androidx.compose.ui.graphics.f.g(this.f19834N) * getHeight());
        }
        if ((iF & 1) != 0) {
            setScaleX(dVar.o());
        }
        if ((iF & 2) != 0) {
            setScaleY(dVar.E());
        }
        if ((iF & 4) != 0) {
            setAlpha(dVar.f());
        }
        if ((iF & 8) != 0) {
            setTranslationX(dVar.z());
        }
        if ((iF & 16) != 0) {
            setTranslationY(dVar.v());
        }
        if ((iF & 32) != 0) {
            setElevation(dVar.J());
        }
        if ((iF & 1024) != 0) {
            setRotation(dVar.u());
        }
        if ((iF & 256) != 0) {
            setRotationX(dVar.B());
        }
        if ((iF & 512) != 0) {
            setRotationY(dVar.r());
        }
        if ((iF & 2048) != 0) {
            setCameraDistancePx(dVar.x());
        }
        boolean z6 = false;
        boolean z10 = getManualClipPath() != null;
        boolean z11 = dVar.s() && dVar.K() != p141o0.Y1.a();
        if ((iF & 24576) != 0) {
            this.f19828H = dVar.s() && dVar.K() == p141o0.Y1.a();
            v();
            setClipToOutline(z11);
        }
        boolean zH = this.f19827G.h(dVar.G(), dVar.f(), z11, dVar.J(), dVar.i());
        if (this.f19827G.c()) {
            w();
        }
        boolean z12 = getManualClipPath() != null;
        if (z10 != z12 || (z12 && zH)) {
            invalidate();
        }
        if (!this.f19831K && getElevation() > 0.0f && (aVar = this.f19826F) != null) {
            aVar.b();
        }
        if ((iF & 7963) != 0) {
            this.f19833M.c();
        }
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            if ((iF & 64) != 0) {
                androidx.compose.ui.platform.D1.f19849a.a(this, p141o0.A0.k(dVar.k()));
            }
            if ((iF & 128) != 0) {
                androidx.compose.ui.platform.D1.f19849a.b(this, p141o0.A0.k(dVar.M()));
            }
        }
        if (i6 >= 31 && (131072 & iF) != 0) {
            androidx.compose.ui.platform.E1 e6 = androidx.compose.ui.platform.E1.f19860a;
            dVar.H();
            e6.a(this, null);
        }
        if ((iF & 32768) != 0) {
            int iT = dVar.t();
            androidx.compose.ui.graphics.a.C0377a c0377a = androidx.compose.ui.graphics.a.f19739a;
            if (androidx.compose.ui.graphics.a.e(iT, c0377a.c())) {
                setLayerType(2, null);
            } else {
                boolean zE = androidx.compose.ui.graphics.a.e(iT, c0377a.b());
                setLayerType(0, null);
                if (!zE) {
                }
                this.f19835O = z6;
            }
            z6 = true;
            this.f19835O = z6;
        }
        this.f19837Q = dVar.F();
    }

    @Override // F0.m0
    public long f(long j6, boolean z6) {
        if (!z6) {
            return p141o0.J1.f(this.f19833M.b(this), j6);
        }
        float[] fArrA = this.f19833M.a(this);
        return fArrA != null ? p141o0.J1.f(fArrA, j6) : p131n0.g.f51312b.a();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // F0.m0
    public void g(long j6) {
        int iG = Y0.t.g(j6);
        int iF = Y0.t.f(j6);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.f.f(this.f19834N) * iG);
        setPivotY(androidx.compose.ui.graphics.f.g(this.f19834N) * iF);
        w();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        v();
        this.f19833M.c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final androidx.compose.ui.platform.C1983w0 getContainer() {
        return this.f19824D;
    }

    public long getLayerId() {
        return this.f19836P;
    }

    public final androidx.compose.ui.platform.r getOwnerView() {
        return this.f19823C;
    }

    public long getOwnerViewId() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.B1.d.a(this.f19823C);
        }
        return -1L;
    }

    @Override // F0.m0
    public void h(float[] fArr) {
        float[] fArrA = this.f19833M.a(this);
        if (fArrA != null) {
            p141o0.J1.n(fArr, fArrA);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f19835O;
    }

    @Override // F0.m0
    public void i(long j6) {
        int iH = Y0.p.h(j6);
        if (iH != getLeft()) {
            offsetLeftAndRight(iH - getLeft());
            this.f19833M.c();
        }
        int i6 = Y0.p.i(j6);
        if (i6 != getTop()) {
            offsetTopAndBottom(i6 - getTop());
            this.f19833M.c();
        }
    }

    @Override // android.view.View, F0.m0
    public void invalidate() {
        if (this.f19830J) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f19823C.invalidate();
    }

    @Override // F0.m0
    public void j() {
        if (!this.f19830J || f19822b0) {
            return;
        }
        f19815R.d(this);
        setInvalidated(false);
    }

    @Override // F0.m0
    public void k(p131n0.e eVar, boolean z6) {
        if (!z6) {
            p141o0.J1.g(this.f19833M.b(this), eVar);
            return;
        }
        float[] fArrA = this.f19833M.a(this);
        if (fArrA != null) {
            p141o0.J1.g(fArrA, eVar);
        } else {
            eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
    }

    public final void setCameraDistancePx(float f6) {
        setCameraDistance(f6 * getResources().getDisplayMetrics().densityDpi);
    }

    public final boolean u() {
        return this.f19830J;
    }
}
