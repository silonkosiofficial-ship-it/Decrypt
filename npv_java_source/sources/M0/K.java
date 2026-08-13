package M0;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f6654g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.J f6655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.C1338j f6656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f6658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f6659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f6660f;

    private K(M0.J j6, M0.C1338j c1338j, long j10) {
        this.f6655a = j6;
        this.f6656b = c1338j;
        this.f6657c = j10;
        this.f6658d = c1338j.g();
        this.f6659e = c1338j.k();
        this.f6660f = c1338j.y();
    }

    public /* synthetic */ K(M0.J j6, M0.C1338j c1338j, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, c1338j, j10);
    }

    public static /* synthetic */ M0.K b(M0.K k6, M0.J j6, long j10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            j6 = k6.f6655a;
        }
        if ((i6 & 2) != 0) {
            j10 = k6.f6657c;
        }
        return k6.a(j6, j10);
    }

    public static /* synthetic */ int p(M0.K k6, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return k6.o(i6, z6);
    }

    public final java.util.List A() {
        return this.f6660f;
    }

    public final long B() {
        return this.f6657c;
    }

    public final long C(int i6) {
        return this.f6656b.B(i6);
    }

    public final M0.K a(M0.J j6, long j10) {
        return new M0.K(j6, this.f6656b, j10, null);
    }

    public final X0.i c(int i6) {
        return this.f6656b.c(i6);
    }

    public final p131n0.i d(int i6) {
        return this.f6656b.d(i6);
    }

    public final p131n0.i e(int i6) {
        return this.f6656b.e(i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.K)) {
            return false;
        }
        M0.K k6 = (M0.K) obj;
        return p247y7.AbstractC7350t.b(this.f6655a, k6.f6655a) && p247y7.AbstractC7350t.b(this.f6656b, k6.f6656b) && Y0.t.e(this.f6657c, k6.f6657c) && this.f6658d == k6.f6658d && this.f6659e == k6.f6659e && p247y7.AbstractC7350t.b(this.f6660f, k6.f6660f);
    }

    public final boolean f() {
        return this.f6656b.f() || ((float) Y0.t.f(this.f6657c)) < this.f6656b.h();
    }

    public final boolean g() {
        return ((float) Y0.t.g(this.f6657c)) < this.f6656b.A();
    }

    public final float h() {
        return this.f6658d;
    }

    public int hashCode() {
        return (((((((((this.f6655a.hashCode() * 31) + this.f6656b.hashCode()) * 31) + Y0.t.h(this.f6657c)) * 31) + java.lang.Float.floatToIntBits(this.f6658d)) * 31) + java.lang.Float.floatToIntBits(this.f6659e)) * 31) + this.f6660f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i6, boolean z6) {
        return this.f6656b.i(i6, z6);
    }

    public final float k() {
        return this.f6659e;
    }

    public final M0.J l() {
        return this.f6655a;
    }

    public final float m(int i6) {
        return this.f6656b.l(i6);
    }

    public final int n() {
        return this.f6656b.m();
    }

    public final int o(int i6, boolean z6) {
        return this.f6656b.n(i6, z6);
    }

    public final int q(int i6) {
        return this.f6656b.o(i6);
    }

    public final int r(float f6) {
        return this.f6656b.p(f6);
    }

    public final float s(int i6) {
        return this.f6656b.q(i6);
    }

    public final float t(int i6) {
        return this.f6656b.r(i6);
    }

    public java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.f6655a + ", multiParagraph=" + this.f6656b + ", size=" + ((java.lang.Object) Y0.t.i(this.f6657c)) + ", firstBaseline=" + this.f6658d + ", lastBaseline=" + this.f6659e + ", placeholderRects=" + this.f6660f + ')';
    }

    public final int u(int i6) {
        return this.f6656b.s(i6);
    }

    public final float v(int i6) {
        return this.f6656b.t(i6);
    }

    public final M0.C1338j w() {
        return this.f6656b;
    }

    public final int x(long j6) {
        return this.f6656b.u(j6);
    }

    public final X0.i y(int i6) {
        return this.f6656b.v(i6);
    }

    public final p141o0.Q1 z(int i6, int i10) {
        return this.f6656b.x(i6, i10);
    }
}
