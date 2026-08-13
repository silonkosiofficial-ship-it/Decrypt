package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class d extends j$.util.concurrent.AbstractC6711a implements java.util.Iterator {
    @Override // java.util.Iterator
    public final java.lang.Object next() {
        j$.util.concurrent.l lVar = this.f48092b;
        if (lVar == null) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = lVar.f48084b;
        java.lang.Object obj2 = lVar.f48085c;
        this.f48072j = lVar;
        a();
        return new j$.util.concurrent.k(obj, obj2, this.f48071i);
    }
}
