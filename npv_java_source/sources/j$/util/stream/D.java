package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements j$.util.stream.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.DoubleStream f48216a;

    private /* synthetic */ D(java.util.stream.DoubleStream doubleStream) {
        this.f48216a = doubleStream;
    }

    public static /* synthetic */ j$.util.stream.F w(java.util.stream.DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof j$.util.stream.E ? ((j$.util.stream.E) doubleStream).f48223a : new j$.util.stream.D(doubleStream);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F a() {
        return w(this.f48216a.filter(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.C6858z average() {
        return j$.util.Q.j(this.f48216a.average());
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F b(j$.util.stream.C6727a c6727a) {
        java.util.stream.DoubleStream doubleStream = this.f48216a;
        j$.util.stream.C6727a c6727a2 = new j$.util.stream.C6727a(7);
        c6727a2.f48404b = c6727a;
        return w(doubleStream.flatMap(c6727a2));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.Stream boxed() {
        return j$.util.stream.C6736b3.w(this.f48216a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f48216a.close();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer) {
        return this.f48216a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ long count() {
        return this.f48216a.count();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F distinct() {
        return w(this.f48216a.distinct());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.DoubleStream doubleStream = this.f48216a;
        if (obj instanceof j$.util.stream.D) {
            obj = ((j$.util.stream.D) obj).f48216a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean f() {
        return this.f48216a.allMatch(null);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.C6858z findAny() {
        return j$.util.Q.j(this.f48216a.findAny());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.C6858z findFirst() {
        return j$.util.Q.j(this.f48216a.findFirst());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48216a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48216a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 g() {
        return j$.util.stream.C6783l0.w(this.f48216a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f48216a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ boolean isParallel() {
        return this.f48216a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.F iterator() {
        return j$.util.D.a(this.f48216a.iterator());
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f48216a.iterator();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean l() {
        return this.f48216a.anyMatch(null);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F limit(long j6) {
        return w(this.f48216a.limit(j6));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F map(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        return w(this.f48216a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction) {
        return j$.util.stream.C6736b3.w(this.f48216a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.C6858z max() {
        return j$.util.Q.j(this.f48216a.max());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.C6858z min() {
        return j$.util.Q.j(this.f48216a.min());
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable) {
        return j$.util.stream.C6752f.w(this.f48216a.onClose(runnable));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F parallel() {
        return w(this.f48216a.parallel());
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h parallel() {
        return j$.util.stream.C6752f.w(this.f48216a.parallel());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F peek(java.util.function.DoubleConsumer doubleConsumer) {
        return w(this.f48216a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.IntStream q() {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.f48216a.mapToInt(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double reduce(double d6, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return this.f48216a.reduce(d6, doubleBinaryOperator);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.C6858z reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.Q.j(this.f48216a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F sequential() {
        return w(this.f48216a.sequential());
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h sequential() {
        return j$.util.stream.C6752f.w(this.f48216a.sequential());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F skip(long j6) {
        return w(this.f48216a.skip(j6));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.stream.F sorted() {
        return w(this.f48216a.sorted());
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.e0.a(this.f48216a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.F, j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.U spliterator() {
        return j$.util.S.a(this.f48216a.spliterator());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double sum() {
        return this.f48216a.sum();
    }

    @Override // j$.util.stream.F
    public final j$.util.C6854v summaryStatistics() {
        this.f48216a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double[] toArray() {
        return this.f48216a.toArray();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean u() {
        return this.f48216a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h unordered() {
        return j$.util.stream.C6752f.w(this.f48216a.unordered());
    }
}
