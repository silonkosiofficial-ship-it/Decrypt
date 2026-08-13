package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements j$.util.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfPrimitive f48040a;

    private /* synthetic */ b0(java.util.Spliterator.OfPrimitive ofPrimitive) {
        this.f48040a = ofPrimitive;
    }

    public static /* synthetic */ j$.util.d0 a(java.util.Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof j$.util.c0) {
            return ((j$.util.c0) ofPrimitive).f48044a;
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfDouble) {
            return j$.util.S.a((java.util.Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfInt) {
            return j$.util.V.a((java.util.Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof java.util.Spliterator.OfLong ? j$.util.Y.a((java.util.Spliterator.OfLong) ofPrimitive) : new j$.util.b0(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48040a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.Spliterator.OfPrimitive ofPrimitive = this.f48040a;
        if (obj instanceof j$.util.b0) {
            obj = ((j$.util.b0) obj).f48040a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48040a.estimateSize();
    }

    @Override // j$.util.d0
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48040a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48040a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48040a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48040a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48040a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48040a.hashCode();
    }

    @Override // j$.util.d0
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.f48040a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48040a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator trySplit() {
        return j$.util.e0.a(this.f48040a.trySplit());
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.d0 trySplit() {
        return a(this.f48040a.trySplit());
    }
}
