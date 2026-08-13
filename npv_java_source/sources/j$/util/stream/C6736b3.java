package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6736b3 implements j$.util.stream.Stream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f48421a;

    private /* synthetic */ C6736b3(java.util.stream.Stream stream) {
        this.f48421a = stream;
    }

    public static /* synthetic */ j$.util.stream.Stream w(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof j$.util.stream.Stream.Wrapper ? j$.util.stream.Stream.this : new j$.util.stream.C6736b3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(java.util.function.Predicate predicate) {
        return this.f48421a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
        return this.f48421a.anyMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream b(j$.util.stream.C6727a c6727a) {
        return w(this.f48421a.flatMap(j$.util.stream.AbstractC6845y0.R(c6727a)));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f48421a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object collect(j$.util.stream.Collector collector) {
        return this.f48421a.collect(j$.util.stream.C6772j.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        return this.f48421a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f48421a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream distinct() {
        return w(this.f48421a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
        return w(this.f48421a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.Stream stream = this.f48421a;
        if (obj instanceof j$.util.stream.C6736b3) {
            obj = ((j$.util.stream.C6736b3) obj).f48421a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream filter(java.util.function.Predicate predicate) {
        return w(this.f48421a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional findAny() {
        return j$.util.Q.i(this.f48421a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional findFirst() {
        return j$.util.Q.i(this.f48421a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        this.f48421a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
        this.f48421a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48421a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ boolean isParallel() {
        return this.f48421a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f48421a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 k(j$.util.stream.C6727a c6727a) {
        return j$.util.stream.C6783l0.w(this.f48421a.flatMapToLong(j$.util.stream.AbstractC6845y0.R(c6727a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream limit(long j6) {
        return w(this.f48421a.limit(j6));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream map(java.util.function.Function function) {
        return w(this.f48421a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.F mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.stream.D.w(this.f48421a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.f48421a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 mapToLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.stream.C6783l0.w(this.f48421a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional max(java.util.Comparator comparator) {
        return j$.util.Q.i(this.f48421a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional min(java.util.Comparator comparator) {
        return j$.util.Q.i(this.f48421a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
        return this.f48421a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable) {
        return j$.util.stream.C6752f.w(this.f48421a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.IntStream p(j$.util.stream.C6727a c6727a) {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.f48421a.flatMapToInt(j$.util.stream.AbstractC6845y0.R(c6727a)));
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h parallel() {
        return j$.util.stream.C6752f.w(this.f48421a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream peek(java.util.function.Consumer consumer) {
        return w(this.f48421a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional reduce(java.util.function.BinaryOperator binaryOperator) {
        return j$.util.Q.i(this.f48421a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator) {
        return this.f48421a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator) {
        return this.f48421a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h sequential() {
        return j$.util.stream.C6752f.w(this.f48421a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream skip(long j6) {
        return w(this.f48421a.skip(j6));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream sorted() {
        return w(this.f48421a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream sorted(java.util.Comparator comparator) {
        return w(this.f48421a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.e0.a(this.f48421a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
        return w(this.f48421a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object[] toArray() {
        return this.f48421a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return this.f48421a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h unordered() {
        return j$.util.stream.C6752f.w(this.f48421a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.F v(j$.util.stream.C6727a c6727a) {
        return j$.util.stream.D.w(this.f48421a.flatMapToDouble(j$.util.stream.AbstractC6845y0.R(c6727a)));
    }
}
