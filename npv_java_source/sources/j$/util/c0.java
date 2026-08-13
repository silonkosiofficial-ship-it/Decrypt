package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements java.util.Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.d0 f48044a;

    private /* synthetic */ c0(j$.util.d0 d0Var) {
        this.f48044a = d0Var;
    }

    public static /* synthetic */ java.util.Spliterator.OfPrimitive a(j$.util.d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        if (d0Var instanceof j$.util.b0) {
            return ((j$.util.b0) d0Var).f48040a;
        }
        if (d0Var instanceof j$.util.U) {
            return j$.util.T.a((j$.util.U) d0Var);
        }
        if (d0Var instanceof j$.util.X) {
            return j$.util.W.a((j$.util.X) d0Var);
        }
        return d0Var instanceof j$.util.a0 ? j$.util.Z.a((j$.util.a0) d0Var) : new j$.util.c0(d0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48044a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.d0 d0Var = this.f48044a;
        if (obj instanceof j$.util.c0) {
            obj = ((j$.util.c0) obj).f48044a;
        }
        return d0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48044a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48044a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48044a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f48044a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48044a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f48044a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48044a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.f48044a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f48044a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return a(this.f48044a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return j$.util.Spliterator.Wrapper.convert(this.f48044a.trySplit());
    }
}
