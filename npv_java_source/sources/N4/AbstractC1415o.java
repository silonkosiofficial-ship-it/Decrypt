package N4;

/* JADX INFO: renamed from: N4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1415o extends N4.AbstractC1414n implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final N4.T f7759D = new N4.AbstractC1415o.b(N4.I.f7686G, 0);

    /* JADX INFO: renamed from: N4.o$a */
    public static final class a extends N4.AbstractC1414n.a {
        public a() {
            this(4);
        }

        a(int i6) {
            super(i6);
        }

        public N4.AbstractC1415o.a e(java.lang.Object... objArr) {
            super.b(objArr);
            return this;
        }

        public N4.AbstractC1415o f() {
            this.f7758c = true;
            return N4.AbstractC1415o.s(this.f7756a, this.f7757b);
        }
    }

    /* JADX INFO: renamed from: N4.o$b */
    static class b extends N4.AbstractC1401a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final N4.AbstractC1415o f7760E;

        b(N4.AbstractC1415o abstractC1415o, int i6) {
            super(abstractC1415o.size(), i6);
            this.f7760E = abstractC1415o;
        }

        @Override // N4.AbstractC1401a
        protected java.lang.Object b(int i6) {
            return this.f7760E.get(i6);
        }
    }

    /* JADX INFO: renamed from: N4.o$c */
    private static class c extends N4.AbstractC1415o {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final transient N4.AbstractC1415o f7761E;

        c(N4.AbstractC1415o abstractC1415o) {
            this.f7761E = abstractC1415o;
        }

        private int U(int i6) {
            return (size() - 1) - i6;
        }

        private int V(int i6) {
            return size() - i6;
        }

        @Override // N4.AbstractC1415o
        public N4.AbstractC1415o Q() {
            return this.f7761E;
        }

        @Override // N4.AbstractC1415o, java.util.List
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public N4.AbstractC1415o subList(int i6, int i10) {
            M4.h.m(i6, i10, size());
            return this.f7761E.subList(V(i10), V(i6)).Q();
        }

        @Override // N4.AbstractC1415o, N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return this.f7761E.contains(obj);
        }

        @Override // java.util.List
        public java.lang.Object get(int i6) {
            M4.h.g(i6, size());
            return this.f7761E.get(U(i6));
        }

        @Override // N4.AbstractC1415o, java.util.List
        public int indexOf(java.lang.Object obj) {
            int iLastIndexOf = this.f7761E.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return U(iLastIndexOf);
            }
            return -1;
        }

        @Override // N4.AbstractC1415o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // N4.AbstractC1415o, java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            int iIndexOf = this.f7761E.indexOf(obj);
            if (iIndexOf >= 0) {
                return U(iIndexOf);
            }
            return -1;
        }

        @Override // N4.AbstractC1415o, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // N4.AbstractC1415o, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i6) {
            return super.listIterator(i6);
        }

        @Override // N4.AbstractC1414n
        boolean n() {
            return this.f7761E.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7761E.size();
        }
    }

    /* JADX INFO: renamed from: N4.o$d */
    class d extends N4.AbstractC1415o {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final transient int f7762E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final transient int f7763F;

        d(int i6, int i10) {
            this.f7762E = i6;
            this.f7763F = i10;
        }

        @Override // N4.AbstractC1415o, java.util.List
        /* JADX INFO: renamed from: S */
        public N4.AbstractC1415o subList(int i6, int i10) {
            M4.h.m(i6, i10, this.f7763F);
            N4.AbstractC1415o abstractC1415o = N4.AbstractC1415o.this;
            int i11 = this.f7762E;
            return abstractC1415o.subList(i6 + i11, i10 + i11);
        }

        @Override // N4.AbstractC1414n
        java.lang.Object[] e() {
            return N4.AbstractC1415o.this.e();
        }

        @Override // N4.AbstractC1414n
        int f() {
            return N4.AbstractC1415o.this.g() + this.f7762E + this.f7763F;
        }

        @Override // N4.AbstractC1414n
        int g() {
            return N4.AbstractC1415o.this.g() + this.f7762E;
        }

        @Override // java.util.List
        public java.lang.Object get(int i6) {
            M4.h.g(i6, this.f7763F);
            return N4.AbstractC1415o.this.get(i6 + this.f7762E);
        }

        @Override // N4.AbstractC1415o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // N4.AbstractC1415o, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // N4.AbstractC1415o, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i6) {
            return super.listIterator(i6);
        }

        @Override // N4.AbstractC1414n
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7763F;
        }
    }

    AbstractC1415o() {
    }

    public static N4.AbstractC1415o M() {
        return N4.I.f7686G;
    }

    public static N4.AbstractC1415o N(java.lang.Object obj, java.lang.Object obj2) {
        return w(obj, obj2);
    }

    public static N4.AbstractC1415o O(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return w(obj, obj2, obj3);
    }

    public static N4.AbstractC1415o P(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return w(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static N4.AbstractC1415o R(java.util.Comparator comparator, java.lang.Iterable iterable) {
        M4.h.i(comparator);
        java.lang.Object[] objArrB = N4.v.b(iterable);
        N4.F.b(objArrB);
        java.util.Arrays.sort(objArrB, comparator);
        return o(objArrB);
    }

    static N4.AbstractC1415o o(java.lang.Object[] objArr) {
        return s(objArr, objArr.length);
    }

    static N4.AbstractC1415o s(java.lang.Object[] objArr, int i6) {
        return i6 == 0 ? M() : new N4.I(objArr, i6);
    }

    private static N4.AbstractC1415o w(java.lang.Object... objArr) {
        return o(N4.F.b(objArr));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public N4.S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public N4.T listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public N4.T listIterator(int i6) {
        M4.h.k(i6, size());
        return isEmpty() ? f7759D : new N4.AbstractC1415o.b(this, i6);
    }

    public N4.AbstractC1415o Q() {
        return size() <= 1 ? this : new N4.AbstractC1415o.c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: S */
    public N4.AbstractC1415o subList(int i6, int i10) {
        M4.h.m(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? M() : T(i6, i10);
    }

    N4.AbstractC1415o T(int i6, int i10) {
        return new N4.AbstractC1415o.d(i6, i10 - i6);
    }

    @Override // java.util.List
    public final void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // N4.AbstractC1414n
    int d(java.lang.Object[] objArr, int i6) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i6 + i10] = get(i10);
        }
        return i6 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        return N4.x.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i6 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i6 = ~(~((i6 * 31) + get(i10).hashCode()));
        }
        return i6;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return N4.x.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return N4.x.d(this, obj);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
