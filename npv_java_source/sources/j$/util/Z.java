package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z implements java.util.Spliterator.OfLong {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.a0 f48034a;

    private /* synthetic */ Z(j$.util.a0 a0Var) {
        this.f48034a = a0Var;
    }

    public static /* synthetic */ java.util.Spliterator.OfLong a(j$.util.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        return a0Var instanceof j$.util.Y ? ((j$.util.Y) a0Var).f48033a : new j$.util.Z(a0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48034a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.a0 a0Var = this.f48034a;
        if (obj instanceof j$.util.Z) {
            obj = ((j$.util.Z) obj).f48034a;
        }
        return a0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48034a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        this.f48034a.forEachRemaining((java.lang.Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48034a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.LongConsumer longConsumer) {
        this.f48034a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48034a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48034a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48034a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48034a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return this.f48034a.tryAdvance((java.lang.Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48034a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(java.util.function.LongConsumer longConsumer) {
        return this.f48034a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfLong trySplit() {
        return a(this.f48034a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return j$.util.c0.a(this.f48034a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return j$.util.Spliterator.Wrapper.convert(this.f48034a.trySplit());
    }
}
