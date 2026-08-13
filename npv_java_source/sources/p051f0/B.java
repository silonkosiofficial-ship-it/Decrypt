package p051f0;

/* JADX INFO: loaded from: classes.dex */
final class B implements java.util.List, p256z7.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p051f0.r f44777C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f44778D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f44779E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f44780F;

    public static final class a implements java.util.ListIterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p247y7.M f44781C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p051f0.B f44782D;

        a(p247y7.M m6, p051f0.B b6) {
            this.f44781C = m6;
            this.f44782D = b6;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Void add(java.lang.Object obj) {
            p051f0.s.f();
            throw new p087i7.C6665k();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.lang.Void remove() {
            p051f0.s.f();
            throw new p087i7.C6665k();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.Void set(java.lang.Object obj) {
            p051f0.s.f();
            throw new p087i7.C6665k();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f44781C.f57252C < this.f44782D.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f44781C.f57252C >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
            int i6 = this.f44781C.f57252C + 1;
            p051f0.s.g(i6, this.f44782D.size());
            this.f44781C.f57252C = i6;
            return this.f44782D.get(i6);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f44781C.f57252C + 1;
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
            int i6 = this.f44781C.f57252C;
            p051f0.s.g(i6, this.f44782D.size());
            this.f44781C.f57252C = i6 - 1;
            return this.f44782D.get(i6);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f44781C.f57252C;
        }
    }

    public B(p051f0.r rVar, int i6, int i10) {
        this.f44777C = rVar;
        this.f44778D = i6;
        this.f44779E = rVar.g();
        this.f44780F = i10 - i6;
    }

    private final void f() {
        if (this.f44777C.g() != this.f44779E) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public void add(int i6, java.lang.Object obj) {
        f();
        this.f44777C.add(this.f44778D + i6, obj);
        this.f44780F = size() + 1;
        this.f44779E = this.f44777C.g();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        f();
        this.f44777C.add(this.f44778D + size(), obj);
        this.f44780F = size() + 1;
        this.f44779E = this.f44777C.g();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        f();
        boolean zAddAll = this.f44777C.addAll(i6 + this.f44778D, collection);
        if (zAddAll) {
            this.f44780F = size() + collection.size();
            this.f44779E = this.f44777C.g();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            f();
            p051f0.r rVar = this.f44777C;
            int i6 = this.f44778D;
            rVar.E(i6, size() + i6);
            this.f44780F = 0;
            this.f44779E = this.f44777C.g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f44780F;
    }

    public java.lang.Object e(int i6) {
        f();
        java.lang.Object objRemove = this.f44777C.remove(this.f44778D + i6);
        this.f44780F = size() - 1;
        this.f44779E = this.f44777C.g();
        return objRemove;
    }

    @Override // java.util.List
    public java.lang.Object get(int i6) {
        f();
        p051f0.s.g(i6, size());
        return this.f44777C.get(this.f44778D + i6);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        f();
        int i6 = this.f44778D;
        java.util.Iterator it = E7.j.q(i6, size() + i6).iterator();
        while (it.hasNext()) {
            int iB = ((p097j7.O) it).b();
            if (p247y7.AbstractC7350t.b(obj, this.f44777C.get(iB))) {
                return iB - this.f44778D;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        f();
        int size = this.f44778D + size();
        do {
            size--;
            if (size < this.f44778D) {
                return -1;
            }
        } while (!p247y7.AbstractC7350t.b(obj, this.f44777C.get(size)));
        return size - this.f44778D;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i6) {
        f();
        p247y7.M m6 = new p247y7.M();
        m6.f57252C = i6 - 1;
        return new f0.B.a(m6, this);
    }

    @Override // java.util.List
    public final /* bridge */ java.lang.Object remove(int i6) {
        return e(i6);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (true) {
            boolean z6 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        f();
        p051f0.r rVar = this.f44777C;
        int i6 = this.f44778D;
        int iM = rVar.M(collection, i6, size() + i6);
        if (iM > 0) {
            this.f44779E = this.f44777C.g();
            this.f44780F = size() - iM;
        }
        return iM > 0;
    }

    @Override // java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        p051f0.s.g(i6, size());
        f();
        java.lang.Object obj2 = this.f44777C.set(i6 + this.f44778D, obj);
        this.f44779E = this.f44777C.g();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List
    public java.util.List subList(int i6, int i10) {
        if (!(i6 >= 0 && i6 <= i10 && i10 <= size())) {
            V.I0.a("fromIndex or toIndex are out of bounds");
        }
        f();
        p051f0.r rVar = this.f44777C;
        int i11 = this.f44778D;
        return new p051f0.B(rVar, i6 + i11, i10 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return p247y7.AbstractC7341j.b(this, objArr);
    }
}
