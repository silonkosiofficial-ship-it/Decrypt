package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class n0 extends j$.util.Q implements j$.util.a0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.a0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Q.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return j$.util.Q.e(this, i6);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.h(this, consumer);
    }

    @Override // j$.util.a0
    public final boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        return false;
    }

    @Override // j$.util.Q, j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return null;
    }

    @Override // j$.util.Q, j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        return null;
    }
}
