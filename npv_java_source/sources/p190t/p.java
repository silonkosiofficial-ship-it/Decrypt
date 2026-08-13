package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y0.e f54539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f54540c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f54541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f54542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f54543c;

        public a(float f6, float f10, long j6) {
            this.f54541a = f6;
            this.f54542b = f10;
            this.f54543c = j6;
        }

        public final float a(long j6) {
            long j10 = this.f54543c;
            return this.f54542b * java.lang.Math.signum(this.f54541a) * p190t.C7153a.f54422a.b(j10 > 0 ? j6 / j10 : 1.0f).a();
        }

        public final float b(long j6) {
            long j10 = this.f54543c;
            return (((p190t.C7153a.f54422a.b(j10 > 0 ? j6 / j10 : 1.0f).b() * java.lang.Math.signum(this.f54541a)) * this.f54542b) / this.f54543c) * 1000.0f;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t.p.a)) {
                return false;
            }
            t.p.a aVar = (t.p.a) obj;
            return java.lang.Float.compare(this.f54541a, aVar.f54541a) == 0 && java.lang.Float.compare(this.f54542b, aVar.f54542b) == 0 && this.f54543c == aVar.f54543c;
        }

        public int hashCode() {
            return (((java.lang.Float.floatToIntBits(this.f54541a) * 31) + java.lang.Float.floatToIntBits(this.f54542b)) * 31) + p170r.r.a(this.f54543c);
        }

        public java.lang.String toString() {
            return "FlingInfo(initialVelocity=" + this.f54541a + ", distance=" + this.f54542b + ", duration=" + this.f54543c + ')';
        }
    }

    public p(float f6, Y0.e eVar) {
        this.f54538a = f6;
        this.f54539b = eVar;
        this.f54540c = a(eVar);
    }

    private final float a(Y0.e eVar) {
        return p190t.q.c(0.84f, eVar.getDensity());
    }

    private final double e(float f6) {
        return p190t.C7153a.f54422a.a(f6, this.f54538a * this.f54540c);
    }

    public final float b(float f6) {
        return (float) (((double) (this.f54538a * this.f54540c)) * java.lang.Math.exp((((double) p190t.q.f54544a) / (((double) p190t.q.f54544a) - 1.0d)) * e(f6)));
    }

    public final long c(float f6) {
        return (long) (java.lang.Math.exp(e(f6) / (((double) p190t.q.f54544a) - 1.0d)) * 1000.0d);
    }

    public final t.p.a d(float f6) {
        double dE = e(f6);
        double d6 = ((double) p190t.q.f54544a) - 1.0d;
        return new t.p.a(f6, (float) (((double) (this.f54538a * this.f54540c)) * java.lang.Math.exp((((double) p190t.q.f54544a) / d6) * dE)), (long) (java.lang.Math.exp(dE / d6) * 1000.0d));
    }
}
