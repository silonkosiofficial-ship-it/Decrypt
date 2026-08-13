package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends M8.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f7104C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f7105D;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f7106C = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7106C;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (!this.f7106C) {
                throw new java.util.NoSuchElementException();
            }
            this.f7106C = false;
            return M8.o.this.g();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.Object obj, int i6) {
        super(null);
        p247y7.AbstractC7350t.f(obj, "value");
        this.f7104C = obj;
        this.f7105D = i6;
    }

    @Override // M8.c
    public int d() {
        return 1;
    }

    @Override // M8.c
    public void e(int i6, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        throw new java.lang.IllegalStateException();
    }

    public final int f() {
        return this.f7105D;
    }

    public final java.lang.Object g() {
        return this.f7104C;
    }

    @Override // M8.c
    public java.lang.Object get(int i6) {
        if (i6 == this.f7105D) {
            return this.f7104C;
        }
        return null;
    }

    @Override // M8.c, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new M8.o.a();
    }
}
