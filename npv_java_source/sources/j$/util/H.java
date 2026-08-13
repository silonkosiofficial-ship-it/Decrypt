package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H implements j$.util.J, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.PrimitiveIterator.OfInt f48016a;

    private /* synthetic */ H(java.util.PrimitiveIterator.OfInt ofInt) {
        this.f48016a = ofInt;
    }

    public static /* synthetic */ j$.util.J a(java.util.PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof j$.util.I ? ((j$.util.I) ofInt).f48017a : new j$.util.H(ofInt);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.PrimitiveIterator.OfInt ofInt = this.f48016a;
        if (obj instanceof j$.util.H) {
            obj = ((j$.util.H) obj).f48016a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.f48016a.forEachRemaining(obj);
    }

    @Override // j$.util.J, java.util.Iterator, j$.util.InterfaceC6856x
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48016a.forEachRemaining((java.util.function.Consumer<? super java.lang.Integer>) consumer);
    }

    @Override // j$.util.J
    public final /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        this.f48016a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48016a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48016a.hashCode();
    }

    @Override // j$.util.J, java.util.Iterator
    public final /* synthetic */ java.lang.Integer next() {
        return this.f48016a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.f48016a.next();
    }

    @Override // j$.util.J
    public final /* synthetic */ int nextInt() {
        return this.f48016a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48016a.remove();
    }
}
