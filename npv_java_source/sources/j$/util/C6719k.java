package j$.util;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6719k implements java.util.Iterator, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48163a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Iterator f48164b;

    public C6719k(j$.util.C6720l c6720l) {
        this.f48164b = c6720l.f48169a.iterator();
    }

    public C6719k(j$.util.r rVar) {
        this.f48164b = rVar.f48169a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC6856x
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f48163a) {
            case 0:
                j$.util.Q.q(this.f48164b, consumer);
                break;
            default:
                j$.util.Q.q(this.f48164b, new j$.util.C6723o(consumer));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f48163a) {
            case 0:
                break;
        }
        return this.f48164b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f48163a) {
            case 0:
                return this.f48164b.next();
            default:
                return new j$.util.C6724p((java.util.Map.Entry) this.f48164b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f48163a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
