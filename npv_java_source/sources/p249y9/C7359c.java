package p249y9;

/* JADX INFO: renamed from: y9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7359c extends p249y9.i implements java.util.List<p249y9.i>, p256z7.a, j$.util.List {
    public static final p249y9.C7359c.a Companion = new p249y9.C7359c.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f57397C;

    /* JADX INFO: renamed from: y9.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p199t9.b serializer() {
            return p249y9.C7360d.f57398a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7359c(java.util.List list) {
        super(null);
        p247y7.AbstractC7350t.f(list, "content");
        this.f57397C = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i6, p249y9.i iVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i6, java.util.Collection<? extends p249y9.i> collection) {
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
        if (obj instanceof p249y9.i) {
            return d((p249y9.i) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return this.f57397C.containsAll(collection);
    }

    public boolean d(p249y9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "element");
        return this.f57397C.contains(iVar);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p249y9.i get(int i6) {
        return (p249y9.i) this.f57397C.get(i6);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return p247y7.AbstractC7350t.b(this.f57397C, obj);
    }

    public int f() {
        return this.f57397C.size();
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    public int g(p249y9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "element");
        return this.f57397C.indexOf(iVar);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f57397C.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof p249y9.i) {
            return g((p249y9.i) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f57397C.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f57397C.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof p249y9.i) {
            return o((p249y9.i) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator<p249y9.i> listIterator() {
        return this.f57397C.listIterator();
    }

    @Override // java.util.List
    public java.util.ListIterator<p249y9.i> listIterator(int i6) {
        return this.f57397C.listIterator(i6);
    }

    public int o(p249y9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "element");
        return this.f57397C.lastIndexOf(iVar);
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
    public /* bridge */ /* synthetic */ p249y9.i remove(int i6) {
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
    public /* bridge */ /* synthetic */ p249y9.i set(int i6, p249y9.i iVar) {
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
    public java.util.List<p249y9.i> subList(int i6, int i10) {
        return this.f57397C.subList(i6, i10);
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
        p247y7.AbstractC7350t.f(objArr, "array");
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this.f57397C, ",", "[", "]", 0, null, null, 56, null);
    }
}
