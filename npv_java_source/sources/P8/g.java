package P8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends java.util.AbstractSet {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final P8.g.b f8491E = new P8.g.b(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object f8492C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f8493D;

    private static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f8494C;

        public a(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "array");
            this.f8494C = p247y7.AbstractC7334c.a(objArr);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8494C.hasNext();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            return this.f8494C.next();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final P8.g a() {
            return new P8.g(null);
        }

        public final P8.g b(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "set");
            P8.g gVar = new P8.g(null);
            gVar.addAll(collection);
            return gVar;
        }
    }

    private static final class c implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Object f8495C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f8496D = true;

        public c(java.lang.Object obj) {
            this.f8495C = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8496D;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (!this.f8496D) {
                throw new java.util.NoSuchElementException();
            }
            this.f8496D = false;
            return this.f8495C;
        }
    }

    private g() {
    }

    public /* synthetic */ g(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public static final P8.g d() {
        return f8491E.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        java.lang.Object obj2;
        if (size() == 0) {
            this.f8492C = obj;
        } else if (size() == 1) {
            if (p247y7.AbstractC7350t.b(this.f8492C, obj)) {
                return false;
            }
            this.f8492C = new java.lang.Object[]{this.f8492C, obj};
        } else if (size() < 5) {
            java.lang.Object obj3 = this.f8492C;
            p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            java.lang.Object[] objArr = (java.lang.Object[]) obj3;
            if (p097j7.AbstractC6872n.T(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                java.util.LinkedHashSet linkedHashSetE = p097j7.Z.e(java.util.Arrays.copyOf(objArr, objArr.length));
                linkedHashSetE.add(obj);
                obj2 = linkedHashSetE;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, size() + 1);
                p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f8492C = obj2;
        } else {
            java.lang.Object obj4 = this.f8492C;
            p247y7.AbstractC7350t.d(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!p247y7.W.e(obj4).add(obj)) {
                return false;
            }
        }
        f(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f8492C = null;
        f(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return p247y7.AbstractC7350t.b(this.f8492C, obj);
        }
        if (size() < 5) {
            java.lang.Object obj2 = this.f8492C;
            p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return p097j7.AbstractC6872n.T((java.lang.Object[]) obj2, obj);
        }
        java.lang.Object obj3 = this.f8492C;
        p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((java.util.Set) obj3).contains(obj);
    }

    public int e() {
        return this.f8493D;
    }

    public void f(int i6) {
        this.f8493D = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        java.util.Set setE;
        if (size() == 0) {
            setE = java.util.Collections.emptySet();
        } else {
            if (size() == 1) {
                return new P8.g.c(this.f8492C);
            }
            if (size() < 5) {
                java.lang.Object obj = this.f8492C;
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                return new P8.g.a((java.lang.Object[]) obj);
            }
            java.lang.Object obj2 = this.f8492C;
            p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            setE = p247y7.W.e(obj2);
        }
        return setE.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
