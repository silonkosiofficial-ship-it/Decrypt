package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L implements j$.util.N, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.PrimitiveIterator.OfLong f48019a;

    private /* synthetic */ L(java.util.PrimitiveIterator.OfLong ofLong) {
        this.f48019a = ofLong;
    }

    public static /* synthetic */ j$.util.N a(java.util.PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof j$.util.M ? ((j$.util.M) ofLong).f48020a : new j$.util.L(ofLong);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.PrimitiveIterator.OfLong ofLong = this.f48019a;
        if (obj instanceof j$.util.L) {
            obj = ((j$.util.L) obj).f48019a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48019a.forEachRemaining(obj);
    }

    @Override // j$.util.N, java.util.Iterator, j$.util.InterfaceC6856x
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48019a.forEachRemaining((java.util.function.Consumer<? super java.lang.Long>) consumer);
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        this.f48019a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48019a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48019a.hashCode();
    }

    @Override // j$.util.N, java.util.Iterator
    public final /* synthetic */ java.lang.Long next() {
        return this.f48019a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.f48019a.next();
    }

    @Override // j$.util.N
    public final /* synthetic */ long nextLong() {
        return this.f48019a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48019a.remove();
    }
}
