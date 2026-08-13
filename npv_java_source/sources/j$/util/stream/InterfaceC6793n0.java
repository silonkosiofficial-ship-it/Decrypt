package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6793n0 extends j$.util.stream.InterfaceC6762h {
    j$.util.stream.InterfaceC6793n0 a();

    j$.util.stream.F asDoubleStream();

    j$.util.C6858z average();

    j$.util.stream.InterfaceC6793n0 b(j$.util.stream.C6727a c6727a);

    j$.util.stream.Stream boxed();

    j$.util.stream.InterfaceC6793n0 c();

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer);

    long count();

    j$.util.stream.InterfaceC6793n0 distinct();

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(java.util.function.LongConsumer longConsumer);

    void forEachOrdered(java.util.function.LongConsumer longConsumer);

    j$.util.stream.F h();

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    j$.util.N iterator();

    boolean j();

    j$.util.stream.InterfaceC6793n0 limit(long j6);

    j$.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction);

    j$.util.B max();

    j$.util.B min();

    boolean n();

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    j$.util.stream.InterfaceC6793n0 parallel();

    j$.util.stream.InterfaceC6793n0 peek(java.util.function.LongConsumer longConsumer);

    long reduce(long j6, java.util.function.LongBinaryOperator longBinaryOperator);

    j$.util.B reduce(java.util.function.LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    j$.util.stream.InterfaceC6793n0 sequential();

    j$.util.stream.InterfaceC6793n0 skip(long j6);

    j$.util.stream.InterfaceC6793n0 sorted();

    @Override // j$.util.stream.InterfaceC6762h
    j$.util.a0 spliterator();

    long sum();

    j$.util.C6857y summaryStatistics();

    j$.util.stream.IntStream t();

    long[] toArray();
}
