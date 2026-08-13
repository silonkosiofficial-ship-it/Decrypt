package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W implements java.util.Spliterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.X f48032a;

    private /* synthetic */ W(j$.util.X x6) {
        this.f48032a = x6;
    }

    public static /* synthetic */ java.util.Spliterator.OfInt a(j$.util.X x6) {
        if (x6 == null) {
            return null;
        }
        return x6 instanceof j$.util.V ? ((j$.util.V) x6).f48031a : new j$.util.W(x6);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48032a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.X x6 = this.f48032a;
        if (obj instanceof j$.util.W) {
            obj = ((j$.util.W) obj).f48032a;
        }
        return x6.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48032a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        this.f48032a.forEachRemaining((java.lang.Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48032a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.IntConsumer intConsumer) {
        this.f48032a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48032a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48032a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48032a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48032a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return this.f48032a.tryAdvance((java.lang.Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48032a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(java.util.function.IntConsumer intConsumer) {
        return this.f48032a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfInt trySplit() {
        return a(this.f48032a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return j$.util.c0.a(this.f48032a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return j$.util.Spliterator.Wrapper.convert(this.f48032a.trySplit());
    }
}
