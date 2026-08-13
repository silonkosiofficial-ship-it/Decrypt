package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends R7.G implements D8.b {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final p088i8.i f2065g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final p108k8.c f2066h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final p108k8.g f2067i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final p108k8.h f2068j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final D8.f f2069k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(O7.InterfaceC1432m interfaceC1432m, O7.Z z6, P7.g gVar, p138n8.f fVar, O7.InterfaceC1421b.a aVar, p088i8.i iVar, p108k8.c cVar, p108k8.g gVar2, p108k8.h hVar, D8.f fVar2, O7.a0 a0Var) {
        super(interfaceC1432m, z6, gVar, fVar, aVar, a0Var == null ? O7.a0.f8143a : a0Var);
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(iVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar2, "typeTable");
        p247y7.AbstractC7350t.f(hVar, "versionRequirementTable");
        this.f2065g0 = iVar;
        this.f2066h0 = cVar;
        this.f2067i0 = gVar2;
        this.f2068j0 = hVar;
        this.f2069k0 = fVar2;
    }

    public /* synthetic */ k(O7.InterfaceC1432m interfaceC1432m, O7.Z z6, P7.g gVar, p138n8.f fVar, O7.InterfaceC1421b.a aVar, p088i8.i iVar, p108k8.c cVar, p108k8.g gVar2, p108k8.h hVar, D8.f fVar2, O7.a0 a0Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC1432m, z6, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, fVar2, (i6 & 1024) != 0 ? null : a0Var);
    }

    @Override // R7.G, R7.p
    protected R7.p U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        p138n8.f fVar2;
        p247y7.AbstractC7350t.f(interfaceC1432m, "newOwner");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(a0Var, "source");
        O7.Z z6 = (O7.Z) interfaceC1443y;
        if (fVar == null) {
            p138n8.f name = getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        D8.k kVar = new D8.k(interfaceC1432m, z6, gVar, fVar2, aVar, J(), h0(), Z(), z1(), k0(), a0Var);
        kVar.h1(Z0());
        return kVar;
    }

    @Override // D8.g
    public p108k8.g Z() {
        return this.f2067i0;
    }

    @Override // D8.g
    public p108k8.c h0() {
        return this.f2066h0;
    }

    @Override // D8.g
    public D8.f k0() {
        return this.f2069k0;
    }

    @Override // D8.g
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public p088i8.i J() {
        return this.f2065g0;
    }

    public p108k8.h z1() {
        return this.f2068j0;
    }
}
