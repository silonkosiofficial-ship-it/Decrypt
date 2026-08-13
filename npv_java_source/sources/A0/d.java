package A0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0.c.a f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0.c f188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A0.c f189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f191e;

    public d() {
        A0.c.a aVar = A0.e.h() ? A0.c.a.Impulse : A0.c.a.Lsq2;
        this.f187a = aVar;
        boolean z6 = false;
        int i6 = 1;
        p247y7.AbstractC7342k abstractC7342k = null;
        this.f188b = new A0.c(z6, aVar, i6, abstractC7342k);
        this.f189c = new A0.c(z6, aVar, i6, abstractC7342k);
        this.f190d = p131n0.g.f51312b.c();
    }

    public final void a(long j6, long j10) {
        this.f188b.a(j6, p131n0.g.m(j10));
        this.f189c.a(j6, p131n0.g.n(j10));
    }

    public final long b(long j6) {
        if (!(Y0.A.h(j6) > 0.0f && Y0.A.i(j6) > 0.0f)) {
            C0.a.b("maximumVelocity should be a positive value. You specified=" + ((java.lang.Object) Y0.A.n(j6)));
        }
        return Y0.B.a(this.f188b.d(Y0.A.h(j6)), this.f189c.d(Y0.A.i(j6)));
    }

    public final long c() {
        return this.f190d;
    }

    public final long d() {
        return this.f191e;
    }

    public final void e() {
        this.f188b.e();
        this.f189c.e();
        this.f191e = 0L;
    }

    public final void f(long j6) {
        this.f190d = j6;
    }

    public final void g(long j6) {
        this.f191e = j6;
    }
}
