package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends p248y8.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f24280m = {p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p008a8.g f24281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p018b8.j f24282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.i f24283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.i f24284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E8.g f24285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E8.h f24286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E8.g f24287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E8.i f24288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final E8.i f24289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final E8.i f24290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final E8.g f24291l;

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F8.E f24292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F8.E f24293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f24294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f24295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f24296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.util.List f24297f;

        public a(F8.E e6, F8.E e10, java.util.List list, java.util.List list2, boolean z6, java.util.List list3) {
            p247y7.AbstractC7350t.f(e6, "returnType");
            p247y7.AbstractC7350t.f(list, "valueParameters");
            p247y7.AbstractC7350t.f(list2, "typeParameters");
            p247y7.AbstractC7350t.f(list3, "errors");
            this.f24292a = e6;
            this.f24293b = e10;
            this.f24294c = list;
            this.f24295d = list2;
            this.f24296e = z6;
            this.f24297f = list3;
        }

        public final java.util.List a() {
            return this.f24297f;
        }

        public final boolean b() {
            return this.f24296e;
        }

        public final F8.E c() {
            return this.f24293b;
        }

        public final F8.E d() {
            return this.f24292a;
        }

        public final java.util.List e() {
            return this.f24295d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b8.j.a)) {
                return false;
            }
            b8.j.a aVar = (b8.j.a) obj;
            return p247y7.AbstractC7350t.b(this.f24292a, aVar.f24292a) && p247y7.AbstractC7350t.b(this.f24293b, aVar.f24293b) && p247y7.AbstractC7350t.b(this.f24294c, aVar.f24294c) && p247y7.AbstractC7350t.b(this.f24295d, aVar.f24295d) && this.f24296e == aVar.f24296e && p247y7.AbstractC7350t.b(this.f24297f, aVar.f24297f);
        }

        public final java.util.List f() {
            return this.f24294c;
        }

        public int hashCode() {
            int iHashCode = this.f24292a.hashCode() * 31;
            F8.E e6 = this.f24293b;
            return ((((((((iHashCode + (e6 == null ? 0 : e6.hashCode())) * 31) + this.f24294c.hashCode()) * 31) + this.f24295d.hashCode()) * 31) + p190t.h.a(this.f24296e)) * 31) + this.f24297f.hashCode();
        }

        public java.lang.String toString() {
            return "MethodSignatureData(returnType=" + this.f24292a + ", receiverType=" + this.f24293b + ", valueParameters=" + this.f24294c + ", typeParameters=" + this.f24295d + ", hasStableParameterNames=" + this.f24296e + ", errors=" + this.f24297f + ')';
        }
    }

    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f24298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24299b;

        public b(java.util.List list, boolean z6) {
            p247y7.AbstractC7350t.f(list, "descriptors");
            this.f24298a = list;
            this.f24299b = z6;
        }

        public final java.util.List a() {
            return this.f24298a;
        }

        public final boolean b() {
            return this.f24299b;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            return p018b8.j.this.m(p248y8.d.f57327o, p248y8.h.f57352a.a());
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set b() {
            return p018b8.j.this.l(p248y8.d.f57332t, null);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.U l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            if (p018b8.j.this.B() != null) {
                return (O7.U) p018b8.j.this.B().f24286g.l(fVar);
            }
            p048e8.n nVarC = ((p018b8.b) p018b8.j.this.y().b()).c(fVar);
            if (nVarC == null || nVarC.L()) {
                return null;
            }
            return p018b8.j.this.J(nVarC);
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {
        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            if (p018b8.j.this.B() != null) {
                return (java.util.Collection) p018b8.j.this.B().f24285f.l(fVar);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p048e8.r rVar : ((p018b8.b) p018b8.j.this.y().b()).d(fVar)) {
                Z7.e eVarI = p018b8.j.this.I(rVar);
                if (p018b8.j.this.G(eVarI)) {
                    p018b8.j.this.w().a().h().b(rVar, eVarI);
                    arrayList.add(eVarI);
                }
            }
            p018b8.j.this.o(arrayList, fVar);
            return arrayList;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {
        g() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p018b8.b b() {
            return p018b8.j.this.p();
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {
        h() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set b() {
            return p018b8.j.this.n(p248y8.d.f57334v, null);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {
        i() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet((java.util.Collection) p018b8.j.this.f24285f.l(fVar));
            p018b8.j.this.L(linkedHashSet);
            p018b8.j.this.r(linkedHashSet, fVar);
            return p097j7.AbstractC6879v.T0(p018b8.j.this.w().a().r().g(p018b8.j.this.w(), linkedHashSet));
        }
    }

    /* JADX INFO: renamed from: b8.j$j, reason: collision with other inner class name */
    static final class C0464j extends p247y7.AbstractC7352v implements p237x7.l {
        C0464j() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            P8.a.a(arrayList, p018b8.j.this.f24286g.l(fVar));
            p018b8.j.this.s(fVar, arrayList);
            return p178r8.f.t(p018b8.j.this.C()) ? p097j7.AbstractC6879v.T0(arrayList) : p097j7.AbstractC6879v.T0(p018b8.j.this.w().a().r().g(p018b8.j.this.w(), arrayList));
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.a {
        k() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set b() {
            return p018b8.j.this.t(p248y8.d.f57335w, null);
        }
    }

    static final class l extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p048e8.n f24310E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p247y7.O f24311F;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p018b8.j f24312D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p048e8.n f24313E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p247y7.O f24314F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p018b8.j jVar, p048e8.n nVar, p247y7.O o6) {
                super(0);
                this.f24312D = jVar;
                this.f24313E = nVar;
                this.f24314F = o6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p198t8.g b() {
                return this.f24312D.w().a().g().a(this.f24313E, (O7.U) this.f24314F.f57254C);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(p048e8.n nVar, p247y7.O o6) {
            super(0);
            this.f24310E = nVar;
            this.f24311F = o6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E8.j b() {
            return p018b8.j.this.w().e().f(new b8.j.l.a(p018b8.j.this, this.f24310E, this.f24311F));
        }
    }

    static final class m extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b8.j.m f24315D = new b8.j.m();

        m() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1420a l(O7.Z z6) {
            p247y7.AbstractC7350t.f(z6, "$this$selectMostSpecificInEachOverridableGroup");
            return z6;
        }
    }

    public j(p008a8.g gVar, p018b8.j jVar) {
        p247y7.AbstractC7350t.f(gVar, "c");
        this.f24281b = gVar;
        this.f24282c = jVar;
        this.f24283d = gVar.e().e(new b8.j.c(), p097j7.AbstractC6879v.m());
        this.f24284e = gVar.e().d(new b8.j.g());
        this.f24285f = gVar.e().b(new b8.j.f());
        this.f24286g = gVar.e().h(new b8.j.e());
        this.f24287h = gVar.e().b(new b8.j.i());
        this.f24288i = gVar.e().d(new b8.j.h());
        this.f24289j = gVar.e().d(new b8.j.k());
        this.f24290k = gVar.e().d(new b8.j.d());
        this.f24291l = gVar.e().b(new p018b8.j.C0464j());
    }

    public /* synthetic */ j(p008a8.g gVar, p018b8.j jVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, (i6 & 2) != 0 ? null : jVar);
    }

    private final java.util.Set A() {
        return (java.util.Set) E8.m.a(this.f24288i, this, f24280m[0]);
    }

    private final java.util.Set D() {
        return (java.util.Set) E8.m.a(this.f24289j, this, f24280m[1]);
    }

    private final F8.E E(p048e8.n nVar) {
        F8.E eO = this.f24281b.g().o(nVar.getType(), p028c8.b.b(F8.p0.COMMON, false, false, null, 7, null));
        if ((!L7.g.s0(eO) && !L7.g.v0(eO)) || !F(nVar) || !nVar.U()) {
            return eO;
        }
        F8.E eN = F8.q0.n(eO);
        p247y7.AbstractC7350t.e(eN, "makeNotNullable(...)");
        return eN;
    }

    private final boolean F(p048e8.n nVar) {
        return nVar.q() && nVar.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.U J(p048e8.n nVar) {
        p247y7.O o6 = new p247y7.O();
        R7.C cU = u(nVar);
        o6.f57254C = cU;
        cU.e1(null, null, null, null);
        ((R7.C) o6.f57254C).k1(E(nVar), p097j7.AbstractC6879v.m(), z(), null, p097j7.AbstractC6879v.m());
        O7.InterfaceC1432m interfaceC1432mC = C();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1432mC instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mC : null;
        if (interfaceC1424e != null) {
            p008a8.g gVar = this.f24281b;
            o6.f57254C = gVar.a().w().g(gVar, interfaceC1424e, (R7.C) o6.f57254C);
        }
        java.lang.Object obj = o6.f57254C;
        if (p178r8.f.K((O7.k0) obj, ((R7.C) obj).getType())) {
            ((R7.C) o6.f57254C).U0(new b8.j.l(nVar, o6));
        }
        this.f24281b.a().h().e(nVar, (O7.U) o6.f57254C);
        return (O7.U) o6.f57254C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(java.util.Set set) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : set) {
            java.lang.String strC = p068g8.y.c((O7.Z) obj, false, false, 2, null);
            java.lang.Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        for (java.util.List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                java.util.List list2 = list;
                java.util.Collection collectionA = p178r8.n.a(list2, b8.j.m.f24315D);
                set.removeAll(list2);
                set.addAll(collectionA);
            }
        }
    }

    private final R7.C u(p048e8.n nVar) {
        Z7.f fVarO1 = Z7.f.o1(C(), p008a8.e.a(this.f24281b, nVar), O7.D.FINAL, X7.J.d(nVar.h()), !nVar.q(), nVar.getName(), this.f24281b.a().t().a(nVar), F(nVar));
        p247y7.AbstractC7350t.e(fVarO1, "create(...)");
        return fVarO1;
    }

    private final java.util.Set x() {
        return (java.util.Set) E8.m.a(this.f24290k, this, f24280m[2]);
    }

    protected final p018b8.j B() {
        return this.f24282c;
    }

    protected abstract O7.InterfaceC1432m C();

    protected boolean G(Z7.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "<this>");
        return true;
    }

    protected abstract b8.j.a H(p048e8.r rVar, java.util.List list, F8.E e6, java.util.List list2);

    protected final Z7.e I(p048e8.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "method");
        Z7.e eVarY1 = Z7.e.y1(C(), p008a8.e.a(this.f24281b, rVar), rVar.getName(), this.f24281b.a().t().a(rVar), ((p018b8.b) this.f24284e.b()).b(rVar.getName()) != null && rVar.n().isEmpty());
        p247y7.AbstractC7350t.e(eVarY1, "createJavaMethod(...)");
        p008a8.g gVarF = p008a8.a.f(this.f24281b, eVarY1, rVar, 0, 4, null);
        java.util.List listG = rVar.g();
        java.util.List arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listG, 10));
        java.util.Iterator it = listG.iterator();
        while (it.hasNext()) {
            O7.f0 f0VarA = gVarF.f().a((p048e8.y) it.next());
            p247y7.AbstractC7350t.c(f0VarA);
            arrayList.add(f0VarA);
        }
        b8.j.b bVarK = K(gVarF, eVarY1, rVar.n());
        b8.j.a aVarH = H(rVar, arrayList, q(rVar, gVarF), bVarK.a());
        F8.E eC = aVarH.c();
        eVarY1.x1(eC != null ? p178r8.e.i(eVarY1, eC, P7.g.f8385d.b()) : null, z(), p097j7.AbstractC6879v.m(), aVarH.e(), aVarH.f(), aVarH.d(), O7.D.f8107C.a(false, rVar.N(), !rVar.q()), X7.J.d(rVar.h()), aVarH.c() != null ? p097j7.S.e(p087i7.B.a(Z7.e.f16712i0, p097j7.AbstractC6879v.i0(bVarK.a()))) : p097j7.S.h());
        eVarY1.B1(aVarH.b(), bVarK.b());
        if (!aVarH.a().isEmpty()) {
            gVarF.a().s().a(eVarY1, aVarH.a());
        }
        return eVarY1;
    }

    protected final b8.j.b K(p008a8.g gVar, O7.InterfaceC1443y interfaceC1443y, java.util.List list) {
        p087i7.u uVarA;
        p138n8.f name;
        p008a8.g gVar2 = gVar;
        p247y7.AbstractC7350t.f(gVar2, "c");
        p247y7.AbstractC7350t.f(interfaceC1443y, "function");
        p247y7.AbstractC7350t.f(list, "jValueParameters");
        java.lang.Iterable<p097j7.L> iterableA1 = p097j7.AbstractC6879v.a1(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterableA1, 10));
        boolean z6 = false;
        for (p097j7.L l6 : iterableA1) {
            int iA = l6.a();
            p048e8.B b6 = (p048e8.B) l6.b();
            P7.g gVarA = p008a8.e.a(gVar2, b6);
            p028c8.a aVarB = p028c8.b.b(F8.p0.COMMON, false, false, null, 7, null);
            if (b6.m()) {
                p048e8.x type = b6.getType();
                p048e8.f fVar = type instanceof p048e8.f ? (p048e8.f) type : null;
                if (fVar == null) {
                    throw new java.lang.AssertionError("Vararg parameter should be an array: " + b6);
                }
                F8.E eK = gVar.g().k(fVar, aVarB, true);
                uVarA = p087i7.B.a(eK, gVar.d().t().k(eK));
            } else {
                uVarA = p087i7.B.a(gVar.g().o(b6.getType(), aVarB), null);
            }
            F8.E e6 = (F8.E) uVarA.a();
            F8.E e10 = (F8.E) uVarA.b();
            if (p247y7.AbstractC7350t.b(interfaceC1443y.getName().g(), "equals") && list.size() == 1 && p247y7.AbstractC7350t.b(gVar.d().t().I(), e6)) {
                name = p138n8.f.o("other");
            } else {
                name = b6.getName();
                if (name == null) {
                    z6 = true;
                }
                if (name == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append('p');
                    sb.append(iA);
                    name = p138n8.f.o(sb.toString());
                    p247y7.AbstractC7350t.e(name, "identifier(...)");
                }
            }
            boolean z10 = z6;
            p138n8.f fVar2 = name;
            p247y7.AbstractC7350t.c(fVar2);
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new R7.L(interfaceC1443y, null, iA, gVarA, fVar2, e6, false, false, false, e10, gVar.a().t().a(b6)));
            arrayList = arrayList2;
            z6 = z10;
            gVar2 = gVar;
        }
        return new b8.j.b(p097j7.AbstractC6879v.T0(arrayList), z6);
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set a() {
        return A();
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return (java.util.Collection) (!a().contains(fVar) ? p097j7.AbstractC6879v.m() : this.f24287h.l(fVar));
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return (java.util.Collection) (!d().contains(fVar) ? p097j7.AbstractC6879v.m() : this.f24291l.l(fVar));
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set d() {
        return D();
    }

    @Override // p248y8.i, p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return (java.util.Collection) this.f24283d.b();
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set f() {
        return x();
    }

    protected abstract java.util.Set l(p248y8.d dVar, p237x7.l lVar);

    protected final java.util.List m(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        W7.d dVar2 = W7.d.WHEN_GET_ALL_DESCRIPTORS;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (dVar.a(p248y8.d.f57315c.c())) {
            for (p138n8.f fVar : l(dVar, lVar)) {
                if (((java.lang.Boolean) lVar.l(fVar)).booleanValue()) {
                    P8.a.a(linkedHashSet, g(fVar, dVar2));
                }
            }
        }
        if (dVar.a(p248y8.d.f57315c.d()) && !dVar.l().contains(y8.c.a.f57312a)) {
            for (p138n8.f fVar2 : n(dVar, lVar)) {
                if (((java.lang.Boolean) lVar.l(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(b(fVar2, dVar2));
                }
            }
        }
        if (dVar.a(p248y8.d.f57315c.i()) && !dVar.l().contains(y8.c.a.f57312a)) {
            for (p138n8.f fVar3 : t(dVar, lVar)) {
                if (((java.lang.Boolean) lVar.l(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, dVar2));
                }
            }
        }
        return p097j7.AbstractC6879v.T0(linkedHashSet);
    }

    protected abstract java.util.Set n(p248y8.d dVar, p237x7.l lVar);

    protected void o(java.util.Collection collection, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(fVar, "name");
    }

    protected abstract p018b8.b p();

    protected final F8.E q(p048e8.r rVar, p008a8.g gVar) {
        p247y7.AbstractC7350t.f(rVar, "method");
        p247y7.AbstractC7350t.f(gVar, "c");
        return gVar.g().o(rVar.l(), p028c8.b.b(F8.p0.COMMON, rVar.V().t(), false, null, 6, null));
    }

    protected abstract void r(java.util.Collection collection, p138n8.f fVar);

    protected abstract void s(p138n8.f fVar, java.util.Collection collection);

    protected abstract java.util.Set t(p248y8.d dVar, p237x7.l lVar);

    public java.lang.String toString() {
        return "Lazy scope for " + C();
    }

    protected final E8.i v() {
        return this.f24283d;
    }

    protected final p008a8.g w() {
        return this.f24281b;
    }

    protected final E8.i y() {
        return this.f24284e;
    }

    protected abstract O7.X z();
}
