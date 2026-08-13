package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N implements p219v9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v9.f f56957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56958b;

    private N(p219v9.f fVar) {
        this.f56957a = fVar;
        this.f56958b = 1;
    }

    public /* synthetic */ N(p219v9.f fVar, p247y7.AbstractC7342k abstractC7342k) {
        this(fVar);
    }

    @Override // p219v9.f
    public /* synthetic */ boolean c() {
        return p219v9.e.c(this);
    }

    @Override // p219v9.f
    public int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.Integer numV = S8.r.v(str);
        if (numV != null) {
            return numV.intValue();
        }
        throw new java.lang.IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // p219v9.f
    public int e() {
        return this.f56958b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p239x9.N)) {
            return false;
        }
        p239x9.N n6 = (p239x9.N) obj;
        return p247y7.AbstractC7350t.b(this.f56957a, n6.f56957a) && p247y7.AbstractC7350t.b(a(), n6.a());
    }

    @Override // p219v9.f
    public java.lang.String f(int i6) {
        return java.lang.String.valueOf(i6);
    }

    @Override // p219v9.f
    public java.util.List g(int i6) {
        if (i6 >= 0) {
            return p097j7.AbstractC6879v.m();
        }
        throw new java.lang.IllegalArgumentException(("Illegal index " + i6 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // p219v9.f
    public p219v9.f h(int i6) {
        if (i6 >= 0) {
            return this.f56957a;
        }
        throw new java.lang.IllegalArgumentException(("Illegal index " + i6 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f56957a.hashCode() * 31) + a().hashCode();
    }

    @Override // p219v9.f
    public boolean i(int i6) {
        if (i6 >= 0) {
            return false;
        }
        throw new java.lang.IllegalArgumentException(("Illegal index " + i6 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // p219v9.f
    public p219v9.m j() {
        return v9.n.b.f56059a;
    }

    @Override // p219v9.f
    public /* synthetic */ java.util.List k() {
        return p219v9.e.a(this);
    }

    @Override // p219v9.f
    public /* synthetic */ boolean m() {
        return p219v9.e.b(this);
    }

    public java.lang.String toString() {
        return a() + '(' + this.f56957a + ')';
    }
}
