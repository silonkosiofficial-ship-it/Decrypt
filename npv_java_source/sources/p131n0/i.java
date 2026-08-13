package p131n0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0.i.a f51317e = new n0.i.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p131n0.i f51318f = new p131n0.i(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f51319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f51320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f51321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f51322d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p131n0.i a() {
            return p131n0.i.f51318f;
        }
    }

    public i(float f6, float f10, float f11, float f12) {
        this.f51319a = f6;
        this.f51320b = f10;
        this.f51321c = f11;
        this.f51322d = f12;
    }

    public static /* synthetic */ p131n0.i d(p131n0.i iVar, float f6, float f10, float f11, float f12, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = iVar.f51319a;
        }
        if ((i6 & 2) != 0) {
            f10 = iVar.f51320b;
        }
        if ((i6 & 4) != 0) {
            f11 = iVar.f51321c;
        }
        if ((i6 & 8) != 0) {
            f12 = iVar.f51322d;
        }
        return iVar.c(f6, f10, f11, f12);
    }

    public final boolean b(long j6) {
        return p131n0.g.m(j6) >= this.f51319a && p131n0.g.m(j6) < this.f51321c && p131n0.g.n(j6) >= this.f51320b && p131n0.g.n(j6) < this.f51322d;
    }

    public final p131n0.i c(float f6, float f10, float f11, float f12) {
        return new p131n0.i(f6, f10, f11, f12);
    }

    public final float e() {
        return this.f51322d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p131n0.i)) {
            return false;
        }
        p131n0.i iVar = (p131n0.i) obj;
        return java.lang.Float.compare(this.f51319a, iVar.f51319a) == 0 && java.lang.Float.compare(this.f51320b, iVar.f51320b) == 0 && java.lang.Float.compare(this.f51321c, iVar.f51321c) == 0 && java.lang.Float.compare(this.f51322d, iVar.f51322d) == 0;
    }

    public final long f() {
        return p131n0.h.a(this.f51321c, this.f51322d);
    }

    public final long g() {
        return p131n0.h.a(this.f51319a + (n() / 2.0f), this.f51320b + (h() / 2.0f));
    }

    public final float h() {
        return this.f51322d - this.f51320b;
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.f51319a) * 31) + java.lang.Float.floatToIntBits(this.f51320b)) * 31) + java.lang.Float.floatToIntBits(this.f51321c)) * 31) + java.lang.Float.floatToIntBits(this.f51322d);
    }

    public final float i() {
        return this.f51319a;
    }

    public final float j() {
        return this.f51321c;
    }

    public final long k() {
        return p131n0.n.a(n(), h());
    }

    public final float l() {
        return this.f51320b;
    }

    public final long m() {
        return p131n0.h.a(this.f51319a, this.f51320b);
    }

    public final float n() {
        return this.f51321c - this.f51319a;
    }

    public final p131n0.i o(float f6, float f10, float f11, float f12) {
        return new p131n0.i(java.lang.Math.max(this.f51319a, f6), java.lang.Math.max(this.f51320b, f10), java.lang.Math.min(this.f51321c, f11), java.lang.Math.min(this.f51322d, f12));
    }

    public final p131n0.i p(p131n0.i iVar) {
        return new p131n0.i(java.lang.Math.max(this.f51319a, iVar.f51319a), java.lang.Math.max(this.f51320b, iVar.f51320b), java.lang.Math.min(this.f51321c, iVar.f51321c), java.lang.Math.min(this.f51322d, iVar.f51322d));
    }

    public final boolean q() {
        return this.f51319a >= this.f51321c || this.f51320b >= this.f51322d;
    }

    public final boolean r(p131n0.i iVar) {
        return this.f51321c > iVar.f51319a && iVar.f51321c > this.f51319a && this.f51322d > iVar.f51320b && iVar.f51322d > this.f51320b;
    }

    public final p131n0.i s(float f6, float f10) {
        return new p131n0.i(this.f51319a + f6, this.f51320b + f10, this.f51321c + f6, this.f51322d + f10);
    }

    public final p131n0.i t(long j6) {
        return new p131n0.i(this.f51319a + p131n0.g.m(j6), this.f51320b + p131n0.g.n(j6), this.f51321c + p131n0.g.m(j6), this.f51322d + p131n0.g.n(j6));
    }

    public java.lang.String toString() {
        return "Rect.fromLTRB(" + p131n0.c.a(this.f51319a, 1) + ", " + p131n0.c.a(this.f51320b, 1) + ", " + p131n0.c.a(this.f51321c, 1) + ", " + p131n0.c.a(this.f51322d, 1) + ')';
    }
}
