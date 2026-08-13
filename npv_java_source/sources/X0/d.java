package X0;

/* JADX INFO: loaded from: classes.dex */
final class d implements X0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15578b;

    private d(long j6) {
        this.f15578b = j6;
        if (j6 == 16) {
            throw new java.lang.IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ d(long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6);
    }

    @Override // X0.o
    public float a() {
        return p141o0.C7016y0.p(c());
    }

    @Override // X0.o
    public long c() {
        return this.f15578b;
    }

    @Override // X0.o
    public /* synthetic */ X0.o d(p237x7.a aVar) {
        return X0.n.b(this, aVar);
    }

    @Override // X0.o
    public /* synthetic */ X0.o e(X0.o oVar) {
        return X0.n.a(this, oVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X0.d) && p141o0.C7016y0.o(this.f15578b, ((X0.d) obj).f15578b);
    }

    @Override // X0.o
    public p141o0.AbstractC6984n0 f() {
        return null;
    }

    public int hashCode() {
        return p141o0.C7016y0.u(this.f15578b);
    }

    public java.lang.String toString() {
        return "ColorStyle(value=" + ((java.lang.Object) p141o0.C7016y0.v(this.f15578b)) + ')';
    }
}
