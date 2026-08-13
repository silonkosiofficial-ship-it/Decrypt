package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface X extends j$.util.d0 {
    void forEachRemaining(java.util.function.IntConsumer intConsumer);

    boolean tryAdvance(java.util.function.IntConsumer intConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    j$.util.X trySplit();
}
