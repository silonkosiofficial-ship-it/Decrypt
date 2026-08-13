package H8;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements O7.G {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final H8.d f4407C = new H8.d();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final p138n8.f f4408D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.util.List f4409E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.util.List f4410F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.Set f4411G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f4412H;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H8.d.a f4413D = new H8.d.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L7.e b() {
            return L7.e.f6245h.a();
        }
    }

    static {
        p138n8.f fVarS = p138n8.f.s(H8.b.ERROR_MODULE.g());
        p247y7.AbstractC7350t.e(fVarS, "special(...)");
        f4408D = fVarS;
        f4409E = p097j7.AbstractC6879v.m();
        f4410F = p097j7.AbstractC6879v.m();
        f4411G = p097j7.Z.d();
        f4412H = p087i7.AbstractC6669o.b(H8.d.a.f4413D);
    }

    private d() {
    }

    @Override // O7.G
    public java.util.List C0() {
        return f4410F;
    }

    public p138n8.f M() {
        return f4408D;
    }

    @Override // O7.G
    public boolean U(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "targetModule");
        return false;
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1432m a() {
        return this;
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        return null;
    }

    @Override // O7.I
    public p138n8.f getName() {
        return M();
    }

    @Override // P7.a
    public P7.g k() {
        return P7.g.f8385d.b();
    }

    @Override // O7.G
    public java.lang.Object q0(O7.F f6) {
        p247y7.AbstractC7350t.f(f6, "capability");
        return null;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(interfaceC1434o, "visitor");
        return null;
    }

    @Override // O7.G
    public O7.P s0(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        throw new java.lang.IllegalStateException("Should not be called!");
    }

    @Override // O7.G
    public L7.g t() {
        return (L7.g) f4412H.getValue();
    }

    @Override // O7.G
    public java.util.Collection x(p138n8.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return p097j7.AbstractC6879v.m();
    }
}
