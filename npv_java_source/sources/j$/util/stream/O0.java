package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class O0 implements j$.util.stream.K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Collection f48302a;

    O0(java.util.Collection collection) {
        this.f48302a = collection;
    }

    @Override // j$.util.stream.K0
    public final j$.util.stream.K0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f48302a.size();
    }

    @Override // j$.util.stream.K0
    public final void forEach(java.util.function.Consumer consumer) {
        j$.util.Collection.EL.a(this.f48302a, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ j$.util.stream.K0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.w(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void h(java.lang.Object[] objArr, int i6) {
        java.util.Iterator it = this.f48302a.iterator();
        while (it.hasNext()) {
            objArr[i6] = it.next();
            i6++;
        }
    }

    @Override // j$.util.stream.K0
    public final java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        java.util.Collection collection = this.f48302a;
        return collection.toArray((java.lang.Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return j$.util.Collection.EL.stream(this.f48302a).spliterator();
    }

    public final java.lang.String toString() {
        java.util.Collection collection = this.f48302a;
        return java.lang.String.format("CollectionNode[%d][%s]", java.lang.Integer.valueOf(collection.size()), collection);
    }
}
