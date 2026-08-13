package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface a0 extends j$.util.d0 {
    void forEachRemaining(java.util.function.LongConsumer longConsumer);

    boolean tryAdvance(java.util.function.LongConsumer longConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    j$.util.a0 trySplit();
}
