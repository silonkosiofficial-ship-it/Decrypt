package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements P7.c, Z7.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f24196i = {p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p008a8.g f24197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p048e8.InterfaceC6535a f24198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.j f24199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.i f24200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p038d8.a f24201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E8.i f24202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f24204h;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            java.util.Collection<p048e8.InterfaceC6536b> collectionA = p018b8.e.this.f24198b.a();
            p018b8.e eVar = p018b8.e.this;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p048e8.InterfaceC6536b interfaceC6536b : collectionA) {
                p138n8.f name = interfaceC6536b.getName();
                if (name == null) {
                    name = X7.B.f15898c;
                }
                p198t8.g gVarL = eVar.l(interfaceC6536b);
                p087i7.u uVarA = gVarL != null ? p087i7.B.a(name, gVarL) : null;
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            return p097j7.S.q(arrayList);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p138n8.c b() {
            p138n8.b bVarC = p018b8.e.this.f24198b.c();
            if (bVarC != null) {
                return bVarC.b();
            }
            return null;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M b() {
            p138n8.c cVarE = p018b8.e.this.e();
            if (cVarE == null) {
                return H8.k.d(H8.j.f4503h1, p018b8.e.this.f24198b.toString());
            }
            O7.InterfaceC1424e interfaceC1424eF = N7.d.f(N7.d.f7840a, cVarE, p018b8.e.this.f24197a.d().t(), null, 4, null);
            if (interfaceC1424eF == null) {
                p048e8.g gVarD = p018b8.e.this.f24198b.D();
                interfaceC1424eF = gVarD != null ? p018b8.e.this.f24197a.a().n().a(gVarD) : null;
                if (interfaceC1424eF == null) {
                    interfaceC1424eF = p018b8.e.this.h(cVarE);
                }
            }
            return interfaceC1424eF.w();
        }
    }

    public e(p008a8.g gVar, p048e8.InterfaceC6535a interfaceC6535a, boolean z6) {
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(interfaceC6535a, "javaAnnotation");
        this.f24197a = gVar;
        this.f24198b = interfaceC6535a;
        this.f24199c = gVar.e().f(new b8.e.b());
        this.f24200d = gVar.e().d(new b8.e.c());
        this.f24201e = gVar.a().t().a(interfaceC6535a);
        this.f24202f = gVar.e().d(new b8.e.a());
        this.f24203g = interfaceC6535a.d();
        this.f24204h = interfaceC6535a.z() || z6;
    }

    public /* synthetic */ e(p008a8.g gVar, p048e8.InterfaceC6535a interfaceC6535a, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, interfaceC6535a, (i6 & 4) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1424e h(p138n8.c cVar) {
        O7.G gD = this.f24197a.d();
        p138n8.b bVarM = p138n8.b.m(cVar);
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        return O7.AbstractC1442x.c(gD, bVarM, this.f24197a.a().b().d().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p198t8.g l(p048e8.InterfaceC6536b interfaceC6536b) {
        if (interfaceC6536b instanceof p048e8.o) {
            return p198t8.h.d(p198t8.h.f54633a, ((p048e8.o) interfaceC6536b).getValue(), null, 2, null);
        }
        if (interfaceC6536b instanceof p048e8.m) {
            p048e8.m mVar = (p048e8.m) interfaceC6536b;
            return p(mVar.b(), mVar.d());
        }
        if (!(interfaceC6536b instanceof p048e8.e)) {
            if (interfaceC6536b instanceof p048e8.InterfaceC6537c) {
                return m(((p048e8.InterfaceC6537c) interfaceC6536b).a());
            }
            if (interfaceC6536b instanceof p048e8.h) {
                return q(((p048e8.h) interfaceC6536b).c());
            }
            return null;
        }
        p048e8.e eVar = (p048e8.e) interfaceC6536b;
        p138n8.f name = eVar.getName();
        if (name == null) {
            name = X7.B.f15898c;
        }
        p247y7.AbstractC7350t.c(name);
        return n(name, eVar.e());
    }

    private final p198t8.g m(p048e8.InterfaceC6535a interfaceC6535a) {
        return new p198t8.C7156a(new p018b8.e(this.f24197a, interfaceC6535a, false, 4, null));
    }

    private final p198t8.g n(p138n8.f fVar, java.util.List list) {
        F8.E eL;
        F8.M type = getType();
        p247y7.AbstractC7350t.e(type, "<get-type>(...)");
        if (F8.G.a(type)) {
            return null;
        }
        O7.InterfaceC1424e interfaceC1424eI = p218v8.c.i(this);
        p247y7.AbstractC7350t.c(interfaceC1424eI);
        O7.j0 j0VarB = Y7.a.b(fVar, interfaceC1424eI);
        if (j0VarB == null || (eL = j0VarB.getType()) == null) {
            eL = this.f24197a.a().m().t().l(F8.u0.INVARIANT, H8.k.d(H8.j.f4501g1, new java.lang.String[0]));
        }
        p247y7.AbstractC7350t.c(eL);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            p198t8.g gVarL = l((p048e8.InterfaceC6536b) it.next());
            if (gVarL == null) {
                gVarL = new p198t8.r();
            }
            arrayList.add(gVarL);
        }
        return p198t8.h.f54633a.a(arrayList, eL);
    }

    private final p198t8.g p(p138n8.b bVar, p138n8.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new p198t8.j(bVar, fVar);
    }

    private final p198t8.g q(p048e8.x xVar) {
        return p198t8.p.f54652b.a(this.f24197a.g().o(xVar, p028c8.b.b(F8.p0.COMMON, false, false, null, 7, null)));
    }

    @Override // P7.c
    public java.util.Map a() {
        return (java.util.Map) E8.m.a(this.f24202f, this, f24196i[2]);
    }

    @Override // Z7.g
    public boolean d() {
        return this.f24203g;
    }

    @Override // P7.c
    public p138n8.c e() {
        return (p138n8.c) E8.m.b(this.f24199c, this, f24196i[0]);
    }

    @Override // P7.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p038d8.a o() {
        return this.f24201e;
    }

    @Override // P7.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public F8.M getType() {
        return (F8.M) E8.m.a(this.f24200d, this, f24196i[1]);
    }

    public final boolean k() {
        return this.f24204h;
    }

    public java.lang.String toString() {
        return p168q8.c.s(p168q8.c.f53159g, this, null, 2, null);
    }
}
