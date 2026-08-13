package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class h extends j$.util.concurrent.AbstractC6711a implements java.util.Iterator, java.util.Enumeration {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f48077k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j$.util.concurrent.l[] lVarArr, int i6, int i10, j$.util.concurrent.ConcurrentHashMap concurrentHashMap, int i11) {
        super(lVarArr, i6, i10, concurrentHashMap);
        this.f48077k = i11;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f48077k) {
            case 0:
                j$.util.concurrent.l lVar = this.f48092b;
                if (lVar == null) {
                    throw new java.util.NoSuchElementException();
                }
                this.f48072j = lVar;
                a();
                return lVar.f48084b;
            default:
                j$.util.concurrent.l lVar2 = this.f48092b;
                if (lVar2 == null) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj = lVar2.f48085c;
                this.f48072j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final java.lang.Object nextElement() {
        switch (this.f48077k) {
            case 0:
                break;
        }
        return next();
    }
}
