package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements java.util.Collection, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int[] f46707C;

    private static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int[] f46708C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46709D;

        public a(int[] iArr) {
            p247y7.AbstractC7350t.f(iArr, "array");
            this.f46708C = iArr;
        }

        public int b() {
            int i6 = this.f46709D;
            int[] iArr = this.f46708C;
            if (i6 >= iArr.length) {
                throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f46709D));
            }
            this.f46709D = i6 + 1;
            return p087i7.E.g(iArr[i6]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46709D < this.f46708C.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
            return p087i7.E.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ F(int[] iArr) {
        this.f46707C = iArr;
    }

    public static boolean C(int[] iArr, java.lang.Object obj) {
        return (obj instanceof p087i7.F) && p247y7.AbstractC7350t.b(iArr, ((p087i7.F) obj).S());
    }

    public static final int D(int[] iArr, int i6) {
        return p087i7.E.g(iArr[i6]);
    }

    public static int M(int[] iArr) {
        return iArr.length;
    }

    public static int N(int[] iArr) {
        return java.util.Arrays.hashCode(iArr);
    }

    public static boolean O(int[] iArr) {
        return iArr.length == 0;
    }

    public static java.util.Iterator P(int[] iArr) {
        return new i7.F.a(iArr);
    }

    public static final void Q(int[] iArr, int i6, int i10) {
        iArr[i6] = i10;
    }

    public static java.lang.String R(int[] iArr) {
        return "UIntArray(storage=" + java.util.Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ p087i7.F d(int[] iArr) {
        return new p087i7.F(iArr);
    }

    public static int[] e(int i6) {
        return f(new int[i6]);
    }

    public static int[] f(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "storage");
        return iArr;
    }

    public static boolean o(int[] iArr, int i6) {
        return p097j7.AbstractC6872n.R(iArr, i6);
    }

    public static boolean s(int[] iArr, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof p087i7.E) || !p097j7.AbstractC6872n.R(iArr, ((p087i7.E) obj).o())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public int size() {
        return M(this.f46707C);
    }

    public final /* synthetic */ int[] S() {
        return this.f46707C;
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
        if (obj instanceof p087i7.E) {
            return g(((p087i7.E) obj).o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return s(this.f46707C, collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return C(this.f46707C, obj);
    }

    public boolean g(int i6) {
        return o(this.f46707C, i6);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return N(this.f46707C);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return O(this.f46707C);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return P(this.f46707C);
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
        return R(this.f46707C);
    }
}
