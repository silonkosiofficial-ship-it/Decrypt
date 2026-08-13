package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements W8.V0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f24339C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.ThreadLocal f24340D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final m7.i.c f24341E;

    public L(java.lang.Object obj, java.lang.ThreadLocal threadLocal) {
        this.f24339C = obj;
        this.f24340D = threadLocal;
        this.f24341E = new p019b9.M(threadLocal);
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return W8.V0.a.a(this, obj, pVar);
    }

    @Override // W8.V0
    public java.lang.Object P0(p127m7.i iVar) {
        java.lang.Object obj = this.f24340D.get();
        this.f24340D.set(this.f24339C);
        return obj;
    }

    @Override // W8.V0
    public void c1(p127m7.i iVar, java.lang.Object obj) {
        this.f24340D.set(obj);
    }

    @Override // m7.i.b
    public m7.i.c getKey() {
        return this.f24341E;
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        if (!p247y7.AbstractC7350t.b(getKey(), cVar)) {
            return null;
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return W8.V0.a.b(this, iVar);
    }

    public java.lang.String toString() {
        return "ThreadLocal(value=" + this.f24339C + ", threadLocal = " + this.f24340D + ')';
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return p247y7.AbstractC7350t.b(getKey(), cVar) ? p127m7.j.f51198C : this;
    }
}
