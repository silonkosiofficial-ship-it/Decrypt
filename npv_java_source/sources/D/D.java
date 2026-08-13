package D;

/* JADX INFO: loaded from: classes.dex */
public final class D implements java.util.List, p256z7.a, j$.util.List {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f1584C;

    public interface a {
        int getIndex();

        java.lang.Object getKey();
    }

    public D() {
        this(new p051f0.r());
    }

    private D(java.util.List list) {
        this.f1584C = list;
    }

    public final void C(D.D.a aVar) {
        this.f1584C.remove(aVar);
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
        if (obj instanceof D.D.a) {
            return d((D.D.a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f1584C.containsAll(collection);
    }

    public boolean d(D.D.a aVar) {
        return this.f1584C.contains(aVar);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public D.D.a get(int i6) {
        return (D.D.a) this.f1584C.get(i6);
    }

    public int f() {
        return this.f1584C.size();
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    public int g(D.D.a aVar) {
        return this.f1584C.indexOf(aVar);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof D.D.a) {
            return g((D.D.a) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f1584C.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f1584C.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof D.D.a) {
            return o((D.D.a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return this.f1584C.listIterator();
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i6) {
        return this.f1584C.listIterator(i6);
    }

    public int o(D.D.a aVar) {
        return this.f1584C.lastIndexOf(aVar);
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

    public final void s(D.D.a aVar) {
        this.f1584C.add(aVar);
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
        return this.f1584C.subList(i6, i10);
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
