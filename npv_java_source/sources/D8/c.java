package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends R7.C1500f implements D8.b {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final p088i8.d f1947h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final p108k8.c f1948i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final p108k8.g f1949j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final p108k8.h f1950k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final D8.f f1951l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1431l interfaceC1431l, P7.g gVar, boolean z6, O7.InterfaceC1421b.a aVar, p088i8.d dVar, p108k8.c cVar, p108k8.g gVar2, p108k8.h hVar, D8.f fVar, O7.a0 a0Var) {
        super(interfaceC1424e, interfaceC1431l, gVar, z6, aVar, a0Var == null ? O7.a0.f8143a : a0Var);
        p247y7.AbstractC7350t.f(interfaceC1424e, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(dVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar2, "typeTable");
        p247y7.AbstractC7350t.f(hVar, "versionRequirementTable");
        this.f1947h0 = dVar;
        this.f1948i0 = cVar;
        this.f1949j0 = gVar2;
        this.f1950k0 = hVar;
        this.f1951l0 = fVar;
    }

    public /* synthetic */ c(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1431l interfaceC1431l, P7.g gVar, boolean z6, O7.InterfaceC1421b.a aVar, p088i8.d dVar, p108k8.c cVar, p108k8.g gVar2, p108k8.h hVar, D8.f fVar, O7.a0 a0Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC1424e, interfaceC1431l, gVar, z6, aVar, dVar, cVar, gVar2, hVar, fVar, (i6 & 1024) != 0 ? null : a0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.C1500f
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public D8.c U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "newOwner");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(a0Var, "source");
        D8.c cVar = new D8.c((O7.InterfaceC1424e) interfaceC1432m, (O7.InterfaceC1431l) interfaceC1443y, gVar, this.f9610g0, aVar, J(), h0(), Z(), D1(), k0(), a0Var);
        cVar.h1(Z0());
        return cVar;
    }

    @Override // R7.p, O7.C
    public boolean C() {
        return false;
    }

    @Override // D8.g
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public p088i8.d J() {
        return this.f1947h0;
    }

    public p108k8.h D1() {
        return this.f1950k0;
    }

    @Override // R7.p, O7.InterfaceC1443y
    public boolean V() {
        return false;
    }

    @Override // D8.g
    public p108k8.g Z() {
        return this.f1949j0;
    }

    @Override // D8.g
    public p108k8.c h0() {
        return this.f1948i0;
    }

    @Override // D8.g
    public D8.f k0() {
        return this.f1951l0;
    }

    @Override // R7.p, O7.InterfaceC1443y
    public boolean m() {
        return false;
    }

    @Override // R7.p, O7.InterfaceC1443y
    public boolean y() {
        return false;
    }
}
