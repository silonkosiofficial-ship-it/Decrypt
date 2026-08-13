package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class T implements java.util.Spliterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.U f48030a;

    private /* synthetic */ T(j$.util.U u6) {
        this.f48030a = u6;
    }

    public static /* synthetic */ java.util.Spliterator.OfDouble a(j$.util.U u6) {
        if (u6 == null) {
            return null;
        }
        return u6 instanceof j$.util.S ? ((j$.util.S) u6).f48024a : new j$.util.T(u6);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48030a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.U u6 = this.f48030a;
        if (obj instanceof j$.util.T) {
            obj = ((j$.util.T) obj).f48030a;
        }
        return u6.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48030a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48030a.forEachRemaining((java.lang.Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48030a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48030a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48030a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48030a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48030a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48030a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return this.f48030a.tryAdvance((java.lang.Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48030a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(java.util.function.DoubleConsumer doubleConsumer) {
        return this.f48030a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfDouble trySplit() {
        return a(this.f48030a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return j$.util.c0.a(this.f48030a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return j$.util.Spliterator.Wrapper.convert(this.f48030a.trySplit());
    }
}
