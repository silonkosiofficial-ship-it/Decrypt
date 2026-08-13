package F0;

/* JADX INFO: renamed from: F0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935v implements java.util.List, p256z7.a, j$.util.List {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f2715F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f2712C = new java.lang.Object[16];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long[] f2713D = new long[16];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f2714E = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f2716G = true;

    /* JADX INFO: renamed from: F0.v$a */
    private final class a implements java.util.ListIterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f2717C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f2718D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f2719E;

        public a(int i6, int i10, int i11) {
            this.f2717C = i6;
            this.f2718D = i10;
            this.f2719E = i11;
        }

        public /* synthetic */ a(F0.C0935v c0935v, int i6, int i10, int i11, int i12, p247y7.AbstractC7342k abstractC7342k) {
            this((i12 & 1) != 0 ? 0 : i6, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? c0935v.size() : i11);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.d.c next() {
            java.lang.Object[] objArr = F0.C0935v.this.f2712C;
            int i6 = this.f2717C;
            this.f2717C = i6 + 1;
            java.lang.Object obj = objArr[i6];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.d.c) obj;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.d.c previous() {
            java.lang.Object[] objArr = F0.C0935v.this.f2712C;
            int i6 = this.f2717C - 1;
            this.f2717C = i6;
            java.lang.Object obj = objArr[i6];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.d.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f2717C < this.f2719E;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f2717C > this.f2718D;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f2717C - this.f2718D;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f2717C - this.f2718D) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: F0.v$b */
    private final class b implements java.util.List, p256z7.a, j$.util.List {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f2721C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f2722D;

        public b(int i6, int i10) {
            this.f2721C = i6;
            this.f2722D = i10;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i6, java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i6, java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.d.c) {
                return d((androidx.compose.ui.d.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.d.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean d(androidx.compose.ui.d.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.d.c get(int i6) {
            java.lang.Object obj = F0.C0935v.this.f2712C[i6 + this.f2721C];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.d.c) obj;
        }

        public int f() {
            return this.f2722D - this.f2721C;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            j$.lang.Iterable$CC.$default$forEach(this, consumer);
        }

        public int g(androidx.compose.ui.d.c cVar) {
            int i6 = this.f2721C;
            int i10 = this.f2722D;
            if (i6 > i10) {
                return -1;
            }
            while (!p247y7.AbstractC7350t.b(F0.C0935v.this.f2712C[i6], cVar)) {
                if (i6 == i10) {
                    return -1;
                }
                i6++;
            }
            return i6 - this.f2721C;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.d.c) {
                return g((androidx.compose.ui.d.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            F0.C0935v c0935v = F0.C0935v.this;
            int i6 = this.f2721C;
            return c0935v.new a(i6, i6, this.f2722D);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof androidx.compose.ui.d.c) {
                return o((androidx.compose.ui.d.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator() {
            F0.C0935v c0935v = F0.C0935v.this;
            int i6 = this.f2721C;
            return c0935v.new a(i6, i6, this.f2722D);
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator(int i6) {
            F0.C0935v c0935v = F0.C0935v.this;
            int i10 = this.f2721C;
            return c0935v.new a(i6 + i10, i10, this.f2722D);
        }

        public int o(androidx.compose.ui.d.c cVar) {
            int i6 = this.f2722D;
            int i10 = this.f2721C;
            if (i10 > i6) {
                return -1;
            }
            while (!p247y7.AbstractC7350t.b(F0.C0935v.this.f2712C[i6], cVar)) {
                if (i6 == i10) {
                    return -1;
                }
                i6--;
            }
            return i6 - this.f2721C;
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            return j$.util.Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream parallelStream() {
            return j$.util.stream.Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object remove(int i6) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return j$.util.Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.List, j$.util.List
        public void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.List, j$.util.List
        public void sort(java.util.Comparator comparator) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public /* synthetic */ j$.util.Spliterator spliterator() {
            return j$.util.List.CC.$default$spliterator(this);
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public /* synthetic */ java.util.Spliterator spliterator() {
            return j$.util.Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            return j$.util.Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return j$.util.stream.Stream.Wrapper.convert(stream());
        }

        @Override // java.util.List
        public java.util.List subList(int i6, int i10) {
            F0.C0935v c0935v = F0.C0935v.this;
            int i11 = this.f2721C;
            return c0935v.new b(i6 + i11, i11 + i10);
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
            return p247y7.AbstractC7341j.a(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
            return toArray((java.lang.Object[]) intFunction.apply(0));
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            return p247y7.AbstractC7341j.b(this, objArr);
        }
    }

    private final long C() {
        long jA = F0.AbstractC0936w.a(Float.POSITIVE_INFINITY, false);
        int i6 = this.f2714E + 1;
        int iO = p097j7.AbstractC6879v.o(this);
        if (i6 <= iO) {
            while (true) {
                long jB = F0.AbstractC0931q.b(this.f2713D[i6]);
                if (F0.AbstractC0931q.a(jB, jA) < 0) {
                    jA = jB;
                }
                if (F0.AbstractC0931q.c(jA) < 0.0f && F0.AbstractC0931q.d(jA)) {
                    return jA;
                }
                if (i6 != iO) {
                    i6++;
                }
            }
        }
        return jA;
    }

    private final void T() {
        int i6 = this.f2714E + 1;
        int iO = p097j7.AbstractC6879v.o(this);
        if (i6 <= iO) {
            while (true) {
                this.f2712C[i6] = null;
                if (i6 == iO) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f2715F = this.f2714E + 1;
    }

    private final void s() {
        int i6 = this.f2714E;
        java.lang.Object[] objArr = this.f2712C;
        if (i6 >= objArr.length) {
            int length = objArr.length + 16;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f2712C = objArrCopyOf;
            long[] jArrCopyOf = java.util.Arrays.copyOf(this.f2713D, length);
            p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f2713D = jArrCopyOf;
        }
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.d.c get(int i6) {
        java.lang.Object obj = this.f2712C[i6];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.d.c) obj;
    }

    public final boolean E() {
        return this.f2716G;
    }

    public int M() {
        return this.f2715F;
    }

    public final boolean N() {
        long jC = C();
        return F0.AbstractC0931q.c(jC) < 0.0f && F0.AbstractC0931q.d(jC);
    }

    public final void O(androidx.compose.ui.d.c cVar, boolean z6, p237x7.a aVar) {
        P(cVar, -1.0f, z6, aVar);
        F0.AbstractC0914d0 abstractC0914d0S1 = cVar.s1();
        if (abstractC0914d0S1 == null || abstractC0914d0S1.U2()) {
            return;
        }
        this.f2716G = false;
    }

    public final void P(androidx.compose.ui.d.c cVar, float f6, boolean z6, p237x7.a aVar) {
        int i6 = this.f2714E;
        this.f2714E = i6 + 1;
        s();
        java.lang.Object[] objArr = this.f2712C;
        int i10 = this.f2714E;
        objArr[i10] = cVar;
        this.f2713D[i10] = F0.AbstractC0936w.a(f6, z6);
        T();
        aVar.b();
        this.f2714E = i6;
    }

    public int Q(androidx.compose.ui.d.c cVar) {
        int iO = p097j7.AbstractC6879v.o(this);
        if (iO < 0) {
            return -1;
        }
        int i6 = 0;
        while (!p247y7.AbstractC7350t.b(this.f2712C[i6], cVar)) {
            if (i6 == iO) {
                return -1;
            }
            i6++;
        }
        return i6;
    }

    public final boolean R(float f6, boolean z6) {
        if (this.f2714E == p097j7.AbstractC6879v.o(this)) {
            return true;
        }
        return F0.AbstractC0931q.a(C(), F0.AbstractC0936w.a(f6, z6)) > 0;
    }

    public int S(androidx.compose.ui.d.c cVar) {
        for (int iO = p097j7.AbstractC6879v.o(this); -1 < iO; iO--) {
            if (p247y7.AbstractC7350t.b(this.f2712C[iO], cVar)) {
                return iO;
            }
        }
        return -1;
    }

    public final void U(androidx.compose.ui.d.c cVar, float f6, boolean z6, p237x7.a aVar) {
        if (this.f2714E == p097j7.AbstractC6879v.o(this)) {
            P(cVar, f6, z6, aVar);
            if (this.f2714E + 1 == p097j7.AbstractC6879v.o(this)) {
                T();
                return;
            }
            return;
        }
        long jC = C();
        int i6 = this.f2714E;
        this.f2714E = p097j7.AbstractC6879v.o(this);
        P(cVar, f6, z6, aVar);
        if (this.f2714E + 1 < p097j7.AbstractC6879v.o(this) && F0.AbstractC0931q.a(jC, C()) > 0) {
            int i10 = this.f2714E + 1;
            int i11 = i6 + 1;
            java.lang.Object[] objArr = this.f2712C;
            p097j7.AbstractC6872n.l(objArr, objArr, i11, i10, size());
            long[] jArr = this.f2713D;
            p097j7.AbstractC6872n.k(jArr, jArr, i11, i10, size());
            this.f2714E = ((size() + i6) - this.f2714E) - 1;
        }
        T();
        this.f2714E = i6;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2714E = -1;
        T();
        this.f2716G = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.d.c) {
            return o((androidx.compose.ui.d.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.d.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f2714E = size() - 1;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.d.c) {
            return Q((androidx.compose.ui.d.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new F0.C0935v.a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.d.c) {
            return S((androidx.compose.ui.d.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new F0.C0935v.a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i6) {
        return new F0.C0935v.a(this, i6, 0, 0, 6, null);
    }

    public boolean o(androidx.compose.ui.d.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return M();
    }

    @Override // java.util.List, j$.util.List
    public void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public java.util.List subList(int i6, int i10) {
        return new F0.C0935v.b(i6, i10);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return p247y7.AbstractC7341j.b(this, objArr);
    }
}
