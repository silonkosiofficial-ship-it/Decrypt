package A;

/* JADX INFO: loaded from: classes.dex */
final class P implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.S f20b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A.S f21c;

    public P(A.S s6, A.S s10) {
        this.f20b = s6;
        this.f21c = s10;
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        return java.lang.Math.max(this.f20b.a(eVar, vVar), this.f21c.a(eVar, vVar));
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        return java.lang.Math.max(this.f20b.b(eVar), this.f21c.b(eVar));
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        return java.lang.Math.max(this.f20b.c(eVar), this.f21c.c(eVar));
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        return java.lang.Math.max(this.f20b.d(eVar, vVar), this.f21c.d(eVar, vVar));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.P)) {
            return false;
        }
        A.P p6 = (A.P) obj;
        return p247y7.AbstractC7350t.b(p6.f20b, this.f20b) && p247y7.AbstractC7350t.b(p6.f21c, this.f21c);
    }

    public int hashCode() {
        return this.f20b.hashCode() + (this.f21c.hashCode() * 31);
    }

    public java.lang.String toString() {
        return '(' + this.f20b + " ∪ " + this.f21c + ')';
    }
}
