package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends I7.AbstractC1274j implements p247y7.InterfaceC7346o, F7.f, I7.InterfaceC1271g {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f5460O = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.o.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final I7.AbstractC1278n f5461I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.String f5462J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.lang.Object f5463K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final I7.F.a f5464L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5465M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5466N;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J7.e b() {
            java.lang.Object objB;
            J7.e eVarM;
            I7.AbstractC1272h abstractC1272hG = I7.I.f5334a.g(I7.o.this.F());
            if (abstractC1272hG instanceof I7.AbstractC1272h.d) {
                if (I7.o.this.D()) {
                    java.lang.Class clsE = I7.o.this.t().e();
                    java.util.List listC = I7.o.this.C();
                    java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC, 10));
                    java.util.Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        java.lang.String name = ((F7.j) it.next()).getName();
                        p247y7.AbstractC7350t.c(name);
                        arrayList.add(name);
                    }
                    return new J7.a(clsE, arrayList, J7.a.EnumC0134a.POSITIONAL_CALL, J7.a.b.KOTLIN, null, 16, null);
                }
                objB = I7.o.this.t().j(((I7.AbstractC1272h.d) abstractC1272hG).b());
            } else if (abstractC1272hG instanceof I7.AbstractC1272h.e) {
                O7.InterfaceC1443y interfaceC1443yF = I7.o.this.F();
                O7.InterfaceC1432m interfaceC1432mB = interfaceC1443yF.b();
                p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
                if (p178r8.h.d(interfaceC1432mB) && (interfaceC1443yF instanceof O7.InterfaceC1431l) && ((O7.InterfaceC1431l) interfaceC1443yF).G()) {
                    O7.InterfaceC1443y interfaceC1443yF2 = I7.o.this.F();
                    I7.AbstractC1278n abstractC1278nT = I7.o.this.t();
                    java.lang.String strB = ((I7.AbstractC1272h.e) abstractC1272hG).b();
                    java.util.List listN = I7.o.this.F().n();
                    p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                    return new J7.j.b(interfaceC1443yF2, abstractC1278nT, strB, listN);
                }
                I7.AbstractC1272h.e eVar = (I7.AbstractC1272h.e) abstractC1272hG;
                objB = I7.o.this.t().n(eVar.c(), eVar.b());
            } else if (abstractC1272hG instanceof I7.AbstractC1272h.c) {
                objB = ((I7.AbstractC1272h.c) abstractC1272hG).b();
            } else {
                if (!(abstractC1272hG instanceof I7.AbstractC1272h.b)) {
                    if (!(abstractC1272hG instanceof I7.AbstractC1272h.a)) {
                        throw new p087i7.s();
                    }
                    java.util.List listB = ((I7.AbstractC1272h.a) abstractC1272hG).b();
                    java.lang.Class clsE2 = I7.o.this.t().e();
                    java.util.List list = listB;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((java.lang.reflect.Method) it2.next()).getName());
                    }
                    return new J7.a(clsE2, arrayList2, J7.a.EnumC0134a.POSITIONAL_CALL, J7.a.b.JAVA, listB);
                }
                objB = ((I7.AbstractC1272h.b) abstractC1272hG).b();
            }
            if (objB instanceof java.lang.reflect.Constructor) {
                I7.o oVar = I7.o.this;
                eVarM = oVar.K((java.lang.reflect.Constructor) objB, oVar.F(), false);
            } else {
                if (!(objB instanceof java.lang.reflect.Method)) {
                    throw new I7.D("Could not compute caller for function: " + I7.o.this.F() + " (member = " + objB + ')');
                }
                java.lang.reflect.Method method = (java.lang.reflect.Method) objB;
                if (java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
                    eVarM = I7.o.this.F().k().j(I7.M.j()) != null ? I7.o.this.M(method) : I7.o.this.N(method);
                } else {
                    eVarM = I7.o.this.L(method);
                }
            }
            return J7.k.i(eVarM, I7.o.this.F(), false, 2, null);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0172  */
        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J7.e b() {
            java.lang.reflect.GenericDeclaration genericDeclarationK;
            J7.e eVarN;
            I7.AbstractC1272h abstractC1272hG = I7.I.f5334a.g(I7.o.this.F());
            if (abstractC1272hG instanceof I7.AbstractC1272h.e) {
                O7.InterfaceC1443y interfaceC1443yF = I7.o.this.F();
                O7.InterfaceC1432m interfaceC1432mB = interfaceC1443yF.b();
                p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
                if (p178r8.h.d(interfaceC1432mB) && (interfaceC1443yF instanceof O7.InterfaceC1431l) && ((O7.InterfaceC1431l) interfaceC1443yF).G()) {
                    throw new I7.D(I7.o.this.F().b() + " cannot have default arguments");
                }
                I7.AbstractC1278n abstractC1278nT = I7.o.this.t();
                I7.AbstractC1272h.e eVar = (I7.AbstractC1272h.e) abstractC1272hG;
                java.lang.String strC = eVar.c();
                java.lang.String strB = eVar.b();
                java.lang.reflect.Member memberN = I7.o.this.s().n();
                p247y7.AbstractC7350t.c(memberN);
                genericDeclarationK = abstractC1278nT.l(strC, strB, !java.lang.reflect.Modifier.isStatic(memberN.getModifiers()));
            } else if (abstractC1272hG instanceof I7.AbstractC1272h.d) {
                if (I7.o.this.D()) {
                    java.lang.Class clsE = I7.o.this.t().e();
                    java.util.List listC = I7.o.this.C();
                    java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC, 10));
                    java.util.Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        java.lang.String name = ((F7.j) it.next()).getName();
                        p247y7.AbstractC7350t.c(name);
                        arrayList.add(name);
                    }
                    return new J7.a(clsE, arrayList, J7.a.EnumC0134a.CALL_BY_NAME, J7.a.b.KOTLIN, null, 16, null);
                }
                genericDeclarationK = I7.o.this.t().k(((I7.AbstractC1272h.d) abstractC1272hG).b());
            } else {
                if (abstractC1272hG instanceof I7.AbstractC1272h.a) {
                    java.util.List listB = ((I7.AbstractC1272h.a) abstractC1272hG).b();
                    java.lang.Class clsE2 = I7.o.this.t().e();
                    java.util.List list = listB;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((java.lang.reflect.Method) it2.next()).getName());
                    }
                    return new J7.a(clsE2, arrayList2, J7.a.EnumC0134a.CALL_BY_NAME, J7.a.b.JAVA, listB);
                }
                genericDeclarationK = null;
            }
            if (genericDeclarationK instanceof java.lang.reflect.Constructor) {
                I7.o oVar = I7.o.this;
                eVarN = oVar.K((java.lang.reflect.Constructor) genericDeclarationK, oVar.F(), true);
            } else if (!(genericDeclarationK instanceof java.lang.reflect.Method)) {
                eVarN = null;
            } else if (I7.o.this.F().k().j(I7.M.j()) != null) {
                O7.InterfaceC1432m interfaceC1432mB2 = I7.o.this.F().b();
                p247y7.AbstractC7350t.d(interfaceC1432mB2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (((O7.InterfaceC1424e) interfaceC1432mB2).E()) {
                    eVarN = I7.o.this.N((java.lang.reflect.Method) genericDeclarationK);
                } else {
                    eVarN = I7.o.this.M((java.lang.reflect.Method) genericDeclarationK);
                }
            } else {
                eVarN = I7.o.this.N((java.lang.reflect.Method) genericDeclarationK);
            }
            if (eVarN != null) {
                return J7.k.h(eVarN, I7.o.this.F(), true);
            }
            return null;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5470E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.String str) {
            super(0);
            this.f5470E = str;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1443y b() {
            return I7.o.this.t().m(this.f5470E, I7.o.this.f5462J);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(I7.AbstractC1278n abstractC1278n, O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(interfaceC1443y, "descriptor");
        java.lang.String strG = interfaceC1443y.getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        this(abstractC1278n, strG, I7.I.f5334a.g(interfaceC1443y).a(), interfaceC1443y, null, 16, null);
    }

    private o(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, O7.InterfaceC1443y interfaceC1443y, java.lang.Object obj) {
        this.f5461I = abstractC1278n;
        this.f5462J = str2;
        this.f5463K = obj;
        this.f5464L = I7.F.b(interfaceC1443y, new I7.o.c(str));
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f5465M = p087i7.AbstractC6669o.a(rVar, new I7.o.a());
        this.f5466N = p087i7.AbstractC6669o.a(rVar, new I7.o.b());
    }

    /* synthetic */ o(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, O7.InterfaceC1443y interfaceC1443y, java.lang.Object obj, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC1278n, str, str2, interfaceC1443y, (i6 & 16) != 0 ? p247y7.AbstractC7337f.f57285I : obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this(abstractC1278n, str, str2, null, obj);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J7.f K(java.lang.reflect.Constructor constructor, O7.InterfaceC1443y interfaceC1443y, boolean z6) {
        if (z6 || !p228w8.b.f(interfaceC1443y)) {
            return E() ? new J7.f.c(constructor, O()) : new J7.f.e(constructor);
        }
        return E() ? new J7.f.a(constructor, O()) : new J7.f.b(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J7.f.h L(java.lang.reflect.Method method) {
        return E() ? new J7.f.h.a(method, O()) : new J7.f.h.e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J7.f.h M(java.lang.reflect.Method method) {
        return E() ? new J7.f.h.b(method) : new J7.f.h.C0136f(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J7.f.h N(java.lang.reflect.Method method) {
        return E() ? new J7.f.h.c(method, O()) : new J7.f.h.g(method);
    }

    private final java.lang.Object O() {
        return J7.k.g(this.f5463K, F());
    }

    @Override // I7.AbstractC1274j
    public boolean E() {
        return !p247y7.AbstractC7350t.b(this.f5463K, p247y7.AbstractC7337f.f57285I);
    }

    @Override // I7.AbstractC1274j
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1443y F() {
        java.lang.Object objE = this.f5464L.e(this, f5460O[0]);
        p247y7.AbstractC7350t.e(objE, "getValue(...)");
        return (O7.InterfaceC1443y) objE;
    }

    @Override // p237x7.a
    public java.lang.Object b() {
        return I7.InterfaceC1271g.a.a(this);
    }

    @Override // p247y7.InterfaceC7346o
    public int c() {
        return J7.g.a(s());
    }

    public boolean equals(java.lang.Object obj) {
        I7.o oVarC = I7.M.c(obj);
        return oVarC != null && p247y7.AbstractC7350t.b(t(), oVarC.t()) && p247y7.AbstractC7350t.b(getName(), oVarC.getName()) && p247y7.AbstractC7350t.b(this.f5462J, oVarC.f5462J) && p247y7.AbstractC7350t.b(this.f5463K, oVarC.f5463K);
    }

    @Override // F7.b
    public java.lang.String getName() {
        java.lang.String strG = F().getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return strG;
    }

    public int hashCode() {
        return (((t().hashCode() * 31) + getName().hashCode()) * 31) + this.f5462J.hashCode();
    }

    @Override // p237x7.q
    public java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return I7.InterfaceC1271g.a.d(this, obj, obj2, obj3);
    }

    @Override // p237x7.l
    public java.lang.Object l(java.lang.Object obj) {
        return I7.InterfaceC1271g.a.b(this, obj);
    }

    @Override // p237x7.r
    public java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return I7.InterfaceC1271g.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // I7.AbstractC1274j
    public J7.e s() {
        return (J7.e) this.f5465M.getValue();
    }

    @Override // I7.AbstractC1274j
    public I7.AbstractC1278n t() {
        return this.f5461I;
    }

    public java.lang.String toString() {
        return I7.H.f5329a.d(F());
    }

    @Override // p237x7.p
    public java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
        return I7.InterfaceC1271g.a.c(this, obj, obj2);
    }

    @Override // p237x7.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return I7.InterfaceC1271g.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // I7.AbstractC1274j
    public J7.e x() {
        return (J7.e) this.f5466N.getValue();
    }

    @Override // F7.b
    public boolean y() {
        return F().y();
    }
}
