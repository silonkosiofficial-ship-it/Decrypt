package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends M8.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final M8.i f7095C = new M8.i();

    public static final class a implements java.util.Iterator, p256z7.a {
        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Void next() {
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // M8.c
    public int d() {
        return 0;
    }

    @Override // M8.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Void get(int i6) {
        return null;
    }

    @Override // M8.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(int i6, java.lang.Void r6) {
        p247y7.AbstractC7350t.f(r6, "value");
        throw new java.lang.IllegalStateException();
    }

    @Override // M8.c, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new M8.i.a();
    }
}
