package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6788m0 implements java.util.stream.LongStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 f48509a;

    private /* synthetic */ C6788m0(j$.util.stream.InterfaceC6793n0 interfaceC6793n0) {
        this.f48509a = interfaceC6793n0;
    }

    public static /* synthetic */ java.util.stream.LongStream w(j$.util.stream.InterfaceC6793n0 interfaceC6793n0) {
        if (interfaceC6793n0 == null) {
            return null;
        }
        return interfaceC6793n0 instanceof j$.util.stream.C6783l0 ? ((j$.util.stream.C6783l0) interfaceC6793n0).f48503a : new j$.util.stream.C6788m0(interfaceC6793n0);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(java.util.function.LongPredicate longPredicate) {
        return this.f48509a.n();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(java.util.function.LongPredicate longPredicate) {
        return this.f48509a.s();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.DoubleStream asDoubleStream() {
        return j$.util.stream.E.w(this.f48509a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalDouble average() {
        return j$.util.Q.n(this.f48509a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return j$.util.stream.Stream.Wrapper.convert(this.f48509a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.lang.Exception {
        this.f48509a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer) {
        return this.f48509a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.f48509a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream distinct() {
        return w(this.f48509a.distinct());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.InterfaceC6793n0 interfaceC6793n0 = this.f48509a;
        if (obj instanceof j$.util.stream.C6788m0) {
            obj = ((j$.util.stream.C6788m0) obj).f48509a;
        }
        return interfaceC6793n0.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream filter(java.util.function.LongPredicate longPredicate) {
        return w(this.f48509a.a());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong findAny() {
        return j$.util.Q.p(this.f48509a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong findFirst() {
        return j$.util.Q.p(this.f48509a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.LongStream flatMap(java.util.function.LongFunction longFunction) {
        j$.util.stream.InterfaceC6793n0 interfaceC6793n0 = this.f48509a;
        j$.util.stream.C6727a c6727a = new j$.util.stream.C6727a(9);
        c6727a.f48404b = longFunction;
        return w(interfaceC6793n0.b(c6727a));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(java.util.function.LongConsumer longConsumer) {
        this.f48509a.forEach(longConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        this.f48509a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48509a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f48509a.isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator<java.lang.Long> iterator() {
        return this.f48509a.iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Long> iterator2() {
        return j$.util.M.a(this.f48509a.iterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream limit(long j6) {
        return w(this.f48509a.limit(j6));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream map(java.util.function.LongUnaryOperator longUnaryOperator) {
        return w(this.f48509a.c());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(java.util.function.LongToDoubleFunction longToDoubleFunction) {
        return j$.util.stream.E.w(this.f48509a.h());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.LongToIntFunction longToIntFunction) {
        return j$.util.stream.IntStream.Wrapper.convert(this.f48509a.t());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction) {
        return j$.util.stream.Stream.Wrapper.convert(this.f48509a.mapToObj(longFunction));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong max() {
        return j$.util.Q.p(this.f48509a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong min() {
        return j$.util.Q.p(this.f48509a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(java.util.function.LongPredicate longPredicate) {
        return this.f48509a.j();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.C6757g.w(this.f48509a.onClose(runnable));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return j$.util.stream.C6757g.w(this.f48509a.parallel());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.LongStream parallel() {
        return w(this.f48509a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream peek(java.util.function.LongConsumer longConsumer) {
        return w(this.f48509a.peek(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j6, java.util.function.LongBinaryOperator longBinaryOperator) {
        return this.f48509a.reduce(j6, longBinaryOperator);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong reduce(java.util.function.LongBinaryOperator longBinaryOperator) {
        return j$.util.Q.p(this.f48509a.reduce(longBinaryOperator));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return j$.util.stream.C6757g.w(this.f48509a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.LongStream sequential() {
        return w(this.f48509a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream skip(long j6) {
        return w(this.f48509a.skip(j6));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream sorted() {
        return w(this.f48509a.sorted());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator<java.lang.Long> spliterator() {
        return j$.util.Z.a(this.f48509a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Spliterator<java.lang.Long> spliterator2() {
        return j$.util.Spliterator.Wrapper.convert(this.f48509a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.f48509a.sum();
    }

    @Override // java.util.stream.LongStream
    public final java.util.LongSummaryStatistics summaryStatistics() {
        this.f48509a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.f48509a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return j$.util.stream.C6757g.w(this.f48509a.unordered());
    }
}
