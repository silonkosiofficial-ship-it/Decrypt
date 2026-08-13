package R8;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.h f9776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f9777b;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f9778C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f9779D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.lang.Object f9780E;

        a() {
            this.f9778C = R8.v.this.f9776a.iterator();
        }

        private final void b() {
            if (this.f9778C.hasNext()) {
                java.lang.Object next = this.f9778C.next();
                if (((java.lang.Boolean) R8.v.this.f9777b.l(next)).booleanValue()) {
                    this.f9779D = 1;
                    this.f9780E = next;
                    return;
                }
            }
            this.f9779D = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9779D == -1) {
                b();
            }
            return this.f9779D == 1;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (this.f9779D == -1) {
                b();
            }
            if (this.f9779D == 0) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object obj = this.f9780E;
            this.f9780E = null;
            this.f9779D = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "sequence");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        this.f9776a = hVar;
        this.f9777b = lVar;
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new R8.v.a();
    }
}
