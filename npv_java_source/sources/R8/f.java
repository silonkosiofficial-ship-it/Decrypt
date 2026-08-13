package R8;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.h f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f9755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f9756c;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f9757C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.util.Iterator f9758D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f9759E;

        a() {
            this.f9757C = R8.f.this.f9754a.iterator();
        }

        private final boolean b() {
            java.util.Iterator it = this.f9758D;
            if (it != null && it.hasNext()) {
                this.f9759E = 1;
                return true;
            }
            while (this.f9757C.hasNext()) {
                java.util.Iterator it2 = (java.util.Iterator) R8.f.this.f9756c.l(R8.f.this.f9755b.l(this.f9757C.next()));
                if (it2.hasNext()) {
                    this.f9758D = it2;
                    this.f9759E = 1;
                    return true;
                }
            }
            this.f9759E = 2;
            this.f9758D = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i6 = this.f9759E;
            if (i6 == 1) {
                return true;
            }
            if (i6 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            int i6 = this.f9759E;
            if (i6 == 2) {
                throw new java.util.NoSuchElementException();
            }
            if (i6 == 0 && !b()) {
                throw new java.util.NoSuchElementException();
            }
            this.f9759E = 0;
            java.util.Iterator it = this.f9758D;
            p247y7.AbstractC7350t.c(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(R8.h hVar, p237x7.l lVar, p237x7.l lVar2) {
        p247y7.AbstractC7350t.f(hVar, "sequence");
        p247y7.AbstractC7350t.f(lVar, "transformer");
        p247y7.AbstractC7350t.f(lVar2, "iterator");
        this.f9754a = hVar;
        this.f9755b = lVar;
        this.f9756c = lVar2;
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new R8.f.a();
    }
}
