package R7;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends R7.AbstractC1504j implements O7.G {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final E8.n f9719E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final L7.g f9720F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p138n8.f f9721G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.Map f9722H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final R7.A f9723I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private R7.v f9724J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private O7.L f9725K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f9726L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final E8.g f9727M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f9728N;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R7.C1503i b() {
            R7.v vVar = R7.x.this.f9724J;
            R7.x xVar = R7.x.this;
            if (vVar == null) {
                throw new java.lang.AssertionError("Dependencies of module " + xVar.Y0() + " were not set before querying module content");
            }
            java.util.List listA = vVar.a();
            R7.x.this.X0();
            listA.contains(R7.x.this);
            java.util.List list = listA;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((R7.x) it.next()).c1();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                O7.L l6 = ((R7.x) it2.next()).f9725K;
                p247y7.AbstractC7350t.c(l6);
                arrayList.add(l6);
            }
            return new R7.C1503i(arrayList, "CompositeProvider@ModuleDescriptor for " + R7.x.this.getName());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.P l(p138n8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "fqName");
            R7.A a6 = R7.x.this.f9723I;
            R7.x xVar = R7.x.this;
            return a6.a(xVar, cVar, xVar.f9719E);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(p138n8.f fVar, E8.n nVar, L7.g gVar, p148o8.a aVar) {
        this(fVar, nVar, gVar, aVar, null, null, 48, null);
        p247y7.AbstractC7350t.f(fVar, "moduleName");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(gVar, "builtIns");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p138n8.f fVar, E8.n nVar, L7.g gVar, p148o8.a aVar, java.util.Map map, p138n8.f fVar2) {
        super(P7.g.f8385d.b(), fVar);
        p247y7.AbstractC7350t.f(fVar, "moduleName");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        p247y7.AbstractC7350t.f(map, "capabilities");
        this.f9719E = nVar;
        this.f9720F = gVar;
        this.f9721G = fVar2;
        if (!fVar.q()) {
            throw new java.lang.IllegalArgumentException("Module name must be special: " + fVar);
        }
        this.f9722H = map;
        R7.A a6 = (R7.A) q0(R7.A.f9501a.a());
        this.f9723I = a6 == null ? R7.A.b.f9504b : a6;
        this.f9726L = true;
        this.f9727M = nVar.b(new R7.x.b());
        this.f9728N = p087i7.AbstractC6669o.b(new R7.x.a());
    }

    public /* synthetic */ x(p138n8.f fVar, E8.n nVar, L7.g gVar, p148o8.a aVar, java.util.Map map, p138n8.f fVar2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(fVar, nVar, gVar, (i6 & 8) != 0 ? null : aVar, (i6 & 16) != 0 ? p097j7.S.h() : map, (i6 & 32) != 0 ? null : fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String Y0() {
        java.lang.String string = getName().toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    private final R7.C1503i a1() {
        return (R7.C1503i) this.f9728N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c1() {
        return this.f9725K != null;
    }

    @Override // O7.G
    public java.util.List C0() {
        R7.v vVar = this.f9724J;
        if (vVar != null) {
            return vVar.c();
        }
        throw new java.lang.AssertionError("Dependencies of module " + Y0() + " were not set");
    }

    @Override // O7.G
    public boolean U(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "targetModule");
        if (p247y7.AbstractC7350t.b(this, g6)) {
            return true;
        }
        R7.v vVar = this.f9724J;
        p247y7.AbstractC7350t.c(vVar);
        return p097j7.AbstractC6879v.Z(vVar.b(), g6) || C0().contains(g6) || g6.C0().contains(this);
    }

    public void X0() {
        if (d1()) {
            return;
        }
        O7.B.a(this);
    }

    public final O7.L Z0() {
        X0();
        return a1();
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        return O7.G.a.b(this);
    }

    public final void b1(O7.L l6) {
        p247y7.AbstractC7350t.f(l6, "providerForModuleContent");
        c1();
        this.f9725K = l6;
    }

    public boolean d1() {
        return this.f9726L;
    }

    public final void e1(R7.v vVar) {
        p247y7.AbstractC7350t.f(vVar, "dependencies");
        this.f9724J = vVar;
    }

    public final void f1(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "descriptors");
        g1(list, p097j7.Z.d());
    }

    public final void g1(java.util.List list, java.util.Set set) {
        p247y7.AbstractC7350t.f(list, "descriptors");
        p247y7.AbstractC7350t.f(set, "friends");
        e1(new R7.w(list, set, p097j7.AbstractC6879v.m(), p097j7.Z.d()));
    }

    public final void h1(R7.x... xVarArr) {
        p247y7.AbstractC7350t.f(xVarArr, "descriptors");
        f1(p097j7.AbstractC6872n.R0(xVarArr));
    }

    @Override // O7.G
    public java.lang.Object q0(O7.F f6) {
        p247y7.AbstractC7350t.f(f6, "capability");
        java.lang.Object obj = this.f9722H.get(f6);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return O7.G.a.a(this, interfaceC1434o, obj);
    }

    @Override // O7.G
    public O7.P s0(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        X0();
        return (O7.P) this.f9727M.l(cVar);
    }

    @Override // O7.G
    public L7.g t() {
        return this.f9720F;
    }

    @Override // R7.AbstractC1504j
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        if (!d1()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        O7.L l6 = this.f9725K;
        sb.append(l6 != null ? l6.getClass().getSimpleName() : null);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    @Override // O7.G
    public java.util.Collection x(p138n8.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        X0();
        return Z0().x(cVar, lVar);
    }
}
