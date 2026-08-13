package p055f4;

/* JADX INFO: loaded from: classes3.dex */
abstract class C0 extends p055f4.P0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f45017C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f45018D;

    protected C0(int i6, int i10) {
        p055f4.A0.b(i10, i6, "index");
        this.f45017C = i6;
        this.f45018D = i10;
    }

    protected abstract java.lang.Object b(int i6);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45018D < this.f45017C;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45018D > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f45018D;
        this.f45018D = i6 + 1;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45018D;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f45018D - 1;
        this.f45018D = i6;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45018D - 1;
    }
}
