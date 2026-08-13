package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public interface Stream<T> extends j$.util.stream.InterfaceC6762h {

    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(j$.util.stream.Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof j$.util.stream.C6736b3 ? ((j$.util.stream.C6736b3) stream).f48421a : new j$.util.stream.Stream.Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(java.util.function.Predicate predicate) {
            return j$.util.stream.Stream.this.allMatch(predicate);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return j$.util.stream.Stream.this.anyMatch(predicate);
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() throws java.lang.Exception {
            j$.util.stream.Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
            return j$.util.stream.Stream.this.collect(supplier, biConsumer, biConsumer2);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.lang.Object collect(java.util.stream.Collector collector) {
            return j$.util.stream.Stream.this.collect(j$.util.stream.C6767i.a(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return j$.util.stream.Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(j$.util.stream.Stream.this.distinct());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
            return convert(j$.util.stream.Stream.this.dropWhile(predicate));
        }

        public final /* synthetic */ boolean equals(java.lang.Object obj) {
            j$.util.stream.Stream stream = j$.util.stream.Stream.this;
            if (obj instanceof j$.util.stream.Stream.Wrapper) {
                obj = j$.util.stream.Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(j$.util.stream.Stream.this.filter(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional findAny() {
            return j$.util.Q.m(j$.util.stream.Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional findFirst() {
            return j$.util.Q.m(j$.util.stream.Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(java.util.function.Function function) {
            return convert(j$.util.stream.Stream.this.b(j$.util.stream.AbstractC6845y0.R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.DoubleStream flatMapToDouble(java.util.function.Function function) {
            return j$.util.stream.E.w(j$.util.stream.Stream.this.v(j$.util.stream.AbstractC6845y0.R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream flatMapToInt(java.util.function.Function function) {
            return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.Stream.this.p(j$.util.stream.AbstractC6845y0.R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.LongStream flatMapToLong(java.util.function.Function function) {
            return j$.util.stream.C6788m0.w(j$.util.stream.Stream.this.k(j$.util.stream.AbstractC6845y0.R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            j$.util.stream.Stream.this.forEach(consumer);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            j$.util.stream.Stream.this.forEachOrdered(consumer);
        }

        public final /* synthetic */ int hashCode() {
            return j$.util.stream.Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return j$.util.stream.Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.Iterator iterator() {
            return j$.util.stream.Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j6) {
            return convert(j$.util.stream.Stream.this.limit(j6));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(j$.util.stream.Stream.this.map(function));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
            return j$.util.stream.E.w(j$.util.stream.Stream.this.mapToDouble(toDoubleFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
            return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.Stream.this.mapToInt(toIntFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction toLongFunction) {
            return j$.util.stream.C6788m0.w(j$.util.stream.Stream.this.mapToLong(toLongFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional max(java.util.Comparator comparator) {
            return j$.util.Q.m(j$.util.stream.Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional min(java.util.Comparator comparator) {
            return j$.util.Q.m(j$.util.stream.Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return j$.util.stream.Stream.this.noneMatch(predicate);
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
            return j$.util.stream.C6757g.w(j$.util.stream.Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream parallel() {
            return j$.util.stream.C6757g.w(j$.util.stream.Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(j$.util.stream.Stream.this.peek(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator) {
            return j$.util.stream.Stream.this.reduce(obj, biFunction, binaryOperator);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator) {
            return j$.util.stream.Stream.this.reduce(obj, binaryOperator);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.Optional reduce(java.util.function.BinaryOperator binaryOperator) {
            return j$.util.Q.m(j$.util.stream.Stream.this.reduce(binaryOperator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream sequential() {
            return j$.util.stream.C6757g.w(j$.util.stream.Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j6) {
            return convert(j$.util.stream.Stream.this.skip(j6));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(j$.util.stream.Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(java.util.Comparator comparator) {
            return convert(j$.util.stream.Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return j$.util.Spliterator.Wrapper.convert(j$.util.stream.Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
            return convert(j$.util.stream.Stream.this.takeWhile(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.lang.Object[] toArray() {
            return j$.util.stream.Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
            return j$.util.stream.Stream.this.toArray(intFunction);
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream unordered() {
            return j$.util.stream.C6757g.w(j$.util.stream.Stream.this.unordered());
        }
    }

    boolean allMatch(java.util.function.Predicate predicate);

    boolean anyMatch(java.util.function.Predicate<? super T> predicate);

    j$.util.stream.Stream b(j$.util.stream.C6727a c6727a);

    <R, A> R collect(j$.util.stream.Collector<? super T, A, R> collector);

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2);

    long count();

    j$.util.stream.Stream distinct();

    j$.util.stream.Stream dropWhile(java.util.function.Predicate predicate);

    j$.util.stream.Stream<T> filter(java.util.function.Predicate<? super T> predicate);

    j$.util.Optional findAny();

    j$.util.Optional findFirst();

    void forEach(java.util.function.Consumer consumer);

    void forEachOrdered(java.util.function.Consumer consumer);

    j$.util.stream.InterfaceC6793n0 k(j$.util.stream.C6727a c6727a);

    j$.util.stream.Stream limit(long j6);

    <R> j$.util.stream.Stream<R> map(java.util.function.Function<? super T, ? extends R> function);

    j$.util.stream.F mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction);

    j$.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction);

    j$.util.stream.InterfaceC6793n0 mapToLong(java.util.function.ToLongFunction toLongFunction);

    j$.util.Optional max(java.util.Comparator comparator);

    j$.util.Optional min(java.util.Comparator comparator);

    boolean noneMatch(java.util.function.Predicate predicate);

    j$.util.stream.IntStream p(j$.util.stream.C6727a c6727a);

    j$.util.stream.Stream peek(java.util.function.Consumer consumer);

    j$.util.Optional reduce(java.util.function.BinaryOperator binaryOperator);

    java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator);

    java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator);

    j$.util.stream.Stream skip(long j6);

    j$.util.stream.Stream sorted();

    j$.util.stream.Stream sorted(java.util.Comparator comparator);

    j$.util.stream.Stream takeWhile(java.util.function.Predicate predicate);

    java.lang.Object[] toArray();

    java.lang.Object[] toArray(java.util.function.IntFunction intFunction);

    j$.util.stream.F v(j$.util.stream.C6727a c6727a);
}
