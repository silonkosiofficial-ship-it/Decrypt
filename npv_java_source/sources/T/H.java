package T;

/* JADX INFO: loaded from: classes.dex */
public final class H implements T.u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.c.b f12782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12783b;

    public H(h0.c.b bVar, int i6) {
        this.f12782a = bVar;
        this.f12783b = i6;
    }

    @Override // T.u.a
    public int a(Y0.r rVar, long j6, int i6, Y0.v vVar) {
        return i6 >= Y0.t.g(j6) - (this.f12783b * 2) ? p071h0.c.f45778a.g().a(i6, Y0.t.g(j6), vVar) : E7.j.k(this.f12782a.a(i6, Y0.t.g(j6), vVar), this.f12783b, (Y0.t.g(j6) - this.f12783b) - i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.H)) {
            return false;
        }
        T.H h6 = (T.H) obj;
        return p247y7.AbstractC7350t.b(this.f12782a, h6.f12782a) && this.f12783b == h6.f12783b;
    }

    public int hashCode() {
        return (this.f12782a.hashCode() * 31) + this.f12783b;
    }

    public java.lang.String toString() {
        return "Horizontal(alignment=" + this.f12782a + ", margin=" + this.f12783b + ')';
    }
}
