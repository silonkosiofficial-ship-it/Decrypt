package M0;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M0.P.a f6669d = new M0.P.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final M0.P f6670e = new M0.P(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C f6671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.v f6672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.A f6673c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final M0.P a() {
            return M0.P.f6670e;
        }
    }

    private P(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, p161q0.h hVar2, int i6, int i10, long j13, X0.r rVar, M0.A a6, X0.h hVar3, int i11, int i12, X0.t tVar) {
        this(new M0.C(j6, j10, qVar, oVar, pVar, abstractC1494h, str, j11, aVar, pVar2, hVar, j12, kVar, c2Var, a6 != null ? a6.b() : null, hVar2, (p247y7.AbstractC7342k) null), new M0.v(i6, i10, j13, rVar, a6 != null ? a6.a() : null, hVar3, i11, i12, tVar, null), a6);
    }

    public /* synthetic */ P(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, p161q0.h hVar2, int i6, int i10, long j13, X0.r rVar, M0.A a6, X0.h hVar3, int i11, int i12, X0.t tVar, int i13, p247y7.AbstractC7342k abstractC7342k) {
        this((i13 & 1) != 0 ? p141o0.C7016y0.f52264b.g() : j6, (i13 & 2) != 0 ? Y0.x.f16237b.a() : j10, (i13 & 4) != 0 ? null : qVar, (i13 & 8) != 0 ? null : oVar, (i13 & 16) != 0 ? null : pVar, (i13 & 32) != 0 ? null : abstractC1494h, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? Y0.x.f16237b.a() : j11, (i13 & 256) != 0 ? null : aVar, (i13 & 512) != 0 ? null : pVar2, (i13 & 1024) != 0 ? null : hVar, (i13 & 2048) != 0 ? p141o0.C7016y0.f52264b.g() : j12, (i13 & 4096) != 0 ? null : kVar, (i13 & 8192) != 0 ? null : c2Var, (i13 & 16384) != 0 ? null : hVar2, (i13 & 32768) != 0 ? X0.j.f15622b.g() : i6, (i13 & 65536) != 0 ? X0.l.f15636b.f() : i10, (i13 & 131072) != 0 ? Y0.x.f16237b.a() : j13, (i13 & 262144) != 0 ? null : rVar, (i13 & 524288) != 0 ? null : a6, (i13 & 1048576) != 0 ? null : hVar3, (i13 & 2097152) != 0 ? X0.f.f15584b.b() : i11, (i13 & 4194304) != 0 ? X0.e.f15579b.c() : i12, (i13 & 8388608) != 0 ? null : tVar, null);
    }

    public /* synthetic */ P(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, p161q0.h hVar2, int i6, int i10, long j13, X0.r rVar, M0.A a6, X0.h hVar3, int i11, int i12, X0.t tVar, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, qVar, oVar, pVar, abstractC1494h, str, j11, aVar, pVar2, hVar, j12, kVar, c2Var, hVar2, i6, i10, j13, rVar, a6, hVar3, i11, i12, tVar);
    }

    public P(M0.C c6, M0.v vVar) {
        this(c6, vVar, M0.Q.b(c6.q(), vVar.g()));
    }

    public P(M0.C c6, M0.v vVar, M0.A a6) {
        this.f6671a = c6;
        this.f6672b = vVar;
        this.f6673c = a6;
    }

    public final X0.k A() {
        return this.f6671a.s();
    }

    public final int B() {
        return this.f6672b.i();
    }

    public final X0.p C() {
        return this.f6671a.u();
    }

    public final X0.r D() {
        return this.f6672b.j();
    }

    public final X0.t E() {
        return this.f6672b.k();
    }

    public final boolean F(M0.P p6) {
        return this == p6 || this.f6671a.w(p6.f6671a);
    }

    public final boolean G(M0.P p6) {
        return this == p6 || (p247y7.AbstractC7350t.b(this.f6672b, p6.f6672b) && this.f6671a.v(p6.f6671a));
    }

    public final M0.P H(M0.v vVar) {
        return new M0.P(M(), L().l(vVar));
    }

    public final M0.P I(M0.P p6) {
        return (p6 == null || p247y7.AbstractC7350t.b(p6, f6670e)) ? this : new M0.P(M().x(p6.M()), L().l(p6.L()));
    }

    public final M0.P J(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, p161q0.h hVar2, int i6, int i10, long j13, X0.r rVar, X0.h hVar3, int i11, int i12, M0.A a6, X0.t tVar) {
        M0.C cB = M0.D.b(this.f6671a, j6, null, Float.NaN, j10, qVar, oVar, pVar, abstractC1494h, str, j11, aVar, pVar2, hVar, j12, kVar, c2Var, a6 != null ? a6.b() : null, hVar2);
        M0.v vVarA = M0.w.a(this.f6672b, i6, i10, j13, rVar, a6 != null ? a6.a() : null, hVar3, i11, i12, tVar);
        return (this.f6671a == cB && this.f6672b == vVarA) ? this : new M0.P(cB, vVarA);
    }

    public final M0.v L() {
        return this.f6672b;
    }

    public final M0.C M() {
        return this.f6671a;
    }

    public final M0.P b(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, p161q0.h hVar2, int i6, int i10, long j13, X0.r rVar, M0.A a6, X0.h hVar3, int i11, int i12, X0.t tVar) {
        return new M0.P(new M0.C(p141o0.C7016y0.o(j6, this.f6671a.g()) ? this.f6671a.t() : X0.o.f15646a.b(j6), j10, qVar, oVar, pVar, abstractC1494h, str, j11, aVar, pVar2, hVar, j12, kVar, c2Var, a6 != null ? a6.b() : null, hVar2, (p247y7.AbstractC7342k) null), new M0.v(i6, i10, j13, rVar, a6 != null ? a6.a() : null, hVar3, i11, i12, tVar, null), a6);
    }

    public final float d() {
        return this.f6671a.c();
    }

    public final long e() {
        return this.f6671a.d();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.P)) {
            return false;
        }
        M0.P p6 = (M0.P) obj;
        return p247y7.AbstractC7350t.b(this.f6671a, p6.f6671a) && p247y7.AbstractC7350t.b(this.f6672b, p6.f6672b) && p247y7.AbstractC7350t.b(this.f6673c, p6.f6673c);
    }

    public final X0.a f() {
        return this.f6671a.e();
    }

    public final p141o0.AbstractC6984n0 g() {
        return this.f6671a.f();
    }

    public final long h() {
        return this.f6671a.g();
    }

    public int hashCode() {
        int iHashCode = ((this.f6671a.hashCode() * 31) + this.f6672b.hashCode()) * 31;
        M0.A a6 = this.f6673c;
        return iHashCode + (a6 != null ? a6.hashCode() : 0);
    }

    public final p161q0.h i() {
        return this.f6671a.h();
    }

    public final R0.AbstractC1494h j() {
        return this.f6671a.i();
    }

    public final java.lang.String k() {
        return this.f6671a.j();
    }

    public final long l() {
        return this.f6671a.k();
    }

    public final R0.o m() {
        return this.f6671a.l();
    }

    public final R0.p n() {
        return this.f6671a.m();
    }

    public final R0.q o() {
        return this.f6671a.n();
    }

    public final int p() {
        return this.f6672b.c();
    }

    public final long q() {
        return this.f6671a.o();
    }

    public final int r() {
        return this.f6672b.d();
    }

    public final long s() {
        return this.f6672b.e();
    }

    public final X0.h t() {
        return this.f6672b.f();
    }

    public java.lang.String toString() {
        return "TextStyle(color=" + ((java.lang.Object) p141o0.C7016y0.v(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((java.lang.Object) Y0.x.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((java.lang.Object) Y0.x.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((java.lang.Object) p141o0.C7016y0.v(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + ((java.lang.Object) X0.j.m(z())) + ", textDirection=" + ((java.lang.Object) X0.l.l(B())) + ", lineHeight=" + ((java.lang.Object) Y0.x.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.f6673c + ", lineHeightStyle=" + t() + ", lineBreak=" + ((java.lang.Object) X0.f.k(r())) + ", hyphens=" + ((java.lang.Object) X0.e.i(p())) + ", textMotion=" + E() + ')';
    }

    public final T0.h u() {
        return this.f6671a.p();
    }

    public final M0.v v() {
        return this.f6672b;
    }

    public final M0.A w() {
        return this.f6673c;
    }

    public final p141o0.c2 x() {
        return this.f6671a.r();
    }

    public final M0.C y() {
        return this.f6671a;
    }

    public final int z() {
        return this.f6672b.h();
    }
}
