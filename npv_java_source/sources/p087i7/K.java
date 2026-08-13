package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements java.util.Collection, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final short[] f46718C;

    private static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final short[] f46719C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46720D;

        public a(short[] sArr) {
            p247y7.AbstractC7350t.f(sArr, "array");
            this.f46719C = sArr;
        }

        public short b() {
            int i6 = this.f46720D;
            short[] sArr = this.f46719C;
            if (i6 >= sArr.length) {
                throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f46720D));
            }
            this.f46720D = i6 + 1;
            return p087i7.J.g(sArr[i6]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46720D < this.f46719C.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
            return p087i7.J.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ K(short[] sArr) {
        this.f46718C = sArr;
    }

    public static boolean C(short[] sArr, java.lang.Object obj) {
        return (obj instanceof p087i7.K) && p247y7.AbstractC7350t.b(sArr, ((p087i7.K) obj).S());
    }

    public static final short D(short[] sArr, int i6) {
        return p087i7.J.g(sArr[i6]);
    }

    public static int M(short[] sArr) {
        return sArr.length;
    }

    public static int N(short[] sArr) {
        return java.util.Arrays.hashCode(sArr);
    }

    public static boolean O(short[] sArr) {
        return sArr.length == 0;
    }

    public static java.util.Iterator P(short[] sArr) {
        return new i7.K.a(sArr);
    }

    public static final void Q(short[] sArr, int i6, short s6) {
        sArr[i6] = s6;
    }

    public static java.lang.String R(short[] sArr) {
        return "UShortArray(storage=" + java.util.Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ p087i7.K d(short[] sArr) {
        return new p087i7.K(sArr);
    }

    public static short[] e(int i6) {
        return f(new short[i6]);
    }

    public static short[] f(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "storage");
        return sArr;
    }

    public static boolean o(short[] sArr, short s6) {
        return p097j7.AbstractC6872n.U(sArr, s6);
    }

    public static boolean s(short[] sArr, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof p087i7.J) || !p097j7.AbstractC6872n.U(sArr, ((p087i7.J) obj).o())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public int size() {
        return M(this.f46718C);
    }

    public final /* synthetic */ short[] S() {
        return this.f46718C;
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
        if (obj instanceof p087i7.J) {
            return g(((p087i7.J) obj).o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return s(this.f46718C, collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return C(this.f46718C, obj);
    }

    public boolean g(short s6) {
        return o(this.f46718C, s6);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return N(this.f46718C);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return O(this.f46718C);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return P(this.f46718C);
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
        return R(this.f46718C);
    }
}
