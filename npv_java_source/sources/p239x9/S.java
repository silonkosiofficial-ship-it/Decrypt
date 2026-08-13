package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S implements p219v9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f56971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v9.f f56972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v9.f f56973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56974d;

    private S(java.lang.String str, p219v9.f fVar, p219v9.f fVar2) {
        this.f56971a = str;
        this.f56972b = fVar;
        this.f56973c = fVar2;
        this.f56974d = 2;
    }

    public /* synthetic */ S(java.lang.String str, p219v9.f fVar, p219v9.f fVar2, p247y7.AbstractC7342k abstractC7342k) {
        this(str, fVar, fVar2);
    }

    @Override // p219v9.f
    public java.lang.String a() {
        return this.f56971a;
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
        throw new java.lang.IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // p219v9.f
    public int e() {
        return this.f56974d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p239x9.S)) {
            return false;
        }
        p239x9.S s6 = (p239x9.S) obj;
        return p247y7.AbstractC7350t.b(a(), s6.a()) && p247y7.AbstractC7350t.b(this.f56972b, s6.f56972b) && p247y7.AbstractC7350t.b(this.f56973c, s6.f56973c);
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
            int i10 = i6 % 2;
            if (i10 == 0) {
                return this.f56972b;
            }
            if (i10 == 1) {
                return this.f56973c;
            }
            throw new java.lang.IllegalStateException("Unreached".toString());
        }
        throw new java.lang.IllegalArgumentException(("Illegal index " + i6 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f56972b.hashCode()) * 31) + this.f56973c.hashCode();
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
        return v9.n.c.f56060a;
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
        return a() + '(' + this.f56972b + ", " + this.f56973c + ')';
    }
}
