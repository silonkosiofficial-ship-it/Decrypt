package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends p147o7.d implements Z8.InterfaceC1870g, p147o7.e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Z8.InterfaceC1870g f17226F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p127m7.i f17227G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f17228H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p127m7.i f17229I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p127m7.e f17230J;

    public v(Z8.InterfaceC1870g interfaceC1870g, p127m7.i iVar) {
        super(p009a9.r.f17220C, p127m7.j.f51198C);
        this.f17226F = interfaceC1870g;
        this.f17227G = iVar;
        this.f17228H = ((java.lang.Number) iVar.D(0, new p237x7.p() { // from class: a9.u
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(p009a9.v.K(((java.lang.Integer) obj).intValue(), (m7.i.b) obj2));
            }
        })).intValue();
    }

    private final void I(p127m7.i iVar, p127m7.i iVar2, java.lang.Object obj) {
        if (iVar2 instanceof p009a9.m) {
            M((p009a9.m) iVar2, obj);
        }
        p009a9.y.b(this, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(int i6, m7.i.b bVar) {
        return i6 + 1;
    }

    private final java.lang.Object L(p127m7.e eVar, java.lang.Object obj) {
        p127m7.i context = eVar.getContext();
        W8.C0.l(context);
        p127m7.i iVar = this.f17229I;
        if (iVar != context) {
            I(context, iVar, obj);
            this.f17229I = context;
        }
        this.f17230J = eVar;
        p237x7.q qVar = p009a9.w.f17231a;
        Z8.InterfaceC1870g interfaceC1870g = this.f17226F;
        p247y7.AbstractC7350t.d(interfaceC1870g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        java.lang.Object objJ = qVar.j(interfaceC1870g, obj, this);
        if (!p247y7.AbstractC7350t.b(objJ, p137n7.b.g())) {
            this.f17230J = null;
        }
        return objJ;
    }

    private final void M(p009a9.m mVar, java.lang.Object obj) {
        throw new java.lang.IllegalStateException(S8.r.o("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f17219D + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p147o7.a
    public java.lang.StackTraceElement A() {
        return null;
    }

    @Override // p147o7.a
    protected java.lang.Object B(java.lang.Object obj) {
        java.lang.Throwable thE = p087i7.w.e(obj);
        if (thE != null) {
            this.f17229I = new p009a9.m(thE, getContext());
        }
        p127m7.e eVar = this.f17230J;
        if (eVar != null) {
            eVar.t(obj);
        }
        return p137n7.b.g();
    }

    @Override // p147o7.d, p147o7.a
    public void D() {
        super.D();
    }

    @Override // Z8.InterfaceC1870g
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        try {
            java.lang.Object objL = L(eVar, obj);
            if (objL == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objL == p137n7.b.g() ? objL : p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            this.f17229I = new p009a9.m(th, eVar.getContext());
            throw th;
        }
    }

    @Override // p147o7.a, p147o7.e
    public p147o7.e e() {
        p127m7.e eVar = this.f17230J;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // p147o7.d, p127m7.e
    public p127m7.i getContext() {
        p127m7.i iVar = this.f17229I;
        return iVar == null ? p127m7.j.f51198C : iVar;
    }
}
