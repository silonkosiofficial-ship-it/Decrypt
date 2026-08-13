package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements p141o0.InterfaceC6993q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.graphics.Canvas f52125a = p141o0.H.f52128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.graphics.Rect f52126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.Rect f52127c;

    public final android.graphics.Canvas a() {
        return this.f52125a;
    }

    @Override // p141o0.InterfaceC6993q0
    public void b(p141o0.Q1 q6, int i6) {
        android.graphics.Canvas canvas = this.f52125a;
        if (!(q6 instanceof p141o0.V)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((p141o0.V) q6).s(), x(i6));
    }

    @Override // p141o0.InterfaceC6993q0
    public void c(float f6, float f10, float f11, float f12, int i6) {
        this.f52125a.clipRect(f6, f10, f11, f12, x(i6));
    }

    @Override // p141o0.InterfaceC6993q0
    public void d(float f6, float f10) {
        this.f52125a.translate(f6, f10);
    }

    @Override // p141o0.InterfaceC6993q0
    public /* synthetic */ void e(p131n0.i iVar, int i6) {
        p141o0.AbstractC6990p0.a(this, iVar, i6);
    }

    @Override // p141o0.InterfaceC6993q0
    public void f(long j6, float f6, p141o0.N1 n6) {
        this.f52125a.drawCircle(p131n0.g.m(j6), p131n0.g.n(j6), f6, n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void g(float f6, float f10) {
        this.f52125a.scale(f6, f10);
    }

    @Override // p141o0.InterfaceC6993q0
    public void h(float f6, float f10, float f11, float f12, float f13, float f14, boolean z6, p141o0.N1 n6) {
        this.f52125a.drawArc(f6, f10, f11, f12, f13, f14, z6, n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void i(float f6) {
        this.f52125a.rotate(f6);
    }

    @Override // p141o0.InterfaceC6993q0
    public void j(p141o0.E1 e6, long j6, long j10, long j11, long j12, p141o0.N1 n6) {
        if (this.f52126b == null) {
            this.f52126b = new android.graphics.Rect();
            this.f52127c = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.f52125a;
        android.graphics.Bitmap bitmapB = p141o0.Q.b(e6);
        android.graphics.Rect rect = this.f52126b;
        p247y7.AbstractC7350t.c(rect);
        rect.left = Y0.p.h(j6);
        rect.top = Y0.p.i(j6);
        rect.right = Y0.p.h(j6) + Y0.t.g(j10);
        rect.bottom = Y0.p.i(j6) + Y0.t.f(j10);
        p087i7.M m6 = p087i7.M.f46721a;
        android.graphics.Rect rect2 = this.f52127c;
        p247y7.AbstractC7350t.c(rect2);
        rect2.left = Y0.p.h(j11);
        rect2.top = Y0.p.i(j11);
        rect2.right = Y0.p.h(j11) + Y0.t.g(j12);
        rect2.bottom = Y0.p.i(j11) + Y0.t.f(j12);
        canvas.drawBitmap(bitmapB, rect, rect2, n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public /* synthetic */ void k(p131n0.i iVar, p141o0.N1 n6) {
        p141o0.AbstractC6990p0.b(this, iVar, n6);
    }

    @Override // p141o0.InterfaceC6993q0
    public void l(float f6, float f10, float f11, float f12, p141o0.N1 n6) {
        this.f52125a.drawRect(f6, f10, f11, f12, n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void m() {
        this.f52125a.save();
    }

    @Override // p141o0.InterfaceC6993q0
    public void n() {
        p141o0.C7001t0.f52252a.a(this.f52125a, false);
    }

    @Override // p141o0.InterfaceC6993q0
    public void o(float[] fArr) {
        if (p141o0.K1.c(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        p141o0.S.a(matrix, fArr);
        this.f52125a.concat(matrix);
    }

    @Override // p141o0.InterfaceC6993q0
    public void p(float f6, float f10, float f11, float f12, float f13, float f14, p141o0.N1 n6) {
        this.f52125a.drawRoundRect(f6, f10, f11, f12, f13, f14, n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void q(p141o0.E1 e6, long j6, p141o0.N1 n6) {
        this.f52125a.drawBitmap(p141o0.Q.b(e6), p131n0.g.m(j6), p131n0.g.n(j6), n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void r(long j6, long j10, p141o0.N1 n6) {
        this.f52125a.drawLine(p131n0.g.m(j6), p131n0.g.n(j6), p131n0.g.m(j10), p131n0.g.n(j10), n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void s() {
        this.f52125a.restore();
    }

    @Override // p141o0.InterfaceC6993q0
    public void t(p141o0.Q1 q6, p141o0.N1 n6) {
        android.graphics.Canvas canvas = this.f52125a;
        if (!(q6 instanceof p141o0.V)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((p141o0.V) q6).s(), n6.w());
    }

    @Override // p141o0.InterfaceC6993q0
    public void u(p131n0.i iVar, p141o0.N1 n6) {
        this.f52125a.saveLayer(iVar.i(), iVar.l(), iVar.j(), iVar.e(), n6.w(), 31);
    }

    @Override // p141o0.InterfaceC6993q0
    public void v() {
        p141o0.C7001t0.f52252a.a(this.f52125a, true);
    }

    public final void w(android.graphics.Canvas canvas) {
        this.f52125a = canvas;
    }

    public final android.graphics.Region.Op x(int i6) {
        return p141o0.AbstractC7013x0.d(i6, p141o0.AbstractC7013x0.f52260a.a()) ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT;
    }
}
