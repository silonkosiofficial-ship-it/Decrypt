package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends R7.AbstractC1495a implements O7.InterfaceC1432m {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p088i8.c f1952H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p108k8.a f1953I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final O7.a0 f1954J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p138n8.b f1955K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final O7.D f1956L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final O7.AbstractC1439u f1957M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final O7.EnumC1425f f1958N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final B8.m f1959O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p248y8.i f1960P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final D8.d.b f1961Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final O7.Y f1962R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final D8.d.c f1963S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final O7.InterfaceC1432m f1964T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final E8.j f1965U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final E8.i f1966V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final E8.j f1967W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final E8.i f1968X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final E8.j f1969Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final B8.A.a f1970Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final P7.g f1971a0;

    private final class a extends D8.h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final G8.g f1972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final E8.i f1973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final E8.i f1974i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ D8.d f1975j;

        /* JADX INFO: renamed from: D8.d$a$a, reason: collision with other inner class name */
        static final class C0044a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.util.List f1976D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0044a(java.util.List list) {
                super(0);
                this.f1976D = list;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                return this.f1976D;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {
            b() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.Collection b() {
                return D8.d.a.this.j(p248y8.d.f57327o, p248y8.h.f57352a.a(), W7.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        public static final class c extends p178r8.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.util.List f1978a;

            c(java.util.List list) {
                this.f1978a = list;
            }

            @Override // p178r8.k
            public void a(O7.InterfaceC1421b interfaceC1421b) {
                p247y7.AbstractC7350t.f(interfaceC1421b, "fakeOverride");
                p178r8.l.K(interfaceC1421b, null);
                this.f1978a.add(interfaceC1421b);
            }

            @Override // p178r8.j
            protected void e(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2) {
                p247y7.AbstractC7350t.f(interfaceC1421b, "fromSuper");
                p247y7.AbstractC7350t.f(interfaceC1421b2, "fromCurrent");
                if (interfaceC1421b2 instanceof R7.p) {
                    ((R7.p) interfaceC1421b2).d1(O7.C1440v.f8199a, interfaceC1421b);
                }
            }
        }

        /* JADX INFO: renamed from: D8.d$a$d, reason: collision with other inner class name */
        static final class C0045d extends p247y7.AbstractC7352v implements p237x7.a {
            C0045d() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.Collection b() {
                return D8.d.a.this.f1972g.g(D8.d.a.this.B());
            }
        }

        public a(D8.d dVar, G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            this.f1975j = dVar;
            B8.m mVarI1 = dVar.i1();
            java.util.List listI0 = dVar.j1().I0();
            p247y7.AbstractC7350t.e(listI0, "getFunctionList(...)");
            java.util.List listW0 = dVar.j1().W0();
            p247y7.AbstractC7350t.e(listW0, "getPropertyList(...)");
            java.util.List listE1 = dVar.j1().e1();
            p247y7.AbstractC7350t.e(listE1, "getTypeAliasList(...)");
            java.util.List listT0 = dVar.j1().T0();
            p247y7.AbstractC7350t.e(listT0, "getNestedClassNameList(...)");
            java.util.List list = listT0;
            p108k8.c cVarG = dVar.i1().g();
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(B8.y.b(cVarG, ((java.lang.Number) it.next()).intValue()));
            }
            super(mVarI1, listI0, listW0, listE1, new D8.d.a.C0044a(arrayList));
            this.f1972g = gVar;
            this.f1973h = p().h().d(new D8.d.a.b());
            this.f1974i = p().h().d(new D8.d.a.C0045d());
        }

        private final void A(p138n8.f fVar, java.util.Collection collection, java.util.List list) {
            p().c().n().a().v(fVar, collection, new java.util.ArrayList(list), B(), new D8.d.a.c(list));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final D8.d B() {
            return this.f1975j;
        }

        public void C(p138n8.f fVar, W7.b bVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(bVar, "location");
            V7.a.a(p().c().p(), bVar, B(), fVar);
        }

        @Override // D8.h, p248y8.i, p248y8.h
        public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(bVar, "location");
            C(fVar, bVar);
            return super.b(fVar, bVar);
        }

        @Override // D8.h, p248y8.i, p248y8.h
        public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(bVar, "location");
            C(fVar, bVar);
            return super.c(fVar, bVar);
        }

        @Override // p248y8.i, p248y8.k
        public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
            p247y7.AbstractC7350t.f(dVar, "kindFilter");
            p247y7.AbstractC7350t.f(lVar, "nameFilter");
            return (java.util.Collection) this.f1973h.b();
        }

        @Override // D8.h, p248y8.i, p248y8.k
        public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
            O7.InterfaceC1424e interfaceC1424eF;
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(bVar, "location");
            C(fVar, bVar);
            D8.d.c cVar = B().f1963S;
            return (cVar == null || (interfaceC1424eF = cVar.f(fVar)) == null) ? super.g(fVar, bVar) : interfaceC1424eF;
        }

        @Override // D8.h
        protected void i(java.util.Collection collection, p237x7.l lVar) {
            p247y7.AbstractC7350t.f(collection, "result");
            p247y7.AbstractC7350t.f(lVar, "nameFilter");
            D8.d.c cVar = B().f1963S;
            java.util.List listD = cVar != null ? cVar.d() : null;
            if (listD == null) {
                listD = p097j7.AbstractC6879v.m();
            }
            collection.addAll(listD);
        }

        @Override // D8.h
        protected void k(p138n8.f fVar, java.util.List list) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(list, "functions");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.Collection) this.f1974i.b()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((F8.E) it.next()).u().b(fVar, W7.d.FOR_ALREADY_TRACKED));
            }
            list.addAll(p().c().c().c(fVar, this.f1975j));
            A(fVar, arrayList, list);
        }

        @Override // D8.h
        protected void l(p138n8.f fVar, java.util.List list) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(list, "descriptors");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.Collection) this.f1974i.b()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((F8.E) it.next()).u().c(fVar, W7.d.FOR_ALREADY_TRACKED));
            }
            A(fVar, arrayList, list);
        }

        @Override // D8.h
        protected p138n8.b m(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p138n8.b bVarD = this.f1975j.f1955K.d(fVar);
            p247y7.AbstractC7350t.e(bVarD, "createNestedClassId(...)");
            return bVarD;
        }

        @Override // D8.h
        protected java.util.Set s() {
            java.util.List listU = B().f1961Q.u();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = listU.iterator();
            while (it.hasNext()) {
                java.util.Set setF = ((F8.E) it.next()).u().f();
                if (setF == null) {
                    return null;
                }
                p097j7.AbstractC6879v.C(linkedHashSet, setF);
            }
            return linkedHashSet;
        }

        @Override // D8.h
        protected java.util.Set t() {
            java.util.List listU = B().f1961Q.u();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = listU.iterator();
            while (it.hasNext()) {
                p097j7.AbstractC6879v.C(linkedHashSet, ((F8.E) it.next()).u().a());
            }
            linkedHashSet.addAll(p().c().c().b(this.f1975j));
            return linkedHashSet;
        }

        @Override // D8.h
        protected java.util.Set u() {
            java.util.List listU = B().f1961Q.u();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = listU.iterator();
            while (it.hasNext()) {
                p097j7.AbstractC6879v.C(linkedHashSet, ((F8.E) it.next()).u().d());
            }
            return linkedHashSet;
        }

        @Override // D8.h
        protected boolean x(O7.Z z6) {
            p247y7.AbstractC7350t.f(z6, "function");
            return p().c().t().d(this.f1975j, z6);
        }
    }

    private final class b extends F8.AbstractC0941b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final E8.i f1980d;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D8.d f1982D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D8.d dVar) {
                super(0);
                this.f1982D = dVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                return O7.g0.d(this.f1982D);
            }
        }

        public b() {
            super(D8.d.this.i1().h());
            this.f1980d = D8.d.this.i1().h().d(new D8.d.b.a(D8.d.this));
        }

        @Override // F8.AbstractC0945f
        protected java.util.Collection g() {
            java.lang.String strG;
            p138n8.c cVarB;
            java.util.List listO = p108k8.f.o(D8.d.this.j1(), D8.d.this.i1().j());
            D8.d dVar = D8.d.this;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listO, 10));
            java.util.Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(dVar.i1().i().q((p088i8.q) it.next()));
            }
            java.util.List listC0 = p097j7.AbstractC6879v.C0(arrayList, D8.d.this.i1().c().c().e(D8.d.this));
            java.util.ArrayList<O7.J.b> arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = listC0.iterator();
            while (it2.hasNext()) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.E) it2.next()).W0().w();
                O7.J.b bVar = interfaceC1427hW instanceof O7.J.b ? (O7.J.b) interfaceC1427hW : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                B8.r rVarJ = D8.d.this.i1().c().j();
                D8.d dVar2 = D8.d.this;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList2, 10));
                for (O7.J.b bVar2 : arrayList2) {
                    p138n8.b bVarK = p218v8.c.k(bVar2);
                    if (bVarK == null || (cVarB = bVarK.b()) == null || (strG = cVarB.b()) == null) {
                        strG = bVar2.getName().g();
                    }
                    arrayList3.add(strG);
                }
                rVarJ.b(dVar2, arrayList3);
            }
            return p097j7.AbstractC6879v.T0(listC0);
        }

        @Override // F8.AbstractC0945f
        protected O7.d0 k() {
            return O7.d0.a.f8153a;
        }

        @Override // F8.AbstractC0951l, F8.e0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public D8.d w() {
            return D8.d.this;
        }

        public java.lang.String toString() {
            java.lang.String string = D8.d.this.getName().toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return string;
        }

        @Override // F8.e0
        public java.util.List x() {
            return (java.util.List) this.f1980d.b();
        }

        @Override // F8.e0
        public boolean y() {
            return true;
        }
    }

    private final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Map f1983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E8.h f1984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E8.i f1985c;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ D8.d f1988E;

            /* JADX INFO: renamed from: D8.d$c$a$a, reason: collision with other inner class name */
            static final class C0046a extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ D8.d f1989D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p088i8.g f1990E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0046a(D8.d dVar, p088i8.g gVar) {
                    super(0);
                    this.f1989D = dVar;
                    this.f1990E = gVar;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.util.List b() {
                    return p097j7.AbstractC6879v.T0(this.f1989D.i1().c().d().c(this.f1989D.n1(), this.f1990E));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D8.d dVar) {
                super(1);
                this.f1988E = dVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final O7.InterfaceC1424e l(p138n8.f fVar) {
                p247y7.AbstractC7350t.f(fVar, "name");
                p088i8.g gVar = (p088i8.g) D8.d.c.this.f1983a.get(fVar);
                if (gVar == null) {
                    return null;
                }
                D8.d dVar = this.f1988E;
                return R7.C1508n.U0(dVar.i1().h(), dVar, fVar, D8.d.c.this.f1985c, new D8.a(dVar.i1().h(), new D8.d.c.a.C0046a(dVar, gVar)), O7.a0.f8143a);
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {
            b() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.Set b() {
                return D8.d.c.this.e();
            }
        }

        public c() {
            java.util.List listD0 = D8.d.this.j1().D0();
            p247y7.AbstractC7350t.e(listD0, "getEnumEntryList(...)");
            java.util.List list = listD0;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(list, 10)), 16));
            for (java.lang.Object obj : list) {
                linkedHashMap.put(B8.y.b(D8.d.this.i1().g(), ((p088i8.g) obj).F()), obj);
            }
            this.f1983a = linkedHashMap;
            this.f1984b = D8.d.this.i1().h().h(new D8.d.c.a(D8.d.this));
            this.f1985c = D8.d.this.i1().h().d(new D8.d.c.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Set e() {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = D8.d.this.p().u().iterator();
            while (it.hasNext()) {
                for (O7.InterfaceC1432m interfaceC1432m : y8.k.a.a(((F8.E) it.next()).u(), null, null, 3, null)) {
                    if ((interfaceC1432m instanceof O7.Z) || (interfaceC1432m instanceof O7.U)) {
                        hashSet.add(interfaceC1432m.getName());
                    }
                }
            }
            java.util.List listI0 = D8.d.this.j1().I0();
            p247y7.AbstractC7350t.e(listI0, "getFunctionList(...)");
            D8.d dVar = D8.d.this;
            java.util.Iterator it2 = listI0.iterator();
            while (it2.hasNext()) {
                hashSet.add(B8.y.b(dVar.i1().g(), ((p088i8.i) it2.next()).d0()));
            }
            java.util.List listW0 = D8.d.this.j1().W0();
            p247y7.AbstractC7350t.e(listW0, "getPropertyList(...)");
            D8.d dVar2 = D8.d.this;
            java.util.Iterator it3 = listW0.iterator();
            while (it3.hasNext()) {
                hashSet.add(B8.y.b(dVar2.i1().g(), ((p088i8.n) it3.next()).c0()));
            }
            return p097j7.Z.j(hashSet, hashSet);
        }

        public final java.util.Collection d() {
            java.util.Set setKeySet = this.f1983a.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                O7.InterfaceC1424e interfaceC1424eF = f((p138n8.f) it.next());
                if (interfaceC1424eF != null) {
                    arrayList.add(interfaceC1424eF);
                }
            }
            return arrayList;
        }

        public final O7.InterfaceC1424e f(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            return (O7.InterfaceC1424e) this.f1984b.l(fVar);
        }
    }

    /* JADX INFO: renamed from: D8.d$d, reason: collision with other inner class name */
    static final class C0047d extends p247y7.AbstractC7352v implements p237x7.a {
        C0047d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return p097j7.AbstractC6879v.T0(D8.d.this.i1().c().d().h(D8.d.this.n1()));
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e b() {
            return D8.d.this.c1();
        }
    }

    /* synthetic */ class f extends p247y7.AbstractC7347p implements p237x7.l {
        f(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "simpleType";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(p247y7.AbstractC7350t.a.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final F8.M l(p088i8.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "p0");
            return B8.E.n((B8.E) this.f57287D, qVar, false, 2, null);
        }
    }

    /* synthetic */ class g extends p247y7.AbstractC7347p implements p237x7.l {
        g(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "getValueClassPropertyType";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(D8.d.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final F8.M l(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "p0");
            return ((D8.d) this.f57287D).o1(fVar);
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {
        h() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            return D8.d.this.d1();
        }
    }

    /* synthetic */ class i extends p247y7.AbstractC7347p implements p237x7.l {
        i(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "<init>";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(D8.d.a.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final D8.d.a l(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "p0");
            return new D8.d.a((D8.d) this.f57287D, gVar);
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.a {
        j() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1423d b() {
            return D8.d.this.e1();
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.a {
        k() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            return D8.d.this.g1();
        }
    }

    static final class l extends p247y7.AbstractC7352v implements p237x7.a {
        l() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.h0 b() {
            return D8.d.this.h1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(B8.m mVar, p088i8.c cVar, p108k8.c cVar2, p108k8.a aVar, O7.a0 a0Var) {
        p248y8.i lVar;
        super(mVar.h(), B8.y.a(cVar2, cVar.F0()).j());
        p247y7.AbstractC7350t.f(mVar, "outerContext");
        p247y7.AbstractC7350t.f(cVar, "classProto");
        p247y7.AbstractC7350t.f(cVar2, "nameResolver");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        p247y7.AbstractC7350t.f(a0Var, "sourceElement");
        this.f1952H = cVar;
        this.f1953I = aVar;
        this.f1954J = a0Var;
        this.f1955K = B8.y.a(cVar2, cVar.F0());
        B8.B b6 = B8.B.f820a;
        this.f1956L = b6.b((p088i8.k) p108k8.b.f49788e.d(cVar.E0()));
        this.f1957M = B8.C.a(b6, (p088i8.x) p108k8.b.f49787d.d(cVar.E0()));
        O7.EnumC1425f enumC1425fA = b6.a((p088i8.c.EnumC0572c) p108k8.b.f49789f.d(cVar.E0()));
        this.f1958N = enumC1425fA;
        java.util.List listH1 = cVar.h1();
        p247y7.AbstractC7350t.e(listH1, "getTypeParameterList(...)");
        p088i8.t tVarI1 = cVar.i1();
        p247y7.AbstractC7350t.e(tVarI1, "getTypeTable(...)");
        p108k8.g gVar = new p108k8.g(tVarI1);
        k8.h.a aVar2 = p108k8.h.f49817b;
        p088i8.w wVarK1 = cVar.k1();
        p247y7.AbstractC7350t.e(wVarK1, "getVersionRequirementTable(...)");
        B8.m mVarA = mVar.a(this, listH1, cVar2, gVar, aVar2.a(wVarK1), aVar);
        this.f1959O = mVarA;
        O7.EnumC1425f enumC1425f = O7.EnumC1425f.ENUM_CLASS;
        if (enumC1425fA == enumC1425f) {
            java.lang.Boolean boolD = p108k8.b.f49796m.d(cVar.E0());
            p247y7.AbstractC7350t.e(boolD, "get(...)");
            lVar = new p248y8.l(mVarA.h(), this, boolD.booleanValue() || p247y7.AbstractC7350t.b(mVarA.c().i().a(), java.lang.Boolean.TRUE));
        } else {
            lVar = y8.h.b.f57356b;
        }
        this.f1960P = lVar;
        this.f1961Q = new D8.d.b();
        this.f1962R = O7.Y.f8134e.a(this, mVarA.h(), mVarA.c().n().c(), new D8.d.i(this));
        this.f1963S = enumC1425fA == enumC1425f ? new D8.d.c() : null;
        O7.InterfaceC1432m interfaceC1432mE = mVar.e();
        this.f1964T = interfaceC1432mE;
        this.f1965U = mVarA.h().f(new D8.d.j());
        this.f1966V = mVarA.h().d(new D8.d.h());
        this.f1967W = mVarA.h().f(new D8.d.e());
        this.f1968X = mVarA.h().d(new D8.d.k());
        this.f1969Y = mVarA.h().f(new D8.d.l());
        p108k8.c cVarG = mVarA.g();
        p108k8.g gVarJ = mVarA.j();
        D8.d dVar = interfaceC1432mE instanceof D8.d ? (D8.d) interfaceC1432mE : null;
        this.f1970Z = new B8.A.a(cVar, cVarG, gVarJ, a0Var, dVar != null ? dVar.f1970Z : null);
        this.f1971a0 = !p108k8.b.f49786c.d(cVar.E0()).booleanValue() ? P7.g.f8385d.b() : new D8.n(mVarA.h(), new D8.d.C0047d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1424e c1() {
        if (!this.f1952H.l1()) {
            return null;
        }
        O7.InterfaceC1427h interfaceC1427hG = k1().g(B8.y.b(this.f1959O.g(), this.f1952H.r0()), W7.d.FROM_DESERIALIZATION);
        if (interfaceC1427hG instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hG;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection d1() {
        return p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.C0(f1(), p097j7.AbstractC6879v.q(X())), this.f1959O.c().c().a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1423d e1() {
        java.lang.Object next;
        if (this.f1958N.g()) {
            R7.C1500f c1500fL = p178r8.e.l(this, O7.a0.f8143a);
            c1500fL.p1(w());
            return c1500fL;
        }
        java.util.List listU0 = this.f1952H.u0();
        p247y7.AbstractC7350t.e(listU0, "getConstructorList(...)");
        java.util.Iterator it = listU0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!p108k8.b.f49797n.d(((p088i8.d) next).J()).booleanValue()));
        p088i8.d dVar = (p088i8.d) next;
        if (dVar != null) {
            return this.f1959O.f().i(dVar, true);
        }
        return null;
    }

    private final java.util.List f1() {
        java.util.List listU0 = this.f1952H.u0();
        p247y7.AbstractC7350t.e(listU0, "getConstructorList(...)");
        java.util.ArrayList<p088i8.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listU0) {
            java.lang.Boolean boolD = p108k8.b.f49797n.d(((p088i8.d) obj).J());
            p247y7.AbstractC7350t.e(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
        for (p088i8.d dVar : arrayList) {
            B8.x xVarF = this.f1959O.f();
            p247y7.AbstractC7350t.c(dVar);
            arrayList2.add(xVarF.i(dVar, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection g1() {
        if (this.f1956L != O7.D.SEALED) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.List<java.lang.Integer> listX0 = this.f1952H.X0();
        p247y7.AbstractC7350t.c(listX0);
        if (!(!listX0.isEmpty())) {
            return p178r8.a.f53983a.a(this, false);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : listX0) {
            B8.k kVarC = this.f1959O.c();
            p108k8.c cVarG = this.f1959O.g();
            p247y7.AbstractC7350t.c(num);
            O7.InterfaceC1424e interfaceC1424eB = kVarC.b(B8.y.a(cVarG, num.intValue()));
            if (interfaceC1424eB != null) {
                arrayList.add(interfaceC1424eB);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.h0 h1() {
        if (!m() && !P()) {
            return null;
        }
        O7.h0 h0VarA = B8.G.a(this.f1952H, this.f1959O.g(), this.f1959O.j(), new D8.d.f(this.f1959O.i()), new D8.d.g(this));
        if (h0VarA != null) {
            return h0VarA;
        }
        if (this.f1953I.c(1, 5, 1)) {
            return null;
        }
        O7.InterfaceC1423d interfaceC1423dX = X();
        if (interfaceC1423dX == null) {
            throw new java.lang.IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        java.util.List listN = interfaceC1423dX.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        p138n8.f name = ((O7.j0) p097j7.AbstractC6879v.i0(listN)).getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        F8.M mO1 = o1(name);
        if (mO1 != null) {
            return new O7.C1444z(name, mO1);
        }
        throw new java.lang.IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    private final D8.d.a k1() {
        return (D8.d.a) this.f1962R.c(this.f1959O.c().n().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F8.M o1(p138n8.f fVar) {
        java.util.Iterator it = k1().c(fVar, W7.d.FROM_DESERIALIZATION).iterator();
        boolean z6 = false;
        java.lang.Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z6) {
                    break;
                }
                break;
            }
            java.lang.Object next = it.next();
            if (((O7.U) next).v0() == null) {
                if (!z6) {
                    z6 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        O7.U u6 = (O7.U) obj;
        return (F8.M) (u6 != null ? u6.getType() : null);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        return this.f1959O.i().j();
    }

    @Override // O7.C
    public boolean C() {
        java.lang.Boolean boolD = p108k8.b.f49792i.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.InterfaceC1424e
    public boolean E() {
        return p108k8.b.f49789f.d(this.f1952H.E0()) == p088i8.c.EnumC0572c.COMPANION_OBJECT;
    }

    @Override // O7.InterfaceC1424e
    public boolean I() {
        java.lang.Boolean boolD = p108k8.b.f49795l.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.InterfaceC1424e
    public O7.h0 I0() {
        return (O7.h0) this.f1969Y.b();
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection O() {
        return (java.util.Collection) this.f1968X.b();
    }

    @Override // O7.InterfaceC1424e
    public boolean P() {
        java.lang.Boolean boolD = p108k8.b.f49794k.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue() && this.f1953I.c(1, 4, 2);
    }

    @Override // R7.AbstractC1495a, O7.InterfaceC1424e
    public java.util.List P0() {
        java.util.List listB = p108k8.f.b(this.f1952H, this.f1959O.j());
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listB, 10));
        java.util.Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new R7.F(S0(), new p257z8.b(this, this.f1959O.i().q((p088i8.q) it.next()), null, null), P7.g.f8385d.b()));
        }
        return arrayList;
    }

    @Override // R7.t
    protected p248y8.h Q(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this.f1962R.c(gVar);
    }

    @Override // O7.C
    public boolean R() {
        java.lang.Boolean boolD = p108k8.b.f49793j.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.InterfaceC1424e
    public boolean R0() {
        java.lang.Boolean boolD = p108k8.b.f49791h.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        java.lang.Boolean boolD = p108k8.b.f49790g.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1423d X() {
        return (O7.InterfaceC1423d) this.f1965U.b();
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1424e a0() {
        return (O7.InterfaceC1424e) this.f1967W.b();
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1433n, O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        return this.f1964T;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        return this.f1957M;
    }

    public final B8.m i1() {
        return this.f1959O;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        return this.f1958N;
    }

    public final p088i8.c j1() {
        return this.f1952H;
    }

    @Override // P7.a
    public P7.g k() {
        return this.f1971a0;
    }

    public final p108k8.a l1() {
        return this.f1953I;
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        java.lang.Boolean boolD = p108k8.b.f49794k.d(this.f1952H.E0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue() && this.f1953I.e(1, 4, 1);
    }

    @Override // O7.InterfaceC1424e
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public p248y8.i Y() {
        return this.f1960P;
    }

    public final B8.A.a n1() {
        return this.f1970Z;
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        return this.f1954J;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        return this.f1961Q;
    }

    public final boolean p1(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return k1().q().contains(fVar);
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        return this.f1956L;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection r() {
        return (java.util.Collection) this.f1966V.b();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("deserialized ");
        sb.append(R() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }
}
