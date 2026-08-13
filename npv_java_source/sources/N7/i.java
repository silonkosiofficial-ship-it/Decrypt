package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Q7.a, Q7.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f7871i = {p247y7.P.j(new p247y7.G(p247y7.P.b(N7.i.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), p247y7.P.j(new p247y7.G(p247y7.P.b(N7.i.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), p247y7.P.j(new p247y7.G(p247y7.P.b(N7.i.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.G f7872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N7.d f7873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.i f7874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.E f7875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.i f7876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E8.a f7877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E8.i f7878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E8.g f7879h;

    private enum a {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;


        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f7886I = p157p7.b.a(e());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7887a;

        static {
            int[] iArr = new int[N7.i.a.values().length];
            try {
                iArr[N7.i.a.HIDDEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[N7.i.a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[N7.i.a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[N7.i.a.DROP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[N7.i.a.VISIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f7887a = iArr;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ E8.n f7889E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(E8.n nVar) {
            super(0);
            this.f7889E = nVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M b() {
            return O7.AbstractC1442x.c(N7.i.this.u().a(), N7.e.f7841d.a(), new O7.J(this.f7889E, N7.i.this.u().a())).w();
        }
    }

    public static final class d extends R7.z {
        d(O7.G g6, p138n8.c cVar) {
            super(g6, cVar);
        }

        @Override // O7.K
        /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
        public y8.h.b u() {
            return y8.h.b.f57356b;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E b() {
            F8.M mI = N7.i.this.f7872a.t().i();
            p247y7.AbstractC7350t.e(mI, "getAnyType(...)");
            return mI;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {
        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P7.g l(p087i7.u uVar) {
            p247y7.AbstractC7350t.f(uVar, "<name for destructuring parameter 0>");
            java.lang.String str = (java.lang.String) uVar.a();
            java.lang.String str2 = (java.lang.String) uVar.b();
            return P7.g.f8385d.a(p097j7.AbstractC6879v.e(P7.f.a(N7.i.this.f7872a.t(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p018b8.f f7892D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1424e f7893E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p018b8.f fVar, O7.InterfaceC1424e interfaceC1424e) {
            super(0);
            this.f7892D = fVar;
            this.f7893E = interfaceC1424e;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e b() {
            p018b8.f fVar = this.f7892D;
            Y7.g gVar = Y7.g.f16481a;
            p247y7.AbstractC7350t.e(gVar, "EMPTY");
            return fVar.W0(gVar, this.f7893E);
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p138n8.f f7894D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p138n8.f fVar) {
            super(1);
            this.f7894D = fVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection l(p248y8.h hVar) {
            p247y7.AbstractC7350t.f(hVar, "it");
            return hVar.b(this.f7894D, W7.d.FROM_BUILTINS);
        }
    }

    /* JADX INFO: renamed from: N7.i$i, reason: collision with other inner class name */
    public static final class C0190i extends P8.b.AbstractC0201b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f7895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p247y7.O f7896b;

        C0190i(java.lang.String str, p247y7.O o6) {
            this.f7895a = str;
            this.f7896b = o6;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0053 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:18:0x0055 A[ORIG_RETURN, RETURN] */
        @Override // P8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(O7.InterfaceC1424e interfaceC1424e) {
            p247y7.O o6;
            N7.i.a aVar;
            p247y7.AbstractC7350t.f(interfaceC1424e, "javaClassDescriptor");
            java.lang.String strA = p068g8.x.a(p068g8.A.f45591a, interfaceC1424e, this.f7895a);
            N7.l lVar = N7.l.f7902a;
            if (lVar.f().contains(strA)) {
                o6 = this.f7896b;
                aVar = N7.i.a.HIDDEN;
            } else if (lVar.i().contains(strA)) {
                o6 = this.f7896b;
                aVar = N7.i.a.VISIBLE;
            } else {
                if (!lVar.c().contains(strA)) {
                    if (lVar.d().contains(strA)) {
                        o6 = this.f7896b;
                        aVar = N7.i.a.DROP;
                    }
                    if (this.f7896b.f57254C == null) {
                        return true;
                    }
                    return false;
                }
                o6 = this.f7896b;
                aVar = N7.i.a.DEPRECATED_LIST_METHODS;
            }
            o6.f57254C = aVar;
            if (this.f7896b.f57254C == null) {
                return true;
            }
            return false;
        }

        @Override // P8.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public N7.i.a a() {
            N7.i.a aVar = (N7.i.a) this.f7896b.f57254C;
            return aVar == null ? N7.i.a.NOT_CONSIDERED : aVar;
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.l {
        j() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0021  */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            boolean z6;
            if (interfaceC1421b.j() == O7.InterfaceC1421b.a.DECLARATION) {
                N7.d dVar = N7.i.this.f7873b;
                O7.InterfaceC1432m interfaceC1432mB = interfaceC1421b.b();
                p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (dVar.c((O7.InterfaceC1424e) interfaceC1432mB)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.a {
        k() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P7.g b() {
            return P7.g.f8385d.a(p097j7.AbstractC6879v.e(P7.f.b(N7.i.this.f7872a.t(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
        }
    }

    public i(O7.G g6, E8.n nVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(aVar, "settingsComputation");
        this.f7872a = g6;
        this.f7873b = N7.d.f7840a;
        this.f7874c = nVar.d(aVar);
        this.f7875d = l(nVar);
        this.f7876e = nVar.d(new N7.i.c(nVar));
        this.f7877f = nVar.c();
        this.f7878g = nVar.d(new N7.i.k());
        this.f7879h = nVar.b(new N7.i.f());
    }

    private final O7.Z k(D8.d dVar, O7.Z z6) {
        O7.InterfaceC1443y.a aVarZ = z6.z();
        aVarZ.o(dVar);
        aVarZ.r(O7.AbstractC1438t.f8186e);
        aVarZ.q(dVar.w());
        aVarZ.B(dVar.S0());
        O7.InterfaceC1443y interfaceC1443yI = aVarZ.i();
        p247y7.AbstractC7350t.c(interfaceC1443yI);
        return (O7.Z) interfaceC1443yI;
    }

    private final F8.E l(E8.n nVar) {
        R7.C1502h c1502h = new R7.C1502h(new N7.i.d(this.f7872a, new p138n8.c("java.io")), p138n8.f.o("Serializable"), O7.D.ABSTRACT, O7.EnumC1425f.INTERFACE, p097j7.AbstractC6879v.e(new F8.H(nVar, new N7.i.e())), O7.a0.f8143a, false, nVar);
        c1502h.T0(y8.h.b.f57356b, p097j7.Z.d(), null);
        F8.M mW = c1502h.w();
        p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
        return mW;
    }

    private final java.util.Collection m(O7.InterfaceC1424e interfaceC1424e, p237x7.l lVar) {
        p018b8.f fVarQ = q(interfaceC1424e);
        if (fVarQ != null) {
            java.util.Collection collectionG = this.f7873b.g(p218v8.c.l(fVarQ), N7.b.f7818h.a());
            O7.InterfaceC1424e interfaceC1424e2 = (O7.InterfaceC1424e) p097j7.AbstractC6879v.u0(collectionG);
            if (interfaceC1424e2 != null) {
                P8.g.b bVar = P8.g.f8491E;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionG, 10));
                java.util.Iterator it = collectionG.iterator();
                while (it.hasNext()) {
                    arrayList.add(p218v8.c.l((O7.InterfaceC1424e) it.next()));
                }
                P8.g gVarB = bVar.b(arrayList);
                boolean zC = this.f7873b.c(interfaceC1424e);
                p248y8.h hVarM0 = ((O7.InterfaceC1424e) this.f7877f.a(p218v8.c.l(fVarQ), new N7.i.g(fVarQ, interfaceC1424e2))).M0();
                p247y7.AbstractC7350t.e(hVarM0, "getUnsubstitutedMemberScope(...)");
                java.lang.Iterable iterable = (java.lang.Iterable) lVar.l(hVarM0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : iterable) {
                    O7.Z z6 = (O7.Z) obj;
                    if (z6.j() == O7.InterfaceC1421b.a.DECLARATION && z6.h().d() && !L7.g.k0(z6)) {
                        java.util.Collection collectionF = z6.f();
                        p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
                        java.util.Collection collection = collectionF;
                        if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                            java.util.Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    O7.InterfaceC1432m interfaceC1432mB = ((O7.InterfaceC1443y) it2.next()).b();
                                    p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
                                    if (gVarB.contains(p218v8.c.l(interfaceC1432mB))) {
                                    }
                                }
                            }
                        }
                        if (!v(z6, zC)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                return arrayList2;
            }
        }
        return p097j7.AbstractC6879v.m();
    }

    private final F8.M n() {
        return (F8.M) E8.m.a(this.f7876e, this, f7871i[1]);
    }

    private static final boolean o(O7.InterfaceC1431l interfaceC1431l, F8.n0 n0Var, O7.InterfaceC1431l interfaceC1431l2) {
        return p178r8.l.x(interfaceC1431l, interfaceC1431l2.c(n0Var)) == r8.l.i.a.OVERRIDABLE;
    }

    private final p018b8.f q(O7.InterfaceC1424e interfaceC1424e) {
        p138n8.b bVarN;
        p138n8.c cVarB;
        if (L7.g.a0(interfaceC1424e) || !L7.g.B0(interfaceC1424e)) {
            return null;
        }
        p138n8.d dVarM = p218v8.c.m(interfaceC1424e);
        if (!dVarM.f() || (bVarN = N7.c.f7820a.n(dVarM)) == null || (cVarB = bVarN.b()) == null) {
            return null;
        }
        O7.InterfaceC1424e interfaceC1424eD = O7.AbstractC1437s.d(u().a(), cVarB, W7.d.FROM_BUILTINS);
        if (interfaceC1424eD instanceof p018b8.f) {
            return (p018b8.f) interfaceC1424eD;
        }
        return null;
    }

    private final N7.i.a r(O7.InterfaceC1443y interfaceC1443y) {
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1443y.b();
        p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        java.lang.Object objB = P8.b.b(p097j7.AbstractC6879v.e((O7.InterfaceC1424e) interfaceC1432mB), new N7.h(this), new N7.i.C0190i(p068g8.y.c(interfaceC1443y, false, false, 3, null), new p247y7.O()));
        p247y7.AbstractC7350t.e(objB, "dfs(...)");
        return (N7.i.a) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable s(N7.i iVar, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(iVar, "this$0");
        java.util.Collection collectionU = interfaceC1424e.p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            O7.InterfaceC1427h interfaceC1427hW = ((F8.E) it.next()).W0().w();
            O7.InterfaceC1424e interfaceC1424eQ = null;
            O7.InterfaceC1427h interfaceC1427hA = interfaceC1427hW != null ? interfaceC1427hW.a() : null;
            O7.InterfaceC1424e interfaceC1424e2 = interfaceC1427hA instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hA : null;
            if (interfaceC1424e2 != null && (interfaceC1424eQ = iVar.q(interfaceC1424e2)) == null) {
                interfaceC1424eQ = interfaceC1424e2;
            }
            if (interfaceC1424eQ != null) {
                arrayList.add(interfaceC1424eQ);
            }
        }
        return arrayList;
    }

    private final P7.g t() {
        return (P7.g) E8.m.a(this.f7878g, this, f7871i[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N7.f.b u() {
        return (N7.f.b) E8.m.a(this.f7874c, this, f7871i[0]);
    }

    private final boolean v(O7.Z z6, boolean z10) {
        O7.InterfaceC1432m interfaceC1432mB = z6.b();
        p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        java.lang.String strC = p068g8.y.c(z6, false, false, 3, null);
        if (z10 ^ N7.l.f7902a.g().contains(p068g8.x.a(p068g8.A.f45591a, (O7.InterfaceC1424e) interfaceC1432mB, strC))) {
            return true;
        }
        java.lang.Boolean boolE = P8.b.e(p097j7.AbstractC6879v.e(z6), N7.g.f7869a, new N7.i.j());
        p247y7.AbstractC7350t.e(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable w(O7.InterfaceC1421b interfaceC1421b) {
        return interfaceC1421b.a().f();
    }

    private final boolean x(O7.InterfaceC1431l interfaceC1431l, O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1431l.n().size() == 1) {
            java.util.List listN = interfaceC1431l.n();
            p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
            O7.InterfaceC1427h interfaceC1427hW = ((O7.j0) p097j7.AbstractC6879v.G0(listN)).getType().W0().w();
            if (p247y7.AbstractC7350t.b(interfaceC1427hW != null ? p218v8.c.m(interfaceC1427hW) : null, p218v8.c.m(interfaceC1424e))) {
                return true;
            }
        }
        return false;
    }

    @Override // Q7.a
    public java.util.Collection a(O7.InterfaceC1424e interfaceC1424e) {
        p018b8.f fVarQ;
        O7.InterfaceC1424e interfaceC1424eF;
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        if (interfaceC1424e.j() != O7.EnumC1425f.CLASS || !u().b() || (fVarQ = q(interfaceC1424e)) == null || (interfaceC1424eF = N7.d.f(this.f7873b, p218v8.c.l(fVarQ), N7.b.f7818h.a(), null, 4, null)) == null) {
            return p097j7.AbstractC6879v.m();
        }
        F8.n0 n0VarC = N7.m.a(interfaceC1424eF, fVarQ).c();
        java.util.List listR = fVarQ.r();
        java.util.ArrayList<O7.InterfaceC1423d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listR) {
            O7.InterfaceC1423d interfaceC1423d = (O7.InterfaceC1423d) obj;
            if (interfaceC1423d.h().d()) {
                java.util.Collection collectionR = interfaceC1424eF.r();
                p247y7.AbstractC7350t.e(collectionR, "getConstructors(...)");
                java.util.Collection collection = collectionR;
                if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                    java.util.Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            O7.InterfaceC1423d interfaceC1423d2 = (O7.InterfaceC1423d) it.next();
                            p247y7.AbstractC7350t.c(interfaceC1423d2);
                            if (o(interfaceC1423d2, n0VarC, interfaceC1423d)) {
                            }
                        }
                    }
                }
                if (!x(interfaceC1423d, interfaceC1424e) && !L7.g.k0(interfaceC1423d) && !N7.l.f7902a.e().contains(p068g8.x.a(p068g8.A.f45591a, fVarQ, p068g8.y.c(interfaceC1423d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
        for (O7.InterfaceC1423d interfaceC1423d3 : arrayList) {
            O7.InterfaceC1443y.a aVarZ = interfaceC1423d3.z();
            aVarZ.o(interfaceC1424e);
            aVarZ.q(interfaceC1424e.w());
            aVarZ.n();
            aVarZ.w(n0VarC.j());
            if (!N7.l.f7902a.h().contains(p068g8.x.a(p068g8.A.f45591a, fVarQ, p068g8.y.c(interfaceC1423d3, false, false, 3, null)))) {
                aVarZ.p(t());
            }
            O7.InterfaceC1443y interfaceC1443yI = aVarZ.i();
            p247y7.AbstractC7350t.d(interfaceC1443yI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((O7.InterfaceC1423d) interfaceC1443yI);
        }
        return arrayList2;
    }

    @Override // Q7.a
    public java.util.Collection c(p138n8.f fVar, O7.InterfaceC1424e interfaceC1424e) {
        E8.g gVar;
        java.lang.String strG;
        java.lang.String str;
        P7.g gVarT;
        java.util.List listM;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        if (p247y7.AbstractC7350t.b(fVar, N7.a.f7816e.a()) && (interfaceC1424e instanceof D8.d) && L7.g.e0(interfaceC1424e)) {
            D8.d dVar = (D8.d) interfaceC1424e;
            java.util.List listI0 = dVar.j1().I0();
            p247y7.AbstractC7350t.e(listI0, "getFunctionList(...)");
            java.util.List list = listI0;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (p247y7.AbstractC7350t.b(B8.y.b(dVar.i1().g(), ((p088i8.i) it.next()).d0()), N7.a.f7816e.a())) {
                        }
                    }
                }
            }
            listM = p097j7.AbstractC6879v.e(k(dVar, (O7.Z) p097j7.AbstractC6879v.F0(n().u().b(fVar, W7.d.FROM_BUILTINS))));
            return listM;
        }
        if (u().b()) {
            java.util.Collection<O7.Z> collectionM = m(interfaceC1424e, new N7.i.h(fVar));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (O7.Z z6 : collectionM) {
                O7.InterfaceC1432m interfaceC1432mB = z6.b();
                p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                O7.InterfaceC1443y interfaceC1443yC = z6.c(N7.m.a((O7.InterfaceC1424e) interfaceC1432mB, interfaceC1424e).c());
                p247y7.AbstractC7350t.d(interfaceC1443yC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                O7.InterfaceC1443y.a aVarZ = ((O7.Z) interfaceC1443yC).z();
                aVarZ.o(interfaceC1424e);
                aVarZ.B(interfaceC1424e.S0());
                aVarZ.n();
                int i6 = N7.i.b.f7887a[r(z6).ordinal()];
                O7.Z z10 = null;
                if (i6 != 1) {
                    if (i6 == 2) {
                        p138n8.f name = z6.getName();
                        if (p247y7.AbstractC7350t.b(name, N7.j.f7899a)) {
                            gVar = this.f7879h;
                            strG = z6.getName().g();
                            str = "first";
                        } else {
                            if (!p247y7.AbstractC7350t.b(name, N7.j.f7900b)) {
                                throw new java.lang.IllegalStateException(("Unexpected name: " + z6.getName()).toString());
                            }
                            gVar = this.f7879h;
                            strG = z6.getName().g();
                            str = "last";
                        }
                        gVarT = (P7.g) gVar.l(p087i7.B.a(strG, str));
                    } else if (i6 == 3) {
                        gVarT = t();
                    } else if (i6 != 4) {
                        O7.InterfaceC1443y interfaceC1443yI = aVarZ.i();
                        p247y7.AbstractC7350t.c(interfaceC1443yI);
                        z10 = (O7.Z) interfaceC1443yI;
                    }
                    aVarZ.p(gVarT);
                    O7.InterfaceC1443y interfaceC1443yI2 = aVarZ.i();
                    p247y7.AbstractC7350t.c(interfaceC1443yI2);
                    z10 = (O7.Z) interfaceC1443yI2;
                } else if (!O7.E.a(interfaceC1424e)) {
                    aVarZ.u();
                    O7.InterfaceC1443y interfaceC1443yI3 = aVarZ.i();
                    p247y7.AbstractC7350t.c(interfaceC1443yI3);
                    z10 = (O7.Z) interfaceC1443yI3;
                }
                if (z10 != null) {
                    arrayList.add(z10);
                }
            }
            return arrayList;
        }
        listM = p097j7.AbstractC6879v.m();
        return listM;
    }

    @Override // Q7.c
    public boolean d(O7.InterfaceC1424e interfaceC1424e, O7.Z z6) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        p247y7.AbstractC7350t.f(z6, "functionDescriptor");
        p018b8.f fVarQ = q(interfaceC1424e);
        if (fVarQ == null || !z6.k().H(Q7.d.a())) {
            return true;
        }
        if (!u().b()) {
            return false;
        }
        java.lang.String strC = p068g8.y.c(z6, false, false, 3, null);
        p018b8.g gVarM0 = fVarQ.M0();
        p138n8.f name = z6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        java.util.Collection collectionB = gVarM0.b(name, W7.d.FROM_BUILTINS);
        if (!(collectionB instanceof java.util.Collection) || !collectionB.isEmpty()) {
            java.util.Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                if (p247y7.AbstractC7350t.b(p068g8.y.c((O7.Z) it.next(), false, false, 3, null), strC)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Q7.a
    public java.util.Collection e(O7.InterfaceC1424e interfaceC1424e) {
        java.util.List listE;
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        p138n8.d dVarM = p218v8.c.m(interfaceC1424e);
        N7.l lVar = N7.l.f7902a;
        if (lVar.j(dVarM)) {
            F8.M mN = n();
            p247y7.AbstractC7350t.e(mN, "<get-cloneableType>(...)");
            listE = p097j7.AbstractC6879v.p(mN, this.f7875d);
        } else {
            listE = lVar.k(dVarM) ? p097j7.AbstractC6879v.e(this.f7875d) : p097j7.AbstractC6879v.m();
        }
        return listE;
    }

    @Override // Q7.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public java.util.Set b(O7.InterfaceC1424e interfaceC1424e) {
        p018b8.g gVarM0;
        java.util.Set setA;
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        if (!u().b()) {
            return p097j7.Z.d();
        }
        p018b8.f fVarQ = q(interfaceC1424e);
        return (fVarQ == null || (gVarM0 = fVarQ.M0()) == null || (setA = gVarM0.a()) == null) ? p097j7.Z.d() : setA;
    }
}
