package j$.util;

/* JADX INFO: renamed from: j$.util.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6725q implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.util.Spliterator f48178a;

    C6725q(j$.util.Spliterator spliterator) {
        this.f48178a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48178a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48178a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        this.f48178a.forEachRemaining(new j$.util.C6723o(consumer));
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f48178a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f48178a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i6) {
        return this.f48178a.hasCharacteristics(i6);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        return this.f48178a.tryAdvance(new j$.util.C6723o(consumer));
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit = this.f48178a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new j$.util.C6725q(spliteratorTrySplit);
    }
}
