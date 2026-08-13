package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements p171r0.InterfaceC7055e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f53431A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f53432B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f53433C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.C6995r0 f53435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p161q0.a f53436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.graphics.RenderNode f53437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.graphics.Paint f53439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.graphics.Matrix f53440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f53442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f53444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f53446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f53447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f53448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f53449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f53450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f53451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f53452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f53453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f53454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f53455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f53456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f53457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f53458z;

    public E(long j6, p141o0.C6995r0 c6995r0, p161q0.a aVar) {
        this.f53434b = j6;
        this.f53435c = c6995r0;
        this.f53436d = aVar;
        android.graphics.RenderNode renderNodeA = p210v.AbstractC7222p.a("graphicsLayer");
        this.f53437e = renderNodeA;
        this.f53438f = p131n0.m.f51333b.b();
        renderNodeA.setClipToBounds(false);
        p171r0.AbstractC7052b.a aVar2 = p171r0.AbstractC7052b.f53526a;
        P(renderNodeA, aVar2.a());
        this.f53442j = 1.0f;
        this.f53443k = p141o0.AbstractC6960f0.f52197a.B();
        this.f53445m = p131n0.g.f51312b.b();
        this.f53446n = 1.0f;
        this.f53447o = 1.0f;
        p141o0.C7016y0.a aVar3 = p141o0.C7016y0.f52264b;
        this.f53451s = aVar3.a();
        this.f53452t = aVar3.a();
        this.f53456x = 8.0f;
        this.f53432B = aVar2.a();
        this.f53433C = true;
    }

    public /* synthetic */ E(long j6, p141o0.C6995r0 c6995r0, p161q0.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, (i6 & 2) != 0 ? new p141o0.C6995r0() : c6995r0, (i6 & 4) != 0 ? new p161q0.a() : aVar);
    }

    private final void O() {
        boolean z6 = false;
        boolean z10 = Q() && !this.f53441i;
        if (Q() && this.f53441i) {
            z6 = true;
        }
        if (z10 != this.f53458z) {
            this.f53458z = z10;
            this.f53437e.setClipToBounds(z10);
        }
        if (z6 != this.f53431A) {
            this.f53431A = z6;
            this.f53437e.setClipToOutline(z6);
        }
    }

    private final void P(android.graphics.RenderNode renderNode, int i6) {
        p171r0.AbstractC7052b.a aVar = p171r0.AbstractC7052b.f53526a;
        if (p171r0.AbstractC7052b.e(i6, aVar.c())) {
            renderNode.setUseCompositingLayer(true, this.f53439g);
        } else {
            if (p171r0.AbstractC7052b.e(i6, aVar.b())) {
                renderNode.setUseCompositingLayer(false, this.f53439g);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
            renderNode.setUseCompositingLayer(false, this.f53439g);
        }
        renderNode.setHasOverlappingRendering(true);
    }

    private final boolean R() {
        if (p171r0.AbstractC7052b.e(C(), p171r0.AbstractC7052b.f53526a.c()) || S()) {
            return true;
        }
        t();
        return false;
    }

    private final boolean S() {
        return (p141o0.AbstractC6960f0.E(q(), p141o0.AbstractC6960f0.f52197a.B()) && f() == null) ? false : true;
    }

    private final void T() {
        android.graphics.RenderNode renderNode;
        int iC;
        if (R()) {
            renderNode = this.f53437e;
            iC = p171r0.AbstractC7052b.f53526a.c();
        } else {
            renderNode = this.f53437e;
            iC = C();
        }
        P(renderNode, iC);
    }

    @Override // p171r0.InterfaceC7055e
    public void A(boolean z6) {
        this.f53457y = z6;
        O();
    }

    @Override // p171r0.InterfaceC7055e
    public float B() {
        return this.f53453u;
    }

    @Override // p171r0.InterfaceC7055e
    public int C() {
        return this.f53432B;
    }

    @Override // p171r0.InterfaceC7055e
    public void D(long j6) {
        this.f53452t = j6;
        this.f53437e.setSpotShadowColor(p141o0.A0.k(j6));
    }

    @Override // p171r0.InterfaceC7055e
    public float E() {
        return this.f53447o;
    }

    @Override // p171r0.InterfaceC7055e
    public void F(int i6, int i10, long j6) {
        this.f53437e.setPosition(i6, i10, Y0.t.g(j6) + i6, Y0.t.f(j6) + i10);
        this.f53438f = Y0.u.d(j6);
    }

    @Override // p171r0.InterfaceC7055e
    public void G(long j6) {
        this.f53445m = j6;
        if (p131n0.h.d(j6)) {
            this.f53437e.resetPivot();
        } else {
            this.f53437e.setPivotX(p131n0.g.m(j6));
            this.f53437e.setPivotY(p131n0.g.n(j6));
        }
    }

    @Override // p171r0.InterfaceC7055e
    public long H() {
        return this.f53451s;
    }

    @Override // p171r0.InterfaceC7055e
    public void I(Y0.e eVar, Y0.v vVar, p171r0.C7053c c7053c, p237x7.l lVar) {
        android.graphics.RecordingCanvas recordingCanvasBeginRecording = this.f53437e.beginRecording();
        try {
            p141o0.C6995r0 c6995r0 = this.f53435c;
            android.graphics.Canvas canvasA = c6995r0.a().a();
            c6995r0.a().w(recordingCanvasBeginRecording);
            p141o0.G gA = c6995r0.a();
            p161q0.d dVarF0 = this.f53436d.F0();
            dVarF0.a(eVar);
            dVarF0.b(vVar);
            dVarF0.e(c7053c);
            dVarF0.d(this.f53438f);
            dVarF0.g(gA);
            lVar.l(this.f53436d);
            c6995r0.a().w(canvasA);
            this.f53437e.endRecording();
            s(false);
        } catch (java.lang.Throwable th) {
            this.f53437e.endRecording();
            throw th;
        }
    }

    @Override // p171r0.InterfaceC7055e
    public long J() {
        return this.f53452t;
    }

    @Override // p171r0.InterfaceC7055e
    public void K(int i6) {
        this.f53432B = i6;
        T();
    }

    @Override // p171r0.InterfaceC7055e
    public android.graphics.Matrix L() {
        android.graphics.Matrix matrix = this.f53440h;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.f53440h = matrix;
        }
        this.f53437e.getMatrix(matrix);
        return matrix;
    }

    @Override // p171r0.InterfaceC7055e
    public float M() {
        return this.f53450r;
    }

    @Override // p171r0.InterfaceC7055e
    public void N(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        p141o0.H.d(interfaceC6993q0).drawRenderNode(this.f53437e);
    }

    public boolean Q() {
        return this.f53457y;
    }

    @Override // p171r0.InterfaceC7055e
    public float a() {
        return this.f53442j;
    }

    @Override // p171r0.InterfaceC7055e
    public void b(float f6) {
        this.f53442j = f6;
        this.f53437e.setAlpha(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void c(float f6) {
        this.f53454v = f6;
        this.f53437e.setRotationY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void d(float f6) {
        this.f53455w = f6;
        this.f53437e.setRotationZ(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void e(float f6) {
        this.f53449q = f6;
        this.f53437e.setTranslationY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public p141o0.AbstractC7019z0 f() {
        return this.f53444l;
    }

    @Override // p171r0.InterfaceC7055e
    public void g(float f6) {
        this.f53447o = f6;
        this.f53437e.setScaleY(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void h(float f6) {
        this.f53446n = f6;
        this.f53437e.setScaleX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void i() {
        this.f53437e.discardDisplayList();
    }

    @Override // p171r0.InterfaceC7055e
    public void j(float f6) {
        this.f53448p = f6;
        this.f53437e.setTranslationX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public boolean k() {
        return this.f53437e.hasDisplayList();
    }

    @Override // p171r0.InterfaceC7055e
    public void l(p141o0.Z1 z6) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            p171r0.T.f53506a.a(this.f53437e, z6);
        }
    }

    @Override // p171r0.InterfaceC7055e
    public void m(float f6) {
        this.f53456x = f6;
        this.f53437e.setCameraDistance(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public void n(float f6) {
        this.f53453u = f6;
        this.f53437e.setRotationX(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public float o() {
        return this.f53446n;
    }

    @Override // p171r0.InterfaceC7055e
    public void p(float f6) {
        this.f53450r = f6;
        this.f53437e.setElevation(f6);
    }

    @Override // p171r0.InterfaceC7055e
    public int q() {
        return this.f53443k;
    }

    @Override // p171r0.InterfaceC7055e
    public float r() {
        return this.f53454v;
    }

    @Override // p171r0.InterfaceC7055e
    public void s(boolean z6) {
        this.f53433C = z6;
    }

    @Override // p171r0.InterfaceC7055e
    public p141o0.Z1 t() {
        return null;
    }

    @Override // p171r0.InterfaceC7055e
    public float u() {
        return this.f53455w;
    }

    @Override // p171r0.InterfaceC7055e
    public float v() {
        return this.f53449q;
    }

    @Override // p171r0.InterfaceC7055e
    public void w(long j6) {
        this.f53451s = j6;
        this.f53437e.setAmbientShadowColor(p141o0.A0.k(j6));
    }

    @Override // p171r0.InterfaceC7055e
    public float x() {
        return this.f53456x;
    }

    @Override // p171r0.InterfaceC7055e
    public void y(android.graphics.Outline outline, long j6) {
        this.f53437e.setOutline(outline);
        this.f53441i = outline != null;
        O();
    }

    @Override // p171r0.InterfaceC7055e
    public float z() {
        return this.f53448p;
    }
}
