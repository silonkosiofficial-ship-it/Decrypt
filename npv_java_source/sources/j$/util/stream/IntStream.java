package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public interface IntStream extends j$.util.stream.InterfaceC6762h {

    public final /* synthetic */ class VivifiedWrapper implements j$.util.stream.IntStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.stream.IntStream f48261a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f48261a = intStream;
        }

        public static /* synthetic */ j$.util.stream.IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof j$.util.stream.IntStream.Wrapper ? j$.util.stream.IntStream.this : new j$.util.stream.IntStream.VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream a() {
            return convert(this.f48261a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.F asDoubleStream() {
            return j$.util.stream.D.w(this.f48261a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.InterfaceC6793n0 asLongStream() {
            return j$.util.stream.C6783l0.w(this.f48261a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C6858z average() {
            return j$.util.Q.j(this.f48261a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.Stream boxed() {
            return j$.util.stream.C6736b3.w(this.f48261a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream c() {
            return convert(this.f48261a.map(null));
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f48261a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return this.f48261a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f48261a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.F d() {
            return j$.util.stream.D.w(this.f48261a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream distinct() {
            return convert(this.f48261a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean e() {
            return this.f48261a.noneMatch(null);
        }

        public final /* synthetic */ boolean equals(java.lang.Object obj) {
            java.util.stream.IntStream intStream = this.f48261a;
            if (obj instanceof j$.util.stream.IntStream.VivifiedWrapper) {
                obj = ((j$.util.stream.IntStream.VivifiedWrapper) obj).f48261a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.A findAny() {
            return j$.util.Q.k(this.f48261a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.A findFirst() {
            return j$.util.Q.k(this.f48261a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(java.util.function.IntConsumer intConsumer) {
            this.f48261a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(java.util.function.IntConsumer intConsumer) {
            this.f48261a.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return this.f48261a.hashCode();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.InterfaceC6793n0 i() {
            return j$.util.stream.C6783l0.w(this.f48261a.mapToLong(null));
        }

        @Override // j$.util.stream.InterfaceC6762h
        public final /* synthetic */ boolean isParallel() {
            return this.f48261a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC6762h, j$.util.stream.F
        public final /* synthetic */ j$.util.J iterator() {
            return j$.util.H.a(this.f48261a.iterator());
        }

        @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
        public final /* synthetic */ java.util.Iterator iterator() {
            return this.f48261a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream limit(long j6) {
            return convert(this.f48261a.limit(j6));
        }

        @Override // j$.util.stream.IntStream
        public final j$.util.stream.IntStream m(j$.util.stream.Q0 q6) {
            java.util.stream.IntStream intStream = this.f48261a;
            j$.util.stream.Q0 q10 = new j$.util.stream.Q0();
            q10.f48317a = q6;
            return convert(intStream.flatMap(q10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return j$.util.stream.C6736b3.w(this.f48261a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.A max() {
            return j$.util.Q.k(this.f48261a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.A min() {
            return j$.util.Q.k(this.f48261a.min());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean o() {
            return this.f48261a.anyMatch(null);
        }

        @Override // j$.util.stream.InterfaceC6762h
        public final /* synthetic */ j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable) {
            return j$.util.stream.C6752f.w(this.f48261a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC6762h, j$.util.stream.F
        public final /* synthetic */ j$.util.stream.IntStream parallel() {
            return convert(this.f48261a.parallel());
        }

        @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
        public final /* synthetic */ j$.util.stream.InterfaceC6762h parallel() {
            return j$.util.stream.C6752f.w(this.f48261a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
            return convert(this.f48261a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean r() {
            return this.f48261a.allMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i6, java.util.function.IntBinaryOperator intBinaryOperator) {
            return this.f48261a.reduce(i6, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.A reduce(java.util.function.IntBinaryOperator intBinaryOperator) {
            return j$.util.Q.k(this.f48261a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC6762h, j$.util.stream.F
        public final /* synthetic */ j$.util.stream.IntStream sequential() {
            return convert(this.f48261a.sequential());
        }

        @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
        public final /* synthetic */ j$.util.stream.InterfaceC6762h sequential() {
            return j$.util.stream.C6752f.w(this.f48261a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream skip(long j6) {
            return convert(this.f48261a.skip(j6));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream sorted() {
            return convert(this.f48261a.sorted());
        }

        @Override // j$.util.stream.InterfaceC6762h
        public final /* synthetic */ j$.util.Spliterator spliterator() {
            return j$.util.e0.a(this.f48261a.spliterator());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC6762h
        public final /* synthetic */ j$.util.X spliterator() {
            return j$.util.V.a(this.f48261a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f48261a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final j$.util.C6855w summaryStatistics() {
            this.f48261a.summaryStatistics();
            throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f48261a.toArray();
        }

        @Override // j$.util.stream.InterfaceC6762h
        public final /* synthetic */ j$.util.stream.InterfaceC6762h unordered() {
            return j$.util.stream.C6752f.w(this.f48261a.unordered());
        }
    }

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(j$.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof j$.util.stream.IntStream.VivifiedWrapper ? ((j$.util.stream.IntStream.VivifiedWrapper) intStream).f48261a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(java.util.function.IntPredicate intPredicate) {
            return j$.util.stream.IntStream.this.r();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(java.util.function.IntPredicate intPredicate) {
            return j$.util.stream.IntStream.this.o();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.DoubleStream asDoubleStream() {
            return j$.util.stream.E.w(j$.util.stream.IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.LongStream asLongStream() {
            return j$.util.stream.C6788m0.w(j$.util.stream.IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalDouble average() {
            return j$.util.Q.n(j$.util.stream.IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return j$.util.stream.Stream.Wrapper.convert(j$.util.stream.IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() throws java.lang.Exception {
            j$.util.stream.IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return j$.util.stream.IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return j$.util.stream.IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(j$.util.stream.IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(java.lang.Object obj) {
            j$.util.stream.IntStream intStream = j$.util.stream.IntStream.this;
            if (obj instanceof j$.util.stream.IntStream.Wrapper) {
                obj = j$.util.stream.IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(java.util.function.IntPredicate intPredicate) {
            return convert(j$.util.stream.IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt findAny() {
            return j$.util.Q.o(j$.util.stream.IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt findFirst() {
            return j$.util.Q.o(j$.util.stream.IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            j$.util.stream.IntStream intStream = j$.util.stream.IntStream.this;
            j$.util.stream.Q0 q6 = new j$.util.stream.Q0();
            q6.f48317a = intFunction;
            return convert(intStream.m(q6));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(java.util.function.IntConsumer intConsumer) {
            j$.util.stream.IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(java.util.function.IntConsumer intConsumer) {
            j$.util.stream.IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return j$.util.stream.IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return j$.util.stream.IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Iterator<java.lang.Integer> iterator() {
            return j$.util.stream.IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Iterator<java.lang.Integer> iterator2() {
            return j$.util.I.a(j$.util.stream.IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j6) {
            return convert(j$.util.stream.IntStream.this.limit(j6));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(java.util.function.IntUnaryOperator intUnaryOperator) {
            return convert(j$.util.stream.IntStream.this.c());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(java.util.function.IntToDoubleFunction intToDoubleFunction) {
            return j$.util.stream.E.w(j$.util.stream.IntStream.this.d());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.IntToLongFunction intToLongFunction) {
            return j$.util.stream.C6788m0.w(j$.util.stream.IntStream.this.i());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return j$.util.stream.Stream.Wrapper.convert(j$.util.stream.IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt max() {
            return j$.util.Q.o(j$.util.stream.IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt min() {
            return j$.util.Q.o(j$.util.stream.IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(java.util.function.IntPredicate intPredicate) {
            return j$.util.stream.IntStream.this.e();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
            return j$.util.stream.C6757g.w(j$.util.stream.IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream parallel() {
            return j$.util.stream.C6757g.w(j$.util.stream.IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(j$.util.stream.IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
            return convert(j$.util.stream.IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i6, java.util.function.IntBinaryOperator intBinaryOperator) {
            return j$.util.stream.IntStream.this.reduce(i6, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt reduce(java.util.function.IntBinaryOperator intBinaryOperator) {
            return j$.util.Q.o(j$.util.stream.IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream sequential() {
            return j$.util.stream.C6757g.w(j$.util.stream.IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(j$.util.stream.IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j6) {
            return convert(j$.util.stream.IntStream.this.skip(j6));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(j$.util.stream.IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<java.lang.Integer> spliterator() {
            return j$.util.W.a(j$.util.stream.IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Spliterator<java.lang.Integer> spliterator2() {
            return j$.util.Spliterator.Wrapper.convert(j$.util.stream.IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return j$.util.stream.IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final java.util.IntSummaryStatistics summaryStatistics() {
            j$.util.stream.IntStream.this.summaryStatistics();
            throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return j$.util.stream.IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.BaseStream unordered() {
            return j$.util.stream.C6757g.w(j$.util.stream.IntStream.this.unordered());
        }
    }

    j$.util.stream.IntStream a();

    j$.util.stream.F asDoubleStream();

    j$.util.stream.InterfaceC6793n0 asLongStream();

    j$.util.C6858z average();

    j$.util.stream.Stream boxed();

    j$.util.stream.IntStream c();

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer);

    long count();

    j$.util.stream.F d();

    j$.util.stream.IntStream distinct();

    boolean e();

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(java.util.function.IntConsumer intConsumer);

    void forEachOrdered(java.util.function.IntConsumer intConsumer);

    j$.util.stream.InterfaceC6793n0 i();

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    j$.util.J iterator();

    j$.util.stream.IntStream limit(long j6);

    j$.util.stream.IntStream m(j$.util.stream.Q0 q6);

    j$.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction);

    j$.util.A max();

    j$.util.A min();

    boolean o();

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    j$.util.stream.IntStream parallel();

    j$.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer);

    boolean r();

    int reduce(int i6, java.util.function.IntBinaryOperator intBinaryOperator);

    j$.util.A reduce(java.util.function.IntBinaryOperator intBinaryOperator);

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    j$.util.stream.IntStream sequential();

    j$.util.stream.IntStream skip(long j6);

    j$.util.stream.IntStream sorted();

    @Override // j$.util.stream.InterfaceC6762h
    j$.util.X spliterator();

    int sum();

    j$.util.C6855w summaryStatistics();

    int[] toArray();
}
