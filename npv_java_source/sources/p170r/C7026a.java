package p170r;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7026a extends p170r.Y implements java.util.Map, j$.util.Map {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    p170r.C7026a.C0697a f53354F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    p170r.C7026a.c f53355G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    p170r.C7026a.e f53356H;

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    final class C0697a extends java.util.AbstractSet {
        C0697a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return p170r.C7026a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p170r.C7026a.this.size();
        }
    }

    /* JADX INFO: renamed from: r.a$b */
    final class b extends p170r.AbstractC7035j {
        b() {
            super(p170r.C7026a.this.size());
        }

        @Override // p170r.AbstractC7035j
        protected java.lang.Object b(int i6) {
            return p170r.C7026a.this.f(i6);
        }

        @Override // p170r.AbstractC7035j
        protected void c(int i6) {
            p170r.C7026a.this.h(i6);
        }
    }

    /* JADX INFO: renamed from: r.a$c */
    final class c implements java.util.Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            p170r.C7026a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return p170r.C7026a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            return p170r.C7026a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object obj) {
            return p170r.C7026a.m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = p170r.C7026a.this.size() - 1; size >= 0; size--) {
                java.lang.Object objF = p170r.C7026a.this.f(size);
                iHashCode += objF == null ? 0 : objF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return p170r.C7026a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return p170r.C7026a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            int iD = p170r.C7026a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            p170r.C7026a.this.h(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            return p170r.C7026a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            return p170r.C7026a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return p170r.C7026a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
            int size = p170r.C7026a.this.size();
            java.lang.Object[] objArr = new java.lang.Object[size];
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = p170r.C7026a.this.f(i6);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = p170r.C7026a.this.f(i6);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: r.a$d */
    final class d implements java.util.Iterator, java.util.Map.Entry {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f53360C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f53361D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f53362E;

        d() {
            this.f53360C = p170r.C7026a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            this.f53361D++;
            this.f53362E = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (!this.f53362E) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return p180s.a.c(entry.getKey(), p170r.C7026a.this.f(this.f53361D)) && p180s.a.c(entry.getValue(), p170r.C7026a.this.k(this.f53361D));
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getKey() {
            if (this.f53362E) {
                return p170r.C7026a.this.f(this.f53361D);
            }
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            if (this.f53362E) {
                return p170r.C7026a.this.k(this.f53361D);
            }
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53361D < this.f53360C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f53362E) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            java.lang.Object objF = p170r.C7026a.this.f(this.f53361D);
            java.lang.Object objK = p170r.C7026a.this.k(this.f53361D);
            return (objF == null ? 0 : objF.hashCode()) ^ (objK != null ? objK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f53362E) {
                throw new java.lang.IllegalStateException();
            }
            p170r.C7026a.this.h(this.f53361D);
            this.f53361D--;
            this.f53360C--;
            this.f53362E = false;
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            if (this.f53362E) {
                return p170r.C7026a.this.j(this.f53361D, obj);
            }
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public java.lang.String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: r.a$e */
    final class e implements java.util.Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            p170r.C7026a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return p170r.C7026a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return p170r.C7026a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return p170r.C7026a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object obj) {
            int iA = p170r.C7026a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            p170r.C7026a.this.h(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            int size = p170r.C7026a.this.size();
            int i6 = 0;
            boolean z6 = false;
            while (i6 < size) {
                if (collection.contains(p170r.C7026a.this.k(i6))) {
                    p170r.C7026a.this.h(i6);
                    i6--;
                    size--;
                    z6 = true;
                }
                i6++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            int size = p170r.C7026a.this.size();
            int i6 = 0;
            boolean z6 = false;
            while (i6 < size) {
                if (!collection.contains(p170r.C7026a.this.k(i6))) {
                    p170r.C7026a.this.h(i6);
                    i6--;
                    size--;
                    z6 = true;
                }
                i6++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public int size() {
            return p170r.C7026a.this.size();
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
            int size = p170r.C7026a.this.size();
            java.lang.Object[] objArr = new java.lang.Object[size];
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = p170r.C7026a.this.k(i6);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = p170r.C7026a.this.k(i6);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: r.a$f */
    final class f extends p170r.AbstractC7035j {
        f() {
            super(p170r.C7026a.this.size());
        }

        @Override // p170r.AbstractC7035j
        protected java.lang.Object b(int i6) {
            return p170r.C7026a.this.k(i6);
        }

        @Override // p170r.AbstractC7035j
        protected void c(int i6) {
            p170r.C7026a.this.h(i6);
        }
    }

    public C7026a() {
    }

    public C7026a(int i6) {
        super(i6);
    }

    public C7026a(p170r.Y y6) {
        super(y6);
    }

    static boolean m(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // p170r.Y, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return super.containsKey(obj);
    }

    @Override // p170r.Y, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        p170r.C7026a.C0697a c0697a = this.f53354F;
        if (c0697a != null) {
            return c0697a;
        }
        p170r.C7026a.C0697a c0697a2 = new p170r.C7026a.C0697a();
        this.f53354F = c0697a2;
        return c0697a2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // p170r.Y, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        p170r.C7026a.c cVar = this.f53355G;
        if (cVar != null) {
            return cVar;
        }
        p170r.C7026a.c cVar2 = new p170r.C7026a.c();
        this.f53355G = cVar2;
        return cVar2;
    }

    public boolean l(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public boolean o(java.util.Collection collection) {
        int size = size();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean p(java.util.Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        b(size() + map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p170r.Y, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        p170r.C7026a.e eVar = this.f53356H;
        if (eVar != null) {
            return eVar;
        }
        p170r.C7026a.e eVar2 = new p170r.C7026a.e();
        this.f53356H = eVar2;
        return eVar2;
    }
}
