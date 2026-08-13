package R8;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.h f9747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f9749c;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f9750C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f9751D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.lang.Object f9752E;

        a() {
            this.f9750C = R8.e.this.f9747a.iterator();
        }

        private final void b() {
            int i6;
            while (this.f9750C.hasNext()) {
                java.lang.Object next = this.f9750C.next();
                if (((java.lang.Boolean) R8.e.this.f9749c.l(next)).booleanValue() == R8.e.this.f9748b) {
                    this.f9752E = next;
                    i6 = 1;
                    this.f9751D = i6;
                }
            }
            i6 = 0;
            this.f9751D = i6;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9751D == -1) {
                b();
            }
            return this.f9751D == 1;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (this.f9751D == -1) {
                b();
            }
            if (this.f9751D == 0) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object obj = this.f9752E;
            this.f9752E = null;
            this.f9751D = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(R8.h hVar, boolean z6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "sequence");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        this.f9747a = hVar;
        this.f9748b = z6;
        this.f9749c = lVar;
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new R8.e.a();
    }
}
