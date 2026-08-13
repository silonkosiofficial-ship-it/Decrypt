package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface U extends j$.util.d0 {
    void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer);

    boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    j$.util.U trySplit();
}
