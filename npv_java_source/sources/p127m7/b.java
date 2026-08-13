package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements m7.i.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.l f51192C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final m7.i.c f51193D;

    public b(m7.i.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "baseKey");
        p247y7.AbstractC7350t.f(lVar, "safeCast");
        this.f51192C = lVar;
        this.f51193D = cVar instanceof p127m7.b ? ((p127m7.b) cVar).f51193D : cVar;
    }

    public final boolean a(m7.i.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "key");
        return cVar == this || this.f51193D == cVar;
    }

    public final m7.i.b b(m7.i.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "element");
        return (m7.i.b) this.f51192C.l(bVar);
    }
}
