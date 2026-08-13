package R8;

/* JADX INFO: loaded from: classes2.dex */
final class i extends R8.j implements java.util.Iterator, p127m7.e, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f9766C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f9767D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.Iterator f9768E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p127m7.e f9769F;

    private final java.lang.Throwable c() {
        int i6 = this.f9766C;
        if (i6 == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i6 == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.f9766C);
    }

    private final java.lang.Object d() {
        if (hasNext()) {
            return next();
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // R8.j
    public java.lang.Object b(java.lang.Object obj, p127m7.e eVar) {
        this.f9767D = obj;
        this.f9766C = 3;
        this.f9769F = eVar;
        java.lang.Object objG = p137n7.b.g();
        if (objG == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objG == p137n7.b.g() ? objG : p087i7.M.f46721a;
    }

    public final void e(p127m7.e eVar) {
        this.f9769F = eVar;
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return p127m7.j.f51198C;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws java.lang.Throwable {
        while (true) {
            int i6 = this.f9766C;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2 || i6 == 3) {
                        return true;
                    }
                    if (i6 == 4) {
                        return false;
                    }
                    throw c();
                }
                java.util.Iterator it = this.f9768E;
                p247y7.AbstractC7350t.c(it);
                if (it.hasNext()) {
                    this.f9766C = 2;
                    return true;
                }
                this.f9768E = null;
            }
            this.f9766C = 5;
            p127m7.e eVar = this.f9769F;
            p247y7.AbstractC7350t.c(eVar);
            this.f9769F = null;
            i7.w.a aVar = p087i7.w.f46751D;
            eVar.t(p087i7.w.b(p087i7.M.f46721a));
        }
    }

    @Override // java.util.Iterator
    public java.lang.Object next() throws java.lang.Throwable {
        int i6 = this.f9766C;
        if (i6 == 0 || i6 == 1) {
            return d();
        }
        if (i6 == 2) {
            this.f9766C = 1;
            java.util.Iterator it = this.f9768E;
            p247y7.AbstractC7350t.c(it);
            return it.next();
        }
        if (i6 != 3) {
            throw c();
        }
        this.f9766C = 0;
        java.lang.Object obj = this.f9767D;
        this.f9767D = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p127m7.e
    public void t(java.lang.Object obj) {
        p087i7.x.b(obj);
        this.f9766C = 4;
    }
}
