package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements m7.i.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final m7.i.c f51191C;

    public a(m7.i.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "key");
        this.f51191C = cVar;
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return m7.i.b.a.a(this, obj, pVar);
    }

    @Override // m7.i.b
    public m7.i.c getKey() {
        return this.f51191C;
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return m7.i.b.a.b(this, cVar);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return m7.i.b.a.d(this, iVar);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return m7.i.b.a.c(this, cVar);
    }
}
