package p071h0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p071h0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f45795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f45796c;

    public static final class a implements h0.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f45797a;

        public a(float f6) {
            this.f45797a = f6;
        }

        @Override // h0.c.b
        public int a(int i6, int i10, Y0.v vVar) {
            return java.lang.Math.round(((i10 - i6) / 2.0f) * (1 + this.f45797a));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0.d.a) && java.lang.Float.compare(this.f45797a, ((h0.d.a) obj).f45797a) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f45797a);
        }

        public java.lang.String toString() {
            return "Horizontal(bias=" + this.f45797a + ')';
        }
    }

    public d(float f6, float f10) {
        this.f45795b = f6;
        this.f45796c = f10;
    }

    @Override // p071h0.c
    public long a(long j6, long j10, Y0.v vVar) {
        long jA = Y0.u.a(Y0.t.g(j10) - Y0.t.g(j6), Y0.t.f(j10) - Y0.t.f(j6));
        float f6 = 1;
        return Y0.q.a(java.lang.Math.round((Y0.t.g(jA) / 2.0f) * (this.f45795b + f6)), java.lang.Math.round((Y0.t.f(jA) / 2.0f) * (f6 + this.f45796c)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p071h0.d)) {
            return false;
        }
        p071h0.d dVar = (p071h0.d) obj;
        return java.lang.Float.compare(this.f45795b, dVar.f45795b) == 0 && java.lang.Float.compare(this.f45796c, dVar.f45796c) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f45795b) * 31) + java.lang.Float.floatToIntBits(this.f45796c);
    }

    public java.lang.String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f45795b + ", verticalBias=" + this.f45796c + ')';
    }
}
