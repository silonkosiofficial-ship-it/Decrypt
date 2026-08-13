package p058f8;

/* JADX INFO: loaded from: classes2.dex */
final class n extends p058f8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P7.a f45381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p008a8.g f45383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X7.EnumC1824b f45384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f45385e;

    public n(P7.a aVar, boolean z6, p008a8.g gVar, X7.EnumC1824b enumC1824b, boolean z10) {
        p247y7.AbstractC7350t.f(gVar, "containerContext");
        p247y7.AbstractC7350t.f(enumC1824b, "containerApplicabilityType");
        this.f45381a = aVar;
        this.f45382b = z6;
        this.f45383c = gVar;
        this.f45384d = enumC1824b;
        this.f45385e = z10;
    }

    public /* synthetic */ n(P7.a aVar, boolean z6, p008a8.g gVar, X7.EnumC1824b enumC1824b, boolean z10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, z6, gVar, enumC1824b, (i6 & 16) != 0 ? false : z10);
    }

    @Override // p058f8.a
    public boolean A(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return ((F8.E) iVar).Z0() instanceof p058f8.g;
    }

    @Override // p058f8.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean h(P7.c cVar, J8.i iVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        return ((cVar instanceof Z7.g) && ((Z7.g) cVar).d()) || ((cVar instanceof p018b8.e) && !p() && (((p018b8.e) cVar).k() || m() == X7.EnumC1824b.TYPE_PARAMETER_BOUNDS)) || (iVar != null && L7.g.q0((F8.E) iVar) && i().m(cVar) && !this.f45383c.a().q().c());
    }

    @Override // p058f8.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public X7.C1826d i() {
        return this.f45383c.a().a();
    }

    @Override // p058f8.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public F8.E q(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return F8.s0.a((F8.E) iVar);
    }

    @Override // p058f8.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public J8.q v() {
        return G8.o.f3161a;
    }

    @Override // p058f8.a
    public java.lang.Iterable j(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return ((F8.E) iVar).k();
    }

    @Override // p058f8.a
    public java.lang.Iterable l() {
        P7.g gVarK;
        P7.a aVar = this.f45381a;
        return (aVar == null || (gVarK = aVar.k()) == null) ? p097j7.AbstractC6879v.m() : gVarK;
    }

    @Override // p058f8.a
    public X7.EnumC1824b m() {
        return this.f45384d;
    }

    @Override // p058f8.a
    public X7.y n() {
        return this.f45383c.b();
    }

    @Override // p058f8.a
    public boolean o() {
        P7.a aVar = this.f45381a;
        return (aVar instanceof O7.j0) && ((O7.j0) aVar).u0() != null;
    }

    @Override // p058f8.a
    public boolean p() {
        return this.f45383c.a().q().d();
    }

    @Override // p058f8.a
    public p138n8.d s(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        O7.InterfaceC1424e interfaceC1424eF = F8.q0.f((F8.E) iVar);
        if (interfaceC1424eF != null) {
            return p178r8.f.m(interfaceC1424eF);
        }
        return null;
    }

    @Override // p058f8.a
    public boolean u() {
        return this.f45385e;
    }

    @Override // p058f8.a
    public boolean w(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return L7.g.d0((F8.E) iVar);
    }

    @Override // p058f8.a
    public boolean x() {
        return this.f45382b;
    }

    @Override // p058f8.a
    public boolean y(J8.i iVar, J8.i iVar2) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        p247y7.AbstractC7350t.f(iVar2, "other");
        return this.f45383c.a().k().b((F8.E) iVar, (F8.E) iVar2);
    }

    @Override // p058f8.a
    public boolean z(J8.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        return nVar instanceof p018b8.n;
    }
}
