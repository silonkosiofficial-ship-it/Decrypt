package Y8;

/* JADX INFO: loaded from: classes2.dex */
final class w extends Y8.C1860a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p127m7.e f16568G;

    public w(p127m7.i iVar, Y8.j jVar, p237x7.p pVar) {
        super(iVar, jVar, false);
        this.f16568G = p137n7.b.b(pVar, this, this);
    }

    @Override // W8.F0
    protected void I0() throws java.lang.Throwable {
        p029c9.a.b(this.f16568G, this);
    }

    @Override // Y8.k, Y8.C
    public boolean c(java.lang.Throwable th) {
        boolean zC = super.c(th);
        start();
        return zC;
    }

    @Override // Y8.k, Y8.C
    public java.lang.Object h(java.lang.Object obj, p127m7.e eVar) {
        start();
        java.lang.Object objH = super.h(obj, eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    @Override // Y8.k, Y8.C
    public java.lang.Object j(java.lang.Object obj) {
        start();
        return super.j(obj);
    }
}
