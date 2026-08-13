package p097j7;

/* JADX INFO: loaded from: classes3.dex */
final class Y extends p097j7.AbstractC6866h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f49292C;

    public static final class a implements java.util.ListIterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.ListIterator f49293C;

        a(int i6) {
            this.f49293C = p097j7.Y.this.f49292C.listIterator(p097j7.D.U(p097j7.Y.this, i6));
        }

        @Override // java.util.ListIterator
        public void add(java.lang.Object obj) {
            this.f49293C.add(obj);
            this.f49293C.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f49293C.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f49293C.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
            return this.f49293C.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return p097j7.D.T(p097j7.Y.this, this.f49293C.previousIndex());
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
            return this.f49293C.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return p097j7.D.T(p097j7.Y.this, this.f49293C.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f49293C.remove();
        }

        @Override // java.util.ListIterator
        public void set(java.lang.Object obj) {
            this.f49293C.set(obj);
        }
    }

    public Y(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "delegate");
        this.f49292C = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, java.lang.Object obj) {
        this.f49292C.add(p097j7.D.U(this, i6), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f49292C.clear();
    }

    @Override // p097j7.AbstractC6866h
    public int d() {
        return this.f49292C.size();
    }

    @Override // p097j7.AbstractC6866h
    public java.lang.Object e(int i6) {
        return this.f49292C.remove(p097j7.D.S(this, i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i6) {
        return this.f49292C.get(p097j7.D.S(this, i6));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        return new j7.Y.a(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        return this.f49292C.set(p097j7.D.S(this, i6), obj);
    }
}
