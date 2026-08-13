package D0;

/* JADX INFO: loaded from: classes.dex */
public interface k0 {

    public static final class a implements java.util.Collection, p256z7.a, j$.util.Collection {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Set f1877C;

        public a(java.util.Set set) {
            this.f1877C = set;
        }

        public /* synthetic */ a(java.util.Set set, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this((i6 & 1) != 0 ? new java.util.LinkedHashSet() : set);
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f1877C.clear();
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return this.f1877C.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            return this.f1877C.containsAll(collection);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final boolean add(java.lang.Object obj) {
            return this.f1877C.add(obj);
        }

        public int e() {
            return this.f1877C.size();
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            j$.lang.Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f1877C.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return this.f1877C.iterator();
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
        public final boolean remove(java.lang.Object obj) {
            return this.f1877C.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection collection) {
            return this.f1877C.remove(collection);
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(java.util.function.Predicate predicate) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection collection) {
            return this.f1877C.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return e();
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
    }

    boolean a(java.lang.Object obj, java.lang.Object obj2);

    void b(D0.k0.a aVar);
}
