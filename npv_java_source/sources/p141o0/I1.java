package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends p141o0.a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f52129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f52130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f52131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f52132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f52133i;

    private I1(java.util.List list, java.util.List list2, long j6, long j10, int i6) {
        this.f52129e = list;
        this.f52130f = list2;
        this.f52131g = j6;
        this.f52132h = j10;
        this.f52133i = i6;
    }

    public /* synthetic */ I1(java.util.List list, java.util.List list2, long j6, long j10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(list, list2, j6, j10, i6);
    }

    @Override // p141o0.a2
    public android.graphics.Shader b(long j6) {
        return p141o0.b2.a(p131n0.h.a(p131n0.g.m(this.f52131g) == Float.POSITIVE_INFINITY ? p131n0.m.i(j6) : p131n0.g.m(this.f52131g), p131n0.g.n(this.f52131g) == Float.POSITIVE_INFINITY ? p131n0.m.g(j6) : p131n0.g.n(this.f52131g)), p131n0.h.a(p131n0.g.m(this.f52132h) == Float.POSITIVE_INFINITY ? p131n0.m.i(j6) : p131n0.g.m(this.f52132h), p131n0.g.n(this.f52132h) == Float.POSITIVE_INFINITY ? p131n0.m.g(j6) : p131n0.g.n(this.f52132h)), this.f52129e, this.f52130f, this.f52133i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p141o0.I1)) {
            return false;
        }
        p141o0.I1 i6 = (p141o0.I1) obj;
        return p247y7.AbstractC7350t.b(this.f52129e, i6.f52129e) && p247y7.AbstractC7350t.b(this.f52130f, i6.f52130f) && p131n0.g.j(this.f52131g, i6.f52131g) && p131n0.g.j(this.f52132h, i6.f52132h) && p141o0.j2.f(this.f52133i, i6.f52133i);
    }

    public int hashCode() {
        int iHashCode = this.f52129e.hashCode() * 31;
        java.util.List list = this.f52130f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + p131n0.g.o(this.f52131g)) * 31) + p131n0.g.o(this.f52132h)) * 31) + p141o0.j2.g(this.f52133i);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        if (p131n0.h.b(this.f52131g)) {
            str = "start=" + ((java.lang.Object) p131n0.g.t(this.f52131g)) + ", ";
        } else {
            str = "";
        }
        if (p131n0.h.b(this.f52132h)) {
            str2 = "end=" + ((java.lang.Object) p131n0.g.t(this.f52132h)) + ", ";
        }
        return "LinearGradient(colors=" + this.f52129e + ", stops=" + this.f52130f + ", " + str + str2 + "tileMode=" + ((java.lang.Object) p141o0.j2.h(this.f52133i)) + ')';
    }
}
