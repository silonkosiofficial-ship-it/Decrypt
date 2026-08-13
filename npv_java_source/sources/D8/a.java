package D8;

/* JADX INFO: loaded from: classes2.dex */
public class a implements P7.g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f1945D = {p247y7.P.j(new p247y7.G(p247y7.P.b(D8.a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final E8.i f1946C;

    public a(E8.n nVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(aVar, "compute");
        this.f1946C = nVar.d(aVar);
    }

    private final java.util.List d() {
        return (java.util.List) E8.m.a(this.f1946C, this, f1945D[0]);
    }

    @Override // P7.g
    public boolean H(p138n8.c cVar) {
        return P7.g.b.b(this, cVar);
    }

    @Override // P7.g
    public boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return d().iterator();
    }

    @Override // P7.g
    public P7.c j(p138n8.c cVar) {
        return P7.g.b.a(this, cVar);
    }
}
