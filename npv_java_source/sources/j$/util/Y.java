package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Y implements j$.util.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfLong f48033a;

    private /* synthetic */ Y(java.util.Spliterator.OfLong ofLong) {
        this.f48033a = ofLong;
    }

    public static /* synthetic */ j$.util.a0 a(java.util.Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof j$.util.Z ? ((j$.util.Z) ofLong).f48034a : new j$.util.Y(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48033a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.Spliterator.OfLong ofLong = this.f48033a;
        if (obj instanceof j$.util.Y) {
            obj = ((j$.util.Y) obj).f48033a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48033a.estimateSize();
    }

    @Override // j$.util.d0
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48033a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48033a.forEachRemaining((java.util.function.Consumer<? super java.lang.Long>) consumer);
    }

    @Override // j$.util.a0
    public final /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        this.f48033a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48033a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48033a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48033a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48033a.hashCode();
    }

    @Override // j$.util.d0
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.f48033a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48033a.tryAdvance((java.util.function.Consumer<? super java.lang.Long>) consumer);
    }

    @Override // j$.util.a0
    public final /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return this.f48033a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator trySplit() {
        return j$.util.e0.a(this.f48033a.trySplit());
    }

    @Override // j$.util.a0, j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.a0 trySplit() {
        return a(this.f48033a.trySplit());
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.d0 trySplit() {
        return j$.util.b0.a(this.f48033a.trySplit());
    }
}
