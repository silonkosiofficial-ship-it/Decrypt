package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M implements java.util.PrimitiveIterator.OfLong {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.N f48020a;

    private /* synthetic */ M(j$.util.N n6) {
        this.f48020a = n6;
    }

    public static /* synthetic */ java.util.PrimitiveIterator.OfLong a(j$.util.N n6) {
        if (n6 == null) {
            return null;
        }
        return n6 instanceof j$.util.L ? ((j$.util.L) n6).f48019a : new j$.util.M(n6);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.N n6 = this.f48020a;
        if (obj instanceof j$.util.M) {
            obj = ((j$.util.M) obj).f48020a;
        }
        return n6.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        this.f48020a.forEachRemaining((java.lang.Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48020a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.LongConsumer longConsumer) {
        this.f48020a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48020a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48020a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ java.lang.Long next() {
        return this.f48020a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.f48020a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f48020a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48020a.remove();
    }
}
