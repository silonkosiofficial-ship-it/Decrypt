package j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6711a extends j$.util.concurrent.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final j$.util.concurrent.ConcurrentHashMap f48071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    j$.util.concurrent.l f48072j;

    AbstractC6711a(j$.util.concurrent.l[] lVarArr, int i6, int i10, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i6, 0, i10);
        this.f48071i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f48092b != null;
    }

    public final boolean hasNext() {
        return this.f48092b != null;
    }

    public final void remove() {
        j$.util.concurrent.l lVar = this.f48072j;
        if (lVar == null) {
            throw new java.lang.IllegalStateException();
        }
        this.f48072j = null;
        this.f48071i.g(lVar.f48084b, null, null);
    }
}
