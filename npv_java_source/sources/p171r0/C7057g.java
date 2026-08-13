package p171r0;

/* JADX INFO: renamed from: r0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7057g implements p171r0.InterfaceC7055e {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static boolean f53563G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f53565A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f53566B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f53567C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f53568D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f53569E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.C6995r0 f53571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p161q0.a f53572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.view.RenderNode f53573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.graphics.Paint f53575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.graphics.Matrix f53576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f53578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f53581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f53582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f53584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f53585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f53586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f53587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f53588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f53589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f53590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f53591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f53592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f53593y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f53594z;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final p171r0.C7057g.a f53562F = new p171r0.C7057g.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f53564H = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* JADX INFO: renamed from: r0.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C7057g(android.view.View view, long j6, p141o0.C6995r0 c6995r0, p161q0.a aVar) {
        this.f53570b = j6;
        this.f53571c = c6995r0;
        this.f53572d = aVar;
        android.view.RenderNode renderNodeCreate = android.view.RenderNode.create("Compose", view);
        this.f53573e = renderNodeCreate;
        Y0.t.a aVar2 = Y0.t.f16230b;
        this.f53574f = aVar2.a();
        this.f53578j = aVar2.a();
        if (f53564H.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            U(renderNodeCreate);
            Q();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f53563G) {
            throw new java.lang.NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        p171r0.AbstractC7052b.a aVar3 = p171r0.AbstractC7052b.f53526a;
        P(aVar3.a());
        this.f53579k = aVar3.a();
        this.f53580l = p141o0.AbstractC6960f0.f52197a.B();
        this.f53582n = 1.0f;
        this.f53584p = p131n0.g.f51312b.b();
        this.f53585q = 1.0f;
        this.f53586r = 1.0f;
        p141o0.C7016y0.a aVar4 = p141o0.C7016y0.f52264b;
        this.f53590v = aVar4.a();
        this.f53591w = aVar4.a();
        this.f53565A = 8.0f;
        this.f53569E = true;
    }

    public /* synthetic */ C7057g(android.view.View view, long j6, p141o0.C6995r0 c6995r0, p161q0.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(view, j6, (i6 & 4) != 0 ? new p141o0.C6995r0() : c6995r0, (i6 & 8) != 0 ? new p161q0.a() : aVar);
    }

    private final void O() {
        boolean z6 = false;
        boolean z10 = R() && !this.f53577i;
        if (R() && this.f53577i) {
            z6 = true;
        }
        if (z10 != this.f53567C) {
            this.f53567C = z10;
            this.f53573e.setClipToBounds(z10);
        }
        if (z6 != this.f53568D) {
            this.f53568D = z6;
            this.f53573e.setClipToOutline(z6);
        }
    }

    private final void P(int i6) {
        android.view.RenderNode renderNode = this.f53573e;
        p171r0.AbstractC7052b.a aVar = p171r0.AbstractC7052b.f53526a;
        if (p171r0.AbstractC7052b.e(i6, aVar.c())) {
            renderNode.setLayerType(2);
        } else {
            boolean zE = p171r0.AbstractC7052b.e(i6, aVar.b());
            renderNode.setLayerType(0);
            if (zE) {
                renderNode.setLayerPaint(this.f53575g);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
        }
        renderNode.setLayerPaint(this.f53575g);
        renderNode.setHasOverlappingRendering(true);
    }

    private final boolean S() {
        return (!p171r0.AbstractC7052b.e(C(), p171r0.AbstractC7052b.f53526a.c()) && p141o0.AbstractC6960f0.E(q(), p141o0.AbstractC6960f0.f52197a.B()) && f() == null) ? false : true;
    }

    private final void T() {
        P(S() ? p171r0.AbstractC7052b.f53526a.c() : C());
    }

    private final void U(android.view.RenderNode renderNode) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            p171r0.S s6 = p171r0.S.f53505a;
            s6.c(renderNode, s6.a(renderNode));
            s6.d(renderNode, s6.b(renderNode));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public void A(boolean z6) {
        this.f53566B = z6;
        O();
    }

    @Override // p171r0.InterfaceC7055e
    public float B() {
        return this.f53592x;
    }

    @Override // p171r0.InterfaceC7055e
    public int C() {
        return this.f53579k;
    }

    @Override // p171r0.InterfaceC7055e
    public void D(long j6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f53591w = j6;
            p171r0.S.f53505a.d(this.f53573e, p141o0.A0.k(j6));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public float E() {
        return this.f53586r;
    }

    @Override // p171r0.InterfaceC7055e
    public void F(int i6, int i10, long j6) {
        this.f53573e.setLeftTopRightBottom(i6, i10, Y0.t.g(j6) + i6, Y0.t.f(j6) + i10);
        if (Y0.t.e(this.f53574f, j6)) {
            return;
        }
        if (this.f53583o) {
            this.f53573e.setPivotX(Y0.t.g(j6) / 2.0f);
            this.f53573e.setPivotY(Y0.t.f(j6) / 2.0f);
        }
        this.f53574f = j6;
    }

    @Override // p171r0.InterfaceC7055e
    public void G(long j6) {
        this.f53584p = j6;
        if (p131n0.h.d(j6)) {
            this.f53583o = true;
            this.f53573e.setPivotX(Y0.t.g(this.f53574f) / 2.0f);
            this.f53573e.setPivotY(Y0.t.f(this.f53574f) / 2.0f);
        } else {
            this.f53583o = false;
            this.f53573e.setPivotX(p131n0.g.m(j6));
            this.f53573e.setPivotY(p131n0.g.n(j6));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public long H() {
        return this.f53590v;
    }

    @Override // p171r0.InterfaceC7055e
    public void I(Y0.e eVar, Y0.v vVar, p171r0.C7053c c7053c, p237x7.l lVar) {
        android.graphics.Canvas canvasStart = this.f53573e.start(java.lang.Math.max(Y0.t.g(this.f53574f), Y0.t.g(this.f53578j)), java.lang.Math.max(Y0.t.f(this.f53574f), Y0.t.f(this.f53578j)));
        try {
            p141o0.C6995r0 c6995r0 = this.f53571c;
            android.graphics.Canvas canvasA = c6995r0.a().a();
            c6995r0.a().w(canvasStart);
            p141o0.G gA = c6995r0.a();
            p161q0.a aVar = this.f53572d;
            long jD = Y0.u.d(this.f53574f);
            Y0.e density = aVar.F0().getDensity();
            Y0.v layoutDirection = aVar.F0().getLayoutDirection();
            p141o0.InterfaceC6993q0 interfaceC6993q0H = aVar.F0().h();
            long jI = aVar.F0().i();
            p171r0.C7053c c7053cF = aVar.F0().f();
            p161q0.d dVarF0 = aVar.F0();
            dVarF0.a(eVar);
            dVarF0.b(vVar);
            dVarF0.g(gA);
            dVarF0.d(jD);
            dVarF0.e(c7053c);
            gA.m();
            try {
                lVar.l(aVar);
                gA.s();
                p161q0.d dVarF1 = aVar.F0();
                dVarF1.a(density);
                dVarF1.b(layoutDirection);
                dVarF1.g(interfaceC6993q0H);
                dVarF1.d(jI);
                dVarF1.e(c7053cF);
                c6995r0.a().w(canvasA);
                this.f53573e.end(canvasStart);
                s(false);
            } catch (java.lang.Throwable th) {
                gA.s();
                p161q0.d dVarF2 = aVar.F0();
                dVarF2.a(density);
                dVarF2.b(layoutDirection);
                dVarF2.g(interfaceC6993q0H);
                dVarF2.d(jI);
                dVarF2.e(c7053cF);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.f53573e.end(canvasStart);
            throw th2;
        }
    }

    @Override // p171r0.InterfaceC7055e
    public long J() {
        return this.f53591w;
    }

    @Override // p171r0.InterfaceC7055e
    public void K(int i6) {
        this.f53579k = i6;
        T();
    }

    @Override // p171r0.InterfaceC7055e
    public android.graphics.Matrix L() {
        android.graphics.Matrix matrix = this.f53576h;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.f53576h = matrix;
        }
        this.f53573e.getMatrix(matrix);
        return matrix;
    }

    @Override // p171r0.InterfaceC7055e
    public float M() {
        return this.f53589u;
    }

    @Override // p171r0.InterfaceC7055e
    public void N(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        android.view.DisplayListCanvas displayListCanvasD = p141o0.H.d(interfaceC6993q0);
        p247y7.AbstractC7350t.d(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.f53573e);
    }

    public final void Q() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            p171r0.Q.f53504a.a(this.f53573e);
        } else {
            p171r0.P.f53503a.a(this.f53573e);
        }
    }

    public boolean R() {
        return this.f53566B;
    }

    @Override // p171r0.InterfaceC7055e
    public float a() {
        return this.f53582n;
    }

    @Override // p171r0.InterfaceC7055e
    public void b(float f6) {
        this.f53582n = f6;
        this.f53573e.setAlpha(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void c(float f6) {
        this.f53593y = f6;
        this.f53573e.setRotationY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void d(float f6) {
        this.f53594z = f6;
        this.f53573e.setRotation(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void e(float f6) {
        this.f53588t = f6;
        this.f53573e.setTranslationY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public p141o0.AbstractC7019z0 f() {
        return this.f53581m;
    }

    @Override // p171r0.InterfaceC7055e
    public void g(float f6) {
        this.f53586r = f6;
        this.f53573e.setScaleY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void h(float f6) {
        this.f53585q = f6;
        this.f53573e.setScaleX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void i() {
        Q();
    }

    @Override // p171r0.InterfaceC7055e
    public void j(float f6) {
        this.f53587s = f6;
        this.f53573e.setTranslationX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public boolean k() {
        return this.f53573e.isValid();
    }

    @Override // p171r0.InterfaceC7055e
    public void l(p141o0.Z1 z6) {
    }

    @Override // p171r0.InterfaceC7055e
    public void m(float f6) {
        this.f53565A = f6;
        this.f53573e.setCameraDistance(-f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void n(float f6) {
        this.f53592x = f6;
        this.f53573e.setRotationX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public float o() {
        return this.f53585q;
    }

    @Override // p171r0.InterfaceC7055e
    public void p(float f6) {
        this.f53589u = f6;
        this.f53573e.setElevation(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public int q() {
        return this.f53580l;
    }

    @Override // p171r0.InterfaceC7055e
    public float r() {
        return this.f53593y;
    }

    @Override // p171r0.InterfaceC7055e
    public void s(boolean z6) {
        this.f53569E = z6;
    }

    @Override // p171r0.InterfaceC7055e
    public p141o0.Z1 t() {
        return null;
    }

    @Override // p171r0.InterfaceC7055e
    public float u() {
        return this.f53594z;
    }

    @Override // p171r0.InterfaceC7055e
    public float v() {
        return this.f53588t;
    }

    @Override // p171r0.InterfaceC7055e
    public void w(long j6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f53590v = j6;
            p171r0.S.f53505a.c(this.f53573e, p141o0.A0.k(j6));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public float x() {
        return this.f53565A;
    }

    @Override // p171r0.InterfaceC7055e
    public void y(android.graphics.Outline outline, long j6) {
        this.f53578j = j6;
        this.f53573e.setOutline(outline);
        this.f53577i = outline != null;
        O();
    }

    @Override // p171r0.InterfaceC7055e
    public float z() {
        return this.f53587s;
    }
}
