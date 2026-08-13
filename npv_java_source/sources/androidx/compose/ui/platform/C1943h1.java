package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1943h1 implements androidx.compose.ui.platform.InterfaceC1974s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f20116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.RenderNode f20117b = p210v.AbstractC7222p.a("Compose");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20118c = androidx.compose.ui.graphics.a.f19739a.a();

    public C1943h1(androidx.compose.ui.platform.r rVar) {
        this.f20116a = rVar;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean A() {
        return this.f20117b.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int B() {
        return this.f20117b.getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void C(int i6) {
        this.f20117b.setAmbientShadowColor(i6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean D() {
        return this.f20117b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void E(boolean z6) {
        this.f20117b.setClipToOutline(z6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean F(boolean z6) {
        return this.f20117b.setHasOverlappingRendering(z6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void G(p141o0.C6995r0 c6995r0, p141o0.Q1 q6, p237x7.l lVar) {
        android.graphics.RecordingCanvas recordingCanvasBeginRecording = this.f20117b.beginRecording();
        android.graphics.Canvas canvasA = c6995r0.a().a();
        c6995r0.a().w(recordingCanvasBeginRecording);
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
        this.f20117b.endRecording();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void H(int i6) {
        this.f20117b.setSpotShadowColor(i6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void I(android.graphics.Matrix matrix) {
        this.f20117b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public float J() {
        return this.f20117b.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public float a() {
        return this.f20117b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void b(float f6) {
        this.f20117b.setAlpha(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void c(float f6) {
        this.f20117b.setRotationY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void d(float f6) {
        this.f20117b.setRotationZ(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void e(float f6) {
        this.f20117b.setTranslationY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int f() {
        return this.f20117b.getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void g(float f6) {
        this.f20117b.setScaleY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int getHeight() {
        return this.f20117b.getHeight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int getWidth() {
        return this.f20117b.getWidth();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void h(float f6) {
        this.f20117b.setScaleX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void i() {
        this.f20117b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void j(float f6) {
        this.f20117b.setTranslationX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean k() {
        return this.f20117b.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void l(p141o0.Z1 z6) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.C1946i1.f20121a.a(this.f20117b, z6);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void m(float f6) {
        this.f20117b.setCameraDistance(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void n(float f6) {
        this.f20117b.setRotationX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int o() {
        return this.f20117b.getRight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void p(int i6) {
        this.f20117b.offsetLeftAndRight(i6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void q(int i6) {
        android.graphics.RenderNode renderNode = this.f20117b;
        androidx.compose.ui.graphics.a.C0377a c0377a = androidx.compose.ui.graphics.a.f19739a;
        if (!androidx.compose.ui.graphics.a.e(i6, c0377a.c())) {
            boolean zE = androidx.compose.ui.graphics.a.e(i6, c0377a.b());
            renderNode.setUseCompositingLayer(false, null);
            if (zE) {
                renderNode.setHasOverlappingRendering(false);
            }
            this.f20118c = i6;
        }
        renderNode.setUseCompositingLayer(true, null);
        renderNode.setHasOverlappingRendering(true);
        this.f20118c = i6;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public int r() {
        return this.f20117b.getBottom();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void s(android.graphics.Canvas canvas) {
        canvas.drawRenderNode(this.f20117b);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void t(float f6) {
        this.f20117b.setPivotX(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void u(boolean z6) {
        this.f20117b.setClipToBounds(z6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public boolean v(int i6, int i10, int i11, int i12) {
        return this.f20117b.setPosition(i6, i10, i11, i12);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void w(float f6) {
        this.f20117b.setPivotY(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void x(float f6) {
        this.f20117b.setElevation(f6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void y(int i6) {
        this.f20117b.offsetTopAndBottom(i6);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1974s0
    public void z(android.graphics.Outline outline) {
        this.f20117b.setOutline(outline);
    }
}
