package V;

/* JADX INFO: loaded from: classes.dex */
final class U implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.C1718h1 f14724C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f14725D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f14726E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f14727F;

    public U(V.C1718h1 c1718h1, int i6, int i10) {
        this.f14724C = c1718h1;
        this.f14725D = i10;
        this.f14726E = i6;
        this.f14727F = c1718h1.R();
        if (c1718h1.S()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void c() {
        if (this.f14724C.R() != this.f14727F) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p061g0.b next() {
        c();
        int i6 = this.f14726E;
        this.f14726E = V.AbstractC1724j1.I(this.f14724C.M(), i6) + i6;
        return new V.C1721i1(this.f14724C, i6, this.f14727F);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14726E < this.f14725D;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
