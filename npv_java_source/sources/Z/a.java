package Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements java.util.ListIterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f16628C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f16629D;

    public a(int i6, int i10) {
        this.f16628C = i6;
        this.f16629D = i10;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
    }

    public final int d() {
        return this.f16628C;
    }

    public final int e() {
        return this.f16629D;
    }

    public final void f(int i6) {
        this.f16628C = i6;
    }

    public final void h(int i6) {
        this.f16629D = i6;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f16628C < this.f16629D;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f16628C > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f16628C;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f16628C - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
