package Z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Z.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object[] f16631E;

    public c(java.lang.Object[] objArr, int i6, int i10) {
        super(i6, i10);
        this.f16631E = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = this.f16631E;
        int iD = d();
        f(iD + 1);
        return objArr[iD];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = this.f16631E;
        f(d() - 1);
        return objArr[d()];
    }
}
