package p097j7;

/* JADX INFO: renamed from: j7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6862d extends p097j7.AbstractC6860b implements java.util.List, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p097j7.AbstractC6862d.a f49298C = new p097j7.AbstractC6862d.a(null);

    /* JADX INFO: renamed from: j7.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final void a(int i6, int i10, int i11) {
            if (i6 < 0 || i10 > i11) {
                throw new java.lang.IndexOutOfBoundsException("startIndex: " + i6 + ", endIndex: " + i10 + ", size: " + i11);
            }
            if (i6 <= i10) {
                return;
            }
            throw new java.lang.IllegalArgumentException("startIndex: " + i6 + " > endIndex: " + i10);
        }

        public final void b(int i6, int i10) {
            if (i6 < 0 || i6 >= i10) {
                throw new java.lang.IndexOutOfBoundsException("index: " + i6 + ", size: " + i10);
            }
        }

        public final void c(int i6, int i10) {
            if (i6 < 0 || i6 > i10) {
                throw new java.lang.IndexOutOfBoundsException("index: " + i6 + ", size: " + i10);
            }
        }

        public final void d(int i6, int i10, int i11) {
            if (i6 < 0 || i10 > i11) {
                throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i6 + ", toIndex: " + i10 + ", size: " + i11);
            }
            if (i6 <= i10) {
                return;
            }
            throw new java.lang.IllegalArgumentException("fromIndex: " + i6 + " > toIndex: " + i10);
        }

        public final int e(int i6, int i10) {
            int i11 = i6 + (i6 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                return i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i11;
        }

        public final boolean f(java.util.Collection collection, java.util.Collection collection2) {
            p247y7.AbstractC7350t.f(collection, "c");
            p247y7.AbstractC7350t.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            java.util.Iterator it = collection2.iterator();
            java.util.Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!p247y7.AbstractC7350t.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "c");
            java.util.Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: j7.d$b */
    private class b implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f49299C;

        public b() {
        }

        protected final int b() {
            return this.f49299C;
        }

        protected final void c(int i6) {
            this.f49299C = i6;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49299C < p097j7.AbstractC6862d.this.size();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            p097j7.AbstractC6862d abstractC6862d = p097j7.AbstractC6862d.this;
            int i6 = this.f49299C;
            this.f49299C = i6 + 1;
            return abstractC6862d.get(i6);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: j7.d$c */
    private class c extends p097j7.AbstractC6862d.b implements java.util.ListIterator, p256z7.a {
        public c(int i6) {
            super();
            p097j7.AbstractC6862d.f49298C.c(i6, p097j7.AbstractC6862d.this.size());
            c(i6);
        }

        @Override // java.util.ListIterator
        public void add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
            if (!hasPrevious()) {
                throw new java.util.NoSuchElementException();
            }
            p097j7.AbstractC6862d abstractC6862d = p097j7.AbstractC6862d.this;
            c(b() - 1);
            return abstractC6862d.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: j7.d$d, reason: collision with other inner class name */
    private static final class C0616d extends p097j7.AbstractC6862d implements java.util.RandomAccess {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p097j7.AbstractC6862d f49302D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f49303E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f49304F;

        public C0616d(p097j7.AbstractC6862d abstractC6862d, int i6, int i10) {
            p247y7.AbstractC7350t.f(abstractC6862d, "list");
            this.f49302D = abstractC6862d;
            this.f49303E = i6;
            p097j7.AbstractC6862d.f49298C.d(i6, i10, abstractC6862d.size());
            this.f49304F = i10 - i6;
        }

        @Override // p097j7.AbstractC6860b
        public int e() {
            return this.f49304F;
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        public java.lang.Object get(int i6) {
            p097j7.AbstractC6862d.f49298C.b(i6, this.f49304F);
            return this.f49302D.get(this.f49303E + i6);
        }
    }

    protected AbstractC6862d() {
    }

    @Override // java.util.List
    public void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            return f49298C.f(this, (java.util.Collection) obj);
        }
        return false;
    }

    public abstract java.lang.Object get(int i6);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f49298C.g(this);
    }

    public int indexOf(java.lang.Object obj) {
        java.util.Iterator it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b(it.next(), obj)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new p097j7.AbstractC6862d.b();
    }

    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (p247y7.AbstractC7350t.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public java.util.ListIterator listIterator() {
        return new p097j7.AbstractC6862d.c(0);
    }

    public java.util.ListIterator listIterator(int i6) {
        return new p097j7.AbstractC6862d.c(i6);
    }

    @Override // java.util.List
    public java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.util.List subList(int i6, int i10) {
        return new p097j7.AbstractC6862d.C0616d(this, i6, i10);
    }
}
