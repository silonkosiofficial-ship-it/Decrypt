package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f52707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f52708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f52709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f52710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f52711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f52712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f52713g;

    public y(double d6, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f52707a = d6;
        this.f52708b = d10;
        this.f52709c = d11;
        this.f52710d = d12;
        this.f52711e = d13;
        this.f52712f = d14;
        this.f52713g = d15;
        if (java.lang.Double.isNaN(d10) || java.lang.Double.isNaN(d11) || java.lang.Double.isNaN(d12) || java.lang.Double.isNaN(d13) || java.lang.Double.isNaN(d14) || java.lang.Double.isNaN(d15) || java.lang.Double.isNaN(d6)) {
            throw new java.lang.IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d13 < 0.0d || d13 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Parameter d must be in the range [0..1], was " + d13);
        }
        if (d13 == 0.0d && (d10 == 0.0d || d6 == 0.0d)) {
            throw new java.lang.IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d13 >= 1.0d && d12 == 0.0d) {
            throw new java.lang.IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d10 == 0.0d || d6 == 0.0d) && d12 == 0.0d) {
            throw new java.lang.IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d12 < 0.0d) {
            throw new java.lang.IllegalArgumentException("The transfer function must be increasing");
        }
        if (d10 < 0.0d || d6 < 0.0d) {
            throw new java.lang.IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public /* synthetic */ y(double d6, double d10, double d11, double d12, double d13, double d14, double d15, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(d6, d10, d11, d12, d13, (i6 & 32) != 0 ? 0.0d : d14, (i6 & 64) != 0 ? 0.0d : d15);
    }

    public final double a() {
        return this.f52708b;
    }

    public final double b() {
        return this.f52709c;
    }

    public final double c() {
        return this.f52710d;
    }

    public final double d() {
        return this.f52711e;
    }

    public final double e() {
        return this.f52712f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p151p0.y)) {
            return false;
        }
        p151p0.y yVar = (p151p0.y) obj;
        return java.lang.Double.compare(this.f52707a, yVar.f52707a) == 0 && java.lang.Double.compare(this.f52708b, yVar.f52708b) == 0 && java.lang.Double.compare(this.f52709c, yVar.f52709c) == 0 && java.lang.Double.compare(this.f52710d, yVar.f52710d) == 0 && java.lang.Double.compare(this.f52711e, yVar.f52711e) == 0 && java.lang.Double.compare(this.f52712f, yVar.f52712f) == 0 && java.lang.Double.compare(this.f52713g, yVar.f52713g) == 0;
    }

    public final double f() {
        return this.f52713g;
    }

    public final double g() {
        return this.f52707a;
    }

    public int hashCode() {
        return (((((((((((p200u.AbstractC7195w.a(this.f52707a) * 31) + p200u.AbstractC7195w.a(this.f52708b)) * 31) + p200u.AbstractC7195w.a(this.f52709c)) * 31) + p200u.AbstractC7195w.a(this.f52710d)) * 31) + p200u.AbstractC7195w.a(this.f52711e)) * 31) + p200u.AbstractC7195w.a(this.f52712f)) * 31) + p200u.AbstractC7195w.a(this.f52713g);
    }

    public java.lang.String toString() {
        return "TransferParameters(gamma=" + this.f52707a + ", a=" + this.f52708b + ", b=" + this.f52709c + ", c=" + this.f52710d + ", d=" + this.f52711e + ", e=" + this.f52712f + ", f=" + this.f52713g + ')';
    }
}
