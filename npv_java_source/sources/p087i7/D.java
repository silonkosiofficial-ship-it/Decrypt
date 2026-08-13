package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements java.util.Collection, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final byte[] f46702C;

    private static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final byte[] f46703C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46704D;

        public a(byte[] bArr) {
            p247y7.AbstractC7350t.f(bArr, "array");
            this.f46703C = bArr;
        }

        public byte b() {
            int i6 = this.f46704D;
            byte[] bArr = this.f46703C;
            if (i6 >= bArr.length) {
                throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f46704D));
            }
            this.f46704D = i6 + 1;
            return p087i7.C.g(bArr[i6]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46704D < this.f46703C.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
            return p087i7.C.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ D(byte[] bArr) {
        this.f46702C = bArr;
    }

    public static boolean C(byte[] bArr, java.lang.Object obj) {
        return (obj instanceof p087i7.D) && p247y7.AbstractC7350t.b(bArr, ((p087i7.D) obj).T());
    }

    public static final boolean D(byte[] bArr, byte[] bArr2) {
        return p247y7.AbstractC7350t.b(bArr, bArr2);
    }

    public static final byte E(byte[] bArr, int i6) {
        return p087i7.C.g(bArr[i6]);
    }

    public static int N(byte[] bArr) {
        return bArr.length;
    }

    public static int O(byte[] bArr) {
        return java.util.Arrays.hashCode(bArr);
    }

    public static boolean P(byte[] bArr) {
        return bArr.length == 0;
    }

    public static java.util.Iterator Q(byte[] bArr) {
        return new i7.D.a(bArr);
    }

    public static final void R(byte[] bArr, int i6, byte b6) {
        bArr[i6] = b6;
    }

    public static java.lang.String S(byte[] bArr) {
        return "UByteArray(storage=" + java.util.Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ p087i7.D d(byte[] bArr) {
        return new p087i7.D(bArr);
    }

    public static byte[] e(int i6) {
        return f(new byte[i6]);
    }

    public static byte[] f(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "storage");
        return bArr;
    }

    public static boolean o(byte[] bArr, byte b6) {
        return p097j7.AbstractC6872n.P(bArr, b6);
    }

    public static boolean s(byte[] bArr, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof p087i7.C) || !p097j7.AbstractC6872n.P(bArr, ((p087i7.C) obj).o())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public int size() {
        return N(this.f46702C);
    }

    public final /* synthetic */ byte[] T() {
        return this.f46702C;
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
        if (obj instanceof p087i7.C) {
            return g(((p087i7.C) obj).o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return s(this.f46702C, collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return C(this.f46702C, obj);
    }

    public boolean g(byte b6) {
        return o(this.f46702C, b6);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return O(this.f46702C);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return P(this.f46702C);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return Q(this.f46702C);
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
        return S(this.f46702C);
    }
}
