package R8;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements R8.h, R8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.h f9742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9743b;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f9744C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f9745D;

        a(R8.b bVar) {
            this.f9744C = bVar.f9742a.iterator();
            this.f9745D = bVar.f9743b;
        }

        private final void b() {
            while (this.f9745D > 0 && this.f9744C.hasNext()) {
                this.f9744C.next();
                this.f9745D--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f9744C.hasNext();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            b();
            return this.f9744C.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(R8.h hVar, int i6) {
        p247y7.AbstractC7350t.f(hVar, "sequence");
        this.f9742a = hVar;
        this.f9743b = i6;
        if (i6 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i6 + '.').toString());
    }

    @Override // R8.c
    public R8.h a(int i6) {
        int i10 = this.f9743b + i6;
        return i10 < 0 ? new R8.b(this, i6) : new R8.b(this.f9742a, i10);
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new R8.b.a(this);
    }
}
