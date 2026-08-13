package A;

/* JADX INFO: renamed from: A.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0782p implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.S f142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A.S f143c;

    public C0782p(A.S s6, A.S s10) {
        this.f142b = s6;
        this.f143c = s10;
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        return E7.j.d(this.f142b.a(eVar, vVar) - this.f143c.a(eVar, vVar), 0);
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        return E7.j.d(this.f142b.b(eVar) - this.f143c.b(eVar), 0);
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        return E7.j.d(this.f142b.c(eVar) - this.f143c.c(eVar), 0);
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        return E7.j.d(this.f142b.d(eVar, vVar) - this.f143c.d(eVar, vVar), 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.C0782p)) {
            return false;
        }
        A.C0782p c0782p = (A.C0782p) obj;
        return p247y7.AbstractC7350t.b(c0782p.f142b, this.f142b) && p247y7.AbstractC7350t.b(c0782p.f143c, this.f143c);
    }

    public int hashCode() {
        return (this.f142b.hashCode() * 31) + this.f143c.hashCode();
    }

    public java.lang.String toString() {
        return '(' + this.f142b + " - " + this.f143c + ')';
    }
}
