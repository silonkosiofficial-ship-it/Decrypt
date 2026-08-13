package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends p097j7.AbstractC6866h implements java.util.List, java.util.RandomAccess, java.io.Serializable, p256z7.d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final p107k7.b.C0624b f49716F = new p107k7.b.C0624b(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final p107k7.b f49717G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f49718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f49719D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f49720E;

    public static final class a extends p097j7.AbstractC6866h implements java.util.List, java.util.RandomAccess, java.io.Serializable, p256z7.d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.lang.Object[] f49721C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f49722D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f49723E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final k7.b.a f49724F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final p107k7.b f49725G;

        /* JADX INFO: renamed from: k7.b$a$a, reason: collision with other inner class name */
        private static final class C0623a implements java.util.ListIterator, p256z7.a {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final k7.b.a f49726C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f49727D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f49728E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private int f49729F;

            public C0623a(k7.b.a aVar, int i6) {
                p247y7.AbstractC7350t.f(aVar, "list");
                this.f49726C = aVar;
                this.f49727D = i6;
                this.f49728E = -1;
                this.f49729F = ((java.util.AbstractList) aVar).modCount;
            }

            private final void b() {
                if (((java.util.AbstractList) this.f49726C.f49725G).modCount != this.f49729F) {
                    throw new java.util.ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(java.lang.Object obj) {
                b();
                k7.b.a aVar = this.f49726C;
                int i6 = this.f49727D;
                this.f49727D = i6 + 1;
                aVar.add(i6, obj);
                this.f49728E = -1;
                this.f49729F = ((java.util.AbstractList) this.f49726C).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f49727D < this.f49726C.f49723E;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f49727D > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public java.lang.Object next() {
                b();
                if (this.f49727D >= this.f49726C.f49723E) {
                    throw new java.util.NoSuchElementException();
                }
                int i6 = this.f49727D;
                this.f49727D = i6 + 1;
                this.f49728E = i6;
                return this.f49726C.f49721C[this.f49726C.f49722D + this.f49728E];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f49727D;
            }

            @Override // java.util.ListIterator
            public java.lang.Object previous() {
                b();
                int i6 = this.f49727D;
                if (i6 <= 0) {
                    throw new java.util.NoSuchElementException();
                }
                int i10 = i6 - 1;
                this.f49727D = i10;
                this.f49728E = i10;
                return this.f49726C.f49721C[this.f49726C.f49722D + this.f49728E];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f49727D - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i6 = this.f49728E;
                if (i6 == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f49726C.remove(i6);
                this.f49727D = this.f49728E;
                this.f49728E = -1;
                this.f49729F = ((java.util.AbstractList) this.f49726C).modCount;
            }

            @Override // java.util.ListIterator
            public void set(java.lang.Object obj) {
                b();
                int i6 = this.f49728E;
                if (i6 == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f49726C.set(i6, obj);
            }
        }

        public a(java.lang.Object[] objArr, int i6, int i10, k7.b.a aVar, p107k7.b bVar) {
            p247y7.AbstractC7350t.f(objArr, "backing");
            p247y7.AbstractC7350t.f(bVar, "root");
            this.f49721C = objArr;
            this.f49722D = i6;
            this.f49723E = i10;
            this.f49724F = aVar;
            this.f49725G = bVar;
            ((java.util.AbstractList) this).modCount = ((java.util.AbstractList) bVar).modCount;
        }

        private final void D(int i6, java.util.Collection collection, int i10) {
            Q();
            k7.b.a aVar = this.f49724F;
            if (aVar != null) {
                aVar.D(i6, collection, i10);
            } else {
                this.f49725G.O(i6, collection, i10);
            }
            this.f49721C = this.f49725G.f49718C;
            this.f49723E += i10;
        }

        private final void E(int i6, java.lang.Object obj) {
            Q();
            k7.b.a aVar = this.f49724F;
            if (aVar != null) {
                aVar.E(i6, obj);
            } else {
                this.f49725G.P(i6, obj);
            }
            this.f49721C = this.f49725G.f49718C;
            this.f49723E++;
        }

        private final void M() {
            if (((java.util.AbstractList) this.f49725G).modCount != ((java.util.AbstractList) this).modCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        private final void N() {
            if (P()) {
                throw new java.lang.UnsupportedOperationException();
            }
        }

        private final boolean O(java.util.List list) {
            return p107k7.c.h(this.f49721C, this.f49722D, this.f49723E, list);
        }

        private final boolean P() {
            return this.f49725G.f49720E;
        }

        private final void Q() {
            ((java.util.AbstractList) this).modCount++;
        }

        private final java.lang.Object R(int i6) {
            Q();
            k7.b.a aVar = this.f49724F;
            java.lang.Object objR = aVar != null ? aVar.R(i6) : this.f49725G.X(i6);
            this.f49723E--;
            return objR;
        }

        private final void S(int i6, int i10) {
            if (i10 > 0) {
                Q();
            }
            k7.b.a aVar = this.f49724F;
            if (aVar != null) {
                aVar.S(i6, i10);
            } else {
                this.f49725G.Y(i6, i10);
            }
            this.f49723E -= i10;
        }

        private final int T(int i6, int i10, java.util.Collection collection, boolean z6) {
            k7.b.a aVar = this.f49724F;
            int iT = aVar != null ? aVar.T(i6, i10, collection, z6) : this.f49725G.Z(i6, i10, collection, z6);
            if (iT > 0) {
                Q();
            }
            this.f49723E -= iT;
            return iT;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i6, java.lang.Object obj) {
            N();
            M();
            p097j7.AbstractC6862d.f49298C.c(i6, this.f49723E);
            E(this.f49722D + i6, obj);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(java.lang.Object obj) {
            N();
            M();
            E(this.f49722D + this.f49723E, obj);
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i6, java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            N();
            M();
            p097j7.AbstractC6862d.f49298C.c(i6, this.f49723E);
            int size = collection.size();
            D(this.f49722D + i6, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            N();
            M();
            int size = collection.size();
            D(this.f49722D + this.f49723E, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            N();
            M();
            S(this.f49722D, this.f49723E);
        }

        @Override // p097j7.AbstractC6866h
        public int d() {
            M();
            return this.f49723E;
        }

        @Override // p097j7.AbstractC6866h
        public java.lang.Object e(int i6) {
            N();
            M();
            p097j7.AbstractC6862d.f49298C.b(i6, this.f49723E);
            return R(this.f49722D + i6);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(java.lang.Object obj) {
            M();
            return obj == this || ((obj instanceof java.util.List) && O((java.util.List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object get(int i6) {
            M();
            p097j7.AbstractC6862d.f49298C.b(i6, this.f49723E);
            return this.f49721C[this.f49722D + i6];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            M();
            return p107k7.c.i(this.f49721C, this.f49722D, this.f49723E);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(java.lang.Object obj) {
            M();
            for (int i6 = 0; i6 < this.f49723E; i6++) {
                if (p247y7.AbstractC7350t.b(this.f49721C[this.f49722D + i6], obj)) {
                    return i6;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            M();
            return this.f49723E == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            M();
            for (int i6 = this.f49723E - 1; i6 >= 0; i6--) {
                if (p247y7.AbstractC7350t.b(this.f49721C[this.f49722D + i6], obj)) {
                    return i6;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator listIterator(int i6) {
            M();
            p097j7.AbstractC6862d.f49298C.c(i6, this.f49723E);
            return new k7.b.a.C0623a(this, i6);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(java.lang.Object obj) {
            N();
            M();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            N();
            M();
            return T(this.f49722D, this.f49723E, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            N();
            M();
            return T(this.f49722D, this.f49723E, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object set(int i6, java.lang.Object obj) {
            N();
            M();
            p097j7.AbstractC6862d.f49298C.b(i6, this.f49723E);
            java.lang.Object[] objArr = this.f49721C;
            int i10 = this.f49722D;
            java.lang.Object obj2 = objArr[i10 + i6];
            objArr[i10 + i6] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List subList(int i6, int i10) {
            p097j7.AbstractC6862d.f49298C.d(i6, i10, this.f49723E);
            return new k7.b.a(this.f49721C, this.f49722D + i6, i10 - i6, this, this.f49725G);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public java.lang.Object[] toArray() {
            M();
            java.lang.Object[] objArr = this.f49721C;
            int i6 = this.f49722D;
            return p097j7.AbstractC6872n.r(objArr, i6, this.f49723E + i6);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "array");
            M();
            int length = objArr.length;
            int i6 = this.f49723E;
            if (length >= i6) {
                java.lang.Object[] objArr2 = this.f49721C;
                int i10 = this.f49722D;
                p097j7.AbstractC6872n.l(objArr2, objArr, 0, i10, i6 + i10);
                return p097j7.AbstractC6879v.f(this.f49723E, objArr);
            }
            java.lang.Object[] objArr3 = this.f49721C;
            int i11 = this.f49722D;
            java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr3, i11, i6 + i11, objArr.getClass());
            p247y7.AbstractC7350t.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            M();
            return p107k7.c.j(this.f49721C, this.f49722D, this.f49723E, this);
        }
    }

    /* JADX INFO: renamed from: k7.b$b, reason: collision with other inner class name */
    private static final class C0624b {
        private C0624b() {
        }

        public /* synthetic */ C0624b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private static final class c implements java.util.ListIterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p107k7.b f49730C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f49731D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f49732E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f49733F;

        public c(p107k7.b bVar, int i6) {
            p247y7.AbstractC7350t.f(bVar, "list");
            this.f49730C = bVar;
            this.f49731D = i6;
            this.f49732E = -1;
            this.f49733F = ((java.util.AbstractList) bVar).modCount;
        }

        private final void b() {
            if (((java.util.AbstractList) this.f49730C).modCount != this.f49733F) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(java.lang.Object obj) {
            b();
            p107k7.b bVar = this.f49730C;
            int i6 = this.f49731D;
            this.f49731D = i6 + 1;
            bVar.add(i6, obj);
            this.f49732E = -1;
            this.f49733F = ((java.util.AbstractList) this.f49730C).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f49731D < this.f49730C.f49719D;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f49731D > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
            b();
            if (this.f49731D >= this.f49730C.f49719D) {
                throw new java.util.NoSuchElementException();
            }
            int i6 = this.f49731D;
            this.f49731D = i6 + 1;
            this.f49732E = i6;
            return this.f49730C.f49718C[this.f49732E];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f49731D;
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
            b();
            int i6 = this.f49731D;
            if (i6 <= 0) {
                throw new java.util.NoSuchElementException();
            }
            int i10 = i6 - 1;
            this.f49731D = i10;
            this.f49732E = i10;
            return this.f49730C.f49718C[this.f49732E];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f49731D - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i6 = this.f49732E;
            if (i6 == -1) {
                throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f49730C.remove(i6);
            this.f49731D = this.f49732E;
            this.f49732E = -1;
            this.f49733F = ((java.util.AbstractList) this.f49730C).modCount;
        }

        @Override // java.util.ListIterator
        public void set(java.lang.Object obj) {
            b();
            int i6 = this.f49732E;
            if (i6 == -1) {
                throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f49730C.set(i6, obj);
        }
    }

    static {
        p107k7.b bVar = new p107k7.b(0);
        bVar.f49720E = true;
        f49717G = bVar;
    }

    public b(int i6) {
        this.f49718C = p107k7.c.d(i6);
    }

    public /* synthetic */ b(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 10 : i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(int i6, java.util.Collection collection, int i10) {
        W();
        V(i6, i10);
        java.util.Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f49718C[i6 + i11] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(int i6, java.lang.Object obj) {
        W();
        V(i6, 1);
        this.f49718C[i6] = obj;
    }

    private final void R() {
        if (this.f49720E) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final boolean S(java.util.List list) {
        return p107k7.c.h(this.f49718C, 0, this.f49719D, list);
    }

    private final void T(int i6) {
        if (i6 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArr = this.f49718C;
        if (i6 > objArr.length) {
            this.f49718C = p107k7.c.e(this.f49718C, p097j7.AbstractC6862d.f49298C.e(objArr.length, i6));
        }
    }

    private final void U(int i6) {
        T(this.f49719D + i6);
    }

    private final void V(int i6, int i10) {
        U(i10);
        java.lang.Object[] objArr = this.f49718C;
        p097j7.AbstractC6872n.l(objArr, objArr, i6 + i10, i6, this.f49719D);
        this.f49719D += i10;
    }

    private final void W() {
        ((java.util.AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object X(int i6) {
        W();
        java.lang.Object[] objArr = this.f49718C;
        java.lang.Object obj = objArr[i6];
        p097j7.AbstractC6872n.l(objArr, objArr, i6, i6 + 1, this.f49719D);
        p107k7.c.f(this.f49718C, this.f49719D - 1);
        this.f49719D--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(int i6, int i10) {
        if (i10 > 0) {
            W();
        }
        java.lang.Object[] objArr = this.f49718C;
        p097j7.AbstractC6872n.l(objArr, objArr, i6, i6 + i10, this.f49719D);
        java.lang.Object[] objArr2 = this.f49718C;
        int i11 = this.f49719D;
        p107k7.c.g(objArr2, i11 - i10, i11);
        this.f49719D -= i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z(int i6, int i10, java.util.Collection collection, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i6 + i11;
            if (collection.contains(this.f49718C[i13]) == z6) {
                java.lang.Object[] objArr = this.f49718C;
                i11++;
                objArr[i12 + i6] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        java.lang.Object[] objArr2 = this.f49718C;
        p097j7.AbstractC6872n.l(objArr2, objArr2, i6 + i12, i10 + i6, this.f49719D);
        java.lang.Object[] objArr3 = this.f49718C;
        int i15 = this.f49719D;
        p107k7.c.g(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            W();
        }
        this.f49719D -= i14;
        return i14;
    }

    public final java.util.List Q() {
        R();
        this.f49720E = true;
        return this.f49719D > 0 ? this : f49717G;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, java.lang.Object obj) {
        R();
        p097j7.AbstractC6862d.f49298C.c(i6, this.f49719D);
        P(i6, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        R();
        P(this.f49719D, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        R();
        p097j7.AbstractC6862d.f49298C.c(i6, this.f49719D);
        int size = collection.size();
        O(i6, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        R();
        int size = collection.size();
        O(this.f49719D, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        R();
        Y(0, this.f49719D);
    }

    @Override // p097j7.AbstractC6866h
    public int d() {
        return this.f49719D;
    }

    @Override // p097j7.AbstractC6866h
    public java.lang.Object e(int i6) {
        R();
        p097j7.AbstractC6862d.f49298C.b(i6, this.f49719D);
        return X(i6);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof java.util.List) && S((java.util.List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i6) {
        p097j7.AbstractC6862d.f49298C.b(i6, this.f49719D);
        return this.f49718C[i6];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return p107k7.c.i(this.f49718C, 0, this.f49719D);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        for (int i6 = 0; i6 < this.f49719D; i6++) {
            if (p247y7.AbstractC7350t.b(this.f49718C[i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f49719D == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        for (int i6 = this.f49719D - 1; i6 >= 0; i6--) {
            if (p247y7.AbstractC7350t.b(this.f49718C[i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        p097j7.AbstractC6862d.f49298C.c(i6, this.f49719D);
        return new k7.b.c(this, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        R();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        R();
        return Z(0, this.f49719D, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        R();
        return Z(0, this.f49719D, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        R();
        p097j7.AbstractC6862d.f49298C.b(i6, this.f49719D);
        java.lang.Object[] objArr = this.f49718C;
        java.lang.Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.List subList(int i6, int i10) {
        p097j7.AbstractC6862d.f49298C.d(i6, i10, this.f49719D);
        return new k7.b.a(this.f49718C, i6, i10 - i6, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return p097j7.AbstractC6872n.r(this.f49718C, 0, this.f49719D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        int length = objArr.length;
        int i6 = this.f49719D;
        if (length >= i6) {
            p097j7.AbstractC6872n.l(this.f49718C, objArr, 0, 0, i6);
            return p097j7.AbstractC6879v.f(this.f49719D, objArr);
        }
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(this.f49718C, 0, i6, objArr.getClass());
        p247y7.AbstractC7350t.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return p107k7.c.j(this.f49718C, 0, this.f49719D, this);
    }
}
