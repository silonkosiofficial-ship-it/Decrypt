package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p018b8.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p048e8.g f24317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Z7.c f24318o;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b8.l.a f24319D = new b8.l.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p048e8.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "it");
            return java.lang.Boolean.valueOf(qVar.W());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p138n8.f f24320D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p138n8.f fVar) {
            super(1);
            this.f24320D = fVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p248y8.h hVar) {
            p247y7.AbstractC7350t.f(hVar, "it");
            return hVar.c(this.f24320D, W7.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b8.l.c f24321D = new b8.l.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p248y8.h hVar) {
            p247y7.AbstractC7350t.f(hVar, "it");
            return hVar.d();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b8.l.d f24322D = new b8.l.d();

        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e l(F8.E e6) {
            O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
            if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
                return (O7.InterfaceC1424e) interfaceC1427hW;
            }
            return null;
        }
    }

    public static final class e extends P8.b.AbstractC0201b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1424e f24323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.Set f24324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p237x7.l f24325c;

        e(O7.InterfaceC1424e interfaceC1424e, java.util.Set set, p237x7.l lVar) {
            this.f24323a = interfaceC1424e;
            this.f24324b = set;
            this.f24325c = lVar;
        }

        @Override // P8.b.d
        public /* bridge */ /* synthetic */ java.lang.Object a() {
            e();
            return p087i7.M.f46721a;
        }

        @Override // P8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(O7.InterfaceC1424e interfaceC1424e) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "current");
            if (interfaceC1424e == this.f24323a) {
                return true;
            }
            p248y8.h hVarY = interfaceC1424e.Y();
            p247y7.AbstractC7350t.e(hVarY, "getStaticScope(...)");
            if (!(hVarY instanceof p018b8.m)) {
                return true;
            }
            this.f24324b.addAll((java.util.Collection) this.f24325c.l(hVarY));
            return false;
        }

        public void e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p008a8.g gVar, p048e8.g gVar2, Z7.c cVar) {
        super(gVar);
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(gVar2, "jClass");
        p247y7.AbstractC7350t.f(cVar, "ownerDescriptor");
        this.f24317n = gVar2;
        this.f24318o = cVar;
    }

    private final java.util.Set O(O7.InterfaceC1424e interfaceC1424e, java.util.Set set, p237x7.l lVar) {
        P8.b.b(p097j7.AbstractC6879v.e(interfaceC1424e), p018b8.k.f24316a, new b8.l.e(interfaceC1424e, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable P(O7.InterfaceC1424e interfaceC1424e) {
        java.util.Collection collectionU = interfaceC1424e.p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        return R8.k.t(R8.k.H(p097j7.AbstractC6879v.Y(collectionU), b8.l.d.f24322D));
    }

    private final O7.U R(O7.U u6) {
        if (u6.j().e()) {
            return u6;
        }
        java.util.Collection collectionF = u6.f();
        p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
        java.util.Collection<O7.U> collection = collectionF;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection, 10));
        for (O7.U u10 : collection) {
            p247y7.AbstractC7350t.c(u10);
            arrayList.add(R(u10));
        }
        return (O7.U) p097j7.AbstractC6879v.G0(p097j7.AbstractC6879v.b0(arrayList));
    }

    private final java.util.Set S(p138n8.f fVar, O7.InterfaceC1424e interfaceC1424e) {
        p018b8.l lVarB = Z7.h.b(interfaceC1424e);
        return lVarB == null ? p097j7.Z.d() : p097j7.AbstractC6879v.Y0(lVarB.b(fVar, W7.d.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p018b8.j
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public p018b8.a p() {
        return new p018b8.a(this.f24317n, b8.l.a.f24319D);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p018b8.j
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Z7.c C() {
        return this.f24318o;
    }

    @Override // p248y8.i, p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return null;
    }

    @Override // p018b8.j
    protected java.util.Set l(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        return p097j7.Z.d();
    }

    @Override // p018b8.j
    protected java.util.Set n(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        java.util.Set setX0 = p097j7.AbstractC6879v.X0(((p018b8.b) y().b()).a());
        p018b8.l lVarB = Z7.h.b(C());
        java.util.Set setA = lVarB != null ? lVarB.a() : null;
        if (setA == null) {
            setA = p097j7.Z.d();
        }
        setX0.addAll(setA);
        if (this.f24317n.F()) {
            setX0.addAll(p097j7.AbstractC6879v.p(L7.j.f6306f, L7.j.f6304d));
        }
        setX0.addAll(w().a().w().c(w(), C()));
        return setX0;
    }

    @Override // p018b8.j
    protected void o(java.util.Collection collection, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(fVar, "name");
        w().a().w().b(w(), C(), fVar, collection);
    }

    @Override // p018b8.j
    protected void r(java.util.Collection collection, p138n8.f fVar) {
        O7.Z zH;
        java.lang.String str;
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(fVar, "name");
        java.util.Collection collectionE = Y7.a.e(fVar, S(fVar, C()), collection, C(), w().a().c(), w().a().k().a());
        p247y7.AbstractC7350t.e(collectionE, "resolveOverridesForStaticMembers(...)");
        collection.addAll(collectionE);
        if (this.f24317n.F()) {
            if (p247y7.AbstractC7350t.b(fVar, L7.j.f6306f)) {
                zH = p178r8.e.g(C());
                str = "createEnumValueOfMethod(...)";
            } else {
                if (!p247y7.AbstractC7350t.b(fVar, L7.j.f6304d)) {
                    return;
                }
                zH = p178r8.e.h(C());
                str = "createEnumValuesMethod(...)";
            }
            p247y7.AbstractC7350t.e(zH, str);
            collection.add(zH);
        }
    }

    @Override // p018b8.m, p018b8.j
    protected void s(p138n8.f fVar, java.util.Collection collection) {
        java.util.Collection arrayList;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(collection, "result");
        java.util.Set setO = O(C(), new java.util.LinkedHashSet(), new b8.l.b(fVar));
        if (!collection.isEmpty()) {
            arrayList = Y7.a.e(fVar, setO, collection, C(), w().a().c(), w().a().k().a());
            p247y7.AbstractC7350t.e(arrayList, "resolveOverridesForStaticMembers(...)");
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : setO) {
                O7.U uR = R((O7.U) obj);
                java.lang.Object arrayList2 = linkedHashMap.get(uR);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(uR, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Collection collectionE = Y7.a.e(fVar, (java.util.Collection) ((java.util.Map.Entry) it.next()).getValue(), collection, C(), w().a().c(), w().a().k().a());
                p247y7.AbstractC7350t.e(collectionE, "resolveOverridesForStaticMembers(...)");
                p097j7.AbstractC6879v.C(arrayList, collectionE);
            }
        }
        collection.addAll(arrayList);
        if (this.f24317n.F() && p247y7.AbstractC7350t.b(fVar, L7.j.f6305e)) {
            P8.a.a(collection, p178r8.e.f(C()));
        }
    }

    @Override // p018b8.j
    protected java.util.Set t(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        java.util.Set setX0 = p097j7.AbstractC6879v.X0(((p018b8.b) y().b()).f());
        O(C(), setX0, b8.l.c.f24321D);
        if (this.f24317n.F()) {
            setX0.add(L7.j.f6305e);
        }
        return setX0;
    }
}
