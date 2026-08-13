package A;

/* JADX INFO: loaded from: classes.dex */
final class A implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.S f0b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1c;

    private A(A.S s6, int i6) {
        this.f0b = s6;
        this.f1c = i6;
    }

    public /* synthetic */ A(A.S s6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(s6, i6);
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        if (A.W.j(this.f1c, vVar == Y0.v.Ltr ? A.W.f63a.c() : A.W.f63a.d())) {
            return this.f0b.a(eVar, vVar);
        }
        return 0;
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        if (A.W.j(this.f1c, A.W.f63a.e())) {
            return this.f0b.b(eVar);
        }
        return 0;
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        if (A.W.j(this.f1c, A.W.f63a.g())) {
            return this.f0b.c(eVar);
        }
        return 0;
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        if (A.W.j(this.f1c, vVar == Y0.v.Ltr ? A.W.f63a.a() : A.W.f63a.b())) {
            return this.f0b.d(eVar, vVar);
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.A)) {
            return false;
        }
        A.A a6 = (A.A) obj;
        return p247y7.AbstractC7350t.b(this.f0b, a6.f0b) && A.W.i(this.f1c, a6.f1c);
    }

    public int hashCode() {
        return (this.f0b.hashCode() * 31) + A.W.k(this.f1c);
    }

    public java.lang.String toString() {
        return '(' + this.f0b + " only " + ((java.lang.Object) A.W.m(this.f1c)) + ')';
    }
}
