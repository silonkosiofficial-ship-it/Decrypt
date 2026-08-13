package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f57480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f57481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f57482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f57483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f57484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f57485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f57486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f57487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f57488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f57489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f57490k;

    private E(long j6, long j10, long j11, long j12, boolean z6, float f6, int i6, boolean z10, java.util.List list, long j13, long j14) {
        this.f57480a = j6;
        this.f57481b = j10;
        this.f57482c = j11;
        this.f57483d = j12;
        this.f57484e = z6;
        this.f57485f = f6;
        this.f57486g = i6;
        this.f57487h = z10;
        this.f57488i = list;
        this.f57489j = j13;
        this.f57490k = j14;
    }

    public /* synthetic */ E(long j6, long j10, long j11, long j12, boolean z6, float f6, int i6, boolean z10, java.util.List list, long j13, long j14, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12, z6, f6, i6, z10, list, j13, j14);
    }

    public final boolean a() {
        return this.f57487h;
    }

    public final boolean b() {
        return this.f57484e;
    }

    public final java.util.List c() {
        return this.f57488i;
    }

    public final long d() {
        return this.f57480a;
    }

    public final long e() {
        return this.f57490k;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p251z0.E)) {
            return false;
        }
        p251z0.E e6 = (p251z0.E) obj;
        return p251z0.A.d(this.f57480a, e6.f57480a) && this.f57481b == e6.f57481b && p131n0.g.j(this.f57482c, e6.f57482c) && p131n0.g.j(this.f57483d, e6.f57483d) && this.f57484e == e6.f57484e && java.lang.Float.compare(this.f57485f, e6.f57485f) == 0 && p251z0.P.g(this.f57486g, e6.f57486g) && this.f57487h == e6.f57487h && p247y7.AbstractC7350t.b(this.f57488i, e6.f57488i) && p131n0.g.j(this.f57489j, e6.f57489j) && p131n0.g.j(this.f57490k, e6.f57490k);
    }

    public final long f() {
        return this.f57483d;
    }

    public final long g() {
        return this.f57482c;
    }

    public final float h() {
        return this.f57485f;
    }

    public int hashCode() {
        return (((((((((((((((((((p251z0.A.e(this.f57480a) * 31) + p170r.r.a(this.f57481b)) * 31) + p131n0.g.o(this.f57482c)) * 31) + p131n0.g.o(this.f57483d)) * 31) + p190t.h.a(this.f57484e)) * 31) + java.lang.Float.floatToIntBits(this.f57485f)) * 31) + p251z0.P.h(this.f57486g)) * 31) + p190t.h.a(this.f57487h)) * 31) + this.f57488i.hashCode()) * 31) + p131n0.g.o(this.f57489j)) * 31) + p131n0.g.o(this.f57490k);
    }

    public final long i() {
        return this.f57489j;
    }

    public final int j() {
        return this.f57486g;
    }

    public final long k() {
        return this.f57481b;
    }

    public java.lang.String toString() {
        return "PointerInputEventData(id=" + ((java.lang.Object) p251z0.A.f(this.f57480a)) + ", uptime=" + this.f57481b + ", positionOnScreen=" + ((java.lang.Object) p131n0.g.t(this.f57482c)) + ", position=" + ((java.lang.Object) p131n0.g.t(this.f57483d)) + ", down=" + this.f57484e + ", pressure=" + this.f57485f + ", type=" + ((java.lang.Object) p251z0.P.i(this.f57486g)) + ", activeHover=" + this.f57487h + ", historical=" + this.f57488i + ", scrollDelta=" + ((java.lang.Object) p131n0.g.t(this.f57489j)) + ", originalEventPosition=" + ((java.lang.Object) p131n0.g.t(this.f57490k)) + ')';
    }
}
