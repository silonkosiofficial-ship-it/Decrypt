package p071h0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p071h0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f45798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f45799c;

    public static final class a implements h0.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f45800a;

        public a(float f6) {
            this.f45800a = f6;
        }

        @Override // h0.c.b
        public int a(int i6, int i10, Y0.v vVar) {
            return java.lang.Math.round(((i10 - i6) / 2.0f) * (1 + (vVar == Y0.v.Ltr ? this.f45800a : (-1) * this.f45800a)));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0.e.a) && java.lang.Float.compare(this.f45800a, ((h0.e.a) obj).f45800a) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f45800a);
        }

        public java.lang.String toString() {
            return "Horizontal(bias=" + this.f45800a + ')';
        }
    }

    public static final class b implements p071h0.c.InterfaceC0526c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f45801a;

        public b(float f6) {
            this.f45801a = f6;
        }

        @Override // p071h0.c.InterfaceC0526c
        public int a(int i6, int i10) {
            return java.lang.Math.round(((i10 - i6) / 2.0f) * (1 + this.f45801a));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0.e.b) && java.lang.Float.compare(this.f45801a, ((h0.e.b) obj).f45801a) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f45801a);
        }

        public java.lang.String toString() {
            return "Vertical(bias=" + this.f45801a + ')';
        }
    }

    public e(float f6, float f10) {
        this.f45798b = f6;
        this.f45799c = f10;
    }

    @Override // p071h0.c
    public long a(long j6, long j10, Y0.v vVar) {
        float fG = (Y0.t.g(j10) - Y0.t.g(j6)) / 2.0f;
        float f6 = (Y0.t.f(j10) - Y0.t.f(j6)) / 2.0f;
        float f10 = 1;
        return Y0.q.a(java.lang.Math.round(fG * ((vVar == Y0.v.Ltr ? this.f45798b : (-1) * this.f45798b) + f10)), java.lang.Math.round(f6 * (f10 + this.f45799c)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p071h0.e)) {
            return false;
        }
        p071h0.e eVar = (p071h0.e) obj;
        return java.lang.Float.compare(this.f45798b, eVar.f45798b) == 0 && java.lang.Float.compare(this.f45799c, eVar.f45799c) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f45798b) * 31) + java.lang.Float.floatToIntBits(this.f45799c);
    }

    public java.lang.String toString() {
        return "BiasAlignment(horizontalBias=" + this.f45798b + ", verticalBias=" + this.f45799c + ')';
    }
}
