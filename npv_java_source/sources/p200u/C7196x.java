package p200u;

/* JADX INFO: renamed from: u.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7196x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f55126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f55127b;

    public C7196x(double d6, double d10) {
        this.f55126a = d6;
        this.f55127b = d10;
    }

    public final double e() {
        return this.f55127b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p200u.C7196x)) {
            return false;
        }
        p200u.C7196x c7196x = (p200u.C7196x) obj;
        return java.lang.Double.compare(this.f55126a, c7196x.f55126a) == 0 && java.lang.Double.compare(this.f55127b, c7196x.f55127b) == 0;
    }

    public final double f() {
        return this.f55126a;
    }

    public int hashCode() {
        return (p200u.AbstractC7195w.a(this.f55126a) * 31) + p200u.AbstractC7195w.a(this.f55127b);
    }

    public java.lang.String toString() {
        return "ComplexDouble(_real=" + this.f55126a + ", _imaginary=" + this.f55127b + ')';
    }
}
