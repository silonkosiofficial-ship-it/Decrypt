package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements java.util.Collection, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long[] f46712C;

    private static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final long[] f46713C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46714D;

        public a(long[] jArr) {
            p247y7.AbstractC7350t.f(jArr, "array");
            this.f46713C = jArr;
        }

        public long b() {
            int i6 = this.f46714D;
            long[] jArr = this.f46713C;
            if (i6 >= jArr.length) {
                throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f46714D));
            }
            this.f46714D = i6 + 1;
            return p087i7.G.g(jArr[i6]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46714D < this.f46713C.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
            return p087i7.G.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ H(long[] jArr) {
        this.f46712C = jArr;
    }

    public static boolean C(long[] jArr, java.lang.Object obj) {
        return (obj instanceof p087i7.H) && p247y7.AbstractC7350t.b(jArr, ((p087i7.H) obj).S());
    }

    public static final long D(long[] jArr, int i6) {
        return p087i7.G.g(jArr[i6]);
    }

    public static int M(long[] jArr) {
        return jArr.length;
    }

    public static int N(long[] jArr) {
        return java.util.Arrays.hashCode(jArr);
    }

    public static boolean O(long[] jArr) {
        return jArr.length == 0;
    }

    public static java.util.Iterator P(long[] jArr) {
        return new i7.H.a(jArr);
    }

    public static final void Q(long[] jArr, int i6, long j6) {
        jArr[i6] = j6;
    }

    public static java.lang.String R(long[] jArr) {
        return "ULongArray(storage=" + java.util.Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ p087i7.H d(long[] jArr) {
        return new p087i7.H(jArr);
    }

    public static long[] e(int i6) {
        return f(new long[i6]);
    }

    public static long[] f(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "storage");
        return jArr;
    }

    public static boolean o(long[] jArr, long j6) {
        return p097j7.AbstractC6872n.S(jArr, j6);
    }

    public static boolean s(long[] jArr, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof p087i7.G) || !p097j7.AbstractC6872n.S(jArr, ((p087i7.G) obj).q())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public int size() {
        return M(this.f46712C);
    }

    public final /* synthetic */ long[] S() {
        return this.f46712C;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof p087i7.G) {
            return g(((p087i7.G) obj).q());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return s(this.f46712C, collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return C(this.f46712C, obj);
    }

    public boolean g(long j6) {
        return o(this.f46712C, j6);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return N(this.f46712C);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return O(this.f46712C);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return P(this.f46712C);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        return R(this.f46712C);
    }
}
