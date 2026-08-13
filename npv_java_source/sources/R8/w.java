package R8;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.h f9782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f9783b;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f9784C;

        a() {
            this.f9784C = R8.w.this.f9782a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9784C.hasNext();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            return R8.w.this.f9783b.l(this.f9784C.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "sequence");
        p247y7.AbstractC7350t.f(lVar, "transformer");
        this.f9782a = hVar;
        this.f9783b = lVar;
    }

    public final R8.h d(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "iterator");
        return new R8.f(this.f9782a, this.f9783b, lVar);
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new R8.w.a();
    }
}
