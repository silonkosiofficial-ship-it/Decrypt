package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class W1 extends p141o0.a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f52178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f52179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f52180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f52181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f52182i;

    private W1(java.util.List list, java.util.List list2, long j6, float f6, int i6) {
        this.f52178e = list;
        this.f52179f = list2;
        this.f52180g = j6;
        this.f52181h = f6;
        this.f52182i = i6;
    }

    public /* synthetic */ W1(java.util.List list, java.util.List list2, long j6, float f6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(list, list2, j6, f6, i6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    @Override // p141o0.a2
    public android.graphics.Shader b(long j6) {
        float fI;
        long jB;
        float fG;
        float f6;
        float fH;
        if (!p131n0.h.d(this.f52180g)) {
            fI = p131n0.g.m(this.f52180g) == Float.POSITIVE_INFINITY ? p131n0.m.i(j6) : p131n0.g.m(this.f52180g);
            if (p131n0.g.n(this.f52180g) == Float.POSITIVE_INFINITY) {
                fG = p131n0.m.g(j6);
            } else {
                jB = this.f52180g;
            }
            java.util.List list = this.f52178e;
            java.util.List list2 = this.f52179f;
            long jA = p131n0.h.a(fI, fG);
            f6 = this.f52181h;
            if (f6 == Float.POSITIVE_INFINITY) {
                fH = p131n0.m.h(j6) / 2;
            } else {
                fH = f6;
            }
            return p141o0.b2.b(jA, fH, list, list2, this.f52182i);
        }
        jB = p131n0.n.b(j6);
        fI = p131n0.g.m(jB);
        fG = p131n0.g.n(jB);
        java.util.List list3 = this.f52178e;
        java.util.List list4 = this.f52179f;
        long jA2 = p131n0.h.a(fI, fG);
        f6 = this.f52181h;
        if (f6 == Float.POSITIVE_INFINITY) {
            fH = p131n0.m.h(j6) / 2;
        } else {
            fH = f6;
        }
        return p141o0.b2.b(jA2, fH, list3, list4, this.f52182i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p141o0.W1)) {
            return false;
        }
        p141o0.W1 w6 = (p141o0.W1) obj;
        return p247y7.AbstractC7350t.b(this.f52178e, w6.f52178e) && p247y7.AbstractC7350t.b(this.f52179f, w6.f52179f) && p131n0.g.j(this.f52180g, w6.f52180g) && this.f52181h == w6.f52181h && p141o0.j2.f(this.f52182i, w6.f52182i);
    }

    public int hashCode() {
        int iHashCode = this.f52178e.hashCode() * 31;
        java.util.List list = this.f52179f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + p131n0.g.o(this.f52180g)) * 31) + java.lang.Float.floatToIntBits(this.f52181h)) * 31) + p141o0.j2.g(this.f52182i);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        if (p131n0.h.c(this.f52180g)) {
            str = "center=" + ((java.lang.Object) p131n0.g.t(this.f52180g)) + ", ";
        } else {
            str = "";
        }
        float f6 = this.f52181h;
        if (!java.lang.Float.isInfinite(f6) && !java.lang.Float.isNaN(f6)) {
            str2 = "radius=" + this.f52181h + ", ";
        }
        return "RadialGradient(colors=" + this.f52178e + ", stops=" + this.f52179f + ", " + str + str2 + "tileMode=" + ((java.lang.Object) p141o0.j2.h(this.f52182i)) + ')';
    }
}
