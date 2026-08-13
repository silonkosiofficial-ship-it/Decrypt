package Z;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Z.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object[] f16646E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Z.k f16647F;

    public g(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6, int i10, int i11) {
        super(i6, i10);
        this.f16646E = objArr2;
        int iD = Z.l.d(i10);
        this.f16647F = new Z.k(objArr, E7.j.g(i6, iD), iD, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        if (this.f16647F.hasNext()) {
            f(d() + 1);
            return this.f16647F.next();
        }
        java.lang.Object[] objArr = this.f16646E;
        int iD = d();
        f(iD + 1);
        return objArr[iD - this.f16647F.e()];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        c();
        if (d() <= this.f16647F.e()) {
            f(d() - 1);
            return this.f16647F.previous();
        }
        java.lang.Object[] objArr = this.f16646E;
        f(d() - 1);
        return objArr[d() - this.f16647F.e()];
    }
}
