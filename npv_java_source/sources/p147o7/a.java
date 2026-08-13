package p147o7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements p127m7.e, p147o7.e, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.e f52551C;

    public a(p127m7.e eVar) {
        this.f52551C = eVar;
    }

    public java.lang.StackTraceElement A() {
        return p147o7.g.d(this);
    }

    protected abstract java.lang.Object B(java.lang.Object obj);

    protected void D() {
    }

    public p147o7.e e() {
        p127m7.e eVar = this.f52551C;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // p127m7.e
    public final void t(java.lang.Object obj) {
        p127m7.e eVar = this;
        while (true) {
            p147o7.h.b(eVar);
            p147o7.a aVar = (p147o7.a) eVar;
            p127m7.e eVar2 = aVar.f52551C;
            p247y7.AbstractC7350t.c(eVar2);
            try {
                java.lang.Object objB = aVar.B(obj);
                if (objB == p137n7.b.g()) {
                    return;
                } else {
                    obj = p087i7.w.b(objB);
                }
            } catch (java.lang.Throwable th) {
                i7.w.a aVar2 = p087i7.w.f46751D;
                obj = p087i7.w.b(p087i7.x.a(th));
            }
            aVar.D();
            if (!(eVar2 instanceof p147o7.a)) {
                eVar2.t(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Continuation at ");
        java.lang.Object objA = A();
        if (objA == null) {
            objA = getClass().getName();
        }
        sb.append(objA);
        return sb.toString();
    }

    public p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "completion");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public p127m7.e y(p127m7.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "completion");
        throw new java.lang.UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public final p127m7.e z() {
        return this.f52551C;
    }
}
