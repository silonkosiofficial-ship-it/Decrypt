package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class T implements p141o0.N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.graphics.Paint f52159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.Shader f52161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f52162d;

    public T() {
        this(p141o0.U.j());
    }

    public T(android.graphics.Paint paint) {
        this.f52159a = paint;
        this.f52160b = p141o0.AbstractC6960f0.f52197a.B();
    }

    @Override // p141o0.N1
    public void A(p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f52162d = abstractC7019z0;
        p141o0.U.n(this.f52159a, abstractC7019z0);
    }

    @Override // p141o0.N1
    public void B(int i6) {
        p141o0.U.o(this.f52159a, i6);
    }

    @Override // p141o0.N1
    public int C() {
        return p141o0.U.e(this.f52159a);
    }

    @Override // p141o0.N1
    public int D() {
        return p141o0.U.f(this.f52159a);
    }

    @Override // p141o0.N1
    public void E(int i6) {
        p141o0.U.s(this.f52159a, i6);
    }

    @Override // p141o0.N1
    public void F(int i6) {
        p141o0.U.v(this.f52159a, i6);
    }

    @Override // p141o0.N1
    public void G(long j6) {
        p141o0.U.m(this.f52159a, j6);
    }

    @Override // p141o0.N1
    public p141o0.R1 H() {
        return null;
    }

    @Override // p141o0.N1
    public void I(float f6) {
        p141o0.U.u(this.f52159a, f6);
    }

    @Override // p141o0.N1
    public float J() {
        return p141o0.U.i(this.f52159a);
    }

    @Override // p141o0.N1
    public float a() {
        return p141o0.U.c(this.f52159a);
    }

    @Override // p141o0.N1
    public void b(float f6) {
        p141o0.U.k(this.f52159a, f6);
    }

    @Override // p141o0.N1
    public long c() {
        return p141o0.U.d(this.f52159a);
    }

    @Override // p141o0.N1
    public p141o0.AbstractC7019z0 f() {
        return this.f52162d;
    }

    @Override // p141o0.N1
    public int q() {
        return this.f52160b;
    }

    @Override // p141o0.N1
    public int r() {
        return p141o0.U.g(this.f52159a);
    }

    @Override // p141o0.N1
    public void s(int i6) {
        p141o0.U.r(this.f52159a, i6);
    }

    @Override // p141o0.N1
    public void t(p141o0.R1 r6) {
        p141o0.U.p(this.f52159a, r6);
    }

    @Override // p141o0.N1
    public void u(int i6) {
        if (p141o0.AbstractC6960f0.E(this.f52160b, i6)) {
            return;
        }
        this.f52160b = i6;
        p141o0.U.l(this.f52159a, i6);
    }

    @Override // p141o0.N1
    public float v() {
        return p141o0.U.h(this.f52159a);
    }

    @Override // p141o0.N1
    public android.graphics.Paint w() {
        return this.f52159a;
    }

    @Override // p141o0.N1
    public void x(android.graphics.Shader shader) {
        this.f52161c = shader;
        p141o0.U.q(this.f52159a, shader);
    }

    @Override // p141o0.N1
    public android.graphics.Shader y() {
        return this.f52161c;
    }

    @Override // p141o0.N1
    public void z(float f6) {
        p141o0.U.t(this.f52159a, f6);
    }
}
