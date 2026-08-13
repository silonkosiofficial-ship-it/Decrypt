package j$.util;

/* JADX INFO: renamed from: j$.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6721m implements java.util.ListIterator, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ListIterator f48170a;

    C6721m(j$.util.C6722n c6722n, int i6) {
        this.f48170a = c6722n.f48171b.listIterator(i6);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC6856x
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.q(this.f48170a, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f48170a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f48170a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return this.f48170a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f48170a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return this.f48170a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f48170a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
