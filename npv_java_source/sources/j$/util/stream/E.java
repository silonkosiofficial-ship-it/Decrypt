package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements java.util.stream.DoubleStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.F f48223a;

    private /* synthetic */ E(j$.util.stream.F f6) {
        this.f48223a = f6;
    }

    public static /* synthetic */ java.util.stream.DoubleStream w(j$.util.stream.F f6) {
        if (f6 == null) {
            return null;
        }
        return f6 instanceof j$.util.stream.D ? ((j$.util.stream.D) f6).f48216a : new j$.util.stream.E(f6);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(java.util.function.DoublePredicate doublePredicate) {
        return this.f48223a.f();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(java.util.function.DoublePredicate doublePredicate) {
        return this.f48223a.l();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble average() {
        return j$.util.Q.n(this.f48223a.average());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return j$.util.stream.Stream.Wrapper.convert(this.f48223a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.lang.Exception {
        this.f48223a.close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer) {
        return this.f48223a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.f48223a.count();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream distinct() {
        return w(this.f48223a.distinct());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.F f6 = this.f48223a;
        if (obj instanceof j$.util.stream.E) {
            obj = ((j$.util.stream.E) obj).f48223a;
        }
        return f6.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream filter(java.util.function.DoublePredicate doublePredicate) {
        return w(this.f48223a.a());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble findAny() {
        return j$.util.Q.n(this.f48223a.findAny());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble findFirst() {
        return j$.util.Q.n(this.f48223a.findFirst());
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.stream.DoubleStream flatMap(java.util.function.DoubleFunction doubleFunction) {
        j$.util.stream.F f6 = this.f48223a;
        j$.util.stream.C6727a c6727a = new j$.util.stream.C6727a(7);
        c6727a.f48404b = doubleFunction;
        return w(f6.b(c6727a));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48223a.forEach(doubleConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48223a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48223a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f48223a.isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator<java.lang.Double> iterator() {
        return this.f48223a.iterator();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Double> iterator2() {
        return j$.util.E.a(this.f48223a.iterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream limit(long j6) {
        return w(this.f48223a.limit(j6));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream map(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        return w(this.f48223a.map(doubleUnaryOperator));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.DoubleToIntFunction doubleToIntFunction) {
        return j$.util.stream.IntStream.Wrapper.convert(this.f48223a.q());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.DoubleToLongFunction doubleToLongFunction) {
        return j$.util.stream.C6788m0.w(this.f48223a.g());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction) {
        return j$.util.stream.Stream.Wrapper.convert(this.f48223a.mapToObj(doubleFunction));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble max() {
        return j$.util.Q.n(this.f48223a.max());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble min() {
        return j$.util.Q.n(this.f48223a.min());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(java.util.function.DoublePredicate doublePredicate) {
        return this.f48223a.u();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.C6757g.w(this.f48223a.onClose(runnable));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return j$.util.stream.C6757g.w(this.f48223a.parallel());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.DoubleStream parallel() {
        return w(this.f48223a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream peek(java.util.function.DoubleConsumer doubleConsumer) {
        return w(this.f48223a.peek(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d6, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return this.f48223a.reduce(d6, doubleBinaryOperator);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.Q.n(this.f48223a.reduce(doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return j$.util.stream.C6757g.w(this.f48223a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.DoubleStream sequential() {
        return w(this.f48223a.sequential());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream skip(long j6) {
        return w(this.f48223a.skip(j6));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream sorted() {
        return w(this.f48223a.sorted());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator<java.lang.Double> spliterator() {
        return j$.util.T.a(this.f48223a.spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Spliterator<java.lang.Double> spliterator2() {
        return j$.util.Spliterator.Wrapper.convert(this.f48223a.spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.f48223a.sum();
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.DoubleSummaryStatistics summaryStatistics() {
        this.f48223a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.f48223a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return j$.util.stream.C6757g.w(this.f48223a.unordered());
    }
}
