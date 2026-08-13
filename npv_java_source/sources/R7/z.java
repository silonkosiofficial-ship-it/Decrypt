package R7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z extends R7.AbstractC1505k implements O7.K {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p138n8.c f9739G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.lang.String f9740H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(O7.G g6, p138n8.c cVar) {
        super(g6, P7.g.f8385d.b(), cVar.h(), O7.a0.f8143a);
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        this.f9739G = cVar;
        this.f9740H = "package " + cVar + " of " + g6;
    }

    @Override // R7.AbstractC1505k, O7.InterfaceC1432m
    public O7.G b() {
        O7.InterfaceC1432m interfaceC1432mB = super.b();
        p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (O7.G) interfaceC1432mB;
    }

    @Override // O7.K
    public final p138n8.c e() {
        return this.f9739G;
    }

    @Override // R7.AbstractC1505k, O7.InterfaceC1435p
    public O7.a0 o() {
        O7.a0 a0Var = O7.a0.f8143a;
        p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
        return a0Var;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(interfaceC1434o, "visitor");
        return interfaceC1434o.j(this, obj);
    }

    @Override // R7.AbstractC1504j
    public java.lang.String toString() {
        return this.f9740H;
    }
}
