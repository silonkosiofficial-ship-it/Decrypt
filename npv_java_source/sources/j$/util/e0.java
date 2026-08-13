package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e0 implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator f48121a;

    private /* synthetic */ e0(java.util.Spliterator spliterator) {
        this.f48121a = spliterator;
    }

    public static /* synthetic */ j$.util.Spliterator a(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof j$.util.Spliterator.Wrapper) {
            return j$.util.Spliterator.this;
        }
        return spliterator instanceof java.util.Spliterator.OfPrimitive ? j$.util.b0.a((java.util.Spliterator.OfPrimitive) spliterator) : new j$.util.e0(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48121a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.Spliterator spliterator = this.f48121a;
        if (obj instanceof j$.util.e0) {
            obj = ((j$.util.e0) obj).f48121a;
        }
        return spliterator.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48121a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48121a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48121a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48121a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48121a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48121a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48121a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator trySplit() {
        return a(this.f48121a.trySplit());
    }
}
