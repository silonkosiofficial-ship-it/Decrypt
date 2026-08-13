package p230x;

/* JADX INFO: loaded from: classes.dex */
final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p230x.s f56422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f56423b = p131n0.g.f51312b.c();

    public H(p230x.s sVar) {
        this.f56422a = sVar;
    }

    private final long b(float f6) {
        if (this.f56422a == null) {
            long j6 = this.f56423b;
            return p131n0.g.q(this.f56423b, p131n0.g.s(p131n0.g.h(j6, p131n0.g.k(j6)), f6));
        }
        float fD = d(this.f56423b) - (java.lang.Math.signum(d(this.f56423b)) * f6);
        float fC = c(this.f56423b);
        return this.f56422a == p230x.s.Horizontal ? p131n0.h.a(fD, fC) : p131n0.h.a(fC, fD);
    }

    public final p131n0.g a(p251z0.B b6, float f6) {
        long jR = p131n0.g.r(this.f56423b, p131n0.g.q(b6.h(), b6.k()));
        this.f56423b = jR;
        if ((this.f56422a == null ? p131n0.g.k(jR) : java.lang.Math.abs(d(jR))) >= f6) {
            return p131n0.g.d(b(f6));
        }
        return null;
    }

    public final float c(long j6) {
        return this.f56422a == p230x.s.Horizontal ? p131n0.g.n(j6) : p131n0.g.m(j6);
    }

    public final float d(long j6) {
        return this.f56422a == p230x.s.Horizontal ? p131n0.g.m(j6) : p131n0.g.n(j6);
    }

    public final void e() {
        this.f56423b = p131n0.g.f51312b.c();
    }
}
