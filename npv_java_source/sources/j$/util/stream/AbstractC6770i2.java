package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6770i2 extends j$.util.stream.AbstractC6732b implements j$.util.stream.Stream {
    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 B(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.E(abstractC6732b, spliterator, z6, intFunction);
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean D(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        boolean zM;
        do {
            zM = interfaceC6810q2.m();
            if (zM) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC6810q2));
        return zM;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.EnumC6761g3 E() {
        return j$.util.stream.EnumC6761g3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.C0 J(long j6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.D(j6, intFunction);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator Q(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Supplier supplier, boolean z6) {
        return new j$.util.stream.J3(abstractC6732b, supplier, z6);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(java.util.function.Predicate predicate) {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.c0(j$.util.stream.EnumC6832v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(java.util.function.Predicate predicate) {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.c0(j$.util.stream.EnumC6832v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream b(j$.util.stream.C6727a c6727a) {
        j$.util.Objects.requireNonNull(c6727a);
        return new j$.util.stream.C6755f2(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, c6727a, 1);
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object collect(j$.util.stream.Collector collector) {
        java.lang.Object objZ;
        if (isParallel() && collector.characteristics().contains(j$.util.stream.Collector.Characteristics.CONCURRENT) && (!H() || collector.characteristics().contains(j$.util.stream.Collector.Characteristics.UNORDERED))) {
            objZ = collector.supplier().get();
            forEach(new j$.util.stream.C6803p0(3, collector.accumulator(), objZ));
        } else {
            java.util.function.Supplier supplier = ((j$.util.stream.Collector) j$.util.Objects.requireNonNull(collector)).supplier();
            objZ = z(new j$.util.stream.L1(j$.util.stream.EnumC6761g3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(j$.util.stream.Collector.Characteristics.IDENTITY_FINISH) ? objZ : collector.finisher().apply(objZ);
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.Objects.requireNonNull(biConsumer2);
        return z(new j$.util.stream.E1(j$.util.stream.EnumC6761g3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((java.lang.Long) z(new j$.util.stream.G1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream distinct() {
        return new j$.util.stream.C6797o(this, j$.util.stream.EnumC6756f3.f48455m | j$.util.stream.EnumC6756f3.f48462t, 0);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
        int i6 = j$.util.stream.V3.f48382a;
        j$.util.Objects.requireNonNull(predicate);
        return new j$.util.stream.R3(this, j$.util.stream.V3.f48383b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream filter(java.util.function.Predicate predicate) {
        j$.util.Objects.requireNonNull(predicate);
        return new j$.util.stream.C6826u(this, j$.util.stream.EnumC6756f3.f48462t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional findAny() {
        return (j$.util.Optional) z(j$.util.stream.K.f48269d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional findFirst() {
        return (j$.util.Optional) z(j$.util.stream.K.f48268c);
    }

    public void forEach(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        z(new j$.util.stream.Q(consumer, false));
    }

    public void forEachOrdered(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        z(new j$.util.stream.Q(consumer, true));
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final java.util.Iterator iterator() {
        return j$.util.Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.InterfaceC6793n0 k(j$.util.stream.C6727a c6727a) {
        j$.util.Objects.requireNonNull(c6727a);
        return new j$.util.stream.C6763h0(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, c6727a, 2);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream limit(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.AbstractC6845y0.d0(this, 0L, j6);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream map(java.util.function.Function function) {
        j$.util.Objects.requireNonNull(function);
        return new j$.util.stream.C6755f2(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.F mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        j$.util.Objects.requireNonNull(toDoubleFunction);
        return new j$.util.stream.C6831v(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
        j$.util.Objects.requireNonNull(toIntFunction);
        return new j$.util.stream.X(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.InterfaceC6793n0 mapToLong(java.util.function.ToLongFunction toLongFunction) {
        j$.util.Objects.requireNonNull(toLongFunction);
        return new j$.util.stream.C6763h0(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional max(java.util.Comparator comparator) {
        j$.util.Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional min(java.util.Comparator comparator) {
        j$.util.Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(java.util.function.Predicate predicate) {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.c0(j$.util.stream.EnumC6832v0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.IntStream p(j$.util.stream.C6727a c6727a) {
        j$.util.Objects.requireNonNull(c6727a);
        return new j$.util.stream.X(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, c6727a, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream peek(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        return new j$.util.stream.C6826u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional reduce(java.util.function.BinaryOperator binaryOperator) {
        j$.util.Objects.requireNonNull(binaryOperator);
        return (j$.util.Optional) z(new j$.util.stream.C1(j$.util.stream.EnumC6761g3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator) {
        j$.util.Objects.requireNonNull(biFunction);
        j$.util.Objects.requireNonNull(binaryOperator);
        return z(new j$.util.stream.E1(j$.util.stream.EnumC6761g3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator) {
        j$.util.Objects.requireNonNull(binaryOperator);
        j$.util.Objects.requireNonNull(binaryOperator);
        return z(new j$.util.stream.E1(j$.util.stream.EnumC6761g3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : j$.util.stream.AbstractC6845y0.d0(this, j6, -1L);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream sorted() {
        return new j$.util.stream.L2(this);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream sorted(java.util.Comparator comparator) {
        return new j$.util.stream.L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
        int i6 = j$.util.stream.V3.f48382a;
        j$.util.Objects.requireNonNull(predicate);
        return new j$.util.stream.P3(this, j$.util.stream.V3.f48382a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object[] toArray() {
        return toArray(new j$.util.stream.C6740c2(0));
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.N(A(intFunction), intFunction).n(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.F v(j$.util.stream.C6727a c6727a) {
        j$.util.Objects.requireNonNull(c6727a);
        return new j$.util.stream.C6831v(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, c6727a, 4);
    }
}
