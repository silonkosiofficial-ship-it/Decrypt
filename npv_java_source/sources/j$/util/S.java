package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class S implements j$.util.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfDouble f48024a;

    private /* synthetic */ S(java.util.Spliterator.OfDouble ofDouble) {
        this.f48024a = ofDouble;
    }

    public static /* synthetic */ j$.util.U a(java.util.Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof j$.util.T ? ((j$.util.T) ofDouble).f48030a : new j$.util.S(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48024a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.Spliterator.OfDouble ofDouble = this.f48024a;
        if (obj instanceof j$.util.S) {
            obj = ((j$.util.S) obj).f48024a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48024a.estimateSize();
    }

    @Override // j$.util.d0
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48024a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48024a.forEachRemaining((java.util.function.Consumer<? super java.lang.Double>) consumer);
    }

    @Override // j$.util.U
    public final /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48024a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48024a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48024a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48024a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48024a.hashCode();
    }

    @Override // j$.util.d0
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.f48024a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48024a.tryAdvance((java.util.function.Consumer<? super java.lang.Double>) consumer);
    }

    @Override // j$.util.U
    public final /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return this.f48024a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator trySplit() {
        return j$.util.e0.a(this.f48024a.trySplit());
    }

    @Override // j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.U trySplit() {
        return a(this.f48024a.trySplit());
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.d0 trySplit() {
        return j$.util.b0.a(this.f48024a.trySplit());
    }
}
