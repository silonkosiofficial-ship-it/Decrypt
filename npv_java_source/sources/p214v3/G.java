package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f55838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f55839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f55840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f55841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55842e;

    public G(java.lang.String str, double d6, double d10, double d11, int i6) {
        this.f55838a = str;
        this.f55840c = d6;
        this.f55839b = d10;
        this.f55841d = d11;
        this.f55842e = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p214v3.G)) {
            return false;
        }
        p214v3.G g6 = (p214v3.G) obj;
        return Q3.AbstractC1475n.a(this.f55838a, g6.f55838a) && this.f55839b == g6.f55839b && this.f55840c == g6.f55840c && this.f55842e == g6.f55842e && java.lang.Double.compare(this.f55841d, g6.f55841d) == 0;
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(this.f55838a, java.lang.Double.valueOf(this.f55839b), java.lang.Double.valueOf(this.f55840c), java.lang.Double.valueOf(this.f55841d), java.lang.Integer.valueOf(this.f55842e));
    }

    public final java.lang.String toString() {
        return Q3.AbstractC1475n.c(this).a("name", this.f55838a).a("minBound", java.lang.Double.valueOf(this.f55840c)).a("maxBound", java.lang.Double.valueOf(this.f55839b)).a("percent", java.lang.Double.valueOf(this.f55841d)).a("count", java.lang.Integer.valueOf(this.f55842e)).toString();
    }
}
