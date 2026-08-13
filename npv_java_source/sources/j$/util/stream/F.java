package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public interface F extends j$.util.stream.InterfaceC6762h {
    j$.util.stream.F a();

    j$.util.C6858z average();

    j$.util.stream.F b(j$.util.stream.C6727a c6727a);

    j$.util.stream.Stream boxed();

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer);

    long count();

    j$.util.stream.F distinct();

    boolean f();

    j$.util.C6858z findAny();

    j$.util.C6858z findFirst();

    void forEach(java.util.function.DoubleConsumer doubleConsumer);

    void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer);

    j$.util.stream.InterfaceC6793n0 g();

    j$.util.F iterator();

    boolean l();

    j$.util.stream.F limit(long j6);

    j$.util.stream.F map(java.util.function.DoubleUnaryOperator doubleUnaryOperator);

    j$.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction);

    j$.util.C6858z max();

    j$.util.C6858z min();

    j$.util.stream.F parallel();

    j$.util.stream.F peek(java.util.function.DoubleConsumer doubleConsumer);

    j$.util.stream.IntStream q();

    double reduce(double d6, java.util.function.DoubleBinaryOperator doubleBinaryOperator);

    j$.util.C6858z reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator);

    j$.util.stream.F sequential();

    j$.util.stream.F skip(long j6);

    j$.util.stream.F sorted();

    @Override // j$.util.stream.InterfaceC6762h
    j$.util.U spliterator();

    double sum();

    j$.util.C6854v summaryStatistics();

    double[] toArray();

    boolean u();
}
