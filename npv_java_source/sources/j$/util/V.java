package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements j$.util.X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfInt f48031a;

    private /* synthetic */ V(java.util.Spliterator.OfInt ofInt) {
        this.f48031a = ofInt;
    }

    public static /* synthetic */ j$.util.X a(java.util.Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof j$.util.W ? ((j$.util.W) ofInt).f48032a : new j$.util.V(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48031a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.Spliterator.OfInt ofInt = this.f48031a;
        if (obj instanceof j$.util.V) {
            obj = ((j$.util.V) obj).f48031a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48031a.estimateSize();
    }

    @Override // j$.util.d0
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48031a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48031a.forEachRemaining((java.util.function.Consumer<? super java.lang.Integer>) consumer);
    }

    @Override // j$.util.X
    public final /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        this.f48031a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48031a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48031a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48031a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48031a.hashCode();
    }

    @Override // j$.util.d0
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.f48031a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48031a.tryAdvance((java.util.function.Consumer<? super java.lang.Integer>) consumer);
    }

    @Override // j$.util.X
    public final /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return this.f48031a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator trySplit() {
        return j$.util.e0.a(this.f48031a.trySplit());
    }

    @Override // j$.util.X, j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.X trySplit() {
        return a(this.f48031a.trySplit());
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ j$.util.d0 trySplit() {
        return j$.util.b0.a(this.f48031a.trySplit());
    }
}
