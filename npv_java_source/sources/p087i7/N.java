package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements p087i7.InterfaceC6668n, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p237x7.a f46722C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f46723D;

    public N(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "initializer");
        this.f46722C = aVar;
        this.f46723D = p087i7.I.f46715a;
    }

    @Override // p087i7.InterfaceC6668n
    public boolean d() {
        return this.f46723D != p087i7.I.f46715a;
    }

    @Override // p087i7.InterfaceC6668n
    public java.lang.Object getValue() {
        if (this.f46723D == p087i7.I.f46715a) {
            p237x7.a aVar = this.f46722C;
            p247y7.AbstractC7350t.c(aVar);
            this.f46723D = aVar.b();
            this.f46722C = null;
        }
        return this.f46723D;
    }

    public java.lang.String toString() {
        return d() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
