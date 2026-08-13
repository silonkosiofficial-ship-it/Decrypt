package p087i7;

/* JADX INFO: loaded from: classes3.dex */
final class z implements p087i7.InterfaceC6668n, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p237x7.a f46759C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile java.lang.Object f46760D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f46761E;

    public z(p237x7.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "initializer");
        this.f46759C = aVar;
        this.f46760D = p087i7.I.f46715a;
        this.f46761E = obj == null ? this : obj;
    }

    public /* synthetic */ z(p237x7.a aVar, java.lang.Object obj, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, (i6 & 2) != 0 ? null : obj);
    }

    @Override // p087i7.InterfaceC6668n
    public boolean d() {
        return this.f46760D != p087i7.I.f46715a;
    }

    @Override // p087i7.InterfaceC6668n
    public java.lang.Object getValue() {
        java.lang.Object objB;
        java.lang.Object obj = this.f46760D;
        p087i7.I i6 = p087i7.I.f46715a;
        if (obj != i6) {
            return obj;
        }
        synchronized (this.f46761E) {
            objB = this.f46760D;
            if (objB == i6) {
                p237x7.a aVar = this.f46759C;
                p247y7.AbstractC7350t.c(aVar);
                objB = aVar.b();
                this.f46760D = objB;
                this.f46759C = null;
            }
        }
        return objB;
    }

    public java.lang.String toString() {
        return d() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
