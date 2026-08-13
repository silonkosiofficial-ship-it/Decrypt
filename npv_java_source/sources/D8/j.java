package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends R7.C implements D8.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final p088i8.n f2060e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final p108k8.c f2061f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final p108k8.g f2062g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final p108k8.h f2063h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final D8.f f2064i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(O7.InterfaceC1432m interfaceC1432m, O7.U u6, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, p138n8.f fVar, O7.InterfaceC1421b.a aVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, p088i8.n nVar, p108k8.c cVar, p108k8.g gVar2, p108k8.h hVar, D8.f fVar2) {
        super(interfaceC1432m, u6, gVar, d6, abstractC1439u, z6, fVar, aVar, O7.a0.f8143a, z10, z11, z14, false, z12, z13);
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(d6, "modality");
        p247y7.AbstractC7350t.f(abstractC1439u, "visibility");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar2, "typeTable");
        p247y7.AbstractC7350t.f(hVar, "versionRequirementTable");
        this.f2060e0 = nVar;
        this.f2061f0 = cVar;
        this.f2062g0 = gVar2;
        this.f2063h0 = hVar;
        this.f2064i0 = fVar2;
    }

    @Override // R7.C, O7.C
    public boolean C() {
        java.lang.Boolean boolD = p108k8.b.f49772E.d(J().a0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // R7.C
    protected R7.C Y0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.U u6, O7.InterfaceC1421b.a aVar, p138n8.f fVar, O7.a0 a0Var) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "newOwner");
        p247y7.AbstractC7350t.f(d6, "newModality");
        p247y7.AbstractC7350t.f(abstractC1439u, "newVisibility");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(fVar, "newName");
        p247y7.AbstractC7350t.f(a0Var, "source");
        return new D8.j(interfaceC1432m, u6, k(), d6, abstractC1439u, t0(), fVar, aVar, B0(), F(), C(), T(), R(), J(), h0(), Z(), p1(), k0());
    }

    @Override // D8.g
    public p108k8.g Z() {
        return this.f2062g0;
    }

    @Override // D8.g
    public p108k8.c h0() {
        return this.f2061f0;
    }

    @Override // D8.g
    public D8.f k0() {
        return this.f2064i0;
    }

    @Override // D8.g
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public p088i8.n J() {
        return this.f2060e0;
    }

    public p108k8.h p1() {
        return this.f2063h0;
    }
}
