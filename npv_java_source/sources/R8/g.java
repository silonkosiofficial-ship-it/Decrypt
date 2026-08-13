package R8;

/* JADX INFO: loaded from: classes2.dex */
final class g implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.a f9761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f9762b;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.lang.Object f9763C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f9764D = -2;

        a() {
        }

        private final void b() {
            java.lang.Object objL;
            if (this.f9764D == -2) {
                objL = R8.g.this.f9761a.b();
            } else {
                p237x7.l lVar = R8.g.this.f9762b;
                java.lang.Object obj = this.f9763C;
                p247y7.AbstractC7350t.c(obj);
                objL = lVar.l(obj);
            }
            this.f9763C = objL;
            this.f9764D = objL == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9764D < 0) {
                b();
            }
            return this.f9764D == 1;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (this.f9764D < 0) {
                b();
            }
            if (this.f9764D == 0) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object obj = this.f9763C;
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f9764D = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(p237x7.a aVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(aVar, "getInitialValue");
        p247y7.AbstractC7350t.f(lVar, "getNextValue");
        this.f9761a = aVar;
        this.f9762b = lVar;
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new R8.g.a();
    }
}
