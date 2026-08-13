package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public class w extends java.util.AbstractList implements java.util.RandomAccess, p158p8.n {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p158p8.n f52862C;

    class a implements java.util.ListIterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.util.ListIterator f52863C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f52864D;

        a(int i6) {
            this.f52864D = i6;
            this.f52863C = p158p8.w.this.f52862C.listIterator(i6);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            return (java.lang.String) this.f52863C.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.String previous() {
            return (java.lang.String) this.f52863C.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f52863C.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f52863C.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f52863C.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f52863C.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    class b implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.util.Iterator f52866C;

        b() {
            this.f52866C = p158p8.w.this.f52862C.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            return (java.lang.String) this.f52866C.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52866C.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public w(p158p8.n nVar) {
        this.f52862C = nVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i6) {
        return (java.lang.String) this.f52862C.get(i6);
    }

    @Override // p158p8.n
    public java.util.List h() {
        return this.f52862C.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new p8.w.b();
    }

    @Override // p158p8.n
    public p158p8.n l() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        return new p8.w.a(i6);
    }

    @Override // p158p8.n
    public void p(p158p8.d dVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f52862C.size();
    }

    @Override // p158p8.n
    public p158p8.d z(int i6) {
        return this.f52862C.z(i6);
    }
}
