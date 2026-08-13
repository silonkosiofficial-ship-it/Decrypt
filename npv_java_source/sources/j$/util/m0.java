package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class m0 extends j$.util.Q implements j$.util.X {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.X
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
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
        return j$.util.Q.g(this, consumer);
    }

    @Override // j$.util.X
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // j$.util.Q, j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.X trySplit() {
        return null;
    }

    @Override // j$.util.Q, j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        return null;
    }
}
