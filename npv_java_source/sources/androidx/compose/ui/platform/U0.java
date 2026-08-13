package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements androidx.compose.ui.platform.InterfaceC1974s0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f20014k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f20016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.RenderNode f20017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.compose.ui.platform.U0.a f20012i = new androidx.compose.ui.platform.U0.a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20013j = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f20015l = true;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public U0(androidx.compose.ui.platform.r rVar) {
        this.f20016a = rVar;
        android.view.RenderNode renderNodeCreate = android.view.RenderNode.create("Compose", rVar);
        this.f20017b = renderNodeCreate;
        this.f20018c = androidx.compose.ui.graphics.a.f19739a.a();
        if (f20015l) {
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
            P(renderNodeCreate);
            K();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f20015l = false;
        }
        if (f20014k) {
            throw new java.lang.NoClassDefFoundError();
        }
    }

    private final void K() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.compose.ui.platform.C1955l1.f20147a.a(this.f20017b);
        } else {
            androidx.compose.ui.platform.C1952k1.f20146a.a(this.f20017b);
        }
    }

    private final void P(android.view.RenderNode renderNode) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.C1958m1 c1958m1 = androidx.compose.ui.platform.C1958m1.f20148a;
            c1958m1.c(renderNode, c1958m1.a(renderNode));
            c1958m1.d(renderNode, c1958m1.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean A() {
        return this.f20023h;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int B() {
        return this.f20020e;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void C(int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.C1958m1.f20148a.c(this.f20017b, i6);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean D() {
        return this.f20017b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void E(boolean z6) {
        this.f20017b.setClipToOutline(z6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean F(boolean z6) {
        return this.f20017b.setHasOverlappingRendering(z6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void G(p141o0.C6995r0 c6995r0, p141o0.Q1 q6, p237x7.l lVar) {
        android.view.DisplayListCanvas displayListCanvasStart = this.f20017b.start(getWidth(), getHeight());
        android.graphics.Canvas canvasA = c6995r0.a().a();
        c6995r0.a().w((android.graphics.Canvas) displayListCanvasStart);
        p141o0.G gA = c6995r0.a();
        if (q6 != null) {
            gA.m();
            p141o0.AbstractC6990p0.c(gA, q6, 0, 2, null);
        }
        lVar.l(gA);
        if (q6 != null) {
            gA.s();
        }
        c6995r0.a().w(canvasA);
        this.f20017b.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void H(int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.C1958m1.f20148a.d(this.f20017b, i6);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void I(android.graphics.Matrix matrix) {
        this.f20017b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public float J() {
        return this.f20017b.getElevation();
    }

    public void L(int i6) {
        this.f20022g = i6;
    }

    public void M(int i6) {
        this.f20019d = i6;
    }

    public void N(int i6) {
        this.f20021f = i6;
    }

    public void O(int i6) {
        this.f20020e = i6;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public float a() {
        return this.f20017b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void b(float f6) {
        this.f20017b.setAlpha(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void c(float f6) {
        this.f20017b.setRotationY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void d(float f6) {
        this.f20017b.setRotation(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void e(float f6) {
        this.f20017b.setTranslationY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int f() {
        return this.f20019d;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void g(float f6) {
        this.f20017b.setScaleY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int getHeight() {
        return r() - B();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int getWidth() {
        return o() - f();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void h(float f6) {
        this.f20017b.setScaleX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void i() {
        K();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void j(float f6) {
        this.f20017b.setTranslationX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean k() {
        return this.f20017b.isValid();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void l(p141o0.Z1 z6) {
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void m(float f6) {
        this.f20017b.setCameraDistance(-f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void n(float f6) {
        this.f20017b.setRotationX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int o() {
        return this.f20021f;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void p(int i6) {
        M(f() + i6);
        N(o() + i6);
        this.f20017b.offsetLeftAndRight(i6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void q(int i6) {
        int i10;
        android.view.RenderNode renderNode;
        androidx.compose.ui.graphics.a.C0377a c0377a = androidx.compose.ui.graphics.a.f19739a;
        if (!androidx.compose.ui.graphics.a.e(i6, c0377a.c())) {
            i10 = 0;
            if (androidx.compose.ui.graphics.a.e(i6, c0377a.b())) {
                this.f20017b.setLayerType(0);
                this.f20017b.setHasOverlappingRendering(false);
            } else {
                renderNode = this.f20017b;
            }
            this.f20018c = i6;
        }
        renderNode = this.f20017b;
        i10 = 2;
        renderNode.setLayerType(i10);
        this.f20017b.setHasOverlappingRendering(true);
        this.f20018c = i6;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int r() {
        return this.f20022g;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void s(android.graphics.Canvas canvas) {
        p247y7.AbstractC7350t.d(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((android.view.DisplayListCanvas) canvas).drawRenderNode(this.f20017b);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void t(float f6) {
        this.f20017b.setPivotX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void u(boolean z6) {
        this.f20023h = z6;
        this.f20017b.setClipToBounds(z6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean v(int i6, int i10, int i11, int i12) {
        M(i6);
        O(i10);
        N(i11);
        L(i12);
        return this.f20017b.setLeftTopRightBottom(i6, i10, i11, i12);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void w(float f6) {
        this.f20017b.setPivotY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void x(float f6) {
        this.f20017b.setElevation(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void y(int i6) {
        O(B() + i6);
        L(r() + i6);
        this.f20017b.offsetTopAndBottom(i6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void z(android.graphics.Outline outline) {
        this.f20017b.setOutline(outline);
    }
}
