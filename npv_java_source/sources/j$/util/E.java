package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements java.util.PrimitiveIterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.F f48014a;

    private /* synthetic */ E(j$.util.F f6) {
        this.f48014a = f6;
    }

    public static /* synthetic */ java.util.PrimitiveIterator.OfDouble a(j$.util.F f6) {
        if (f6 == null) {
            return null;
        }
        return f6 instanceof j$.util.D ? ((j$.util.D) f6).f48013a : new j$.util.E(f6);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.F f6 = this.f48014a;
        if (obj instanceof j$.util.E) {
            obj = ((j$.util.E) obj).f48014a;
        }
        return f6.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48014a.forEachRemaining((java.lang.Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48014a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48014a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48014a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48014a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ java.lang.Double next() {
        return this.f48014a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.f48014a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f48014a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48014a.remove();
    }
}
