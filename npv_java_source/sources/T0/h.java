package T0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements java.util.Collection, p256z7.a, j$.util.Collection {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final T0.h.a f12889E = new T0.h.a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final T0.h f12890F = new T0.h(p097j7.AbstractC6879v.m());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f12891C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f12892D;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T0.h a() {
            return T0.j.a().b();
        }

        public final T0.h b() {
            return T0.h.f12890F;
        }
    }

    public h(java.util.List list) {
        this.f12891C = list;
        this.f12892D = list.size();
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
        if (obj instanceof T0.g) {
            return e((T0.g) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f12891C.containsAll(collection);
    }

    public boolean e(T0.g gVar) {
        return this.f12891C.contains(gVar);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T0.h) && p247y7.AbstractC7350t.b(this.f12891C, ((T0.h) obj).f12891C);
    }

    public final T0.g f(int i6) {
        return (T0.g) this.f12891C.get(i6);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    public final java.util.List g() {
        return this.f12891C;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f12891C.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f12891C.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f12891C.iterator();
    }

    public int o() {
        return this.f12892D;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return o();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, java.lang.Iterable
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

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        return "LocaleList(localeList=" + this.f12891C + ')';
    }
}
