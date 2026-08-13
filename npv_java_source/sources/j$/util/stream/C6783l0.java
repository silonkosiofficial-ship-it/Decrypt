package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6783l0 implements j$.util.stream.InterfaceC6793n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.LongStream f48503a;

    private /* synthetic */ C6783l0(java.util.stream.LongStream longStream) {
        this.f48503a = longStream;
    }

    public static /* synthetic */ j$.util.stream.InterfaceC6793n0 w(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof j$.util.stream.C6788m0 ? ((j$.util.stream.C6788m0) longStream).f48509a : new j$.util.stream.C6783l0(longStream);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 a() {
        return w(this.f48503a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.F asDoubleStream() {
        return j$.util.stream.D.w(this.f48503a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.C6858z average() {
        return j$.util.Q.j(this.f48503a.average());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 b(j$.util.stream.C6727a c6727a) {
        java.util.stream.LongStream longStream = this.f48503a;
        j$.util.stream.C6727a c6727a2 = new j$.util.stream.C6727a(9);
        c6727a2.f48404b = c6727a;
        return w(longStream.flatMap(c6727a2));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.Stream boxed() {
        return j$.util.stream.C6736b3.w(this.f48503a.boxed());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 c() {
        return w(this.f48503a.map(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f48503a.close();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer) {
        return this.f48503a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ long count() {
        return this.f48503a.count();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 distinct() {
        return w(this.f48503a.distinct());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.LongStream longStream = this.f48503a;
        if (obj instanceof j$.util.stream.C6783l0) {
            obj = ((j$.util.stream.C6783l0) obj).f48503a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.B findAny() {
        return j$.util.Q.l(this.f48503a.findAny());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.B findFirst() {
        return j$.util.Q.l(this.f48503a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ void forEach(java.util.function.LongConsumer longConsumer) {
        this.f48503a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        this.f48503a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.F h() {
        return j$.util.stream.D.w(this.f48503a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f48503a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ boolean isParallel() {
        return this.f48503a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC6793n0, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.N iterator() {
        return j$.util.L.a(this.f48503a.iterator());
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f48503a.iterator();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ boolean j() {
        return this.f48503a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 limit(long j6) {
        return w(this.f48503a.limit(j6));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction) {
        return j$.util.stream.C6736b3.w(this.f48503a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.B max() {
        return j$.util.Q.l(this.f48503a.max());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.B min() {
        return j$.util.Q.l(this.f48503a.min());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ boolean n() {
        return this.f48503a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable) {
        return j$.util.stream.C6752f.w(this.f48503a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h parallel() {
        return j$.util.stream.C6752f.w(this.f48503a.parallel());
    }

    @Override // j$.util.stream.InterfaceC6793n0, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 parallel() {
        return w(this.f48503a.parallel());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 peek(java.util.function.LongConsumer longConsumer) {
        return w(this.f48503a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ long reduce(long j6, java.util.function.LongBinaryOperator longBinaryOperator) {
        return this.f48503a.reduce(j6, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.B reduce(java.util.function.LongBinaryOperator longBinaryOperator) {
        return j$.util.Q.l(this.f48503a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ boolean s() {
        return this.f48503a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h sequential() {
        return j$.util.stream.C6752f.w(this.f48503a.sequential());
    }

    @Override // j$.util.stream.InterfaceC6793n0, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 sequential() {
        return w(this.f48503a.sequential());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 skip(long j6) {
        return w(this.f48503a.skip(j6));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.InterfaceC6793n0 sorted() {
        return w(this.f48503a.sorted());
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.e0.a(this.f48503a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC6793n0, j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.a0 spliterator() {
        return j$.util.Y.a(this.f48503a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ long sum() {
        return this.f48503a.sum();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.C6857y summaryStatistics() {
        this.f48503a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ j$.util.stream.IntStream t() {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.f48503a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final /* synthetic */ long[] toArray() {
        return this.f48503a.toArray();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h unordered() {
        return j$.util.stream.C6752f.w(this.f48503a.unordered());
    }
}
