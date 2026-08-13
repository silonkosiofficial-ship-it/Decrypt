package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p018b8.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O7.InterfaceC1424e f24232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p048e8.g f24233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f24234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final E8.i f24235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final E8.i f24236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final E8.i f24237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final E8.i f24238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final E8.h f24239u;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b8.g.a f24240D = new b8.g.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p048e8.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "it");
            return java.lang.Boolean.valueOf(!qVar.W());
        }
    }

    /* synthetic */ class b extends p247y7.AbstractC7347p implements p237x7.l {
        b(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(p018b8.g.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "p0");
            return ((p018b8.g) this.f57287D).J0(fVar);
        }
    }

    /* synthetic */ class c extends p247y7.AbstractC7347p implements p237x7.l {
        c(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(p018b8.g.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "p0");
            return ((p018b8.g) this.f57287D).K0(fVar);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "it");
            return p018b8.g.this.J0(fVar);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "it");
            return p018b8.g.this.K0(fVar);
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p008a8.g f24244E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p008a8.g gVar) {
            super(0);
            this.f24244E = gVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.Collection collectionR = p018b8.g.this.f24233o.r();
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionR.size());
            java.util.Iterator it = collectionR.iterator();
            while (it.hasNext()) {
                arrayList.add(p018b8.g.this.H0((p048e8.k) it.next()));
            }
            if (p018b8.g.this.f24233o.w()) {
                O7.InterfaceC1423d interfaceC1423dF0 = p018b8.g.this.f0();
                java.lang.String strC = p068g8.y.c(interfaceC1423dF0, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            arrayList.add(interfaceC1423dF0);
                            this.f24244E.a().h().a(p018b8.g.this.f24233o, interfaceC1423dF0);
                            break;
                        }
                    } while (!p247y7.AbstractC7350t.b(p068g8.y.c((O7.InterfaceC1423d) it2.next(), false, false, 2, null), strC));
                } else {
                    arrayList.add(interfaceC1423dF0);
                    this.f24244E.a().h().a(p018b8.g.this.f24233o, interfaceC1423dF0);
                    break;
                }
            }
            p008a8.g gVar = this.f24244E;
            gVar.a().w().h(gVar, p018b8.g.this.C(), arrayList);
            p058f8.l lVarR = this.f24244E.a().r();
            p008a8.g gVar2 = this.f24244E;
            p018b8.g gVar3 = p018b8.g.this;
            boolean zIsEmpty = arrayList.isEmpty();
            java.util.List listQ = arrayList;
            if (zIsEmpty) {
                listQ = p097j7.AbstractC6879v.q(gVar3.e0());
            }
            return p097j7.AbstractC6879v.T0(lVarR.g(gVar2, listQ));
        }
    }

    /* JADX INFO: renamed from: b8.g$g, reason: collision with other inner class name */
    static final class C0462g extends p247y7.AbstractC7352v implements p237x7.a {
        C0462g() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            java.util.Collection collectionH = p018b8.g.this.f24233o.H();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionH) {
                if (((p048e8.n) obj).L()) {
                    arrayList.add(obj);
                }
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(arrayList, 10)), 16));
            for (java.lang.Object obj2 : arrayList) {
                linkedHashMap.put(((p048e8.n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p008a8.g f24246D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p018b8.g f24247E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p008a8.g gVar, p018b8.g gVar2) {
            super(0);
            this.f24246D = gVar;
            this.f24247E = gVar2;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set b() {
            p008a8.g gVar = this.f24246D;
            return p097j7.AbstractC6879v.Y0(gVar.a().w().d(gVar, this.f24247E.C()));
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.Z f24248D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p018b8.g f24249E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(O7.Z z6, p018b8.g gVar) {
            super(1);
            this.f24248D = z6;
            this.f24249E = gVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "accessorName");
            return p247y7.AbstractC7350t.b(this.f24248D.getName(), fVar) ? p097j7.AbstractC6879v.e(this.f24248D) : p097j7.AbstractC6879v.C0(this.f24249E.J0(fVar), this.f24249E.K0(fVar));
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.a {
        j() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set b() {
            return p097j7.AbstractC6879v.Y0(p018b8.g.this.f24233o.Q());
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p008a8.g f24252E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p018b8.g f24253D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p018b8.g gVar) {
                super(0);
                this.f24253D = gVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.Set b() {
                return p097j7.Z.j(this.f24253D.a(), this.f24253D.d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(p008a8.g gVar) {
            super(1);
            this.f24252E = gVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            if (((java.util.Set) p018b8.g.this.f24236r.b()).contains(fVar)) {
                X7.p pVarD = this.f24252E.a().d();
                p138n8.b bVarK = p218v8.c.k(p018b8.g.this.C());
                p247y7.AbstractC7350t.c(bVarK);
                p138n8.b bVarD = bVarK.d(fVar);
                p247y7.AbstractC7350t.e(bVarD, "createNestedClassId(...)");
                p048e8.g gVarB = pVarD.b(new X7.p.a(bVarD, null, p018b8.g.this.f24233o, 2, null));
                if (gVarB == null) {
                    return null;
                }
                p008a8.g gVar = this.f24252E;
                p018b8.f fVar2 = new p018b8.f(gVar, p018b8.g.this.C(), gVarB, null, 8, null);
                gVar.a().e().a(fVar2);
                return fVar2;
            }
            if (!((java.util.Set) p018b8.g.this.f24237s.b()).contains(fVar)) {
                p048e8.n nVar = (p048e8.n) ((java.util.Map) p018b8.g.this.f24238t.b()).get(fVar);
                if (nVar == null) {
                    return null;
                }
                return R7.C1508n.U0(this.f24252E.e(), p018b8.g.this.C(), fVar, this.f24252E.e().d(new b8.g.k.a(p018b8.g.this)), p008a8.e.a(this.f24252E, nVar), this.f24252E.a().t().a(nVar));
            }
            p008a8.g gVar2 = this.f24252E;
            p018b8.g gVar3 = p018b8.g.this;
            java.util.List listC = p097j7.AbstractC6879v.c();
            gVar2.a().w().e(gVar2, gVar3.C(), fVar, listC);
            java.util.List listA = p097j7.AbstractC6879v.a(listC);
            int size = listA.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (O7.InterfaceC1424e) p097j7.AbstractC6879v.G0(listA);
            }
            throw new java.lang.IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, p048e8.g gVar2, boolean z6, p018b8.g gVar3) {
        super(gVar, gVar3);
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(interfaceC1424e, "ownerDescriptor");
        p247y7.AbstractC7350t.f(gVar2, "jClass");
        this.f24232n = interfaceC1424e;
        this.f24233o = gVar2;
        this.f24234p = z6;
        this.f24235q = gVar.e().d(new b8.g.f(gVar));
        this.f24236r = gVar.e().d(new b8.g.j());
        this.f24237s = gVar.e().d(new b8.g.h(gVar, this));
        this.f24238t = gVar.e().d(new p018b8.g.C0462g());
        this.f24239u = gVar.e().h(new b8.g.k(gVar));
    }

    public /* synthetic */ g(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, p048e8.g gVar2, boolean z6, p018b8.g gVar3, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, interfaceC1424e, gVar2, z6, (i6 & 16) != 0 ? null : gVar3);
    }

    private final java.util.Set A0(p138n8.f fVar) {
        java.util.Collection collectionC0 = c0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            java.util.Collection collectionC = ((F8.E) it.next()).u().c(fVar, W7.d.WHEN_GET_SUPER_MEMBERS);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionC, 10));
            java.util.Iterator it2 = collectionC.iterator();
            while (it2.hasNext()) {
                arrayList2.add((O7.U) it2.next());
            }
            p097j7.AbstractC6879v.C(arrayList, arrayList2);
        }
        return p097j7.AbstractC6879v.Y0(arrayList);
    }

    private final boolean B0(O7.Z z6, O7.InterfaceC1443y interfaceC1443y) {
        java.lang.String strC = p068g8.y.c(z6, false, false, 2, null);
        O7.InterfaceC1443y interfaceC1443yA = interfaceC1443y.a();
        p247y7.AbstractC7350t.e(interfaceC1443yA, "getOriginal(...)");
        return p247y7.AbstractC7350t.b(strC, p068g8.y.c(interfaceC1443yA, false, false, 2, null)) && !p0(z6, interfaceC1443y);
    }

    private final boolean C0(O7.Z z6) {
        p138n8.f name = z6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        java.util.List listA = X7.F.a(name);
        if (!(listA instanceof java.util.Collection) || !listA.isEmpty()) {
            java.util.Iterator it = listA.iterator();
            while (it.hasNext()) {
                java.util.Set<O7.U> setA0 = A0((p138n8.f) it.next());
                if (!(setA0 instanceof java.util.Collection) || !setA0.isEmpty()) {
                    for (O7.U u6 : setA0) {
                        if (o0(u6, new b8.g.i(z6, this))) {
                            if (!u6.t0()) {
                                java.lang.String strG = z6.getName().g();
                                p247y7.AbstractC7350t.e(strG, "asString(...)");
                                if (!X7.A.d(strG)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (q0(z6) || L0(z6) || s0(z6)) ? false : true;
    }

    private final O7.Z D0(O7.Z z6, p237x7.l lVar, java.util.Collection collection) {
        O7.Z zH0;
        O7.InterfaceC1443y interfaceC1443yK = X7.C1828f.k(z6);
        if (interfaceC1443yK == null || (zH0 = h0(interfaceC1443yK, lVar)) == null) {
            return null;
        }
        if (!C0(zH0)) {
            zH0 = null;
        }
        if (zH0 != null) {
            return g0(zH0, interfaceC1443yK, collection);
        }
        return null;
    }

    private final O7.Z E0(O7.Z z6, p237x7.l lVar, p138n8.f fVar, java.util.Collection collection) {
        O7.Z z10 = (O7.Z) X7.H.d(z6);
        if (z10 == null) {
            return null;
        }
        java.lang.String strB = X7.H.b(z10);
        p247y7.AbstractC7350t.c(strB);
        p138n8.f fVarO = p138n8.f.o(strB);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        java.util.Iterator it = ((java.util.Collection) lVar.l(fVarO)).iterator();
        while (it.hasNext()) {
            O7.Z zM0 = m0((O7.Z) it.next(), fVar);
            if (r0(z10, zM0)) {
                return g0(zM0, z10, collection);
            }
        }
        return null;
    }

    private final O7.Z F0(O7.Z z6, p237x7.l lVar) {
        if (!z6.y()) {
            return null;
        }
        p138n8.f name = z6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        java.util.Iterator it = ((java.lang.Iterable) lVar.l(name)).iterator();
        while (it.hasNext()) {
            O7.Z zN0 = n0((O7.Z) it.next());
            if (zN0 == null || !p0(zN0, z6)) {
                zN0 = null;
            }
            if (zN0 != null) {
                return zN0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z7.b H0(p048e8.k kVar) {
        O7.InterfaceC1424e interfaceC1424eC = C();
        Z7.b bVarC1 = Z7.b.C1(interfaceC1424eC, p008a8.e.a(w(), kVar), false, w().a().t().a(kVar));
        p247y7.AbstractC7350t.e(bVarC1, "createJavaConstructor(...)");
        p008a8.g gVarE = p008a8.a.e(w(), bVarC1, kVar, interfaceC1424eC.A().size());
        b8.j.b bVarK = K(gVarE, bVarC1, kVar.n());
        java.util.List listA = interfaceC1424eC.A();
        p247y7.AbstractC7350t.e(listA, "getDeclaredTypeParameters(...)");
        java.util.List list = listA;
        java.util.List listG = kVar.g();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listG, 10));
        java.util.Iterator it = listG.iterator();
        while (it.hasNext()) {
            O7.f0 f0VarA = gVarE.f().a((p048e8.y) it.next());
            p247y7.AbstractC7350t.c(f0VarA);
            arrayList.add(f0VarA);
        }
        bVarC1.A1(bVarK.a(), X7.J.d(kVar.h()), p097j7.AbstractC6879v.C0(list, arrayList));
        bVarC1.h1(false);
        bVarC1.i1(bVarK.b());
        bVarC1.p1(interfaceC1424eC.w());
        gVarE.a().h().a(kVar, bVarC1);
        return bVarC1;
    }

    private final Z7.e I0(p048e8.w wVar) {
        Z7.e eVarY1 = Z7.e.y1(C(), p008a8.e.a(w(), wVar), wVar.getName(), w().a().t().a(wVar), true);
        p247y7.AbstractC7350t.e(eVarY1, "createJavaMethod(...)");
        eVarY1.x1(null, z(), p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.m(), w().g().o(wVar.getType(), p028c8.b.b(F8.p0.COMMON, false, false, null, 6, null)), O7.D.f8107C.a(false, false, true), O7.AbstractC1438t.f8186e, null);
        eVarY1.B1(false, false);
        w().a().h().b(wVar, eVarY1);
        return eVarY1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection J0(p138n8.f fVar) {
        java.util.Collection collectionD = ((p018b8.b) y().b()).d(fVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionD, 10));
        java.util.Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(I((p048e8.r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection K0(p138n8.f fVar) {
        java.util.Set setY0 = y0(fVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setY0) {
            O7.Z z6 = (O7.Z) obj;
            if (!X7.H.a(z6) && X7.C1828f.k(z6) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean L0(O7.Z z6) {
        X7.C1828f c1828f = X7.C1828f.f16011o;
        p138n8.f name = z6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        if (!c1828f.l(name)) {
            return false;
        }
        p138n8.f name2 = z6.getName();
        p247y7.AbstractC7350t.e(name2, "getName(...)");
        java.util.Set setY0 = y0(name2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = setY0.iterator();
        while (it.hasNext()) {
            O7.InterfaceC1443y interfaceC1443yK = X7.C1828f.k((O7.Z) it.next());
            if (interfaceC1443yK != null) {
                arrayList.add(interfaceC1443yK);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (B0(z6, (O7.InterfaceC1443y) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void V(java.util.List list, O7.InterfaceC1431l interfaceC1431l, int i6, p048e8.r rVar, F8.E e6, F8.E e10) {
        P7.g gVarB = P7.g.f8385d.b();
        p138n8.f name = rVar.getName();
        F8.E eN = F8.q0.n(e6);
        p247y7.AbstractC7350t.e(eN, "makeNotNullable(...)");
        list.add(new R7.L(interfaceC1431l, null, i6, gVarB, name, eN, rVar.R(), false, false, e10 != null ? F8.q0.n(e10) : null, w().a().t().a(rVar)));
    }

    private final void W(java.util.Collection collection, p138n8.f fVar, java.util.Collection collection2, boolean z6) {
        java.util.Collection collectionD = Y7.a.d(fVar, collection2, collection, C(), w().a().c(), w().a().k().a());
        p247y7.AbstractC7350t.e(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z6) {
            collection.addAll(collectionD);
            return;
        }
        java.util.Collection<O7.Z> collection3 = collectionD;
        java.util.List listC0 = p097j7.AbstractC6879v.C0(collection, collection3);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection3, 10));
        for (O7.Z zG0 : collection3) {
            O7.Z z10 = (O7.Z) X7.H.e(zG0);
            p247y7.AbstractC7350t.c(zG0);
            if (z10 != null) {
                zG0 = g0(zG0, z10, listC0);
            }
            arrayList.add(zG0);
        }
        collection.addAll(arrayList);
    }

    private final void X(p138n8.f fVar, java.util.Collection collection, java.util.Collection collection2, java.util.Collection collection3, p237x7.l lVar) {
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            O7.Z z6 = (O7.Z) it.next();
            P8.a.a(collection3, E0(z6, lVar, fVar, collection));
            P8.a.a(collection3, D0(z6, lVar, collection));
            P8.a.a(collection3, F0(z6, lVar));
        }
    }

    private final void Y(java.util.Set set, java.util.Collection collection, java.util.Set set2, p237x7.l lVar) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            O7.U u6 = (O7.U) it.next();
            Z7.f fVarI0 = i0(u6, lVar);
            if (fVarI0 != null) {
                collection.add(fVarI0);
                if (set2 != null) {
                    set2.add(u6);
                    return;
                }
                return;
            }
        }
    }

    private final void Z(p138n8.f fVar, java.util.Collection collection) {
        p048e8.r rVar = (p048e8.r) p097j7.AbstractC6879v.H0(((p018b8.b) y().b()).d(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(k0(this, rVar, null, O7.D.FINAL, 2, null));
    }

    private final java.util.Collection c0() {
        if (!this.f24234p) {
            return w().a().k().c().g(C());
        }
        java.util.Collection collectionU = C().p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        return collectionU;
    }

    private final java.util.List d0(R7.C1500f c1500f) {
        p087i7.u uVar;
        java.util.Collection collectionS = this.f24233o.S();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionS.size());
        p028c8.a aVarB = p028c8.b.b(F8.p0.COMMON, true, false, null, 6, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : collectionS) {
            if (p247y7.AbstractC7350t.b(((p048e8.r) obj).getName(), X7.B.f15898c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        p087i7.u uVar2 = new p087i7.u(arrayList2, arrayList3);
        java.util.List list = (java.util.List) uVar2.a();
        java.util.List<p048e8.r> list2 = (java.util.List) uVar2.b();
        list.size();
        p048e8.r rVar = (p048e8.r) p097j7.AbstractC6879v.k0(list);
        if (rVar != null) {
            p048e8.x xVarL = rVar.l();
            if (xVarL instanceof p048e8.f) {
                p048e8.f fVar = (p048e8.f) xVarL;
                uVar = new p087i7.u(w().g().k(fVar, aVarB, true), w().g().o(fVar.p(), aVarB));
            } else {
                uVar = new p087i7.u(w().g().o(xVarL, aVarB), null);
            }
            V(arrayList, c1500f, 0, rVar, (F8.E) uVar.a(), (F8.E) uVar.b());
        }
        int i6 = 0;
        int i10 = rVar == null ? 0 : 1;
        for (p048e8.r rVar2 : list2) {
            V(arrayList, c1500f, i6 + i10, rVar2, w().g().o(rVar2.l(), aVarB), null);
            i6++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1423d e0() {
        boolean zT = this.f24233o.t();
        if ((this.f24233o.M() || !this.f24233o.y()) && !zT) {
            return null;
        }
        O7.InterfaceC1424e interfaceC1424eC = C();
        Z7.b bVarC1 = Z7.b.C1(interfaceC1424eC, P7.g.f8385d.b(), true, w().a().t().a(this.f24233o));
        p247y7.AbstractC7350t.e(bVarC1, "createJavaConstructor(...)");
        java.util.List listD0 = zT ? d0(bVarC1) : java.util.Collections.emptyList();
        bVarC1.i1(false);
        bVarC1.z1(listD0, w0(interfaceC1424eC));
        bVarC1.h1(true);
        bVarC1.p1(interfaceC1424eC.w());
        w().a().h().a(this.f24233o, bVarC1);
        return bVarC1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1423d f0() {
        O7.InterfaceC1424e interfaceC1424eC = C();
        Z7.b bVarC1 = Z7.b.C1(interfaceC1424eC, P7.g.f8385d.b(), true, w().a().t().a(this.f24233o));
        p247y7.AbstractC7350t.e(bVarC1, "createJavaConstructor(...)");
        java.util.List listL0 = l0(bVarC1);
        bVarC1.i1(false);
        bVarC1.z1(listL0, w0(interfaceC1424eC));
        bVarC1.h1(false);
        bVarC1.p1(interfaceC1424eC.w());
        return bVarC1;
    }

    private final O7.Z g0(O7.Z z6, O7.InterfaceC1420a interfaceC1420a, java.util.Collection collection) {
        java.util.Collection<O7.Z> collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return z6;
        }
        for (O7.Z z10 : collection2) {
            if (!p247y7.AbstractC7350t.b(z6, z10) && z10.l0() == null && p0(z10, interfaceC1420a)) {
                O7.InterfaceC1443y interfaceC1443yI = z6.z().A().i();
                p247y7.AbstractC7350t.c(interfaceC1443yI);
                return (O7.Z) interfaceC1443yI;
            }
        }
        return z6;
    }

    private final O7.Z h0(O7.InterfaceC1443y interfaceC1443y, p237x7.l lVar) {
        java.lang.Object next;
        p138n8.f name = interfaceC1443y.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        java.util.Iterator it = ((java.lang.Iterable) lVar.l(name)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!B0((O7.Z) next, interfaceC1443y));
        O7.Z z6 = (O7.Z) next;
        if (z6 == null) {
            return null;
        }
        O7.InterfaceC1443y.a aVarZ = z6.z();
        java.util.List listN = interfaceC1443y.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        java.util.List list = listN;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((O7.j0) it2.next()).getType());
        }
        java.util.List listN2 = z6.n();
        p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
        aVarZ.m(Z7.h.a(arrayList, listN2, interfaceC1443y));
        aVarZ.C();
        aVarZ.n();
        aVarZ.t(Z7.e.f16713j0, java.lang.Boolean.TRUE);
        return (O7.Z) aVarZ.i();
    }

    private final Z7.f i0(O7.U u6, p237x7.l lVar) {
        O7.Z zV0;
        R7.E eM = null;
        if (!o0(u6, lVar)) {
            return null;
        }
        O7.Z zU0 = u0(u6, lVar);
        p247y7.AbstractC7350t.c(zU0);
        if (u6.t0()) {
            zV0 = v0(u6, lVar);
            p247y7.AbstractC7350t.c(zV0);
        } else {
            zV0 = null;
        }
        if (zV0 != null) {
            zV0.q();
            zU0.q();
        }
        Z7.d dVar = new Z7.d(C(), zU0, zV0, u6);
        F8.E eL = zU0.l();
        p247y7.AbstractC7350t.c(eL);
        dVar.k1(eL, p097j7.AbstractC6879v.m(), z(), null, p097j7.AbstractC6879v.m());
        R7.D dK = p178r8.e.k(dVar, zU0.k(), false, false, false, zU0.o());
        dK.V0(zU0);
        dK.Y0(dVar.getType());
        p247y7.AbstractC7350t.e(dK, "apply(...)");
        if (zV0 != null) {
            java.util.List listN = zV0.n();
            p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
            O7.j0 j0Var = (O7.j0) p097j7.AbstractC6879v.k0(listN);
            if (j0Var == null) {
                throw new java.lang.AssertionError("No parameter found for " + zV0);
            }
            eM = p178r8.e.m(dVar, zV0.k(), j0Var.k(), false, false, false, zV0.h(), zV0.o());
            eM.V0(zV0);
        }
        dVar.d1(dK, eM);
        return dVar;
    }

    private final Z7.f j0(p048e8.r rVar, F8.E e6, O7.D d6) {
        Z7.f fVarO1 = Z7.f.o1(C(), p008a8.e.a(w(), rVar), d6, X7.J.d(rVar.h()), false, rVar.getName(), w().a().t().a(rVar), false);
        p247y7.AbstractC7350t.e(fVarO1, "create(...)");
        R7.D d10 = p178r8.e.d(fVarO1, P7.g.f8385d.b());
        p247y7.AbstractC7350t.e(d10, "createDefaultGetter(...)");
        fVarO1.d1(d10, null);
        F8.E eQ = e6 == null ? q(rVar, p008a8.a.f(w(), fVarO1, rVar, 0, 4, null)) : e6;
        fVarO1.k1(eQ, p097j7.AbstractC6879v.m(), z(), null, p097j7.AbstractC6879v.m());
        d10.Y0(eQ);
        return fVarO1;
    }

    static /* synthetic */ Z7.f k0(p018b8.g gVar, p048e8.r rVar, F8.E e6, O7.D d6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            e6 = null;
        }
        return gVar.j0(rVar, e6, d6);
    }

    private final java.util.List l0(R7.C1500f c1500f) {
        java.util.Collection collectionI = this.f24233o.i();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionI.size());
        p028c8.a aVarB = p028c8.b.b(F8.p0.COMMON, false, false, null, 6, null);
        java.util.Iterator it = collectionI.iterator();
        int i6 = 0;
        while (true) {
            int i10 = i6;
            if (!it.hasNext()) {
                return arrayList;
            }
            i6 = i10 + 1;
            p048e8.w wVar = (p048e8.w) it.next();
            F8.E eO = w().g().o(wVar.getType(), aVarB);
            arrayList.add(new R7.L(c1500f, null, i10, P7.g.f8385d.b(), wVar.getName(), eO, false, false, false, wVar.m() ? w().a().m().t().k(eO) : null, w().a().t().a(wVar)));
        }
    }

    private final O7.Z m0(O7.Z z6, p138n8.f fVar) {
        O7.InterfaceC1443y.a aVarZ = z6.z();
        aVarZ.s(fVar);
        aVarZ.C();
        aVarZ.n();
        O7.InterfaceC1443y interfaceC1443yI = aVarZ.i();
        p247y7.AbstractC7350t.c(interfaceC1443yI);
        return (O7.Z) interfaceC1443yI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    private final O7.Z n0(O7.Z z6) {
        p138n8.c cVarL;
        p138n8.d dVarM;
        java.util.List listN = z6.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        O7.j0 j0Var = (O7.j0) p097j7.AbstractC6879v.v0(listN);
        if (j0Var != null) {
            O7.InterfaceC1427h interfaceC1427hW = j0Var.getType().W0().w();
            if (interfaceC1427hW == null || (dVarM = p218v8.c.m(interfaceC1427hW)) == null) {
                cVarL = null;
            } else {
                if (!dVarM.f()) {
                    dVarM = null;
                }
                if (dVarM != null) {
                    cVarL = dVarM.l();
                } else {
                    cVarL = null;
                }
            }
            if (!p247y7.AbstractC7350t.b(cVarL, L7.j.f6320t)) {
                j0Var = null;
            }
            if (j0Var != null) {
                O7.InterfaceC1443y.a aVarZ = z6.z();
                java.util.List listN2 = z6.n();
                p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
                O7.Z z10 = (O7.Z) aVarZ.m(p097j7.AbstractC6879v.d0(listN2, 1)).q(((F8.i0) j0Var.getType().U0().get(0)).getType()).i();
                R7.G g6 = (R7.G) z10;
                if (g6 != null) {
                    g6.q1(true);
                }
                return z10;
            }
        }
        return null;
    }

    private final boolean o0(O7.U u6, p237x7.l lVar) {
        if (p018b8.c.a(u6)) {
            return false;
        }
        O7.Z zU0 = u0(u6, lVar);
        O7.Z zV0 = v0(u6, lVar);
        if (zU0 == null) {
            return false;
        }
        if (u6.t0()) {
            return zV0 != null && zV0.q() == zU0.q();
        }
        return true;
    }

    private final boolean p0(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
        r8.l.i.a aVarC = p178r8.l.f54007f.F(interfaceC1420a2, interfaceC1420a, true).c();
        p247y7.AbstractC7350t.e(aVarC, "getResult(...)");
        return aVarC == r8.l.i.a.OVERRIDABLE && !X7.t.f16039a.a(interfaceC1420a2, interfaceC1420a);
    }

    private final boolean q0(O7.Z z6) {
        X7.I.a aVar = X7.I.f15954a;
        p138n8.f name = z6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        p138n8.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        java.util.Set setY0 = y0(fVarB);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setY0) {
            if (X7.H.a((O7.Z) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        O7.Z zM0 = m0(z6, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (r0((O7.Z) it.next(), zM0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean r0(O7.Z z6, O7.InterfaceC1443y interfaceC1443y) {
        if (X7.C1827e.f16009o.k(z6)) {
            interfaceC1443y = interfaceC1443y.a();
        }
        p247y7.AbstractC7350t.c(interfaceC1443y);
        return p0(interfaceC1443y, z6);
    }

    private final boolean s0(O7.Z z6) {
        O7.Z zN0 = n0(z6);
        if (zN0 == null) {
            return false;
        }
        p138n8.f name = z6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        java.util.Set<O7.Z> setY0 = y0(name);
        if ((setY0 instanceof java.util.Collection) && setY0.isEmpty()) {
            return false;
        }
        for (O7.Z z10 : setY0) {
            if (z10.y() && p0(zN0, z10)) {
                return true;
            }
        }
        return false;
    }

    private final O7.Z t0(O7.U u6, java.lang.String str, p237x7.l lVar) {
        O7.Z z6;
        p138n8.f fVarO = p138n8.f.o(str);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        java.util.Iterator it = ((java.lang.Iterable) lVar.l(fVarO)).iterator();
        do {
            z6 = null;
            if (!it.hasNext()) {
                break;
            }
            O7.Z z10 = (O7.Z) it.next();
            if (z10.n().size() == 0) {
                G8.e eVar = G8.e.f3134a;
                F8.E eL = z10.l();
                if (eL == null ? false : eVar.d(eL, u6.getType())) {
                    z6 = z10;
                }
            }
        } while (z6 == null);
        return z6;
    }

    private final O7.Z u0(O7.U u6, p237x7.l lVar) {
        O7.V vD = u6.d();
        O7.V v6 = vD != null ? (O7.V) X7.H.d(vD) : null;
        java.lang.String strA = v6 != null ? X7.C1831i.f16020a.a(v6) : null;
        if (strA != null && !X7.H.f(C(), v6)) {
            return t0(u6, strA, lVar);
        }
        java.lang.String strG = u6.getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return t0(u6, X7.A.b(strG), lVar);
    }

    private final O7.Z v0(O7.U u6, p237x7.l lVar) {
        O7.Z z6;
        F8.E eL;
        java.lang.String strG = u6.getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        p138n8.f fVarO = p138n8.f.o(X7.A.e(strG));
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        java.util.Iterator it = ((java.lang.Iterable) lVar.l(fVarO)).iterator();
        do {
            z6 = null;
            if (!it.hasNext()) {
                break;
            }
            O7.Z z10 = (O7.Z) it.next();
            if (z10.n().size() == 1 && (eL = z10.l()) != null && L7.g.C0(eL)) {
                G8.e eVar = G8.e.f3134a;
                java.util.List listN = z10.n();
                p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                if (eVar.b(((O7.j0) p097j7.AbstractC6879v.G0(listN)).getType(), u6.getType())) {
                    z6 = z10;
                }
            }
        } while (z6 == null);
        return z6;
    }

    private final O7.AbstractC1439u w0(O7.InterfaceC1424e interfaceC1424e) {
        O7.AbstractC1439u abstractC1439uH = interfaceC1424e.h();
        p247y7.AbstractC7350t.e(abstractC1439uH, "getVisibility(...)");
        if (!p247y7.AbstractC7350t.b(abstractC1439uH, X7.s.f16036b)) {
            return abstractC1439uH;
        }
        O7.AbstractC1439u abstractC1439u = X7.s.f16037c;
        p247y7.AbstractC7350t.e(abstractC1439u, "PROTECTED_AND_PACKAGE");
        return abstractC1439u;
    }

    private final java.util.Set y0(p138n8.f fVar) {
        java.util.Collection collectionC0 = c0();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(linkedHashSet, ((F8.E) it.next()).u().b(fVar, W7.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // p018b8.j
    protected boolean G(Z7.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "<this>");
        if (this.f24233o.t()) {
            return false;
        }
        return C0(eVar);
    }

    public void G0(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        V7.a.a(w().a().l(), bVar, C(), fVar);
    }

    @Override // p018b8.j
    protected b8.j.a H(p048e8.r rVar, java.util.List list, F8.E e6, java.util.List list2) {
        p247y7.AbstractC7350t.f(rVar, "method");
        p247y7.AbstractC7350t.f(list, "methodTypeParameters");
        p247y7.AbstractC7350t.f(e6, "returnType");
        p247y7.AbstractC7350t.f(list2, "valueParameters");
        Y7.j.b bVarB = w().a().s().b(rVar, C(), e6, null, list2, list);
        p247y7.AbstractC7350t.e(bVarB, "resolvePropagatedSignature(...)");
        F8.E eD = bVarB.d();
        p247y7.AbstractC7350t.e(eD, "getReturnType(...)");
        F8.E eC = bVarB.c();
        java.util.List listF = bVarB.f();
        p247y7.AbstractC7350t.e(listF, "getValueParameters(...)");
        java.util.List listE = bVarB.e();
        p247y7.AbstractC7350t.e(listE, "getTypeParameters(...)");
        boolean zG = bVarB.g();
        java.util.List listB = bVarB.b();
        p247y7.AbstractC7350t.e(listB, "getErrors(...)");
        return new b8.j.a(eD, eC, listF, listE, zG, listB);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p018b8.j
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public java.util.LinkedHashSet n(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        java.util.Collection collectionU = C().p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(linkedHashSet, ((F8.E) it.next()).u().a());
        }
        linkedHashSet.addAll(((p018b8.b) y().b()).a());
        linkedHashSet.addAll(((p018b8.b) y().b()).e());
        linkedHashSet.addAll(l(dVar, lVar));
        linkedHashSet.addAll(w().a().w().f(w(), C()));
        return linkedHashSet;
    }

    @Override // p018b8.j, p248y8.i, p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        G0(fVar, bVar);
        return super.b(fVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p018b8.j
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public p018b8.a p() {
        return new p018b8.a(this.f24233o, b8.g.a.f24240D);
    }

    @Override // p018b8.j, p248y8.i, p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        G0(fVar, bVar);
        return super.c(fVar, bVar);
    }

    @Override // p248y8.i, p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        E8.h hVar;
        O7.InterfaceC1424e interfaceC1424e;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        G0(fVar, bVar);
        p018b8.g gVar = (p018b8.g) B();
        return (gVar == null || (hVar = gVar.f24239u) == null || (interfaceC1424e = (O7.InterfaceC1424e) hVar.l(fVar)) == null) ? (O7.InterfaceC1427h) this.f24239u.l(fVar) : interfaceC1424e;
    }

    @Override // p018b8.j
    protected java.util.Set l(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        return p097j7.Z.j((java.util.Set) this.f24236r.b(), ((java.util.Map) this.f24238t.b()).keySet());
    }

    @Override // p018b8.j
    protected void o(java.util.Collection collection, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(fVar, "name");
        if (this.f24233o.w() && ((p018b8.b) y().b()).b(fVar) != null) {
            java.util.Collection collection2 = collection;
            if (collection2.isEmpty()) {
                p048e8.w wVarB = ((p018b8.b) y().b()).b(fVar);
                p247y7.AbstractC7350t.c(wVarB);
                collection.add(I0(wVarB));
            } else {
                java.util.Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (((O7.Z) it.next()).n().isEmpty()) {
                    }
                }
                p048e8.w wVarB2 = ((p018b8.b) y().b()).b(fVar);
                p247y7.AbstractC7350t.c(wVarB2);
                collection.add(I0(wVarB2));
            }
        }
        w().a().w().a(w(), C(), fVar, collection);
    }

    @Override // p018b8.j
    protected void r(java.util.Collection collection, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(fVar, "name");
        java.util.Set setY0 = y0(fVar);
        if (!X7.I.f15954a.k(fVar) && !X7.C1828f.f16011o.l(fVar)) {
            java.util.Set set = setY0;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((O7.InterfaceC1443y) it.next()).y()) {
                        }
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                if (C0((O7.Z) obj)) {
                    arrayList.add(obj);
                }
            }
            W(collection, fVar, arrayList, false);
            return;
        }
        P8.g gVarA = P8.g.f8491E.a();
        java.util.Collection collectionD = Y7.a.d(fVar, setY0, p097j7.AbstractC6879v.m(), C(), B8.r.f922a, w().a().k().a());
        p247y7.AbstractC7350t.e(collectionD, "resolveOverridesForNonStaticMembers(...)");
        X(fVar, collection, collectionD, collection, new b8.g.b(this));
        X(fVar, collection, collectionD, gVarA, new b8.g.c(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : setY0) {
            if (C0((O7.Z) obj2)) {
                arrayList2.add(obj2);
            }
        }
        W(collection, fVar, p097j7.AbstractC6879v.C0(arrayList2, gVarA), true);
    }

    @Override // p018b8.j
    protected void s(p138n8.f fVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(collection, "result");
        if (this.f24233o.t()) {
            Z(fVar, collection);
        }
        java.util.Set setA0 = A0(fVar);
        if (setA0.isEmpty()) {
            return;
        }
        P8.g.b bVar = P8.g.f8491E;
        P8.g gVarA = bVar.a();
        P8.g gVarA2 = bVar.a();
        Y(setA0, collection, gVarA, new b8.g.d());
        Y(p097j7.Z.h(setA0, gVarA), gVarA2, null, new b8.g.e());
        java.util.Collection collectionD = Y7.a.d(fVar, p097j7.Z.j(setA0, gVarA2), collection, C(), w().a().c(), w().a().k().a());
        p247y7.AbstractC7350t.e(collectionD, "resolveOverridesForNonStaticMembers(...)");
        collection.addAll(collectionD);
    }

    @Override // p018b8.j
    protected java.util.Set t(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        if (this.f24233o.t()) {
            return a();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(((p018b8.b) y().b()).f());
        java.util.Collection collectionU = C().p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        java.util.Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(linkedHashSet, ((F8.E) it.next()).u().d());
        }
        return linkedHashSet;
    }

    @Override // p018b8.j
    public java.lang.String toString() {
        return "Lazy Java member scope for " + this.f24233o.e();
    }

    public final E8.i x0() {
        return this.f24235q;
    }

    @Override // p018b8.j
    protected O7.X z() {
        return p178r8.f.l(C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p018b8.j
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1424e C() {
        return this.f24232n;
    }
}
