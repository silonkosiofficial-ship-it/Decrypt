package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends p141o0.a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f52234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f52235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f52236g;

    private i2(long j6, java.util.List list, java.util.List list2) {
        this.f52234e = j6;
        this.f52235f = list;
        this.f52236g = list2;
    }

    public /* synthetic */ i2(long j6, java.util.List list, java.util.List list2, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, list, list2);
    }

    @Override // p141o0.a2
    public android.graphics.Shader b(long j6) {
        long jA;
        if (p131n0.h.d(this.f52234e)) {
            jA = p131n0.n.b(j6);
        } else {
            jA = p131n0.h.a(p131n0.g.m(this.f52234e) == Float.POSITIVE_INFINITY ? p131n0.m.i(j6) : p131n0.g.m(this.f52234e), p131n0.g.n(this.f52234e) == Float.POSITIVE_INFINITY ? p131n0.m.g(j6) : p131n0.g.n(this.f52234e));
        }
        return p141o0.b2.c(jA, this.f52235f, this.f52236g);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p141o0.i2)) {
            return false;
        }
        p141o0.i2 i2Var = (p141o0.i2) obj;
        return p131n0.g.j(this.f52234e, i2Var.f52234e) && p247y7.AbstractC7350t.b(this.f52235f, i2Var.f52235f) && p247y7.AbstractC7350t.b(this.f52236g, i2Var.f52236g);
    }

    public int hashCode() {
        int iO = ((p131n0.g.o(this.f52234e) * 31) + this.f52235f.hashCode()) * 31;
        java.util.List list = this.f52236g;
        return iO + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (p131n0.h.c(this.f52234e)) {
            str = "center=" + ((java.lang.Object) p131n0.g.t(this.f52234e)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f52235f + ", stops=" + this.f52236g + ')';
    }
}
