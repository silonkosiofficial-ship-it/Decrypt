package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements p171r0.InterfaceC7055e {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final r0.F.b f53459J = new r0.F.b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final boolean f53460K = !p171r0.U.f53507a.a();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final android.graphics.Canvas f53461L = new r0.F.a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f53462A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f53463B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f53464C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f53465D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f53466E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f53467F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f53468G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f53469H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f53470I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p181s0.a f53471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p141o0.C6995r0 f53473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p171r0.V f53474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.content.res.Resources f53475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.graphics.Rect f53476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.graphics.Paint f53477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.graphics.Picture f53478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p161q0.a f53479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p141o0.C6995r0 f53480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f53488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f53489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f53490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f53491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f53492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f53493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f53494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f53495z;

    public static final class a extends android.graphics.Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public F(p181s0.a aVar, long j6, p141o0.C6995r0 c6995r0, p161q0.a aVar2) {
        this.f53471b = aVar;
        this.f53472c = j6;
        this.f53473d = c6995r0;
        p171r0.V v6 = new p171r0.V(aVar, c6995r0, aVar2);
        this.f53474e = v6;
        this.f53475f = aVar.getResources();
        this.f53476g = new android.graphics.Rect();
        boolean z6 = f53460K;
        this.f53478i = z6 ? new android.graphics.Picture() : null;
        this.f53479j = z6 ? new p161q0.a() : null;
        this.f53480k = z6 ? new p141o0.C6995r0() : null;
        aVar.addView(v6);
        v6.setClipBounds(null);
        this.f53483n = Y0.t.f16230b.a();
        this.f53485p = true;
        this.f53488s = android.view.View.generateViewId();
        this.f53489t = p141o0.AbstractC6960f0.f52197a.B();
        this.f53491v = p171r0.AbstractC7052b.f53526a.a();
        this.f53492w = 1.0f;
        this.f53494y = p131n0.g.f51312b.c();
        this.f53495z = 1.0f;
        this.f53462A = 1.0f;
        p141o0.C7016y0.a aVar3 = p141o0.C7016y0.f52264b;
        this.f53466E = aVar3.a();
        this.f53467F = aVar3.a();
    }

    public /* synthetic */ F(p181s0.a aVar, long j6, p141o0.C6995r0 c6995r0, p161q0.a aVar2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, j6, (i6 & 4) != 0 ? new p141o0.C6995r0() : c6995r0, (i6 & 8) != 0 ? new p161q0.a() : aVar2);
    }

    private final void O(int i6) {
        int i10;
        p171r0.V v6;
        p171r0.V v10 = this.f53474e;
        p171r0.AbstractC7052b.a aVar = p171r0.AbstractC7052b.f53526a;
        boolean z6 = true;
        if (!p171r0.AbstractC7052b.e(i6, aVar.c())) {
            boolean zE = p171r0.AbstractC7052b.e(i6, aVar.b());
            i10 = 0;
            if (zE) {
                this.f53474e.setLayerType(0, this.f53477h);
                z6 = false;
            } else {
                v6 = this.f53474e;
            }
            v10.setCanUseCompositingLayer$ui_graphics_release(z6);
        }
        v6 = this.f53474e;
        i10 = 2;
        v6.setLayerType(i10, this.f53477h);
        v10.setCanUseCompositingLayer$ui_graphics_release(z6);
    }

    private final void Q() {
        try {
            p141o0.C6995r0 c6995r0 = this.f53473d;
            android.graphics.Canvas canvas = f53461L;
            android.graphics.Canvas canvasA = c6995r0.a().a();
            c6995r0.a().w(canvas);
            p141o0.G gA = c6995r0.a();
            p181s0.a aVar = this.f53471b;
            p171r0.V v6 = this.f53474e;
            aVar.a(gA, v6, v6.getDrawingTime());
            c6995r0.a().w(canvasA);
        } catch (java.lang.Throwable unused) {
        }
    }

    private final boolean R() {
        return p171r0.AbstractC7052b.e(C(), p171r0.AbstractC7052b.f53526a.c()) || S();
    }

    private final boolean S() {
        return (p141o0.AbstractC6960f0.E(q(), p141o0.AbstractC6960f0.f52197a.B()) && f() == null) ? false : true;
    }

    private final void T() {
        android.graphics.Rect rect;
        if (this.f53484o) {
            p171r0.V v6 = this.f53474e;
            if (!P() || this.f53486q) {
                rect = null;
            } else {
                rect = this.f53476g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f53474e.getWidth();
                rect.bottom = this.f53474e.getHeight();
            }
            v6.setClipBounds(rect);
        }
    }

    private final void U() {
        O(R() ? p171r0.AbstractC7052b.f53526a.c() : C());
    }

    @Override // p171r0.InterfaceC7055e
    public void A(boolean z6) {
        boolean z10 = false;
        this.f53487r = z6 && !this.f53486q;
        this.f53484o = true;
        p171r0.V v6 = this.f53474e;
        if (z6 && this.f53486q) {
            z10 = true;
        }
        v6.setClipToOutline(z10);
    }

    @Override // p171r0.InterfaceC7055e
    public float B() {
        return this.f53468G;
    }

    @Override // p171r0.InterfaceC7055e
    public int C() {
        return this.f53491v;
    }

    @Override // p171r0.InterfaceC7055e
    public void D(long j6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f53467F = j6;
            p171r0.Z.f53520a.c(this.f53474e, p141o0.A0.k(j6));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public float E() {
        return this.f53462A;
    }

    @Override // p171r0.InterfaceC7055e
    public void F(int i6, int i10, long j6) {
        if (Y0.t.e(this.f53483n, j6)) {
            int i11 = this.f53481l;
            if (i11 != i6) {
                this.f53474e.offsetLeftAndRight(i6 - i11);
            }
            int i12 = this.f53482m;
            if (i12 != i10) {
                this.f53474e.offsetTopAndBottom(i10 - i12);
            }
        } else {
            if (P()) {
                this.f53484o = true;
            }
            this.f53474e.layout(i6, i10, Y0.t.g(j6) + i6, Y0.t.f(j6) + i10);
            this.f53483n = j6;
            if (this.f53493x) {
                this.f53474e.setPivotX(Y0.t.g(j6) / 2.0f);
                this.f53474e.setPivotY(Y0.t.f(j6) / 2.0f);
            }
        }
        this.f53481l = i6;
        this.f53482m = i10;
    }

    @Override // p171r0.InterfaceC7055e
    public void G(long j6) {
        this.f53494y = j6;
        if (!p131n0.h.d(j6)) {
            this.f53493x = false;
            this.f53474e.setPivotX(p131n0.g.m(j6));
            this.f53474e.setPivotY(p131n0.g.n(j6));
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                p171r0.Z.f53520a.a(this.f53474e);
                return;
            }
            this.f53493x = true;
            this.f53474e.setPivotX(Y0.t.g(this.f53483n) / 2.0f);
            this.f53474e.setPivotY(Y0.t.f(this.f53483n) / 2.0f);
        }
    }

    @Override // p171r0.InterfaceC7055e
    public long H() {
        return this.f53466E;
    }

    @Override // p171r0.InterfaceC7055e
    public void I(Y0.e eVar, Y0.v vVar, p171r0.C7053c c7053c, p237x7.l lVar) {
        if (this.f53474e.getParent() == null) {
            this.f53471b.addView(this.f53474e);
        }
        this.f53474e.b(eVar, vVar, c7053c, lVar);
        if (this.f53474e.isAttachedToWindow()) {
            this.f53474e.setVisibility(4);
            this.f53474e.setVisibility(0);
            Q();
            android.graphics.Picture picture = this.f53478i;
            if (picture != null) {
                android.graphics.Canvas canvasBeginRecording = picture.beginRecording(Y0.t.g(this.f53483n), Y0.t.f(this.f53483n));
                try {
                    p141o0.C6995r0 c6995r0 = this.f53480k;
                    if (c6995r0 != null) {
                        android.graphics.Canvas canvasA = c6995r0.a().a();
                        c6995r0.a().w(canvasBeginRecording);
                        p141o0.G gA = c6995r0.a();
                        p161q0.a aVar = this.f53479j;
                        if (aVar != null) {
                            long jD = Y0.u.d(this.f53483n);
                            p161q0.a.C0685a c0685aH = aVar.H();
                            Y0.e eVarA = c0685aH.a();
                            Y0.v vVarB = c0685aH.b();
                            p141o0.InterfaceC6993q0 interfaceC6993q0C = c0685aH.c();
                            long jD2 = c0685aH.d();
                            p161q0.a.C0685a c0685aH2 = aVar.H();
                            c0685aH2.j(eVar);
                            c0685aH2.k(vVar);
                            c0685aH2.i(gA);
                            c0685aH2.l(jD);
                            gA.m();
                            lVar.l(aVar);
                            gA.s();
                            p161q0.a.C0685a c0685aH3 = aVar.H();
                            c0685aH3.j(eVarA);
                            c0685aH3.k(vVarB);
                            c0685aH3.i(interfaceC6993q0C);
                            c0685aH3.l(jD2);
                        }
                        c6995r0.a().w(canvasA);
                        p087i7.M m6 = p087i7.M.f46721a;
                    }
                } finally {
                    picture.endRecording();
                }
            }
        }
    }

    @Override // p171r0.InterfaceC7055e
    public long J() {
        return this.f53467F;
    }

    @Override // p171r0.InterfaceC7055e
    public void K(int i6) {
        this.f53491v = i6;
        U();
    }

    @Override // p171r0.InterfaceC7055e
    public android.graphics.Matrix L() {
        return this.f53474e.getMatrix();
    }

    @Override // p171r0.InterfaceC7055e
    public float M() {
        return this.f53465D;
    }

    @Override // p171r0.InterfaceC7055e
    public void N(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        T();
        android.graphics.Canvas canvasD = p141o0.H.d(interfaceC6993q0);
        if (canvasD.isHardwareAccelerated()) {
            p181s0.a aVar = this.f53471b;
            p171r0.V v6 = this.f53474e;
            aVar.a(interfaceC6993q0, v6, v6.getDrawingTime());
        } else {
            android.graphics.Picture picture = this.f53478i;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    public boolean P() {
        return this.f53487r || this.f53474e.getClipToOutline();
    }

    @Override // p171r0.InterfaceC7055e
    public float a() {
        return this.f53492w;
    }

    @Override // p171r0.InterfaceC7055e
    public void b(float f6) {
        this.f53492w = f6;
        this.f53474e.setAlpha(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void c(float f6) {
        this.f53469H = f6;
        this.f53474e.setRotationY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void d(float f6) {
        this.f53470I = f6;
        this.f53474e.setRotation(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void e(float f6) {
        this.f53464C = f6;
        this.f53474e.setTranslationY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public p141o0.AbstractC7019z0 f() {
        return this.f53490u;
    }

    @Override // p171r0.InterfaceC7055e
    public void g(float f6) {
        this.f53462A = f6;
        this.f53474e.setScaleY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void h(float f6) {
        this.f53495z = f6;
        this.f53474e.setScaleX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void i() {
        this.f53471b.removeViewInLayout(this.f53474e);
    }

    @Override // p171r0.InterfaceC7055e
    public void j(float f6) {
        this.f53463B = f6;
        this.f53474e.setTranslationX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public /* synthetic */ boolean k() {
        return p171r0.AbstractC7054d.a(this);
    }

    @Override // p171r0.InterfaceC7055e
    public void l(p141o0.Z1 z6) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            p171r0.b0.f53530a.a(this.f53474e, z6);
        }
    }

    @Override // p171r0.InterfaceC7055e
    public void m(float f6) {
        this.f53474e.setCameraDistance(f6 * this.f53475f.getDisplayMetrics().densityDpi);
    }

    @Override // p171r0.InterfaceC7055e
    public void n(float f6) {
        this.f53468G = f6;
        this.f53474e.setRotationX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public float o() {
        return this.f53495z;
    }

    @Override // p171r0.InterfaceC7055e
    public void p(float f6) {
        this.f53465D = f6;
        this.f53474e.setElevation(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public int q() {
        return this.f53489t;
    }

    @Override // p171r0.InterfaceC7055e
    public float r() {
        return this.f53469H;
    }

    @Override // p171r0.InterfaceC7055e
    public void s(boolean z6) {
        this.f53485p = z6;
    }

    @Override // p171r0.InterfaceC7055e
    public p141o0.Z1 t() {
        return null;
    }

    @Override // p171r0.InterfaceC7055e
    public float u() {
        return this.f53470I;
    }

    @Override // p171r0.InterfaceC7055e
    public float v() {
        return this.f53464C;
    }

    @Override // p171r0.InterfaceC7055e
    public void w(long j6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f53466E = j6;
            p171r0.Z.f53520a.b(this.f53474e, p141o0.A0.k(j6));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public float x() {
        return this.f53474e.getCameraDistance() / this.f53475f.getDisplayMetrics().densityDpi;
    }

    @Override // p171r0.InterfaceC7055e
    public void y(android.graphics.Outline outline, long j6) {
        boolean z6 = !this.f53474e.c(outline);
        if (P() && outline != null) {
            this.f53474e.setClipToOutline(true);
            if (this.f53487r) {
                this.f53487r = false;
                this.f53484o = true;
            }
        }
        this.f53486q = outline != null;
        if (z6) {
            this.f53474e.invalidate();
            Q();
        }
    }

    @Override // p171r0.InterfaceC7055e
    public float z() {
        return this.f53463B;
    }
}
