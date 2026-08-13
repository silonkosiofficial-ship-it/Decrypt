package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends R7.AbstractC1498d implements D8.g {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p088i8.r f2070M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p108k8.c f2071N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p108k8.g f2072O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p108k8.h f2073P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final D8.f f2074Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private F8.M f2075R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private F8.M f2076S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private java.util.List f2077T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private F8.M f2078U;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(E8.n nVar, O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, O7.AbstractC1439u abstractC1439u, p088i8.r rVar, p108k8.c cVar, p108k8.g gVar2, p108k8.h hVar, D8.f fVar2) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(abstractC1439u, "visibility");
        p247y7.AbstractC7350t.f(rVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar2, "typeTable");
        p247y7.AbstractC7350t.f(hVar, "versionRequirementTable");
        O7.a0 a0Var = O7.a0.f8143a;
        p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
        super(nVar, interfaceC1432m, gVar, fVar, a0Var, abstractC1439u);
        this.f2070M = rVar;
        this.f2071N = cVar;
        this.f2072O = gVar2;
        this.f2073P = hVar;
        this.f2074Q = fVar2;
    }

    @Override // R7.AbstractC1498d
    protected java.util.List V0() {
        java.util.List list = this.f2077T;
        if (list != null) {
            return list;
        }
        p247y7.AbstractC7350t.p("typeConstructorParameters");
        return null;
    }

    public p088i8.r X0() {
        return this.f2070M;
    }

    public p108k8.h Y0() {
        return this.f2073P;
    }

    @Override // D8.g
    public p108k8.g Z() {
        return this.f2072O;
    }

    public final void Z0(java.util.List list, F8.M m6, F8.M m10) {
        p247y7.AbstractC7350t.f(list, "declaredTypeParameters");
        p247y7.AbstractC7350t.f(m6, "underlyingType");
        p247y7.AbstractC7350t.f(m10, "expandedType");
        W0(list);
        this.f2075R = m6;
        this.f2076S = m10;
        this.f2077T = O7.g0.d(this);
        this.f2078U = O0();
    }

    @Override // O7.c0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public O7.e0 c(F8.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "substitutor");
        if (n0Var.k()) {
            return this;
        }
        E8.n nVarP0 = p0();
        O7.InterfaceC1432m interfaceC1432mB = b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        P7.g gVarK = k();
        p247y7.AbstractC7350t.e(gVarK, "<get-annotations>(...)");
        p138n8.f name = getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        D8.l lVar = new D8.l(nVarP0, interfaceC1432mB, gVarK, name, h(), X0(), h0(), Z(), Y0(), k0());
        java.util.List listA = A();
        F8.M mO0 = o0();
        F8.u0 u0Var = F8.u0.INVARIANT;
        F8.E eN = n0Var.n(mO0, u0Var);
        p247y7.AbstractC7350t.e(eN, "safeSubstitute(...)");
        F8.M mA = F8.m0.a(eN);
        F8.E eN2 = n0Var.n(c0(), u0Var);
        p247y7.AbstractC7350t.e(eN2, "safeSubstitute(...)");
        lVar.Z0(listA, mA, F8.m0.a(eN2));
        return lVar;
    }

    @Override // O7.e0
    public F8.M c0() {
        F8.M m6 = this.f2076S;
        if (m6 != null) {
            return m6;
        }
        p247y7.AbstractC7350t.p("expandedType");
        return null;
    }

    @Override // D8.g
    public p108k8.c h0() {
        return this.f2071N;
    }

    @Override // D8.g
    public D8.f k0() {
        return this.f2074Q;
    }

    @Override // O7.e0
    public F8.M o0() {
        F8.M m6 = this.f2075R;
        if (m6 != null) {
            return m6;
        }
        p247y7.AbstractC7350t.p("underlyingType");
        return null;
    }

    @Override // O7.e0
    public O7.InterfaceC1424e v() {
        if (F8.G.a(c0())) {
            return null;
        }
        O7.InterfaceC1427h interfaceC1427hW = c0().W0().w();
        if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hW;
        }
        return null;
    }

    @Override // O7.InterfaceC1427h
    public F8.M w() {
        F8.M m6 = this.f2078U;
        if (m6 != null) {
            return m6;
        }
        p247y7.AbstractC7350t.p("defaultTypeImpl");
        return null;
    }
}
