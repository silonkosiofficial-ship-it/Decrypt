package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p127m7.i, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p127m7.j f51198C = new p127m7.j();

    private j() {
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "operation");
        return obj;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "key");
        return null;
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "context");
        return iVar;
    }

    public java.lang.String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "key");
        return this;
    }
}
