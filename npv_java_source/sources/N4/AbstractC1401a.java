package N4;

/* JADX INFO: renamed from: N4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1401a extends N4.T {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f7718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f7719D;

    protected AbstractC1401a(int i6, int i10) {
        M4.h.k(i10, i6);
        this.f7718C = i6;
        this.f7719D = i10;
    }

    protected abstract java.lang.Object b(int i6);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7719D < this.f7718C;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7719D > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f7719D;
        this.f7719D = i6 + 1;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7719D;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f7719D - 1;
        this.f7719D = i6;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7719D - 1;
    }
}
