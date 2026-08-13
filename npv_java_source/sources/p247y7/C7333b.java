package p247y7;

/* JADX INFO: renamed from: y7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7333b implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object[] f57281C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f57282D;

    public C7333b(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        this.f57281C = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f57282D < this.f57281C.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        try {
            java.lang.Object[] objArr = this.f57281C;
            int i6 = this.f57282D;
            this.f57282D = i6 + 1;
            return objArr[i6];
        } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
            this.f57282D--;
            throw new java.util.NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
