package p131n0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n0.k.a f51323i = new n0.k.a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p131n0.k f51324j = p131n0.l.c(0.0f, 0.0f, 0.0f, 0.0f, p131n0.a.f51306a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f51325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f51326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f51327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f51328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f51329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f51330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f51331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f51332h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private k(float f6, float f10, float f11, float f12, long j6, long j10, long j11, long j12) {
        this.f51325a = f6;
        this.f51326b = f10;
        this.f51327c = f11;
        this.f51328d = f12;
        this.f51329e = j6;
        this.f51330f = j10;
        this.f51331g = j11;
        this.f51332h = j12;
    }

    public /* synthetic */ k(float f6, float f10, float f11, float f12, long j6, long j10, long j11, long j12, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, j6, j10, j11, j12);
    }

    public final float a() {
        return this.f51328d;
    }

    public final long b() {
        return this.f51332h;
    }

    public final long c() {
        return this.f51331g;
    }

    public final float d() {
        return this.f51328d - this.f51326b;
    }

    public final float e() {
        return this.f51325a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p131n0.k)) {
            return false;
        }
        p131n0.k kVar = (p131n0.k) obj;
        return java.lang.Float.compare(this.f51325a, kVar.f51325a) == 0 && java.lang.Float.compare(this.f51326b, kVar.f51326b) == 0 && java.lang.Float.compare(this.f51327c, kVar.f51327c) == 0 && java.lang.Float.compare(this.f51328d, kVar.f51328d) == 0 && p131n0.a.c(this.f51329e, kVar.f51329e) && p131n0.a.c(this.f51330f, kVar.f51330f) && p131n0.a.c(this.f51331g, kVar.f51331g) && p131n0.a.c(this.f51332h, kVar.f51332h);
    }

    public final float f() {
        return this.f51327c;
    }

    public final float g() {
        return this.f51326b;
    }

    public final long h() {
        return this.f51329e;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Float.floatToIntBits(this.f51325a) * 31) + java.lang.Float.floatToIntBits(this.f51326b)) * 31) + java.lang.Float.floatToIntBits(this.f51327c)) * 31) + java.lang.Float.floatToIntBits(this.f51328d)) * 31) + p131n0.a.f(this.f51329e)) * 31) + p131n0.a.f(this.f51330f)) * 31) + p131n0.a.f(this.f51331g)) * 31) + p131n0.a.f(this.f51332h);
    }

    public final long i() {
        return this.f51330f;
    }

    public final float j() {
        return this.f51327c - this.f51325a;
    }

    public java.lang.String toString() {
        long j6 = this.f51329e;
        long j10 = this.f51330f;
        long j11 = this.f51331g;
        long j12 = this.f51332h;
        java.lang.String str = p131n0.c.a(this.f51325a, 1) + ", " + p131n0.c.a(this.f51326b, 1) + ", " + p131n0.c.a(this.f51327c, 1) + ", " + p131n0.c.a(this.f51328d, 1);
        if (!p131n0.a.c(j6, j10) || !p131n0.a.c(j10, j11) || !p131n0.a.c(j11, j12)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((java.lang.Object) p131n0.a.g(j6)) + ", topRight=" + ((java.lang.Object) p131n0.a.g(j10)) + ", bottomRight=" + ((java.lang.Object) p131n0.a.g(j11)) + ", bottomLeft=" + ((java.lang.Object) p131n0.a.g(j12)) + ')';
        }
        if (p131n0.a.d(j6) == p131n0.a.e(j6)) {
            return "RoundRect(rect=" + str + ", radius=" + p131n0.c.a(p131n0.a.d(j6), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + p131n0.c.a(p131n0.a.d(j6), 1) + ", y=" + p131n0.c.a(p131n0.a.e(j6), 1) + ')';
    }
}
