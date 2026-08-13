package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I implements java.util.PrimitiveIterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.J f48017a;

    private /* synthetic */ I(j$.util.J j6) {
        this.f48017a = j6;
    }

    public static /* synthetic */ java.util.PrimitiveIterator.OfInt a(j$.util.J j6) {
        if (j6 == null) {
            return null;
        }
        return j6 instanceof j$.util.H ? ((j$.util.H) j6).f48016a : new j$.util.I(j6);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.J j6 = this.f48017a;
        if (obj instanceof j$.util.I) {
            obj = ((j$.util.I) obj).f48017a;
        }
        return j6.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        this.f48017a.forEachRemaining((java.lang.Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48017a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.IntConsumer intConsumer) {
        this.f48017a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48017a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48017a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ java.lang.Integer next() {
        return this.f48017a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.f48017a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f48017a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48017a.remove();
    }
}
