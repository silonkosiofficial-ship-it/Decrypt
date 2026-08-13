package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements j$.util.F, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.PrimitiveIterator.OfDouble f48013a;

    private /* synthetic */ D(java.util.PrimitiveIterator.OfDouble ofDouble) {
        this.f48013a = ofDouble;
    }

    public static /* synthetic */ j$.util.F a(java.util.PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof j$.util.E ? ((j$.util.E) ofDouble).f48014a : new j$.util.D(ofDouble);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.PrimitiveIterator.OfDouble ofDouble = this.f48013a;
        if (obj instanceof j$.util.D) {
            obj = ((j$.util.D) obj).f48013a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48013a.forEachRemaining(obj);
    }

    @Override // j$.util.F, java.util.Iterator, j$.util.InterfaceC6856x
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48013a.forEachRemaining((java.util.function.Consumer<? super java.lang.Double>) consumer);
    }

    @Override // j$.util.F
    public final /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        this.f48013a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48013a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48013a.hashCode();
    }

    @Override // j$.util.F, java.util.Iterator
    public final /* synthetic */ java.lang.Double next() {
        return this.f48013a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.f48013a.next();
    }

    @Override // j$.util.F
    public final /* synthetic */ double nextDouble() {
        return this.f48013a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48013a.remove();
    }
}
