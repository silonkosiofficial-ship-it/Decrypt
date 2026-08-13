package M0;

/* JADX INFO: renamed from: M0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1339k implements M0.InterfaceC1346s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f6738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f6739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f6740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f6741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f6742e;

    /* JADX INFO: renamed from: M0.k$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            java.lang.Object obj;
            M0.InterfaceC1346s interfaceC1346sB;
            java.util.List listF = M0.C1339k.this.f();
            if (listF.isEmpty()) {
                obj = null;
            } else {
                java.lang.Object obj2 = listF.get(0);
                float fB = ((M0.r) obj2).b().b();
                int iO = p097j7.AbstractC6879v.o(listF);
                int i6 = 1;
                if (1 <= iO) {
                    while (true) {
                        java.lang.Object obj3 = listF.get(i6);
                        float fB2 = ((M0.r) obj3).b().b();
                        if (java.lang.Float.compare(fB, fB2) < 0) {
                            obj2 = obj3;
                            fB = fB2;
                        }
                        if (i6 == iO) {
                            break;
                        }
                        i6++;
                    }
                }
                obj = obj2;
            }
            M0.r rVar = (M0.r) obj;
            return java.lang.Float.valueOf((rVar == null || (interfaceC1346sB = rVar.b()) == null) ? 0.0f : interfaceC1346sB.b());
        }
    }

    /* JADX INFO: renamed from: M0.k$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            java.lang.Object obj;
            M0.InterfaceC1346s interfaceC1346sB;
            java.util.List listF = M0.C1339k.this.f();
            if (listF.isEmpty()) {
                obj = null;
            } else {
                java.lang.Object obj2 = listF.get(0);
                float fA = ((M0.r) obj2).b().a();
                int iO = p097j7.AbstractC6879v.o(listF);
                int i6 = 1;
                if (1 <= iO) {
                    while (true) {
                        java.lang.Object obj3 = listF.get(i6);
                        float fA2 = ((M0.r) obj3).b().a();
                        if (java.lang.Float.compare(fA, fA2) < 0) {
                            obj2 = obj3;
                            fA = fA2;
                        }
                        if (i6 == iO) {
                            break;
                        }
                        i6++;
                    }
                }
                obj = obj2;
            }
            M0.r rVar = (M0.r) obj;
            return java.lang.Float.valueOf((rVar == null || (interfaceC1346sB = rVar.b()) == null) ? 0.0f : interfaceC1346sB.a());
        }
    }

    public C1339k(M0.C1332d c1332d, M0.P p6, java.util.List list, Y0.e eVar, R0.AbstractC1494h.b bVar) {
        this.f6738a = c1332d;
        this.f6739b = list;
        p087i7.r rVar = p087i7.r.NONE;
        this.f6740c = p087i7.AbstractC6669o.a(rVar, new M0.C1339k.b());
        this.f6741d = p087i7.AbstractC6669o.a(rVar, new M0.C1339k.a());
        M0.v vVarL = p6.L();
        java.util.List listM = M0.AbstractC1333e.m(c1332d, vVarL);
        java.util.ArrayList arrayList = new java.util.ArrayList(listM.size());
        int size = listM.size();
        for (int i6 = 0; i6 < size; i6++) {
            M0.C1332d.c cVar = (M0.C1332d.c) listM.get(i6);
            M0.C1332d c1332dN = M0.AbstractC1333e.n(c1332d, cVar.f(), cVar.d());
            arrayList.add(new M0.r(M0.AbstractC1347t.a(c1332dN.i(), p6.H(h((M0.v) cVar.e(), vVarL)), c1332dN.g(), M0.AbstractC1340l.b(g(), cVar.f(), cVar.d()), eVar, bVar), cVar.f(), cVar.d()));
        }
        this.f6742e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M0.v h(M0.v vVar, M0.v vVar2) {
        return !X0.l.j(vVar.i(), X0.l.f15636b.f()) ? vVar : vVar.a((509 & 1) != 0 ? vVar.f6755a : 0, (509 & 2) != 0 ? vVar.f6756b : vVar2.i(), (509 & 4) != 0 ? vVar.f6757c : 0L, (509 & 8) != 0 ? vVar.f6758d : null, (509 & 16) != 0 ? vVar.f6759e : null, (509 & 32) != 0 ? vVar.f6760f : null, (509 & 64) != 0 ? vVar.f6761g : 0, (509 & 128) != 0 ? vVar.f6762h : 0, (509 & 256) != 0 ? vVar.f6763i : null);
    }

    @Override // M0.InterfaceC1346s
    public float a() {
        return ((java.lang.Number) this.f6740c.getValue()).floatValue();
    }

    @Override // M0.InterfaceC1346s
    public float b() {
        return ((java.lang.Number) this.f6741d.getValue()).floatValue();
    }

    @Override // M0.InterfaceC1346s
    public boolean c() {
        java.util.List list = this.f6742e;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((M0.r) list.get(i6)).b().c()) {
                return true;
            }
        }
        return false;
    }

    public final M0.C1332d e() {
        return this.f6738a;
    }

    public final java.util.List f() {
        return this.f6742e;
    }

    public final java.util.List g() {
        return this.f6739b;
    }
}
